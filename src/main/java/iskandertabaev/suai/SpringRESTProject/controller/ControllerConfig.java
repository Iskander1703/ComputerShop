package iskandertabaev.suai.SpringRESTProject.controller;

import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class ControllerConfig extends WebMvcConfigurerAdapter {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/frames").setViewName("frames");
        registry.addViewController("/rams").setViewName("rams");
        registry.addViewController("/powerUnits").setViewName("powerUnits");
        registry.addViewController("/motherBoards").setViewName("motherBoards");
        registry.addViewController("/graphicsCards").setViewName("graphicsCards");
    }
}
