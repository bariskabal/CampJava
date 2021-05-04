package Concrete;

import java.time.LocalDate;

import Abstract.OrderService;
import Entities.Concrete.Campaign;
import Entities.Concrete.Customer;
import Entities.Concrete.Game;
import Entities.Concrete.Order;

public class OrderManager implements OrderService {

	@Override
	public void add(final Order order) {
		System.out.println(order.getId() + "sipariş eklendi.");
	}

	@Override
	public void buy(final Customer customer, final Game game, final Campaign campaign) {
		System.out
				.println(
						customer.getFirstName() + " " + customer.getLastName() + " isimli kullanıcı, " + game.getName()
								+ " oyununu "
								+ (campaign != null ? campaign.getName() + " kampayasındaki %" + campaign.getDiscount()
										+ " indirim ile " + game.getPrice() * (100 - campaign.getDiscount()) / 100
										: game.getPrice())
								+ " fiyatı üzerinden satın aldı.");

		final Order order = campaign != null
				? new Order(1, customer.getId(), game.getId(), campaign.getId(), LocalDate.now())
				: new Order(1, customer.getId(), game.getId(), LocalDate.now());
		add(order);
	}

}