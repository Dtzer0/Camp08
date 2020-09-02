package com.example.myparcelable;

import android.os.Parcel;
import android.os.Parcelable;

public class SimpleData implements Parcelable {

    //멤버변수
    int number;
    String message;

    //생성자 등..
    public SimpleData(int number, String message) {
        this.number = number;
        this.message = message;
    }

    //멤버메서드

    protected SimpleData(Parcel in) {
        number = in.readInt();
        message = in.readString();
    }

    public static final Creator<SimpleData> CREATOR = new Creator<SimpleData>() {
        @Override
        public SimpleData createFromParcel(Parcel in) {
            return new SimpleData(in);
        }

        @Override
        public SimpleData[] newArray(int size) {
            return new SimpleData[size];
        }
    };

    public void setNumber(int number) {
        this.number = number;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getNumber() {
        return number;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(number);
        dest.writeString(message);
    }
}
