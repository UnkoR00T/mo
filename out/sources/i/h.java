package i;

import android.hardware.camera2.CaptureFailure;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\t*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0019\u001a\u00020\u00148\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001f\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010%\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Li/h;", "Lh/h1;", "Lh/i1;", "requestMetadata", "Landroid/hardware/camera2/CaptureFailure;", "captureFailure", "<init>", "(Lh/i1;Landroid/hardware/camera2/CaptureFailure;)V", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "a", "Lh/i1;", "getRequestMetadata", "()Lh/i1;", "b", "Landroid/hardware/camera2/CaptureFailure;", "Lh/r0;", "c", "J", "getFrameNumber-Ugla2oM", "()J", "frameNumber", "", "d", "I", "C0", "()I", "reason", "", "e", "Z", "C", "()Z", "wasImageCaptured", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements h.h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.i1 requestMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CaptureFailure captureFailure;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long frameNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int reason;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean wasImageCaptured;

    public h(h.i1 i1Var, CaptureFailure captureFailure) {
        this.requestMetadata = i1Var;
        this.captureFailure = captureFailure;
        this.frameNumber = h.r0.b(captureFailure.getFrameNumber());
        this.reason = captureFailure.getReason();
        this.wasImageCaptured = captureFailure.wasImageCaptured();
    }

    @Override // h.h1
    /* JADX INFO: renamed from: C, reason: from getter */
    public boolean getWasImageCaptured() {
        return this.wasImageCaptured;
    }

    @Override // h.h1
    /* JADX INFO: renamed from: C0, reason: from getter */
    public int getReason() {
        return this.reason;
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        if (fr.t.c(type, fr.q0.c(CaptureFailure.class))) {
            return (T) this.captureFailure;
        }
        return null;
    }
}
