package Epam6.com.CustumCollection;
import java.util.*;
import java.lang.*;
public class CustomList {
    public Object arr[];
    int index = 0;
    public CustomList() {
       arr=new Object[10];
    }
    public Object fetching(int ind) {
        if(ind <index) {
                return arr[ind];
         }
        else {
           throw new ArrayIndexOutOfBoundsException();
        }
    }
    public void adding(Object obj) {
    	if(arr.length-index<=6) resize();
    	      arr[index++]=obj;
    }
    public int size() {
    	    return index;
    }
    private void resize() {
    	arr = Arrays.copyOf(arr,arr.length*2);
    }
    public String toString() {
    	String s="[";
    	for(int i=0;i<index-1;i++) {
    	      s+=arr[i]+",";
    	}
    	s+=arr[index-1]+"]";
    	return s;
    }
    public Object remove(int ind){
    	if(ind < index) {
    		Object obj = arr[ind];
            arr[ind] = null;
            int tmp = ind;
            while(tmp < ind){
            arr[tmp] = arr[tmp+1];
            arr[tmp+1] = null;
            tmp++;
            }
            index--;
            return obj;
    	}
    	else {
    	  throw new ArrayIndexOutOfBoundsException();	
    	}
    }
}
