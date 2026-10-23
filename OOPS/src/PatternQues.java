import java.util.*;
public class PatternQues {
    public static void main(String[] args) {
        StringBuilder name = new StringBuilder("Ikram_ali");
        for (int i=0; i<name.length()/2; i++){
            int front = i;
            int back = name.length() - 1 - i ;
            char frontchar = name.charAt(front);
            char BackCharr = name.charAt(back);

            name.setCharAt(front,BackCharr);
            name.setCharAt(back,frontchar);
        }
        System.out.println("Reverse Name : "+name);

    }
}
