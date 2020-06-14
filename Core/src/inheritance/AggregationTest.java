package inheritance;

public class AggregationTest 
{
	String name;
	Card cardDetails; //Aggregation or has-A relationship or entity reference of AggregationTest Class
	
	public static void displayBankDetails(Card cardDetails)
	{
		System.out.println(" CardName:  " + cardDetails.getCardName() + " "
				         + " CardHolder: " + cardDetails.getCardHolder() + ""
				         + " CardNumber: " + cardDetails.getCardNumber() + ""
				         );
		
	}

	
	public static void main(String arg[])
	{
		Card cd  = new Card();
		cd.setCardName("Supriya");
		cd.setCardHolder("Debit");
		cd.setCardNumber(12345);
		
		displayBankDetails(cd);
	}
}
