package com.google.android.libraries.places.internal;

import java.io.EOFException;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Socket;
import java.net.URI;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Deque;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: loaded from: classes4.dex */
final class ao0 implements vb0, fn0, no0, jb0 {
    private static final Map P;
    private static final Logger Q;
    static final boolean R;
    private boolean A;
    private final SocketFactory B;
    private SSLSocketFactory C;
    private HostnameVerifier D;
    private Socket E;
    private int F;
    private final Deque G;
    private final to0 H;
    private final Runnable I;
    private final int J;
    private final sm0 K;
    private final Map L;
    private final ef0 M;
    final y50 N;
    int O;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Socket f31676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SSLSession f31677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final InetSocketAddress f31678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f31679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f31680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Random f31681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final zj.w f31682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f31683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final yp0 f31684i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private gi0 f31685j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private gn0 f31686k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private po0 f31687l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Object f31688m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final n60 f31689n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f31690o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final Map f31691p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final Executor f31692q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final wl0 f31693r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final ScheduledExecutorService f31694s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final int f31695t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f31696u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private yn0 f31697v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b40 f31698w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private l90 f31699x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private boolean f31700y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private boolean f31701z;

    static {
        EnumMap enumMap = new EnumMap(ip0.class);
        ip0 ip0Var = ip0.NO_ERROR;
        l90 l90Var = l90.f32814l;
        enumMap.put(ip0Var, l90Var.e("No error: A GRPC status of OK should have been sent"));
        enumMap.put(ip0.PROTOCOL_ERROR, l90Var.e("Protocol error"));
        enumMap.put(ip0.INTERNAL_ERROR, l90Var.e("Internal error"));
        enumMap.put(ip0.FLOW_CONTROL_ERROR, l90Var.e("Flow control error"));
        enumMap.put(ip0.STREAM_CLOSED, l90Var.e("Stream closed"));
        enumMap.put(ip0.FRAME_TOO_LARGE, l90Var.e("Frame too large"));
        enumMap.put(ip0.REFUSED_STREAM, l90.f32815m.e("Refused stream"));
        enumMap.put(ip0.CANCEL, l90.f32808f.e("Cancelled"));
        enumMap.put(ip0.COMPRESSION_ERROR, l90Var.e("Compression error"));
        enumMap.put(ip0.CONNECT_ERROR, l90Var.e("Connect error"));
        enumMap.put(ip0.ENHANCE_YOUR_CALM, l90.f32812j.e("Enhance your calm"));
        enumMap.put(ip0.INADEQUATE_SECURITY, l90.f32811i.e("Inadequate security"));
        P = Collections.unmodifiableMap(enumMap);
        Q = Logger.getLogger(ao0.class.getName());
        w70 w70Var = ze0.f34495c;
        R = k60.b("GRPC_ENABLE_PER_RPC_AUTHORITY_CHECK", false);
        try {
            Class.forName("javax.net.ssl.X509ExtendedTrustManager").getMethod("checkServerTrusted", X509Certificate[].class, String.class, Socket.class);
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
        }
    }

