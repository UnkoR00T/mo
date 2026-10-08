package oh;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.internal.oss_licenses.j4;
import ig.m;
import java.util.List;
import jg.h;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends h {
    public g(Context context, Looper looper, jg.e eVar, hg.f.a aVar, hg.f.b bVar) {
        super(context, looper, 185, eVar, (ig.d) aVar, (m) bVar);
    }

    private final e m0() {
        try {
            return (e) super.A();
        } catch (DeadObjectException | IllegalStateException unused) {
            return null;
        }
    }

    @Override // jg.c
    protected final String B() {
        return "com.google.android.gms.oss.licenses.IOSSLicenseService";
    }

    @Override // jg.c
    protected final String C() {
        return "com.google.android.gms.oss.licenses.service.START";
    }

    public final synchronized String j0(String str) {
        e eVarM0;
        eVarM0 = m0();
        if (eVarM0 == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return eVarM0.n3(str);
    }

    public final synchronized String k0(j4 j4Var) {
        e eVarM0;
        eVarM0 = m0();
        if (eVarM0 == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return eVarM0.o3(j4Var.e());
    }

    @Override // jg.c, hg.a.f
    public final int l() {
        return 12600000;
    }

    public final synchronized List l0(List list) {
        e eVarM0;
        eVarM0 = m0();
        if (eVarM0 == null) {
            throw new RemoteException("no service for getLicenseDetail call");
        }
        return eVarM0.p3(list);
    }

    @Override // jg.c
    protected final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.oss.licenses.IOSSLicenseService");
        return iInterfaceQueryLocalInterface instanceof e ? (e) iInterfaceQueryLocalInterface : new e(iBinder);
    }

    @Override // jg.c
    protected final boolean q() {
        return true;
    }
}
