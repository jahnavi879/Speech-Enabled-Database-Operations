package intelliSQL;



import java.io.IOException;
import java.util.StringTokenizer;
 
public class First {
    public static void main(String a[])
    {
        String query = "select all from OSS";
        String[] query1 = new String[4];
       int k=0;
        
        StringTokenizer st = new StringTokenizer(query," ");
        
        while(st.hasMoreTokens())
        {
            System.out.println(st.nextToken());
            
        }
        
        while(st.hasMoreTokens() && k<4) 
        {
        	
        	query1[k] = st.nextToken();
        	k++;
        }
        
        for(int j=0;j<4;j++)
        {
        	System.out.println(query1[j]);
        }
        
        Resultset test = new Resultset();
        test.setInputFile("/home/onie/Documents/Minor-2/data_sets.xls");
        try {
			test.read();
		} catch (IOException e) {

			e.printStackTrace();
		}
        
        
      
    }
}

   
     
 