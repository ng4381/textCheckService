package com.noname;

public class TextCheckService implements ICheckService {

    private String str;

    public TextCheckService(String str) {
        this.str = str;
    }

    @Override
    public boolean check(ICheckOperation operation) {
        return operation.check(str);
    }
}
