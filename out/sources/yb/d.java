package yb;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import fr.l0;
import fu.r;
import oq.i0;
import p071kotlin.Metadata;
import ub.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u0000 \u00132\u00020\u0001:\u0001\u0011B!\b\u0002\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lyb/d;", "Landroid/net/ConnectivityManager$NetworkCallback;", "Lkotlin/Function1;", "Lyb/b;", "Loq/i0;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "<init>", "(Ler/l;)V", "Landroid/net/Network;", "network", "Landroid/net/NetworkCapabilities;", "networkCapabilities", "onCapabilitiesChanged", "(Landroid/net/Network;Landroid/net/NetworkCapabilities;)V", "onLost", "(Landroid/net/Network;)V", "a", "Ler/l;", "b", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<b, i0> onConstraintState;

    /* JADX INFO: renamed from: yb.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J;\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\n0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0016\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bj\u0002`\u000b¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lyb/d$a;", "", "<init>", "()V", "Landroid/net/ConnectivityManager;", "connManager", "Landroid/net/NetworkRequest;", "networkRequest", "Lkotlin/Function1;", "Lyb/b;", "Loq/i0;", "Landroidx/work/impl/constraints/OnConstraintState;", "onConstraintState", "Lkotlin/Function0;", "b", "(Landroid/net/ConnectivityManager;Landroid/net/NetworkRequest;Ler/l;)Ler/a;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 c(l0 l0Var, ConnectivityManager connectivityManager, d dVar) {
            if (l0Var.f66404a) {
                w.e().a(m.f225949a, "NetworkRequestConstraintController unregister callback");
                connectivityManager.unregisterNetworkCallback(dVar);
            }
            return i0.f148189a;
        }

        public final er.a<i0> b(final ConnectivityManager connManager, NetworkRequest networkRequest, er.l<? super b, i0> onConstraintState) {
            final d dVar = new d(onConstraintState, null);
            final l0 l0Var = new l0();
            try {
                w.e().a(m.f225949a, "NetworkRequestConstraintController register callback");
                connManager.registerNetworkCallback(networkRequest, dVar);
                l0Var.f66404a = true;
            } catch (RuntimeException e15) {
                if (!r.F(e15.getClass().getName(), "TooManyRequestsException", false, 2, null)) {
                    throw e15;
                }
                w.e().b(m.f225949a, "NetworkRequestConstraintController couldn't register callback", e15);
                onConstraintState.b(new b.ConstraintsNotMet(7));
            }
            return new er.a() { // from class: yb.c
                @Override // er.a
                public final Object a() {
                    return d.Companion.c(l0Var, connManager, dVar);
                }
            };
        }

        private Companion() {
        }
    }

    public /* synthetic */ d(er.l lVar, fr.k kVar) {
        this(lVar);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        w.e().a(m.f225949a, "NetworkRequestConstraintController onCapabilitiesChanged callback");
        this.onConstraintState.b(b.a.f225911a);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public void onLost(Network network) {
        w.e().a(m.f225949a, "NetworkRequestConstraintController onLost callback");
        this.onConstraintState.b(new b.ConstraintsNotMet(7));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d(er.l<? super b, i0> lVar) {
        this.onConstraintState = lVar;
    }
}
