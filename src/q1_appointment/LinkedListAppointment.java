
package q1_appointment;


public class LinkedListAppointment {
    //Create pointers
    private Node first;
    private Node last;
    
    //Methods
    //isEmpty method - check if the LinkedList is empty and return a boolean
    public boolean isEmpty() {
        return first == null;
    }
    
    //getAppointment - input an index and return appointment infomation in String
    //find the node first according to the index
    private Node findNode(int index){
        int i = 0; //i refers to the index of the LinkedList
        
        //traverse the list to find the node
        for (Node p = first; p != null; p = p.next, i++){
            if(i == index){
                return p;
            }
        }
        return null;//the node is not found
    }
    
    //getAppointment method to get the data in the node
    public String getAppointment(int index){
        Node node = findNode(index);
        if (node == null){//cannot find the node 
            //throw an exception
            throw new IndexOutOfBoundsException();
        }
        return node.toString();
    }
    
    //add method - to add a new node at the end of the list
    public void add(Appointment elem){
        //if the list is empty then add the first node, and the first one is the last one
        if(isEmpty()){
            Node added = new Node(elem);
            first = added;
            last = first;
        }else{//if the list is not empty, add a new node at the end, and the new one is the last one       
            last.next = new Node(elem);
            last = last.next;
        }
    }
    
    //remove method - remove target by pCode
    public String remove(String pCode){
        Node current =  first; //set the pointer to the beginning
        int index = 0; //set the index to the beginning
        //if the current node is not empty and it's not the node we are looking for
        //move the pointer and the index to the next
        //the loop stops when the node is found or it gets to the end of the list
        while(current != null  && !current.appt.pCode.equals(pCode)){
            current = current.next;
            index++;
        }
        //after traversing the whole list, the Pcode is not found
        if(current == null){
            System.out.println("Please double check the patient code, as it's not found in the system!");
        }
        //when the node is found, remove the node according to its index
        if(current.appt.pCode.equals(pCode)){
            removeIndex(index);
        }
        return pCode;
    }
    
    //remove a target by its index
    //the situation that the list is empty was eliminated in the previous judgment
    //so it won't be discussed in the following method
    //this method is based on the Pcode is found, and the index is valid as the judgment in the previous method 
    public int removeIndex (int index){       
        //index == 0
        if(index == 0){
            first = first.next;
            return index;
        }
        
        //otherwise find the previous node
        Node prev = findNode(index-1);
        //link the previous node to the next node   
        prev.next = prev.next.next;
        if (prev.next == null){
            last = prev;
        }
        return index;
    }
    
    @Override
    public String toString(){
        String output = "Appointments: \n";
        Node current = first;
        while(current != null) {
            output += current.toString()+ "\n";
            current = current.next;
            };
            return output;
    }
        
}
