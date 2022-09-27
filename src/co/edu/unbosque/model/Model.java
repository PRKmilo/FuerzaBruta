package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class Model {


	public ArrayList<Integer> kmp(String text, String patron) {
        ArrayList <Integer> p =new   ArrayList <Integer>();
		int cont = 0;
		if (patron == null || patron.length() == 0) {
			System.out.println("The pattern occurs with shift 0");
			p.add(0);
			cont++;
			
		}

		if (text == null || patron.length() > text.length()) {
			System.out.println("Pattern not found");
			System.out.println("cont " + cont);
		
		}

		char[] chars = patron.toCharArray();

		int[] next = new int[patron.length() + 1];
		for (int i = 1; i < patron.length(); i++) {
			int j = next[i + 1];

			while (j > 0 && chars[j] != chars[i]) {
				j = next[j];
			}

			if (j > 0 || chars[j] == chars[i]) {
				next[i + 1] = j + 1;
			}
		}

		for (int i = 0, j = 0; i < text.length(); i++) {
			if (j < patron.length() && text.charAt(i) == patron.charAt(j)) {
				if (++j == patron.length()) {
					System.out.println("The pattern occurs with shift " + (i - j + 1));
					
					p.add(i-j+1);
					cont++;
				}
			} else if (j > 0) {
				j = next[j];
				i--;
			}
		}

		System.out.println("cont es " + cont);
		
		return p;

	}

	public HashMap<Character, Integer> patron(String patron) {

		String p="*";
		HashMap<Character, Integer> guardar = new HashMap<Character, Integer>();
		guardar.put(p.charAt(0),patron.length());

		for (int i = 0; i < patron.length(); i++) {
			int max =Math.max(1, patron.length()-i-1);
			if (!guardar.containsKey(guardar.get(i))) {
				guardar.put(patron.charAt(i), max);
			} else {
				guardar.replace(patron.charAt(i), max);
			}
		}




		return guardar;
	}


	public ArrayList<Integer> boyerMoore(String text , String patron) {
		int count =0;
		int pos=count+(patron.length()-1);
		char[] chars = patron.toCharArray();
		char[] text1 = text.toCharArray();
		HashMap<Character, Integer>  mapa=patron(patron);
		
		
		ArrayList<Integer> lista=new ArrayList<Integer>();
		
		while(pos <= (text1.length-1)) {
			int sum=0;
			int inercount=0;
			int l=patron.length()-1;
			int j=pos;
			while(l>=0 && (text1[j] == chars[l])) {
				inercount++;
				l--;
				j--;
			}
			if(inercount != patron.length()) {
				sum =(mapa.get(text1[j]) == null)? patron.length(): mapa.get(text1[j]); 
			}else {
				
				sum = patron.length();
				System.out.println("esta es la pos");
				System.out.println(j+1);
				lista.add(j+1);
			}
			pos=pos+sum;
		}
		return lista;
		
		

	}


}




