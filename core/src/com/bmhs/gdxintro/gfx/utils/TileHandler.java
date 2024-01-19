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

        TextureRegion tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*2,spriteOnSheetHeight*0,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile blackWorldTile = new WorldTile(tempRegion, 0, "black");
        worldTileArray.add(blackWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*2,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile lightYellowWorldTile = new WorldTile(tempRegion, 1, "lightYellow");
        worldTileArray.add(lightYellowWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*3,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile goldWorldTile = new WorldTile(tempRegion, 2, "gold");
        worldTileArray.add(goldWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*0,spriteOnSheetHeight*4,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile mediumYellowWorldTile = new WorldTile(tempRegion, 3, "mediumYellow");
        worldTileArray.add(mediumYellowWorldTile);

        tempRegion = new TextureRegion(tempTexture,spriteOnSheetWidth*1,spriteOnSheetHeight*0,spriteOnSheetWidth,spriteOnSheetHeight);
        WorldTile whiteWorldTile = new WorldTile(tempRegion, 4, "white");
        worldTileArray.add(whiteWorldTile);

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
