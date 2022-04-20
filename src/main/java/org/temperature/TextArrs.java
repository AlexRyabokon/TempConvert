package org.temperature;

public class TextArrs {

    public String[] arrayStrings = {"Отец мой Андрей Петрович Гринев",                                                                      //0
            "паче всякого чаяния матушка родила дочь, то батюшка объявил бы куда следовало о смерти",                                //1
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
    public void sravn() {

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
        double average = (arrayStrings[0].length() + arrayStrings[1].length() + arrayStrings[2].length() +
                arrayStrings[3].length() + arrayStrings[4].length() +
                arrayStrings[5].length() +
                arrayStrings[6].length() + arrayStrings[7].length() +
                arrayStrings[8].length() + arrayStrings[9].length() +
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
    public static String[] separateString(String str) {
        String delimeter = " "; // Разделитель
        String[] subStr = str.split(delimeter);
        return subStr;

    }

    public static char[] toSymbolsWord(String str){
        char[] str1 = str.toCharArray();
        return str1;

    }

public void someMeth() {
    for (int i = 0; i < arrayStrings.length; i++) {
        String[] arrayOfchars = TextArrs.separateString(arrayStrings[i]); // слова в String

        for (int j = 0; j < arrayOfchars.length; j++) {
            char[] c = toSymbolsWord(arrayOfchars[j]); // слова в массиве char
            int charCode = (int) c[j];
            System.out.println(charCode); //zatup
//
             }
        }
    }
}






class Realization1{

    public static void main(String[] args) {

    TextArrs t = new TextArrs();
    t.someMeth();


    }

}