package Default;
// 커멘드 라인 입력 연습
// 커멘드 라인 문자열을 매개변수르 전달 
// 구분방법 "", 공백
public class CommandLIne {
	
	public static void main(String[] args) {
		if(args.length != 3) {
			System.out.println("Java Parameter row index at 3");
			System.exit(0);
		}
		
		int param_01 = Integer.parseInt(args[0]);
		int param_02 = Integer.parseInt(args[1]);
		int result = 0;
		char at = args[2].charAt(0);
		
		switch(at) {
			case '+' :
				result = param_01 + param_02;
				break;
			case '-' :
				result = param_01 - param_02;
				break;
			case '*' :
				result = param_01 * param_02;
				break;
			case '/' :
				result = param_01 / param_02;
				break;
			default :
				System.out.println("Unkown Parameter");
		}
		System.out.println("Result: "+result);
	}	
}
