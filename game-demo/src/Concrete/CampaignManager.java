package Concrete;

import Abstract.CampaignService;
import Entities.Concrete.Campaign;

public class CampaignManager implements CampaignService {

	@Override
	public void add(final Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� eklendi.");
	}

	@Override
	public void delete(final Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� silindi.");

	}

	@Override
	public void update(final Campaign campaign) {
		System.out.println(campaign.getName() + " kampanyas� g�ncellendi.");
	}

}
