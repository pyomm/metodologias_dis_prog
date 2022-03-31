package com.company;

public class Comic extends LiteraryWork{

    private String writer;
    private String illustrator;

    public Comic(String title, String copyright, String publisher, String writer, String illustrator){
        super(title, copyright, publisher);
        this.writer = writer;
        this.illustrator = illustrator;
    }

    @Override
    public boolean equals (CreativeWork a) {
        if (!(a instanceof Comic)){
            return false;
        }
        else{
            Comic b = (Comic) a;
            return super.equals(b);
        }
    }
    @Override
    public String toString() {
        return "Comic" + super.toString();
    }
}