package org.rest.common.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring Context configuration.
 */
@Configuration
@ComponentScan({ "org.rest.common.client" })
public class CommonClientConfig {

    public CommonClientConfig() {
        super();
    }

}
