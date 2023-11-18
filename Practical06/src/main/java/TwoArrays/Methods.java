package TwoArrays;

import java.util.List;
import java.util.Scanner;

public class Methods implements IMethods{

    public void ReceivingArray(List<Integer> list) {
        Scanner scanner = new Scanner(System.in);
        while (list.size() < 5) {
            System.out.println("Введите элемент списка: ");
            int element = scanner.nextInt();
            list.add(element);
        }
    }

    public int ListSum(List<Integer> list) {
        int sumArray = 0;
        for (int i = 0; i < list.size(); i++) {
            sumArray = sumArray + list.get(i);
        }
        return sumArray / list.size();
    }

    public void Comparison(List<Integer> list1, List<Integer> list2) {
        int sumList1 = ListSum(list1);
        int sumList2 = ListSum(list2);

        if (sumList1 > sumList2) {
            System.out.println("Первый список имеет большее среднее значение");
        }
        else if (sumList1 < sumList2) {
            System.out.println("Второй список имеет большее среднее значение");
        }
        else {
            System.out.println("Средние значения равны");
        }

    }

}
