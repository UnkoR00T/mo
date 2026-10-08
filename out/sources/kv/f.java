package kv;

import fr.w;
import fv.a0;
import fv.b0;
import fv.d0;
import fv.f0;
import fv.l;
import fv.r;
import fv.t;
import fv.z;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import nv.m;
import nv.n;
import p071kotlin.Metadata;
import pq.v;
import vv.l0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\u0018\u0000 52\u00020\u00012\u00020\u0002:\u0001cB\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J/\u0010\u0014\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ1\u0010#\u001a\u0004\u0018\u00010\u001f2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u001fH\u0002¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020)2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00050'H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010,\u001a\u00020)2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b,\u0010-J\u001f\u00100\u001a\u00020)2\u0006\u0010\"\u001a\u00020!2\u0006\u0010/\u001a\u00020.H\u0002¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u0011H\u0000¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u0011H\u0000¢\u0006\u0004\b4\u00103J\u000f\u00105\u001a\u00020\u0011H\u0000¢\u0006\u0004\b5\u00103JE\u00107\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\t2\u0006\u00106\u001a\u00020)2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b7\u00108J'\u0010<\u001a\u00020)2\u0006\u0010:\u001a\u0002092\u000e\u0010;\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010'H\u0000¢\u0006\u0004\b<\u0010=J\u001f\u0010C\u001a\u00020B2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@H\u0000¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0005H\u0016¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0011¢\u0006\u0004\bG\u00103J\u000f\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u00020)2\u0006\u0010K\u001a\u00020)¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\u00112\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010V\u001a\u00020\u00112\u0006\u0010S\u001a\u00020R2\u0006\u0010U\u001a\u00020TH\u0016¢\u0006\u0004\bV\u0010WJ\u0011\u0010X\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\bX\u0010YJ'\u0010]\u001a\u00020\u00112\u0006\u0010?\u001a\u00020>2\u0006\u0010Z\u001a\u00020\u00052\u0006\u0010\\\u001a\u00020[H\u0000¢\u0006\u0004\b]\u0010^J!\u0010`\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020_2\b\u0010G\u001a\u0004\u0018\u00010[H\u0000¢\u0006\u0004\b`\u0010aJ\u000f\u0010c\u001a\u00020bH\u0016¢\u0006\u0004\bc\u0010dJ\u000f\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bf\u0010gR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\bP\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR\u0018\u0010n\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010mR\u0018\u0010o\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010mR\u0018\u0010/\u001a\u0004\u0018\u00010.8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010pR\u0018\u0010r\u001a\u0004\u0018\u00010b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010qR\u0018\u0010t\u001a\u0004\u0018\u00010R8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010sR\u0018\u0010w\u001a\u0004\u0018\u00010u8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010vR\u0018\u0010z\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010yR#\u0010\u0080\u0001\u001a\u00020)8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u0017\u0010\u0081\u0001\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010{R'\u0010\u0086\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0019\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0005\b\u0085\u0001\u0010\u001cR\u0019\u0010\u0088\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0082\u0001R\u0019\u0010\u008a\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0082\u0001R\u0018\u0010\u008b\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b|\u0010\u0082\u0001R*\u0010\u0090\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020_0\u008d\u00010\u008c\u00018\u0006¢\u0006\u0010\n\u0006\b\u0083\u0001\u0010\u008e\u0001\u001a\u0006\b\u0087\u0001\u0010\u008f\u0001R)\u0010\u0096\u0001\u001a\u00030\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bX\u0010\u0092\u0001\u001a\u0006\b\u0089\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0016\u0010\u0098\u0001\u001a\u00020)8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0097\u0001\u0010}¨\u0006\u0099\u0001"}, d2 = {"Lkv/f;", "Lnv/f$c;", "Lfv/j;", "Lkv/g;", "connectionPool", "Lfv/f0;", "route", "<init>", "(Lkv/g;Lfv/f0;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "Lfv/e;", "call", "Lfv/r;", "eventListener", "Loq/i0;", "k", "(IIILfv/e;Lfv/r;)V", "i", "(IILfv/e;Lfv/r;)V", "Lkv/b;", "connectionSpecSelector", "pingIntervalMillis", "n", "(Lkv/b;ILfv/e;Lfv/r;)V", "F", "(I)V", "j", "(Lkv/b;)V", "Lfv/b0;", "tunnelRequest", "Lfv/v;", "url", "l", "(IILfv/b0;Lfv/v;)Lfv/b0;", "m", "()Lfv/b0;", "", "candidates", "", "B", "(Ljava/util/List;)Z", "G", "(Lfv/v;)Z", "Lfv/t;", "handshake", "f", "(Lfv/v;Lfv/t;)Z", "z", "()V", "y", "t", "connectionRetryEnabled", "g", "(IIIIZLfv/e;Lfv/r;)V", "Lfv/a;", "address", "routes", "u", "(Lfv/a;Ljava/util/List;)Z", "Lfv/z;", "client", "Llv/g;", "chain", "Llv/d;", "x", "(Lfv/z;Llv/g;)Llv/d;", "A", "()Lfv/f0;", "e", "Ljava/net/Socket;", "E", "()Ljava/net/Socket;", "doExtensiveChecks", "v", "(Z)Z", "Lnv/i;", "stream", "c", "(Lnv/i;)V", "Lnv/f;", "connection", "Lnv/m;", "settings", "b", "(Lnv/f;Lnv/m;)V", "s", "()Lfv/t;", "failedRoute", "Ljava/io/IOException;", "failure", "h", "(Lfv/z;Lfv/f0;Ljava/io/IOException;)V", "Lkv/e;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lkv/e;Ljava/io/IOException;)V", "Lfv/a0;", "a", "()Lfv/a0;", "", "toString", "()Ljava/lang/String;", "Lkv/g;", "getConnectionPool", "()Lkv/g;", "d", "Lfv/f0;", "Ljava/net/Socket;", "rawSocket", "socket", "Lfv/t;", "Lfv/a0;", "protocol", "Lnv/f;", "http2Connection", "Lvv/g;", "Lvv/g;", "source", "Lvv/f;", "Lvv/f;", "sink", "Z", "q", "()Z", ip.a.f96138c, "(Z)V", "noNewExchanges", "noCoalescedConnections", "I", "r", "()I", "setRouteFailureCount$okhttp", "routeFailureCount", "o", "successCount", "p", "refusedStreamCount", "allocationLimit", "", "Ljava/lang/ref/Reference;", "Ljava/util/List;", "()Ljava/util/List;", "calls", "", "J", "()J", "C", "(J)V", "idleAtNs", "w", "isMultiplexed", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class f extends nv.f.c implements fv.j {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final g connectionPool;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f0 route;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Socket rawSocket;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Socket socket;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private t handshake;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private a0 protocol;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private nv.f http2Connection;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private vv.g source;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private vv.f sink;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private boolean noNewExchanges;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private boolean noCoalescedConnections;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int routeFailureCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int successCount;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int refusedStreamCount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int allocationLimit = 1;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final List<Reference<e>> calls = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private long idleAtNs = Long.MAX_VALUE;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112790a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.DIRECT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112790a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/Certificate;", "c", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class c extends w implements er.a<List<? extends Certificate>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ fv.g f112791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ t f112792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ fv.a f112793d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(fv.g gVar, t tVar, fv.a aVar) {
            super(0);
            this.f112791b = gVar;
            this.f112792c = tVar;
            this.f112793d = aVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<Certificate> a() {
            return this.f112791b.getCertificateChainCleaner().a(this.f112792c.d(), this.f112793d.getUrl().getHost());
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Ljava/security/cert/X509Certificate;", "c", "()Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class d extends w implements er.a<List<? extends X509Certificate>> {
        d() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final List<X509Certificate> a() {
            List<Certificate> listD = f.this.handshake.d();
            ArrayList arrayList = new ArrayList(v.y(listD, 10));
            Iterator<T> it = listD.iterator();
            while (it.hasNext()) {
                arrayList.add((X509Certificate) ((Certificate) it.next()));
            }
            return arrayList;
        }
    }

    public f(g gVar, f0 f0Var) {
        this.connectionPool = gVar;
        this.route = f0Var;
    }

    private final boolean B(List<f0> candidates) {
        List<f0> list = candidates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (f0 f0Var : list) {
            Proxy.Type type = f0Var.getProxy().type();
            Proxy.Type type2 = Proxy.Type.DIRECT;
            if (type == type2 && this.route.getProxy().type() == type2 && fr.t.c(this.route.getSocketAddress(), f0Var.getSocketAddress())) {
                return true;
            }
        }
        return false;
    }

    private final void F(int pingIntervalMillis) throws SocketException {
        Socket socket = this.socket;
        vv.g gVar = this.source;
        vv.f fVar = this.sink;
        socket.setSoTimeout(0);
        nv.f fVarA = new nv.f.a(true, jv.e.f106031i).q(socket, this.route.getAddress().getUrl().getHost(), gVar, fVar).k(this).l(pingIntervalMillis).a();
        this.http2Connection = fVarA;
        this.allocationLimit = nv.f.INSTANCE.a().d();
        nv.f.i2(fVarA, false, null, 3, null);
    }

    private final boolean G(fv.v url) {
        t tVar;
        if (!gv.d.f77110h || Thread.holdsLock(this)) {
            fv.v url2 = this.route.getAddress().getUrl();
            if (url.getPort() != url2.getPort()) {
                return false;
            }
            if (fr.t.c(url.getHost(), url2.getHost())) {
                return true;
            }
            return (this.noCoalescedConnections || (tVar = this.handshake) == null || !f(url, tVar)) ? false : true;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
    }

    private final boolean f(fv.v url, t handshake) {
        List<Certificate> listD = handshake.d();
        return !listD.isEmpty() && sv.d.f184435a.e(url.getHost(), (X509Certificate) listD.get(0));
    }

    private final void i(int connectTimeout, int readTimeout, fv.e call, r eventListener) throws IOException {
        Proxy proxy = this.route.getProxy();
        fv.a address = this.route.getAddress();
        Proxy.Type type = proxy.type();
        int i15 = type == null ? -1 : b.f112790a[type.ordinal()];
        Socket socketCreateSocket = (i15 == 1 || i15 == 2) ? address.getSocketFactory().createSocket() : new Socket(proxy);
        this.rawSocket = socketCreateSocket;
        eventListener.i(call, this.route.getSocketAddress(), proxy);
        socketCreateSocket.setSoTimeout(readTimeout);
        try {
            ov.h.INSTANCE.g().f(socketCreateSocket, this.route.getSocketAddress(), connectTimeout);
            try {
                this.source = vv.v.c(vv.v.k(socketCreateSocket));
                this.sink = vv.v.b(vv.v.g(socketCreateSocket));
            } catch (NullPointerException e15) {
                if (fr.t.c(e15.getMessage(), "throw with null exception")) {
                    throw new IOException(e15);
                }
            }
        } catch (ConnectException e16) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.route.getSocketAddress());
            connectException.initCause(e16);
            throw connectException;
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private final void j(kv.b connectionSpecSelector) throws Throwable {
        fv.a address = this.route.getAddress();
        SSLSocket sSLSocket = null;
        try {
            SSLSocket sSLSocket2 = (SSLSocket) address.getSslSocketFactory().createSocket(this.rawSocket, address.getUrl().getHost(), address.getUrl().getPort(), true);
            try {
                l lVarA = connectionSpecSelector.a(sSLSocket2);
                if (lVarA.getSupportsTlsExtensions()) {
                    ov.h.INSTANCE.g().e(sSLSocket2, address.getUrl().getHost(), address.f());
                }
                sSLSocket2.startHandshake();
                SSLSession session = sSLSocket2.getSession();
                t tVarA = t.INSTANCE.a(session);
                if (address.getHostnameVerifier().verify(address.getUrl().getHost(), session)) {
                    fv.g certificatePinner = address.getCertificatePinner();
                    this.handshake = new t(tVarA.getTlsVersion(), tVarA.getCipherSuite(), tVarA.c(), new c(certificatePinner, tVarA, address));
                    certificatePinner.b(address.getUrl().getHost(), new d());
                    String strG = lVarA.getSupportsTlsExtensions() ? ov.h.INSTANCE.g().g(sSLSocket2) : null;
                    this.socket = sSLSocket2;
                    this.source = vv.v.c(vv.v.k(sSLSocket2));
                    this.sink = vv.v.b(vv.v.g(sSLSocket2));
                    this.protocol = strG != null ? a0.INSTANCE.a(strG) : a0.HTTP_1_1;
                    ov.h.INSTANCE.g().b(sSLSocket2);
                    return;
                }
                List<Certificate> listD = tVarA.d();
                if (listD.isEmpty()) {
                    throw new SSLPeerUnverifiedException("Hostname " + address.getUrl().getHost() + " not verified (no certificates)");
                }
                X509Certificate x509Certificate = (X509Certificate) listD.get(0);
                throw new SSLPeerUnverifiedException(fu.r.p("\n              |Hostname " + address.getUrl().getHost() + " not verified:\n              |    certificate: " + fv.g.INSTANCE.a(x509Certificate) + "\n              |    DN: " + x509Certificate.getSubjectDN().getName() + "\n              |    subjectAltNames: " + sv.d.f184435a.a(x509Certificate) + "\n              ", null, 1, null));
            } catch (Throwable th4) {
                th = th4;
                sSLSocket = sSLSocket2;
                if (sSLSocket != null) {
                    ov.h.INSTANCE.g().b(sSLSocket);
                }
                if (sSLSocket != null) {
                    gv.d.n(sSLSocket);
                }
                throw th;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    private final void k(int connectTimeout, int readTimeout, int writeTimeout, fv.e call, r eventListener) throws IOException {
        b0 b0VarM = m();
        fv.v url = b0VarM.getUrl();
        for (int i15 = 0; i15 < 21; i15++) {
            i(connectTimeout, readTimeout, call, eventListener);
            b0VarM = l(readTimeout, writeTimeout, b0VarM, url);
            if (b0VarM == null) {
                return;
            }
            Socket socket = this.rawSocket;
            if (socket != null) {
                gv.d.n(socket);
            }
            this.rawSocket = null;
            this.sink = null;
            this.source = null;
            eventListener.g(call, this.route.getSocketAddress(), this.route.getProxy(), null);
        }
    }

    private final b0 l(int readTimeout, int writeTimeout, b0 tunnelRequest, fv.v url) throws IOException {
        String str = "CONNECT " + gv.d.Q(url, true) + " HTTP/1.1";
        while (true) {
            vv.g gVar = this.source;
            vv.f fVar = this.sink;
            mv.b bVar = new mv.b(null, this, gVar, fVar);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            gVar.getTimeout().g(readTimeout, timeUnit);
            fVar.getTimeout().g(writeTimeout, timeUnit);
            bVar.A(tunnelRequest.getHeaders(), str);
            bVar.c();
            d0 d0VarC = bVar.g(false).r(tunnelRequest).c();
            bVar.z(d0VarC);
            int code = d0VarC.getCode();
            if (code == 200) {
                if (gVar.getBufferField().K2() && fVar.getBufferField().K2()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (code != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + d0VarC.getCode());
            }
            b0 b0VarA = this.route.getAddress().getProxyAuthenticator().a(this.route, d0VarC);
            if (b0VarA == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if (fu.r.G("close", d0.E(d0VarC, "Connection", null, 2, null), true)) {
                return b0VarA;
            }
            tunnelRequest = b0VarA;
        }
    }

    private final b0 m() {
        b0 b0VarB = new b0.a().j(this.route.getAddress().getUrl()).f("CONNECT", null).d("Host", gv.d.Q(this.route.getAddress().getUrl(), true)).d("Proxy-Connection", "Keep-Alive").d("User-Agent", "okhttp/4.12.0").b();
        b0 b0VarA = this.route.getAddress().getProxyAuthenticator().a(this.route, new d0.a().r(b0VarB).p(a0.HTTP_1_1).g(407).m("Preemptive Authenticate").b(gv.d.f77105c).s(-1L).q(-1L).j("Proxy-Authenticate", "OkHttp-Preemptive").c());
        return b0VarA == null ? b0VarB : b0VarA;
    }

    private final void n(kv.b connectionSpecSelector, int pingIntervalMillis, fv.e call, r eventListener) throws Throwable {
        if (this.route.getAddress().getSslSocketFactory() != null) {
            eventListener.B(call);
            j(connectionSpecSelector);
            eventListener.A(call, this.handshake);
            if (this.protocol == a0.HTTP_2) {
                F(pingIntervalMillis);
                return;
            }
            return;
        }
        List<a0> listF = this.route.getAddress().f();
        a0 a0Var = a0.H2_PRIOR_KNOWLEDGE;
        if (!listF.contains(a0Var)) {
            this.socket = this.rawSocket;
            this.protocol = a0.HTTP_1_1;
        } else {
            this.socket = this.rawSocket;
            this.protocol = a0Var;
            F(pingIntervalMillis);
        }
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public f0 getRoute() {
        return this.route;
    }

    public final void C(long j15) {
        this.idleAtNs = j15;
    }

    public final void D(boolean z15) {
        this.noNewExchanges = z15;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public Socket getSocket() {
        return this.socket;
    }

    public final synchronized void H(e call, IOException e15) {
        try {
            if (e15 instanceof n) {
                if (((n) e15).errorCode == nv.b.REFUSED_STREAM) {
                    int i15 = this.refusedStreamCount + 1;
                    this.refusedStreamCount = i15;
                    if (i15 > 1) {
                        this.noNewExchanges = true;
                        this.routeFailureCount++;
                    }
                } else if (((n) e15).errorCode != nv.b.CANCEL || !call.getCanceled()) {
                    this.noNewExchanges = true;
                    this.routeFailureCount++;
                }
            } else if (!w() || (e15 instanceof nv.a)) {
                this.noNewExchanges = true;
                if (this.successCount == 0) {
                    if (e15 != null) {
                        h(call.getClient(), this.route, e15);
                    }
                    this.routeFailureCount++;
                }
            }
        } catch (Throwable th4) {
            throw th4;
        }
    }

    @Override // fv.j
    /* JADX INFO: renamed from: a, reason: from getter */
    public a0 getProtocol() {
        return this.protocol;
    }

    @Override // nv.f.c
    public synchronized void b(nv.f connection, m settings) {
        this.allocationLimit = settings.d();
    }

    @Override // nv.f.c
    public void c(nv.i stream) {
        stream.d(nv.b.REFUSED_STREAM, null);
    }

    public final void e() {
        Socket socket = this.rawSocket;
        if (socket != null) {
            gv.d.n(socket);
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:53:0x0100  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:57:0x012c  */
    /* JADX WARN: Code duplicated, block: B:59:0x0131  */
    /* JADX WARN: Code duplicated, block: B:77:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:? A[LOOP:0: B:73:0x0084->B:79:?, LOOP_END, SYNTHETIC] */
    public final void g(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, fv.e call, r eventListener) throws Throwable {
        fv.e eVar;
        r rVar;
        IOException iOException;
        Socket socket;
        Socket socket2;
        if (this.protocol != null) {
            throw new IllegalStateException("already connected");
        }
        List<l> listB = this.route.getAddress().b();
        kv.b bVar = new kv.b(listB);
        if (this.route.getAddress().getSslSocketFactory() == null) {
            if (!listB.contains(l.f67448k)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String host = this.route.getAddress().getUrl().getHost();
            if (!ov.h.INSTANCE.g().i(host)) {
                throw new i(new UnknownServiceException("CLEARTEXT communication to " + host + " not permitted by network security policy"));
            }
        } else if (this.route.getAddress().f().contains(a0.H2_PRIOR_KNOWLEDGE)) {
            throw new i(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
        }
        i iVar = null;
        while (true) {
            try {
                if (this.route.c()) {
                    try {
                        k(connectTimeout, readTimeout, writeTimeout, call, eventListener);
                        eVar = call;
                        rVar = eventListener;
                        try {
                            if (this.rawSocket != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e15) {
                            e = e15;
                            iOException = e;
                            socket = this.socket;
                            if (socket != null) {
                                gv.d.n(socket);
                            }
                            socket2 = this.rawSocket;
                            if (socket2 != null) {
                                gv.d.n(socket2);
                            }
                            this.socket = null;
                            this.rawSocket = null;
                            this.source = null;
                            this.sink = null;
                            this.handshake = null;
                            this.protocol = null;
                            this.http2Connection = null;
                            this.allocationLimit = 1;
                            rVar.h(eVar, this.route.getSocketAddress(), this.route.getProxy(), null, iOException);
                            if (iVar == null) {
                                iVar = new i(iOException);
                            } else {
                                iVar.a(iOException);
                            }
                            if (connectionRetryEnabled) {
                                throw iVar;
                            }
                            if (bVar.b(iOException)) {
                                throw iVar;
                            }
                        }
                    } catch (IOException e16) {
                        e = e16;
                        eVar = call;
                        rVar = eventListener;
                    }
                } else {
                    eVar = call;
                    rVar = eventListener;
                    i(connectTimeout, readTimeout, eVar, rVar);
                }
                try {
                    n(bVar, pingIntervalMillis, eVar, rVar);
                    rVar.g(eVar, this.route.getSocketAddress(), this.route.getProxy(), this.protocol);
                    break;
                } catch (IOException e17) {
                    e = e17;
                    iOException = e;
                    socket = this.socket;
                    if (socket != null) {
                        gv.d.n(socket);
                    }
                    socket2 = this.rawSocket;
                    if (socket2 != null) {
                        gv.d.n(socket2);
                    }
                    this.socket = null;
                    this.rawSocket = null;
                    this.source = null;
                    this.sink = null;
                    this.handshake = null;
                    this.protocol = null;
                    this.http2Connection = null;
                    this.allocationLimit = 1;
                    rVar.h(eVar, this.route.getSocketAddress(), this.route.getProxy(), null, iOException);
                    if (iVar == null) {
                        iVar = new i(iOException);
                    } else {
                        iVar.a(iOException);
                    }
                    if (connectionRetryEnabled) {
                        throw iVar;
                    }
                    if (bVar.b(iOException)) {
                        throw iVar;
                    }
                }
            } catch (IOException e18) {
                e = e18;
                eVar = call;
                rVar = eventListener;
            }
        }
        if (this.route.c() && this.rawSocket == null) {
            throw new i(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        this.idleAtNs = System.nanoTime();
    }

    public final void h(z client, f0 failedRoute, IOException failure) {
        if (failedRoute.getProxy().type() != Proxy.Type.DIRECT) {
            fv.a address = failedRoute.getAddress();
            address.getProxySelector().connectFailed(address.getUrl().s(), failedRoute.getProxy().address(), failure);
        }
        client.getRouteDatabase().b(failedRoute);
    }

    public final List<Reference<e>> o() {
        return this.calls;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getIdleAtNs() {
        return this.idleAtNs;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final boolean getNoNewExchanges() {
        return this.noNewExchanges;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final int getRouteFailureCount() {
        return this.routeFailureCount;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public t getHandshake() {
        return this.handshake;
    }

    public final synchronized void t() {
        this.successCount++;
    }

    public String toString() {
        Object cipherSuite;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Connection{");
        sb5.append(this.route.getAddress().getUrl().getHost());
        sb5.append(':');
        sb5.append(this.route.getAddress().getUrl().getPort());
        sb5.append(", proxy=");
        sb5.append(this.route.getProxy());
        sb5.append(" hostAddress=");
        sb5.append(this.route.getSocketAddress());
        sb5.append(" cipherSuite=");
        t tVar = this.handshake;
        if (tVar == null || (cipherSuite = tVar.getCipherSuite()) == null) {
            cipherSuite = "none";
        }
        sb5.append(cipherSuite);
        sb5.append(" protocol=");
        sb5.append(this.protocol);
        sb5.append('}');
        return sb5.toString();
    }

    public final boolean u(fv.a address, List<f0> routes) {
        if (gv.d.f77110h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (this.calls.size() >= this.allocationLimit || this.noNewExchanges || !this.route.getAddress().d(address)) {
            return false;
        }
        if (fr.t.c(address.getUrl().getHost(), getRoute().getAddress().getUrl().getHost())) {
            return true;
        }
        if (this.http2Connection == null || routes == null || !B(routes) || address.getHostnameVerifier() != sv.d.f184435a || !G(address.getUrl())) {
            return false;
        }
        try {
            address.getCertificatePinner().a(address.getUrl().getHost(), getHandshake().d());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    public final boolean v(boolean doExtensiveChecks) {
        long j15;
        if (gv.d.f77110h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        long jNanoTime = System.nanoTime();
        Socket socket = this.rawSocket;
        Socket socket2 = this.socket;
        vv.g gVar = this.source;
        if (socket.isClosed() || socket2.isClosed() || socket2.isInputShutdown() || socket2.isOutputShutdown()) {
            return false;
        }
        nv.f fVar = this.http2Connection;
        if (fVar != null) {
            return fVar.d1(jNanoTime);
        }
        synchronized (this) {
            j15 = jNanoTime - this.idleAtNs;
        }
        if (j15 < 10000000000L || !doExtensiveChecks) {
            return true;
        }
        return gv.d.F(socket2, gVar);
    }

    public final boolean w() {
        return this.http2Connection != null;
    }

    public final lv.d x(z client, lv.g chain) throws SocketException {
        Socket socket = this.socket;
        vv.g gVar = this.source;
        vv.f fVar = this.sink;
        nv.f fVar2 = this.http2Connection;
        if (fVar2 != null) {
            return new nv.g(client, this, chain, fVar2);
        }
        socket.setSoTimeout(chain.k());
        l0 f208341a = gVar.getTimeout();
        long jH = chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        f208341a.g(jH, timeUnit);
        fVar.getTimeout().g(chain.getWriteTimeoutMillis(), timeUnit);
        return new mv.b(client, this, gVar, fVar);
    }

    public final synchronized void y() {
        this.noCoalescedConnections = true;
    }

    public final synchronized void z() {
        this.noNewExchanges = true;
    }
}
