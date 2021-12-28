package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    //покупка на 0 руб
    @Test
    void calculateCashback0() {
        CashbackHackService service = new CashbackHackService();
        // подготавливаем данные:
        int amount = 0;
        int expected = 1000;
        // вызываем целевой метод:
        long actual = service.remain(amount);
        //проверка ожидаемого и фактического результата
        assertEquals(actual, expected);
    }

    //покупка на 500 руб
    @Test
    void calculateCashback500() {
        CashbackHackService service = new CashbackHackService();
        // подготавливаем данные:
        int amount = 500;
        int expected = 500;
        // вызываем целевой метод:
        long actual = service.remain(amount);
        //проверка ожидаемого и фактического результата
        assertEquals(actual, expected);
    }

    //покупка на 999 руб
    @Test
    void calculateCashback999() {
        CashbackHackService service = new CashbackHackService();
        // подготавливаем данные:
        int amount = 999;
        int expected = 1;
        // вызываем целевой метод:
        long actual = service.remain(amount);
        //проверка ожидаемого и фактического результата
        assertEquals(actual, expected);
    }

    //покупка на 1000 руб
    @Test
    void calculateCashback1000() {
        CashbackHackService service = new CashbackHackService();
        // подготавливаем данные:
        int amount = 1000;
        int expected = 0;
        // вызываем целевой метод:
        long actual = service.remain(amount);
        //проверка ожидаемого и фактического результата
        assertEquals(actual, expected);
    }
}