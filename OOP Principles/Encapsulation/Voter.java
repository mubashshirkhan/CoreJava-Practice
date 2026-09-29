class Voter 
{   
	private int vote;
	
	public void setVote(int vote) throws IllegalArgumentException 
	{
		if(vote < 18 || vote > 120 ){
			
			throw new IllegalArgumentException("please enter the age btn (18-120)");
		}
		
		this.vote = vote;
		
	}
	public int getVote(){
			return vote;
	}
}
