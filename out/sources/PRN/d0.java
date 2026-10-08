package PRN;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bJ\u000f\u0010\u000b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\bJ\u0017\u0010\u000e\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0010R\"\u0010\u0017\u001a\u00020\u00118\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"LPRN/d0;", "Lh/u0;", "LPRN/o;", "cameraStateAdapter", "<init>", "(LPRN/o;)V", "Loq/i0;", "b", "()V", "e", "a", "c", "Lh/t0$a;", "graphStateError", "d", "(Lh/t0$a;)V", "LPRN/o;", "Lh/s;", "Lh/s;", "f", "()Lh/s;", "g", "(Lh/s;)V", "cameraGraph", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d0 implements h.u0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o cameraStateAdapter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public h.s cameraGraph;

    public d0(o oVar) {
        this.cameraStateAdapter = oVar;
    }

    @Override // h.u0
    public void a() {
        this.cameraStateAdapter.h(f(), h.t0.e.f79082b);
    }

    @Override // h.u0
    public void b() {
        this.cameraStateAdapter.h(f(), h.t0.c.f79080b);
    }

    @Override // h.u0
    public void c() {
        this.cameraStateAdapter.h(f(), h.t0.d.f79081b);
    }

    @Override // h.u0
    public void d(h.t0.a graphStateError) {
        this.cameraStateAdapter.h(f(), graphStateError);
    }

    @Override // h.u0
    public void e() {
        this.cameraStateAdapter.h(f(), h.t0.b.f79079b);
    }

    public final h.s f() {
        h.s sVar = this.cameraGraph;
        if (sVar != null) {
            return sVar;
        }
        return null;
    }

    public final void g(h.s sVar) {
        this.cameraGraph = sVar;
    }
}
