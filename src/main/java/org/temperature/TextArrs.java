package org.temperature;

public class TextArrs {

    String[] arrayStrings = {"Отец мой Андрей Петрович Гринев",                                                                      //0
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




    public void Sravn(){

       String stringMax = arrayStrings[0];
        String stringMin = arrayStrings[0];

        for (int i = 0; i < arrayStrings.length; i++)
        {
            if (arrayStrings[i].length() > stringMax.length()) {
                stringMax = arrayStrings[i];
            }

            if (arrayStrings[i].length() < stringMin.length()) {
                stringMin = arrayStrings[i];
            }


        }
        System.out.println("Самая короткая строка:  " + stringMin + " и ее длинна:  " + stringMin.length() + " симоволов");
        System.out.println("Самая длинная строка:" +
                "git aagit rmrff   " + stringMax + " и ее длинна:  " + stringMax.length() + " симоволов");
    }
}

class Realization1{

    public static void main(String[] args) {
        TextArrs t = new TextArrs();
        t.Sravn();



    }

}