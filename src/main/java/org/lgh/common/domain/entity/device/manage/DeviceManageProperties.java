package org.lgh.common.domain.entity.device.manage;

import org.lgh.common.domain.entity.BaseEntity;

import java.util.List;

/**
 * @author liangguohui@iot-cas.com
 * @version V1.0
 * @Description 设备管理属性@TODO 考虑动态管理标签+用户数据权限
 * @date 2019/12/22
 */
public class DeviceManageProperties  extends BaseEntity {

	private long deviceId;

	private long tenantsId;

	private long regionsId;

	private long departmentId;
}
