package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CashbackHackServiceTest {
    private CashbackHackService service = new CashbackHackService();

    //покупка на 0 руб
    @Test
    public void calculateCashback0() {

        // подготавливаем данные:
        int amount = 0;
        int expected = 1000;
        // вызываем целевой метод:
        int actual = service.remain(amount);

        boolean result = false;
        if (expected == actual) {
            result = true;
        }
        //проверка ожидаемого и фактического результата
        assertTrue(result);
    }

    //покупка на 500 руб
    @Test
    public void calculateCashback500() {
        // подготавливаем данные:
        int amount = 500;
        int expected = 500;
        // вызываем целевой метод:
        int actual = service.remain(amount);

        boolean result = false;
        if (expected == actual) {
            result = true;
        }
        //проверка ожидаемого и фактического результата
        assertTrue(result);
    }

    //покупка на 999 руб
    @Test
    public void calculateCashback999() {
        // подготавливаем данные:
        int amount = 999;
        int expected = 1;
        // вызываем целевой метод:
        int actual = service.remain(amount);
        boolean result = false;
        if (expected == actual) {
            result = true;
        }
        //проверка ожидаемого и фактического результата
        assertTrue(result);
    }

    //покупка на 1000 руб
    @Test
    public void calculateCashback1000() {
        // подготавливаем данные:
        int amount = 1000;
        int expected = 0;
        // вызываем целевой метод:
        int actual = service.remain(amount);
        boolean result = false;
        if (expected == actual) {
            result = true;
        }
        //проверка ожидаемого и фактического результата
        assertTrue(result);
    }
}