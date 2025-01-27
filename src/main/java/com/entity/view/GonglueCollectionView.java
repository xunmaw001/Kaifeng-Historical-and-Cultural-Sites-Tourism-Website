package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.GonglueCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 旅游攻略收藏
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("gonglue_collection")
public class GonglueCollectionView extends GonglueCollectionEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 类型的值
	*/
	@ColumnInfo(comment="类型的字典表值",type="varchar(200)")
	private String gonglueCollectionValue;

	//级联表 旅游攻略
							/**
		* 攻略名称
		*/

		@ColumnInfo(comment="攻略名称",type="varchar(200)")
		private String gonglueName;
		/**
		* 攻略编号
		*/

		@ColumnInfo(comment="攻略编号",type="varchar(200)")
		private String gonglueUuidNumber;
		/**
		* 攻略照片
		*/

		@ColumnInfo(comment="攻略照片",type="varchar(200)")
		private String gongluePhoto;
		/**
		* 出发地点
		*/

		@ColumnInfo(comment="出发地点",type="varchar(200)")
		private String gonglueChuAddress;
		/**
		* 途径地
		*/

		@ColumnInfo(comment="途径地",type="varchar(200)")
		private String gonglueTujingAddress;
		/**
		* 目的地点
		*/

		@ColumnInfo(comment="目的地点",type="varchar(200)")
		private String gonglueMuAddress;
		/**
		* 赞
		*/

		@ColumnInfo(comment="赞",type="int(11)")
		private Integer zanNumber;
		/**
		* 踩
		*/

		@ColumnInfo(comment="踩",type="int(11)")
		private Integer caiNumber;
		/**
		* 历史介绍
		*/

		@ColumnInfo(comment="历史介绍",type="longtext")
		private String gonglueContent;
		/**
		* 现代简介
		*/

		@ColumnInfo(comment="现代简介",type="longtext")
		private String gonglueXiandaiContent;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer gonglueDelete;
	//级联表 用户
		/**
		* 用户姓名
		*/

		@ColumnInfo(comment="用户姓名",type="varchar(200)")
		private String yonghuName;
		/**
		* 用户手机号
		*/

		@ColumnInfo(comment="用户手机号",type="varchar(200)")
		private String yonghuPhone;
		/**
		* 用户身份证号
		*/

		@ColumnInfo(comment="用户身份证号",type="varchar(200)")
		private String yonghuIdNumber;
		/**
		* 用户头像
		*/

		@ColumnInfo(comment="用户头像",type="varchar(200)")
		private String yonghuPhoto;
		/**
		* 余额
		*/
		@ColumnInfo(comment="余额",type="decimal(10,2)")
		private Double newMoney;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String yonghuEmail;



	public GonglueCollectionView() {

	}

	public GonglueCollectionView(GonglueCollectionEntity gonglueCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, gonglueCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 类型的值
	*/
	public String getGonglueCollectionValue() {
		return gonglueCollectionValue;
	}
	/**
	* 设置： 类型的值
	*/
	public void setGonglueCollectionValue(String gonglueCollectionValue) {
		this.gonglueCollectionValue = gonglueCollectionValue;
	}


	//级联表的get和set 旅游攻略

		/**
		* 获取： 攻略名称
		*/
		public String getGonglueName() {
			return gonglueName;
		}
		/**
		* 设置： 攻略名称
		*/
		public void setGonglueName(String gonglueName) {
			this.gonglueName = gonglueName;
		}

		/**
		* 获取： 攻略编号
		*/
		public String getGonglueUuidNumber() {
			return gonglueUuidNumber;
		}
		/**
		* 设置： 攻略编号
		*/
		public void setGonglueUuidNumber(String gonglueUuidNumber) {
			this.gonglueUuidNumber = gonglueUuidNumber;
		}

		/**
		* 获取： 攻略照片
		*/
		public String getGongluePhoto() {
			return gongluePhoto;
		}
		/**
		* 设置： 攻略照片
		*/
		public void setGongluePhoto(String gongluePhoto) {
			this.gongluePhoto = gongluePhoto;
		}

		/**
		* 获取： 出发地点
		*/
		public String getGonglueChuAddress() {
			return gonglueChuAddress;
		}
		/**
		* 设置： 出发地点
		*/
		public void setGonglueChuAddress(String gonglueChuAddress) {
			this.gonglueChuAddress = gonglueChuAddress;
		}

		/**
		* 获取： 途径地
		*/
		public String getGonglueTujingAddress() {
			return gonglueTujingAddress;
		}
		/**
		* 设置： 途径地
		*/
		public void setGonglueTujingAddress(String gonglueTujingAddress) {
			this.gonglueTujingAddress = gonglueTujingAddress;
		}

		/**
		* 获取： 目的地点
		*/
		public String getGonglueMuAddress() {
			return gonglueMuAddress;
		}
		/**
		* 设置： 目的地点
		*/
		public void setGonglueMuAddress(String gonglueMuAddress) {
			this.gonglueMuAddress = gonglueMuAddress;
		}

		/**
		* 获取： 赞
		*/
		public Integer getZanNumber() {
			return zanNumber;
		}
		/**
		* 设置： 赞
		*/
		public void setZanNumber(Integer zanNumber) {
			this.zanNumber = zanNumber;
		}

		/**
		* 获取： 踩
		*/
		public Integer getCaiNumber() {
			return caiNumber;
		}
		/**
		* 设置： 踩
		*/
		public void setCaiNumber(Integer caiNumber) {
			this.caiNumber = caiNumber;
		}

		/**
		* 获取： 历史介绍
		*/
		public String getGonglueContent() {
			return gonglueContent;
		}
		/**
		* 设置： 历史介绍
		*/
		public void setGonglueContent(String gonglueContent) {
			this.gonglueContent = gonglueContent;
		}

		/**
		* 获取： 现代简介
		*/
		public String getGonglueXiandaiContent() {
			return gonglueXiandaiContent;
		}
		/**
		* 设置： 现代简介
		*/
		public void setGonglueXiandaiContent(String gonglueXiandaiContent) {
			this.gonglueXiandaiContent = gonglueXiandaiContent;
		}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getGonglueDelete() {
			return gonglueDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setGonglueDelete(Integer gonglueDelete) {
			this.gonglueDelete = gonglueDelete;
		}
	//级联表的get和set 用户

		/**
		* 获取： 用户姓名
		*/
		public String getYonghuName() {
			return yonghuName;
		}
		/**
		* 设置： 用户姓名
		*/
		public void setYonghuName(String yonghuName) {
			this.yonghuName = yonghuName;
		}

		/**
		* 获取： 用户手机号
		*/
		public String getYonghuPhone() {
			return yonghuPhone;
		}
		/**
		* 设置： 用户手机号
		*/
		public void setYonghuPhone(String yonghuPhone) {
			this.yonghuPhone = yonghuPhone;
		}

		/**
		* 获取： 用户身份证号
		*/
		public String getYonghuIdNumber() {
			return yonghuIdNumber;
		}
		/**
		* 设置： 用户身份证号
		*/
		public void setYonghuIdNumber(String yonghuIdNumber) {
			this.yonghuIdNumber = yonghuIdNumber;
		}

		/**
		* 获取： 用户头像
		*/
		public String getYonghuPhoto() {
			return yonghuPhoto;
		}
		/**
		* 设置： 用户头像
		*/
		public void setYonghuPhoto(String yonghuPhoto) {
			this.yonghuPhoto = yonghuPhoto;
		}

		/**
		* 获取： 余额
		*/
		public Double getNewMoney() {
			return newMoney;
		}
		/**
		* 设置： 余额
		*/
		public void setNewMoney(Double newMoney) {
			this.newMoney = newMoney;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getYonghuEmail() {
			return yonghuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setYonghuEmail(String yonghuEmail) {
			this.yonghuEmail = yonghuEmail;
		}


	@Override
	public String toString() {
		return "GonglueCollectionView{" +
			", gonglueCollectionValue=" + gonglueCollectionValue +
			", gonglueName=" + gonglueName +
			", gonglueUuidNumber=" + gonglueUuidNumber +
			", gongluePhoto=" + gongluePhoto +
			", gonglueChuAddress=" + gonglueChuAddress +
			", gonglueTujingAddress=" + gonglueTujingAddress +
			", gonglueMuAddress=" + gonglueMuAddress +
			", zanNumber=" + zanNumber +
			", caiNumber=" + caiNumber +
			", gonglueContent=" + gonglueContent +
			", gonglueXiandaiContent=" + gonglueXiandaiContent +
			", gonglueDelete=" + gonglueDelete +
			", yonghuName=" + yonghuName +
			", yonghuPhone=" + yonghuPhone +
			", yonghuIdNumber=" + yonghuIdNumber +
			", yonghuPhoto=" + yonghuPhoto +
			", newMoney=" + newMoney +
			", yonghuEmail=" + yonghuEmail +
			"} " + super.toString();
	}
}
