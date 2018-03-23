package by.home.assessments;

import java.util.Scanner;

public class assessments {    
	public static void main(String[] args) {        

        Scanner s = new Scanner(System.in);

        System.out.println("Введите количество оценок: ");

        int a = s.nextInt();

        int[] mas = new int[a];
        int max = mas[0], min = mas[0];

        System.out.println("Введите оценки в массив: ");
        for(int i = 0; i < mas.length; i++) {
            mas[i] = s.nextInt();
        }           

        for(int i = 0; i < mas.length; i++) {
            if(mas[i] > max) 
                max = mas[i];

            if(mas[i] < min) 
                min = mas[i];
        }
        System.out.println("Максимальная оценка: " + max);
        System.out.println("Минимальная оценка: " + min);            
    }    
}