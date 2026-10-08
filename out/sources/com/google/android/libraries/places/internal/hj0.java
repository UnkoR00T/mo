package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
final class hj0 extends i70 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Logger f32479s = Logger.getLogger(hj0.class.getName());

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final boolean f32480t;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f32481f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final z60 f32482g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f32483h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final zi0 f32484i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f32485j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f32486k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private t90 f32487l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private b50 f32488m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b50 f32489n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f32490o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private t90 f32491p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f32492q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private de0 f32493r;

    static {
        w70 w70Var = ze0.f34495c;
        f32480t = k60.b("GRPC_EXPERIMENTAL_PF_WEIGHTED_SHUFFLING", true);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    hj0(z60 z60Var) {
        boolean z15;
        if (e()) {
            z15 = false;
        } else {
            boolean z16 = nj0.f33066b;
            w70 w70Var = ze0.f34495c;
            if (k60.b("GRPC_PF_USE_HAPPY_EYEBALLS", false)) {
                z15 = true;
            } else {
                z15 = false;
            }
        }
        this.f32481f = z15;
        this.f32483h = new HashMap();
        this.f32484i = new zi0(ak.n0.C(), z15);
        this.f32485j = 0;
        this.f32486k = true;
        this.f32487l = null;
        b50 b50Var = b50.IDLE;
        this.f32488m = b50Var;
        this.f32489n = b50Var;
        this.f32490o = true;
        this.f32491p = null;
        this.f32492q = e();
        this.f32482g = (z60) zj.p.r(z60Var, "helper");
    }

    static boolean e() {
        w70 w70Var = ze0.f34495c;
        return k60.b("GRPC_SERIALIZE_RETRIES", false);
    }

    static List f(List list, Random random) {
        if (!f32480t) {
            ArrayList arrayList = new ArrayList(list);
            Collections.shuffle(arrayList, random);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            p50 p50Var = (p50) it.next();
            Long l15 = (Long) p50Var.b().a(j60.f32645a);
            if (l15 == null) {
                l15 = 1L;
            }
            arrayList2.add(new gj0(p50Var, Math.pow(random.nextDouble(), 1.0d / l15.longValue())));
        }
        Collections.sort(arrayList2, Collections.reverseOrder());
        return ak.a1.k(arrayList2, bj0.f31805a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean p(ak.n0 n0Var) {
        Map map = this.f32483h;
        HashSet<SocketAddress> hashSet = new HashSet(map.keySet());
        HashSet hashSet2 = new HashSet();
        int size = n0Var.size();
        for (int i15 = 0; i15 < size; i15++) {
            hashSet2.addAll(((p50) n0Var.get(i15)).a());
        }
        for (SocketAddress socketAddress : hashSet) {
            if (!hashSet2.contains(socketAddress)) {
                ((fj0) map.remove(socketAddress)).a().b();
            }
        }
        return hashSet.isEmpty();
    }

    private final void q() {
        if (this.f32492q && this.f32491p == null) {
            if (this.f32493r == null) {
                this.f32493r = new de0();
            }
            long jA = this.f32493r.a();
            z60 z60Var = this.f32482g;
            this.f32491p = z60Var.d().e(new ui0(this), jA, TimeUnit.NANOSECONDS, z60Var.e());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public final void h(fj0 fj0Var) {
        b50 b50VarG = fj0Var.g();
        b50 b50Var = b50.READY;
        if (b50VarG != b50Var) {
            return;
        }
        if (this.f32490o || fj0Var.e() == b50Var) {
            s(b50Var, new y60(b70.a(fj0Var.f(), null)));
            return;
        }
        b50 b50VarE = fj0Var.e();
        b50 b50Var2 = b50.TRANSIENT_FAILURE;
        if (b50VarE == b50Var2) {
            s(b50Var2, new y60(b70.b(fj0Var.h().d())));
        } else if (this.f32489n != b50Var2) {
            s(fj0Var.e(), new y60(b70.d()));
        }
    }

    private final void s(b50 b50Var, g70 g70Var) {
        if (b50Var == this.f32489n && (b50Var == b50.IDLE || b50Var == b50.CONNECTING)) {
            return;
        }
        this.f32489n = b50Var;
        this.f32482g.b(b50Var, g70Var);
    }

    private final void t() {
        if (this.f32481f) {
            t90 t90Var = this.f32487l;
            if (t90Var == null || !t90Var.b()) {
                z60 z60Var = this.f32482g;
                this.f32487l = z60Var.d().e(new vi0(this), 250L, TimeUnit.MILLISECONDS, z60Var.e());
            }
        }
    }

    private final void u() {
        t90 t90Var = this.f32487l;
        if (t90Var != null) {
            t90Var.a();
            this.f32487l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001d  */
    private static final SocketAddress v(f70 f70Var) {
        boolean z15;
        sh0 sh0Var = (sh0) f70Var;
        sh0Var.f33690j.f33925n.d();
        zj.p.x(sh0Var.f33687g, "not started");
        List list = sh0Var.f33685e;
        if (list != null) {
            z15 = list.size() == 1;
        }
        zj.p.B(z15, "%s does not have exactly one group", list);
        return (SocketAddress) ((p50) list.get(0)).a().get(0);
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final l90 a(e70 e70Var) {
        Boolean bool;
        if (this.f32488m == b50.SHUTDOWN) {
            return l90.f32813k.e("Already shut down");
        }
        Boolean bool2 = (Boolean) e70Var.d().a(i70.f32534e);
        this.f32490o = bool2 == null || !bool2.booleanValue();
        List<p50> listC = e70Var.c();
        if (listC.isEmpty()) {
            l90 l90Var = l90.f32815m;
            String strValueOf = String.valueOf(e70Var.c());
            String strValueOf2 = String.valueOf(e70Var.d());
            StringBuilder sb5 = new StringBuilder(strValueOf.length() + 55 + strValueOf2.length());
            sb5.append("NameResolver returned no usable address. addrs=");
            sb5.append(strValueOf);
            sb5.append(", attrs=");
            sb5.append(strValueOf2);
            l90 l90VarE = l90Var.e(sb5.toString());
            b(l90VarE);
            return l90VarE;
        }
        Iterator it = listC.iterator();
        while (it.hasNext()) {
            if (((p50) it.next()) == null) {
                l90 l90Var2 = l90.f32815m;
                String strValueOf3 = String.valueOf(e70Var.c());
                String strValueOf4 = String.valueOf(e70Var.d());
                StringBuilder sb6 = new StringBuilder(strValueOf3.length() + 69 + strValueOf4.length());
                sb6.append("NameResolver returned address list with null endpoint. addrs=");
                sb6.append(strValueOf3);
                sb6.append(", attrs=");
                sb6.append(strValueOf4);
                l90 l90VarE2 = l90Var2.e(sb6.toString());
                b(l90VarE2);
                return l90VarE2;
            }
        }
        this.f32486k = true;
        HashSet hashSet = new HashSet();
        List arrayList = new ArrayList();
        for (p50 p50Var : listC) {
            ArrayList arrayList2 = new ArrayList();
            for (SocketAddress socketAddress : p50Var.a()) {
                if (hashSet.add(socketAddress)) {
                    arrayList2.add(socketAddress);
                }
            }
            if (!arrayList2.isEmpty()) {
                arrayList.add(new p50(arrayList2, p50Var.b()));
            }
        }
        if ((e70Var.e() instanceof cj0) && (bool = ((cj0) e70Var.e()).f31906a) != null && bool.booleanValue()) {
            arrayList = f(arrayList, new Random());
        }
        ak.n0 n0VarV = ak.n0.v(arrayList);
        b50 b50Var = this.f32488m;
        b50 b50Var2 = b50.READY;
        if (b50Var == b50Var2 || (b50Var == b50.CONNECTING && (!this.f32481f || this.f32484i.a()))) {
            zi0 zi0Var = this.f32484i;
            SocketAddress socketAddressD = zi0Var.d();
            zi0Var.g(n0VarV);
            if (zi0Var.h(socketAddressD)) {
                ((fj0) this.f32483h.get(socketAddressD)).a().d(zi0Var.f());
                p(n0VarV);
                return l90.f32807e;
            }
        } else {
            this.f32484i.g(n0VarV);
        }
        if (p(n0VarV)) {
            b50 b50Var3 = b50.CONNECTING;
            this.f32488m = b50Var3;
            s(b50Var3, new y60(b70.d()));
        }
        b50 b50Var4 = this.f32488m;
        if (b50Var4 == b50Var2) {
            b50 b50Var5 = b50.IDLE;
            this.f32488m = b50Var5;
            s(b50Var5, new ej0(this, this));
        } else if (b50Var4 == b50.CONNECTING || b50Var4 == b50.TRANSIENT_FAILURE) {
            u();
            d();
        }
        return l90.f32807e;
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void b(l90 l90Var) {
        if (this.f32488m == b50.SHUTDOWN) {
            return;
        }
        Map map = this.f32483h;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((fj0) it.next()).a().b();
        }
        map.clear();
        this.f32484i.g(ak.n0.C());
        b50 b50Var = b50.TRANSIENT_FAILURE;
        this.f32488m = b50Var;
        s(b50Var, new y60(b70.b(l90Var)));
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void c() {
        Map map = this.f32483h;
        f32479s.logp(Level.FINE, "io.grpc.internal.PickFirstLeafLoadBalancer", "shutdown", "Shutting down, currently have {} subchannels created", Integer.valueOf(map.size()));
        b50 b50Var = b50.SHUTDOWN;
        this.f32488m = b50Var;
        this.f32489n = b50Var;
        u();
        t90 t90Var = this.f32491p;
        if (t90Var != null) {
            t90Var.a();
            this.f32491p = null;
        }
        this.f32493r = null;
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            ((fj0) it.next()).a().b();
        }
        map.clear();
    }

    @Override // com.google.android.libraries.places.internal.i70
    public final void d() {
        zi0 zi0Var = this.f32484i;
        if (zi0Var.a() && this.f32488m != b50.SHUTDOWN && this.f32491p == null) {
            Map map = this.f32483h;
            SocketAddress socketAddressD = zi0Var.d();
            fj0 fj0Var = (fj0) map.get(socketAddressD);
            if (fj0Var == null) {
                b40 b40VarE = zi0Var.e();
                wi0 wi0Var = new wi0(this, null);
                z60 z60Var = this.f32482g;
                u60 u60VarD = w60.d();
                u60VarD.b(ak.a1.i(new p50(Collections.singletonList(socketAddressD), b40VarE)));
                u60VarD.a(i70.f32531b, wi0Var);
                u60VarD.a(i70.f32532c, Boolean.valueOf(this.f32492q));
                f70 f70VarA = z60Var.a(u60VarD.c());
                final fj0 fj0Var2 = new fj0(f70VarA, b50.IDLE);
                wi0Var.b(fj0Var2);
                map.put(socketAddressD, fj0Var2);
                b40 b40VarB = ((sh0) f70VarA).f33681a.b();
                if (this.f32490o || b40VarB.a(i70.f32533d) == null) {
                    fj0Var2.i(c50.a(b50.READY));
                }
                f70VarA.a(new h70() { // from class: com.google.android.libraries.places.internal.aj0
                    @Override // com.google.android.libraries.places.internal.h70
                    public final /* synthetic */ void a(c50 c50Var) {
                        this.f31655a.g(fj0Var2, c50Var);
                    }
                });
                fj0Var = fj0Var2;
            }
            int iOrdinal = fj0Var.b().ordinal();
            if (iOrdinal == 0) {
                t();
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    return;
                }
                fj0Var.f().c();
                fj0Var.d(b50.CONNECTING);
                t();
                return;
            }
            if (!this.f32492q) {
                zi0Var.b();
                d();
            } else if (!zi0Var.a()) {
                q();
            } else {
                fj0Var.f().c();
                fj0Var.d(b50.CONNECTING);
            }
        }
    }

    final /* synthetic */ void g(fj0 fj0Var, c50 c50Var) {
        f70 f70VarF = fj0Var.f();
        b50 b50VarC = c50Var.c();
        Map map = this.f32483h;
        if (fj0Var == map.get(v(f70VarF)) && b50VarC != b50.SHUTDOWN) {
            b50 b50Var = b50.IDLE;
            if (b50VarC == b50Var && fj0Var.g() == b50.READY) {
                this.f32482g.c();
            }
            fj0Var.d(b50VarC);
            b50 b50Var2 = this.f32488m;
            b50 b50Var3 = b50.TRANSIENT_FAILURE;
            if (b50Var2 == b50Var3 || this.f32489n == b50Var3) {
                if (b50VarC == b50.CONNECTING) {
                    return;
                }
                if (b50VarC == b50Var) {
                    d();
                    return;
                }
            }
            int iOrdinal = b50VarC.ordinal();
            if (iOrdinal == 0) {
                b50 b50Var4 = b50.CONNECTING;
                this.f32488m = b50Var4;
                s(b50Var4, new y60(b70.d()));
                return;
            }
            if (iOrdinal == 1) {
                t90 t90Var = this.f32491p;
                if (t90Var != null) {
                    t90Var.a();
                    this.f32491p = null;
                }
                this.f32493r = null;
                u();
                for (fj0 fj0Var2 : map.values()) {
                    if (!fj0Var2.a().equals(fj0Var.f())) {
                        fj0Var2.a().b();
                    }
                }
                map.clear();
                b50 b50Var5 = b50.READY;
                fj0Var.d(b50Var5);
                map.put(v(fj0Var.f()), fj0Var);
                this.f32484i.h(v(fj0Var.f()));
                this.f32488m = b50Var5;
                h(fj0Var);
                return;
            }
            if (iOrdinal != 2) {
                if (iOrdinal != 3) {
                    throw new IllegalArgumentException("Unsupported state:".concat(String.valueOf(b50VarC)));
                }
                this.f32484i.c();
                this.f32488m = b50Var;
                s(b50Var, new ej0(this, this));
                return;
            }
            zi0 zi0Var = this.f32484i;
            if (zi0Var.a() && map.get(zi0Var.d()) == fj0Var) {
                if (zi0Var.b()) {
                    u();
                    d();
                } else if (map.size() >= zi0Var.i()) {
                    q();
                } else {
                    zi0Var.c();
                    d();
                }
            }
            if (map.size() >= zi0Var.i()) {
                Iterator it = map.values().iterator();
                while (it.hasNext()) {
                    if (!((fj0) it.next()).c()) {
                        return;
                    }
                }
                this.f32488m = b50Var3;
                s(b50Var3, new y60(b70.b(c50Var.d())));
                int i15 = this.f32485j + 1;
                this.f32485j = i15;
                if (i15 >= zi0Var.i() || this.f32486k) {
                    this.f32486k = false;
                    this.f32485j = 0;
                    this.f32482g.c();
                }
            }
        }
    }

    final /* synthetic */ z60 j() {
        return this.f32482g;
    }

    final /* synthetic */ Map k() {
        return this.f32483h;
    }

    final /* synthetic */ zi0 l() {
        return this.f32484i;
    }

    final /* synthetic */ void m(t90 t90Var) {
        this.f32487l = null;
    }

    final /* synthetic */ boolean n() {
        return this.f32490o;
    }

    final /* synthetic */ void o(t90 t90Var) {
        this.f32491p = null;
    }
}
