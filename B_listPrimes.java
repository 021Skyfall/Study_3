public class B_listPrimes {
    public static void main(String[] args) {
        // TODO: 2부터 num 사이에 존재하는 모든 소수을 2-3-5 ... 형식으로 리턴

        // 2부터 num까지 순회

        // 어떤 수가 소수인지 검사

        // 소수가 맞다면 문자열에 이어주기
        int num = 22;
        String result = "2"; // 이어줄 문자열 & 2는 무조건 있어야함

        for (int i = 3; i <= num; i+=2) { // 2 이후부터 계산되게 / 해당수까지라 = / 어차피 짝수 중에 2 제외하고 소수인 수는 없기 때문에 2씩 증가(홀수만)
            boolean is = true;
            for(int div = 3; div <= (int) Math.sqrt(i); div+=2) {
                if (i % div == 0) {
                    is = false;
                    break;
                }
            }
            if (is) {
                result = result + "-" + i;
            }
        }
        System.out.println(result);
    }
}
