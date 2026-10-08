package com.google.android.libraries.places.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public final class ae0 extends t80 {
    private static final zd0 A;
    private static String B;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Logger f31590s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Set f31591t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final String f31592u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f31593v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f31594w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    static final boolean f31595x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    static final boolean f31596y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected static final boolean f31597z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final d90 f31598b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Random f31599c = new Random();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected volatile sd0 f31600d = td0.INSTANCE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicReference f31601e = new AtomicReference();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f31602f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f31603g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f31604h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final si0 f31605i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final long f31606j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final u90 f31607k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final s80 f31608l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final zj.u f31609m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected boolean f31610n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f31611o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private Executor f31612p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f31613q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p80 f31614r;

    static {
        Logger logger = Logger.getLogger(ae0.class.getName());
        f31590s = logger;
        f31591t = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        f31592u = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        f31593v = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        f31594w = property3;
        f31595x = Boolean.parseBoolean(property);
        f31596y = Boolean.parseBoolean(property2);
        f31597z = Boolean.parseBoolean(property3);
        zd0 zd0Var = null;
        try {
            try {
                try {
                    zd0 zd0Var2 = (zd0) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, ae0.class.getClassLoader()).asSubclass(zd0.class).getConstructor(null).newInstance(null);
                    if (zd0Var2.zzb() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", zd0Var2.zzb());
                    } else {
                        zd0Var = zd0Var2;
                    }
                } catch (Exception e15) {
                    f31590s.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e15);
                }
            } catch (Exception e16) {
                f31590s.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e16);
            }
        } catch (ClassCastException e17) {
            f31590s.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e17);
        } catch (ClassNotFoundException e18) {
            f31590s.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e18);
        }
        A = zd0Var;
    }

    protected ae0(String str, String str2, l80 l80Var, em0 em0Var, zj.u uVar, boolean z15) {
        zj.p.r(l80Var, "args");
        URI uriCreate = URI.create("//".concat(String.valueOf((String) zj.p.r(str2, "name"))));
        zj.p.l(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        this.f31602f = (String) zj.p.s(uriCreate.getAuthority(), "nameUri (%s) doesn't have an authority", uriCreate);
        this.f31603g = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.f31604h = l80Var.a();
        } else {
            this.f31604h = uriCreate.getPort();
        }
        this.f31598b = (d90) zj.p.r(l80Var.b(), "proxyDetector");
        Executor executorF = l80Var.f();
        if (executorF != null) {
            this.f31605i = new ge0(executorF);
        } else {
            this.f31605i = gm0.a(em0Var);
        }
        long nanos = 30;
        if (z15) {
            nanos = TimeUnit.SECONDS.toNanos(30L);
        } else {
            String property = System.getProperty("networkaddress.cache.ttl");
            if (property != null) {
                try {
                    nanos = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    f31590s.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            if (nanos > 0) {
                nanos = TimeUnit.SECONDS.toNanos(nanos);
            }
        }
        this.f31606j = nanos;
        this.f31609m = (zj.u) zj.p.r(uVar, "stopwatch");
        this.f31607k = (u90) zj.p.r(l80Var.c(), "syncContext");
        this.f31608l = (s80) zj.p.r(l80Var.e(), "serviceConfigParser");
    }

    private final void m() {
        if (this.f31613q || this.f31611o) {
            return;
        }
        if (this.f31610n) {
            long j15 = this.f31606j;
            if (j15 != 0 && (j15 <= 0 || this.f31609m.d(TimeUnit.NANOSECONDS) <= j15)) {
                return;
            }
        }
        this.f31613q = true;
        this.f31612p.execute(new xd0(this, this.f31614r));
    }

    private static String n() {
        if (B == null) {
            try {
                B = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e15) {
                throw new RuntimeException(e15);
            }
        }
        return B;
    }

    @Override // com.google.android.libraries.places.internal.t80
    public final String a() {
        return this.f31602f;
    }

    @Override // com.google.android.libraries.places.internal.t80
    public final void b(p80 p80Var) {
        zj.p.x(this.f31614r == null, "already started");
        this.f31612p = (Executor) this.f31605i.zza();
        this.f31614r = (p80) zj.p.r(p80Var, "listener");
        m();
    }

    @Override // com.google.android.libraries.places.internal.t80
    public final void c() {
        if (this.f31611o) {
            return;
        }
        this.f31611o = true;
        Executor executor = this.f31612p;
        if (executor != null) {
            this.f31605i.c(executor);
            this.f31612p = null;
        }
    }

    @Override // com.google.android.libraries.places.internal.t80
    public final void d() {
        zj.p.x(this.f31614r != null, "not started");
        m();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01e1 A[Catch: RuntimeException -> 0x018c, TryCatch #3 {RuntimeException -> 0x018c, blocks: (B:71:0x0168, B:72:0x0170, B:74:0x0176, B:77:0x018f, B:79:0x0197, B:81:0x019d, B:82:0x01a1, B:84:0x01a7, B:88:0x01b8, B:90:0x01c0, B:95:0x01cd, B:98:0x01d9, B:100:0x01e1, B:102:0x01e7, B:103:0x01eb, B:105:0x01f1, B:107:0x01fd, B:112:0x0207, B:113:0x0216), top: B:132:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:105:0x01f1 A[Catch: RuntimeException -> 0x018c, TryCatch #3 {RuntimeException -> 0x018c, blocks: (B:71:0x0168, B:72:0x0170, B:74:0x0176, B:77:0x018f, B:79:0x0197, B:81:0x019d, B:82:0x01a1, B:84:0x01a7, B:88:0x01b8, B:90:0x01c0, B:95:0x01cd, B:98:0x01d9, B:100:0x01e1, B:102:0x01e7, B:103:0x01eb, B:105:0x01f1, B:107:0x01fd, B:112:0x0207, B:113:0x0216), top: B:132:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0203  */
    /* JADX WARN: Code duplicated, block: B:145:0x0207 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:154:0x01b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:155:0x01fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:156:? A[LOOP:5: B:103:0x01eb->B:156:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:16:0x008f  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c0 A[Catch: RuntimeException -> 0x018c, TryCatch #3 {RuntimeException -> 0x018c, blocks: (B:71:0x0168, B:72:0x0170, B:74:0x0176, B:77:0x018f, B:79:0x0197, B:81:0x019d, B:82:0x01a1, B:84:0x01a7, B:88:0x01b8, B:90:0x01c0, B:95:0x01cd, B:98:0x01d9, B:100:0x01e1, B:102:0x01e7, B:103:0x01eb, B:105:0x01f1, B:107:0x01fd, B:112:0x0207, B:113:0x0216), top: B:132:0x0168 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:97:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:98:0x01d9 A[Catch: RuntimeException -> 0x018c, TryCatch #3 {RuntimeException -> 0x018c, blocks: (B:71:0x0168, B:72:0x0170, B:74:0x0176, B:77:0x018f, B:79:0x0197, B:81:0x019d, B:82:0x01a1, B:84:0x01a7, B:88:0x01b8, B:90:0x01c0, B:95:0x01cd, B:98:0x01d9, B:100:0x01e1, B:102:0x01e7, B:103:0x01eb, B:105:0x01f1, B:107:0x01fd, B:112:0x0207, B:113:0x0216), top: B:132:0x0168 }] */
    protected final r80 e() {
        yd0 yd0VarZza;
        zd0 zd0Var;
        m80 m80VarB;
        Double dE;
        List listC;
        Map mapD;
        Iterator it;
        int iIntValue;
        boolean z15;
        q80 q80VarA = r80.a();
        try {
            List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(this.f31603g)));
            ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
            Iterator it4 = listUnmodifiableList.iterator();
            while (it4.hasNext()) {
                arrayList.add(new p50(Collections.singletonList(new InetSocketAddress((InetAddress) it4.next(), this.f31604h)), b40.f31734c));
            }
            q80VarA.a(n90.a(Collections.unmodifiableList(arrayList)));
        } catch (Exception e15) {
            f31590s.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "doResolve", "Address resolution failure", (Throwable) e15);
            q80VarA.a(n90.b(l90.f32815m.e("Unable to resolve host ".concat(String.valueOf(this.f31603g))).d(e15)));
        }
        if (f31597z) {
            String str = this.f31603g;
            List<String> listZza = Collections.EMPTY_LIST;
            boolean z16 = f31595x;
            boolean z17 = f31596y;
            m80 m80VarB2 = null;
            if (!z16) {
                yd0VarZza = null;
            } else if (!"localhost".equalsIgnoreCase(str)) {
                if (!str.contains(":")) {
                    boolean z18 = true;
                    for (int i15 = 0; i15 < str.length(); i15++) {
                        char cCharAt = str.charAt(i15);
                        if (cCharAt != '.') {
                            z18 &= cCharAt >= '0' && cCharAt <= '9';
                        }
                    }
                    if (!z18) {
                        yd0VarZza = (yd0) this.f31601e.get();
                        if (yd0VarZza == null) {
                            yd0VarZza = zd0Var.zza();
                        }
                    }
                }
                yd0VarZza = null;
            } else if (z17) {
                yd0VarZza = (yd0) this.f31601e.get();
                if (yd0VarZza == null && (zd0Var = A) != null) {
                    yd0VarZza = zd0Var.zza();
                }
            } else {
                yd0VarZza = null;
            }
            if (yd0VarZza != null) {
                try {
                    listZza = yd0VarZza.zza();
                } catch (Exception e16) {
                    f31590s.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", (Throwable) e16);
                }
            }
            if (listZza.isEmpty()) {
                f31590s.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new Object[]{this.f31603g});
            } else {
                Random random = this.f31599c;
                String strN = n();
                try {
                    ArrayList<Map> arrayList2 = new ArrayList();
                    for (String str2 : listZza) {
                        if (str2.startsWith("grpc_config=")) {
                            Object objA = eg0.a(str2.substring(12));
                            if (!(objA instanceof List)) {
                                throw new ClassCastException("wrong type ".concat(String.valueOf(objA)));
                            }
                            List list = (List) objA;
                            fg0.j(list);
                            arrayList2.addAll(list);
                        } else {
                            f31590s.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str2});
                        }
                    }
                    Map map = null;
                    for (Map map2 : arrayList2) {
                        try {
                            for (Map.Entry entry : map2.entrySet()) {
                                zj.c0.a(f31591t.contains(entry.getKey()), "Bad key: %s", entry);
                            }
                            List listC2 = fg0.c(map2, "clientLanguage");
                            if (listC2 == null || listC2.isEmpty()) {
                                dE = fg0.e(map2, "percentage");
                                if (dE == null) {
                                    listC = fg0.c(map2, "clientHostname");
                                    if (listC != null && !listC.isEmpty()) {
                                        it = listC.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                map = null;
                                            } else if (((String) it.next()).equals(strN)) {
                                            }
                                        }
                                    }
                                    mapD = fg0.d(map2, "serviceConfig");
                                    if (mapD != null) {
                                        throw new zj.d0(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                    }
                                    map = mapD;
                                } else {
                                    iIntValue = dE.intValue();
                                    if (iIntValue >= 0 || iIntValue > 100) {
                                        z15 = false;
                                    } else {
                                        z15 = true;
                                    }
                                    zj.c0.a(z15, "Bad percentage: %s", dE);
                                    if (random.nextInt(100) >= iIntValue) {
                                        listC = fg0.c(map2, "clientHostname");
                                        if (listC != null) {
                                            it = listC.iterator();
                                            while (true) {
                                                if (!it.hasNext()) {
                                                    if (((String) it.next()).equals(strN)) {
                                                    }
                                                }
                                            }
                                        }
                                        mapD = fg0.d(map2, "serviceConfig");
                                        if (mapD != null) {
                                            throw new zj.d0(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                        }
                                        map = mapD;
                                    }
                                    map = null;
                                }
                            } else {
                                Iterator it5 = listC2.iterator();
                                while (true) {
                                    if (it5.hasNext()) {
                                        if ("java".equalsIgnoreCase((String) it5.next())) {
                                            dE = fg0.e(map2, "percentage");
                                            if (dE == null) {
                                                listC = fg0.c(map2, "clientHostname");
                                                if (listC != null) {
                                                    it = listC.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            if (((String) it.next()).equals(strN)) {
                                                            }
                                                        }
                                                    }
                                                }
                                                mapD = fg0.d(map2, "serviceConfig");
                                                if (mapD != null) {
                                                    throw new zj.d0(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                }
                                                map = mapD;
                                            } else {
                                                iIntValue = dE.intValue();
                                                if (iIntValue >= 0) {
                                                    z15 = false;
                                                } else {
                                                    z15 = false;
                                                }
                                                zj.c0.a(z15, "Bad percentage: %s", dE);
                                                if (random.nextInt(100) >= iIntValue) {
                                                    listC = fg0.c(map2, "clientHostname");
                                                    if (listC != null) {
                                                        it = listC.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                if (((String) it.next()).equals(strN)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    mapD = fg0.d(map2, "serviceConfig");
                                                    if (mapD != null) {
                                                        throw new zj.d0(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                    }
                                                    map = mapD;
                                                }
                                            }
                                        }
                                    }
                                    map = null;
                                }
                            }
                            if (map != null) {
                                break;
                            }
                        } catch (RuntimeException e17) {
                            m80VarB = m80.b(l90.f32809g.e("failed to pick service config choice").d(e17));
                        }
                    }
                    m80VarB = map == null ? null : m80.a(map);
                } catch (IOException e18) {
                    e = e18;
                    m80VarB = m80.b(l90.f32809g.e("failed to parse TXT records").d(e));
                } catch (RuntimeException e19) {
                    e = e19;
                    m80VarB = m80.b(l90.f32809g.e("failed to parse TXT records").d(e));
                }
                if (m80VarB != null) {
                    m80VarB2 = m80VarB.d() != null ? m80.b(m80VarB.d()) : this.f31608l.a((Map) m80VarB.c());
                }
            }
            q80VarA.b(m80VarB2);
        }
        return q80VarA.c();
    }

    final /* synthetic */ p50 f() {
        c90 c90VarA = this.f31598b.a(InetSocketAddress.createUnresolved(this.f31603g, this.f31604h));
        if (c90VarA == null) {
            return null;
        }
        return new p50(Collections.singletonList(c90VarA), b40.f31734c);
    }

    final /* synthetic */ String h() {
        return this.f31603g;
    }

    final /* synthetic */ long i() {
        return this.f31606j;
    }

    final /* synthetic */ u90 j() {
        return this.f31607k;
    }

    final /* synthetic */ zj.u k() {
        return this.f31609m;
    }

    final /* synthetic */ void l(boolean z15) {
        this.f31613q = false;
    }
}
