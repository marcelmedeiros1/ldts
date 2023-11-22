package com.ldts.steven;

import com.ldts.steven.gui.LanternaGUI;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;
public class Game {
    private LanternaGUI gui;
    public Game() throws FontFormatException, IOException, URISyntaxException {
        this.gui = new LanternaGUI(25, 25);
    }
}
