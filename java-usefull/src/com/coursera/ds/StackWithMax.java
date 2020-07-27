package com.coursera.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class StackWithMax {
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
			
			if(!stack1.isEmpty()) {
				return stack2.empty() ? stack1.max() : Math.max(stack1.max(), stack2.max());
			}
			
			if(!stack2.empty()) {
				return stack2.max();
			}
			
			return 0;
		}
	}

	public void solve() throws IOException {
		FastScanner scanner = new FastScanner();
		int queries = scanner.nextInt();
		MyStack stack = new MyStack();

		for (int qi = 0; qi < queries; ++qi) {
			String operation = scanner.next();
			if ("push".equals(operation)) {
				int value = scanner.nextInt();
				stack.push(value);
			} else if ("pop".equals(operation)) {
				stack.pop();
			} else if ("max".equals(operation)) {
				// System.out.println(Collections.max(stack));
				System.out.println(stack.max());
			}
		}
	}

	static public void main(String[] args) throws IOException {
		// new StackWithMax().solve();
		
		int[] a = {2,7,3,1,5,2,6,2};
		
		int m=4;
		
		MyTestQueue queue = new StackWithMax().new MyTestQueue();
		
		
		for(int i=0; i < m; i++) {
			queue.enqueue(a[i]);
		}
		
		System.out.println(queue.max());
		
		for (int i = m ; i < a.length; i++) {
			System.out.println("Dequeue:" + queue.dequeue());
			queue.enqueue(a[i]);
			System.out.println(queue.max());
		}
		
	}
}