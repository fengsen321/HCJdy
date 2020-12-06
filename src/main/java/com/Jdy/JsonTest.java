/**
 * 
 */
package com.Jdy;

import java.time.LocalDateTime;

/**
 * @author ·ëÉ­
 *
 */
public class JsonTest {
	
		private Creator creator;
		private Updater updater;
		
		
		
		
		public Creator getCreator() {
			return creator;
		}


		public void setCreator(Creator creator) {
			this.creator = creator;
		}


		public Updater getUpdater() {
			return updater;
		}


		public void setUpdater(Updater updater) {
			this.updater = updater;
		}
		
		



		static class Creator{
			private String _id;
			private String name;
			private String username;
			public String get_id() {
				return _id;
			}
			public void set_id(String _id) {
				this._id = _id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			@Override
			public String toString() {
				return "Creator [_id=" + _id + ", name=" + name + ", username=" + username + "]";
			}
			
			
			
		}
		
		
		static class Updater{
	
			private String _id;
			private String name;
			private String username;
			public String get_id() {
				return _id;
			}
			public void set_id(String _id) {
				this._id = _id;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getUsername() {
				return username;
			}
			public void setUsername(String username) {
				this.username = username;
			}
			@Override
			public String toString() {
				return "Updater [_id=" + _id + ", name=" + name + ", username=" + username + "]";
			}
				
				
				
			
		}
		
		
		
		private String deleter;
		private LocalDateTime createTime;
		private LocalDateTime updatetTime;
		private LocalDateTime deleteTime;
		
		private String _widget_1604306341895;
		private String _widget_1604306341908;
		private String _widget_1604306342003;
		private String _widget_1604306342560;
	
		private String _widget_1605066456937;
		private String _widget_1604306342958;
		private String _widget_1605066457240;
		private String _widget_1605066457312;
		private String _widget_1605066457947;
		private String _widget_1604738353091;
		private String _widget_1604738353138;
		private String _id;
		private String appId;
		private String entryId;
		private String _widget_1604743074854;
		private String _widget_1604743074449;
		private String _widget_1605076063581;
		private String _widget_1604307996395;
		private String _widget_1604307996409;
		private String _widget_1605066457554;
		private String _widget_1604307996625;
		private String _widget_1605066457950;
		private String _widget_1605066457954;
		private String _widget_1605076063930;
		private String _widget_1605066457949;
		private String _widget_1605066457948;
		private String _widget_1605066457953;
		private String _widget_1605066457951;
		
		
		public String getDeleter() {
			return deleter;
		}


		public void setDeleter(String deleter) {
			this.deleter = deleter;
		}


		public LocalDateTime getCreateTime() {
			return createTime;
		}


		public void setCreateTime(LocalDateTime createTime) {
			this.createTime = createTime;
		}


		public LocalDateTime getUpdatetTime() {
			return updatetTime;
		}


		public void setUpdatetTime(LocalDateTime updatetTime) {
			this.updatetTime = updatetTime;
		}


		public LocalDateTime getDeleteTime() {
			return deleteTime;
		}


		public void setDeleteTime(LocalDateTime deleteTime) {
			this.deleteTime = deleteTime;
		}


		public String get_widget_1604306341895() {
			return _widget_1604306341895;
		}


		public void set_widget_1604306341895(String _widget_1604306341895) {
			this._widget_1604306341895 = _widget_1604306341895;
		}


		public String get_widget_1604306341908() {
			return _widget_1604306341908;
		}


		public void set_widget_1604306341908(String _widget_1604306341908) {
			this._widget_1604306341908 = _widget_1604306341908;
		}


		public String get_widget_1604306342003() {
			return _widget_1604306342003;
		}


		public void set_widget_1604306342003(String _widget_1604306342003) {
			this._widget_1604306342003 = _widget_1604306342003;
		}


		public String get_widget_1604306342560() {
			return _widget_1604306342560;
		}


		public void set_widget_1604306342560(String _widget_1604306342560) {
			this._widget_1604306342560 = _widget_1604306342560;
		}


		public String get_widget_1605066456937() {
			return _widget_1605066456937;
		}


		public void set_widget_1605066456937(String _widget_1605066456937) {
			this._widget_1605066456937 = _widget_1605066456937;
		}


		public String get_widget_1604306342958() {
			return _widget_1604306342958;
		}


		public void set_widget_1604306342958(String _widget_1604306342958) {
			this._widget_1604306342958 = _widget_1604306342958;
		}


		public String get_widget_1605066457240() {
			return _widget_1605066457240;
		}


		public void set_widget_1605066457240(String _widget_1605066457240) {
			this._widget_1605066457240 = _widget_1605066457240;
		}


		public String get_widget_1605066457312() {
			return _widget_1605066457312;
		}


		public void set_widget_1605066457312(String _widget_1605066457312) {
			this._widget_1605066457312 = _widget_1605066457312;
		}


		public String get_widget_1605066457947() {
			return _widget_1605066457947;
		}


		public void set_widget_1605066457947(String _widget_1605066457947) {
			this._widget_1605066457947 = _widget_1605066457947;
		}


		public String get_widget_1604738353091() {
			return _widget_1604738353091;
		}


		public void set_widget_1604738353091(String _widget_1604738353091) {
			this._widget_1604738353091 = _widget_1604738353091;
		}


		public String get_widget_1604738353138() {
			return _widget_1604738353138;
		}


		public void set_widget_1604738353138(String _widget_1604738353138) {
			this._widget_1604738353138 = _widget_1604738353138;
		}


