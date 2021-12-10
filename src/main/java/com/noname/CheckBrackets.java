package com.noname;

import java.util.ArrayDeque;
import java.util.Deque;

public class CheckBrackets implements ICheckOperation {

    @Override
    public boolean check(String str) {

        Deque<Character> deque = new ArrayDeque();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                deque.push(c);
                continue;
            }

            if (c == ')' || c == ']' || c == '}') {
                char firstChar = deque.pop();
                switch (firstChar) {
                    case '(':
                        if (c != ')') {
                            return false;
                        }
                        break;
                    case '[':
                        if (c != ']') {
                            return false;
                        }
                        break;
                    case '{':
                        if (c != '}') {
                            return false;
                        }
                        break;
                }

                continue;
            }
        }

        return deque.isEmpty();
    }
}
