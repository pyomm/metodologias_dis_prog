package com.company;

public class Novel extends LiteraryWork {

    private String author;

    public Novel(String title, String copyright, String publisher, String author){
        super(title, copyright, publisher);
        this.author = author;
    }

    @Override
    public boolean equals (CreativeWork a) {
        if (!(a instanceof Novel)){
            return false;
        }
        else{
            Novel b = (Novel) a;
            return super.equals(b);
        }
    }
    @Override
    public String toString() {
        return "Novel" + super.toString();
    }
}
