package a;

import PRN.a0;
import e.f2;
import e.v0;
import h.i1;
import h.p0;
import ju.w0;
import ju.z;
import oq.i0;
import p071kotlin.Metadata;
import v.p1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0003J)\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010 \u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010&\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b(\u0010)R \u0010-\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b+\u0010,R \u0010/\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b.\u0010,¨\u00060"}, d2 = {"La/i;", "La/h;", "<init>", "()V", "Lju/x;", "Ljava/lang/Void;", "", "msg", "a", "(Lju/x;Ljava/lang/String;)Lju/x;", "Lg/f;", "bundle", "Loq/i0;", "m", "(Lg/f;)V", "I", "()Lg/f;", "E", "u", "Le/f2;", "requestControl", "", "cancelPreviousTask", "Lju/w0;", "N", "(Le/f2;Z)Lju/w0;", "Lh/i1;", "requestMetadata", "Lh/r0;", "frameNumber", "Lh/p0;", "result", "K", "(Lh/i1;JLh/p0;)V", "", "Ljava/lang/Object;", "lock", "b", "updateSignalLock", "Le/a$a;", "c", "Le/a$a;", "configBuilder", "d", "Lju/x;", "updateSignal", "e", "pendingSignal", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object updateSignalLock = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private e.a.C1050a configBuilder = new e.a.C1050a();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ju.x<Void> updateSignal;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private ju.x<Void> pendingSignal;

    private final ju.x<Void> a(ju.x<Void> xVar, String str) {
        xVar.p(new o.j.a(str));
        return xVar;
    }

    static /* synthetic */ ju.x c(i iVar, ju.x xVar, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = "Camera2CameraControl was updated with new options.";
        }
        return iVar.a(xVar, str);
    }

    @Override // a.h
    public void E() {
        synchronized (this.lock) {
            this.configBuilder = new e.a.C1050a();
            i0 i0Var = i0.f148189a;
        }
    }

    @Override // a.h
    public g.f I() {
        g.f fVarB;
        synchronized (this.lock) {
            fVarB = g.f.a.INSTANCE.b(this.configBuilder.c()).b();
        }
        return fVarB;
    }

    @Override // h.g1.a
    public void K(i1 requestMetadata, long frameNumber, p0 result) {
        synchronized (this.updateSignalLock) {
            try {
                ju.x<Void> xVar = this.updateSignal;
                if (xVar != null && v0.a(requestMetadata, "Camera2CameraControl.tag", Integer.valueOf(xVar.hashCode()))) {
                    xVar.d0(null);
                    this.updateSignal = null;
                    ju.x<Void> xVar2 = this.pendingSignal;
                    if (xVar2 != null) {
                        xVar2.d0(null);
                        this.pendingSignal = null;
                    }
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // a.h
    public w0<Void> N(f2 requestControl, boolean cancelPreviousTask) {
        e.a aVarC;
        ju.x<Void> xVarC = z.c(null, 1, null);
        synchronized (this.lock) {
            aVarC = this.configBuilder.c();
        }
        synchronized (this.updateSignalLock) {
            try {
                if (requestControl != null) {
                    if (cancelPreviousTask) {
                        ju.x<Void> xVar = this.updateSignal;
                        if (xVar != null) {
                            c(this, xVar, null, 1, null);
                        }
                    } else {
                        ju.x<Void> xVar2 = this.updateSignal;
                        if (xVar2 != null) {
                            a0.s(xVarC, xVar2);
                        }
                    }
                    this.updateSignal = xVarC;
                    requestControl.m(aVarC, pq.v0.f(oq.y.a("Camera2CameraControl.tag", Integer.valueOf(xVarC.hashCode()))));
                } else {
                    ju.x<Void> xVar3 = this.pendingSignal;
                    if (xVar3 != null) {
                        c(this, xVar3, null, 1, null);
                    }
                    this.pendingSignal = xVarC;
                    i0 i0Var = i0.f148189a;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return xVarC;
    }

    @Override // a.h
    public void m(g.f bundle) {
        synchronized (this.lock) {
            try {
                for (p1.a<?> aVar : bundle.b()) {
                    this.configBuilder.a().e0(aVar, p1.c.ALWAYS_OVERRIDE, bundle.d(aVar));
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // a.h
    public void u() {
        synchronized (this.updateSignalLock) {
            try {
                ju.x<Void> xVar = this.updateSignal;
                if (xVar != null) {
                    this.updateSignal = null;
                    a(xVar, "The camera control has became inactive.");
                }
                ju.x<Void> xVar2 = this.pendingSignal;
                if (xVar2 != null) {
                    this.pendingSignal = null;
                    a(xVar2, "The camera control has became inactive.");
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
