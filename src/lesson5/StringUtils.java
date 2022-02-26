package lesson5;

public class StringUtils {
    // 1 - переменные (могут быть или нет быть)
    // 2 - конструкторы (могут быть или нет быть)
    // 3 - методы (могут быть или нет быть)

    /**
     * Метод, который будет принимать текст, и возвращать кол-во гласных букв в тексте
     * 1 - модификатор доступа (определитель области видимости)
     * public - видимость внутри всего проекта
     * protected - внутри текущего пакета, внутри класса и дочерним классам
     * ________ - внутри текущего пакета
     * private - только внутри текущего класса
     * <p>
     * 2 - static (пишем или нет)
     * 3 - возвращаемый тип (int, String, или любой другой тип)
     * void (если нет возвращаемого типа)
     * 4 - навзание метода (с маленькой буквы, придумываем сами)
     * 5 - входящие параметры (те данные без которых невозможно выполнить данный метод)
     * (int count, int weight, int height), если нет входящих - ()
     * 6 - тело (то что будет выполняться при вызове метода)
     */
    public static int countVowel(String text) {
        // text - все что угодно может быть
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == 'a' || text.charAt(i) == 'o' || text.charAt(i) == 'i'
                    || text.charAt(i) == 'y' || text.charAt(i) == 'u') {
                count++;
            }
        }
        return count;
    }

    //метод принимающий входящим параметром   текст и возвращает текст полностью
    // наоборот каждое слово

    public static String reversedByWords(String text) {
        String[] words = text.split("\\s+");
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result = result + new StringBuilder(words[i]).reverse().toString() + " ";
        }
        return result;
    }
    //метод принимает входящим параметром текст и печатает на консоль
    //закодированный его формат (каждую букву меняет на следующую в алфавите)

    public static void coddingText(String text) {
        // text = qw!erty
        String alphabet = "abcdefghijklmnopqrstuvwxyza";
        String result = "";
        for (int i = 0; i < text.length(); i++){
            int index = alphabet.indexOf(text.charAt(i));
            if (index != -1){
                result = result + alphabet.charAt(index+1);
            } else {
                result = result + text.charAt(i);
            }
        }
        System.out.println(result);
    }



}

