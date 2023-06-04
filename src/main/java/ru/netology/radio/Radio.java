package ru.netology.radio;

public class Radio {

    //Номер текущей радиостанции

    public int currentRadioStation;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    int setToMaxRadioStation() {
        return currentRadioStation = 9;
    }

    int setToMinRadioStation() {
        return currentRadioStation = 0;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation <= 0) {
            setToMinRadioStation();
            return;
        }
        if (newCurrentRadioStation >= 9) {
            setToMaxRadioStation();
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        if (currentRadioStation < 9) {
            setCurrentRadioStation(currentRadioStation + 1);
        } else {
            setToMinRadioStation();
        }
    }

    public void prevRadioStation() {
        if (currentRadioStation > 0) {
            setCurrentRadioStation(currentRadioStation - 1);
        } else {
            setToMaxRadioStation();
        }
    }

    //Громкость звука

    public int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    int setToMaxVolume() {
        return currentVolume = 100;
    }

    int setToMinVolume() {
        return currentVolume = 0;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume <= 0) {
            setToMinVolume();
            return;
        }
        if (newCurrentVolume >= 100) {
            setToMaxVolume();
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void augmentVolume() {
        if (currentVolume < 100) {
            setCurrentVolume(currentVolume + 1);
        } else {
            setToMaxVolume();
        }
    }

    public void decrementVolume() {
        if (currentVolume > 0) {
            setCurrentVolume(currentVolume - 1);
        } else {
            setToMinVolume();
        }
    }
}