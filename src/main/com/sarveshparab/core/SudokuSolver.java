package com.sarveshparab.core;

import aima.core.logic.propositional.inference.WalkSAT;
import aima.core.logic.propositional.kb.data.Clause;
import aima.core.logic.propositional.kb.data.Model;
import com.sarveshparab.core.pojo.Sudoku;

import java.io.IOException;
import java.util.Set;

public class SudokuSolver {

    public static void main(String args[]) throws IOException {

        Sudoku sudoku = Sudoku.readFile("C:\\Users\\sarve\\IdeaProjects\\sudoku-solver\\src\\main\\resources\\inputPuzzle.txt");
        Set<Clause> kb = sudoku.makeKB();

        WalkSAT walkSAT = new WalkSAT();
        Model m = walkSAT.walkSAT(kb, 0.5, Integer.MAX_VALUE);
        Sudoku solutionWalkSAT = sudoku.formatSolution(m);
        System.out.println(solutionWalkSAT.toString());

    }

}
