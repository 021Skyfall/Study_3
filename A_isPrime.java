public class A_isPrime {
    public static void main(String[] args) {
        // TODO:

        int num = 11587;
        // int s = (int) Math.sqrt(num);
        //     if(num == 1) {
        //         return false;
        //     }
        //     if(num==2) {
        //         return true;
        //     }
        //     if(num%2==0){
        //         return false;
        //     }
        //     for(int i = 3; i<= s; i+=2) {
        //         if(num%i==0){
        //             return false;
        //         }
        //     }
        //     return true;
        boolean result = true;
        if(num == 2) {
            result = true;
        }
        if(num == 1 || num % 2 ==0) {
            result = false; // 여기서 2와 약수 없는 1, 그리고 짝수를 거름
        }
        // for문으로 위에서 걸러지고 남은 홀수들 검사할 수 있게 만듬
        for(int i = 3; i <= (int) Math.sqrt(num); i+=2) {  // 대칭하는 약수들을 / 제곱근까지만 검사할 수 있게 해줌 ~> 더 좋은 알고리즘 / 또 제곱근은 double값으로 출력되서 (int) 씌워야함
            if(num % i == 0) {
                result = false;
            }
        }
        System.out.println(result);;
    }
}
