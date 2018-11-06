package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name="players")
@SecondaryTable(name="stats")
public class footballPlayer {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	@Column(name="OWNER")
	private String owner; 
	@Column(name="NAME")
	private String name;
	@Column(name="TEAM")
	private String team;
	//Secondary Table Columns
	@Column(table="stats")
	private String player =name;
	@Column(table="stats")
	private String playerNumber; 
	@Column(table="stats")
	private String playerPosition;
	@Column(table="stats")
	private String playerRanking;
	

	//Constructors
	public footballPlayer() {

	}
	
	public footballPlayer(String owner, String name, String team) {
		this.owner = owner;
		this.name = name;
		this.team = team;
	}
		
	//Table One's getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

 	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	//Table Two's getters and setters
	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getPlayerNumber() {
		return playerNumber;
	}

	public void setPlayerNumber(String playerNumber) {
		this.playerNumber = playerNumber;
	}

	public String getPlayerPosition() {
		return playerPosition;
	}

	public void setPlayerPosition(String playerPosition) {
		this.playerPosition = playerPosition;
	}

	public String getPlayerRanking() {
		return playerRanking;
	}

	public void setPlayerRanking(String playerRanking) {
		this.playerRanking = playerRanking;
	}

	@Override
	public String toString() {
		return "ListTeam [id=" + id + ", name=" + name + ", team=" + team + "]";
	}
	
	public String returnTeamDetails() {
		return "[Athlete/Team/Owner] " + name + ": " + team + ": " + owner;
	}
}