package model.entity;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Product Entity
 * 對應MySQL product 資料表
 * */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private Long id;
	private String name;
	private String category;
	private Integer price;
	private Integer stock;
	private String imageBase64;
	private String imageType;
	private LocalDateTime createAt;
	private LocalDateTime updateAt;
	
	
}
