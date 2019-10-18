package com.gustiramadhan.earthquakereport;

public class EarthQuake {
    private double mMagnitude;
    private String mLocation;
    private Long mTimeMillSecond;
    private String mUrl;

    /**
     *
     * @param mMagnitude menjelaskan besarnya gempa
     * @param mLocation location gempa
     * @param mTimeMillSecond waktu pelaksanaa gempa
     * @param mUrl sumber informasi website
     */

    public EarthQuake(double mMagnitude, String mLocation, Long mTimeMillSecond, String mUrl) {
        this.mMagnitude = mMagnitude;
        this.mLocation = mLocation;
        this.mTimeMillSecond = mTimeMillSecond;
        this.mUrl = mUrl;
    }

    public double getmMagnitude() {
        return mMagnitude;
    }

    public String getmLocation() {
        return mLocation;
    }

    public Long getmTimeMillSecond() {
        return mTimeMillSecond;
    }

    public String getmUrl() {
        return mUrl;
    }
}
