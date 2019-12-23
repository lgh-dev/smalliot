package org.lgh.common.domain.entity;

import org.lgh.common.utils.IdUtil;

import java.time.LocalDateTime;

/**
 * @author liangguohui@iot-cas.com
 * @version V1.0
 * @Description 基础实体
 * @date 2019/12/22
 */
public abstract class BaseEntity {
	//主键
	private long id= IdUtil.nextId();
	//创建时间
	private LocalDateTime createTime=LocalDateTime.now();
	//更新时间
	private LocalDateTime updateTime=LocalDateTime.now();

}
