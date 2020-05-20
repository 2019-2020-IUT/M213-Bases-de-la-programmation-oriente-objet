package TD10.pokemon;

enum Type {
	
	EAU("EAU"),
	ELECTRIK("ELECTRIK"),
	FEU("FEU"),
	PLANTE("PLANTE");

	Type(String s) {
		description = s;
	}

	private String description;

	public String getDescription() {
		return description;
	}
}
