package project1.spring.utils.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@EntityListeners(value = {AuditingEntityListener.class})		//객체는 아님. 해당 클래스에 Auditing(감시) 기능을 포함.
@MappedSuperclass
@Getter
@Setter
public abstract class BaseTimeEntity {
	@CreatedDate
	@Column(updatable = false)	//수정 불가능
	private LocalDateTime regTime;
	
	@LastModifiedDate		//마지막 수정된 날짜
	private LocalDateTime updateTime;
	
}
