package fd;

import android.graphics.Rect;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import r0.m1;

/* JADX INFO: loaded from: classes3.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, List<pd.e>> f61225c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, d0> f61226d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private float f61227e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map<String, md.c> f61228f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private List<md.h> f61229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private m1<md.d> f61230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private r0.a0<pd.e> f61231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List<pd.e> f61232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Rect f61233k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f61234l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f61235m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f61236n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f61237o;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f61239q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f61240r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final l0 f61223a = new l0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final HashSet<String> f61224b = new HashSet<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f61238p = 0;

    public void a(String str) {
        td.e.c(str);
        this.f61224b.add(str);
    }

    public Rect b() {
        return this.f61233k;
    }

    public m1<md.d> c() {
        return this.f61230h;
    }

    public float d() {
        return (long) ((e() / this.f61236n) * 1000.0f);
    }

    public float e() {
        return this.f61235m - this.f61234l;
    }

    public float f() {
        return this.f61235m;
    }

    public Map<String, md.c> g() {
        return this.f61228f;
    }

    public float h(float f15) {
        return td.j.i(this.f61234l, this.f61235m, f15);
    }

    public float i() {
        return this.f61236n;
    }

    public Map<String, d0> j() {
        float fE = td.m.e();
        if (fE != this.f61227e) {
            for (Map.Entry<String, d0> entry : this.f61226d.entrySet()) {
                this.f61226d.put(entry.getKey(), entry.getValue().a(this.f61227e / fE));
            }
        }
        this.f61227e = fE;
        return this.f61226d;
    }

    public List<pd.e> k() {
        return this.f61232j;
    }

    public md.h l(String str) {
        int size = this.f61229g.size();
        for (int i15 = 0; i15 < size; i15++) {
            md.h hVar = this.f61229g.get(i15);
            if (hVar.a(str)) {
                return hVar;
            }
        }
        return null;
    }

    public int m() {
        return this.f61238p;
    }

    public l0 n() {
        return this.f61223a;
    }

    public List<pd.e> o(String str) {
        return this.f61225c.get(str);
    }

    public float p() {
        return this.f61234l;
    }

    public boolean q() {
        return this.f61237o;
    }

    public boolean r() {
        return !this.f61226d.isEmpty();
    }

    public void s(int i15) {
        this.f61238p += i15;
    }

    public void t(Rect rect, float f15, float f16, float f17, List<pd.e> list, r0.a0<pd.e> a0Var, Map<String, List<pd.e>> map, Map<String, d0> map2, float f18, m1<md.d> m1Var, Map<String, md.c> map3, List<md.h> list2, int i15, int i16) {
        this.f61233k = rect;
        this.f61234l = f15;
        this.f61235m = f16;
        this.f61236n = f17;
        this.f61232j = list;
        this.f61231i = a0Var;
        this.f61225c = map;
        this.f61226d = map2;
        this.f61227e = f18;
        this.f61230h = m1Var;
        this.f61228f = map3;
        this.f61229g = list2;
        this.f61239q = i15;
        this.f61240r = i16;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder("LottieComposition:\n");
        Iterator<pd.e> it = this.f61232j.iterator();
        while (it.hasNext()) {
            sb5.append(it.next().z("\t"));
        }
        return sb5.toString();
    }

    public pd.e u(long j15) {
        return this.f61231i.g(j15);
    }

    public void v(boolean z15) {
        this.f61237o = z15;
    }

    public void w(boolean z15) {
        this.f61223a.b(z15);
    }
}
