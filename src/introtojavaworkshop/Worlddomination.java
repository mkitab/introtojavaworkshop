package introtojavaworkshop;

	import javax.swing.JOptionPane;

		public static void main(String[] args) {
			// 1. Ask the user if they know how to write code.
			String s1="yes";
			String s2=JOptionPane.showInputDialog(null, "do u know how to code?");
			// 2. If they say "yes", tell them they will rule the world.
			if (s2.equals(s1)) {
				System.out.println("MUHAHAHAH YOU RULE THE PLANET!");
			} else {
				System.out.println("GOOD LUCK WASHING DISHES YOU FOOL!");

			// 3. Otherwise, wish them good luck washing dishes.



