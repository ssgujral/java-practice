package PriceDisplay;

class PriceDisplay
{
  public String getPriceLabel(String ItemName, Double Price)
  {
    return String.format("The price for item: %s is %.2f", ItemName, Price);
  }

  public static void main(String[] args) {
    
    PriceDisplay example = new PriceDisplay();
    example.getPriceLabel("Coffee machine", 15.99);


    //String ItemName = "Coffee machine";
    //Double DoublePrice = 15.99;

    //System.out.printf("The price of the item %s is %.2f\n", ItemName, DoublePrice);

  }
}