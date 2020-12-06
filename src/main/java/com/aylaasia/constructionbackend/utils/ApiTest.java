package com.aylaasia.constructionbackend.utils;


import java.time.LocalDateTime;


public class ApiTest {
	

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

	    public LocalDateTime getUpdateTime() {
	        return updateTime;
	    }

	    public void setUpdateTime(LocalDateTime updateTime) {
	        this.updateTime = updateTime;
	    }

	    public LocalDateTime getDeleteTime() {
	        return deleteTime;
	    }

	    public void setDeleteTime(LocalDateTime deleteTime) {
	        this.deleteTime = deleteTime;
	    }

	    public String get_widget_1557886562320() {
	        return _widget_1557886562320;
	    }

	    public void set_widget_1557886562320(String _widget_1557886562320) {
	        this._widget_1557886562320 = _widget_1557886562320;
	    }

	    public String get_widget_1557886562335() {
	        return _widget_1557886562335;
	    }

	    public void set_widget_1557886562335(String _widget_1557886562335) {
	        this._widget_1557886562335 = _widget_1557886562335;
	    }

	    public String get_widget_1557886562350() {
	        return _widget_1557886562350;
	    }

	    public void set_widget_1557886562350(String _widget_1557886562350) {
	        this._widget_1557886562350 = _widget_1557886562350;
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
	        return "ApiTest{" +
	                "creator=" + creator +
	                ", updater=" + updater +
	                ", deleter='" + deleter + '\'' +
	                ", createTime=" + createTime +
	                ", updateTime=" + updateTime +
	                ", deleteTime=" + deleteTime +
	                ", _widget_1557886562320='" + _widget_1557886562320 + '\'' +
	                ", _widget_1557886562335='" + _widget_1557886562335 + '\'' +
	                ", _widget_1557886562350='" + _widget_1557886562350 + '\'' +
	                ", _id='" + _id + '\'' +
	                ", appId='" + appId + '\'' +
	                ", entryId='" + entryId + '\'' +
	                '}';
	    }
	    
	     static class Creator{
	        private String _id;
	        private String name;
	        private String userName;

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

	        public String getUserName() {
	            return userName;
	        }

	        public void setUserName(String userName) {
	            this.userName = userName;
	        }

	        @Override
	        public String toString() {
	            return "Creator{" +
	                    "_id='" + _id + '\'' +
	                    ", name='" + name + '\'' +
	                    ", userName='" + userName + '\'' +
	                    '}';
	        }
	    }
	    
	    static class Updater{
	        private String _id;
	        private String name;
	        private String userName;

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

	        public String getUserName() {
	            return userName;
	        }

	        public void setUserName(String userName) {
	            this.userName = userName;
	        }

	        @Override
	        public String toString() {
	            return "Updater{" +
	                    "_id='" + _id + '\'' +
	                    ", name='" + name + '\'' +
	                    ", userName='" + userName + '\'' +
	                    '}';
	        }
	    }

	    private String deleter;

	    private LocalDateTime createTime;

	    private LocalDateTime updateTime;

	    private LocalDateTime deleteTime;

	    private String _widget_1557886562320;

	    private String _widget_1557886562335;

	    private String _widget_1557886562350;

	    private String _id;

	    private String appId;

	    private String entryId;
	
   
}