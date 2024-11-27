public class Main {
  public static void main(String[] args) {
     // Criação de filmes
     Movie movie1 = new Movie("The Lion King", Movie.CHILDRENS);
     Movie movie2 = new Movie("Avengers: Endgame", Movie.NEW_RELEASE);
     Movie movie3 = new Movie("Inception", Movie.REGULAR);

     // Criação de aluguéis
     Rental rental1 = new Rental(movie1, 4);
     Rental rental2 = new Rental(movie2, 2);
     Rental rental3 = new Rental(movie3, 5);

     // Criação de cliente
     Customer customer = new Customer("John Doe");

     // Adicionando aluguéis ao cliente
     customer.addRental(rental1);
     customer.addRental(rental2);
     customer.addRental(rental3);

     // Gerando relatórios
     System.out.println(customer.statement()); // Relatório texto
     System.out.println(customer.htmlStatement()); // Relatório HTML
  }
}