    Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
   Node nodeToBeinserted=new Node();
         nodeToBeinserted.data=data;
      
        
    if(head==null)
        {
         head=nodeToBeinserted;
       head.next=null; 
        return head;
        
    }
     
    else
        {
        Node p=head;
        //Node q=new Node();
        while(p.next!=null)
        {
         p=p.next;  
    } 
         p.next=nodeToBeinserted;
         nodeToBeinserted.next=null; 
      
    return head;
   
   
}
        
    
    }
    