package org.temperature;

public class StringHomework {

    public String unknownStr;


    public StringHomework(String unknownStr) {
        this.unknownStr = unknownStr;
    }


    // Под каким номером в строке стоит первая и последняя буква **я** в строке "НепонятнаяСтрока". 2 ВАРИАНТ - main logic
    public static void findSymbol(String str) {

        char[] str1 = new char[str.length()];
        str.getChars(0, 16, str1, 0);
        for (int j = 0; j < str1.length; j++) {
            if (str1[j] == 'я') {
                System.out.println(j + " this is index of element 'я' ");
            }
        }

    }

}

class Censor{
    //Напишите код, заменяющий в строке все вхождения слова «бяка» на «вырезано цензурой».
    public static void doCensorship(String str){

            String newText = str.replace("бяка", "вырезано цензурой");
            System.out.println(newText);
    }

}

class Realization{
    public static void main(String[] args) {
        StringHomework str1 = new StringHomework("НепонятнаяСтрока");

        int index = str1.unknownStr.indexOf("я");
        int index2 = str1.unknownStr.lastIndexOf("я");  //Под каким номером в строке стоит первая буква и последняя буква **я** в строке "НепонятнаяСтрока". 1 ВАРИАНТ.
        System.out.println(index + "  index of 'я' symbol" + " and " + index2 +" last indexof 'я' symbol ");
    }

}


