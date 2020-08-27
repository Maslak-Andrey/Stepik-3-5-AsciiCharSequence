package ru.masluck;

import java.lang.CharSequence;

public class AsciiCharSequence implements CharSequence {

    byte[] myList;

    public AsciiCharSequence(byte[] example) {

        myList = example.clone();
    }

    @Override
    public int length() {
        return myList.length;
    }

    @Override
    public char charAt(int index) {
        return (char) myList[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {

        return new AsciiCharSequence(java.util.Arrays.copyOfRange(myList, start, end));
    }

    @Override
    public String toString() {

        return new String(myList, java.nio.charset.StandardCharsets.ISO_8859_1);
    }
}
