public class Main {
	public static void main(String[] args) {
		try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
			System.out.print("Введите год: ");
			try {
				String input = scanner.nextLine().trim();
				int year = Integer.parseInt(input);
				if (year <= 0) {
					throw new IllegalArgumentException("Год должен быть положительным целым числом.");
				}
				boolean isLeap = isLeapYear(year);
				System.out.println(isLeap ? "Високосный" : "Не високосный");
			} catch (IllegalArgumentException e) {
				System.out.println("Ошибка ввода: " + e.getMessage());
			}
		}
	}

	private static boolean isLeapYear(int year) {
		return (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
	}
}
