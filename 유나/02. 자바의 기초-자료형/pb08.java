package jumptojava.ch03;

import java.util.HashMap;
public class pb08 {
	public static void main(String[] args) {
		HashMap<String, Integer> grade = new HashMap<>();
		grade.put("A", 90);
		grade.put("B", 80);
		grade.put("C", 70);
		int result = grade.remove("C");
		System.out.println(result);
		System.out.println(grade);
	}
}
