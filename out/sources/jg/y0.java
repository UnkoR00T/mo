package jg;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class y0 implements ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f102572a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f102573b;

    public y0(c cVar, int i15) {
        Objects.requireNonNull(cVar);
        this.f102573b = cVar;
        this.f102572a = i15;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        c cVar = this.f102573b;
        if (iBinder == null) {
            cVar.V(16);
            return;
        }
        synchronized (cVar.X()) {
            try {
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
                cVar.Y((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof o)) ? new q0(iBinder) : (o) iInterfaceQueryLocalInterface);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.f102573b.R(0, null, this.f102572a);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        c cVar = this.f102573b;
        synchronized (cVar.X()) {
            cVar.Y(null);
        }
        c cVar2 = this.f102573b;
        int i15 = this.f102572a;
        Handler handler = cVar2.f102420l;
        handler.sendMessage(handler.obtainMessage(6, i15, 1));
    }
}
