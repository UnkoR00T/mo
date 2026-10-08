package i;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.n, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\tH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0013\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\b*\u00020\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017R&\u0010\"\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0014\u0010&\u001a\u00020#8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%¨\u0006'"}, d2 = {"Li/n;", "Lh/q0;", "Landroid/hardware/camera2/CaptureResult;", "captureResult", "Lh/v;", "camera", "<init>", "(Landroid/hardware/camera2/CaptureResult;Ljava/lang/String;Lfr/k;)V", "T", "Landroid/hardware/camera2/CaptureResult$Key;", "key", "I", "(Landroid/hardware/camera2/CaptureResult$Key;)Ljava/lang/Object;", "default", "a0", "(Landroid/hardware/camera2/CaptureResult$Key;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "a", "Landroid/hardware/camera2/CaptureResult;", "b", "Ljava/lang/String;", "h", "", "c", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "extraMetadata", "Lh/r0;", "Y0", "()J", "frameNumber", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameMetadata implements h.q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CaptureResult captureResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String camera;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<?, Object> extraMetadata;

    public /* synthetic */ FrameMetadata(CaptureResult captureResult, String str, fr.k kVar) {
        this(captureResult, str);
    }

    @Override // h.q0
    public <T> T I(CaptureResult.Key<T> key) {
        T t15 = (T) d().get(key);
        return t15 == null ? (T) this.captureResult.get(key) : t15;
    }

    @Override // h.q0
    public long Y0() {
        return h.r0.b(this.captureResult.getFrameNumber());
    }

    @Override // h.q0
    public <T> T a0(CaptureResult.Key<T> key, T t15) {
        T t16 = (T) I(key);
        return t16 == null ? t15 : t16;
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        T t15;
        if (fr.t.c(type, fr.q0.c(CaptureResult.class))) {
            return (T) this.captureResult;
        }
        if (!fr.t.c(type, fr.q0.c(TotalCaptureResult.class)) || (t15 = (T) this.captureResult) == null) {
            return null;
        }
        return t15;
    }

    public Map<?, Object> d() {
        return this.extraMetadata;
    }

    @Override // h.q0
    /* JADX INFO: renamed from: h, reason: from getter */
    public String getCamera() {
        return this.camera;
    }

    public String toString() {
        return "FrameMetadata(camera: " + ((Object) h.v.f(getCamera())) + ", frameNumber: " + this.captureResult.getFrameNumber() + ')';
    }

    private FrameMetadata(CaptureResult captureResult, String str) {
        this.captureResult = captureResult;
        this.camera = str;
        this.extraMetadata = pq.v0.i();
    }
}
