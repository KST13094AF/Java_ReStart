package Array;

public class Array01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] MainAry = {1, 2, 3, 4, 5};
		int [] CopyAry = new int[10];
		
		System.arraycopy(MainAry, 0, CopyAry, 0, MainAry.length);
		
		for(int i=0; i<MainAry.length; i++) {
			System.out.printf("%2d",MainAry[i]);
		}System.out.println();
		
		for(int i=0; i<CopyAry.length; i++) {
			System.out.printf("%2d",CopyAry[i]);
		}
	}

}
