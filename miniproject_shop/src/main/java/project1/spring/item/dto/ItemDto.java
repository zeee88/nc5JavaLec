package project1.spring.item.dto;

import lombok.Getter;
import lombok.Setter;
import project1.spring.utils.entity.BaseEntity;

@Getter
@Setter
public class ItemDto extends BaseEntity{

    private Long id;

    private String itemNm;

    private Integer price;

    private String itemDetail;

    private String itemSellStatus;

    
}
