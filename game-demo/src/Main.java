import java.time.LocalDate;
import Adapters.MernisServiceAdapter;
import Concrete.CampaignManager;
import Concrete.CustomerManager;
import Concrete.GameManager;
import Concrete.OrderManager;
import Entities.Concrete.Campaign;
import Entities.Concrete.Customer;
import Entities.Concrete.Game;



public class Main {

	public static void main(final String[] args) throws Exception {
		
		final CustomerManager customerManager = new CustomerManager(new MernisServiceAdapter());
		final Customer customer = new Customer(1, "bariskabal12@gmail.com", "1234", "muhammet Barýþ", "Kabal",
				"bariskabal12", LocalDate.of(1998, 7, 19), "10811924938");
		customerManager.add(customer);

		final GameManager gameManager = new GameManager();
		final Game game = new Game(1, "lol", 10.00);
		gameManager.add(game);

		final CampaignManager campaignManager = new CampaignManager();
		final Campaign campaign = new Campaign(1, "Öðrenci", (byte) 10, true);
		campaignManager.add(campaign);

		final OrderManager orderManager = new OrderManager();
		orderManager.buy(customer, game, campaign);

	}

}
