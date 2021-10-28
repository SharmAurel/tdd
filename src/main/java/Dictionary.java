import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private String name;
    private Map<String, String> translations;
    public Dictionary(String name) {
        this.name=name;
        this.translations=new HashMap<>();


    }

    String getName(){
        return this.name;
    }

    public boolean isEmpty() {
        return translations.isEmpty();
    }



    public void addTranslation(String francais,String traduction) {
        translations.put(francais,traduction);

    }

    String getTranslation(String traduction){
       return translations.get(traduction);
    }

    public void addTranslationMultiple(String francais, String traductionmultiple) {
    }


     List<String> getTranslationMultiple(List<String> traductionmultiple) {
        return traductionmultiple;
    }
}
