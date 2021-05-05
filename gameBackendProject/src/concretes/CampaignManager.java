package concretes;

import abstracts.CampaignService;
import entities.Campaign;

public class CampaignManager implements CampaignService{

	@Override
	public void campaignStart(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasi basladi.");
		
	}

	@Override
	public void campaignFinish(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasi sonlandi.");
		
	}

	@Override
	public void campaignAdd(Campaign campaign) {
		System.out.println(campaign.getCampaignName()+" kampanyasi eklenmistir.");
		
	}


	
	
	
}
