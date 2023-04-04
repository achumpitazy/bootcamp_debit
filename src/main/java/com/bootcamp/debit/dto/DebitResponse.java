package com.bootcamp.debit.dto;

import com.bootcamp.debit.entity.Debit;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DebitResponse {

	private String message;
	private Debit debit;

}
