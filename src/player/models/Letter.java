package player.models;

public class Letter {
	String s;
	
	/**
	 * Get the string
	 * @return String
	 */
	public String getS() {
		return s;
	}

	/**
	 * Setter
	 */
	public void setS(String s) {
		this.s = s;
	}

	/**
	 * Constructor
	 * @param  s String
	 */
	public Letter(String s){
		this.s = s;
	}
	
	/**
	 * Assign score for each letter
	 * @return int
	 */
	public int getScore(){
		if (s == "e" || s == "t"){
			return 1;
		}
		
		else if (s == "a" || s == "o"|| s == "i"|| s == "n"|| s == "h"|| s == "s"|| s == "r"){
			return 2;
		}
		
		else if (s == "f"|| s == "g"|| s == "y"|| s == "p"|| s == "b"){
			return 4;
		}
		
		else if (s == "v" || s == "k"){
			return 5;
		}
		
		else if (s == "j" || s == "x"){
			return 7;
		}
		
		else if (s == "q" || s == "z"){
			return 8;
		}
		
		else if (s == "qu"){
			return 11;
		}

		else {
			return 3;
		}
	}

	public boolean isEmptyString() {
		return this.s == "";
	}

	public void setStringEmpty() {
		this.s = "";
	}
}
