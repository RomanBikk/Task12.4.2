public class Solution {
    public static void main(String[] args) {
        int i = 1;
        int composition = 1;
        int sum = 1;
        int count =0;
        while (sum < 200 && composition < 300){

            System.out.println(i);
            i = i+ 3;

            if(i>1){
                sum = sum + i ;
                composition =  i*composition;
            }
            count++;

        }
        System.out.println(count);
    }
}
