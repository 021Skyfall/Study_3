public class D_hasRepeatedCharacter {
    public static void main(String[] args) {
        // 문자열에 중복된 문자(letter)가 존재하는지 여부를 리턴
//        String str = "aabbcc"; // true 일 경우의 입력 값
//        String str = "qweasdzxc"; // false 일 경우의 입력 값
        String str = ""; // 공백 예외

        boolean result = false; // 기본적으로 아래의 조건에 부합하지 않으면 false 출력
        for(int i = 0; i < str.length(); i++) {
            for(int j = i + 1; j < str.length(); j++) { // i에 +1 해서 i에 해당하는 인덱스 검사 후 j에 해당하는 인덱스 검사
                //근데 여기 조금 이해가 안가는 게, 1번 for문 먼저 다 돌아가고 2번 for문이 시작하는건가?
                //이 j = i + 1 조건식이면 바로 다음 문자만 검사하는거 아닌가?
                // 아니면 아래 if문 조건에 for문이 실시간으로 돌아가는건가 ~> 조금 더 알아봐야할듯
                // https://colossus-java-practice.tistory.com/40
                // 아 이 블로그에 따르면 
                //밖에 있는 for문이 1번 실행될 때마다,안에 있는 for문이 모든 반복을 실행하게 된다.
                // 그러면 바깥 for문으로 맨 처음 글자, 안 for문으로 그 글자 다음부터 쭊 반복하면서 if에 걸리는거 걸러냄 <~ 이거네
                if(str.charAt(i) == str.charAt(j)) { // 두 가지 for문 반복하는 동안 중복되는 글자 걸러냄
                    result = true;
                }
            }
        }
        System.out.println(result);
    }
}
