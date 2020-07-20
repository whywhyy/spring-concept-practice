package org.zerock.sample;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.ToString;
import lombok.AllArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Component
@ToString
@Getter
@RequiredArgsConstructor
public class Hotel {
	
	@NonNull
	private Chef chef;
	
	
}
