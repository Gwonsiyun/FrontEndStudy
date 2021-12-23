package javastudy.ex1223.interface2;

public interface Parent extends GrandMam{
	void parent();
	default void defaultP() {
		System.out.println("parent Default Mathod");
	}
}
