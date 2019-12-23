package org.lgh.common.domain.entity.device.manage;

import org.lgh.common.domain.entity.BaseEntity;

/**
 * @author liangguohui@iot-cas.com
 * @version V1.0
 * @Description 区域
 * @date 2019/12/23
 */
public class Regions extends BaseEntity{
	//名称
	private String name;
	//城市级别
	private String levelEnum;
	//父节点id
	private long parentNodeId;

}
