package h;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\n\bg\u0018\u0000  2\u00020\u00012\u00020\u0002:\u0001!J&\u0010\u0006\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H¦\u0002¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\b\u001a\u00028\u0000H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bH&¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u000b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u001e\u0010\u001b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001aR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00178&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001aø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\"À\u0006\u0001"}, d2 = {"Lh/x;", "Lh/a1;", "Lh/t1;", "T", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "key", "J", "(Landroid/hardware/camera2/CameraCharacteristics$Key;)Ljava/lang/Object;", "default", "d0", "(Landroid/hardware/camera2/CameraCharacteristics$Key;Ljava/lang/Object;)Ljava/lang/Object;", "Lh/v;", "cameraId", "O", "(Ljava/lang/String;)Lh/x;", "", "extension", "Lh/r;", "b0", "(I)Lh/r;", "h", "()Ljava/lang/String;", "camera", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "H0", "()Ljava/util/Set;", "sessionKeys", "Z", "physicalCameraIds", "K", "supportedExtensions", "V", "a", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface x extends a1, t1 {

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.f79092a;

    /* JADX INFO: renamed from: h.x$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0006\u0010\u0007\u0012\u0004\b\n\u0010\u0003\u001a\u0004\b\b\u0010\tR&\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u0007\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\tR&\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\u0007\u0012\u0004\b\u0014\u0010\u0003\u001a\u0004\b\u0013\u0010\tR\"\u0010\u001d\u001a\u00020\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0015\u0010!\u001a\u00020\u0016*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0015\u0010\"\u001a\u00020\u0016*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u0006\u0010 R\u0015\u0010&\u001a\u00020#*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0015\u0010(\u001a\u00020#*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0015\u0010*\u001a\u00020#*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b)\u0010%R\u0015\u0010,\u001a\u00020#*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0015\u0010-\u001a\u00020#*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u0017\u0010%R\u0015\u0010/\u001a\u00020#*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b.\u0010%R\u0015\u00101\u001a\u00020#*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b0\u0010%R\u0015\u00104\u001a\u000202*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u0012\u00103R\u0015\u00105\u001a\u000202*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\r\u00103R\u0015\u00107\u001a\u00020#*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b6\u0010%R\u0015\u00109\u001a\u00020#*\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b8\u0010%¨\u0006:"}, d2 = {"Lh/x$a;", "", "<init>", "()V", "Lh/a1$a;", "Lh/d0;", "b", "Lh/a1$a;", "getCAMERA_STREAM_CONFIGURATION_MAP", "()Lh/a1$a;", "getCAMERA_STREAM_CONFIGURATION_MAP$annotations", "CAMERA_STREAM_CONFIGURATION_MAP", "Lh/y;", "c", "getCAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP", "getCAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP$annotations", "CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP", "Lh/l;", "d", "getCAMERA_AVAILABLE_COLOR_SPACE_PROFILES", "getCAMERA_AVAILABLE_COLOR_SPACE_PROFILES$annotations", "CAMERA_AVAILABLE_COLOR_SPACE_PROFILES", "", "e", "[I", "getEMPTY_INT_ARRAY", "()[I", "setEMPTY_INT_ARRAY", "([I)V", "EMPTY_INT_ARRAY", "Lh/x;", "a", "(Lh/x;)[I", "availableCapabilities", "availableVideoStabilizationModes", "", "k", "(Lh/x;)Z", "isHardwareLevelExternal", "l", "isHardwareLevelLegacy", "m", "isHardwareLevelLimited", "h", "supportsPrivateReprocessing", "supportsAutoFocusTrigger", "j", "supportsZoomOverride", "i", "supportsTorchStrength", "", "(Lh/x;)I", "maxTorchStrengthLevel", "defaultTorchStrengthLevel", "f", "supportsLowLightBoost", "g", "supportsPreviewStabilization", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f79092a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final a1.a<d0> CAMERA_STREAM_CONFIGURATION_MAP;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final a1.a<y> CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final a1.a<l> CAMERA_AVAILABLE_COLOR_SPACE_PROFILES;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static int[] EMPTY_INT_ARRAY;

        static {
            a1.a.Companion c1801a = a1.a.INSTANCE;
            CAMERA_STREAM_CONFIGURATION_MAP = c1801a.a("androidx.camera.camera2.pipe.scalar.streamConfigurationMap", fr.q0.c(d0.class));
            CAMERA_MULTI_RESOLUTION_STREAM_CONFIGURATION_MAP = c1801a.a("androidx.camera.camera2.pipe.scalar.multiResolutionStreamConfigurationMap", fr.q0.c(y.class));
            CAMERA_AVAILABLE_COLOR_SPACE_PROFILES = c1801a.a("androidx.camera.camera2.pipe.request.availableColorSpaceProfilesMap", fr.q0.c(l.class));
            EMPTY_INT_ARRAY = new int[0];
        }

        private Companion() {
        }

        public final int[] a(x xVar) {
            int[] iArr = (int[]) xVar.J(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            return iArr == null ? EMPTY_INT_ARRAY : iArr;
        }

        public final int[] b(x xVar) {
            int[] iArr = (int[]) xVar.J(CameraCharacteristics.CONTROL_AVAILABLE_VIDEO_STABILIZATION_MODES);
            return iArr == null ? EMPTY_INT_ARRAY : iArr;
        }

        public final int c(x xVar) {
            if (Build.VERSION.SDK_INT >= 35) {
                return i.m0.b(xVar);
            }
            return 1;
        }

        public final int d(x xVar) {
            if (Build.VERSION.SDK_INT >= 35) {
                return i.m0.c(xVar);
            }
            return 1;
        }

        public final boolean e(x xVar) {
            Float f15 = (Float) xVar.J(CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE);
            if (f15 != null) {
                return f15.floatValue() > 0.0f;
            }
            int[] iArr = (int[]) xVar.J(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
            if (iArr == null) {
                return false;
            }
            return pq.n.d0(iArr, 1) || pq.n.d0(iArr, 2) || pq.n.d0(iArr, 4) || pq.n.d0(iArr, 3);
        }

        public final boolean f(x xVar) {
            int[] iArr = (int[]) xVar.J(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
            if (iArr == null) {
                return false;
            }
            return pq.n.d0(iArr, 6);
        }

        public final boolean g(x xVar) {
            if (Build.VERSION.SDK_INT >= 33) {
                return i.f0.f87093a.f(xVar);
            }
            return false;
        }

        public final boolean h(x xVar) {
            return pq.n.d0(a(xVar), 4);
        }

        public final boolean i(x xVar) {
            return Build.VERSION.SDK_INT >= 35 && i.m0.d(xVar);
        }

        public final boolean j(x xVar) {
            return Build.VERSION.SDK_INT >= 34 && i.h0.c(xVar);
        }

        public final boolean k(x xVar) {
            Integer num = (Integer) xVar.J(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            return num != null && num.intValue() == 4;
        }

        public final boolean l(x xVar) {
            Integer num = (Integer) xVar.J(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            return num != null && num.intValue() == 2;
        }

        public final boolean m(x xVar) {
            Integer num = (Integer) xVar.J(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
            return num != null && num.intValue() == 0;
        }
    }

    Set<CaptureRequest.Key<?>> H0();

    <T> T J(CameraCharacteristics.Key<T> key);

    Set<Integer> K();

    x O(String cameraId);

    Set<v> Z();

    r b0(int extension);

    <T> T d0(CameraCharacteristics.Key<T> key, T t15);

    String h();
}
