package org.mapsa;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("org.mapsa")
@PropertySource("sport.properties")
public class SpringConfig {

}
