package org.temperature;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;


public class TextArrs {

    public String[] arrayStrings = {"Отец мой Андрей Петрович Гринев яваавя texttxet",                                                                      //0
            "паче всякого чаяния матушка родила дочь, то батюшка объявил бы куда следовало о смерти trannart",                                //1
            "С пятилетнего возраста отдан я был на руки стремянному Савельичу, за трезвое поведение",                                //2
            "Бопре, принялся за работу",                                                                                             //3
            "Прачка Палашка, толстая и рябая девка",                                                                                 //4
            "Ну, а там что?",                                                                                                        //5
            "Мысль о скорой разлуке со мною так поразила матушку, что она уронила ложку в кастрюльку, и слезы потекли по ее лицу",   //6
            "отвечал батюшка нахмурясь",                                                                                             //7
            "На другой день поутру подвезена была к крыльцу",                                                                        //8
            "Ты едешь в Оренбург служить под его начальством",                                                                       //9
            "На другой день поутру подвезена была к крыльцу дорожная кибитка"                                                        //10
    };

   public double av = averageStrLength();

    //4. Найти самую короткую и самую длинную строки. Вывести найденные строки и их длину.
    public void compareOfString() {

        String stringMax = arrayStrings[0];
        String stringMin = arrayStrings[0];

        for (int i = 0; i < arrayStrings.length; i++) {
            if (arrayStrings[i].length() > stringMax.length()) {
                stringMax = arrayStrings[i];
            }

            if (arrayStrings[i].length() < stringMin.length()) {
                stringMin = arrayStrings[i];
            }


        }
        System.out.println("Самая короткая строка:  " + stringMin + " и ее длинна:  " + stringMin.length() + " симоволов");
        System.out.println("Самая длинная строка:   " + stringMax + " и ее длинна:  " + stringMax.length() + " симоволов");
    }

    //5. Упорядочить и вывести строки в порядке возрастания (убывания) значений их длины.
    public void filterFromLittleToBig() {
        for (int i = arrayStrings.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {

                if (arrayStrings[j].length() > arrayStrings[j + 1].length()) {
                    String tmp = arrayStrings[j];
                    arrayStrings[j] = arrayStrings[j + 1];
                    arrayStrings[j + 1] = tmp;
                }
            }
        }
        for (int i = 0; i < arrayStrings.length; i++) {
            System.out.println(arrayStrings[i]);

        }

    }

    // 6. Вывести на консоль те строки, длина которых меньше (больше) средней арифметической всех длин строк в массиве, а также длину.
    public double averageStrLength() {

      double average = (arrayStrings[0].length() +
             arrayStrings[1].length() +
             arrayStrings[2].length() +
             arrayStrings[3].length() +
             arrayStrings[4].length() +
             arrayStrings[5].length() +
             arrayStrings[6].length() +
             arrayStrings[7].length() +
             arrayStrings[8].length() +
             arrayStrings[9].length() +
             arrayStrings[10].length()) / arrayStrings.length;
        return average;
    }

    public void compareLength() {
        System.out.println(" \n Строки длинной больше ср. ар.:  \n");
        for (int i = 0; i < arrayStrings.length; i++) {
            if (arrayStrings[i].length() > av)
                System.out.println(arrayStrings[i]);
        }
        System.out.println("\n  Строки длинной меньше ср. ар.:  \n");
        for (int j = 0; j < arrayStrings.length; j++) {
            if (arrayStrings[j].length() < av)
                System.out.println(arrayStrings[j]);
        }

    }

    //7. Найти слово, символы в котором идут в строгом порядке возрастания их кодов.Если таких слов несколько, найти первое из них.


    public void someMeth() {

        for (int i = 0; i < arrayStrings.length; i++) {
            String delimeter = " "; // Разделитель
            String[] words = arrayStrings[i].split(delimeter); // разделил на слова в стринг


            for (int j = 0; j < words.length; j++) {
                char[] arrayOfwords = words[j].toCharArray();        //                  слова в массиве char


                for (int k = 0; k < arrayOfwords.length; k++) {

                    int min = arrayOfwords[k];
                    int min_i = k;

                    for (int l = k + 1; l < arrayOfwords.length; l++) {
                        if (arrayOfwords[l] < min) {
                            min = arrayOfwords[l];
                            min_i = l;
                        }
                    }

                    if (k != min_i) {
                        char tmp = arrayOfwords[k];
                        arrayOfwords[k] = arrayOfwords[min_i];
                        arrayOfwords[min_i] = tmp;
                    }

                }
                String finalString = new String(arrayOfwords);
                if (finalString.equals(words[j].trim()) && finalString.length() > 3) {
                    System.out.println(finalString);
                }
            }
        }
    } //вариант 1

