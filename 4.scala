object Main{
    def main(args:Array[String]):Unit =
    {

          var Cover_Price = 24.95;

          var discount = 0.4;

          var F50_ShippingCost = 3;

          var EachAd_Copy_ShippingCost = 0.75;

          var NoOfCopies = 60;

          var Total_BDiscount = NoOfCopies * Cover_Price * discount;

          var ShippingCost = F50_ShippingCost + (NoOfCopies-50)*EachAd_Copy_ShippingCost;

          var  Total_WholeSaleCost = ((Cover_Price*NoOfCopies) - Total_BDiscount) + ShippingCost;

          println("Total Book Discount  : "+Total_BDiscount);
          println("Shipping Cost : "+ShippingCost);
          println("Total Wholesale Cost For 60 Copies : "+Total_WholeSaleCost);

        

        
    

        







    }



}
