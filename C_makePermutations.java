public class C_makePermutations {
    public static void main(String[] args) {
        //String output = makePermutations("ab");
        //System.out.println(output); // --> "aa,ab,ba,bb"
        String str = "안녕하세요"; // 입력 값

        String result = "";
        if(str.isEmpty()) { // 입력 값이 공백이면 공백 그대로 출력 (예외 상황)
            System.out.println("");
        }
        for(int left = 0; left < str.length(); left++) { //좌 먼저 입력
            for(int right = 0; right < str.length(); right++) { // 우 연속 입력을 위한 중첩 for
                result = result + str.charAt(left) + str.charAt(right) + ",";
                // 좌우 연속 입력 후 ,로 구분
                // 만약 출력 값을 3글자로 하고싶으면 for 중첩 더 함
            }
        }
        System.out.println(result.substring(0,result.length() -1));
        // 마지막으로 불러올 출력 값에서 ,를 빼야하니 substring으로 result 출력 값 한 칸 전으로 제외 시킴
        // https://jamesdreaming.tistory.com/81 (substring)
    }
}
