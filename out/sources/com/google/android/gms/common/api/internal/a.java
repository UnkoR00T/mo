package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import hg.a.b;
import hg.f;
import hg.l;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<R extends l, A extends hg.a.b> extends BasePendingResult<R> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final hg.a.c<A> f29033p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final hg.a<?> f29034q;

    protected a(hg.a<?> aVar, f fVar) {
        super((f) s.m(fVar, "GoogleApiClient must not be null"));
        s.m(aVar, "Api must not be null");
        this.f29033p = aVar.b();
        this.f29034q = aVar;
    }

    private void n(RemoteException remoteException) {
        o(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    protected abstract void k(A a15);

    protected void l(R r15) {
    }

    public final void m(A a15) throws DeadObjectException {
        try {
            k(a15);
        } catch (DeadObjectException e15) {
            n(e15);
            throw e15;
        } catch (RemoteException e16) {
            n(e16);
        }
    }

    public final void o(Status status) {
        s.b(!status.C(), "Failed result must not be success");
        R rB = b(status);
        e(rB);
        l(rB);
    }
}
