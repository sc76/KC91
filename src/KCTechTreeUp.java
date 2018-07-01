import bwapi.Player;
import bwapi.Race;
import bwapi.UnitType;
import bwapi.UpgradeType;

public class KCTechTreeUp {

	Player myPlayer = MyBotModule.Broodwar.self();
	Race myRace = MyBotModule.Broodwar.self().getRace();
	
	public void techTreeupAgainstProtoss(){
		
		// sc76.choi 기본 Spawning Pool 테크 작성예정
		
		
		// sc76.choi 기본 Lair 테크
		// 고급 건물 생산을 너무 성급하게 하다가 위험에 빠질 수 있으므로, 최소 히드라리스크 12기 생산 후 건설한다
		if (myPlayer.completedUnitCount(UnitType.Zerg_Spawning_Pool) > 0
			&& myPlayer.completedUnitCount(UnitType.Zerg_Hatchery) > 0
			&& (myPlayer.completedUnitCount(UnitType.Zerg_Lair) == 0 && myPlayer.incompleteUnitCount(UnitType.Zerg_Lair) == 0)
		    && myPlayer.completedUnitCount(UnitType.Zerg_Hydralisk) >= 10
			&& myPlayer.allUnitCount(UnitType.Zerg_Lair) == 0
			&& BuildManager.Instance().buildQueue.getItemCount(UnitType.Zerg_Lair) == 0
			&& ConstructionManager.Instance().getConstructionQueueItemCount(UnitType.Zerg_Lair, null) == 0) 
		{
			// sc76.choi Hive 진행 중이면 Lair를 또 가면 안된다.
			if (myPlayer.allUnitCount(UnitType.Zerg_Hive) > 0 ||
				(myPlayer.completedUnitCount(UnitType.Zerg_Hive) + myPlayer.incompleteUnitCount(UnitType.Zerg_Hive)) > 0 ||
				BuildManager.Instance().buildQueue.getItemCount(UnitType.Zerg_Hive) > 0 ||
				ConstructionManager.Instance().getConstructionQueueItemCount(UnitType.Zerg_Hive, null) > 0
				)
			{
			}else{
				BuildManager.Instance().buildQueue.queueAsHighestPriority(UnitType.Zerg_Lair, true);
			}
		}
		
		// sc76.choi 빠른 Lair 테크(상황에 따라) 작성 예정
	}
	
	public void techTreeupAgainstZerg(){
		
		// sc76.choi 기본 Spawning Pool 테크 작성예정
		
		// sc76.choi 기본 Lair 테크
		// 고급 건물 생산을 너무 성급하게 하다가 위험에 빠질 수 있으므로, 최소 히드라리스크 12기 생산 후 건설한다
		if (myPlayer.completedUnitCount(UnitType.Zerg_Spawning_Pool) > 0
				&& myPlayer.completedUnitCount(UnitType.Zerg_Hatchery) > 0
				&& (myPlayer.completedUnitCount(UnitType.Zerg_Lair) == 0 && myPlayer.incompleteUnitCount(UnitType.Zerg_Lair) == 0)
			    && myPlayer.completedUnitCount(UnitType.Zerg_Hydralisk) >= 10
				&& myPlayer.allUnitCount(UnitType.Zerg_Lair) == 0
				&& BuildManager.Instance().buildQueue.getItemCount(UnitType.Zerg_Lair) == 0
				&& ConstructionManager.Instance().getConstructionQueueItemCount(UnitType.Zerg_Lair, null) == 0) 
			{
				// sc76.choi Hive 진행 중이면 Lair를 또 가면 안된다.
				if (myPlayer.allUnitCount(UnitType.Zerg_Hive) > 0 ||
					(myPlayer.completedUnitCount(UnitType.Zerg_Hive) + myPlayer.incompleteUnitCount(UnitType.Zerg_Hive)) > 0 ||
					BuildManager.Instance().buildQueue.getItemCount(UnitType.Zerg_Hive) > 0 ||
					ConstructionManager.Instance().getConstructionQueueItemCount(UnitType.Zerg_Hive, null) > 0
					)
				{
				}else{
					BuildManager.Instance().buildQueue.queueAsHighestPriority(UnitType.Zerg_Lair, true);
				}
			}
	
	}
	
	public void techTreeupAgainstTerran(){

		
		// sc76.choi 기본 Spawning Pool 테크 작성예정
		// sc76.choi 기본 Lair 테크
		// 고급 건물 생산을 너무 성급하게 하다가 위험에 빠질 수 있으므로, 최소 히드라리스크 12기 생산 후 건설한다
		if (myPlayer.completedUnitCount(UnitType.Zerg_Spawning_Pool) > 0
				&& myPlayer.completedUnitCount(UnitType.Zerg_Hatchery) > 0
				&& (myPlayer.completedUnitCount(UnitType.Zerg_Lair) == 0 && myPlayer.incompleteUnitCount(UnitType.Zerg_Lair) == 0)
			    && myPlayer.completedUnitCount(UnitType.Zerg_Hydralisk) >= 10
				&& myPlayer.allUnitCount(UnitType.Zerg_Lair) == 0
				&& BuildManager.Instance().buildQueue.getItemCount(UnitType.Zerg_Lair) == 0
				&& ConstructionManager.Instance().getConstructionQueueItemCount(UnitType.Zerg_Lair, null) == 0) 
			{
				// sc76.choi Hive 진행 중이면 Lair를 또 가면 안된다.
				if (myPlayer.allUnitCount(UnitType.Zerg_Hive) > 0 ||
					(myPlayer.completedUnitCount(UnitType.Zerg_Hive) + myPlayer.incompleteUnitCount(UnitType.Zerg_Hive)) > 0 ||
					BuildManager.Instance().buildQueue.getItemCount(UnitType.Zerg_Hive) > 0 ||
					ConstructionManager.Instance().getConstructionQueueItemCount(UnitType.Zerg_Hive, null) > 0
					)
				{
				}else{
					BuildManager.Instance().buildQueue.queueAsHighestPriority(UnitType.Zerg_Lair, true);
				}
			}
	
	}	
}
