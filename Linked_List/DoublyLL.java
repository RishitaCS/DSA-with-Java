import java.util.Scanner;

class DNode<T>{
    T data;
    DNode<T> prev;
    DNode<T> next;
    DNode(T data){
        this.data=data;
    }
}

class DoublyLinkedListOpr<T>{
    DNode<T> start;
    DNode<T> creatNode(T data){
        DNode<T> node = new DNode<>(data);
        return node;
    }
    void addAtEnd(T data){
        DNode<T> newNode = creatNode(data);
        if(start == null){
            start = newNode;
        }
        else{
            DNode<T> temp = start;
            while(temp.next!=null){
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = temp;
        }
    }
    void print(){
        DNode<T> temp = start;
        while(temp!=null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
public class DoublyLL {
    public static void main(String[] args) {
        DoublyLinkedListOpr<Integer> opr = new DoublyLinkedListOpr<>();
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("1. Add at end");
            System.out.println("2. Print");
            System.out.println("0. Exit");
            System.out.println("Enter the choice");
            int choice = scanner.nextInt();
            switch(choice){
                case 1:
                System.out.println("Enter the data");
                    opr.addAtEnd(scanner.nextInt());
                    break;
                case 2:
                    opr.print();
                    break;  
                case 0:
                    return;
                default:
                    break;            
            }
        }
    }
}
