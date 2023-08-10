import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) {


//        int x = 10;
//        int y = 10;
//        System.out.println(x == y);
//
//        char ch = 'a';
//        ch++;
//        System.out.println(ch);
//        Integer i = new Integer(10);
//        Integer j = new Integer(10);
//        System.out.println(i == j);
//
//        byte s = (byte) 254;
//        System.out.println(s);
//
//        String s1 = new String("aa");
//        String s2 = new String("aa");
//        System.out.println(s1 == s2);
//        System.out.println(s1.equals(s2));
//
//        String s3 = "aa";
//        String s4 = "aa";
//        System.out.println(s3 == s4);

//        count("aaaaaasdfhgfjk ytukkutnjka hjh");
//        System.out.println(Thread.currentThread().getPriority());

//        set();



        String s = "dfghjkhgfdfgh";
        System.out.println(s.subSequence(2,5));
        CharSequence c = s.subSequence(3,6);
        System.out.println(s.substring(2,5));
    }

    public static void count(String s) {
        TreeMap<Character, Integer> m = new TreeMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (m.containsKey(s.charAt(i))) {
                m.put(s.charAt(i), m.get(s.charAt(i)) + 1);
            } else {
                m.put(s.charAt(i), 1);
            }
        }

        Set<Map.Entry<Character,Integer>> set =  m.entrySet();

        int max = 0;
        char ch =' ';
        for (Map.Entry<Character,Integer> e:set){
            if(e.getValue()>max){
                max = e.getValue();
                ch = e.getKey();
            }
        }
        System.out.println(ch+"  ->"+max);

    }

    public static void set(){
        Set  s = new HashSet();
        s.add("A");
        s.add(1);
        s.add("A");
        System.out.println(s);
    }
}
