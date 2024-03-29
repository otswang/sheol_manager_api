package win.ots.hell.api.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "tbl_equip_record_use")
public class EquipRecordUse extends BaseEntity {

	@Column(name = "equip_id", columnDefinition = "bigint not null comment '设备id'")
	private Long equipId;

	@Column(name = "handler_id", columnDefinition = "bigint not null comment '修改者id'")
	private Long handlerId;

}
