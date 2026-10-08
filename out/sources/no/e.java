package no;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class e {
    private boolean A;
    private float B;
    private float C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f137461a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f137463c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f137464d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f137465e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f137466f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private uo.a f137467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f137468h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f137469i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f137470j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f137471k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f137472l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private String f137473m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f137474n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f137475o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private float[] f137476p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f137477q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private float f137478r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private float f137479s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f137480t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private float f137481u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private float f137483w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private float f137484x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private float f137485y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private float[] f137486z;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137462b = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final List<String> f137482v = new ArrayList();
    private List<b> D = new ArrayList();
    private Map<String, b> E = new HashMap();
    private List<h> F = new ArrayList();
    private List<c> G = new ArrayList();
    private List<f> H = new ArrayList();
    private List<f> I = new ArrayList();
    private List<f> J = new ArrayList();

    public void A(float f15) {
        this.f137481u = f15;
    }

    public void B(String str) {
        this.f137470j = str;
    }

    public void C(int i15) {
        this.f137472l = i15;
    }

    public void D(String str) {
        this.f137465e = str;
    }

    public void E(boolean z15) {
        this.A = z15;
    }

    public void F(uo.a aVar) {
        this.f137467g = aVar;
    }

    public void G(String str) {
        this.f137463c = str;
    }

    public void H(String str) {
        this.f137468h = str;
    }

    public void I(String str) {
        this.f137464d = str;
    }

    public void J(boolean z15) {
        this.f137475o = z15;
    }

    public void K(boolean z15) {
        this.f137477q = z15;
    }

    public void L(float f15) {
        this.f137485y = f15;
    }

    public void M(int i15) {
        this.f137471k = i15;
    }

    public void N(String str) {
        this.f137469i = str;
    }

    public void O(float f15) {
        this.B = f15;
    }

    public void P(float f15) {
        this.C = f15;
    }

    public void Q(float f15) {
        this.f137483w = f15;
    }

    public void R(float f15) {
        this.f137484x = f15;
    }

    public void S(float[] fArr) {
        this.f137476p = fArr;
    }

    public void T(String str) {
        this.f137466f = str;
    }

    public void U(float f15) {
        this.f137479s = f15;
    }

    public void a(String str) {
        this.f137482v.add(str);
    }

    public void b(c cVar) {
        this.G.add(cVar);
    }

    public void c(f fVar) {
        this.H.add(fVar);
    }

    public void d(f fVar) {
        this.I.add(fVar);
    }

    public void e(f fVar) {
        this.J.add(fVar);
    }

    public void f(h hVar) {
        this.F.add(hVar);
    }

    public float g() {
        return this.f137480t;
    }

    public float h() {
        float fD = 0.0f;
        float f15 = 0.0f;
        for (b bVar : this.D) {
            if (bVar.d() > 0.0f) {
                fD += bVar.d();
                f15 += 1.0f;
            }
        }
        if (fD > 0.0f) {
            return fD / f15;
        }
        return 0.0f;
    }

    public float i() {
        return this.f137478r;
    }

    public List<b> j() {
        return Collections.unmodifiableList(this.D);
    }

    public String k() {
        return this.f137473m;
    }

    public float l(String str) {
        b bVar = this.E.get(str);
        if (bVar != null) {
            return bVar.d();
        }
        return 0.0f;
    }

    public float m() {
        return this.f137481u;
    }

    public String n() {
        return this.f137470j;
    }

    public String o() {
        return this.f137465e;
    }

    public uo.a p() {
        return this.f137467g;
    }

    public String q() {
        return this.f137463c;
    }

    public float r() {
        return this.f137485y;
    }

    public float s() {
        return this.f137479s;
    }

    public void t(float f15) {
        this.f137461a = f15;
    }

    public void u(float f15) {
        this.f137480t = f15;
    }

    public void v(float f15) {
        this.f137478r = f15;
    }

    public void w(List<b> list) {
        this.D = list;
        this.E = new HashMap(this.D.size());
        for (b bVar : list) {
            this.E.put(bVar.c(), bVar);
        }
    }

    public void x(float[] fArr) {
        this.f137486z = fArr;
    }

    public void y(String str) {
        this.f137473m = str;
    }

    public void z(int i15) {
        this.f137474n = i15;
    }
}
