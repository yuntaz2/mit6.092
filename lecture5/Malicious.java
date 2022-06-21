public class Malicious {
	public static void main(String[] args) {
		maliciousMethod(new CreditCard());
		System.out.println("running ScopeReview test");
		ScopeReview test = new ScopeReview();
		test.scopeMethod(22);
	}
	static void maliciousMethod(CreditCard card) {
		card.expenses = 0;
		System.out.println(card.cardNumber);
		System.out.println(card.expenses);
	}
}
