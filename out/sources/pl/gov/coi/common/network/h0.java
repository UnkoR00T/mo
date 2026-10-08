package pl.gov.coi.common.network;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import java.lang.reflect.Method;
import ju.d2;
import ju.g1;
import ju.z2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001b¨\u0006\u001d"}, d2 = {"Lpl/gov/coi/common/network/h0;", "Lay/k;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "connected", "Lju/d2;", "i", "(Z)Lju/d2;", "Loq/i0;", "a", "()V", "Lmu/a0;", "h", "()Lmu/a0;", "e", "()Z", "c", "b", "Lmu/a0;", "networkConnectionStatus", "Lju/p0;", "Lju/p0;", "scope", "Landroid/net/ConnectivityManager;", "Landroid/net/ConnectivityManager;", "connectivityManager", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 implements ay.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mu.a0<Boolean> networkConnectionStatus = mu.h0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ju.p0 scope = ju.q0.a(g1.b().n0(z2.b(null, 1, null)));

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ConnectivityManager connectivityManager;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"pl/gov/coi/common/network/h0$a", "Landroid/net/ConnectivityManager$NetworkCallback;", "Landroid/net/Network;", "network", "Loq/i0;", "onAvailable", "(Landroid/net/Network;)V", "onLost", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            h0.this.i(true);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            h0.this.i(false);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f158124e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f158126g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(boolean z15, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f158126g = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f158124e;
            if (i15 == 0) {
                oq.u.b(obj);
                mu.a0 a0Var = h0.this.networkConnectionStatus;
                Boolean boolA = vq.b.a(this.f158126g);
                this.f158124e = 1;
                if (a0Var.F(boolA, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return h0.this.new b(this.f158126g, eVar);
        }
    }

    public h0(Context context) {
        this.connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d2 i(boolean connected) {
        return ju.k.d(this.scope, null, null, new b(connected, null), 3, null);
    }

    @Override // ay.k
    public void a() {
        this.connectivityManager.registerDefaultNetworkCallback(new a());
    }

    @Override // ay.k
    public boolean b() {
        try {
            Method declaredMethod = Class.forName(this.connectivityManager.getClass().getName()).getDeclaredMethod("getMobileDataEnabled", null);
            declaredMethod.setAccessible(true);
            return ((Boolean) declaredMethod.invoke(this.connectivityManager, null)).booleanValue();
        } catch (Exception unused) {
            ConnectivityManager connectivityManager = this.connectivityManager;
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            if (networkCapabilities != null) {
                return networkCapabilities.hasTransport(0);
            }
            return false;
        }
    }

    @Override // ay.k
    public boolean c() {
        ConnectivityManager connectivityManager = this.connectivityManager;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (networkCapabilities != null) {
            return networkCapabilities.hasTransport(1);
        }
        return false;
    }

    @Override // ay.k
    public boolean e() {
        NetworkCapabilities networkCapabilities;
        Network activeNetwork = this.connectivityManager.getActiveNetwork();
        if (activeNetwork == null || (networkCapabilities = this.connectivityManager.getNetworkCapabilities(activeNetwork)) == null) {
            return false;
        }
        return networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(0) || networkCapabilities.hasTransport(3) || networkCapabilities.hasTransport(6) || networkCapabilities.hasTransport(4);
    }

    @Override // ay.k
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public mu.a0<Boolean> d() {
        return this.networkConnectionStatus;
    }
}
