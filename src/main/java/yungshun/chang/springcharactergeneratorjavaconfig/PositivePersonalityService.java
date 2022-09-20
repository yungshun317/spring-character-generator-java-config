package yungshun.chang.springcharactergeneratorjavaconfig;

public class PositivePersonalityService implements PersonalityService {

    @Override
    public String getPersonality() {
        return "generous";
    }
}
