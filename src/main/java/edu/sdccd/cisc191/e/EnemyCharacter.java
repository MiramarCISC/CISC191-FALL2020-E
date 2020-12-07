package edu.sdccd.cisc191.e;

public class EnemyCharacter extends Character {

	
	public EnemyCharacter(String name) {
		super(name);
	}

	public EnemyCharacter(String name, int health) {
		super(name, health);
	}
	
	public void makeMove() {
		if (BattleController.player.getHealth() > BattleController.player.getHealth() * 4 / 5 && BattleController.player.getStatus().equals("")) {
			MoveList.makeMove(this, BattleController.player, "poison1");
			BattleController.enemyMoveMade("poison1");
		}
		else if (this.health < this.health / 5) {
			MoveList.makeMove(this, BattleController.player, "heal1");
			BattleController.enemyMoveMade("heal1");
		}
		else {
			MoveList.makeMove(this, BattleController.player, "attack1");
			BattleController.enemyMoveMade("attack1");
		}
	}

	
}
