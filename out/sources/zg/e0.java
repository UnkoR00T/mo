package zg;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.location.LocationRequest;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends jg.h {
    public static final /* synthetic */ int P = 0;
    private final r0.l1 L;
    private final r0.l1 M;
    private final r0.l1 N;
    private final r0.l1 O;

    public e0(Context context, Looper looper, jg.e eVar, ig.d dVar, ig.m mVar) {
        super(context, looper, 23, eVar, dVar, mVar);
        this.L = new r0.l1();
        this.M = new r0.l1();
        this.N = new r0.l1();
        this.O = new r0.l1();
    }

    private final boolean j0(gg.c cVar) {
        gg.c cVar2;
        gg.c[] cVarArrM = m();
        if (cVarArrM != null) {
            int i15 = 0;
            while (true) {
                if (i15 >= cVarArrM.length) {
                    cVar2 = null;
                    break;
                }
                cVar2 = cVarArrM[i15];
                if (cVar.m().equals(cVar2.m())) {
                    break;
                }
                i15++;
            }
            if (cVar2 != null && cVar2.p() >= cVar.p()) {
                return true;
            }
        }
        return false;
    }

    @Override // jg.c
    protected final String B() {
        return "com.google.android.gms.location.internal.IGoogleLocationManagerService";
    }

    @Override // jg.c
    protected final String C() {
        return "com.google.android.location.internal.GoogleLocationManagerService.START";
    }

    @Override // jg.c
    public final void J(int i15) {
        super.J(i15);
        synchronized (this.L) {
            this.L.clear();
        }
        synchronized (this.M) {
            this.M.clear();
        }
        synchronized (this.N) {
            this.N.clear();
        }
    }

    @Override // jg.c
    public final boolean P() {
        return true;
    }

    public final void k0(kh.i iVar, vh.m mVar) {
        if (j0(kh.q.f110959j)) {
            ((m1) A()).Y2(iVar, new k0(5, null, new x(mVar), null, null));
        } else {
            mVar.c(((m1) A()).M0(v().getPackageName()));
        }
    }

    @Override // jg.c, hg.a.f
    public final int l() {
        return 11717000;
    }

    public final void l0(kh.a aVar, vh.a aVar2, final vh.m mVar) {
        if (j0(kh.q.f110959j)) {
            final jg.m mVarR1 = ((m1) A()).R1(aVar, k0.m(new w(mVar)));
            if (aVar2 != null) {
                aVar2.b(new vh.i() { // from class: zg.j0
                    @Override // vh.i
                    public final /* synthetic */ void b() {
                        int i15 = e0.P;
                        try {
                            mVarR1.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        if (j0(kh.q.f110954e)) {
            final jg.m mVarW1 = ((m1) A()).w1(aVar, new w(mVar));
            if (aVar2 != null) {
                aVar2.b(new vh.i() { // from class: zg.h0
                    @Override // vh.i
                    public final /* synthetic */ void b() {
                        int i15 = e0.P;
                        try {
                            mVarW1.cancel();
                        } catch (RemoteException unused) {
                        }
                    }
                });
                return;
            }
            return;
        }
        ig.j jVarB = ig.k.b(new t(this, mVar), f1.a(), "GetCurrentLocation");
        final ig.j.a aVarB = jVarB.b();
        Objects.requireNonNull(aVarB);
        u uVar = new u(this, jVarB, mVar);
        vh.m mVar2 = new vh.m();
        LocationRequest.a aVar3 = new LocationRequest.a(aVar.r(), 0L);
        aVar3.i(0L);
        aVar3.b(aVar.h());
        aVar3.c(aVar.m());
        aVar3.e(aVar.p());
        aVar3.m(aVar.zza());
        aVar3.l(aVar.u());
        aVar3.k(true);
        aVar3.n(aVar.y());
        m0(uVar, aVar3.a(), mVar2);
        mVar2.a().c(new vh.f() { // from class: zg.g0
            @Override // vh.f
            public final /* synthetic */ void a(vh.l lVar) {
                int i15 = e0.P;
                if (lVar.q()) {
                    return;
                }
                vh.m mVar3 = mVar;
                Exception excL = lVar.l();
                Objects.requireNonNull(excL);
                mVar3.d(excL);
            }
        });
        if (aVar2 != null) {
            aVar2.b(new vh.i() { // from class: zg.i0
                @Override // vh.i
                public final /* synthetic */ void b() {
                    try {
                        this.f235083a.n0(aVarB, true, new vh.m());
                    } catch (RemoteException unused) {
                    }
                }
            });
        }
    }

    public final void m0(z zVar, LocationRequest locationRequest, vh.m mVar) {
        d0 d0Var;
        ig.j jVarZza = zVar.zza();
        ig.j.a aVarB = jVarZza.b();
        Objects.requireNonNull(aVarB);
        boolean zJ0 = j0(kh.q.f110959j);
        synchronized (this.M) {
            try {
                d0 d0Var2 = (d0) this.M.get(aVarB);
                if (d0Var2 == null || zJ0) {
                    d0 d0Var3 = new d0(zVar);
                    this.M.put(aVarB, d0Var3);
                    d0Var = d0Var3;
                } else {
                    d0Var2.n3(jVarZza);
                    d0Var = d0Var2;
                    d0Var2 = null;
                }
                if (zJ0) {
                    ((m1) A()).r0(k0.h(d0Var2, d0Var, aVarB.a()), locationRequest, new v(null, mVar));
                } else {
                    ((m1) A()).M1(new o0(1, m0.h(null, locationRequest), null, d0Var, null, new s(mVar, d0Var), aVarB.a()));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void n0(ig.j.a aVar, boolean z15, vh.m mVar) {
        synchronized (this.M) {
            try {
                d0 d0Var = (d0) this.M.remove(aVar);
                if (d0Var == null) {
                    mVar.c(Boolean.FALSE);
                    return;
                }
                d0Var.o3();
                if (!z15) {
                    mVar.c(Boolean.TRUE);
                } else if (j0(kh.q.f110959j)) {
                    m1 m1Var = (m1) A();
                    int iIdentityHashCode = System.identityHashCode(d0Var);
                    StringBuilder sb5 = new StringBuilder(String.valueOf(iIdentityHashCode).length() + 18);
                    sb5.append("ILocationCallback@");
                    sb5.append(iIdentityHashCode);
                    m1Var.X(k0.h(null, d0Var, sb5.toString()), new v(Boolean.TRUE, mVar));
                } else {
                    ((m1) A()).M1(new o0(2, null, null, d0Var, null, new y(Boolean.TRUE, mVar), null));
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // jg.c
    protected final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        return iInterfaceQueryLocalInterface instanceof m1 ? (m1) iInterfaceQueryLocalInterface : new l1(iBinder);
    }

    @Override // jg.c
    public final gg.c[] s() {
        return kh.q.f110965p;
    }
}