    public ao0(nn0 nn0Var, InetSocketAddress inetSocketAddress, String str, String str2, b40 b40Var, y50 y50Var, Runnable runnable, h40 h40Var) {
        zj.w wVar = ze0.f34510r;
        up0 up0Var = new up0();
        this.f31681f = new Random();
        Object obj = new Object();
        this.f31688m = obj;
        this.f31691p = new HashMap();
        this.F = 0;
        this.G = new LinkedList();
        this.L = new zn0(null);
        this.M = new sn0(this);
        this.O = 30000;
        this.f31678c = (InetSocketAddress) zj.p.r(inetSocketAddress, "address");
        this.f31679d = str;
        this.f31695t = 4194304;
        this.f31683h = 65535;
        this.f31692q = (Executor) zj.p.r(nn0Var.f33071b, "executor");
        this.f31693r = new wl0(nn0Var.f33071b);
        this.f31694s = (ScheduledExecutorService) zj.p.r(nn0Var.f33073d, "scheduledExecutorService");
        this.f31690o = 3;
        this.B = SocketFactory.getDefault();
        this.C = nn0Var.f33075f;
        this.D = xo0.f34303a;
        this.H = (to0) zj.p.r(nn0Var.f33076g, "connectionSpec");
        this.f31682g = (zj.w) zj.p.r(wVar, "stopwatchFactory");
        this.f31684i = (yp0) zj.p.r(up0Var, "variant");
        StringBuilder sb5 = new StringBuilder();
        if (str2 != null) {
            sb5.append(str2);
            sb5.append(' ');
        }
        sb5.append("grpc-java-okhttp/1.81.0-SNAPSHOT");
        this.f31680e = sb5.toString();
        this.N = y50Var;
        this.I = (Runnable) zj.p.r(runnable, "tooManyPingsRunnable");
        this.J = Integer.MAX_VALUE;
        this.K = nn0Var.f33074e.a();
        this.f31689n = n60.a(ao0.class, inetSocketAddress.toString());
        z30 z30VarB = b40.b();
        z30VarB.a(qe0.f33408b, b40Var);
        this.f31698w = z30VarB.c();
        synchronized (obj) {
        }
    }

