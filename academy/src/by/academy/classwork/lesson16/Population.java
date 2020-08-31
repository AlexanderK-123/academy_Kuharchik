package by.academy.classwork.lesson16;

public enum Population {
	AMUR("Amur tiger"), BENGAL("Bengal tiger"), MALAY("Malay tiger"), SUMATRAN("Sumatranian tiger");

	private String population;

	private Population(String population) {
		this.population = population;
	}

	public String getValue() {
		return population;
	}
}
