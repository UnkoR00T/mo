package i;

import android.hardware.HardwareBuffer;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.hardware.camera2.params.SessionConfiguration;
import android.media.Image;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000f\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0011\u001a\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0011\u0010\u0010J\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u0014\u0010\u0015J%\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ7\u0010$\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u001c2\u000e\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\r2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"H\u0007¢\u0006\u0004\b$\u0010%J\u001f\u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010'\u001a\u00020&H\u0007¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*H\u0007¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020\u001c2\u0006\u0010.\u001a\u00020\u001eH\u0007¢\u0006\u0004\b/\u00100J!\u00102\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u001e2\b\u00101\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b2\u00103J/\u00108\u001a\u00020\b2\u0006\u00105\u001a\u0002042\u0006\u00101\u001a\u00020\u00132\u0006\u0010!\u001a\u00020 2\u0006\u00107\u001a\u000206H\u0007¢\u0006\u0004\b8\u00109J'\u0010;\u001a\u00020\b2\u0006\u00105\u001a\u0002042\u0006\u0010!\u001a\u00020 2\u0006\u00107\u001a\u00020:H\u0007¢\u0006\u0004\b;\u0010<J1\u0010B\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010=*\u00020\u00012\u0006\u0010?\u001a\u00020>2\f\u0010A\u001a\b\u0012\u0004\u0012\u00028\u00000@H\u0007¢\u0006\u0004\bB\u0010C¨\u0006D"}, d2 = {"Li/w;", "", "<init>", "()V", "Landroid/hardware/camera2/CameraDevice;", "cameraDevice", "Landroid/hardware/camera2/params/SessionConfiguration;", "sessionConfig", "Loq/i0;", "a", "(Landroid/hardware/camera2/CameraDevice;Landroid/hardware/camera2/params/SessionConfiguration;)V", "Landroid/hardware/camera2/CameraCharacteristics;", "cameraCharacteristics", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "b", "(Landroid/hardware/camera2/CameraCharacteristics;)Ljava/util/List;", "c", "", "", "e", "(Landroid/hardware/camera2/CameraCharacteristics;)Ljava/util/Set;", "Landroid/hardware/camera2/TotalCaptureResult;", "totalCaptureResult", "", "Landroid/hardware/camera2/CaptureResult;", "f", "(Landroid/hardware/camera2/TotalCaptureResult;)Ljava/util/Map;", "", "sessionType", "Landroid/hardware/camera2/params/OutputConfiguration;", "outputs", "Ljava/util/concurrent/Executor;", "executor", "Landroid/hardware/camera2/CameraCaptureSession$StateCallback;", "stateCallback", "g", "(ILjava/util/List;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraCaptureSession$StateCallback;)Landroid/hardware/camera2/params/SessionConfiguration;", "Landroid/hardware/camera2/params/InputConfiguration;", "inputConfig", "j", "(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/hardware/camera2/params/InputConfiguration;)V", "Landroid/hardware/camera2/CaptureRequest;", "params", "l", "(Landroid/hardware/camera2/params/SessionConfiguration;Landroid/hardware/camera2/CaptureRequest;)V", "outputConfig", "d", "(Landroid/hardware/camera2/params/OutputConfiguration;)I", "cameraId", "k", "(Landroid/hardware/camera2/params/OutputConfiguration;Ljava/lang/String;)V", "Landroid/hardware/camera2/CameraManager;", "cameraManager", "Landroid/hardware/camera2/CameraDevice$StateCallback;", "callback", "h", "(Landroid/hardware/camera2/CameraManager;Ljava/lang/String;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraDevice$StateCallback;)V", "Landroid/hardware/camera2/CameraManager$AvailabilityCallback;", "i", "(Landroid/hardware/camera2/CameraManager;Ljava/util/concurrent/Executor;Landroid/hardware/camera2/CameraManager$AvailabilityCallback;)V", "T", "Landroid/media/Image;", "image", "Lmr/c;", "type", "m", "(Landroid/media/Image;Lmr/c;)Ljava/lang/Object;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f87465a = new w();

    private w() {
    }

    public static final void a(CameraDevice cameraDevice, SessionConfiguration sessionConfig) throws CameraAccessException {
        cameraDevice.createCaptureSession(sessionConfig);
    }

    public static final List<CaptureRequest.Key<?>> b(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailablePhysicalCameraRequestKeys();
    }

    public static final List<CaptureRequest.Key<?>> c(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getAvailableSessionKeys();
    }

    public static final int d(OutputConfiguration outputConfig) {
        return outputConfig.getMaxSharedSurfaceCount();
    }

    public static final Set<String> e(CameraCharacteristics cameraCharacteristics) {
        return cameraCharacteristics.getPhysicalCameraIds();
    }

    public static final Map<String, CaptureResult> f(TotalCaptureResult totalCaptureResult) {
        return totalCaptureResult.getPhysicalCameraResults();
    }

    public static final SessionConfiguration g(int sessionType, List<OutputConfiguration> outputs, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        return v.a(sessionType, outputs, executor, stateCallback);
    }

    public static final void h(CameraManager cameraManager, String cameraId, Executor executor, CameraDevice.StateCallback callback) throws CameraAccessException {
        cameraManager.openCamera(cameraId, executor, callback);
    }

    public static final void i(CameraManager cameraManager, Executor executor, CameraManager.AvailabilityCallback callback) {
        cameraManager.registerAvailabilityCallback(executor, callback);
    }

    public static final void j(SessionConfiguration sessionConfig, InputConfiguration inputConfig) {
        sessionConfig.setInputConfiguration(inputConfig);
    }

    public static final void k(OutputConfiguration outputConfig, String cameraId) {
        outputConfig.setPhysicalCameraId(cameraId);
    }

    public static final void l(SessionConfiguration sessionConfig, CaptureRequest params) {
        sessionConfig.setSessionParameters(params);
    }

    public static final <T> T m(Image image, mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(HardwareBuffer.class))) {
            return (T) image.getHardwareBuffer();
        }
        return null;
    }
}
