package task6.task6_demo;





public class app_demo {
	
	    public static void main(String[] args) 
	    {
	    	App<Integer> list = new App<Integer>();
	 
	        //Add elements
	        list.add(2);
	        list.add(3);
	        list.add(4);
	        System.out.println(list);
	         
	        //Remove elements from index
	        list.remove(1);
	        System.out.println(list);
	         
	        //Get element with index
	        System.out.println( list.get(0) );
	        System.out.println( list.get(1) );
	 
	        //List Size
	        System.out.println(list.size());
	    }
	}