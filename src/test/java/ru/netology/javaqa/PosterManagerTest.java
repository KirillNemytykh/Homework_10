package ru.netology.javaqa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PosterManagerTest {

    @Test
    public void findAllFilmsTest() {
        PosterManager manager = new PosterManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентльмены";

        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);

        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllFilmsWithUsingManagerLimit() {
        PosterManager manager = new PosterManager(7);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентльмены";
        String movie4 = "Номер один";
        String movie5 = "Человек-невидимка";
        String movie6 = "Матрица";
        String movie7 = "Гарри Поттер";

        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);
        manager.addFilm(movie5);
        manager.addFilm(movie6);
        manager.addFilm(movie7);

        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6, movie7};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllFilmsWithUsingManagerLimitLessMax() {
        PosterManager manager = new PosterManager(7);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентльмены";
        String movie4 = "Номер один";
        String movie5 = "Человек-невидимка";
        String movie6 = "Матрица";

        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);
        manager.addFilm(movie5);
        manager.addFilm(movie6);

        String[] actual = manager.findAll();
        String[] expected = {movie1, movie2, movie3, movie4, movie5, movie6};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFimsWithFactorySettingOfNumberOfFilms() {
        PosterManager manager = new PosterManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентльмены";
        String movie4 = "Номер один";
        String movie5 = "Человек-невидимка";

        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);
        manager.addFilm(movie5);

        String[] actual = manager.findLast();
        String[] expected = {movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFimsWithUsingManager() {
        PosterManager manager = new PosterManager(7);
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентльмены";
        String movie4 = "Номер один";
        String movie5 = "Человек-невидимка";
        String movie6 = "Матрица";
        String movie7 = "Гарри Поттер";

        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);
        manager.addFilm(movie5);
        manager.addFilm(movie6);
        manager.addFilm(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFimsWithFactorySettingsOfLimitAndOverlimetedNumberOfFilms() {
        PosterManager manager = new PosterManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентльмены";
        String movie4 = "Номер один";
        String movie5 = "Человек-невидимка";
        String movie6 = "Матрица";
        String movie7 = "Гарри Поттер";

        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);
        manager.addFilm(movie5);
        manager.addFilm(movie6);
        manager.addFilm(movie7);

        String[] actual = manager.findLast();
        String[] expected = {movie7, movie6, movie5, movie4, movie3};

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void findLastFimsWithFactorySettingsOfLimitAndLessNumberOfFilms() {
        PosterManager manager = new PosterManager();
        String movie1 = "Бладшот";
        String movie2 = "Вперед";
        String movie3 = "Джентльмены";
        String movie4 = "Номер один";

        manager.addFilm(movie1);
        manager.addFilm(movie2);
        manager.addFilm(movie3);
        manager.addFilm(movie4);

        String[] actual = manager.findLast();
        String[] expected = { movie4, movie3, movie2, movie1};

        Assertions.assertArrayEquals(expected, actual);
    }

}
