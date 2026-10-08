package n5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected e f131798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected e f131799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected e f131800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected e f131801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected e f131802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected e f131803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected e f131804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected ArrayList<e> f131805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected int f131806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f131807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f131808k = 0.0f;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f131809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    int f131810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    int f131811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    boolean f131812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f131813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f131814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected boolean f131815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected boolean f131816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected boolean f131817t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected boolean f131818u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f131819v;

    public c(e eVar, int i15, boolean z15) {
        this.f131798a = eVar;
        this.f131813p = i15;
        this.f131814q = z15;
    }

    private void b() {
        int i15 = this.f131813p * 2;
        e eVar = this.f131798a;
        this.f131812o = true;
        e eVar2 = eVar;
        boolean z15 = false;
        while (!z15) {
            this.f131806i++;
            e[] eVarArr = eVar.F0;
            int i16 = this.f131813p;
            e eVar3 = null;
            eVarArr[i16] = null;
            eVar.E0[i16] = null;
            if (eVar.X() != 8) {
                this.f131809l++;
                e.b bVarU = eVar.u(this.f131813p);
                e.b bVar = e.b.MATCH_CONSTRAINT;
                if (bVarU != bVar) {
                    this.f131810m += eVar.F(this.f131813p);
                }
                int iF = this.f131810m + eVar.W[i15].f();
                this.f131810m = iF;
                int i17 = i15 + 1;
                this.f131810m = iF + eVar.W[i17].f();
                int iF2 = this.f131811n + eVar.W[i15].f();
                this.f131811n = iF2;
                this.f131811n = iF2 + eVar.W[i17].f();
                if (this.f131799b == null) {
                    this.f131799b = eVar;
                }
                this.f131801d = eVar;
                e.b[] bVarArr = eVar.Z;
                int i18 = this.f131813p;
                if (bVarArr[i18] == bVar) {
                    int i19 = eVar.f131887y[i18];
                    if (i19 == 0 || i19 == 3 || i19 == 2) {
                        this.f131807j++;
                        float f15 = eVar.D0[i18];
                        if (f15 > 0.0f) {
                            this.f131808k += f15;
                        }
                        if (c(eVar, i18)) {
                            if (f15 < 0.0f) {
                                this.f131815r = true;
                            } else {
                                this.f131816s = true;
                            }
                            if (this.f131805h == null) {
                                this.f131805h = new ArrayList<>();
                            }
                            this.f131805h.add(eVar);
                        }
                        if (this.f131803f == null) {
                            this.f131803f = eVar;
                        }
                        e eVar4 = this.f131804g;
                        if (eVar4 != null) {
                            eVar4.E0[this.f131813p] = eVar;
                        }
                        this.f131804g = eVar;
                    }
                    if (this.f131813p == 0) {
                        if (eVar.f131883w != 0 || eVar.f131889z != 0 || eVar.A != 0) {
                            this.f131812o = false;
                        }
                    } else if (eVar.f131885x != 0 || eVar.C != 0 || eVar.D != 0) {
                        this.f131812o = false;
                    }
                    if (eVar.f131846d0 != 0.0f) {
                        this.f131812o = false;
                        this.f131818u = true;
                    }
                }
            }
            if (eVar2 != eVar) {
                eVar2.F0[this.f131813p] = eVar;
            }
            d dVar = eVar.W[i15 + 1].f131825f;
            if (dVar != null) {
                e eVar5 = dVar.f131823d;
                d dVar2 = eVar5.W[i15].f131825f;
                if (dVar2 != null && dVar2.f131823d == eVar) {
                    eVar3 = eVar5;
                }
            }
            if (eVar3 == null) {
                eVar3 = eVar;
                z15 = true;
            }
            eVar2 = eVar;
            eVar = eVar3;
        }
        e eVar6 = this.f131799b;
        if (eVar6 != null) {
            this.f131810m -= eVar6.W[i15].f();
        }
        e eVar7 = this.f131801d;
        if (eVar7 != null) {
            this.f131810m -= eVar7.W[i15 + 1].f();
        }
        this.f131800c = eVar;
        if (this.f131813p == 0 && this.f131814q) {
            this.f131802e = eVar;
        } else {
            this.f131802e = this.f131798a;
        }
        this.f131817t = this.f131816s && this.f131815r;
    }

    private static boolean c(e eVar, int i15) {
        if (eVar.X() == 8 || eVar.Z[i15] != e.b.MATCH_CONSTRAINT) {
            return false;
        }
        int i16 = eVar.f131887y[i15];
        return i16 == 0 || i16 == 3;
    }

    public void a() {
        if (!this.f131819v) {
            b();
        }
        this.f131819v = true;
    }
}
