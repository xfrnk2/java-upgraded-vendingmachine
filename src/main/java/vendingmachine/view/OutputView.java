package vendingmachine.view;

import java.util.Map;

import vendingmachine.domain.Coin;

public class OutputView {
	public static final String ERROR_PREFIX = "[ERROR] %s";
	public static final String HOLDING_COINS = "자판기가 보유한 동전";
	public static final String HOLDING_AMOUNT_REQUEST = "자판기가 보유하고 있는 금액을 입력해 주세요.";
	public static final String ENTER_PRODUCTS_REQUEST = "상품명과 가격, 수량을 입력해 주세요.";
	public static final String INSERT_MONEY_REQUEST = "투입 금액을 입력해 주세요.";
	public static final String ENTER_PRODUCT_NAME_TO_BUY_REQUEST = "구매할 상품명을 입력해 주세요.";
	public static final String COIN_AMOUNT_AND_NUMBER = "%d원 - %d개";
	public static final String CURRENT_MONEY = "투입 금액: %d원";
	public static final String CHANGES = "잔돈";

	public void printError(String error) {
		System.out.printf(ERROR_PREFIX, error);
		printNewLine();
	}

	private void printNewLine() {
		System.out.println();
	}

	public void printHoldingAmountRequest() {
		System.out.println(HOLDING_AMOUNT_REQUEST);
	}

	public void printHoldingCoins(Map<Coin, Integer> coins) {
		printNewLine();
		System.out.println(HOLDING_COINS);
		for (Map.Entry<Coin, Integer> coin : coins.entrySet()) {
			System.out.println(String.format(COIN_AMOUNT_AND_NUMBER, coin.getKey().getAmount(), coin.getValue()));
		}
	}

	public void printEnterProductsRequest() {
		printNewLine();
		System.out.println(ENTER_PRODUCTS_REQUEST);
	}

	public void printInsertMoneyRequest() {
		printNewLine();
		System.out.println(INSERT_MONEY_REQUEST);
	}

	public void printCurrentMoney(final int amount) {
		printNewLine();
		System.out.println(String.format(CURRENT_MONEY, amount));
	}

	public void printEnterProductNameToBuyRequest() {
		System.out.println(ENTER_PRODUCT_NAME_TO_BUY_REQUEST);
	}

	public void printChanges(Map<Coin, Integer> changes) {
		System.out.println(CHANGES);
		for (Map.Entry<Coin, Integer> coin : changes.entrySet()) {
			System.out.println(String.format(COIN_AMOUNT_AND_NUMBER, coin.getKey().getAmount(), coin.getValue()));
		}
	}
}
