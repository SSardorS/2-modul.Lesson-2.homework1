package uz.pdp.homework1.projection.helper;

public interface InterfaceEntity {
    default Long getId(){
        return getId();
    };

    default String getName(){
        return getName();
    };

    default boolean getActive(){
        return getActive();
    };
}
