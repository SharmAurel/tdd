import org.checkerframework.framework.qual.DefaultQualifier;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dictionary {
    private String name;
    private Map<String, String> translations;
    private Map<String, List<String>> multipletranslations;
    private List<String> listetrad;

    public Dictionary(String name) {
        this.name=name;
        this.translations=new HashMap<>();
        this.multipletranslations=new HashMap<>();
    }

    String getName(){
        return this.name;
    }

    public boolean isEmpty() {
        return translations.isEmpty();
    }

    public void addTranslation(String francais,String traduction) {
        if (listetrad != null) {
            multipletranslations.get(francais).add(traduction);
        } else {
            this.listetrad=new ArrayList<>();
            listetrad.add(traduction);
            multipletranslations.put(francais, listetrad);
        }

    }

    String getTranslation(String traduction)
    {
        return translations.get(traduction);
    }

    List<String> getMultipleTranslation(String traduction){
       return multipletranslations.get(traduction);
    }



}
