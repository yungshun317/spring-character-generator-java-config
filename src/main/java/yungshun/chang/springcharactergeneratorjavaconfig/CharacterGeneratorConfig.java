package yungshun.chang.springcharactergeneratorjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("yungshun.chang.springcharactergeneratorjavaconfig")
public class CharacterGeneratorConfig {

    // Define bean for positive personality service
    @Bean
    public PersonalityService positivePersonalityService() {
        return new PositivePersonalityService();
    }

    // Define bean for male character profile and inject dependency
    @Bean
    public CharacterProfile maleCharacterProfile() {
        MaleCharacterProfile maleCharacterProfile = new MaleCharacterProfile(positivePersonalityService());

        return maleCharacterProfile;
    }
}
