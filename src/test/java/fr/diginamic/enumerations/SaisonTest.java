package fr.diginamic.enumerations;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SaisonTest {

	@Test
	public void testValueOfLibelle() {
		String Saison[] = new [4];
		
		List<Saison> saisons = new ArrayList<>();
		Saison.add(new Saison("Printemps"));
		Saison.add(new Saison("Ete"));
		Saison.add(new Saison("asutomne"));
		Saison.add(new Saison("hiver"));
		
		int resultat = Saison.eval("hiver");
		assertNull("hiver",resultat);
	}

	

}
