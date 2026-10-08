package fv;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 K2\u00020\u0001:\u0002IEB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ-\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J-\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\rH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001f\u0010\bJ!\u0010\"\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J1\u0010&\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J9\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u000e2\b\u0010%\u001a\u0004\u0018\u00010$2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u001f\u0010.\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u001f\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b0\u0010/J\u0017\u00101\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u0010\bJ\u001f\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b6\u0010\bJ\u001f\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\bJ\u001f\u0010@\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bB\u0010\bJ\u001f\u0010C\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00108\u001a\u000207H\u0016¢\u0006\u0004\bC\u0010:J\u001f\u0010D\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bD\u0010<J\u0017\u0010E\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bE\u0010\bJ\u001f\u0010F\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bF\u0010<J\u0017\u0010G\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\bG\u0010\bJ\u001f\u0010H\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bH\u0010AJ\u001f\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010?\u001a\u00020>H\u0016¢\u0006\u0004\bI\u0010AJ\u001f\u0010K\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010J\u001a\u00020>H\u0016¢\u0006\u0004\bK\u0010A¨\u0006L"}, d2 = {"Lfv/r;", "", "<init>", "()V", "Lfv/e;", "call", "Loq/i0;", "e", "(Lfv/e;)V", "Lfv/v;", "url", "o", "(Lfv/e;Lfv/v;)V", "", "Ljava/net/Proxy;", "proxies", "n", "(Lfv/e;Lfv/v;Ljava/util/List;)V", "", "domainName", "m", "(Lfv/e;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "l", "(Lfv/e;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "i", "(Lfv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "B", "Lfv/t;", "handshake", "A", "(Lfv/e;Lfv/t;)V", "Lfv/a0;", "protocol", "g", "(Lfv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lfv/a0;)V", "Ljava/io/IOException;", "ioe", "h", "(Lfv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lfv/a0;Ljava/io/IOException;)V", "Lfv/j;", "connection", "j", "(Lfv/e;Lfv/j;)V", "k", "t", "Lfv/b0;", "request", "s", "(Lfv/e;Lfv/b0;)V", "q", "", "byteCount", "p", "(Lfv/e;J)V", "r", "(Lfv/e;Ljava/io/IOException;)V", "y", "Lfv/d0;", "response", "x", "(Lfv/e;Lfv/d0;)V", "v", "u", "w", "c", "d", "f", "z", "b", "cachedResponse", "a", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r f67486b = new a();

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"fv/r$a", "Lfv/r;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a extends r {
        a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lfv/r$c;", "", "Lfv/e;", "call", "Lfv/r;", "a", "(Lfv/e;)Lfv/r;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface c {
        r a(e call);
    }

    public void A(e call, t handshake) {
    }

    public void B(e call) {
    }

    public void a(e call, d0 cachedResponse) {
    }

    public void b(e call, d0 response) {
    }

    public void c(e call) {
    }

    public void d(e call, IOException ioe) {
    }

    public void e(e call) {
    }

    public void f(e call) {
    }

    public void g(e call, InetSocketAddress inetSocketAddress, Proxy proxy, a0 protocol) {
    }

    public void h(e call, InetSocketAddress inetSocketAddress, Proxy proxy, a0 protocol, IOException ioe) {
    }

    public void i(e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void j(e call, j connection) {
    }

    public void k(e call, j connection) {
    }

    public void l(e call, String domainName, List<InetAddress> inetAddressList) {
    }

    public void m(e call, String domainName) {
    }

    public void n(e call, v url, List<Proxy> proxies) {
    }

    public void o(e call, v url) {
    }

    public void p(e call, long byteCount) {
    }

    public void q(e call) {
    }

    public void r(e call, IOException ioe) {
    }

    public void s(e call, b0 request) {
    }

    public void t(e call) {
    }

    public void u(e call, long byteCount) {
    }

    public void v(e call) {
    }

    public void w(e call, IOException ioe) {
    }

    public void x(e call, d0 response) {
    }

    public void y(e call) {
    }

    public void z(e call, d0 response) {
    }
}
