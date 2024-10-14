package com.example.mswp.dto;

import com.example.mswp.entity.Comp;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
public class CompDto {

    private String compNum;
    private String compName;
    private String compCEO;
    private String compAddress;
    private String compItems;
    private String compEmail;
    private String id;

    //여러 아이디 받기 위함 (uuid 기반 사용자 닉네임 제공)
//    private List<String> uuidList;

    public Comp toEntity() {
        //@AllArgsConstructor 이랑 builder 겹쳐서 에러남
        return Comp.builder()
                .compNum()
                .build();
    }

}