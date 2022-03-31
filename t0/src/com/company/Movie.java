package com.company;

public class Movie extends CreativeWork{

    private String director;
    private String screenwriter;
    private String[] cast;

    public Movie(String title, String copyright, String director, String screenwriter, String[] cast){
        super(title, copyright);
        this.director = director;
        this.screenwriter = screenwriter;
        this.cast = cast;
    }

    @Override
    public boolean equals(CreativeWork a) {
        if (!(a instanceof Movie)){
            return false;
        }
        else{
            Movie b = (Movie) a;
            return super.equals(b);
        }
    }
    @Override
    public String toString() {
        return "Movie" + super.toString();
    }
}
