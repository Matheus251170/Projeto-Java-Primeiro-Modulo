package ProjetoModulo1;

import java.util.*;

public class Verificação {
	public static void main(String[] args) {
	
		String[] livrosDrama = {"O menino do pijama listrado","Apocalipse","Covid"};
		List<String> list1 = new ArrayList<String>();
		
		for(String x: livrosDrama)
			list1.add(x);
		
		String[] livrosComedia = {"Uma comedia nada romantica","O todo poderoso"};
		List<String> list2 = new ArrayList<String>();
		
		for(String y: livrosComedia)
			list2.add(y);
		
		/*for(int i=0;i<list1.size();i++) {
			System.out.printf("\n"+list1.get(i));
		}
		*/
		Collections.sort(list1);
		list1.forEach(list ->{System.out.println(""+list);});

		
	}
	

}
