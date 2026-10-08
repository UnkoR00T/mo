package ig;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes3.dex */
abstract class b1 extends q0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final vh.m f92145b;

    public b1(int i15, vh.m mVar) {
        super(i15);
        this.f92145b = mVar;
    }

    @Override // ig.g1
    public final void a(Status status) {
        this.f92145b.d(new hg.b(status));
    }

    @Override // ig.g1
    public final void b(Exception exc) {
        this.f92145b.d(exc);
    }

    @Override // ig.g1
    public final void d(e0 e0Var) throws DeadObjectException {
        try {
            h(e0Var);
        } catch (DeadObjectException e15) {
            a(g1.e(e15));
            throw e15;
        } catch (RemoteException e16) {
            a(g1.e(e16));
        } catch (RuntimeException e17) {
            this.f92145b.d(e17);
        }
    }

    protected abstract void h(e0 e0Var);
}
