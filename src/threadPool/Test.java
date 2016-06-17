package threadPool;

import java.util.ArrayList;

class task implements Runnable{
	public void run(){
		System.out.println(this.toString());
	}
}
public class Test {
	public static void main(String[] args){
		ThreadPool tp = ThreadPool.getInstance();
		ArrayList<Runnable> taskList = new ArrayList<Runnable>();
		taskList.add(new task());
		taskList.add(new task());
		taskList.add(new task());
		
		tp.addTasksInbatches(taskList, 100);
	}
}
