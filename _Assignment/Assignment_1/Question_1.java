//WAP to sorting string without using string Methods?

public class Question_1 {
	public static void main(String args[]) {
		String str = "HarshGOyal";
		int len = str.length();
		char arr[] = new char[len];
		for (int i = 0; i < len; i++) {
			arr[i] = str.charAt(i);
		}
		for (int j = 0; j < len; j++) {
			for (int i = 0; i < len - 1; i++) {
				if (arr[j] < arr[i]) {
					char temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}

		}
		String str2 = "";
		for (int i = 0; i < len; i++) {
			str2 = str2 + arr[i];
			System.out.println(arr[i]);
		}
		System.out.println(str2);
	}
}
