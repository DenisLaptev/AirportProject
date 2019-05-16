package com.mvc_project.airport.view;

import com.mvc_project.airport.Application;
import com.mvc_project.airport.exceptions.MyMainMenuException;

import java.util.Scanner;

public class MainMenu {

    public static void displayMenu() {
        System.out.println("----------ГЛАВНОЕ МЕНЮ----------");
        System.out.println("1) Онлайн-табло");
        System.out.println("2) Посмотреть информацию о рейсе");
        System.out.println("3) Поиск и бронировка рейса");
        System.out.println("4) Отменить бронирование");
        System.out.println("5) Мои рейсы");
        System.out.println("6) Выход");
        System.out.println("Ваш выбор: ");
    }

    public static void continueExitQuestion() throws MyMainMenuException {
        System.out.println("--------------------------------");
        System.out.println("Чтобы продолжить нажмите 9");
        System.out.println("Чтобы выйти нажмите 6");

        Scanner q = new Scanner(System.in);

        switch (q.nextInt()) {
            case 6:
                System.out.println("Спасибо! До свиданья!");
                break;

            case 9:
                new Application();
                break;
            default:
                throw new MyMainMenuException();
        }
    }
}
