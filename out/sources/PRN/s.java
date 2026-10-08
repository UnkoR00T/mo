package PRN;

import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import e.u1;
import h.i1;
import h.t1;
import p071kotlin.Metadata;
import v.t3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b,\u0010-J)\u00102\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010/*\u00020.2\f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0004\b2\u00103R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00104R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u00107\u001a\u0004\b8\u00109¨\u0006:"}, d2 = {"LPRN/s;", "Lv/c0;", "Lh/t1;", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/p0;", "result", "<init>", "(Lh/i1;JLh/p0;Lfr/k;)V", "Lv/x;", "l", "()Lv/x;", "Lv/y;", "j", "()Lv/y;", "Lv/v;", "i", "()Lv/v;", "Lv/w;", "n", "()Lv/w;", "Lv/z;", "f", "()Lv/z;", "Lv/a0;", "k", "()Lv/a0;", "Lv/b0;", "c", "()Lv/b0;", "", "getTimestamp", "()J", "Lv/t3;", "d", "()Lv/t3;", "Ly/h$b;", "exifBuilder", "Loq/i0;", "a", "(Ly/h$b;)V", "Landroid/hardware/camera2/CaptureResult;", "g", "()Landroid/hardware/camera2/CaptureResult;", "", "T", "Lmr/c;", "type", "c0", "(Lmr/c;)Ljava/lang/Object;", "Lh/i1;", "b", "J", "Lh/p0;", "getResult$camera_camera2", "()Lh/p0;", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s implements v.c0, t1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i1 requestMetadata;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long frameNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h.p0 result;

    public /* synthetic */ s(i1 i1Var, long j15, h.p0 p0Var, fr.k kVar) {
        this(i1Var, j15, p0Var);
    }

    @Override // v.c0
    public void a(y.h.b exifBuilder) {
        super.a(exifBuilder);
        t.r(this.result.e(), exifBuilder);
    }

    @Override // v.c0
    public v.b0 c() {
        return t.p(this.result.e());
    }

    @Override // h.t1
    public <T> T c0(mr.c<T> type) {
        return fr.t.c(type, fr.q0.c(h.p0.class)) ? (T) this.result : (T) this.result.c0(type);
    }

    @Override // v.c0
    public t3 d() {
        return (t3) this.requestMetadata.a(u1.a(), t3.b());
    }

    @Override // v.c0
    public v.z f() {
        return t.n(this.result.e());
    }

    @Override // v.c0
    public CaptureResult g() {
        Object objC0 = c0(fr.q0.c(TotalCaptureResult.class));
        if (objC0 != null) {
            return (CaptureResult) objC0;
        }
        throw new IllegalStateException(("Failed to unwrap " + this + " as TotalCaptureResult").toString());
    }

    @Override // v.c0
    public long getTimestamp() {
        return t.q(this.result.e());
    }

    @Override // v.c0
    public v.v i() {
        return t.j(this.result.e());
    }

    @Override // v.c0
    public v.y j() {
        return t.m(this.result.e());
    }

    @Override // v.c0
    public v.a0 k() {
        return t.o(this.result.e());
    }

    @Override // v.c0
    public v.x l() {
        return t.l(this.result.e());
    }

    @Override // v.c0
    public v.w n() {
        return t.k(this.result.e());
    }

    private s(i1 i1Var, long j15, h.p0 p0Var) {
        this.requestMetadata = i1Var;
        this.frameNumber = j15;
        this.result = p0Var;
    }
}