    public void someMeth1() {
        for (int i = 0; i < arrayStrings.length; i++) {
            String delimeter = " "; // Разделитель
            String[] subStr = arrayStrings[i].split(delimeter);
            ;

            for (int j = 0; j < subStr.length; j++) {
                char[] c = subStr[j].toCharArray();        //                  слова в массиве char
                System.out.println("\n" + subStr[j]);
                for (int k = 0; k < c.length; k++) {              //  вывел каждое слово отдельно
                    int charCode = (int) c[k];                    //

                    System.out.print(charCode + " ");


                }
            }
        }
    } // просто вывод слов с кодами его чаров

    //8. Найти слово, состоящее только из различных символов. Если таких слов несколько, найти первое из них.
    public String findOriginalWord() {

        String originWord = null;
        for (int i = 0; i < arrayStrings.length; i++) {
            String delimeter = " "; // Разделитель
            String[] words = arrayStrings[i].split(delimeter);
            String formatString;
            char[] charsOfwords;

            for (int j = 0; j < words.length; j++) {
                charsOfwords = words[j].toCharArray();

                for (int k = 0; k < charsOfwords.length - 1; k++) {
                    for (int l = k + 1; l < charsOfwords.length; l++) {
                        if (charsOfwords[k] == charsOfwords[l]) {

                            formatString = new String(charsOfwords);
                            formatString = "                ";

                            System.out.println(formatString);
                        }
                    }
                }
                if (!words[j].equals(charsOfwords)&&words[j].length()>=3) {
                    originWord = words[j];
                   // System.out.println("Слово с оригинальными символами  " + words[j]);
                    break;
                }

                }
            } return originWord;
        }
//9. Найти все слова-палиндромы. Если таких слов больше одного, найти второе из них.
            public static boolean isPalindrome(String text) {

                StringBuilder strBuilder = new StringBuilder(text);
                strBuilder.reverse(); //переворачиваем строку
                String invertedText = strBuilder.toString();//присваиваем перевернутую строку
                return text.equalsIgnoreCase(invertedText);//возвращаем сравнение двух строк вне зависимости от регистра
            }

            public void findAndShowPalindrome(){
                for (int i = 0; i < arrayStrings.length; i++) {
                    String delimeter = " "; // Разделитель
                    String[] words = arrayStrings[i].split(delimeter); // разделил на слова в стринг

                    for (int j = 0; j < words.length; j++) {

                        if (TextArrs.isPalindrome(words[j]) && words[j].length()>=3){
                            System.out.println("Palindrom is:  " + words[j]);
                        }

                    }
                }
            }



/*13. Найти слово, в котором число различных символов минимально. Если таких слов несколько, найти первое из них. Словом считается фраза более 3-х символов.      */
    private static int diffWords(String st){ // число уникальных символов
        StringBuffer u = new StringBuffer(); // строка, в которой каждый символ будет содержаться лишь однажды
        String c; // текущий символ в строке
        for (int i=0;i<st.length();i++) { // обход строки
            c = String.valueOf(st.charAt(i)); // получить текущий символ
            if (u.indexOf(c)==-1) // символ еще не встречался
                u.append(c); // добавляем
        }

        return u.length(); // возвращаем длину получившейся строки
    }

    public static void findMinLength(String[] stringArr) {


        for (int i = 0; i < stringArr.length; i++) {
            String delimeter = " "; // Разделитель
            String[] words = stringArr[i].split(delimeter);
            // разделил на слова в стринг
            for (int j = 0; j < words.length; j++) {        // имеем каждое отдельное слово
                String goal = words[0];
                System.out.println(words[j]+ " , ");
                System.out.println();
                if (diffWords(words[j])<diffWords(goal)){
                    goal = words[j];
                }
                System.out.println("");
                System.out.println("Искомое слово: "+goal+", число разных символов: "+diffWords(goal));
            }
        }

    }

}




class Realization1{

    public static void main(String[] args) {

        TextArrs t = new TextArrs();




            System.out.println();
            System.out.println("-----------------------------------------------------------------------------");




}
}

