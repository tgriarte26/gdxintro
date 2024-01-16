package com.bmhs.gdxintro.gfx.assets;

public abstract class Tile {

    public static final int ON_SCREEN_DEFAULT_WIDTH = 64, ON_SCREEN_DEFAULT_HEIGHT = 64;

    private int    defaultWorldTileHeight, defaultWorldTileWidth, id;
    private String name;

    public Tile(int id, String name) {
        this.id = id;
        this.name = name;

        defaultWorldTileHeight = ON_SCREEN_DEFAULT_HEIGHT;
        defaultWorldTileWidth = ON_SCREEN_DEFAULT_WIDTH;
    }

    public int getDefaultWorldTileHeight() {
        return defaultWorldTileHeight;
    }

    public int getDefaultWourldTileWidth() {
        return defaultWorldTileWidth;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
