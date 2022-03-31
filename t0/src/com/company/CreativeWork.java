package com.company;

public class CreativeWork {

    private String title;
    private String copyright;

    public CreativeWork(String title, String copyright){
        this.title = title;
        this.copyright = copyright;
    }

    public boolean hasCopyright(){
        if (copyright != null){
            return true;
        }
        else{
            return false;
        }
    }

    //we only check equals in CreativeWork if equals in the corresponding subclass reaches the 'super.equals' statement
    public boolean equals (CreativeWork a) {
        return this.title.equals(a.title) && this.copyright.equals(a.copyright);
    }

    //title and copyright are printed next to the specific type of creative work obtained in overrides for each subclass
    @Override
    public String toString() {
        return " title= '" + title + '\'' +
                ", copyright= " + copyright;
    }
}