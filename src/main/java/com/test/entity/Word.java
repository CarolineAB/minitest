package com.test.entity;

import lombok.Data;
/**
 * 实体
 * @author A
 *
 */
@Data
public class Word {
public Integer num;
public String letter;

public Word() {
}
public Word(Integer num,String letter) {
	this.num =num;
	this.letter = letter;
}

}
