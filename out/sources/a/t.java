package a;

import android.graphics.Rect;
import android.hardware.camera2.CameraCharacteristics;
import e.b0;
import e.f2;
import java.util.List;
import ju.w0;
import ju.z;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0000\u0018\u0000 \f2\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0015\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u000e\u0010\u0013\u001a\u0004\b\u0010\u0010\u0014¨\u0006\u0017"}, d2 = {"La/t;", "La/x;", "Le/b0;", "cameraProperties", "<init>", "(Le/b0;)V", "", "zoomRatio", "Le/f2;", "requestControl", "Lju/w0;", "Loq/i0;", "d", "(FLe/f2;)Lju/w0;", "c", "(Le/f2;)Lju/w0;", "a", "Le/b0;", "b", "F", "()F", "minZoomRatio", "maxZoomRatio", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t implements x {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<CameraCharacteristics.Key<Rect>> f1042e = pq.v.e(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 cameraProperties;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float minZoomRatio = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final float maxZoomRatio = 1.0f;

    /* JADX INFO: renamed from: a.t$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R0\u0010\t\u001a\u001b\u0012\u0017\u0012\u0015\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00060\u00060\u0005¢\u0006\u0002\b\b0\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La/t$a;", "", "<init>", "()V", "", "Landroid/hardware/camera2/CameraCharacteristics$Key;", "Landroid/graphics/Rect;", "kotlin.jvm.PlatformType", "Lkotlin/jvm/internal/EnhancedNullability;", "requiredCharacteristics", "Ljava/util/List;", "a", "()Ljava/util/List;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final List<CameraCharacteristics.Key<Rect>> a() {
            return t.f1042e;
        }

        private Companion() {
        }
    }

    public t(b0 b0Var) {
        this.cameraProperties = b0Var;
    }

    @Override // a.x
    /* JADX INFO: renamed from: a, reason: from getter */
    public float getMaxZoomRatio() {
        return this.maxZoomRatio;
    }

    @Override // a.x
    /* JADX INFO: renamed from: b, reason: from getter */
    public float getMinZoomRatio() {
        return this.minZoomRatio;
    }

    @Override // a.x
    public w0<i0> c(f2 requestControl) {
        return z.a(i0.f148189a);
    }

    @Override // a.x
    public w0<i0> d(float zoomRatio, f2 requestControl) {
        return z.a(i0.f148189a);
    }
}
