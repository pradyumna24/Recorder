package com.example.recorder;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.PermissionChecker;
import android.view.View;

import com.example.recorder.activity.CameraActivity;

public class MainActivity extends Activity {

    private static final int REQUEST_CODE_FOR_RECORD_VIDEO = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button_camera).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (PermissionChecker.checkSelfPermission(MainActivity.this, Manifest.permission.CAMERA)
                        == PackageManager.PERMISSION_DENIED) {
                    ActivityCompat.requestPermissions(MainActivity.this, new String[]{Manifest.permission.CAMERA},
                            v.getId());
                } else {
                    startActivity(v.getId());
                }
            }
        });

        findViewById(R.id.btnRecord).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                VideoCameraActivity.startActivityForResult(MainActivity.this, REQUEST_CODE_FOR_RECORD_VIDEO);
            }
        });
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions,
                                           int[] grantResults) {
        if (grantResults.length != 1 || grantResults[0] == PackageManager.PERMISSION_GRANTED) {
            startActivity(requestCode);
        } else {
            super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    private void startActivity(int id) {
        switch (id) {
            case R.id.button_camera:
                startActivity(new Intent(this, CameraActivity.class));
                break;
            default:
                break;
        }
    }
}
