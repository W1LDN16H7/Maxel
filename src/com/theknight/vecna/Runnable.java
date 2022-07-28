package com.theknight.vecna;

public interface Runnable {

    /**
     * List the license content when user type warranty on the console
     * @throws Exception
     */
    void warranty() throws Exception;

    void runQuery(String command) throws Exception;


    public String evaluate(String input);
}
