package services.interfaces;

import java.util.List;

import javax.ejb.Local;

import entities.Reward;

@Local
public interface RewardServicesLocal {
Boolean addreward(Reward reward);
	
	Boolean deleterewardById(Integer id);

	Reward findrewardById(Integer id);

	Boolean updatereward(Reward reward);

	Boolean deletereward(Reward reward);

	List<Reward> findAllReward();
}
