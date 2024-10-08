package personnages;

public class Village {
	private String nom;
	private Chef chef;
	private Gaulois[] villageois;
	private int nbVillageois = 0;
	
	public Village(String nom, int nbVillageoisMaximum) {
		this.nom = nom;
		this.villageois = new Gaulois[nbVillageoisMaximum];
	}
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	public String getNom() {
		return nom;
	}
	public void ajouterHabitant(Gaulois gaulois) {
		villageois[nbVillageois] = gaulois;
		nbVillageois += 1;
	}
	
	public Gaulois trouverHabitant(int numero) {
		return villageois[numero];
	}
	public static void main(String[] args) {
		Village village = new Village("Village des Irreductibles",30);
		Chef abra = new Chef("Abraracourcix",6,village);
		Gaulois asterix = new Gaulois("Asterix",8);
		village.ajouterHabitant(asterix);
		
	}
}
