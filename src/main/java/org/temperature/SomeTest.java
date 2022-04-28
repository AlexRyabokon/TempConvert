package org.temperature;

public class SomeTest {
    char a = 'a';
    char d = 'a';

}

class rlzt{
    public static void main(String[] args) {
        SomeTest t = new SomeTest();
        System.out.println(t.d == t.a);
    }
}