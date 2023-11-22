package com.ldts.steven.gui;
import com.ldts.steven.model.Position;
import java.io.IOException;
public interface GUI {
    void drawHero(Position position);

    void drawWall(Position position);

    void drawMonster(Position position);

    void clear();

    void refresh() throws IOException;

    void close() throws IOException;
}
