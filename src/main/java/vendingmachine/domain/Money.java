package vendingmachine.domain;

public class Money {
	private int money;

	public Money(int money) {
		this.money = money;
	}

	public int getMoney() {
		return money;
	}

	public void reduce(final int amount) {
		money -= amount;
	}

}
