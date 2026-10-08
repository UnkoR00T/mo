package i;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import android.os.Build;
import android.view.Surface;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0000\u0018\u00002\u00020\u0001B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0012\u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J&\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0096\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00182\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00192\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010\"\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0018*\u00020\u00072\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010\b\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R \u0010\t\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010'R \u0010\n\u001a\u000e\u0012\u0002\b\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010'R&\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010,R\u001a\u0010\u000f\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u001a\u0010\u0013\u001a\u00020\u00128\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b%\u00107R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b:\u0010;¨\u0006<"}, d2 = {"Li/i2;", "Lh/i1;", "Li/k2;", "cameraCaptureSessionWrapper", "Landroid/hardware/camera2/CaptureRequest;", "captureRequest", "", "", "defaultParameters", "graphParameters", "requiredParameters", "Lh/q1;", "Landroid/view/Surface;", "streams", "Lh/k1;", "template", "", "repeating", "Lh/g1;", "request", "Lh/j1;", "requestNumber", "<init>", "(Li/k2;Landroid/hardware/camera2/CaptureRequest;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;IZLh/g1;JLfr/k;)V", "T", "Lh/a1$a;", "key", "c", "(Lh/a1$a;)Ljava/lang/Object;", "default", "a", "(Lh/a1$a;Ljava/lang/Object;)Ljava/lang/Object;", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "Li/k2;", "b", "Landroid/hardware/camera2/CaptureRequest;", "Ljava/util/Map;", "d", "e", "f", "G", "()Ljava/util/Map;", "g", "I", "getTemplate-fGx8uWA", "()I", "h", "Z", "r", "()Z", "j", "Lh/g1;", "()Lh/g1;", "k", "J", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()J", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i2 implements h.i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k2 cameraCaptureSessionWrapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CaptureRequest captureRequest;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<?, Object> defaultParameters;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Map<?, Object> graphParameters;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<?, Object> requiredParameters;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<h.q1, Surface> streams;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int template;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean repeating;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h.g1 request;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long requestNumber;

    public /* synthetic */ i2(k2 k2Var, CaptureRequest captureRequest, Map map, Map map2, Map map3, Map map4, int i15, boolean z15, h.g1 g1Var, long j15, fr.k kVar) {
        this(k2Var, captureRequest, map, map2, map3, map4, i15, z15, g1Var, j15);
    }

    @Override // h.i1
    public Map<h.q1, Surface> G() {
        return this.streams;
    }

    @Override // h.i1
    /* JADX INFO: renamed from: L, reason: from getter */
    public long getRequestNumber() {
        return this.requestNumber;
    }

    @Override // h.a1
    public <T> T a(h.a1.a<T> key, T t15) {
        T t16 = (T) c(key);
        return t16 == null ? t15 : t16;
    }

    @Override // h.i1
    /* JADX INFO: renamed from: b, reason: from getter */
    public h.g1 getRequest() {
        return this.request;
    }

    @Override // h.a1
    public <T> T c(h.a1.a<T> key) {
        if (this.requiredParameters.containsKey(key)) {
            return (T) this.requiredParameters.get(key);
        }
        if (getRequest().b().containsKey(key)) {
            return (T) getRequest().b().get(key);
        }
        return this.graphParameters.containsKey(key) ? (T) this.graphParameters.get(key) : (T) this.defaultParameters.get(key);
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(CaptureRequest.class))) {
            return (T) this.captureRequest;
        }
        if (fr.t.c(type, fr.q0.c(CameraCaptureSession.class))) {
            T t15 = (T) this.cameraCaptureSessionWrapper.c0(fr.q0.c(CameraCaptureSession.class));
            if (t15 == null) {
                return null;
            }
            return t15;
        }
        if (!fr.t.c(type, fr.q0.c(e.d.a()))) {
            return null;
        }
        if (Build.VERSION.SDK_INT < 31) {
            throw new IllegalStateException("Check failed.");
        }
        T t16 = (T) this.cameraCaptureSessionWrapper.c0(fr.q0.c(e.d.a()));
        if (t16 == null) {
            return null;
        }
        return t16;
    }

    @Override // h.i1
    /* JADX INFO: renamed from: r, reason: from getter */
    public boolean getRepeating() {
        return this.repeating;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private i2(k2 k2Var, CaptureRequest captureRequest, Map<?, ? extends Object> map, Map<?, ? extends Object> map2, Map<?, ? extends Object> map3, Map<h.q1, ? extends Surface> map4, int i15, boolean z15, h.g1 g1Var, long j15) {
        this.cameraCaptureSessionWrapper = k2Var;
        this.captureRequest = captureRequest;
        this.defaultParameters = map;
        this.graphParameters = map2;
        this.requiredParameters = map3;
        this.streams = map4;
        this.template = i15;
        this.repeating = z15;
        this.request = g1Var;
        this.requestNumber = j15;
    }
}
