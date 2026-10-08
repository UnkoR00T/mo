package yb;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import oq.i0;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import ub.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0013\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0003¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J;\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\u001e2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00062\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`\u001c¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\"R0\u0010'\u001a\u001e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001aj\u0002`\u001c\u0012\u0004\u0012\u00020\u00060$8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b%\u0010&R$\u0010-\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00103\u001a\u00020\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0018\u00106\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b4\u00105¨\u00067"}, d2 = {"Lyb/k;", "Landroid/net/ConnectivityManager$NetworkCallback;", "<init>", "()V", "Loq/i0;", "e", "Landroid/net/NetworkRequest;", "request", "Landroid/net/NetworkCapabilities;", "capabilities", "", "d", "(Landroid/net/NetworkRequest;Landroid/net/NetworkCapabilities;)Z", "Landroid/net/Network;", "network", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "blocked", "onBlockedStatusChanged", "(Landroid/net/Network;Z)V", "onLost", "(Landroid/net/Network;)V", "Landroid/net/ConnectivityManager;", "connManager", "networkRequest", "Lkotlin/Function1;", "Lyb/b;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "b", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Ler/l;)Ler/a;", "", "Ljava/lang/Object;", "requestsLock", "", "c", "Ljava/util/Map;", "requests", "Landroid/net/NetworkCapabilities;", "getCachedCapabilities", "()Landroid/net/NetworkCapabilities;", "setCachedCapabilities", "(Landroid/net/NetworkCapabilities;)V", "cachedCapabilities", "Z", "getCapabilitiesInitialized", "()Z", "setCapabilitiesInitialized", "(Z)V", "capabilitiesInitialized", "f", "Ljava/lang/Boolean;", "isBlocked", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class k extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k f225937a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final Object requestsLock = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final Map<er.l<b, i0>, NetworkRequest> requests = new LinkedHashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static NetworkCapabilities cachedCapabilities;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static boolean capabilitiesInitialized;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static Boolean isBlocked;

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(er.l lVar, ConnectivityManager connectivityManager) {
        synchronized (requestsLock) {
            Map<er.l<b, i0>, NetworkRequest> map = requests;
            map.remove(lVar);
            if (map.isEmpty()) {
                w.e().a(m.f225949a, "NetworkRequestConstraintController unregister shared callback");
                connectivityManager.unregisterNetworkCallback(f225937a);
                isBlocked = null;
                cachedCapabilities = null;
                capabilitiesInitialized = false;
            }
        }
        return i0.f148189a;
    }

    private final boolean d(NetworkRequest request, NetworkCapabilities capabilities) {
        return !isBlocked.booleanValue() && request.canBeSatisfiedBy(capabilities);
    }

    private final void e() {
        ArrayList<r> arrayList = new ArrayList();
        synchronized (requestsLock) {
            try {
                if (capabilitiesInitialized && isBlocked != null) {
                    Iterator<T> it = requests.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        arrayList.add(y.a((er.l) entry.getKey(), f225937a.d((NetworkRequest) entry.getValue(), cachedCapabilities) ? b.a.f225911a : new b.ConstraintsNotMet(7)));
                    }
                    i0 i0Var = i0.f148189a;
                    for (r rVar : arrayList) {
                        ((er.l) rVar.a()).b((b) rVar.b());
                    }
                    return;
                }
                w.e().a(m.f225949a, "Not dispatching constraint state yet: isBlocked=" + isBlocked + ", capabilitiesInitialized=" + capabilitiesInitialized);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final er.a<i0> b(final ConnectivityManager connManager, NetworkRequest networkRequest, final er.l<? super b, i0> onConstraintState) {
        synchronized (requestsLock) {
            try {
                Map<er.l<b, i0>, NetworkRequest> map = requests;
                boolean zIsEmpty = map.isEmpty();
                map.put(onConstraintState, networkRequest);
                if (zIsEmpty) {
                    w.e().a(m.f225949a, "NetworkRequestConstraintController register shared callback");
                    connManager.registerDefaultNetworkCallback(f225937a);
                } else if (capabilitiesInitialized && isBlocked != null) {
                    w.e().a(m.f225949a, "NetworkRequestConstraintController send initial capabilities");
                    onConstraintState.b(f225937a.d(networkRequest, cachedCapabilities) ? b.a.f225911a : new b.ConstraintsNotMet(7));
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return new er.a() { // from class: yb.j
            @Override // er.a
            public final Object a() {
                return k.c(onConstraintState, connManager);
            }
        };
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onBlockedStatusChanged(Network network, boolean blocked) {
        w.e().a(m.f225949a, "NetworkRequestConstraintController onBlockedStatusChanged callback " + blocked);
        synchronized (requestsLock) {
            if (t.c(isBlocked, Boolean.valueOf(blocked))) {
                return;
            }
            isBlocked = Boolean.valueOf(blocked);
            i0 i0Var = i0.f148189a;
            e();
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        w.e().a(m.f225949a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        synchronized (requestsLock) {
            cachedCapabilities = networkCapabilities;
            capabilitiesInitialized = true;
            i0 i0Var = i0.f148189a;
        }
        e();
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        w.e().a(m.f225949a, "NetworkRequestConstraintController onLost callback");
        synchronized (requestsLock) {
            try {
                cachedCapabilities = null;
                Iterator<T> it = requests.keySet().iterator();
                while (it.hasNext()) {
                    ((er.l) it.next()).b(new b.ConstraintsNotMet(7));
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
