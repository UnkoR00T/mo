package io.sentry.rrweb;

import io.sentry.d2;
import io.sentry.k3;
import io.sentry.l3;
import io.sentry.t1;
import io.sentry.util.v;
import io.sentry.v0;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class j extends b implements d2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f95660c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f95661d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f95662e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f95663f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f95664g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f95665h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f95666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f95667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f95668l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f95669m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f95670n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f95671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f95672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private Map<String, Object> f95673r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private Map<String, Object> f95674s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Map<String, Object> f95675t;

    public static final class a implements t1<j> {
        private void c(j jVar, k3 k3Var, v0 v0Var) {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("payload")) {
                    d(jVar, k3Var, v0Var);
                } else if (strH1.equals("tag")) {
                    String strO2 = k3Var.O2();
                    if (strO2 == null) {
                        strO2 = "";
                    }
                    jVar.f95660c = strO2;
                } else {
                    if (concurrentHashMap == null) {
                        concurrentHashMap = new ConcurrentHashMap();
                    }
                    k3Var.U2(v0Var, concurrentHashMap, strH1);
                }
            }
            jVar.v(concurrentHashMap);
            k3Var.h0();
        }

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private void d(j jVar, k3 k3Var, v0 v0Var) {
            k3Var.Y();
            ConcurrentHashMap concurrentHashMap = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                byte b15 = -1;
                switch (strH1.hashCode()) {
                    case -1992012396:
                        if (strH1.equals("duration")) {
                            b15 = 0;
                        }
                        break;
                    case -1627805778:
                        if (strH1.equals("segmentId")) {
                            b15 = 1;
                        }
                        break;
                    case -1221029593:
                        if (strH1.equals("height")) {
                            b15 = 2;
                        }
                        break;
                    case -410956671:
                        if (strH1.equals("container")) {
                            b15 = 3;
                        }
                        break;
                    case -296512606:
                        if (strH1.equals("frameCount")) {
                            b15 = 4;
                        }
                        break;
                    case 115029:
                        if (strH1.equals("top")) {
                            b15 = 5;
                        }
                        break;
                    case 3317767:
                        if (strH1.equals("left")) {
                            b15 = 6;
                        }
                        break;
                    case 3530753:
                        if (strH1.equals("size")) {
                            b15 = 7;
                        }
                        break;
                    case 113126854:
                        if (strH1.equals("width")) {
                            b15 = 8;
                        }
                        break;
                    case 545057773:
                        if (strH1.equals("frameRate")) {
                            b15 = 9;
                        }
                        break;
                    case 1711222099:
                        if (strH1.equals("encoding")) {
                            b15 = 10;
                        }
                        break;
                    case 2135109831:
                        if (strH1.equals("frameRateType")) {
                            b15 = 11;
                        }
                        break;
                }
                switch (b15) {
                    case 0:
                        jVar.f95663f = k3Var.nextLong();
                        break;
                    case 1:
                        jVar.f95661d = k3Var.nextInt();
                        break;
                    case 2:
                        Integer numZ2 = k3Var.z2();
                        jVar.f95666j = numZ2 != null ? numZ2.intValue() : 0;
                        break;
                    case 3:
                        String strO2 = k3Var.O2();
                        jVar.f95665h = strO2 != null ? strO2 : "";
                        break;
                    case 4:
                        Integer numZ3 = k3Var.z2();
                        jVar.f95668l = numZ3 != null ? numZ3.intValue() : 0;
                        break;
                    case 5:
                        Integer numZ4 = k3Var.z2();
                        jVar.f95672q = numZ4 != null ? numZ4.intValue() : 0;
                        break;
                    case 6:
                        Integer numZ5 = k3Var.z2();
                        jVar.f95671p = numZ5 != null ? numZ5.intValue() : 0;
                        break;
                    case 7:
                        Long lE2 = k3Var.E2();
                        jVar.f95662e = lE2 == null ? 0L : lE2.longValue();
                        break;
                    case 8:
                        Integer numZ6 = k3Var.z2();
                        jVar.f95667k = numZ6 != null ? numZ6.intValue() : 0;
                        break;
                    case 9:
                        Integer numZ7 = k3Var.z2();
                        jVar.f95670n = numZ7 != null ? numZ7.intValue() : 0;
                        break;
                    case 10:
                        String strO3 = k3Var.O2();
                        jVar.f95664g = strO3 != null ? strO3 : "";
                        break;
                    case 11:
                        String strO4 = k3Var.O2();
                        jVar.f95669m = strO4 != null ? strO4 : "";
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        k3Var.U2(v0Var, concurrentHashMap, strH1);
                        break;
                }
            }
            jVar.B(concurrentHashMap);
            k3Var.h0();
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(k3 k3Var, v0 v0Var) {
            k3Var.Y();
            j jVar = new j();
            b.a aVar = new b.a();
            HashMap map = null;
            while (k3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strH1 = k3Var.h1();
                strH1.getClass();
                if (strH1.equals("data")) {
                    c(jVar, k3Var, v0Var);
                } else if (!aVar.a(jVar, strH1, k3Var, v0Var)) {
                    if (map == null) {
                        map = new HashMap();
                    }
                    k3Var.U2(v0Var, map, strH1);
                }
            }
            jVar.F(map);
            k3Var.h0();
            return jVar;
        }
    }

    public j() {
        super(c.Custom);
        this.f95664g = "h264";
        this.f95665h = "mp4";
        this.f95669m = "constant";
        this.f95660c = "video";
    }

    private void t(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("tag").h(this.f95660c);
        l3Var.f("payload");
        u(l3Var, v0Var);
        Map<String, Object> map = this.f95675t;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95675t.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    private void u(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        l3Var.f("segmentId").b(this.f95661d);
        l3Var.f("size").b(this.f95662e);
        l3Var.f("duration").b(this.f95663f);
        l3Var.f("encoding").h(this.f95664g);
        l3Var.f("container").h(this.f95665h);
        l3Var.f("height").b(this.f95666j);
        l3Var.f("width").b(this.f95667k);
        l3Var.f("frameCount").b(this.f95668l);
        l3Var.f("frameRate").b(this.f95670n);
        l3Var.f("frameRateType").h(this.f95669m);
        l3Var.f("left").b(this.f95671p);
        l3Var.f("top").b(this.f95672q);
        Map<String, Object> map = this.f95674s;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95674s.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void A(int i15) {
        this.f95671p = i15;
    }

    public void B(Map<String, Object> map) {
        this.f95674s = map;
    }

    public void C(int i15) {
        this.f95661d = i15;
    }

    public void D(long j15) {
        this.f95662e = j15;
    }

    public void E(int i15) {
        this.f95672q = i15;
    }

    public void F(Map<String, Object> map) {
        this.f95673r = map;
    }

    public void G(int i15) {
        this.f95667k = i15;
    }

    @Override // io.sentry.rrweb.b
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f95661d == jVar.f95661d && this.f95662e == jVar.f95662e && this.f95663f == jVar.f95663f && this.f95666j == jVar.f95666j && this.f95667k == jVar.f95667k && this.f95668l == jVar.f95668l && this.f95670n == jVar.f95670n && this.f95671p == jVar.f95671p && this.f95672q == jVar.f95672q && v.a(this.f95660c, jVar.f95660c) && v.a(this.f95664g, jVar.f95664g) && v.a(this.f95665h, jVar.f95665h) && v.a(this.f95669m, jVar.f95669m);
    }

    @Override // io.sentry.rrweb.b
    public int hashCode() {
        return v.b(Integer.valueOf(super.hashCode()), this.f95660c, Integer.valueOf(this.f95661d), Long.valueOf(this.f95662e), Long.valueOf(this.f95663f), this.f95664g, this.f95665h, Integer.valueOf(this.f95666j), Integer.valueOf(this.f95667k), Integer.valueOf(this.f95668l), this.f95669m, Integer.valueOf(this.f95670n), Integer.valueOf(this.f95671p), Integer.valueOf(this.f95672q));
    }

    @Override // io.sentry.d2
    public void serialize(l3 l3Var, v0 v0Var) {
        l3Var.Y();
        new b.C2242b().a(this, l3Var, v0Var);
        l3Var.f("data");
        t(l3Var, v0Var);
        Map<String, Object> map = this.f95673r;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f95673r.get(str);
                l3Var.f(str);
                l3Var.l(v0Var, obj);
            }
        }
        l3Var.h0();
    }

    public void v(Map<String, Object> map) {
        this.f95675t = map;
    }

    public void w(long j15) {
        this.f95663f = j15;
    }

    public void x(int i15) {
        this.f95668l = i15;
    }

    public void y(int i15) {
        this.f95670n = i15;
    }

    public void z(int i15) {
        this.f95666j = i15;
    }
}
