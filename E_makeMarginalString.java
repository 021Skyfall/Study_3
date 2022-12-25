public class E_makeMarginalString {
    public static void main(String[] args) {
//        String output = makeMarginalString("abc");
//        System.out.println(output); // --> "aababc"
//         "a" + "ab" + "abc"
        String str = "abc"; // 입력 값
        String result = ""; // String 타입으로 출력
        for (int i = 0; i < str.length(); i++) { // str의 길이만큼 처음 반복
            for (int j = 0; j <= i; j++) { // 얘는 i의 길이 만큼만 반복 >> j를 0으로 해야지 다시 처음부터 붙여줌
                result += str.charAt(j);   // 즉 0 인덱스 일때 a 다음 for문이 i의 길이 만큼이니까 마찬가지로 a 출력
            }                              // 1인덱스면 i 길이만큼이니까 0 ~ 1 반복 후 result에 이어 붙임
        }
        System.out.println(result);
    }
}
