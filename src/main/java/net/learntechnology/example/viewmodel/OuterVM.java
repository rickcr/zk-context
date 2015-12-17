package net.learntechnology.example.viewmodel;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.zul.Messagebox;

public class OuterVM {

	public String getTitle() {
		return "Our outer Page";
	}

	private String item;

	@Command("openContextMenu")
	public void openContextMenu(@BindingParam("open") boolean open, @BindingParam("item") String item) {
		System.out.println("open context with item "+item);
		if(open) {
			this.item = item;
		}
	}

	@Command
	public void editItem() {
		Messagebox.show("Edit Item "+item, "Edit Item", Messagebox.OK, Messagebox.INFORMATION);
	}

}
