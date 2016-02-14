package org.dei.perla.cdt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CDT {

	private static CDT cdt;
	
	private List<Dimension> dimensions;
	
	private CDT() {
		dimensions = new ArrayList<Dimension>();
	}
	
	public static CDT getCDT(){
		if(cdt == null) 
			cdt = new CDT();
		return cdt;
	}
	
	public void setDimensions(List<Dimension> dimensions){
		this.dimensions = dimensions;
	}
	
	public List<Dimension> getDimensions(){
		return dimensions;
	}
	
	public void addDimension(Dimension dim){
		if(getDimByName(dim.getName()) == null){
			dimensions.add(dim);
		}
		else 
			System.out.println("The CDT has already a dimension with the name " + dim.getName());
	}
	
	private int getIndex(String dimensionName) {
		int index = 0;
		for(Dimension d: cdt.getDimensions()){
			if(d.getName().equals(dimensionName))
				return index;
			index++;
		}
		return -1;
	}
	
	public boolean removeDimensionByName(String dim){
		int indexDimensionToRemove = getIndex(dim);
		if(indexDimensionToRemove > 0){
			dimensions.remove(indexDimensionToRemove);
			return true;
		}
		else {
			System.out.println("The CDT does not have a DIMENSION with the name " + dim);	
			return false;
		}
	}
	
	public boolean removeDimension(Dimension dim){
		return removeDimensionByName(dim.getName());
	}
	
	public Dimension getDimByName(String name){
		for(Dimension d: dimensions){
			if(d.getName().equals(name))
				return d;
		}
		return null;
	}
	
	/*Returns the list of concepts of a given dimension, it if exists. 
	 * The list of concepts could be empty if the dimension has only an attribute
	 * 
	 * @param dim is the name of the dimension
	 */
	public List<Concept> getConceptsOfDim(String dim){
		for(Dimension d: dimensions){
			if(d.getName().equals(dim))
				return d.getConcepts();
		}
		return Collections.emptyList();
	}
	
	/*Returns the a given concept of a given dimension, it could be null if the concept
	 * does not exist. 
	 * @param dim is the name of the dimension
	 * @param concept is the name of the dimension's concept
	 */
	public Concept getConceptOfDim(String dim, String concept){
		List<Concept> concepts = getConceptsOfDim(dim);
		for(Concept c: concepts){
			if(c.getName().equals(concept)){
				return c;
			}	
		}
		return null;
	}
	
	/*Returns the attribute of a given dimension it if exists, by looking at the attribute
	 * of the dimension and attributes of its concept children. 
	 * The return value could be null if the dimension has not an attribute or 
	 * if the attribute does not correspond to an existing fpc sensor
	 * 
	 * @param dim is the name of the dimension
	 * @param att is the name of the attribute
	 */
	public CreateAttr getAttributeOfDim(String dim, String att){
		Dimension searchedDim = null;
		for(Dimension d: dimensions){
			if(d.equals(dim)){
				searchedDim = d;
				break;
			}
		}
		if(searchedDim == null) return CreateAttr.EMPTY;
		CreateAttr attDim = searchedDim.getAttribute();
		if(attDim.getName().equals(att))
			return attDim;
		
		for(Concept c: searchedDim.getConcepts()){
			return c.getAttribute(att);
		}
		return CreateAttr.EMPTY;
	} 
	
	
	public boolean containsDim(String dim){
		if(this.getDimByName(dim) != null)
			return true;
		return false;
	}
	
	public boolean containsConceptOfDim(String dim, String concept){
		List<Concept> concepts = getConceptsOfDim(dim);
		if(concepts.isEmpty())
			return false;
		for(Concept c: concepts){
			if(c.getName().equals(concept))
				return true;
		}
		return false;	
	}
	
	public boolean containsAttributeOfDim(String dim, String att){
		if(this.getAttributeOfDim(dim, att) == CreateAttr.EMPTY)
			return false;
		else
			return true;
	} 
}
