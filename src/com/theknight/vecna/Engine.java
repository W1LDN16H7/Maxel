package com.theknight.vecna;

import com.theknight.max.maxi;
import org.mariuszgromada.math.mxparser.Expression;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Engine implements Runnable, maxi {
    private String value;

    public Engine() {
    }

    public Engine(String value) {
        this.value = value;

    }


    /**
     * List the license content when user type warranty on the console
     *
     * @throws Exception
     */
    @Override
    public void warranty() throws Exception, FileNotFoundException {
        String License = "MIT License\n" +
                "Copyright (c) 2022 The Knight All rights reserved and All contributors.\n" +
                "==========================\n" +
                "\n" +
                "Permission is hereby granted, free of charge, to any person obtaining a copy\n" +
                "of this software and associated documentation files (the \"Software\"), to deal\n" +
                "in the Software without restriction, including without limitation the rights\n" +
                "to use, copy, modify, merge, publish, distribute, sublicense, and/or sell\n" +
                "copies of the Software, and to permit persons to whom the Software is\n" +
                "furnished to do so, subject to the following conditions:\n" +
                "\n" +
                "The above copyright notice and this permission notice shall be included in\n" +
                "all copies or substantial portions of the Software.\n" +
                "\n" +
                "THE SOFTWARE IS PROVIDED \"AS IS\", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR\n" +
                "IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,\n" +
                "FITNESS FOR A PARTICULAR PURPOSE AND NONINFINGEMENT. IN NO EVENT SHALL THE\n" +
                "AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER\n" +
                "LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,\n" +
                "OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN\n" +
                "THE SOFTWARE.\n";
        System.out.println(License);

    }

    @Override
    public void runQuery(String command) throws Exception {
        if (command.equals("warranty")){
            warranty();
        }

    }

    @Override
    public String evaluate(String input) {
        Expression exp = new Expression(input);
        int res2 = 0;
        double res = exp.calculate();
        if (isInteger(res)) {
            res2 = (int) res;
            return String.valueOf(res2);
        } else {
            return String.valueOf(res);
        }
    }


    /**
     * Return true if the given double is a valid Integer.
     *
     * @param value
     * @return
     */
    @Override
    public boolean isInteger(Double value) {
        return value.intValue() == value;

    }
}
