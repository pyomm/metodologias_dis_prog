package com.company;

public class LiteraryWork extends CreativeWork{

    private String publisher;

    public LiteraryWork(String title, String copyright, String publisher){
        super(title, copyright);
        this.publisher = publisher;
    }

    @Override
    public boolean equals (CreativeWork a) {
        if (!(a instanceof LiteraryWork)){
            return false;
        }
        else{
            LiteraryWork b = (LiteraryWork) a;
            return super.equals(b);
        }
    }
    @Override
    public String toString() {
        return "Literary work" + super.toString();
    }
}