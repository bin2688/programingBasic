import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        
        //a에서 i번째 인덱스를 한줄씩 추출
        for (int i = 0; i < a.length(); i++) {
        	System.out.println(a.charAt(i));
        }
    }
}