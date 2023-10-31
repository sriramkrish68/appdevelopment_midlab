package midlab;

import java.util.ResourceBundle;

public class app {
    private static final ResourceBundle rb = ResourceBundle.getBundle("config");

    public int log(String uid, int pass) {
        String s1 = rb.getString("username");
        int s2 = Integer.parseInt(rb.getString("userid"));
        System.out.println(s1);
        if (uid.equals(s1) && (s2==pass)) {
            return 1;
        } else {
            return 0;
        }
    }
}