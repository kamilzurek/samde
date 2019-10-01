package samde.mobile

import android.content.pm.PackageManager
import android.util.Base64
import net.dongliu.apk.parser.ApkFile
import samde.mobile.model.Application
import java.io.File
import java.nio.charset.Charset
import java.util.*

class ApplicationPopulator {

    fun getApplications(packageManager: PackageManager): List<Application> {
        val applications = LinkedList<Application>()
        val pm = packageManager
        val packages = pm.getInstalledApplications(PackageManager.GET_META_DATA)
        packages.sortBy { it.loadLabel(pm).toString() }

        for (applicationInfo in packages) {
            if (pm.getLaunchIntentForPackage(applicationInfo.packageName) != null) {
                ApkFile(File(applicationInfo.sourceDir))
                        .use { apk ->
                            val xml = apk.manifestXml
                            val manifesto = Base64.encodeToString(xml.toByteArray(Charset.forName("utf-8")), Base64.DEFAULT)
                            val meta = apk.apkMeta
                            applications.add(
                                    Application(applicationInfo.loadLabel(packageManager).toString(),
                                                meta.packageName,
                                                applicationInfo.loadIcon(packageManager),
                                                manifesto))
                        }
            }
        }

        return applications
    }

}