		public String get_widget_1604743074854() {
			return _widget_1604743074854;
		}


		public void set_widget_1604743074854(String _widget_1604743074854) {
			this._widget_1604743074854 = _widget_1604743074854;
		}


		public String get_widget_1604743074449() {
			return _widget_1604743074449;
		}


		public void set_widget_1604743074449(String _widget_1604743074449) {
			this._widget_1604743074449 = _widget_1604743074449;
		}


		public String get_widget_1605076063581() {
			return _widget_1605076063581;
		}


		public void set_widget_1605076063581(String _widget_1605076063581) {
			this._widget_1605076063581 = _widget_1605076063581;
		}


		public String get_widget_1604307996395() {
			return _widget_1604307996395;
		}


		public void set_widget_1604307996395(String _widget_1604307996395) {
			this._widget_1604307996395 = _widget_1604307996395;
		}


		public String get_widget_1604307996409() {
			return _widget_1604307996409;
		}


		public void set_widget_1604307996409(String _widget_1604307996409) {
			this._widget_1604307996409 = _widget_1604307996409;
		}


		public String get_widget_1605066457554() {
			return _widget_1605066457554;
		}


		public void set_widget_1605066457554(String _widget_1605066457554) {
			this._widget_1605066457554 = _widget_1605066457554;
		}


		public String get_widget_1604307996625() {
			return _widget_1604307996625;
		}


		public void set_widget_1604307996625(String _widget_1604307996625) {
			this._widget_1604307996625 = _widget_1604307996625;
		}


		public String get_widget_1605066457950() {
			return _widget_1605066457950;
		}


		public void set_widget_1605066457950(String _widget_1605066457950) {
			this._widget_1605066457950 = _widget_1605066457950;
		}


		public String get_widget_1605066457954() {
			return _widget_1605066457954;
		}


		public void set_widget_1605066457954(String _widget_1605066457954) {
			this._widget_1605066457954 = _widget_1605066457954;
		}


		public String get_widget_1605076063930() {
			return _widget_1605076063930;
		}


		public void set_widget_1605076063930(String _widget_1605076063930) {
			this._widget_1605076063930 = _widget_1605076063930;
		}


		public String get_widget_1605066457949() {
			return _widget_1605066457949;
		}


		public void set_widget_1605066457949(String _widget_1605066457949) {
			this._widget_1605066457949 = _widget_1605066457949;
		}


		public String get_widget_1605066457948() {
			return _widget_1605066457948;
		}


		public void set_widget_1605066457948(String _widget_1605066457948) {
			this._widget_1605066457948 = _widget_1605066457948;
		}


		public String get_widget_1605066457953() {
			return _widget_1605066457953;
		}


		public void set_widget_1605066457953(String _widget_1605066457953) {
			this._widget_1605066457953 = _widget_1605066457953;
		}


		public String get_widget_1605066457951() {
			return _widget_1605066457951;
		}


		public void set_widget_1605066457951(String _widget_1605066457951) {
			this._widget_1605066457951 = _widget_1605066457951;
		}


		public String get_id() {
			return _id;
		}


		public void set_id(String _id) {
			this._id = _id;
		}


		public String getAppId() {
			return appId;
		}


		public void setAppId(String appId) {
			this.appId = appId;
		}


		public String getEntryId() {
			return entryId;
		}


		public void setEntryId(String entryId) {
			this.entryId = entryId;
		}


		@Override
		public String toString() {
			return "JsonTest [creator=" + creator + ", updater=" + updater + ", deleter=" + deleter + ", createTime="
					+ createTime + ", updatetTime=" + updatetTime + ", deleteTime=" + deleteTime
					+ ", _widget_1604306341895=" + _widget_1604306341895 + ", _widget_1604306341908="
					+ _widget_1604306341908 + ", _widget_1604306342003=" + _widget_1604306342003
					+ ", _widget_1604306342560=" + _widget_1604306342560 + ", _widget_1605066456937="
					+ _widget_1605066456937 + ", _widget_1604306342958=" + _widget_1604306342958
					+ ", _widget_1605066457240=" + _widget_1605066457240 + ", _widget_1605066457312="
					+ _widget_1605066457312 + ", _widget_1605066457947=" + _widget_1605066457947
					+ ", _widget_1604738353091=" + _widget_1604738353091 + ", _widget_1604738353138="
					+ _widget_1604738353138 + ", _id=" + _id + ", appId=" + appId + ", entryId=" + entryId
					+ ", _widget_1604743074854=" + _widget_1604743074854 + ", _widget_1604743074449="
					+ _widget_1604743074449 + ", _widget_1605076063581=" + _widget_1605076063581
					+ ", _widget_1604307996395=" + _widget_1604307996395 + ", _widget_1604307996409="
					+ _widget_1604307996409 + ", _widget_1605066457554=" + _widget_1605066457554
					+ ", _widget_1604307996625=" + _widget_1604307996625 + ", _widget_1605066457950="
					+ _widget_1605066457950 + ", _widget_1605066457954=" + _widget_1605066457954
					+ ", _widget_1605076063930=" + _widget_1605076063930 + ", _widget_1605066457949="
					+ _widget_1605066457949 + ", _widget_1605066457948=" + _widget_1605066457948
					+ ", _widget_1605066457953=" + _widget_1605066457953 + ", _widget_1605066457951="
					+ _widget_1605066457951 + "]";
		}
		
		
	

}
