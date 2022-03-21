package com.te.learn.basics;

public class Human {
	private String humanName;
	private int humanAge;
	private int humanHeight;
	private double humanWeight;
	private Address address;

	public Human() {
		super();
	}

	public Human(String humanName, int humanAge, int humanHeight, double humanWeight) {
		super();
		this.humanName = humanName;
		this.humanAge = humanAge;
		this.humanHeight = humanHeight;
		this.humanWeight = humanWeight;
	}

	public String getHumanName() {
		return humanName;
	}

	public void setHumanName(String humanName) {
		this.humanName = humanName;
	}

	public int getHumanAge() {
		return humanAge;
	}

	public void setHumanAge(int humanAge) {
		if (humanAge < 0) {
			System.out.println("Age cant be below zero");
		} else {
			this.humanAge = humanAge;
		}
	}

	public int getHumanHeight() {
		return humanHeight;
	}

	public void setHumanHeight(int humanHeight) {
		if (humanHeight < 30) {
			System.out.println("Height cant be below 30 cm");
		} else {
			this.humanHeight = humanHeight;
		}
	}

	public double getHumanWeight() {
		return humanWeight;
	}

	public void setHumanWeight(double humanWeight) {
		if (humanWeight < 3) {
			System.out.println("Weight cant be below 3kg!");
		}
		this.humanWeight = humanWeight;
	}

	public Address createAddressObj() {
		return new Address();

	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Human [humanName=" + humanName + ", humanAge=" + humanAge + ", humanHeight=" + humanHeight
				+ ", humanWeight=" + humanWeight + ", address=" + address + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 20;
		int result = 10;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + humanAge;
		result = prime * result + humanHeight;
		result = prime * result + ((humanName == null) ? 0 : humanName.hashCode());
		result = prime * result + (int) (humanWeight);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Human other = (Human) obj;
		if (this.humanAge == other.humanAge && this.humanHeight == other.humanHeight
				&& this.humanName.equals(other.humanName) && this.humanWeight == other.humanWeight) {
			return true;
		} else
			return false;

	}

}
