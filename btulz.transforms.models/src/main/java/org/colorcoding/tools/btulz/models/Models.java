package org.colorcoding.tools.btulz.models;

import java.util.ArrayList;

public class Models extends ArrayList<IModel> implements IModels {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1104036494465184046L;

	
	public IModel create() {
		IModel model = new Model();
		if (this.add(model)) {
			return model;
		}
		return null;
	}

}
