package materia.Queues;

import java.util.NoSuchElementException;

import materia.models.Node;

public class Queue {
    
    private Node front;
    private Node rear;

    //creamos una cola con nodos vacios 
    public Queue() {
        this.front = null;
        this.rear = null;
    }
    public void enqueue(int value) {
        Node newNode = new Node(value);
        if(isEmpty()){
            front = newNode;
            rear = newNode;
        }else{
            rear.setNext(newNode);
            rear = newNode;
        }
    }
    //metodo para desencolar nodos 
    public Node dequeue() {
        if(isEmpty()){
            throw new NoSuchElementException("La cola esta vacia");
        }
        Node node = front;
        front =front.getNext();
        if(front == null){
            rear = null;
        }
        return node;
    }

    public boolean isEmpty() {
        return front == null;
    }
}
