package lesson5;

public class Main {
    public static void main(String[] args) {
        int result = StringUtils.countVowel("iqweyqwuiqwenwew  w ewoe w");
        int result2 = StringUtils.countVowel("bnfkjduirur ");
        System.out.println(result);
        System.out.println(result2);

        System.out.println(StringUtils.reversedByWords("Hello World!"));
        StringUtils.coddingText("hello world1");
    }
}
