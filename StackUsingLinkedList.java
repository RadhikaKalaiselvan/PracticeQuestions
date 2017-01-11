import java.io.*;
import java.lang.*;
import java.util.*;
class Node {
Node next;
String data;
}
public class StackUsingLinkedList {
     static Node head=null;
    public static void main(String[] args) {
String proceed="p";
while(proceed!="q"){ 
Scanner sc=new Scanner(System.in);    
 System.out.println("Enter data item to push and - to pop and + to print , quit to quit ");   
 String input= sc.nextLine();
 switch(input) {
  case "+" :
        printElementFromStack();
        break;
  case "-" :
       pop();
        break;
  case "quit" :
        proceed="q";
        break;
  default:
    push(input);
    break; 
}
}
}

public static  void push(String data) {
 Node n=new Node();
 n.data=data;
 n.next=head;
 head=n;
}
public  static void pop() {
if(head!=null){
String data=head.data;
Node newhead=head.next;
head=null;
head=newhead;
System.out.println(" POP : "+data);
} else {
System.out.println("No more elements to pop");
}
}

public static void printElementFromStack(){
Node node=head;
while(node!=null){
System.out.println(node.data);
node=node.next;
}
}
}
