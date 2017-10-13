# MyCompSciSpace
Storing Files
public class SalesCommission {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Double hours = 0;
		Double id = 0;
		Double pay = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Worker ID: ");
        id = input.nextDouble();

        if(id < 99999 || id > 999999){
            System.out.println("Id needs to be 6-digits.");
            System.exit(1);
        }
        System.out.println("Enter hours worked: ");
        hours  = input.nextDouble();
		
        if(hours <= 35){
        	pay = 10*hours;
        }else if(hours > 35 && hours <= 60){
        	pay = 15*hours;
        }else if(hours > 60){
        	pay = 20*hours;
        }
		
        System.out.println("The ID is ");
	}

}
