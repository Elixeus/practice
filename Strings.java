public class Strings{
    public static void main(String[] args){
        String greeting = "Hello";
        String tm = "java\u2122";
        String s = greeting.substring(0, 4);
        System.out.println(s);
        System.out.println(tm);
        
        System.out.println(s.equals("Hel")); // compare 2 strings
        System.out.println(s.equalsIgnoreCase("hell")); // compare 2 strings ignroing the case

        // code unit count
        int n = greeting.length();
        System.out.println(n);
        // length of string made of Chinese characters    
        String 中文 = "三个字";
        int cn = 中文.length();
        System.out.println(cn);
        // code point count
        int cpCount = greeting.codePointCount(0, greeting.length()); // latin letters
        System.out.println(cpCount);
        int cnpCount = 中文.codePointCount(0, 中文.length()); // Chinese characters
        System.out.println(cnpCount);
        
        char first = greeting.charAt(0);
        char last = greeting.charAt(greeting.length()-1);

        // String Builder
        StringBuilder builder = new StringBuilder();
        builder.append(中文);
        builder.append("\u2122");
        String completedString = builder.toString();
        System.out.println(completedString);
    }
}
