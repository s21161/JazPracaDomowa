package pl.pjatk.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class AppConfig {
    @Bean
    public MySimplePojo mySimplePojo()
    {
        System.out.println("Hello from mySimplePojo");
        return new MySimplePojo("pojo", 10);
    }

    @Bean
    public List<String> defaultData()
    {
        return List.of("2", "5", "6", "2", "1", "11");
    }

    @Bean
    public List<String> otherDefaultData()
    {
        return List.of("5", "4", "8", "9", "10", "12", "14");
    }

    @Bean
    @ConditionalOnProperty(value="my.homework.property", havingValue = "true")
    public String homeworkBean()
    {
        return "Profil praca domowa";
    }
}
