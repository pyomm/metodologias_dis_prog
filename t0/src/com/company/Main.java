package com.company;

public class Main {

    public static void main(String[] args) {

        LiteraryWork SapoYSepo = new LiteraryWork("Sapo y Sepo", null, "Harper & Row");
        System.out.println(SapoYSepo.toString());
        System.out.println(SapoYSepo.hasCopyright());

        Movie SuchABeautifulDay = new Movie("It's such a beautiful day", "Bitter films", "Don Hertzfeldt","Don Hertzfeldt",new String []{"Don Hertzfeldt", "Sara Cushman"});
        System.out.println(SuchABeautifulDay.toString());
        System.out.println(SuchABeautifulDay.hasCopyright());

        Movie ClockworkOrange = new Movie("A Clockwork Orange", "Warner Bros", "Stanley Kubrick", "Stanley Kubrick", new String[] {"Malcolm Mcdowell", "Patrick Magee", "Michael Bates", "Warren Clarke", "John Clive"});
        System.out.println(ClockworkOrange.toString());
        Movie ClockworkOrangee = new Movie("A Clockwork Orange", "Warner Bros", "Stanley Kubrick", "Stanley Kubrick", new String[] {"Malcolm Mcdowell", "Patrick Magee", "Michael Bates", "Warren Clarke", "John Clive"});

        LiteraryWork ClockworkOrangeBook = new LiteraryWork("A Clockwork Orange", "Warner Bros", "William Heinemann");
        System.out.println(ClockworkOrangeBook.toString());

        //we test equals for "A clockwork orange", the book and the movie, where the attributes 'title' and 'copyright are the same, but the objects are different subclasses
        System.out.println(ClockworkOrange.equals(ClockworkOrangeBook));

        //we test equals for two separate objects (of the same subclass) that are identical in 'title' and 'copyright' (identifiers for a creative work)
        System.out.println(ClockworkOrange.equals(ClockworkOrangee));

        //we test equals for two objects from the same subclass but with different attributes 'title' and 'copyright'
        System.out.println(SuchABeautifulDay.equals(ClockworkOrange));
    }
}