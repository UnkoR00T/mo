package g5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class j implements b.a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static float f70697n = 0.001f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f70698a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f70699b = 16;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f70700c = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f70701d = new int[16];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int[] f70702e = new int[16];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int[] f70703f = new int[16];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float[] f70704g = new float[16];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    int[] f70705h = new int[16];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int[] f70706i = new int[16];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int f70707j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    int f70708k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final b f70709l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected final c f70710m;

    j(b bVar, c cVar) {
        this.f70709l = bVar;
        this.f70710m = cVar;
        clear();
    }

    private void l(i iVar, int i15) {
        int[] iArr;
        int i16 = iVar.f70676c % this.f70700c;
        int[] iArr2 = this.f70701d;
        int i17 = iArr2[i16];
        if (i17 == -1) {
            iArr2[i16] = i15;
        } else {
            while (true) {
                iArr = this.f70702e;
                int i18 = iArr[i17];
                if (i18 == -1) {
                    break;
                } else {
                    i17 = i18;
                }
            }
            iArr[i17] = i15;
        }
        this.f70702e[i15] = -1;
    }

    private void m(int i15, i iVar, float f15) {
        this.f70703f[i15] = iVar.f70676c;
        this.f70704g[i15] = f15;
        this.f70705h[i15] = -1;
        this.f70706i[i15] = -1;
        iVar.b(this.f70709l);
        iVar.f70686n++;
        this.f70707j++;
    }

    private int n() {
        for (int i15 = 0; i15 < this.f70699b; i15++) {
            if (this.f70703f[i15] == -1) {
                return i15;
            }
        }
        return -1;
    }

    private void o() {
        int i15 = this.f70699b * 2;
        this.f70703f = Arrays.copyOf(this.f70703f, i15);
        this.f70704g = Arrays.copyOf(this.f70704g, i15);
        this.f70705h = Arrays.copyOf(this.f70705h, i15);
        this.f70706i = Arrays.copyOf(this.f70706i, i15);
        this.f70702e = Arrays.copyOf(this.f70702e, i15);
        for (int i16 = this.f70699b; i16 < i15; i16++) {
            this.f70703f[i16] = -1;
            this.f70702e[i16] = -1;
        }
        this.f70699b = i15;
    }

    private void q(int i15, i iVar, float f15) {
        int iN = n();
        m(iN, iVar, f15);
        if (i15 != -1) {
            this.f70705h[iN] = i15;
            int[] iArr = this.f70706i;
            iArr[iN] = iArr[i15];
            iArr[i15] = iN;
        } else {
            this.f70705h[iN] = -1;
            if (this.f70707j > 0) {
                this.f70706i[iN] = this.f70708k;
                this.f70708k = iN;
            } else {
                this.f70706i[iN] = -1;
            }
        }
        int i16 = this.f70706i[iN];
        if (i16 != -1) {
            this.f70705h[i16] = iN;
        }
        l(iVar, iN);
    }

    private void r(i iVar) {
        int[] iArr;
        int i15;
        int i16 = iVar.f70676c;
        int i17 = i16 % this.f70700c;
        int[] iArr2 = this.f70701d;
        int i18 = iArr2[i17];
        if (i18 == -1) {
            return;
        }
        if (this.f70703f[i18] == i16) {
            int[] iArr3 = this.f70702e;
            iArr2[i17] = iArr3[i18];
            iArr3[i18] = -1;
            return;
        }
        while (true) {
            iArr = this.f70702e;
            i15 = iArr[i18];
            if (i15 == -1 || this.f70703f[i15] == i16) {
                break;
            } else {
                i18 = i15;
            }
        }
        if (i15 == -1 || this.f70703f[i15] != i16) {
            return;
        }
        iArr[i18] = iArr[i15];
        iArr[i15] = -1;
    }

    @Override // g5.b.a
    public i a(int i15) {
        int i16 = this.f70707j;
        if (i16 == 0) {
            return null;
        }
        int i17 = this.f70708k;
        for (int i18 = 0; i18 < i16; i18++) {
            if (i18 == i15 && i17 != -1) {
                return this.f70710m.f70635d[this.f70703f[i17]];
            }
            i17 = this.f70706i[i17];
            if (i17 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // g5.b.a
    public void b() {
        int i15 = this.f70707j;
        int i16 = this.f70708k;
        for (int i17 = 0; i17 < i15; i17++) {
            float[] fArr = this.f70704g;
            fArr[i16] = fArr[i16] * (-1.0f);
            i16 = this.f70706i[i16];
            if (i16 == -1) {
                return;
            }
        }
    }

    @Override // g5.b.a
    public float c(i iVar, boolean z15) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f15 = this.f70704g[iP];
        if (this.f70708k == iP) {
            this.f70708k = this.f70706i[iP];
        }
        this.f70703f[iP] = -1;
        int[] iArr = this.f70705h;
        int i15 = iArr[iP];
        if (i15 != -1) {
            int[] iArr2 = this.f70706i;
            iArr2[i15] = iArr2[iP];
        }
        int i16 = this.f70706i[iP];
        if (i16 != -1) {
            iArr[i16] = iArr[iP];
        }
        this.f70707j--;
        iVar.f70686n--;
        if (z15) {
            iVar.j(this.f70709l);
        }
        return f15;
    }

    @Override // g5.b.a
    public void clear() {
        int i15 = this.f70707j;
        for (int i16 = 0; i16 < i15; i16++) {
            i iVarA = a(i16);
            if (iVarA != null) {
                iVarA.j(this.f70709l);
            }
        }
        for (int i17 = 0; i17 < this.f70699b; i17++) {
            this.f70703f[i17] = -1;
            this.f70702e[i17] = -1;
        }
        for (int i18 = 0; i18 < this.f70700c; i18++) {
            this.f70701d[i18] = -1;
        }
        this.f70707j = 0;
        this.f70708k = -1;
    }

    @Override // g5.b.a
    public boolean d(i iVar) {
        return p(iVar) != -1;
    }

    @Override // g5.b.a
    public void e(i iVar, float f15) {
        float f16 = f70697n;
        if (f15 > (-f16) && f15 < f16) {
            c(iVar, true);
            return;
        }
        if (this.f70707j == 0) {
            m(0, iVar, f15);
            l(iVar, 0);
            this.f70708k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f70704g[iP] = f15;
            return;
        }
        if (this.f70707j + 1 >= this.f70699b) {
            o();
        }
        int i15 = this.f70707j;
        int i16 = this.f70708k;
        int i17 = -1;
        for (int i18 = 0; i18 < i15; i18++) {
            int i19 = this.f70703f[i16];
            int i25 = iVar.f70676c;
            if (i19 == i25) {
                this.f70704g[i16] = f15;
                return;
            }
            if (i19 < i25) {
                i17 = i16;
            }
            i16 = this.f70706i[i16];
            if (i16 == -1) {
                break;
            }
        }
        q(i17, iVar, f15);
    }

    @Override // g5.b.a
    public int f() {
        return this.f70707j;
    }

    @Override // g5.b.a
    public float g(int i15) {
        int i16 = this.f70707j;
        int i17 = this.f70708k;
        for (int i18 = 0; i18 < i16; i18++) {
            if (i18 == i15) {
                return this.f70704g[i17];
            }
            i17 = this.f70706i[i17];
            if (i17 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // g5.b.a
    public void h(i iVar, float f15, boolean z15) {
        float f16 = f70697n;
        if (f15 <= (-f16) || f15 >= f16) {
            int iP = p(iVar);
            if (iP == -1) {
                e(iVar, f15);
                return;
            }
            float[] fArr = this.f70704g;
            float f17 = fArr[iP] + f15;
            fArr[iP] = f17;
            float f18 = f70697n;
            if (f17 <= (-f18) || f17 >= f18) {
                return;
            }
            fArr[iP] = 0.0f;
            c(iVar, z15);
        }
    }

    @Override // g5.b.a
    public float i(b bVar, boolean z15) {
        float fJ = j(bVar.f70626a);
        c(bVar.f70626a, z15);
        j jVar = (j) bVar.f70630e;
        int iF = jVar.f();
        int i15 = 0;
        int i16 = 0;
        while (i15 < iF) {
            int i17 = jVar.f70703f[i16];
            if (i17 != -1) {
                h(this.f70710m.f70635d[i17], jVar.f70704g[i16] * fJ, z15);
                i15++;
            }
            i16++;
        }
        return fJ;
    }

    @Override // g5.b.a
    public float j(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f70704g[iP];
        }
        return 0.0f;
    }

    @Override // g5.b.a
    public void k(float f15) {
        int i15 = this.f70707j;
        int i16 = this.f70708k;
        for (int i17 = 0; i17 < i15; i17++) {
            float[] fArr = this.f70704g;
            fArr[i16] = fArr[i16] / f15;
            i16 = this.f70706i[i16];
            if (i16 == -1) {
                return;
            }
        }
    }

    public int p(i iVar) {
        if (this.f70707j != 0 && iVar != null) {
            int i15 = iVar.f70676c;
            int i16 = this.f70701d[i15 % this.f70700c];
            if (i16 == -1) {
                return -1;
            }
            if (this.f70703f[i16] == i15) {
                return i16;
            }
            do {
                i16 = this.f70702e[i16];
                if (i16 == -1) {
                    break;
                }
            } while (this.f70703f[i16] != i15);
            if (i16 != -1 && this.f70703f[i16] == i15) {
                return i16;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i15 = this.f70707j;
        for (int i16 = 0; i16 < i15; i16++) {
            i iVarA = a(i16);
            if (iVarA != null) {
                String str2 = str + iVarA + " = " + g(i16) + " ";
                int iP = p(iVarA);
                String str3 = str2 + "[p: ";
                String str4 = (this.f70705h[iP] != -1 ? str3 + this.f70710m.f70635d[this.f70703f[this.f70705h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f70706i[iP] != -1 ? str4 + this.f70710m.f70635d[this.f70703f[this.f70706i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }
}
