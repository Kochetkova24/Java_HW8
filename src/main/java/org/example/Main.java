package org.example;

public class Main {


    public static void main(String[] args) {
        FormDate formDate = new FormDate();
        formDate.day = 13;
        formDate.month = 6;
        formDate.year = 1990;


        Post post = new Post();
        post.name = "Иван";
        post.passport = "4444 № 44444444";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Иванов";
        post.subscription = true;

        System.out.println(formDate.day);
        System.out.println(formDate.month);
        System.out.println(formDate.year);

        System.out.println(post.name);
        System.out.println(post.passport);
        System.out.println(post.patronymic);
        System.out.println(post.phone);
        System.out.println(post.surname);
        System.out.println(post.subscription);
    }
}