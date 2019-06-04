package configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import controllers.ItemController;
import entities.Article;
import repositories.ItemRepository;

/**
* 
* @author jpena
* @created 30 may. 2019 18:22:58
*/
@SpringBootApplication(
    //Configuramos la inyección de depensencias
    scanBasePackageClasses = {
        ItemController.class
    }
)
@EntityScan(
    basePackageClasses = {
        Article.class
    }
)
@EnableJpaRepositories(
    basePackageClasses = {
        ItemRepository.class
    }
)
public class AppConfiguration {

    public static void main(String[] args) {
        SpringApplication.run(AppConfiguration.class, args);
    }
    
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurer() {
            public void addCorsMappings(CorsRegistry registry) {
                //Configuramos los origenes para que desde cualquier sitio se puedan hacer peticiones
                registry.addMapping("/**");
            }
        };
    }
}