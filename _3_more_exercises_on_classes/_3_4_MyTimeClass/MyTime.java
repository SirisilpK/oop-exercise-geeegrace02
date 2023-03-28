public class MyTime {
    private int hour = 0;
    private int minute = 0;
    private int second = 0;

    public MyTime(){}

    public MyTime(int hour, int minute, int second){
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public void setTime(int hour,int minute, int second){
        //check if the given hour, minute and second are valid before setting the instance variables.
        if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }

    public void setHour(int hour) {
        //check if the hour is valid
        if (hour >= 0 && hour <= 23) {
            this.hour = hour;
        }
    }

    public int getHour() {
        return this.hour;
    }

    public void setMinute(int minute) {
        //check if the minute is valid
        if (minute >= 0 && minute <= 59) {
            this.minute = minute;
        }
    }

    public int getMinute() {
        return this.minute;
    }

    public void setSecond(int second) {
        //check if the second is valid
        if (second >= 0 && second <= 59) {
            this.second = second;
        }
    }

    public int getSecond() {
        return this.second;
    }

    public String toString(){
        // convert to String
        String hr = Integer.toString(this.getHour());
        String min = Integer.toString(this.getMinute());
        String sec = Integer.toString(this.getSecond());

        //add "0" to the front if they are smaller than 10
        if (this.getHour() < 10) {
            hr = "0" + Integer.toString(this.getHour());
        }
        if (this.getMinute() < 10) {
            min = "0" + Integer.toString(this.getMinute());
        }
        if (this.getSecond() < 10) {
            sec = "0" + Integer.toString(this.getSecond());
        }
        return (hr + ":" + min + ":" + sec);
    }


    //Update this instance to the next second
    public MyTime nextSecond() {
        if (this.getSecond() != 59) {
            this.setSecond(this.getSecond() + 1);
        } else {
            this.setSecond(0);
            if (this.getMinute() != 59) {
                this.setMinute(this.getMinute() + 1);
            } else {
                this.setMinute(0);
                if (this.getHour() != 23) {
                    this.setHour(this.getHour() + 1);
                } else {
                    this.setHour(0);
                }
            }
        }
        return this;
    }

    //Update this instance to the previous second
    public MyTime previousSecond() {
        if (this.getSecond() != 0) {
            this.setSecond(this.getSecond() - 1);
            return this;
        } else {
            this.setSecond(59);
            if (this.getMinute() != 0) {
                this.setMinute(this.getMinute() - 1);
                return this;
            } else {
                this.setMinute(59);
                if (this.getHour() != 0) {
                    this.setHour(this.getHour() - 1);
                    return this;
                } else {
                    this.setHour(23);
                }
            }
        }
        return this;
    }

    //Update this instance to the next minute
    public MyTime nextMinute() {
        if (this.getMinute() != 59) {
            this.setMinute(this.getMinute() + 1);
        } else {
            this.setMinute(0);
            if (this.getHour() != 23) {
                this.setHour(this.getHour() + 1);
            } else {
                this.setHour(0);
            }
        }
        return this;
    }

    //Update this instance to the previous minute
    public MyTime previousMinute() {
        if (this.getMinute() != 0) {
            this.setMinute(this.getMinute() - 1);
        } else {
            this.setMinute(59);
            if (this.getHour() != 0) {
                this.setHour(this.getHour() - 1);
            } else {
                this.setHour(23);
            }
        }
        return this;
    }

    //Update this instance to the next hour
    public MyTime nextHour() {
        if (this.getHour() != 23) {
            this.setHour(this.getHour() + 1);
        } else {
            this.setHour(0);
        }
        return this;
    }

    //Update this instance to the previous hour
    public MyTime previousHour() {
        if (this.getHour() != 0) {
            this.setHour(this.getHour() - 1);
        } else {
            this.setHour(23);
        }
        return this;
    }
}