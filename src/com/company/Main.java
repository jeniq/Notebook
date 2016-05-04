package com.company;

import com.company.controller.Controller;
import com.company.model.Notebook;
import com.company.view.View;

public class Main {

    public static void main(String[] args) {
	    // Initialization
        Notebook notebook = new Notebook();
        View view = new View();
        Controller controller = new Controller(notebook, view);
        // Run
        controller.processUser();
    }
}
