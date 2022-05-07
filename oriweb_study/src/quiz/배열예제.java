package quiz;

public class 배열예제 {

	public static void main(String[] args) {

		/** 
		 	이중 배열 arr 크기를 미리 지정하는 경우
			int arr[][] = new int[3][5];
			
			배열 arr은 다음과 같이 생성된다.
			0 0 0
			0 0 0
			0 0 0
			0 0 0
			0 0 0
			
			반복문을 돌려 랜덤 함수에 값을 집어넣고, 배열에 값을 넣는 게 끝나면
			새로운 반복문을 돌려 값을 출력한다.
			
			랜덤객체 생성하고 1부터 11까지 난수 생성하는 방법
			Random rd = new Random();
			int i = rd.nextInt(10) + 1; //0부터 10까지 뽑은 난수에 + 1을 해서 i에 담는다
			
			배열 arr의 바깥쪽 for문 돌리는 방법
			for(int i = 0 ; i < arr.length ; i++)
			안쪽 for문 돌리는 방법
			arr[i].length 사용
		 
		 */
		
		int arr[][] = new int[3][5];
		
		//1. 반복문을 돌린다
		
			//2. 반복문 안에서 배열의 [i][j] 번째 칸에 랜덤 숫자를 넣는다.
		
		//3. 숫자를 다 넣었으면 다시 반복문을 돌린다.
			
			//4. 배열 안의 있는 숫자를 출력한다. 7, 3, 1, 5 이런식으로
		
		//응용 - 가로 한 줄(3칸)이 끝날 때마다 줄바꿈이 되도록 출력한다.
		
	}

}
