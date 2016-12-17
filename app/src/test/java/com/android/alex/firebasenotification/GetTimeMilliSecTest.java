package com.android.alex.firebasenotification;

import com.android.alex.firebasenotification.util.NotificationUtils;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by Alex on 15/11/2016.
 */

public class GetTimeMilliSecTest {

    String correctTimestamp;
    String wrongTimestamp;

    @Before
    public void setup() throws ParseException {
        correctTimestamp = "2016-11-15 13:25:00";
        wrongTimestamp = "13:25:00 2016-11-15";
    }

    @Test
    public void getTimeMilliSec_correct() throws Exception {
        long result = NotificationUtils.getTimeMilliSec(correctTimestamp);
        assertTrue("Error!", result > 0);
    }

    @Test
    public void getTimeMilliSec_error() {
        long result = NotificationUtils.getTimeMilliSec(wrongTimestamp);
        assertTrue("Error!", result == 0);
    }
}
