public class TaskLinkedList {

    // Node class
    class Node {
        Task task;
        Node next;

        Node(Task task) {
            this.task = task;
            this.next = null;
        }
    }

    private Node head;

    // Add Task
    public void addTask(Task task) {

        Node newNode = new Node(task);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
    }

    // Search Task
    public Task searchTask(int id) {

        Node temp = head;

        while (temp != null) {

            if (temp.task.taskId == id) {
                return temp.task;
            }

            temp = temp.next;
        }

        return null;
    }

    // Traverse Tasks
    public void displayTasks() {

        Node temp = head;

        while (temp != null) {
            System.out.println(temp.task);
            temp = temp.next;
        }
    }

    // Delete Task
    public void deleteTask(int id) {

        if (head == null) {
            return;
        }

        if (head.task.taskId == id) {
            head = head.next;
            System.out.println("Task deleted successfully.");
            return;
        }

        Node temp = head;

        while (temp.next != null &&
               temp.next.task.taskId != id) {

            temp = temp.next;
        }

        if (temp.next == null) {
            System.out.println("Task not found.");
        } else {
            temp.next = temp.next.next;
            System.out.println("Task deleted successfully.");
        }
    }
}