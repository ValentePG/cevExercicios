package projetoyoutube;

import domain.Gafanhoto;
import domain.Video;

public class ProjetoYoutube {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Video v[] = new Video[5];
		
		v[0] = new Video("Aula 1 de POO");
		v[1] = new Video("Aula 2 de POO");
		v[2] = new Video("Aula 3 de POO");
		v[3] = new Video("Aula 4 de POO");
		v[4] = new Video("Aula 5 de POO");
		
		Gafanhoto g[] = new Gafanhoto[2];
		g[0] = new Gafanhoto("Gabriel", 23, "M", "Juba");
		g[1] = new Gafanhoto("João", 25, "M", "Joba");
		
		System.out.println(g[0].toString());
		System.out.println(g[1].toString());

		
		
		System.out.println(v[0].toString());
		System.out.println(v[1].toString());
		System.out.println(v[2].toString());
		System.out.println(v[3].toString());
		System.out.println(v[4].toString());
	}

}
