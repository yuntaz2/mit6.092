public class CreditCard {
	String cardNumber = "myCardNumber";
	double expenses = 114514.1919;
	void charge(double amount) {
		expenses = expenses + amount;
	}
String getCardNumber(String passwd) {
		if (passwd.equals("Secret!")) {
			return cardNumber;
		}
		return "intruder";
	}
}	
