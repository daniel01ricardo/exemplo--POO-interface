package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
	public static void main(String[] args) {
		EquipamentoMultifuncional em = new EquipamentoMultifuncional();
		
		Digitalizadora digitalizadora = em;
		Copiadora copiadora = em;
/*		Impressora impressora = em; */
		Impressora impressora = new Deskjet(); //Ou new Laserjet // ou ate mesmo o EquipamentoMultifuncional
		
		impressora.imprimir();
		digitalizadora.digitalizar();
		copiadora.copiar();
		
	}
}
