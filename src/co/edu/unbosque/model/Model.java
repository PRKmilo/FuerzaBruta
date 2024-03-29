package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.HashMap;



public class Model {

	/**
	 * En la funcion de abajo obtenemos un texto y una palabra
	 * comparamos la primera pocicion creamos un array para
	 * guardar coincidencias y comparamos asi trasladandonos un espacio 
	 * a la derecha.
	 * @param text
	 * @param patron
	 * @return
	 */
	public ArrayList<Integer> kmp(String text, String patron) {
        ArrayList <Integer> p =new   ArrayList <Integer>();
		int cont = 0;
		if (patron == null || patron.length() == 0) {
		
			p.add(0);
			cont++;
			
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
					
					
					p.add(i-j+1);
					cont++;
				}
			} else if (j > 0) {
				j = next[j];
				i--;
			}
		}

		
		
		return p;

	}
	/**
	 * Aqui creamos nustro diccionario de acuerdo a los patrones 
	 * enconstrados en el mismo patron para el texto
	 * @param patron
	 * @return
	 */
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

/**
 * En el metodo de abajo recibimos un texto y una palabra o 
 * patron y comparamos el texto desde la poscision de el tama�o
 * de la palabra y verificamos hacia atra si no coincide buscamos en el 
 * diccionario y el valor que nos bote seran las pocisiones a trasladarnos.
 * @param text
 * @param patron
 * @return
 */
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
			
				lista.add(j+1);
			}
			pos=pos+sum;
		}
		return lista;
		
		

	}


}




