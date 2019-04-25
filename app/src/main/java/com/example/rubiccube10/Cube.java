package com.example.rubiccube10;

public class Cube {

    String black = "" +
            "000 - 001   " +
            " | 010 + 011" +
            "100 + 101 | " +
            "   110 - 111";
    private boolean [][] bitsBlack = {
            {false, false, false}, {false, false, true},
            {false, true,  false}, {false, true,  true},
            {true,  false, false}, {true,  false, true},
            {true,  true,  false}, {true,  true,  true}};

    String white = "" +
            "111 - 110   " +
            " | 101 + 100" +
            "011 + 010 | " +
            "   001 - 000";
    private boolean [][] bitsWhite = {
            {true,  true,  true}, {true,  true,  false},
            {true,  false, true}, {true,  false, false},
            {false, true,  true}, {false, true,  false},
            {false, false, true}, {false, false, false}};

    String red = "" +
            "100 - 110   " +
            " | 101 + 111" +
            "000 + 010 | " +
            "   001 - 011";
    private boolean [][] bitsRed = {
            {false, false, false}, {true, false, false},
            {false, false, true }, {true, false, true },
            {false, true,  false}, {true, true,  false},
            {false, true,  true }, {true, true,  true }};

    String green = "" +
            "010 - 011   " +
            " | 110 + 111" +
            "000 + 001 | " +
            "   100 - 101";
    private boolean [][] bitsGreen = {
            {false, true,  false}, {false, true,  true},
            {true,  true,  false}, {true,  true,  true},
            {false, false, false}, {false, false, true},
            {true,  false, false}, {true, false,  true}};

    String blue = "" +
            "001 - 101   " +
            " | 011 + 111" +
            "000 + 100 | " +
            "   010 - 110";
    private boolean [][] bitsBlue = {
            {false, false, true }, {true, false, true },
            {false, true,  true }, {true, true,  true },
            {false, false, false}, {true, false, false},
            {false, true,  false}, {true, true,  false}};

    String cyan = "" +
            "011 - 001   " +
            " | 010 + 000" +
            "111 + 101 | " +
            "   110 - 100";

    private boolean [][] bitsCyan = {
            {false, true, true }, {false, false, true },
            {false, true, false}, {false, false, false},
            {true, true,  true }, {true,  false, true },
            {true,  true, false}, {true,  false, false}};

    String magenta = "" +
            "101 - 100   " +
            " | 001 + 000" +
            "111 + 110 | " +
            "   011 - 010";
    private boolean [][] bitsMagenta = {
            {true,  false, true}, {true,  false, false},
            {false, false, true}, {false, false, false},
            {true,  true,  true}, {true,  true,  false},
            {false, true,  true}, {false, true,  false}};

    String yellow = "" +
            "110 - 010   " +
            " | 100 + 000" +
            "111 + 011 | " +
            "   101 - 001";
    private boolean [][] bitsYellow = {
            {true, true,  false}, {false, true,  false},
            {true, false, false}, {false, false, false},
            {true, true,  true }, {false, true,  true },
            {true, false, true }, {false, false, true }};

}
