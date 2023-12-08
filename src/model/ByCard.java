package model;

import java.util.Scanner;

public class ByCard implements Terminal {

    @Override
    public void pay(){
        try{
            System.out.print("Введите номер карты(8 цифр): ");
            Scanner sc = new Scanner(System.in);
            int num = sc.nextInt();
            String numStr = Integer.toString(num);
            if(numStr.length()!=8){
                System.out.println("Номер карты должен содержать ровно 8 цифр.");
                pay();
            }
            System.out.print("Введите пароль(4 цифры): ");
            int pin = sc.nextInt();
            String pinStr = Integer.toString(pin);
            if(pinStr.length()!=4){
                System.out.println("Пароль должен содержать ровно 4 цифры.");
                pay();
            }


        } catch(Exception e){
            System.out.println("Введите данные корректно");
            pay();

        }
    }


}
