package Chapter11;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<>();
		queue.offer("김의찬");
		queue.offer("손흥민");
		queue.offer("황희찬");
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue.peek());
		System.out.println(queue);
	}
}
