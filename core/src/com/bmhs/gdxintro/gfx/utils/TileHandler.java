package com.bmhs.gdxintro.gfx.utils;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.utils.Array;
import com.bmhs.gdxintro.gfx.assets.Tile;
import com.bmhs.gdxintro.gfx.assets.WorldTile;
public class TileHandler {
    public static TileHandler tileHandler = null;
    private int spriteOnSheetHeight, spriteOnSheetWidth;
    private String primaryColorSheetPath = "primary color spriteSheet.png";
    private Array<WorldTile> worldTileArray;

    private TileHandler(){
        worldTileArray = new Array<>();

        spriteOnSheetHeight = Tile.ON_SCREEN_DEFAULT_HEIGHT;
        spriteOnSheetWidth = Tile.ON_SCREEN_DEFAULT_WIDTH;

        Texture tempTexture = new Texture(primaryColorSheetPath);
        TextureRegion tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*14,spriteOnSheetHeight*2,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile blueWorldTile = new WorldTile(tempRegion, 0, "blue");
        worldTileArray.add(blueWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*4,spriteOnSheetHeight*0,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile blackWorldTile = new WorldTile(tempRegion, 1, "black");
        worldTileArray.add(blackWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*2,spriteOnSheetHeight*2,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile greenYellowWorldTile = new WorldTile(tempRegion, 2, "green yellow");
        worldTileArray.add(greenYellowWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*4,spriteOnSheetHeight*2,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile peachWorldTile = new WorldTile(tempRegion, 3, "peach");
        worldTileArray.add(peachWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*6,spriteOnSheetHeight*2,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile darkTealWorldTile = new WorldTile(tempRegion, 4, "dark teal");
        worldTileArray.add(darkTealWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*8,spriteOnSheetHeight*2,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile tealWorldTile = new WorldTile(tempRegion, 5, "teal");
        worldTileArray.add(tealWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*12,spriteOnSheetHeight*2,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile teal2WorldTile = new WorldTile(tempRegion, 6, "teal2");
        worldTileArray.add(teal2WorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*10,spriteOnSheetHeight*2,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile brownWorldTile = new WorldTile(tempRegion, 7, "brown");
        worldTileArray.add(brownWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*2,spriteOnSheetHeight*0,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile whiteWorldTile = new WorldTile(tempRegion, 8, "white");
        worldTileArray.add(whiteWorldTile);
        //JOLTEON
        /*
        TextureRegion tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*2,spriteOnSheetHeight*0,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile whiteWorldTile = new WorldTile(tempRegion, 0, "white");
        worldTileArray.add(whiteWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*4,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile yellowWorldTile = new WorldTile(tempRegion, 1, "yellow");
        worldTileArray.add(yellowWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*6,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile goldWorldTile = new WorldTile(tempRegion, 2, "gold");
        worldTileArray.add(goldWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*8,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile orangeWorldTile = new WorldTile(tempRegion, 3, "orange");
        worldTileArray.add(orangeWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*10,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile brownWorldTile = new WorldTile(tempRegion, 4, "brown");
        worldTileArray.add(brownWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*12,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile grayWorldTile = new WorldTile(tempRegion, 5, "gray");
        worldTileArray.add(grayWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*14,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile darkGrayWorldTile = new WorldTile(tempRegion, 6, "dark gray");
        worldTileArray.add(darkGrayWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*4,spriteOnSheetHeight*0,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile blackWorldTile = new WorldTile(tempRegion, 7, "black");
        worldTileArray.add(blackWorldTile);
        */
        /*
        TextureRegion tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*2,spriteOnSheetHeight*0,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile blackWorldTile = new WorldTile(tempRegion, 0, "black");
        worldTileArray.add(blackWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*9,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile purpleWorldTile = new WorldTile(tempRegion, 1, "purple");
        worldTileArray.add(purpleWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*6,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile tealWorldTile = new WorldTile(tempRegion, 2, "teal");
        worldTileArray.add(tealWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*4,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile yellowWorldTile = new WorldTile(tempRegion, 3, "yellow");
        worldTileArray.add(yellowWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*7,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile lightBlueWorldTile = new WorldTile(tempRegion, 4, "lightBlue");
        worldTileArray.add(lightBlueWorldTile);
        */
    }

    public Array<WorldTile> getWorldTileArray() {
        return worldTileArray;
    }

    public static TileHandler getTileHandler() {
        if(tileHandler == null) {
            tileHandler = new TileHandler();
        }
        return tileHandler;
    }
}
