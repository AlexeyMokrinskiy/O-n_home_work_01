package HomeWork;

// сортировка пузырьком

public class Home_work_02 {

	class Node {
		int data;
		Node next;

		public Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}

	public Node head = null;
	public Node tail = null;

	public void addNode(int data)
	{

		Node newNode = new Node(data);

		if (head == null) {

			head = newNode;
			tail = newNode;
		}
		else {

			tail.next = newNode;
			tail = newNode;
		}
	}

	public void sortList()
	{

		Node current = head, index = null;

		int temp;

		if (head == null) {
			return;
		}
		else {
			while (current != null) {
				index = current.next;

				while (index != null) {
					if (current.data > index.data) {
						temp = current.data;
						current.data = index.data;
						index.data = temp;
					}

					index = index.next;
				}
				current = current.next;
			}
		}
	}

	public void display()
	{
		Node current = head;

		if (head == null) {
			System.out.println("List is empty");
			return;
		}
		while (current != null) {
			System.out.print(current.data + " ");
			current = current.next;
		}

		System.out.println();
	}

    //_______________________________________________________________________________________
    
    // метод разворота связного списка односвязного.


    public void revert(){
        if (head != null && head.next != null){
            revert(head.next, head);
        }
    }

    private void revert(Node currentNode, Node previusNode) {
        if (currentNode.next == null){
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previusNode;
        previusNode.next = null;
    }

	public static void main(String[] args)
	{

		Home_work_02 sList = new Home_work_02();

		sList.addNode(8);
		sList.addNode(4);
		sList.addNode(7);
		sList.addNode(3);
        sList.addNode(9);
        sList.addNode(1);
        sList.addNode(0);
        sList.addNode(2);
        sList.addNode(6);
        sList.addNode(5);

		System.out.println("Изначальный список: ");
		sList.display();

		sList.sortList();

        System.out.println("Отсортированный список: ");
        sList.display();
        
        sList.revert();

        System.out.println("Развернутый список: ");
		sList.display();

	}

}

