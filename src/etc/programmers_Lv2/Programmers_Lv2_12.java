package etc.programmers_Lv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class Programmers_Lv2_12 {
    public static void main(String[] args) {
//        System.out.println(6210);
        System.out.println(solution(new int[]{6, 10, 2}));
//        System.out.println(solution(new int[]{3, 30, 34, 5, 9}));
//        System.out.println(9534330);

//        System.out.println(solution(new int[]{0, 0, 0}));

    }

    public static String solution(int[] numbers) {
        String answer = "";
        String[] nums = new String[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            nums[i] = String.valueOf(numbers[i]);
        }

        Arrays.sort(nums, (o1, o2) -> {
            System.out.println(Arrays.toString(nums));
            System.out.println(o1+", "+o2 +" => "+(o2+o1).compareTo(o1+o2));
//            System.out.println(o2+o1 +" "+o1+o2);
//            System.out.println((o2+o1).compareTo(o1+o2));


            return (o2+o1).compareTo(o1+o2);
        });

        if (nums[0].equals("0")) {
            return "0";
        }


        for (int i = 0; i < nums.length; i++) {
            answer += nums[i];
        }

        System.out.println(Arrays.toString(nums));
        return answer;
    }

}
