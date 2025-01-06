package Characters;

import Subjects.Subject;

public interface ToWhat {
    public String toWhat(Subject s);
    public String toWho(Character ch);
    public static String whom(Character ch) {
        return "";
    }
}
