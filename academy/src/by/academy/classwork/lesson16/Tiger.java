package by.academy.classwork.lesson16;

public class Tiger extends Cat {

	private int maxSpeed;
	protected int lifetime;
	public int mass;

	public Tiger() {
		super();
	}

	public Tiger(int maxSpeed, int mass, int lifetime) {
		super();
		this.maxSpeed = maxSpeed;
		this.mass = mass;
		this.lifetime = lifetime;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getLifetime() {
		return lifetime;
	}

	public void setLifetime(int lifetime) {
		this.lifetime = lifetime;
	}

	public int getMass() {
		return mass;
	}

	public void setMass(int mass) {
		this.mass = mass;
	}

	@Override
	public void move() {
		System.out.println("Tiger run");
	}

	@Override
	public void voice() {
		System.out.println("AARRRRR!!!");
	}

	@Override
	public void eat() {
		System.out.println("Tiger eat");
	}

	private void smell() {
		System.out.println("Tiger smells the ");
	}

	private void chase() {

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + lifetime;
		result = prime * result + mass;
		result = prime * result + maxSpeed;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tiger other = (Tiger) obj;
		if (lifetime != other.lifetime)
			return false;
		if (mass != other.mass)
			return false;
		if (maxSpeed != other.maxSpeed)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Tiger [maxSpeed=" + maxSpeed + ", lifetime=" + lifetime + ", mass=" + mass + "]";
	}

}
