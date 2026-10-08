package g5;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public class b implements d.a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f70630e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    i f70626a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    float f70627b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f70628c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ArrayList<i> f70629d = new ArrayList<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    boolean f70631f = false;

    public interface a {
        i a(int i15);

        void b();

        float c(i iVar, boolean z15);

        void clear();

        boolean d(i iVar);

        void e(i iVar, float f15);

        int f();

        float g(int i15);

        void h(i iVar, float f15, boolean z15);

        float i(b bVar, boolean z15);

        float j(i iVar);

        void k(float f15);
    }

    public b() {
    }

    private boolean u(i iVar, d dVar) {
        return iVar.f70686n <= 1;
    }

    private i w(boolean[] zArr, i iVar) {
        i.a aVar;
        int iF = this.f70630e.f();
        i iVar2 = null;
        float f15 = 0.0f;
        for (int i15 = 0; i15 < iF; i15++) {
            float fG = this.f70630e.g(i15);
            if (fG < 0.0f) {
                i iVarA = this.f70630e.a(i15);
                if ((zArr == null || !zArr[iVarA.f70676c]) && iVarA != iVar && (((aVar = iVarA.f70683k) == i.a.SLACK || aVar == i.a.ERROR) && fG < f15)) {
                    f15 = fG;
                    iVar2 = iVarA;
                }
            }
        }
        return iVar2;
    }

    public void A(d dVar, i iVar, boolean z15) {
        if (iVar == null || !iVar.f70680g) {
            return;
        }
        this.f70627b += iVar.f70679f * this.f70630e.j(iVar);
        this.f70630e.c(iVar, z15);
        if (z15) {
            iVar.j(this);
        }
        if (d.f70638u && this.f70630e.f() == 0) {
            this.f70631f = true;
            dVar.f70644b = true;
        }
    }

    public void B(d dVar, b bVar, boolean z15) {
        this.f70627b += bVar.f70627b * this.f70630e.i(bVar, z15);
        if (z15) {
            bVar.f70626a.j(this);
        }
        if (d.f70638u && this.f70626a != null && this.f70630e.f() == 0) {
            this.f70631f = true;
            dVar.f70644b = true;
        }
    }

    public void C(d dVar, i iVar, boolean z15) {
        if (iVar == null || !iVar.f70687p) {
            return;
        }
        float fJ = this.f70630e.j(iVar);
        this.f70627b += iVar.f70689r * fJ;
        this.f70630e.c(iVar, z15);
        if (z15) {
            iVar.j(this);
        }
        this.f70630e.h(dVar.f70657o.f70635d[iVar.f70688q], fJ, z15);
        if (d.f70638u && this.f70630e.f() == 0) {
            this.f70631f = true;
            dVar.f70644b = true;
        }
    }

    public void D(d dVar) {
        if (dVar.f70650h.length == 0) {
            return;
        }
        boolean z15 = false;
        while (!z15) {
            int iF = this.f70630e.f();
            for (int i15 = 0; i15 < iF; i15++) {
                i iVarA = this.f70630e.a(i15);
                if (iVarA.f70677d != -1 || iVarA.f70680g || iVarA.f70687p) {
                    this.f70629d.add(iVarA);
                }
            }
            int size = this.f70629d.size();
            if (size > 0) {
                for (int i16 = 0; i16 < size; i16++) {
                    i iVar = this.f70629d.get(i16);
                    if (iVar.f70680g) {
                        A(dVar, iVar, true);
                    } else if (iVar.f70687p) {
                        C(dVar, iVar, true);
                    } else {
                        B(dVar, dVar.f70650h[iVar.f70677d], true);
                    }
                }
                this.f70629d.clear();
            } else {
                z15 = true;
            }
        }
        if (d.f70638u && this.f70626a != null && this.f70630e.f() == 0) {
            this.f70631f = true;
            dVar.f70644b = true;
        }
    }

    @Override // g5.d.a
    public void a(d.a aVar) {
        if (aVar instanceof b) {
            b bVar = (b) aVar;
            this.f70626a = null;
            this.f70630e.clear();
            for (int i15 = 0; i15 < bVar.f70630e.f(); i15++) {
                this.f70630e.h(bVar.f70630e.a(i15), bVar.f70630e.g(i15), true);
            }
        }
    }

    @Override // g5.d.a
    public void b(i iVar) {
        int i15 = iVar.f70678e;
        float f15 = 1.0f;
        if (i15 != 1) {
            if (i15 == 2) {
                f15 = 1000.0f;
            } else if (i15 == 3) {
                f15 = 1000000.0f;
            } else if (i15 == 4) {
                f15 = 1.0E9f;
            } else if (i15 == 5) {
                f15 = 1.0E12f;
            }
        }
        this.f70630e.e(iVar, f15);
    }

    @Override // g5.d.a
    public i c(d dVar, boolean[] zArr) {
        return w(zArr, null);
    }

    @Override // g5.d.a
    public void clear() {
        this.f70630e.clear();
        this.f70626a = null;
        this.f70627b = 0.0f;
    }

    public b d(d dVar, int i15) {
        this.f70630e.e(dVar.o(i15, "ep"), 1.0f);
        this.f70630e.e(dVar.o(i15, "em"), -1.0f);
        return this;
    }

    b e(i iVar, int i15) {
        this.f70630e.e(iVar, i15);
        return this;
    }

    boolean f(d dVar) {
        boolean z15;
        i iVarG = g(dVar);
        if (iVarG == null) {
            z15 = true;
        } else {
            x(iVarG);
            z15 = false;
        }
        if (this.f70630e.f() == 0) {
            this.f70631f = true;
        }
        return z15;
    }

    i g(d dVar) {
        int iF = this.f70630e.f();
        i iVar = null;
        float f15 = 0.0f;
        float f16 = 0.0f;
        boolean z15 = false;
        boolean z16 = false;
        i iVar2 = null;
        for (int i15 = 0; i15 < iF; i15++) {
            float fG = this.f70630e.g(i15);
            i iVarA = this.f70630e.a(i15);
            if (iVarA.f70683k == i.a.UNRESTRICTED) {
                if (iVar == null || f15 > fG) {
                    boolean zU = u(iVarA, dVar);
                    z15 = zU;
                    f15 = fG;
                    iVar = iVarA;
                } else if (!z15 && u(iVarA, dVar)) {
                    f15 = fG;
                    iVar = iVarA;
                    z15 = true;
                }
            } else if (iVar == null && fG < 0.0f) {
                if (iVar2 == null || f16 > fG) {
                    boolean zU2 = u(iVarA, dVar);
                    z16 = zU2;
                    f16 = fG;
                    iVar2 = iVarA;
                } else if (!z16 && u(iVarA, dVar)) {
                    f16 = fG;
                    iVar2 = iVarA;
                    z16 = true;
                }
            }
        }
        return iVar != null ? iVar : iVar2;
    }

    @Override // g5.d.a
    public i getKey() {
        return this.f70626a;
    }

    b h(i iVar, i iVar2, int i15, float f15, i iVar3, i iVar4, int i16) {
        if (iVar2 == iVar3) {
            this.f70630e.e(iVar, 1.0f);
            this.f70630e.e(iVar4, 1.0f);
            this.f70630e.e(iVar2, -2.0f);
            return this;
        }
        if (f15 == 0.5f) {
            this.f70630e.e(iVar, 1.0f);
            this.f70630e.e(iVar2, -1.0f);
            this.f70630e.e(iVar3, -1.0f);
            this.f70630e.e(iVar4, 1.0f);
            if (i15 > 0 || i16 > 0) {
                this.f70627b = (-i15) + i16;
                return this;
            }
        } else {
            if (f15 <= 0.0f) {
                this.f70630e.e(iVar, -1.0f);
                this.f70630e.e(iVar2, 1.0f);
                this.f70627b = i15;
                return this;
            }
            if (f15 >= 1.0f) {
                this.f70630e.e(iVar4, -1.0f);
                this.f70630e.e(iVar3, 1.0f);
                this.f70627b = -i16;
                return this;
            }
            float f16 = 1.0f - f15;
            this.f70630e.e(iVar, f16 * 1.0f);
            this.f70630e.e(iVar2, f16 * (-1.0f));
            this.f70630e.e(iVar3, (-1.0f) * f15);
            this.f70630e.e(iVar4, 1.0f * f15);
            if (i15 > 0 || i16 > 0) {
                this.f70627b = ((-i15) * f16) + (i16 * f15);
                return this;
            }
        }
        return this;
    }

    b i(i iVar, int i15) {
        this.f70626a = iVar;
        float f15 = i15;
        iVar.f70679f = f15;
        this.f70627b = f15;
        this.f70631f = true;
        return this;
    }

    @Override // g5.d.a
    public boolean isEmpty() {
        return this.f70626a == null && this.f70627b == 0.0f && this.f70630e.f() == 0;
    }

    b j(i iVar, i iVar2, float f15) {
        this.f70630e.e(iVar, -1.0f);
        this.f70630e.e(iVar2, f15);
        return this;
    }

    public b k(i iVar, i iVar2, i iVar3, i iVar4, float f15) {
        this.f70630e.e(iVar, -1.0f);
        this.f70630e.e(iVar2, 1.0f);
        this.f70630e.e(iVar3, f15);
        this.f70630e.e(iVar4, -f15);
        return this;
    }

    public b l(float f15, float f16, float f17, i iVar, i iVar2, i iVar3, i iVar4) {
        this.f70627b = 0.0f;
        if (f16 == 0.0f || f15 == f17) {
            this.f70630e.e(iVar, 1.0f);
            this.f70630e.e(iVar2, -1.0f);
            this.f70630e.e(iVar4, 1.0f);
            this.f70630e.e(iVar3, -1.0f);
            return this;
        }
        if (f15 == 0.0f) {
            this.f70630e.e(iVar, 1.0f);
            this.f70630e.e(iVar2, -1.0f);
            return this;
        }
        if (f17 == 0.0f) {
            this.f70630e.e(iVar3, 1.0f);
            this.f70630e.e(iVar4, -1.0f);
            return this;
        }
        float f18 = (f15 / f16) / (f17 / f16);
        this.f70630e.e(iVar, 1.0f);
        this.f70630e.e(iVar2, -1.0f);
        this.f70630e.e(iVar4, f18);
        this.f70630e.e(iVar3, -f18);
        return this;
    }

    public b m(i iVar, int i15) {
        if (i15 < 0) {
            this.f70627b = i15 * (-1);
            this.f70630e.e(iVar, 1.0f);
            return this;
        }
        this.f70627b = i15;
        this.f70630e.e(iVar, -1.0f);
        return this;
    }

    public b n(i iVar, i iVar2, int i15) {
        boolean z15 = false;
        if (i15 != 0) {
            if (i15 < 0) {
                i15 *= -1;
                z15 = true;
            }
            this.f70627b = i15;
        }
        if (z15) {
            this.f70630e.e(iVar, 1.0f);
            this.f70630e.e(iVar2, -1.0f);
            return this;
        }
        this.f70630e.e(iVar, -1.0f);
        this.f70630e.e(iVar2, 1.0f);
        return this;
    }

    public b o(i iVar, i iVar2, i iVar3, int i15) {
        boolean z15 = false;
        if (i15 != 0) {
            if (i15 < 0) {
                i15 *= -1;
                z15 = true;
            }
            this.f70627b = i15;
        }
        if (z15) {
            this.f70630e.e(iVar, 1.0f);
            this.f70630e.e(iVar2, -1.0f);
            this.f70630e.e(iVar3, -1.0f);
            return this;
        }
        this.f70630e.e(iVar, -1.0f);
        this.f70630e.e(iVar2, 1.0f);
        this.f70630e.e(iVar3, 1.0f);
        return this;
    }

    public b p(i iVar, i iVar2, i iVar3, int i15) {
        boolean z15 = false;
        if (i15 != 0) {
            if (i15 < 0) {
                i15 *= -1;
                z15 = true;
            }
            this.f70627b = i15;
        }
        if (z15) {
            this.f70630e.e(iVar, 1.0f);
            this.f70630e.e(iVar2, -1.0f);
            this.f70630e.e(iVar3, 1.0f);
            return this;
        }
        this.f70630e.e(iVar, -1.0f);
        this.f70630e.e(iVar2, 1.0f);
        this.f70630e.e(iVar3, -1.0f);
        return this;
    }

    public b q(i iVar, i iVar2, i iVar3, i iVar4, float f15) {
        this.f70630e.e(iVar3, 0.5f);
        this.f70630e.e(iVar4, 0.5f);
        this.f70630e.e(iVar, -0.5f);
        this.f70630e.e(iVar2, -0.5f);
        this.f70627b = -f15;
        return this;
    }

    void r() {
        float f15 = this.f70627b;
        if (f15 < 0.0f) {
            this.f70627b = f15 * (-1.0f);
            this.f70630e.b();
        }
    }

    boolean s() {
        i iVar = this.f70626a;
        if (iVar != null) {
            return iVar.f70683k == i.a.UNRESTRICTED || this.f70627b >= 0.0f;
        }
        return false;
    }

    boolean t(i iVar) {
        return this.f70630e.d(iVar);
    }

    public String toString() {
        return z();
    }

    public i v(i iVar) {
        return w(null, iVar);
    }

    void x(i iVar) {
        i iVar2 = this.f70626a;
        if (iVar2 != null) {
            this.f70630e.e(iVar2, -1.0f);
            this.f70626a.f70677d = -1;
            this.f70626a = null;
        }
        float fC = this.f70630e.c(iVar, true) * (-1.0f);
        this.f70626a = iVar;
        if (fC == 1.0f) {
            return;
        }
        this.f70627b /= fC;
        this.f70630e.k(fC);
    }

    public void y() {
        this.f70626a = null;
        this.f70630e.clear();
        this.f70627b = 0.0f;
        this.f70631f = false;
    }

    String z() {
        boolean z15;
        String str = (this.f70626a == null ? "" + com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.f37012h1 : "" + this.f70626a) + " = ";
        if (this.f70627b != 0.0f) {
            str = str + this.f70627b;
            z15 = true;
        } else {
            z15 = false;
        }
        int iF = this.f70630e.f();
        for (int i15 = 0; i15 < iF; i15++) {
            i iVarA = this.f70630e.a(i15);
            if (iVarA != null) {
                float fG = this.f70630e.g(i15);
                if (fG != 0.0f) {
                    String string = iVarA.toString();
                    if (z15) {
                        if (fG > 0.0f) {
                            str = str + " + ";
                        } else {
                            str = str + " - ";
                            fG *= -1.0f;
                        }
                    } else if (fG < 0.0f) {
                        str = str + "- ";
                        fG *= -1.0f;
                    }
                    str = fG == 1.0f ? str + string : str + fG + " " + string;
                    z15 = true;
                }
            }
        }
        if (z15) {
            return str;
        }
        return str + "0.0";
    }

    public b(c cVar) {
        this.f70630e = new g5.a(this, cVar);
    }
}
