package io.anuke.mindustry.world.blocks;

import io.anuke.arc.graphics.g2d.Draw;
import io.anuke.mindustry.graphics.Layer;
import io.anuke.mindustry.world.Block;
import io.anuke.mindustry.world.Tile;

public class TreeBlock extends Block{

    public TreeBlock(String name){
        super(name);
        solid = true;
        layer = Layer.power;
    }

    @Override
    public void draw(Tile tile){}

    @Override
    public void drawLayer(Tile tile){
        Draw.rect(region, tile.drawx(), tile.drawy());
    }
}
