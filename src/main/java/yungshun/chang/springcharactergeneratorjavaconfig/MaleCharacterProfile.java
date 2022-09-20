package yungshun.chang.springcharactergeneratorjavaconfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class MaleCharacterProfile implements CharacterProfile {

    private PersonalityService personalityService;

    @Value("${male.age}")
    private int age;

    @Value("${male.socialClass}")
    private String socialClass;

    public MaleCharacterProfile(PersonalityService personalityService) {
        this.personalityService = personalityService;
    }

    @Override
    public String getName() {
        return "John Doe";
    }

    @Override
    public String getPersonality() {
        return personalityService.getPersonality();
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getSocialClass() {
        return socialClass;
    }
}
