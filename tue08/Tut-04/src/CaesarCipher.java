import Prog1Tools.IOTools;

public class CaesarCipher {

	public static void main(String[] args) {
		int amount = IOTools.readInt("Wie viele Zeichen willst du verschlüsseln?");
		char[] message = readChars(amount);
		while(getCommand() == 0) {
			int shift = IOTools.readInt("Um wie viele Zeichen soll geshiftet werden?");
			printMessage(message);
			shift(message, shift);
			printMessage(message);
		}
		System.out.println("Byebye!");
	}

	public static void printMessage(char[] message) {
		for (char c : message) {
			System.out.print(c);
		}
		System.out.println(" ");
	}

	public static char[] readChars(int anzahl) {
		if (anzahl <= 0) {
			return null;
		}

		char[] chars = new char[anzahl];
		for (int i = 0; i < chars.length; i++) {
			chars[i] = IOTools.readChar(i + ". Zeichen: ");

		}
		return chars;
	}
	
	public static char[] readAllTheChars() {
		String message = IOTools.readString("Bitte gib deine Nachricht zum Verschlüsseln ein: ");
		return message.toCharArray();
	}

	public static void shift(char[] message, int shiftFaktor) {
		for (int i = 0; i < message.length; i++) {
			int berechnung = (int) (message[i]) + shiftFaktor;
			message[i] = (char) (berechnung);
		}
	}

	public static int getCommand() {
		while (true) {
			String input = IOTools.readString("shift oder exit eingeben: ");
			if (input.equalsIgnoreCase("shift")) {
				return 0;
			} else if (input.equalsIgnoreCase("exit")) {
				return 1;
			}
		}
		
	}
}
