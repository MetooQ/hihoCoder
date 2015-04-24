import java.util.*;

public class Main {
    static class SpellComparator implements Comparator {
        public int compare(Object o1, Object o2) {
            try {
                String s1 = o1.toString();
                String s2 = o2.toString();
                return s1.compareTo(s2);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return 0;
        }
    }
    public static boolean isFib(int n) {
        return n==1||n==2||n==3||n==5||n==8||n==13||n==21;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] s = in.next().toCharArray();
        ArrayList<String> mm = new ArrayList<String>();
        for(int i = 0; i < s.length; i++){
            Map<Character, Integer> zm = new HashMap<Character, Integer>();
            for(int j = i; j < s.length; j++) {
                if (!zm.containsKey(s[j]))
                    zm.put(s[j],1);
                if (isFib(zm.keySet().size())) {
                    String str = new String(s, i, j-i+1);
                    if(!mm.contains(str)){
                        mm.add(str);
                    }
                }
            }
        }


        Collections.sort(mm, new SpellComparator());
        for (int i = 0; i < mm.size(); i++) {
            System.out.println(mm.get(i));
        }

    }
}