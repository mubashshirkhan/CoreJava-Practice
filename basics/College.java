class College
{
	public static void main(String[] args) 
	{
		Student s1			= new Student();
		s1.sno				= Integer.parseInt(args[0]);
		s1.sname			= args[1];
		s1.course			= args[2];
		s1.fee				= Double.parseDouble(args[3]);
		s1.email			= args[4];
		s1.mobile			= Long.parseLong(args[5]);
		s1.gender			= args[6].charAt(0);
		s1.studyingStatus	= Boolean.parseBoolean(args[7]);
		
		System.out.println("Number is: "+s1.sno);
		System.out.println("Name is: "+s1.sname);
		System.out.println("course is: "+s1.course);
		System.out.println("fee is: "+s1.fee);
		System.out.println("email is: "+s1.email);
		System.out.println("mobile is: "+s1.mobile);
		System.out.println("gender is: "+s1.gender);
		System.out.println("Studying status: "+s1.studyingStatus);
	}
}
