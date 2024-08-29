package com.melly.demosbsj.area;

public interface IArea {

    Long getId();
    void setId(Long id);

    String getName();
    void setName(String name);

    String getCode();
    void setCode(String code);

    default void copyfield(IArea from){
         if( from == null){
             return;
         }
         if( from.getCode() != null ){
             this.setId(Long.parseLong(from.getCode()));
         }
    }
}
