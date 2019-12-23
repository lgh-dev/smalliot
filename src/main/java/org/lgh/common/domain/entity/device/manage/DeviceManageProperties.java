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
	//管理标签。 租户、部门、区域
	private List<ManageTitle> manageTitles;
}
