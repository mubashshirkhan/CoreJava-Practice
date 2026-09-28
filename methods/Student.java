class Student 
{
	private int sno;
	private String sname;
	private static String institute;
	
	public void setsno(int sno){
		this.sno = sno;
	}
	public int getsno(){
		return sno;
	}
	public void setSname(String sname){
		this.sname = sname;
	}
	public String getSname(){
		return sname;
	}
	public static void setInstitute(String institute){
		Student.institute = institute;
	}
	public String getInstitute(){
		return institute;
	}
	public void display(){
		System.out.println("Institute\t:"+institute);
		System.out.println("sno\t\t:"+sno);
		System.out.println("sname\t\t:"+sname);
		
	}
}
