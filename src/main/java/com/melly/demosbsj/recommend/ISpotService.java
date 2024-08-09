package com.melly.demosbsj.recommend;

import java.util.List;

public interface ISpotService<T> {
    T insert(T dto) throws Exception;
    T update(Long id, T dto) throws Exception;
    Boolean delete(Long id) throws Exception;

    T findById(Long id);
    List<T> getAllList();

    T findByName(String name);

    List<T> findAllByNameContains(T dto);
    int countAllByNameContains(T searchAjaxDto);

}
