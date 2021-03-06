package samde.configuration;

import org.springframework.security.web.authentication.www.BasicAuthenticationEntryPoint;
import org.springframework.stereotype.Component;

@Component("http401AuthenticationEntryPoint")
public class Http401AuthenticationEntryPoint extends BasicAuthenticationEntryPoint {

    @Override
    public void afterPropertiesSet() throws Exception {
        setRealmName("SAMDe");
    }

}
