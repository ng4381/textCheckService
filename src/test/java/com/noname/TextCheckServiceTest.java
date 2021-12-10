package com.noname;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextCheckServiceTest {

    @Test
    public void checkBracketsTest() {

        assertTrue(checkBrackets("(  ) {  }  [  ]"));
        assertTrue(checkBrackets("(  ) {  }  [  ]"));
        assertTrue(checkBrackets("(  [  {  }  ]  )"));
        assertFalse(checkBrackets("(  }"));
        assertFalse(checkBrackets("[  (  ]  )"));
        assertFalse(checkBrackets("[  (  {  }  )  ]  (  ]"));
        assertFalse(checkBrackets("(  (  {  }  ]  (  )"));
    }

    private boolean checkBrackets(String str) {
        TextCheckService checkService = new TextCheckService(str);
        return checkService.check(new CheckBrackets());
    }

}