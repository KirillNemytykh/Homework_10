package ru.netology.javaqa;

public class PosterManager {
    private String[] moviesList = new String[0];
    private int limit;

    public PosterManager(int limit) {
        this.limit = limit;
    }

    public PosterManager() {
        limit = 5;
    }

    public void addFilm(String movie) {
        String[] tmp = new String[moviesList.length + 1];
        for (int i = 0; i < moviesList.length; i++) {
            tmp[i] = moviesList[i];
        }
        tmp[tmp.length - 1] = movie;
        moviesList = tmp;
    }

    public String[] findAll() {
        return moviesList;
    }

    public String[] findLast() {
        int resultLength;
        if (limit < moviesList.length) {
            resultLength = limit;
        } else {
            resultLength = moviesList.length;
        }
        String[] result = new String[resultLength];
        for (int i = 0; i < resultLength; i++) {
            result[i] = moviesList[moviesList.length - 1 - i];
        }
        return result;
    }
}
