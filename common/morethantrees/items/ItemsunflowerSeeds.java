package morethantrees.items;

import morethantrees.MTJT;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.item.ItemFood;

public class ItemsunflowerSeeds extends ItemFood
{
    
    public ItemsunflowerSeeds(int i, int j, float f, boolean b)
    {
        super(i, j, f, b);
        this.setCreativeTab(MTJT.tabTreeItems);
    }
    
    @Override
    public void registerIcons(IconRegister iconRegister)
    {
        itemIcon = iconRegister.registerIcon("MTJT:sunflowerSeeds");
    }
    
}