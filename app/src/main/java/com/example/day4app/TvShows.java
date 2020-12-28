package com.example.day4app;

public class TvShows {

    private String name;
    private String seasons;
    private String year;
    //private double time;
    //private String genre;
    private int img;

    public TvShows(String name, String seasons, String year, int img) {

       this.name = name;
       this.seasons = seasons;
       this.year = year;
       this.img = img;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeasons() {
        return seasons;
    }

    public void setSeasons(String seasons) {
        this.seasons = seasons;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }


    //public String getGenre() {
      //  return genre;
    //}

    //public void setGenre(String genre) {
      //  this.genre = genre;
    //}

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }
}
