class QueueLinkedList<T>{
    Node front,rear;
    
    class Node{
        T data;
        Node next;
        
        Node(T val){
            this.data=val;
            this.next=null;
        }
    }
    
    QueueLinkedList(){
        front=null;
        rear=null;
    }
    
    void enqueue(T val){
        Node newNode = new Node(val);
        if(front==null){
            front=newNode;
            rear=newNode;
        }else{
            rear.next=newNode;
            rear=newNode;
        }
    }
    
    void dequeue(){
        if(front==null){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        front=front.next;
        if(front==null){
            rear=null;
        }
    }
    
    void elementAtFront(){
        if(front==null){
            throw new IndexOutOfBoundsException("queue is empty");
        }
        System.out.println(front.data);
    }
    
    void display(){
        Node temp=front;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}

public class Main
{
	public static void main(String[] args) {
		QueueLinkedList<Integer> q = new QueueLinkedList<Integer>();
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		q.display();
		System.out.println();
		q.dequeue();
		q.dequeue();
		q.display();
	}
}














