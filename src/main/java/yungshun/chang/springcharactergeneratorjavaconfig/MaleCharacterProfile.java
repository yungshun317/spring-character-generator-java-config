package yungshun.chang.springcharactergeneratorjavaconfig;

import org.springframework.stereotype.Component;

public class MaleCharacterProfile implements CharacterProfile {

    private PersonalityService personalityService;

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
}
