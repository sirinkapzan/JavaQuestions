import java.util.ArrayList;
import java.util.List;

public class emailValidation {

    public static void main(String[] args) {

        List<String> email = new ArrayList<>();

        email.add("test@email.com");
        email.add("@email.com");
        email.add("test@emailcom");

        for (String w : email) {
            if (w.contains("@") && w.contains(".")) {
                int index = w.indexOf("@");
                try {
                    if (!w.substring(index - 1, index).isEmpty()) {
                        System.out.println(w + " = Valid Mail");
                    }
                } catch (Exception e) {
                    System.out.println(w + " = Invalid mail");
                }
            } else {
                System.out.println(w + " = invalid Mail");
            }
        }
    }
}

