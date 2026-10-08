package g5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class a implements b.a {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static float f70614l = 0.001f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f70616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final c f70617c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f70615a = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f70618d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private i f70619e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int[] f70620f = new int[8];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int[] f70621g = new int[8];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float[] f70622h = new float[8];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f70623i = -1;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f70624j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f70625k = false;

    a(b bVar, c cVar) {
        this.f70616b = bVar;
        this.f70617c = cVar;
    }

    @Override // g5.b.a
    public i a(int i15) {
        int i16 = this.f70623i;
        for (int i17 = 0; i16 != -1 && i17 < this.f70615a; i17++) {
            if (i17 == i15) {
                return this.f70617c.f70635d[this.f70620f[i16]];
            }
            i16 = this.f70621g[i16];
        }
        return null;
    }

    @Override // g5.b.a
    public void b() {
        int i15 = this.f70623i;
        for (int i16 = 0; i15 != -1 && i16 < this.f70615a; i16++) {
            float[] fArr = this.f70622h;
            fArr[i15] = fArr[i15] * (-1.0f);
            i15 = this.f70621g[i15];
        }
    }

    @Override // g5.b.a
    public final float c(i iVar, boolean z15) {
        if (this.f70619e == iVar) {
            this.f70619e = null;
        }
        int i15 = this.f70623i;
        if (i15 == -1) {
            return 0.0f;
        }
        int i16 = 0;
        int i17 = -1;
        while (i15 != -1 && i16 < this.f70615a) {
            if (this.f70620f[i15] == iVar.f70676c) {
                if (i15 == this.f70623i) {
                    this.f70623i = this.f70621g[i15];
                } else {
                    int[] iArr = this.f70621g;
                    iArr[i17] = iArr[i15];
                }
                if (z15) {
                    iVar.j(this.f70616b);
                }
                iVar.f70686n--;
                this.f70615a--;
                this.f70620f[i15] = -1;
                if (this.f70625k) {
                    this.f70624j = i15;
                }
                return this.f70622h[i15];
            }
            i16++;
            i17 = i15;
            i15 = this.f70621g[i15];
        }
        return 0.0f;
    }

    @Override // g5.b.a
    public final void clear() {
        int i15 = this.f70623i;
        for (int i16 = 0; i15 != -1 && i16 < this.f70615a; i16++) {
            i iVar = this.f70617c.f70635d[this.f70620f[i15]];
            if (iVar != null) {
                iVar.j(this.f70616b);
            }
            i15 = this.f70621g[i15];
        }
        this.f70623i = -1;
        this.f70624j = -1;
        this.f70625k = false;
        this.f70615a = 0;
    }

    @Override // g5.b.a
    public boolean d(i iVar) {
        int i15 = this.f70623i;
        if (i15 == -1) {
            return false;
        }
        for (int i16 = 0; i15 != -1 && i16 < this.f70615a; i16++) {
            if (this.f70620f[i15] == iVar.f70676c) {
                return true;
            }
            i15 = this.f70621g[i15];
        }
        return false;
    }

    @Override // g5.b.a
    public final void e(i iVar, float f15) {
        if (f15 == 0.0f) {
            c(iVar, true);
            return;
        }
        int i15 = this.f70623i;
        if (i15 == -1) {
            this.f70623i = 0;
            this.f70622h[0] = f15;
            this.f70620f[0] = iVar.f70676c;
            this.f70621g[0] = -1;
            iVar.f70686n++;
            iVar.b(this.f70616b);
            this.f70615a++;
            if (this.f70625k) {
                return;
            }
            int i16 = this.f70624j + 1;
            this.f70624j = i16;
            int[] iArr = this.f70620f;
            if (i16 >= iArr.length) {
                this.f70625k = true;
                this.f70624j = iArr.length - 1;
                return;
            }
            return;
        }
        int i17 = -1;
        for (int i18 = 0; i15 != -1 && i18 < this.f70615a; i18++) {
            int i19 = this.f70620f[i15];
            int i25 = iVar.f70676c;
            if (i19 == i25) {
                this.f70622h[i15] = f15;
                return;
            }
            if (i19 < i25) {
                i17 = i15;
            }
            i15 = this.f70621g[i15];
        }
        int length = this.f70624j;
        int i26 = length + 1;
        if (this.f70625k) {
            int[] iArr2 = this.f70620f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i26;
        }
        int[] iArr3 = this.f70620f;
        if (length >= iArr3.length && this.f70615a < iArr3.length) {
            int i27 = 0;
            while (true) {
                int[] iArr4 = this.f70620f;
                if (i27 >= iArr4.length) {
                    break;
                }
                if (iArr4[i27] == -1) {
                    length = i27;
                    break;
                }
                i27++;
            }
        }
        int[] iArr5 = this.f70620f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i28 = this.f70618d * 2;
            this.f70618d = i28;
            this.f70625k = false;
            this.f70624j = length - 1;
            this.f70622h = Arrays.copyOf(this.f70622h, i28);
            this.f70620f = Arrays.copyOf(this.f70620f, this.f70618d);
            this.f70621g = Arrays.copyOf(this.f70621g, this.f70618d);
        }
        this.f70620f[length] = iVar.f70676c;
        this.f70622h[length] = f15;
        if (i17 != -1) {
            int[] iArr6 = this.f70621g;
            iArr6[length] = iArr6[i17];
            iArr6[i17] = length;
        } else {
            this.f70621g[length] = this.f70623i;
            this.f70623i = length;
        }
        iVar.f70686n++;
        iVar.b(this.f70616b);
        int i29 = this.f70615a + 1;
        this.f70615a = i29;
        if (!this.f70625k) {
            this.f70624j++;
        }
        int[] iArr7 = this.f70620f;
        if (i29 >= iArr7.length) {
            this.f70625k = true;
        }
        if (this.f70624j >= iArr7.length) {
            this.f70625k = true;
            this.f70624j = iArr7.length - 1;
        }
    }

    @Override // g5.b.a
    public int f() {
        return this.f70615a;
    }

    @Override // g5.b.a
    public float g(int i15) {
        int i16 = this.f70623i;
        for (int i17 = 0; i16 != -1 && i17 < this.f70615a; i17++) {
            if (i17 == i15) {
                return this.f70622h[i16];
            }
            i16 = this.f70621g[i16];
        }
        return 0.0f;
    }

    @Override // g5.b.a
    public void h(i iVar, float f15, boolean z15) {
        float f16 = f70614l;
        if (f15 <= (-f16) || f15 >= f16) {
            int i15 = this.f70623i;
            if (i15 == -1) {
                this.f70623i = 0;
                this.f70622h[0] = f15;
                this.f70620f[0] = iVar.f70676c;
                this.f70621g[0] = -1;
                iVar.f70686n++;
                iVar.b(this.f70616b);
                this.f70615a++;
                if (this.f70625k) {
                    return;
                }
                int i16 = this.f70624j + 1;
                this.f70624j = i16;
                int[] iArr = this.f70620f;
                if (i16 >= iArr.length) {
                    this.f70625k = true;
                    this.f70624j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i17 = -1;
            for (int i18 = 0; i15 != -1 && i18 < this.f70615a; i18++) {
                int i19 = this.f70620f[i15];
                int i25 = iVar.f70676c;
                if (i19 == i25) {
                    float[] fArr = this.f70622h;
                    float f17 = fArr[i15] + f15;
                    float f18 = f70614l;
                    if (f17 > (-f18) && f17 < f18) {
                        f17 = 0.0f;
                    }
                    fArr[i15] = f17;
                    if (f17 == 0.0f) {
                        if (i15 == this.f70623i) {
                            this.f70623i = this.f70621g[i15];
                        } else {
                            int[] iArr2 = this.f70621g;
                            iArr2[i17] = iArr2[i15];
                        }
                        if (z15) {
                            iVar.j(this.f70616b);
                        }
                        if (this.f70625k) {
                            this.f70624j = i15;
                        }
                        iVar.f70686n--;
                        this.f70615a--;
                        return;
                    }
                    return;
                }
                if (i19 < i25) {
                    i17 = i15;
                }
                i15 = this.f70621g[i15];
            }
            int length = this.f70624j;
            int i26 = length + 1;
            if (this.f70625k) {
                int[] iArr3 = this.f70620f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i26;
            }
            int[] iArr4 = this.f70620f;
            if (length >= iArr4.length && this.f70615a < iArr4.length) {
                int i27 = 0;
                while (true) {
                    int[] iArr5 = this.f70620f;
                    if (i27 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i27] == -1) {
                        length = i27;
                        break;
                    }
                    i27++;
                }
            }
            int[] iArr6 = this.f70620f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i28 = this.f70618d * 2;
                this.f70618d = i28;
                this.f70625k = false;
                this.f70624j = length - 1;
                this.f70622h = Arrays.copyOf(this.f70622h, i28);
                this.f70620f = Arrays.copyOf(this.f70620f, this.f70618d);
                this.f70621g = Arrays.copyOf(this.f70621g, this.f70618d);
            }
            this.f70620f[length] = iVar.f70676c;
            this.f70622h[length] = f15;
            if (i17 != -1) {
                int[] iArr7 = this.f70621g;
                iArr7[length] = iArr7[i17];
                iArr7[i17] = length;
            } else {
                this.f70621g[length] = this.f70623i;
                this.f70623i = length;
            }
            iVar.f70686n++;
            iVar.b(this.f70616b);
            this.f70615a++;
            if (!this.f70625k) {
                this.f70624j++;
            }
            int i29 = this.f70624j;
            int[] iArr8 = this.f70620f;
            if (i29 >= iArr8.length) {
                this.f70625k = true;
                this.f70624j = iArr8.length - 1;
            }
        }
    }

    @Override // g5.b.a
    public float i(b bVar, boolean z15) {
        float fJ = j(bVar.f70626a);
        c(bVar.f70626a, z15);
        b.a aVar = bVar.f70630e;
        int iF = aVar.f();
        for (int i15 = 0; i15 < iF; i15++) {
            i iVarA = aVar.a(i15);
            h(iVarA, aVar.j(iVarA) * fJ, z15);
        }
        return fJ;
    }

    @Override // g5.b.a
    public final float j(i iVar) {
        int i15 = this.f70623i;
        for (int i16 = 0; i15 != -1 && i16 < this.f70615a; i16++) {
            if (this.f70620f[i15] == iVar.f70676c) {
                return this.f70622h[i15];
            }
            i15 = this.f70621g[i15];
        }
        return 0.0f;
    }

    @Override // g5.b.a
    public void k(float f15) {
        int i15 = this.f70623i;
        for (int i16 = 0; i15 != -1 && i16 < this.f70615a; i16++) {
            float[] fArr = this.f70622h;
            fArr[i15] = fArr[i15] / f15;
            i15 = this.f70621g[i15];
        }
    }

    public String toString() {
        int i15 = this.f70623i;
        String str = "";
        for (int i16 = 0; i15 != -1 && i16 < this.f70615a; i16++) {
            str = ((str + " -> ") + this.f70622h[i15] + " : ") + this.f70617c.f70635d[this.f70620f[i15]];
            i15 = this.f70621g[i15];
        }
        return str;
    }
}
