package BT.ArrayList;
import java.util.Arrays;
public class MyList<E> {
private int size = 0;
private static final int DEFAULT_CAPACITY = 10;
private Object elements[];
public MyList(){
    elements = new Object[DEFAULT_CAPACITY];
}
public MyList(int capacity){
    elements = new Object[capacity];
}
private void ensureCapa(){
int newSize = elements.length*2;
elements = Arrays.copyOf(elements,newSize);
}
public void add(int index, E element){
if (size == elements.length){
    ensureCapa();
}
for (int i=elements.length-1;i>index;i--){
    elements[i] = elements[i-1];
}
elements[index] = element;
size++;
}
public void remove(int index){
if (index<0||index>elements.length){
    throw new IndexOutOfBoundsException("Error");
}
for (int i=index;i<elements.length-1;i++){
    elements[i]=elements[i+1];
}
elements[elements.length-1]=null;
size--;
}
public int size(){
    return size;
}
public MyList<E> clone(){
    return this;
}
public boolean contains(E o){
 boolean check = false;
 for (Object variable: elements){
     if (variable == o){
         check = true;
     }
 }
 return check;
}
public int indexOf(E o){
   int position = -1;
   for (int i=0;i<size;i++){
       if (elements[i].equals(o)){
           position = 1;
           break;
       }
   }
   return position;
}
public void clear(){
    for (int i=0;i<size;i++){
        elements[i] = null;
    }
}
public E get(int index){
    if (index<0||index>elements.length){
        throw new IndexOutOfBoundsException("err");
    }
    return (E) elements[index];
}

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }

    public void add(E i) {
    if (size == elements.length){
        ensureCapa();
    }
    elements[size]=i;
    size++;
    }
}
