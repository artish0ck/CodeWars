package Welcome;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Welcome {
    public static void main(String[] args) {
        System.out.println(greet("asd"));
    }

    public static String greet(String language) {
        Map<String, String> greetingMap = new HashMap<String, String>();
        greetingMap.put("english", "Welcome");
        greetingMap.put("czech", "Vitejte");
        greetingMap.put("danish", "Velkomst");
        greetingMap.put("dutch", "Welkom");
        greetingMap.put("estonian", "Tere tulemast");
        greetingMap.put("finnish", "Tervetuloa");
        greetingMap.put("flemish", "Welgekomen");
        greetingMap.put("french", "Bienvenue");
        greetingMap.put("german", "Willkommen");
        greetingMap.put("irish", "Failte");
        greetingMap.put("italian", "Benvenuto");
        greetingMap.put("latvian", "Gaidits");
        greetingMap.put("lithuanian", "Laukiamas");
        greetingMap.put("polish", "Witamy");
        greetingMap.put("spanish", "Bienvenido");
        greetingMap.put("swedish", "Valkommen");
        greetingMap.put("welsh", "Croeso");
        for (Map.Entry<String, String> entry : greetingMap.entrySet()) {
            if (entry.getKey().equals(language))
                return entry.getValue();
        }
        return "Welcome";
    }
}
