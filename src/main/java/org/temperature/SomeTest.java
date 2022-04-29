package org.temperature;

public class SomeTest {


          public static boolean isPalindrome(String text) {
              text = text.replaceAll("\\W", " ");//удаляем все ненужное
              StringBuilder strBuilder = new StringBuilder(text);
              strBuilder.reverse(); //переворачиваем строку
              String invertedText = strBuilder.toString();//присваиваем перевернутую строку
              System.out.println(invertedText);
              System.out.println(text.equalsIgnoreCase(invertedText));
              return text.equalsIgnoreCase(invertedText);//возвращаем сравнение двух строк вне зависимости от регистра


          }

}

class rlzt {
    public static void main(String[] args) {

        String str = new String("someegmos");

        SomeTest.isPalindrome(str);
    }
}