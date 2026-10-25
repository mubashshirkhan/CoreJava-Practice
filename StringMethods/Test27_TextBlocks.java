
import java.util.stream.Stream;

public class Test27_TextBlocks {
	public static void main(String[] args) {
		
		String s1 = " one line text ";

		/*
		String address =
				"Door num: 123,
				 Flat num: 101,
				 Apt Name: Java World,
				 Location: Ameerpet,
				 City: Hyderabad,
				 State: TG,
				 PIN: 500016";
		*/		

		String address =
				"Door num: 123," 			+
				"Flat num: 101,"			+
				"Apt Name: Java World,"		+
				"Location: Ameerpet,"		+
				"City: Hyderabad,"			+
				"State: TG,"				+
				"PIN: 500016"				;
		
		System.out.println(address);
		System.out.println();
		
		address =
				"Door num: 123,\n" 			+
				"Flat num: 101,\n"			+
				"Apt Name: Java World,\n"	+
				"Location: Ameerpet,\n"		+
				"City: Hyderabad,\n"		+
				"State: TG,\n"				+
				"PIN: 500016"				;
		
		System.out.println(address);
		System.out.println();
		
		address =
				"""
				Door num: 123,
				Flat num: 101,
				Apt Name: Java World,
				Location: Ameerpet,
				City: Hyderabad,
				State: TG,
				PIN: 500016
				""";
		
		System.out.println(address.toUpperCase());
		
		//address = """ text """;
		
		address = 
				"""
					text
				""";
		System.out.println(address);
		
		address = 
				"""
				""";
		System.out.println(address);
		
		address = 
				"""
				"
				""";
		System.out.println(address);
		
		address = 
				"""
				\"
				""";
		System.out.println(address);
	/*	
		address = 
				"""
				"""
				""";
		System.out.println(address);
	*/
		
	
		address =
				"""
				Door num: 123,
				Flat num: 101,
				Apt Name: Java World,
				Location: Ameerpet,
				City: Hyderabad,
				State: TG,
				PIN: 500016
				""";
		
		Stream<String> lines = address.lines();
		lines.forEach(line -> System.out.println(line));
		System.out.println();
		
		lines = address.lines();
		lines.forEach(line -> System.out.println(line.toUpperCase()));
		System.out.println();
		
		lines = address.lines();
		lines.filter(line -> !line.contains("Location"));
				.forEach(line -> System.out.println(line.toUpperCase()));

