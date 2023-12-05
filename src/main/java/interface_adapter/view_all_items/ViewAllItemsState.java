package interface_adapter.view_all_items;

import lombok.Getter;
import model.ClothingItem;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ViewAllItemsState {
    private List<ClothingItem> wardrobe;

    public ViewAllItemsState(List<ClothingItem> wardrobe) {
        this.wardrobe = wardrobe;
    }

    public ViewAllItemsState(){
        this.wardrobe = new ArrayList<>();
    }

    public void setWardrobe(List<ClothingItem> wardrobe) {
        this.wardrobe = wardrobe;
    }
}
