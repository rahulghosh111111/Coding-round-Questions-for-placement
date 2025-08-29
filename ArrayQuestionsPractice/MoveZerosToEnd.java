package ArrayQuestionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MoveZerosToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Array size must be greater than 0.");
            sc.close();
            return;
        }

        List<Integer> list = new ArrayList<>();
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextInt());
        }
        List<Integer> temp = new ArrayList<>();

        for(int i = 0; i<n;i++){
            if(list.get(i) != 0){
                temp.add(list.get(i));
            }
        }
        int nz = temp.size();
        for(int i = 0; i <nz;i++){
            list.set(i, temp.get(i));
        }
        for(int i = nz; i <n;i++){
            list.set(i,0);
        }
        System.out.println("Lat array:"+ list);
    }
}
//[1,0,8,0,6,0] => [1,8,6,0,0,0]