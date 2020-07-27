package com.coursera.ds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
//Failed: [](()
class Bracket {
	Bracket(char type, int position) {
		this.type = type;
		this.position = position;
	}

	boolean Match(char c) {
		if (this.type == '[' && c == ']')
			return true;
		if (this.type == '{' && c == '}')
			return true;
		if (this.type == '(' && c == ')')
			return true;
		return false;
	}

	char type;
	int position;
}

class check_brackets {
	public static void main(String[] args) throws IOException {
		InputStreamReader input_stream = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(input_stream);
		String text = reader.readLine();
		int result = -1;
		Stack<Bracket> opening_brackets_stack = new Stack<Bracket>();
		List<Character> temp = new ArrayList<>();
		for (int position = 0; position < text.length(); ++position) {
			result = position + 1;
			char next = text.charAt(position);

			if (next == '(' || next == '[' || next == '{') {
				opening_brackets_stack.push(new Bracket(next, position));
			}

			if (next == ')' || next == ']' || next == '}') {
				temp.add(next);
				if(opening_brackets_stack.size() > 0) {
					Bracket bracket = opening_brackets_stack.pop();
					if(bracket.Match(next) == false) {						
						break;
					} else {
						temp.remove(Character.valueOf(next));
					}
				}  else {
					break;
				}
				
			}
		}
		
		if(opening_brackets_stack.size() == 0 && temp.size() == 0) {
			System.out.println("Success");
		} else {
			if(opening_brackets_stack.size() > 0) {
				Bracket pop = opening_brackets_stack.pop();
				System.out.println("Stack:"  + pop.position + 1);
			} else {
				System.out.println(result);
			}
			
		}
	}
}
