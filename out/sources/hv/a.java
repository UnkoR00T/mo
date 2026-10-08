package hv;

import fr.k;
import fu.r;
import fv.b;
import fv.b0;
import fv.d0;
import fv.f0;
import fv.h;
import fv.o;
import fv.q;
import fv.v;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u00020\n*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lhv/a;", "Lfv/b;", "Lfv/q;", "defaultDns", "<init>", "(Lfv/q;)V", "Ljava/net/Proxy;", "Lfv/v;", "url", "dns", "Ljava/net/InetAddress;", "b", "(Ljava/net/Proxy;Lfv/v;Lfv/q;)Ljava/net/InetAddress;", "Lfv/f0;", "route", "Lfv/d0;", "response", "Lfv/b0;", "a", "(Lfv/f0;Lfv/d0;)Lfv/b0;", "d", "Lfv/q;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q defaultDns;

    /* JADX INFO: renamed from: hv.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class C2030a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86697a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f86697a = iArr;
        }
    }

    public a(q qVar) {
        this.defaultDns = qVar;
    }

    private final InetAddress b(Proxy proxy, v vVar, q qVar) {
        Proxy.Type type = proxy.type();
        return (type == null ? -1 : C2030a.f86697a[type.ordinal()]) == 1 ? (InetAddress) pq.v.l0(qVar.a(vVar.getHost())) : ((InetSocketAddress) proxy.address()).getAddress();
    }

    @Override // fv.b
    public b0 a(f0 route, d0 response) {
        Proxy proxy;
        q dns;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        fv.a address;
        List<h> listP = response.p();
        b0 request = response.getRequest();
        v url = request.getUrl();
        boolean z15 = response.getCode() == 407;
        if (route == null || (proxy = route.getProxy()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (h hVar : listP) {
            if (r.G("Basic", hVar.getScheme(), true)) {
                if (route == null || (address = route.getAddress()) == null || (dns = address.getDns()) == null) {
                    dns = this.defaultDns;
                }
                if (z15) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) proxy.address();
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(inetSocketAddress.getHostName(), b(proxy, url, dns), inetSocketAddress.getPort(), url.getScheme(), hVar.b(), hVar.getScheme(), url.t(), Authenticator.RequestorType.PROXY);
                } else {
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(url.getHost(), b(proxy, url, dns), url.getPort(), url.getScheme(), hVar.b(), hVar.getScheme(), url.t(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    return request.i().d(z15 ? "Proxy-Authorization" : "Authorization", o.a(passwordAuthenticationRequestPasswordAuthentication.getUserName(), new String(passwordAuthenticationRequestPasswordAuthentication.getPassword()), hVar.a())).b();
                }
            }
        }
        return null;
    }

    public /* synthetic */ a(q qVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? q.f67483b : qVar);
    }
}
