package samde.mobile.model

import android.graphics.drawable.Drawable

class Application(  val name: String,
                    val packageName: String,
                    val icon: Drawable?,
                    val manifest: String,
                    var status: String = "")