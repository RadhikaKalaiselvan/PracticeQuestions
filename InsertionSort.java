
public class InsertionSort {
	public static void main(String arg[]){
int a[]={7,5,3,9,2,8,1};
int temp;
for (int j=1;j<a.length;j++){
	temp=a[j];
	int i;
	for( i=j-1;i>=0 && temp<a[i]; i--){
		a[i+1]=a[i];
	}
   a[i+1]=temp;
}
for(int i=0;i<a.length;i++){
System.out.println(" sorted "+a[i]);
}	
}
	
}
