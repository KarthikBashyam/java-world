package com.coursera.ds;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class SlidingWindowMax {
	class FastScanner {
		StringTokenizer tok = new StringTokenizer("");
		BufferedReader in;

		FastScanner() {
			in = new BufferedReader(new InputStreamReader(System.in));
		}

		String next() throws IOException {
			while (!tok.hasMoreElements())
				tok = new StringTokenizer(in.readLine());
			return tok.nextToken();
		}
		int nextInt() throws IOException {
			return Integer.parseInt(next());
		}
	}
	
	class MyStack extends Stack<Integer> {
		Stack<Integer> max = new Stack<>();

		@Override
		public synchronized Integer pop() {
			if (max.peek().intValue() == this.peek()) {
				max.pop();
			}
			return super.pop();
		}

		@Override
		public Integer push(Integer item) {
			if (max.size() == 0) {
				max.add(item);
			} else {
				if (max.peek().intValue() <= item.intValue()) {
					max.add(item);
				}
			}
			return super.push(item);
		}

		public int max() {
			return max.peek().intValue();
		}

	}

	class MyTestQueue {
		MyStack stack1;
		MyStack stack2;		

		public MyTestQueue() {
			stack1 = new MyStack();
			stack2 = new MyStack();
		}

		public void enqueue(int element) {
			stack1.push(element);			
		}

		public int dequeue() {
			if (!stack2.isEmpty()) {
				return stack2.pop();
			}
			while (!stack1.isEmpty()) {

				stack2.push(stack1.pop());
			}			
			return stack2.pop();
		}
		
		public int max() {

			if (!stack1.isEmpty()) {
				return stack2.empty() ? stack1.max() : Math.max(stack1.max(), stack2.max());
			}

			if (!stack2.empty()) {
				return stack2.max();
			}

			return 0;
		}
	}
	
	public class SlidingWindow{
		int n;
		int sequence[];
		int m;
		void read() throws IOException {
			FastScanner in = new FastScanner();
			n = in.nextInt();
			sequence = new int[n];
			for (int i = 0; i < n; i++) {
				sequence[i] = in.nextInt();
			}
			m = in.nextInt();
		}
		int[] getMaxSequence(){
			int[] ans = new int[n - m + 1];
			
			MyTestQueue queue = new MyTestQueue();

			int count =0;
			for(int i=0; i < m; i++) {
				queue.enqueue(sequence[i]);
			}
			
			ans[count++] = queue.max();
			
			for (int i = m ; i < sequence.length; i++) {		
				queue.dequeue();
				queue.enqueue(sequence[i]);
				ans[count++] = queue.max();
			}
			
			
			return ans;
		}
	}
	
	public static void main(String[] args) throws IOException {
		new Thread(null, new Runnable() {
            public void run() {
                try {
                    new SlidingWindowMax().run();
                } catch (IOException e) {
                }
            }
        }, "1", 1 << 26).start();
	}
	public void run() throws IOException {
		SlidingWindow sWindow = new SlidingWindow();
		sWindow.read();
		int[] ans = sWindow.getMaxSequence();
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i] + " ");
		}
	}
}