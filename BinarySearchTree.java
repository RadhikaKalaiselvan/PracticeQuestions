package CCI;
public class BinarySearchTree<T>  {
	//private static Node<String> root;
	private static Node<Integer> root;
public static void main(String[] args){
	//BinarySearchTree<String> bst=new BinarySearchTree<String>();
	//String ele[]={"c","a","b","f","d","e"};
	BinarySearchTree<Integer> bst=new BinarySearchTree<Integer>();
	//Integer ele[]={5,2,4,6,1,8,3};
	Integer ele[]={1,2,3,4,5,6,7,8,9,10};
	//root=bst.createBTTree(ele,0,ele.length-1);
	for(int i:ele){
		root=bst.insert(root, i);
	}
	System.out.println(" print");
	bst.print(root);
    //System.out.println(bst.findMin(root).data);
    bst.delete(root,5);
    bst.print(root);
    System.out.println("Find max depth :"+bst.maxDepth(root));
}

public Node<T> createBTTree(T[] ele,int start,int end){

	if(end<start){
	return null;
}
int mid=(start+end)/2;
Node<T> n=new Node<T>();
n.data=(Comparable<T>) ele[mid];
n.left=createBTTree(ele,start,mid-1);
n.right=createBTTree(ele,mid+1,end);
return n;
}

public Node<T> insert(Node<T> t,T i){
if(t==null){
 	Node<T> n=new Node<T>();
 	n.data=(Comparable<T>) i;
    return n;
}else if(t.data.compareTo(i)>0){
		t.left=insert(t.left,i);
	} else {
		t.right=insert(t.right,i);
		} 
return t;
}

public void print(Node<T> root){
	if(root!=null){
		print(root.left);
		System.out.println(root.data);
		print(root.right);
	}
}
public Node<T> findMin(Node<T> t){
	if(t==null){
		return null;
	} else if(t.left==null){
			return t;
		} 
			return findMin(t.left);
}

public Node<T> delete(Node<T> t,T data){
	if(t==null){
		t=null;
	}else if (t.data.compareTo(data)<0){
		t.right=delete(t.right,data);
	}else if(t.data.compareTo(data)>0){
		t.left=delete(t.left,data);
	} else if (t.left!=null && t.right!=null){
		T min=(T) findMin(t.right).data;
		t.data=(Comparable<T>) min;
		t.right=delete(t.right,(T)min);
	} else {
		t= (t.left!=null)?t.left:t.right;
}
return t;
} 

public Node<T> findMax(Node<T> d){
	if(d==null){
		return null;
	} else if (d.right==null){
		return d;
	}
	return findMax(d.right);	
}

public int maxDepth(Node<T> n){
 if(n==null){
	 return 0;
 } else {
	 return Math.max(maxDepth(n.left), maxDepth(n.right))+1;
 }
}
}


