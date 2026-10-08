package ac;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import fr.t;
import oq.i0;
import p071kotlin.Metadata;
import ub.w;
import yb.NetworkState;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000A\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004*\u0001\u001b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001d\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001c¨\u0006\u001e"}, d2 = {"Lac/k;", "Lac/h;", "Lyb/h;", "Landroid/content/Context;", "context", "Lec/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lec/b;)V", "o", "()Lyb/h;", "Loq/i0;", "i", "()V", "j", "Landroid/net/ConnectivityManager;", "f", "Landroid/net/ConnectivityManager;", "connectivityManager", "", "g", "Ljava/lang/Object;", "lock", "", "h", "Z", "isBlocked", "ac/k$a", "Lac/k$a;", "networkCallback", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k extends h<NetworkState> {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Object lock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isBlocked;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final a networkCallback;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"ac/k$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "capabilities", "Loq/i0;", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "", "blocked", "onBlockedStatusChanged", "(Landroid/net/Network;Z)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean blocked) {
            if (t.c(network, k.this.connectivityManager.getActiveNetwork())) {
                w.e().a(j.f5333a, "Network blocked status changed: " + blocked);
                NetworkState networkStateE = k.this.e();
                Object obj = k.this.lock;
                k kVar = k.this;
                synchronized (obj) {
                    if (kVar.isBlocked == blocked) {
                        return;
                    }
                    kVar.isBlocked = blocked;
                    i0 i0Var = i0.f148189a;
                    k.this.h(NetworkState.b(networkStateE, false, false, false, false, blocked, 15, null));
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities capabilities) {
            w.e().a(j.f5333a, "Network capabilities changed: " + capabilities);
            k kVar = k.this;
            kVar.h(j.c(kVar.connectivityManager, k.this.isBlocked));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            w.e().a(j.f5333a, "Network connection lost");
            k.this.h(new NetworkState(false, false, false, false, false));
        }
    }

    public k(Context context, ec.b bVar) {
        super(context, bVar);
        this.connectivityManager = (ConnectivityManager) getAppContext().getSystemService("connectivity");
        this.lock = new Object();
        this.networkCallback = new a();
    }

    @Override // ac.h
    public void i() {
        try {
            w.e().a(j.f5333a, "Registering network callback");
            dc.l.a(this.connectivityManager, this.networkCallback);
        } catch (IllegalArgumentException e15) {
            w.e().d(j.f5333a, "Received exception while registering network callback", e15);
        } catch (SecurityException e16) {
            w.e().d(j.f5333a, "Received exception while registering network callback", e16);
        }
    }

    @Override // ac.h
    public void j() {
        try {
            w.e().a(j.f5333a, "Unregistering network callback");
            this.connectivityManager.unregisterNetworkCallback(this.networkCallback);
        } catch (IllegalArgumentException e15) {
            w.e().d(j.f5333a, "Received exception while unregistering network callback", e15);
        } catch (SecurityException e16) {
            w.e().d(j.f5333a, "Received exception while unregistering network callback", e16);
        }
    }

    @Override // ac.h
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public NetworkState f() {
        return j.c(this.connectivityManager, this.isBlocked);
    }
}
