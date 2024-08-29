//package com.melly.demosbsj.contentType;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//@Service
//public class ContentTypeService implements IContentTypeService {
//
//    @Autowired
//    IContentTypeMybatisMapper contentTypeMybatisMapper;
//
//
//    @Override
//    public ContentTypeDto findContentType(IContentType contentType) {
//        // ContentTypeDto를 사용하여 name 값을 가져옴
//        String id = contentTypeMybatisMapper.findById((ContentTypeDto) contentType);
//
//        // 결과를 ContentTypeDto 객체에 설정
//        ContentTypeDto result = new ContentTypeDto();
//        result.setId(id); // id는 문자열로 설정됨
//
//        return result;
//    }
//
//}