    private final void K(rn0 rn0Var) {
        zj.p.x(rn0Var.J().P() == -1, "StreamId already assigned");
        this.f31691p.put(Integer.valueOf(this.f31690o), rn0Var);
        Q(rn0Var);
        rn0Var.J().L(this.f31690o);
        if (rn0Var.K() == d80.UNARY || rn0Var.K() == d80.SERVER_STREAMING) {
            rn0Var.y();
        } else {
            this.f31686k.d();
        }
        int i15 = this.f31690o;
        if (i15 < 2147483645) {
            this.f31690o = i15 + 2;
        } else {
            this.f31690o = Integer.MAX_VALUE;
            e0(Integer.MAX_VALUE, ip0.NO_ERROR, l90.f32815m.e("Stream ids exhausted"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public final boolean b0() {
        boolean z15 = false;
        while (true) {
            Deque deque = this.G;
            if (deque.isEmpty() || this.f31691p.size() >= this.F) {
                break;
            }
            K((rn0) deque.poll());
            z15 = true;
        }
        return z15;
    }

    private static String M(es0 es0Var) throws EOFException {
        nr0 nr0Var = new nr0();
        while (es0Var.V1(nr0Var, 1L) != -1) {
            if (nr0Var.a0(nr0Var.K() - 1) == 10) {
                return nr0Var.n0(Long.MAX_VALUE);
            }
        }
        throw new EOFException("\\n not found: ".concat(String.valueOf(nr0Var.C2(nr0Var.K()).o())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public final void e0(int i15, ip0 ip0Var, l90 l90Var) {
        synchronized (this.f31688m) {
            try {
                if (this.f31699x == null) {
                    this.f31699x = l90Var;
                    this.f31685j.a(l90Var, new pe0(ip0Var == null ? xe0.f34268c : xe0.b(ip0Var.f32605a)));
                }
                if (ip0Var != null && !this.f31700y) {
                    this.f31700y = true;
                    this.f31686k.m2(0, ip0Var, new byte[0]);
                }
                Iterator it = this.f31691p.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (((Integer) entry.getKey()).intValue() > i15) {
                        it.remove();
                        ((rn0) entry.getValue()).J().z(l90Var, hb0.REFUSED, false, new a80());
                        P((rn0) entry.getValue());
                    }
                }
                Deque<rn0> deque = this.G;
                for (rn0 rn0Var : deque) {
                    rn0Var.J().z(l90Var, hb0.MISCARRIED, true, new a80());
                    P(rn0Var);
                }
                deque.clear();
                O();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void O() {
        if (this.f31699x == null || !this.f31691p.isEmpty() || !this.G.isEmpty() || this.f31701z) {
            return;
        }
        this.f31701z = true;
        if (!this.f31700y) {
            this.f31700y = true;
            this.f31686k.m2(0, ip0.NO_ERROR, new byte[0]);
        }
        this.f31686k.close();
    }

    private final void P(rn0 rn0Var) {
        if (this.A && this.G.isEmpty() && this.f31691p.isEmpty()) {
            this.A = false;
        }
        if (rn0Var.v()) {
            this.M.a(rn0Var, false);
        }
    }

    private final void Q(rn0 rn0Var) {
        if (!this.A) {
            this.A = true;
        }
        if (rn0Var.v()) {
            this.M.a(rn0Var, true);
        }
    }

    static l90 a0(ip0 ip0Var) {
        l90 l90Var = (l90) P.get(ip0Var);
        if (l90Var != null) {
            return l90Var;
        }
        l90 l90Var2 = l90.f32809g;
        int i15 = ip0Var.f32605a;
        StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 26);
        sb5.append("Unknown http2 error code: ");
        sb5.append(i15);
        return l90Var2.e(sb5.toString());
    }

    final /* synthetic */ SocketFactory A() {
        return this.B;
    }

    final /* synthetic */ SSLSocketFactory B() {
        return this.C;
    }

    final /* synthetic */ HostnameVerifier C() {
        return this.D;
    }

    final /* synthetic */ void D(Socket socket) {
        this.E = socket;
    }

    final /* synthetic */ void E(int i15) {
        this.F = i15;
    }

    final /* synthetic */ Deque F() {
        return this.G;
    }

    final /* synthetic */ to0 G() {
        return this.H;
    }

    final /* synthetic */ gg0 H() {
        return null;
    }

    final /* synthetic */ Runnable I() {
        return this.I;
    }

    final /* synthetic */ int J() {
        return this.J;
    }

    final boolean R() {
        return this.C == null;
    }

    final void S(rn0 rn0Var, String str) {
        l90 l90Var;
        l90 l90Var2 = this.f31699x;
        if (l90Var2 != null) {
            rn0Var.J().z(l90Var2, hb0.MISCARRIED, true, new a80());
            return;
        }
        if ((this.E instanceof SSLSocket) && !str.equals(this.f31679d)) {
            Map map = this.L;
            if (map.containsKey(str)) {
                l90Var = (l90) map.get(str);
            } else {
                l90 l90VarE = this.D.verify(str, ((SSLSocket) this.E).getSession()) ? l90.f32807e : l90.f32815m.e(String.format("HostNameVerifier verification failed for authority '%s'", str));
                if (!l90VarE.j() && !R) {
                    Q.logp(Level.WARNING, "io.grpc.okhttp.OkHttpClientTransport", "verifyAuthority", String.format("HostNameVerifier verification failed for authority '%s'. This will be an error in the future.", str));
                }
                if (l90VarE.j()) {
                    l90VarE = l90.f32815m.e(String.format("Could not verify authority '%s' for the rpc with no X509TrustManager available", str));
                }
                map.put(str, l90VarE);
                l90Var = l90VarE;
            }
            if (!l90Var.j() && R) {
                rn0Var.J().z(l90Var, hb0.PROCESSED, true, new a80());
                return;
            }
        }
        if (this.f31691p.size() < this.F) {
            K(rn0Var);
        } else {
            this.G.add(rn0Var);
            Q(rn0Var);
        }
    }

    final void T(rn0 rn0Var) {
        this.G.remove(rn0Var);
        P(rn0Var);
    }

    final String U() {
        String str = this.f31679d;
        URI uriB = ze0.b(str);
        return uriB.getHost() != null ? uriB.getHost() : str;
    }

    final int V() {
        URI uriB = ze0.b(this.f31679d);
        return uriB.getPort() != -1 ? uriB.getPort() : this.f31678c.getPort();
    }

    public final void W(l90 l90Var, qd0 qd0Var) {
        d(l90Var);
        synchronized (this.f31688m) {
            try {
                Iterator it = this.f31691p.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    it.remove();
                    ((rn0) entry.getValue()).J().z(l90Var, hb0.PROCESSED, false, new a80());
                    P((rn0) entry.getValue());
                }
                Deque<rn0> deque = this.G;
                for (rn0 rn0Var : deque) {
                    rn0Var.J().z(l90Var, hb0.MISCARRIED, true, new a80());
                    P(rn0Var);
                }
                deque.clear();
                O();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final void X(int i15, l90 l90Var, hb0 hb0Var, boolean z15, ip0 ip0Var, a80 a80Var) {
        synchronized (this.f31688m) {
            try {
                rn0 rn0Var = (rn0) this.f31691p.remove(Integer.valueOf(i15));
                if (rn0Var != null) {
                    if (ip0Var != null) {
                        this.f31686k.S(i15, ip0.CANCEL);
                    }
                    if (l90Var != null) {
                        qn0 qn0VarJ = rn0Var.J();
                        if (a80Var == null) {
                            a80Var = new a80();
                        }
                        qn0VarJ.z(l90Var, hb0Var, z15, a80Var);
                    }
                    if (!b0()) {
                        O();
                    }
                    P(rn0Var);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final boolean Y(int i15) {
        boolean z15;
        synchronized (this.f31688m) {
            z15 = false;
            if (i15 < this.f31690o && (i15 & 1) == 1) {
                z15 = true;
            }
        }
        return z15;
    }

    final rn0 Z(int i15) {
        rn0 rn0Var;
        synchronized (this.f31688m) {
            rn0Var = (rn0) this.f31691p.get(Integer.valueOf(i15));
        }
        return rn0Var;
    }

    @Override // com.google.android.libraries.places.internal.s60
    public final n60 a() {
        return this.f31689n;
    }

    @Override // com.google.android.libraries.places.internal.no0
    public final mo0[] b() {
        mo0[] mo0VarArr;
        synchronized (this.f31688m) {
            try {
                Map map = this.f31691p;
                mo0VarArr = new mo0[map.size()];
                Iterator it = map.values().iterator();
                int i15 = 0;
                while (it.hasNext()) {
                    mo0VarArr[i15] = ((rn0) it.next()).J().Q();
                    i15++;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return mo0VarArr;
    }

    @Override // com.google.android.libraries.places.internal.hi0
    public final void c(l90 l90Var) {
        W(l90Var, hm0.SUBCHANNEL_SHUTDOWN);
    }

    final /* synthetic */ Socket c0(InetSocketAddress inetSocketAddress, InetSocketAddress inetSocketAddress2, String str, String str2) throws m90 {
        Socket socketCreateSocket;
        int i15;
        String strSubstring;
        try {
            socketCreateSocket = inetSocketAddress2.getAddress() != null ? this.B.createSocket(inetSocketAddress2.getAddress(), inetSocketAddress2.getPort()) : this.B.createSocket(inetSocketAddress2.getHostName(), inetSocketAddress2.getPort());
            try {
                socketCreateSocket.setTcpNoDelay(true);
                socketCreateSocket.setSoTimeout(this.O);
                es0 es0VarB = tr0.b(socketCreateSocket);
                or0 or0VarD = tr0.d(tr0.a(socketCreateSocket));
                zp0 zp0Var = new zp0();
                zp0Var.a("https");
                zp0Var.b(inetSocketAddress.getHostName());
                zp0Var.c(inetSocketAddress.getPort());
                aq0 aq0VarE = zp0Var.e();
                bq0 bq0Var = new bq0();
                bq0Var.a(aq0VarE);
                String strA = aq0VarE.a();
                int iB = aq0VarE.b();
                StringBuilder sb5 = new StringBuilder(String.valueOf(strA).length() + 1 + String.valueOf(iB).length());
                sb5.append(strA);
                sb5.append(":");
                sb5.append(iB);
                bq0Var.b("Host", sb5.toString());
                bq0Var.b("User-Agent", this.f31680e);
                if (str != null && str2 != null) {
                    try {
                        StringBuilder sb6 = new StringBuilder(str.length() + 1 + str2.length());
                        sb6.append(str);
                        sb6.append(":");
                        sb6.append(str2);
                        byte[] bytes = sb6.toString().getBytes("ISO-8859-1");
                        rr0 rr0Var = rr0.f33593d;
                        String strN = qr0.b(bytes).n();
                        StringBuilder sb7 = new StringBuilder(strN.length() + 6);
                        sb7.append("Basic ");
                        sb7.append(strN);
                        bq0Var.b("Proxy-Authorization", sb7.toString());
                    } catch (UnsupportedEncodingException unused) {
                        throw new AssertionError();
                    }
                }
                cq0 cq0VarC = bq0Var.c();
                aq0 aq0VarA = cq0VarC.a();
                or0VarD.S3(String.format(Locale.US, "CONNECT %s:%d HTTP/1.1", aq0VarA.a(), Integer.valueOf(aq0VarA.b()))).S3("\r\n");
                int iA = cq0VarC.b().a();
                for (int i16 = 0; i16 < iA; i16++) {
                    or0VarD.S3(cq0VarC.b().b(i16)).S3(": ").S3(cq0VarC.b().c(i16)).S3("\r\n");
                }
                or0VarD.S3("\r\n");
                or0VarD.flush();
                String strM = M(es0VarB);
                if (strM.startsWith("HTTP/1.")) {
                    i15 = 9;
                    if (strM.length() < 9 || strM.charAt(8) != ' ') {
                        throw new ProtocolException("Unexpected status line: ".concat(strM));
                    }
                    int iCharAt = strM.charAt(7) - '0';
                    if (iCharAt != 0 && iCharAt != 1) {
                        throw new ProtocolException("Unexpected status line: ".concat(strM));
                    }
                    fp0 fp0Var = fp0.HTTP_1_0;
                } else {
                    if (!strM.startsWith("ICY ")) {
                        throw new ProtocolException("Unexpected status line: ".concat(strM));
                    }
                    fp0 fp0Var2 = fp0.HTTP_1_0;
                    i15 = 4;
                }
                int i17 = i15 + 3;
                if (strM.length() < i17) {
                    throw new ProtocolException("Unexpected status line: ".concat(strM));
                }
                try {
                    int i18 = Integer.parseInt(strM.substring(i15, i17));
                    if (strM.length() <= i17) {
                        strSubstring = "";
                    } else {
                        if (strM.charAt(i17) != ' ') {
                            throw new ProtocolException("Unexpected status line: ".concat(strM));
                        }
                        strSubstring = strM.substring(i15 + 4);
                    }
                    while (!M(es0VarB).equals("")) {
                    }
                    if (i18 >= 200 && i18 < 300) {
                        socketCreateSocket.setSoTimeout(0);
                        return socketCreateSocket;
                    }
                    nr0 nr0Var = new nr0();
                    try {
                        socketCreateSocket.shutdownOutput();
                        es0VarB.V1(nr0Var, 1024L);
                    } catch (IOException e15) {
                        String string = e15.toString();
                        StringBuilder sb8 = new StringBuilder(String.valueOf(string).length() + 21);
                        sb8.append("Unable to read body: ");
                        sb8.append(string);
                        nr0Var.C0(sb8.toString());
                    }
                    try {
                        socketCreateSocket.close();
                    } catch (IOException unused2) {
                    }
                    throw new m90(l90.f32815m.e(String.format(Locale.US, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s", Integer.valueOf(i18), strSubstring, nr0Var.c0())), null);
                } catch (NumberFormatException unused3) {
                    throw new ProtocolException("Unexpected status line: ".concat(strM));
                }
            } catch (IOException e16) {
                e = e16;
                if (socketCreateSocket != null) {
                    ze0.h(socketCreateSocket);
                }
                throw new m90(l90.f32815m.e("Failed trying to connect with proxy").d(e), null);
            }
        } catch (IOException e17) {
            e = e17;
            socketCreateSocket = null;
        }
    }

    @Override // com.google.android.libraries.places.internal.hi0
    public final void d(l90 l90Var) {
        synchronized (this.f31688m) {
            try {
                if (this.f31699x != null) {
                    return;
                }
                this.f31699x = l90Var;
                this.f31685j.a(l90Var, hm0.SUBCHANNEL_SHUTDOWN);
                O();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    final /* synthetic */ void d0(ip0 ip0Var, String str) {
        e0(0, ip0Var, a0(ip0Var).f(str));
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x008f */
    @Override // com.google.android.libraries.places.internal.hi0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Runnable e(com.google.android.libraries.places.internal.gi0 r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "listener"
            java.lang.Object r8 = zj.p.r(r8, r0)
            com.google.android.libraries.places.internal.gi0 r8 = (com.google.android.libraries.places.internal.gi0) r8
            r7.f31685j = r8
            com.google.android.libraries.places.internal.wl0 r8 = r7.f31693r
            r0 = 10000(0x2710, float:1.4013E-41)
            com.google.android.libraries.places.internal.en0 r5 = com.google.android.libraries.places.internal.en0.b(r8, r7, r0)
            com.google.android.libraries.places.internal.or0 r8 = com.google.android.libraries.places.internal.tr0.d(r5)
            com.google.android.libraries.places.internal.yp0 r0 = r7.f31684i
            r1 = 1
            com.google.android.libraries.places.internal.lp0 r8 = r0.a(r8, r1)
            com.google.android.libraries.places.internal.cn0 r0 = new com.google.android.libraries.places.internal.cn0
            r0.<init>(r5, r8)
            java.lang.Object r8 = r7.f31688m
            monitor-enter(r8)
            com.google.android.libraries.places.internal.gn0 r2 = new com.google.android.libraries.places.internal.gn0     // Catch: java.lang.Throwable -> L8b
            r2.<init>(r7, r0)     // Catch: java.lang.Throwable -> L8b
            r7.f31686k = r2     // Catch: java.lang.Throwable -> L8b
            com.google.android.libraries.places.internal.po0 r0 = new com.google.android.libraries.places.internal.po0     // Catch: java.lang.Throwable -> L8b
            r0.<init>(r7, r2)     // Catch: java.lang.Throwable -> L8b
            r7.f31687l = r0     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.CountDownLatch r3 = new java.util.concurrent.CountDownLatch
            r3.<init>(r1)
            java.util.concurrent.CountDownLatch r6 = new java.util.concurrent.CountDownLatch
            r6.<init>(r1)
            java.util.concurrent.CyclicBarrier r4 = new java.util.concurrent.CyclicBarrier
            r8 = 2
            r4.<init>(r8)
            com.google.android.libraries.places.internal.wl0 r8 = r7.f31693r
            com.google.android.libraries.places.internal.vn0 r1 = new com.google.android.libraries.places.internal.vn0
            r2 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r8.execute(r1)
            java.util.concurrent.Executor r8 = r2.f31692q
            com.google.android.libraries.places.internal.wn0 r0 = new com.google.android.libraries.places.internal.wn0
            r0.<init>(r7, r4, r6)
            r8.execute(r0)
            java.lang.Object r8 = r2.f31688m     // Catch: java.lang.Throwable -> L85
            monitor-enter(r8)     // Catch: java.lang.Throwable -> L85
            com.google.android.libraries.places.internal.gn0 r0 = r2.f31686k     // Catch: java.lang.Throwable -> L82
            r0.c()     // Catch: java.lang.Throwable -> L82
            com.google.android.libraries.places.internal.xp0 r0 = new com.google.android.libraries.places.internal.xp0     // Catch: java.lang.Throwable -> L82
            r0.<init>()     // Catch: java.lang.Throwable -> L82
            int r1 = r2.f31683h     // Catch: java.lang.Throwable -> L82
            r4 = 7
            r5 = 0
            r0.a(r4, r5, r1)     // Catch: java.lang.Throwable -> L82
            com.google.android.libraries.places.internal.gn0 r1 = r2.f31686k     // Catch: java.lang.Throwable -> L82
            r1.K0(r0)     // Catch: java.lang.Throwable -> L82
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L82
            r3.countDown()
            com.google.android.libraries.places.internal.wl0 r8 = r2.f31693r
            com.google.android.libraries.places.internal.xn0 r0 = new com.google.android.libraries.places.internal.xn0
            r0.<init>(r7)
            r8.execute(r0)
            r8 = 0
            return r8
        L82:
            r0 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L82
            throw r0     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            r8 = r0
            r3.countDown()
            throw r8
        L8b:
            r0 = move-exception
            r2 = r7
        L8d:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L8f
            throw r0
        L8f:
            r0 = move-exception
            goto L8d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.ao0.e(com.google.android.libraries.places.internal.gi0):java.lang.Runnable");
    }

    @Override // com.google.android.libraries.places.internal.vb0
    public final b40 f() {
        return this.f31698w;
    }

    @Override // com.google.android.libraries.places.internal.jb0
    public final /* bridge */ /* synthetic */ gb0 g(f80 f80Var, a80 a80Var, f40 f40Var, s40[] s40VarArr) {
        rn0 rn0Var;
        zj.p.r(f80Var, "method");
        zj.p.r(a80Var, "headers");
        im0 im0VarA = im0.a(s40VarArr, this.f31698w, a80Var);
        Object obj = this.f31688m;
        synchronized (obj) {
            rn0Var = new rn0(f80Var, a80Var, this.f31686k, this, this.f31687l, obj, this.f31695t, this.f31683h, this.f31679d, this.f31680e, im0VarA, this.K, f40Var, false);
        }
        return rn0Var;
    }

    final /* synthetic */ Socket g0() {
        return this.f31676a;
    }

    @Override // com.google.android.libraries.places.internal.fn0
    public final void h(Throwable th4) {
        zj.p.r(th4, "failureCause");
        e0(0, ip0.INTERNAL_ERROR, l90.f32815m.d(th4));
    }

    final /* synthetic */ void h0(Socket socket) {
        this.f31676a = socket;
    }

    final /* synthetic */ void i(SSLSession sSLSession) {
        this.f31677b = sSLSession;
    }

    final /* synthetic */ SSLSession i0() {
        return this.f31677b;
    }

    final /* synthetic */ InetSocketAddress j() {
        return this.f31678c;
    }

    final /* synthetic */ int k() {
        return this.f31683h;
    }

    final /* synthetic */ yp0 l() {
        return this.f31684i;
    }

    final /* synthetic */ gi0 m() {
        return this.f31685j;
    }

    final /* synthetic */ gn0 n() {
        return this.f31686k;
    }

    final /* synthetic */ po0 o() {
        return this.f31687l;
    }

    final /* synthetic */ Object p() {
        return this.f31688m;
    }

    final /* synthetic */ Map q() {
        return this.f31691p;
    }

    final /* synthetic */ Executor r() {
        return this.f31692q;
    }

    final /* synthetic */ int s() {
        return this.f31696u;
    }

    final /* synthetic */ void t(int i15) {
        this.f31696u = i15;
    }

    public final String toString() {
        return zj.j.c(this).c("logId", this.f31689n.c()).d("address", this.f31678c).toString();
    }

    final /* synthetic */ yn0 u() {
        return this.f31697v;
    }

    final /* synthetic */ void v(yn0 yn0Var) {
        this.f31697v = yn0Var;
    }

    final /* synthetic */ b40 w() {
        return this.f31698w;
    }

    final /* synthetic */ void x(b40 b40Var) {
        this.f31698w = b40Var;
    }

    final /* synthetic */ l90 y() {
        return this.f31699x;
    }

    final /* synthetic */ df0 z() {
        return null;
    }
}
