class dateclass
{
	int d;
	int m;
	int y;
	
	dateclass(int d,int m,int y){
		this.d=d;
		this.m=m;
		this.y=y;
	}
}

class range
{
	dateclass date1;
	dateclass date2;
	
	range(dateclass date1,dateclass date2)
	{
		this.date1=date1;
		this.date2=date2;
	}
}

	public class DateOverlapping {

		public static void main(String args[]) {
			range ranges[]=new range[3];
			
			dateclass date1=new dateclass(1,9,2017);
			dateclass date2=new dateclass(5,10,2017);
			range range1=new range(date1,date2);
			
			dateclass date3=new dateclass(4,10,2017);
			dateclass date4=new dateclass(8,10,2017);
			range range2=new range(date3,date4);
			
			dateclass date5=new dateclass(12,12,2017); 
			dateclass date6=new dateclass(18,12,2017);
			range range3=new range(date5,date6);
			
			ranges[0]=range1;
			ranges[1]=range2;
			ranges[2]=range3;
			
			if(overlap(range1,range2)==true)
			{
				System.out.println("Ranges Overlapped");
				printrange(range1);
				printrange(range2);
			}
			
			if(overlap(range2,range3)==true)
			{
				printrange(range2);
				printrange(range3);
			}
			

		}
		static void printrange(range range1) {
			System.out.println((range1.date1.d+"-"+range1.date1.m+"-"+range1.date1.y+","+ range1.date2.d+"-"+range1.date2.m+"-"+range1.date2.y));
		}
		
		static boolean overlap(range range1,range range2)
		{
			boolean overlap=false;

			//beginPeriod1.isAfter(endPeriod2) 
			//beginPeriod2.isAfter(endPeriod1)
			if(comparedates(range2.date1,range1.date2)==1)// || comparedates(range1.date2,range2.date2)==1)
				overlap = false;
			else 
				overlap = true;
			//if(comparedates(range1.date1,range2.date2))
			
			return overlap;
		}
		
		static int comparedates(dateclass date1, dateclass date2)
		{
			int result=0; //0-equal | date1>date2 => 1 | date1<date2 => -1
			if(date1.y > date2.y)
				return 1;
			
			else if(date1.y < date2.y)
				return -1;
			
			else{ //if years equal
				
				if(date1.m > date2.m)
					return 1;
				else if(date1.m < date2.m)
					return -1;
				else { // if months also equal
					if(date1.d > date2.d)
						return 1;
					else if(date1.d < date2.d)
						return -1;
					else // ====> if both dates equal
						return 0;
						
				}
			}
			
			
		}
		
}
