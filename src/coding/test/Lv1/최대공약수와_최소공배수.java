package coding.test.Lv1;

public class 최대공약수와_최소공배수 {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];  //  최대, 최소
        int min=0, max=0;

        // 최대
        for(int i=1; i<=n && i<=m; i++){
            if(n%i==0 && m%i==0){
                max=i;
            }
        }

        //최소
        min = (n*m)/max;

        return answer = new int[]{max, min};
    }

    public static void main(String[] args) {
        최대공약수와_최소공배수 aa = new 최대공약수와_최소공배수();
        System.out.println(aa.solution(3,12));
        System.out.println(aa.solution(2,5));
    }
}
