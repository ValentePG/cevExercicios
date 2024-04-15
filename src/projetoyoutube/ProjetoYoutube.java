package projetoyoutube;

import domain.Gafanhoto;
import domain.Video;
import domain.Visualizacao;

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
		
		Visualizacao vis[] = new Visualizacao[5];
		
		vis[0] = new Visualizacao(g[0], v[2]);
		vis[0].avaliar();
		System.out.println(vis[0].toString());
		
		vis[1] = new Visualizacao(g[0], v[1]);
		vis[1].avaliar(87.0f);
		System.out.println(vis[1].toString());
		
		
	}

}
