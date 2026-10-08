package ig;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
public final class e1 extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f92188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final vh.m f92189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q f92190d;

    public e1(int i15, s sVar, vh.m mVar, q qVar) {
        super(i15);
        this.f92189c = mVar;
        this.f92188b = sVar;
        this.f92190d = qVar;
        if (i15 == 2 && sVar.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // ig.g1
    public final void a(Status status) {
        this.f92189c.d(this.f92190d.a(status));
    }

    @Override // ig.g1
    public final void b(Exception exc) {
        this.f92189c.d(exc);
    }

    @Override // ig.g1
    public final void c(v vVar, boolean z15) {
        vVar.b(this.f92189c, z15);
    }

    @Override // ig.g1
    public final void d(e0 e0Var) throws DeadObjectException {
        try {
            this.f92188b.b(e0Var.t(), this.f92189c);
        } catch (DeadObjectException e15) {
            throw e15;
        } catch (RemoteException e16) {
            a(g1.e(e16));
        } catch (RuntimeException e17) {
            this.f92189c.d(e17);
        }
    }

    @Override // ig.q0
    public final gg.c[] f(e0 e0Var) {
        return this.f92188b.d();
    }

    @Override // ig.q0
    public final boolean g(e0 e0Var) {
        return this.f92188b.c();
    }
}
