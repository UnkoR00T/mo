package k5;

import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static float f108555v = Float.NaN;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public n5.e f108556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f108557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f108558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f108559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f108560e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public float f108561f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f108562g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f108563h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public float f108564i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public float f108565j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public float f108566k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public float f108567l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public float f108568m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public float f108569n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f108570o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public float f108571p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f108572q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f108573r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final HashMap<String, h5.a> f108574s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f108575t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    i5.g f108576u;

    public h() {
        this.f108556a = null;
        this.f108557b = 0;
        this.f108558c = 0;
        this.f108559d = 0;
        this.f108560e = 0;
        this.f108561f = Float.NaN;
        this.f108562g = Float.NaN;
        this.f108563h = Float.NaN;
        this.f108564i = Float.NaN;
        this.f108565j = Float.NaN;
        this.f108566k = Float.NaN;
        this.f108567l = Float.NaN;
        this.f108568m = Float.NaN;
        this.f108569n = Float.NaN;
        this.f108570o = Float.NaN;
        this.f108571p = Float.NaN;
        this.f108572q = Float.NaN;
        this.f108573r = 0;
        this.f108574s = new HashMap<>();
        this.f108575t = null;
    }

    private static void a(StringBuilder sb5, String str, float f15) {
        if (Float.isNaN(f15)) {
            return;
        }
        sb5.append(str);
        sb5.append(": ");
        sb5.append(f15);
        sb5.append(",\n");
    }

    private static void b(StringBuilder sb5, String str, int i15) {
        sb5.append(str);
        sb5.append(": ");
        sb5.append(i15);
        sb5.append(",\n");
    }

    private void e(StringBuilder sb5, n5.d.a aVar) {
        n5.d dVarO = this.f108556a.o(aVar);
        if (dVarO == null || dVarO.f131825f == null) {
            return;
        }
        sb5.append("Anchor");
        sb5.append(aVar.name());
        sb5.append(": ['");
        String str = dVarO.f131825f.h().f131867o;
        if (str == null) {
            str = "#PARENT";
        }
        sb5.append(str);
        sb5.append("', '");
        sb5.append(dVarO.f131825f.k().name());
        sb5.append("', '");
        sb5.append(dVarO.f131826g);
        sb5.append("'],\n");
    }

    public boolean c() {
        return Float.isNaN(this.f108563h) && Float.isNaN(this.f108564i) && Float.isNaN(this.f108565j) && Float.isNaN(this.f108566k) && Float.isNaN(this.f108567l) && Float.isNaN(this.f108568m) && Float.isNaN(this.f108569n) && Float.isNaN(this.f108570o) && Float.isNaN(this.f108571p);
    }

    public StringBuilder d(StringBuilder sb5, boolean z15) {
        sb5.append("{\n");
        b(sb5, "left", this.f108557b);
        b(sb5, "top", this.f108558c);
        b(sb5, "right", this.f108559d);
        b(sb5, "bottom", this.f108560e);
        a(sb5, "pivotX", this.f108561f);
        a(sb5, "pivotY", this.f108562g);
        a(sb5, "rotationX", this.f108563h);
        a(sb5, "rotationY", this.f108564i);
        a(sb5, "rotationZ", this.f108565j);
        a(sb5, "translationX", this.f108566k);
        a(sb5, "translationY", this.f108567l);
        a(sb5, "translationZ", this.f108568m);
        a(sb5, "scaleX", this.f108569n);
        a(sb5, "scaleY", this.f108570o);
        a(sb5, "alpha", this.f108571p);
        b(sb5, "visibility", this.f108573r);
        a(sb5, "interpolatedPos", this.f108572q);
        if (this.f108556a != null) {
            for (n5.d.a aVar : n5.d.a.values()) {
                e(sb5, aVar);
            }
        }
        if (z15) {
            a(sb5, "phone_orientation", f108555v);
        }
        if (z15) {
            a(sb5, "phone_orientation", f108555v);
        }
        if (this.f108574s.size() != 0) {
            sb5.append("custom : {\n");
            for (String str : this.f108574s.keySet()) {
                h5.a aVar2 = this.f108574s.get(str);
                sb5.append(str);
                sb5.append(": ");
                switch (aVar2.h()) {
                    case 900:
                        sb5.append(aVar2.e());
                        sb5.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb5.append(aVar2.d());
                        sb5.append(",\n");
                        break;
                    case 902:
                        sb5.append("'");
                        sb5.append(h5.a.a(aVar2.e()));
                        sb5.append("',\n");
                        break;
                    case 903:
                        sb5.append("'");
                        sb5.append(aVar2.g());
                        sb5.append("',\n");
                        break;
                    case 904:
                        sb5.append("'");
                        sb5.append(aVar2.c());
                        sb5.append("',\n");
                        break;
                }
            }
            sb5.append("}\n");
        }
        sb5.append("}\n");
        return sb5;
    }

    public void f(String str, int i15, float f15) {
        if (this.f108574s.containsKey(str)) {
            this.f108574s.get(str).i(f15);
        } else {
            this.f108574s.put(str, new h5.a(str, i15, f15));
        }
    }

    public void g(String str, int i15, int i16) {
        if (this.f108574s.containsKey(str)) {
            this.f108574s.get(str).j(i16);
        } else {
            this.f108574s.put(str, new h5.a(str, i15, i16));
        }
    }

    void h(i5.g gVar) {
        this.f108576u = gVar;
    }

    public h i() {
        n5.e eVar = this.f108556a;
        if (eVar != null) {
            this.f108557b = eVar.E();
            this.f108558c = this.f108556a.S();
            this.f108559d = this.f108556a.N();
            this.f108560e = this.f108556a.r();
            j(this.f108556a.f131865n);
        }
        return this;
    }

    public void j(h hVar) {
        if (hVar == null) {
            return;
        }
        this.f108561f = hVar.f108561f;
        this.f108562g = hVar.f108562g;
        this.f108563h = hVar.f108563h;
        this.f108564i = hVar.f108564i;
        this.f108565j = hVar.f108565j;
        this.f108566k = hVar.f108566k;
        this.f108567l = hVar.f108567l;
        this.f108568m = hVar.f108568m;
        this.f108569n = hVar.f108569n;
        this.f108570o = hVar.f108570o;
        this.f108571p = hVar.f108571p;
        this.f108573r = hVar.f108573r;
        h(hVar.f108576u);
        this.f108574s.clear();
        for (h5.a aVar : hVar.f108574s.values()) {
            this.f108574s.put(aVar.f(), aVar.b());
        }
    }

    public h(n5.e eVar) {
        this.f108556a = null;
        this.f108557b = 0;
        this.f108558c = 0;
        this.f108559d = 0;
        this.f108560e = 0;
        this.f108561f = Float.NaN;
        this.f108562g = Float.NaN;
        this.f108563h = Float.NaN;
        this.f108564i = Float.NaN;
        this.f108565j = Float.NaN;
        this.f108566k = Float.NaN;
        this.f108567l = Float.NaN;
        this.f108568m = Float.NaN;
        this.f108569n = Float.NaN;
        this.f108570o = Float.NaN;
        this.f108571p = Float.NaN;
        this.f108572q = Float.NaN;
        this.f108573r = 0;
        this.f108574s = new HashMap<>();
        this.f108575t = null;
        this.f108556a = eVar;
    }

    public h(h hVar) {
        this.f108556a = null;
        this.f108557b = 0;
        this.f108558c = 0;
        this.f108559d = 0;
        this.f108560e = 0;
        this.f108561f = Float.NaN;
        this.f108562g = Float.NaN;
        this.f108563h = Float.NaN;
        this.f108564i = Float.NaN;
        this.f108565j = Float.NaN;
        this.f108566k = Float.NaN;
        this.f108567l = Float.NaN;
        this.f108568m = Float.NaN;
        this.f108569n = Float.NaN;
        this.f108570o = Float.NaN;
        this.f108571p = Float.NaN;
        this.f108572q = Float.NaN;
        this.f108573r = 0;
        this.f108574s = new HashMap<>();
        this.f108575t = null;
        this.f108556a = hVar.f108556a;
        this.f108557b = hVar.f108557b;
        this.f108558c = hVar.f108558c;
        this.f108559d = hVar.f108559d;
        this.f108560e = hVar.f108560e;
        j(hVar);
    }
}
