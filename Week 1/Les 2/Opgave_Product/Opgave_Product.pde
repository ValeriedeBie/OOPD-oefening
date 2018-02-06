//void setup() {
//  String[][] producten = { {"pc", "500"},
//                           {"mac", "2000"} };

//  for(int i = 0; i<producten.length; i++){
//    println(producten[i][0] + " kost: " + producten[1][i] + " euro");
//  }

//}

class Product {
  String naam;
  int prijs;

  Product (String productNaam, int productPrijs) {
    this.naam = productNaam;
    this.prijs = productPrijs;
  }
}

void setup() {
    Product product1 = new Product("pc", 500);
    Product product2 = new Product("mac", 2000);

    Product[] productInformatie = {product1, product2};

    for (int i = 0; i<productInformatie.length; i++) {
      println(productInformatie[i].naam + " kost: " + productInformatie[i].prijs);
    }
  }

  //String[] printProducten(Product[] productInformatie){
  //  String[] printProduct = new String[Product.length];
  //  for(int i = 0; i<productInformatie.length; i++){
  //    productInformatie[i]
  //    println(productInformatie[i]);
  //  }
  //}