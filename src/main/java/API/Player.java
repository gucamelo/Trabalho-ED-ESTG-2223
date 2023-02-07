package API;

import org.json.simple.JSONObject;

public class Player {
	protected String name;
	protected long level;
	protected String team;
	protected double exp;
	protected double energy;
	protected long totalEnergy;
	protected long id;
	protected double latitude;
	protected double longitude;
	protected long conqueredPortals;

	public Player(String name, long id) {
		this.name = name;
		this.level = 1;
		this.team = "None";
		this.exp = 0;
		this.energy = 100;
		this.totalEnergy = 100;
		this.id = id;
		this.conqueredPortals = 0;
	}

	public Player(String name, String team, long id) {
		this.name = name;
		this.level = 1;
		this.team = team;
		this.exp = 0;
		this.energy = 100;
		this.totalEnergy = 100;
		this.id = id;
		this.conqueredPortals = 0;
	}

	public Player(String name, long level, String team, double exp, double energy, long totalEnergy, long id, double latitude, double longitude, long conqueredPortals) {
		this.name = name;
		this.level = level;
		this.team = team;
		this.exp = exp;
		this.energy = energy;
		this.totalEnergy = totalEnergy;
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.conqueredPortals = conqueredPortals;
	}

	public void levelUp() {
		this.level++;
		this.totalEnergy += 10;
		this.exp = 0;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public double getLatitude() {
		return this.latitude;
	}

	public double getLongitude() {
		return this.longitude;
	}

	public void gainExp() {
		this.exp += Math.pow((this.level/0.07), 2);
		if (this.exp >= 100) {
			levelUp();
		}
	}

	public void setConqueredPortal() {
		this.conqueredPortals++;
	}

	public long getConqueredPortal() {
		return this.conqueredPortals;
	}

	public String getName() {
		return this.name;
	}

	public long getLevel() {
		return this.level;
	}

	public long getId() {
		return this.id;
	}
	public String getTeam() {
		return this.team;
	}

	public double getExp() {
		return this.exp;
	}

	public double getEnergy() {
		return this.energy;
	}

	public long getTotalEnergy() {
		return this.totalEnergy;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public void loadEnergy(double energy) {
		this.energy += energy;
		if (this.energy > this.totalEnergy) {
			this.energy = this.totalEnergy;
		}
	}

	public void removeEnergy(double energy) {
		this.energy -= energy;
		if (this.energy < 0) {
			this.energy = 0;
		}
	}

	public JSONObject criarPlayerJSON() {
		JSONObject playerJSON = new JSONObject();
		playerJSON.put("id", this.getId());
		playerJSON.put("name", this.getName());
		playerJSON.put("team", this.getTeam());
		playerJSON.put("energy", this.getEnergy());
		playerJSON.put("latitude", this.getLatitude());
		playerJSON.put("longitude", this.getLongitude());
		return playerJSON;
	}
}
