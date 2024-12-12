package sys.tem.springBootDemo.config;

import sys.tem.springBootDemo.systemProfile.DevProfile;
import sys.tem.springBootDemo.systemProfile.ProductionProfile;
import sys.tem.springBootDemo.systemProfile.SystemProfile;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @ConditionalOnProperty(value = "sys.tem.profile.dev", havingValue = "true")
    public SystemProfile devProfile() {
        return new DevProfile();
    }


    @Bean
    @ConditionalOnProperty(value = "sys.tem.profile.dev", havingValue = "false")
    public SystemProfile prodProfile() {
        return new ProductionProfile();
    }
}
