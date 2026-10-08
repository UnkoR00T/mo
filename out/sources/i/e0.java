package i;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraExtensionCharacteristics;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.ExtensionSessionConfiguration;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001d\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b\u001d\u0010\u001eJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\"\u0010#J7\u0010*\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00142\u000e\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140\u00042\u0006\u0010,\u001a\u00020!H\u0007¢\u0006\u0004\b-\u0010.¨\u0006/"}, d2 = {"Li/e0;", "", "<init>", "()V", "", "Li/j3;", "inputConfigData", "", "cameraId", "Landroid/hardware/camera2/params/InputConfiguration;", "g", "(Ljava/util/List;Ljava/lang/String;)Landroid/hardware/camera2/params/InputConfiguration;", "Landroid/hardware/camera2/TotalCaptureResult;", "totalCaptureResult", "", "Landroid/hardware/camera2/CaptureResult;", "d", "(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/util/Map;", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputConfiguration", "", "sensorPixelMode", "Loq/i0;", "a", "(Landroid/hardware/camera2/params/OutputConfiguration;I)V", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroid/hardware/camera2/params/ExtensionSessionConfiguration;", "extensionConfiguration", "b", "(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/params/ExtensionSessionConfiguration;)V", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraExtensionCharacteristics;", "c", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;)Landroid/hardware/camera2/CameraExtensionCharacteristics;", "extensionMode", "outputs", "Ljava/util/concurrent/Executor;", "executor", "Landroid/hardware/camera2/CameraExtensionSession$StateCallback;", "stateCallback", "f", "(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraExtensionSession$StateCallback;)Landroid/hardware/camera2/params/ExtensionSessionConfiguration;", "extensionCharacteristics", "e", "(Landroid/hardware/camera2/CameraExtensionCharacteristics;)Ljava/util/List;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f87075a = new e0();

    private e0() {
    }

    public static final void a(OutputConfiguration outputConfiguration, int sensorPixelMode) {
        outputConfiguration.addSensorPixelModeUsed(sensorPixelMode);
    }

    public static final void b(CameraDevice cameraDevice, ExtensionSessionConfiguration extensionConfiguration) throws CameraAccessException {
        cameraDevice.createExtensionSession(extensionConfiguration);
    }

    public static final CameraExtensionCharacteristics c(CameraManager cameraManager, String cameraId) {
        return cameraManager.getCameraExtensionCharacteristics(cameraId);
    }

    public static final Map<String, CaptureResult> d(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraTotalResults();
    }

    public static final List<Integer> e(CameraExtensionCharacteristics extensionCharacteristics) {
        return extensionCharacteristics.getSupportedExtensions();
    }

    public static final ExtensionSessionConfiguration f(int extensionMode, List<OutputConfiguration> outputs, Executor executor, CameraExtensionSession$StateCallback stateCallback) {
        return z.a(extensionMode, outputs, executor, stateCallback);
    }

    public static final InputConfiguration g(List<InputConfigData> inputConfigData, String cameraId) {
        if (inputConfigData.isEmpty()) {
            throw new IllegalStateException("Call to create InputConfiguration but list of InputConfigData is empty.");
        }
        if (inputConfigData.size() == 1) {
            InputConfigData inputConfigData2 = (InputConfigData) pq.v.l0(inputConfigData);
            return new InputConfiguration(inputConfigData2.getWidth(), inputConfigData2.getHeight(), inputConfigData2.getFormat());
        }
        List<InputConfigData> list = inputConfigData;
        ArrayList arrayList = new ArrayList(pq.v.y(list, 10));
        for (InputConfigData inputConfigData3 : list) {
            c0.a();
            arrayList.add(a0.a(inputConfigData3.getWidth(), inputConfigData3.getHeight(), cameraId));
        }
        d0.a();
        return b0.a(arrayList, ((InputConfigData) pq.v.l0(inputConfigData)).getFormat());
    }
}
