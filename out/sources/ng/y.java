package ng;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;

/* JADX INFO: loaded from: classes3.dex */
public final class y extends jg.h {
    protected y(Context context, Looper looper, jg.e eVar, ig.d dVar, ig.m mVar) {
        super(context, looper, 308, eVar, dVar, mVar);
    }

    @Override // jg.c
    protected final String B() {
        return "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService";
    }

    @Override // jg.c
    protected final String C() {
        return "com.google.android.gms.chimera.container.moduleinstall.ModuleInstallService.START";
    }

    @Override // jg.c
    protected final boolean F() {
        return true;
    }

    @Override // jg.c
    public final boolean P() {
        return true;
    }

    @Override // jg.c, hg.a.f
    public final int l() {
        return 17895000;
    }

    @Override // jg.c
    protected final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
        return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new i(iBinder);
    }

    @Override // jg.c
    public final gg.c[] s() {
        return vg.g.f206700b;
    }
}
