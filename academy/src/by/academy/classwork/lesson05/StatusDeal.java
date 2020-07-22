package by.academy.classwork.lesson05;

public enum StatusDeal {
	NEW("New"), IN_PROGRESS("InProgress"), DONE("Done");

	private String status;

	private StatusDeal(String status) {
		this.status = status;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	// Override toString
}
