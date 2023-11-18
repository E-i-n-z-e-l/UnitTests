package twoArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main extends Methods {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        Methods methods = new Methods();

        System.out.println("Заполните первый список из пяти элементов ");
        methods.receivingArray(list1);
        System.out.println("Заполните второй список из пяти элементов ");
        methods.receivingArray(list2);

        System.out.println("Список №1: " + list1);
        System.out.println("Список №2: " + list2);

        int sumList1 = methods.ListSum(list1);
        int sumList2 = methods.ListSum(list2);

        System.out.println(sumList1);
        System.out.println(sumList2);

        methods.Comparison(list1, list2);
    }
}
