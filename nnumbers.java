import java.io.*;
import java.util.*;

class GFG {
	public static void main (String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int n=sc.nextInt();
	   int a[]=new int[n];
	   for(int i=0;i<n;i++)
	   a[i]=sc.nextInt();
	   Arrays.sort(a);
	   int c=0,cou=0,val=0,pos=0;
	   String str=null;
	   for(int i=0;i<n;i++)
	   {
	     loop:  for(int j=i+1;j<n;j++)
	       {
	           if(a[i]==a[j])
	           {
	           c++;
	           val=a[i];
	           pos=j;
	           }
	           else
	           {
	          // System.out.println(a[i]);
	            cou++;
	            break loop;
	           }
	       }
	       if(c>0)
	       {
	       System.out.print(val+" ");
	       i=pos;
	       c=0;
	       }
	   }
	   if((cou+1)==n)
	       System.out.println("unique");
	    
	}
}
