package transformer;

import general.ConversionRate;
import items.Wand;
import materials.ArcaneDust;

public class MageAlchemy extends BasicAlchemy implements Transmutation<Wand, ArcaneDust> {
    @Override
    public ArcaneDust convertToMaterials(Wand reagent) {
        return new ArcaneDust(ConversionRate.WAND_TO_ARCANE_DUST);
    }

    @Override
    public Wand convertFromMaterials(ArcaneDust reagent) {
        return reagent.getQuantity() >= ConversionRate.ARCANE_DUST_TO_WAND ? new Wand() : null;
    }

}
