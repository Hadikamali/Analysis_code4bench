import java.util.Scanner;
import java.io.File; 
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;
import java.util.Arrays;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.math.*;
public class subarrays
{
	public int gcd(int x,int y)
        {
           // int high=y-1;
        	if(y==0)
        	{
        		return x;
        	}	
        	int c;
        	int r;
          if(x<y && x==y)
          {
          	c=x;
          	x=y;
          	y=c;
          }
            r=x%y;
          	return gcd(y,r);
         }
         public boolean comparearrays(int []a,int []b,int c,int d,int e,int f)
         {
         	int gj=5;
         	for(int t=0;t<d;t++)
         	{
         		gj=1;
         		if(a[(t+c)%f]<=b[t%e])
         		{
         			gj=0;
         		}
         		else
         		{
         			break;
         		}
         	}
         	if(gj==0)
         	{
         		return true;
         	}
         	else
         	{
         		return false;
         	}
         }
	public static void main(String[] args) 
    {  

    	Scanner scan = new Scanner(System.in);
    	int n=scan.nextInt();
    	int[] count = new int[n];
    	subarrays fg = new subarrays();
    	int i=0;
    	while(i<n)
    	{
    		count[i++]=scan.nextInt();
    	}
	    int k;
	    int l;
	    int m;
	    int lcm;
	    int []sub;
	    int q=0;
	    boolean u;
    	for(l=0;l<n;l++)
    	{	
    		for(m=1;m<n;m++)
    		{
    			sub=new int[m];
    			for(int j=l;j<l+m;j++)
    			{
    				sub[j-l]=count[j%n];
    			}
    			k=fg.gcd(m,n);
    			lcm=(m*n)/k;
    			u=fg.comparearrays(count,sub,l,lcm,m,n);
    			if(u==true)
    			{
    				q++;

    			}

    		}
    	}
    	System.out.println(q);
    }
}