package com.ea.eamobile.nfsmw.view;

import java.io.Serializable;
import java.util.List;

public class CarView implements Serializable {

    private static final long serialVersionUID = 1L;

    private String carId;

    private int type;

    private int tier;

    private int score;

    private int status;

    private int price;

    private boolean isLock;

    private int chartletId;
    
    private int priceType;
    
    private int unlockMwNum;
    
    private long remainTime;
    
    private int sellFlag;
    
    private boolean isSpecialCar;
    
    private List<CarSlotView> slots;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getTier() {
        return tier;
    }

    public void setTier(int tier) {
        this.tier = tier;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isLock() {
        return isLock;
    }

    public void setLock(boolean isLock) {
        this.isLock = isLock;
    }

    public int getChartletId() {
        return chartletId;
    }

    public void setChartletId(int chartletId) {
        this.chartletId = chartletId;
    }

    public List<CarSlotView> getSlots() {
        return slots;
    }

    public void setSlots(List<CarSlotView> slots) {
        this.slots = slots;
    }
    
    public int getPriceType() {
        return priceType;
    }

    public void setPriceType(int priceType) {
        this.priceType = priceType;
    }
    
    public int getUnlockMwNum() {
        return unlockMwNum;
    }

    public void setUnlockMwNum(int unlockMwNum) {
        this.unlockMwNum = unlockMwNum;
    }
    
    public long getRemainTime() {
        return remainTime;
    }

    public void setRemainTime(long remainTime) {
        this.remainTime = remainTime;
    }
    
    public int getSellFlag() {
        return sellFlag;
    }

    public void setSellFlag(int sellFlag) {
        this.sellFlag = sellFlag;
    }

    public boolean getIsSpecialCar() {
        return isSpecialCar;
    }

    public void setIsSpecialCar(boolean isSpecialCar) {
        this.isSpecialCar = isSpecialCar;
    }
    
    @Override
    public String toString() {
        return "carview=[carId=" + carId + ",tier=" + tier + ",type=" + type + ",score=" + score + ",price=" + price
                + ",islock=" + isLock + ",status=" + status + ",chartletid=" + chartletId + "]";
    }
}
