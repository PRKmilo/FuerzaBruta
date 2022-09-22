package co.edu.unbosque.model;

public class Model {
	 
	
	
	
	
	
	public void kmp(String text, String patron) {
		
	
		if (patron == null || patron.length() == 0)
		{
			System.out.println("The pattern occurs with shift 0");
			return;
		}

	
		if (text == null || patron.length() > text.length())
		{
			System.out.println("Pattern not found");
			return;
		}

		char[] chars = patron.toCharArray();

		// next[i] stores the index of the next best partial match
		int[] next = new int[patron.length() + 1];
		for (int i = 1; i < patron.length(); i++)
		{
			int j = next[i + 1];

			while (j > 0 && chars[j] != chars[i]) {
				j = next[j];
			}

			if (j > 0 || chars[j] == chars[i]) {
				next[i + 1] = j + 1;
			}
		}

		for (int i = 0, j = 0; i < text.length(); i++)
		{
			if (j < patron.length() && text.charAt(i) == patron.charAt(j))
			{
				if (++j == patron.length()) {
					System.out.println("The pattern occurs with shift " + (i - j + 1));
				}
			}
			else if (j > 0)
			{
				j = next[j];
				i--;
			}
		}
	}


}
