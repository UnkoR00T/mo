package pd;

import java.util.List;
import java.util.Locale;
import nd.j;
import nd.k;
import nd.n;

/* JADX INFO: loaded from: classes3.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<od.c> f156937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final fd.f f156938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f156939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f156940d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f156941e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final long f156942f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f156943g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<od.i> f156944h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final n f156945i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f156946j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f156947k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f156948l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final float f156949m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final float f156950n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final float f156951o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final float f156952p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final j f156953q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final k f156954r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final nd.b f156955s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final List<ud.a<Float>> f156956t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private final b f156957u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f156958v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final od.a f156959w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private final rd.j f156960x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final od.h f156961y;

    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<od.c> list, fd.f fVar, String str, long j15, a aVar, long j16, String str2, List<od.i> list2, n nVar, int i15, int i16, int i17, float f15, float f16, float f17, float f18, j jVar, k kVar, List<ud.a<Float>> list3, b bVar, nd.b bVar2, boolean z15, od.a aVar2, rd.j jVar2, od.h hVar) {
        this.f156937a = list;
        this.f156938b = fVar;
        this.f156939c = str;
        this.f156940d = j15;
        this.f156941e = aVar;
        this.f156942f = j16;
        this.f156943g = str2;
        this.f156944h = list2;
        this.f156945i = nVar;
        this.f156946j = i15;
        this.f156947k = i16;
        this.f156948l = i17;
        this.f156949m = f15;
        this.f156950n = f16;
        this.f156951o = f17;
        this.f156952p = f18;
        this.f156953q = jVar;
        this.f156954r = kVar;
        this.f156956t = list3;
        this.f156957u = bVar;
        this.f156955s = bVar2;
        this.f156958v = z15;
        this.f156959w = aVar2;
        this.f156960x = jVar2;
        this.f156961y = hVar;
    }

    public od.h a() {
        return this.f156961y;
    }

    public od.a b() {
        return this.f156959w;
    }

    fd.f c() {
        return this.f156938b;
    }

    public rd.j d() {
        return this.f156960x;
    }

    public long e() {
        return this.f156940d;
    }

    List<ud.a<Float>> f() {
        return this.f156956t;
    }

    public a g() {
        return this.f156941e;
    }

    List<od.i> h() {
        return this.f156944h;
    }

    b i() {
        return this.f156957u;
    }

    public String j() {
        return this.f156939c;
    }

    long k() {
        return this.f156942f;
    }

    float l() {
        return this.f156952p;
    }

    float m() {
        return this.f156951o;
    }

    public String n() {
        return this.f156943g;
    }

    List<od.c> o() {
        return this.f156937a;
    }

    int p() {
        return this.f156948l;
    }

    int q() {
        return this.f156947k;
    }

    int r() {
        return this.f156946j;
    }

    float s() {
        return this.f156950n / this.f156938b.e();
    }

    j t() {
        return this.f156953q;
    }

    public String toString() {
        return z("");
    }

    k u() {
        return this.f156954r;
    }

    nd.b v() {
        return this.f156955s;
    }

    float w() {
        return this.f156949m;
    }

    n x() {
        return this.f156945i;
    }

    public boolean y() {
        return this.f156958v;
    }

    public String z(String str) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append(j());
        sb5.append("\n");
        e eVarU = this.f156938b.u(k());
        if (eVarU != null) {
            sb5.append("\t\tParents: ");
            sb5.append(eVarU.j());
            e eVarU2 = this.f156938b.u(eVarU.k());
            while (eVarU2 != null) {
                sb5.append("->");
                sb5.append(eVarU2.j());
                eVarU2 = this.f156938b.u(eVarU2.k());
            }
            sb5.append(str);
            sb5.append("\n");
        }
        if (!h().isEmpty()) {
            sb5.append(str);
            sb5.append("\tMasks: ");
            sb5.append(h().size());
            sb5.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb5.append(str);
            sb5.append("\tBackground: ");
            sb5.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f156937a.isEmpty()) {
            sb5.append(str);
            sb5.append("\tShapes:\n");
            for (od.c cVar : this.f156937a) {
                sb5.append(str);
                sb5.append("\t\t");
                sb5.append(cVar);
                sb5.append("\n");
            }
        }
        return sb5.toString();
    }
}
