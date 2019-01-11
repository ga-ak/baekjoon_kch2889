package c07_문자열사용하기;

import java.util.Scanner;

public class B2491 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String tempString = sc.nextLine();
		int count = 0;
		char[][] dict = new char[][] {
			{'c','='},
			{'c','-'},
			{'d','z','='},
			{'d','-'},
			{'l','j'},
			{'n','j'},
			{'s','='},
			{'z','='},
		};
		
		for (int i=0; i<tempString.length(); i++) {
			for (int j=0; j<dict.length; j++) {
				if(tempString.substring(i, i+1).charAt(0) == dict[j][0] && tempString.length() != 1 && i != tempString.length()-1) {
					System.out.println(i+"번째에서 딕셔너리 탐색 >>> "+tempString.substring(i, i+1));
					int tempCount = 1;
					for (int k=1; k<dict[j].length; k++) {
						if(tempString.substring(i+k, i+k+1).charAt(0) != dict[j][k]) {
							break;
						} else {
							tempCount++;
						}
						if (dict[j].length == tempCount) {
							System.out.printf("%d ~ %d까지 딕셔너리에서 검색됨 1글자로 단축\ni를",i,i+tempCount);
							i += tempCount-1;
							System.out.println(i+"로 이동");
							break;
						}
					}
				}
			}
			count++;
			System.out.println("현재까지 센 글자수 >>> "+count);
		}
		System.out.println(count);
	}

}
