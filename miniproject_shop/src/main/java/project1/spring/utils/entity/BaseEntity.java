package project1.spring.utils.entity;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Getter;
import lombok.Setter;

@EntityListeners(value = {AuditingEntityListener.class})		//객체는 아님. 해당 클래스에 Auditing(감시) 기능을 포함.
@MappedSuperclass
@Getter
@Setter
public abstract class BaseEntity extends BaseTimeEntity{

	@CreatedBy
	@Column(updatable = false)	//수정 불가능
	private String createdBy;
	
	@LastModifiedBy		//마직막으로 수정한 사람
	private String modifiedBy;
}
