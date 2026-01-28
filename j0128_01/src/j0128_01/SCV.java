package j0128_01;

public class SCV extends GroundUnit implements Repairable {
	SCV(){
		super(60);
		hitPoint = MAX_UP;
	}
	
	void repair(Unit r) {
		if(r instanceof Unit) {
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_UP) {
				u.hitPoint++;
			}
			System.out.println("체력충전완료");
		}
		
	}
	
	
	
	
	
	
}
