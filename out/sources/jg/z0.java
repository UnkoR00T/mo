package jg;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import io.sentry.android.core.c2;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class z0 extends p0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final IBinder f102577g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ c f102578h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(c cVar, int i15, IBinder iBinder, Bundle bundle) {
        super(cVar, i15, bundle);
        Objects.requireNonNull(cVar);
        this.f102578h = cVar;
        this.f102577g = iBinder;
    }

    @Override // jg.p0
    protected final boolean e() {
        try {
            IBinder iBinder = this.f102577g;
            s.l(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            c cVar = this.f102578h;
            if (!cVar.B().equals(interfaceDescriptor)) {
                String strB = cVar.B();
                StringBuilder sb5 = new StringBuilder(String.valueOf(strB).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb5.append("service descriptor mismatch: ");
                sb5.append(strB);
                sb5.append(" vs. ");
                sb5.append(interfaceDescriptor);
                c2.g("GmsClient", sb5.toString());
                return false;
            }
            IInterface iInterfaceP = cVar.p(this.f102577g);
            if (iInterfaceP == null || !(cVar.U(2, 4, iInterfaceP) || cVar.U(3, 4, iInterfaceP))) {
                return false;
            }
            cVar.d0(null);
            c.a aVarA0 = cVar.a0();
            Bundle bundleU = cVar.u();
            if (aVarA0 == null) {
                return true;
            }
            cVar.a0().onConnected(bundleU);
            return true;
        } catch (RemoteException unused) {
            c2.g("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // jg.p0
    protected final void f(gg.a aVar) {
        c cVar = this.f102578h;
        if (cVar.b0() != null) {
            cVar.b0().onConnectionFailed(aVar);
        }
        cVar.I(aVar);
    }
}
