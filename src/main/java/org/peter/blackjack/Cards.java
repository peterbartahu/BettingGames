package org.peter.blackjack;

public final class Cards {
    //EZ egy konstans osztály, konstans tároló segéd osztály - Single responsibility - konstans tárolás - nem megváltoztatható
    public static final String KETTES = "2";
    public static final String HÁRMAS = "3";
    public static final String NÉGYES = "4";
    public static final String ÖTÖS = "5";
    public static final String HATOS = "6";
    public static final String HETES = "7";
    public static final String NYOLCAS = "8";
    public static final String KILENCES = "9";
    public static final String TIZES = "10";
    public static final String JUMBÓ = "J";
    public static final String DÁMA = "Q";
    public static final String KIRÁLY = "K";
    public static final String ÁSZ = "A";
    private static final String[] cards = {KETTES, HÁRMAS, NÉGYES, ÖTÖS, HATOS, HETES, NYOLCAS, KILENCES, TIZES, JUMBÓ, DÁMA, KIRÁLY, ÁSZ};

    private Cards() {
        //Konstans tároló osztályból nem hozunk létre példányokat.
    }

    //static -- nem kell példányosítani hozzá, csak Classname.methodname.
    public static String getCard(int index) {
        return cards[index];
    }

    public static int length() {
        return cards.length;
    }

}
