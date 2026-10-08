package lg;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import ig.m;
import jg.h;
import jg.z;

/* JADX INFO: loaded from: classes3.dex */
public final class e extends h {
    private final z L;

    public e(Context context, Looper looper, jg.e eVar, z zVar, ig.d dVar, m mVar) {
        super(context, looper, 270, eVar, dVar, mVar);
        this.L = zVar;
    }

    @Override // jg.c
    protected final String B() {
        return "com.google.android.gms.common.internal.service.IClientTelemetryService";
    }

    @Override // jg.c
    protected final String C() {
        return "com.google.android.gms.common.telemetry.service.START";
    }

    @Override // jg.c
    protected final boolean F() {
        return true;
    }

    @Override // jg.c, hg.a.f
    public final int l() {
        return 203400000;
    }

    @Override // jg.c
    protected final /* synthetic */ IInterface p(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.service.IClientTelemetryService");
        return iInterfaceQueryLocalInterface instanceof a ? (a) iInterfaceQueryLocalInterface : new a(iBinder);
    }

    @Override // jg.c
    public final gg.c[] s() {
        return vg.d.f206696b;
    }

    @Override // jg.c
    protected final Bundle x() {
        return this.L.d();
    }
}
