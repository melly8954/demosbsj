package com.melly.demosbsj.recommend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SpotServiceImpl implements ISpotService<ISpot>{
    @Autowired
    private SpotMybatisMapper spotMybatisMapper;

    @Override
    public ISpot insert(ISpot spot) throws Exception {
        SpotDto dto = null;
        try {
            if (!isValidInsert(spot)) {
                return null;
            }
            dto = new SpotDto();
            dto.copyFields(spot);
            dto.setId(0L);
            this.spotMybatisMapper.insertSpot(dto);
            // CategoryMybatisMapper 의 쿼리 XML 파일의 <insert id="insert" 문장을 실행한다.
            // dto.id 는 자동증가된 id 값이 리턴된다.
            return dto;
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
        return dto;
    }

    private boolean isValidInsert(ISpot spot) {
        if ( spot == null ) {
            return false;
        }
        return true;
    }


    @Override
    public ISpot update(Long id, ISpot dto) throws Exception {
        ISpot find = this.findById(id);
        if ( find == null ) {
            return null;
        }
        find.copyFields(dto);
        this.spotMybatisMapper.updateSpot((SpotDto) find);
        // CategoryMybatisMapper 의 쿼리 XML 파일의 <update id="update" 문장을 실행한다.
        return find;
    }

    @Override
    public Boolean delete(Long id) throws Exception {
        ISpot find = this.findById(id);
        if ( find == null ) {
            return false;
        }
        this.spotMybatisMapper.deleteSpotById(id);
        // CategoryMybatisMapper 의 쿼리 XML 파일의 <delete id="deleteById" 문장을 실행한다.
        return true;
    }


    @Override
    public ISpot findById(Long id) {
        return null;
    }

    @Override
    public List<ISpot> getAllList() {
        return List.of();
    }

    @Override
    public ISpot findByName(String name) {
        return null;
    }

    @Override
    public List<ISpot> findAllByNameContains(ISpot dto) {
        return List.of();
    }

    @Override
    public int countAllByNameContains(ISpot searchAjaxDto) {
        return 0;
    }
}
