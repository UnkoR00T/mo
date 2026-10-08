package i;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.os.Trace;
import android.util.ArrayMap;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.m, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ)\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010%¨\u0006'"}, d2 = {"Li/m;", "Lh/p0;", "Landroid/hardware/camera2/TotalCaptureResult;", "totalCaptureResult", "Lh/v;", "camera", "Lh/i1;", "requestMetadata", "<init>", "(Landroid/hardware/camera2/TotalCaptureResult;Ljava/lang/String;Lh/i1;Lfr/k;)V", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "a", "Landroid/hardware/camera2/TotalCaptureResult;", "b", "Ljava/lang/String;", "h", "c", "Lh/i1;", "getRequestMetadata", "()Lh/i1;", "Li/n;", "d", "Li/n;", "result", "", "Lh/q0;", "e", "Ljava/util/Map;", "physicalResults", "()Lh/q0;", "metadata", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FrameInfo implements h.p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TotalCaptureResult totalCaptureResult;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String camera;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h.i1 requestMetadata;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final FrameMetadata result;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Map<h.v, h.q0> physicalResults;

    public /* synthetic */ FrameInfo(TotalCaptureResult totalCaptureResult, String str, h.i1 i1Var, fr.k kVar) {
        this(totalCaptureResult, str, i1Var);
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        T t15;
        if (fr.t.c(type, fr.q0.c(CaptureResult.class))) {
            return (T) this.totalCaptureResult;
        }
        if (!fr.t.c(type, fr.q0.c(TotalCaptureResult.class)) || (t15 = (T) this.totalCaptureResult) == null) {
            return null;
        }
        return t15;
    }

    @Override // h.p0
    public h.q0 e() {
        return this.result;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public String getCamera() {
        return this.camera;
    }

    public String toString() {
        return "FrameInfo(camera: " + ((Object) h.v.f(this.result.getCamera())) + ", frameNumber: " + this.result.Y0() + ')';
    }

    private FrameInfo(TotalCaptureResult totalCaptureResult, String str, h.i1 i1Var) {
        Map<h.v, h.q0> mapI;
        this.totalCaptureResult = totalCaptureResult;
        this.camera = str;
        this.requestMetadata = i1Var;
        this.result = new FrameMetadata(totalCaptureResult, getCamera(), null);
        k.h hVar = k.h.f107050a;
        try {
            Trace.beginSection("physicalCaptureResults");
            int i15 = Build.VERSION.SDK_INT;
            Map<String, CaptureResult> mapD = i15 >= 31 ? e0.d(this.totalCaptureResult) : i15 >= 28 ? w.f(this.totalCaptureResult) : pq.v0.i();
            if (mapD == null || mapD.isEmpty()) {
                mapI = pq.v0.i();
            } else {
                mapI = new ArrayMap<>(mapD.size());
                for (Map.Entry<String, CaptureResult> entry : mapD.entrySet()) {
                    String strB = h.v.b(entry.getKey());
                    mapI.put(h.v.a(strB), new FrameMetadata(entry.getValue(), strB, null));
                }
            }
            Trace.endSection();
            this.physicalResults = mapI;
        } catch (Throwable th4) {
            Trace.endSection();
            throw th4;
        }
    }
}
