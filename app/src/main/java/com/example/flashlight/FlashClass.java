package com.example.flashlight;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;

public class FlashClass {

    private boolean status = false;
    private Context context;

    public FlashClass(Context context) {
        this.context = context;
    }

    public void FlashOn () {
        CameraManager cameraManager = (CameraManager) context.getSystemService(context.CAMERA_SERVICE);
        try {
            String cameraId = cameraManager.getCameraIdList()[0];
            cameraManager.setTorchMode(cameraId, true);
            status = true;
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

    }

    public void FlashOff () {
        CameraManager cameraManager = (CameraManager) context.getSystemService(context.CAMERA_SERVICE);
        try {
            String cameraId = cameraManager.getCameraIdList()[0];
            cameraManager.setTorchMode(cameraId, false);
            status = false;
        } catch (CameraAccessException e) {
            e.printStackTrace();
        }

    }

    public boolean isStatus() {
        return status;
    }
}
