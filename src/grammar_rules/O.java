package grammar_rules;

/**
 * JAVA_Review
 * grammar_rules
 *
 * @author Ablecisi
 * @version 1.0
 * 2024/1/5
 * 星期五
 * 2:04
 */
public class Test {
}

class Test2 {
    int   o = 0;
    static public void y(Test2 O){
        O.o = 1;
    }

    public static void main(String[] args) {
        System.out.println(o);
        y(o);
        System.out.println(o);
    }
}