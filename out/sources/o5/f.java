package o5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class f implements d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    p f142392d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f142394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f142395g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f142389a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f142390b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f142391c = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    a f142393e = a.UNKNOWN;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int f142396h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    g f142397i = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f142398j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    List<d> f142399k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    List<f> f142400l = new ArrayList();

    enum a {
        UNKNOWN,
        HORIZONTAL_DIMENSION,
        VERTICAL_DIMENSION,
        LEFT,
        RIGHT,
        TOP,
        BOTTOM,
        BASELINE
    }

    public f(p pVar) {
        this.f142392d = pVar;
    }

    @Override // o5.d
    public void a(d dVar) {
        Iterator<f> it = this.f142400l.iterator();
        while (it.hasNext()) {
            if (!it.next().f142398j) {
                return;
            }
        }
        this.f142391c = true;
        d dVar2 = this.f142389a;
        if (dVar2 != null) {
            dVar2.a(this);
        }
        if (this.f142390b) {
            this.f142392d.a(this);
            return;
        }
        f fVar = null;
        int i15 = 0;
        for (f fVar2 : this.f142400l) {
            if (!(fVar2 instanceof g)) {
                i15++;
                fVar = fVar2;
            }
        }
        if (fVar != null && i15 == 1 && fVar.f142398j) {
            g gVar = this.f142397i;
            if (gVar != null) {
                if (!gVar.f142398j) {
                    return;
                } else {
                    this.f142394f = this.f142396h * gVar.f142395g;
                }
            }
            d(fVar.f142395g + this.f142394f);
        }
        d dVar3 = this.f142389a;
        if (dVar3 != null) {
            dVar3.a(this);
        }
    }

    public void b(d dVar) {
        this.f142399k.add(dVar);
        if (this.f142398j) {
            dVar.a(dVar);
        }
    }

    public void c() {
        this.f142400l.clear();
        this.f142399k.clear();
        this.f142398j = false;
        this.f142395g = 0;
        this.f142391c = false;
        this.f142390b = false;
    }

    public void d(int i15) {
        if (this.f142398j) {
            return;
        }
        this.f142398j = true;
        this.f142395g = i15;
        for (d dVar : this.f142399k) {
            dVar.a(dVar);
        }
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(this.f142392d.f142442b.t());
        sb5.append(":");
        sb5.append(this.f142393e);
        sb5.append("(");
        sb5.append(this.f142398j ? Integer.valueOf(this.f142395g) : "unresolved");
        sb5.append(") <t=");
        sb5.append(this.f142400l.size());
        sb5.append(":d=");
        sb5.append(this.f142399k.size());
        sb5.append(">");
        return sb5.toString();
    }
}
