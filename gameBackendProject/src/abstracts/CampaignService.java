package abstracts;

import entities.Campaign;

public interface CampaignService {
	
	void campaignStart(Campaign campaign);
	void campaignFinish(Campaign campaign);
	void campaignAdd(Campaign campaign);
	
}
