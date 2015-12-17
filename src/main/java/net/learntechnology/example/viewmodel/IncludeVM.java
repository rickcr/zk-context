package net.learntechnology.example.viewmodel;

import java.util.ArrayList;
import java.util.List;

public class IncludeVM {

	public List<String> getItems() {
		return new ArrayList<String>() {{
			add("Foo");
			add("Bar");
			add("Dog");
		}};

	}
}
