package src.copy;
import java.util.ArrayList;
import java.util.List;


public class RpnCalculator {
	

	public double simpleAdd(String arr) {
		// TODO Auto-generated method stub
		
		        List<Double> numbersList = new ArrayList<Double>();
		       
		       List<String> newList = new ArrayList<String>();
		       //newList.add(
		       
		        String[] temp = arr.split(",");
		        double calVal=0;
		        //char match[]={'(',')','=',';','{','}','[',']','+','-','*','/','&','!','%','^','|','<','>'}; 
		        for(String a: temp)
		        {
		            if(!(a.equals("+")|| a.equals("-")|| a.equals("/")|| a.equals("!")|| a.equals("*") ||a.equals("^") ||a.equals("%")))
//		                    (!a.matches("[()=;{}[\\]+\\-*/&!%^|<>]"))
//		                    
		            {
		                System.out.println(a.equals("+"));
		               numbersList.add(Double.parseDouble(a));
		               newList.add((a));
		                
		            }
//		            else
		            else 
		            {
		                if (numbersList != null && !numbersList.isEmpty()) {
		                    
		                    double lastVal=numbersList.get(numbersList.size()-1);
		                    System.out.println("Lastval"+lastVal);
		                    double lastbefore= numbersList.get(numbersList.size()-2);
		                    System.out.println("lastbefor"+lastbefore);
		                    if(a.equals("+"))
		                    {
		                         calVal = lastbefore+lastVal;
		                    }
		                    if(a.equals("-"))
		                    {
		                         calVal = lastbefore-lastVal;
		                    }
		                    if(a.equals("*"))
		                    {
		                         calVal = lastbefore*lastVal;
		                    }
		                    if(a.equals("/"))
		                    {
		                         calVal = lastbefore/lastVal;
		                    }
//		                    if(a.equals("!"))
//		                    {
//		                        int calVal = lastVal!;
//		                    }
		                     if(a.equals("%"))
		                    {
		                         calVal = lastbefore % lastVal;
		                    }
		                      if(a.equals("^"))
		                    {
//		                         calVal = (lastbefore)^(lastVal);
		                    }
		                    System.out.println("numberlist size"+numbersList.size());
		                    System.out.println("numberlist"+numbersList);
		                    numbersList.remove(numbersList.size()-1);
		                   numbersList.remove(numbersList.size()-1);
		                    numbersList.add(calVal);                  
		}
		               
		            }
//		            else{}
		             
		        }
		        System.out.println("List"+numbersList.get(0));
		       // return numbersList;
		        
		        return numbersList.get(0);
		         
		    
		
	}
	    

	
	
	

}
