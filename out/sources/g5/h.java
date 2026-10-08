package g5;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class h extends g5.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f70663g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private i[] f70664h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private i[] f70665i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f70666j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    b f70667k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    c f70668l;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f70676c - iVar2.f70676c;
        }
    }

    class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        i f70670a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        h f70671b;

        b(h hVar) {
            this.f70671b = hVar;
        }

        public boolean a(i iVar, float f15) {
            boolean z15 = true;
            if (!this.f70670a.f70674a) {
                for (int i15 = 0; i15 < 9; i15++) {
                    float f16 = iVar.f70682j[i15];
                    if (f16 != 0.0f) {
                        float f17 = f16 * f15;
                        if (Math.abs(f17) < 1.0E-4f) {
                            f17 = 0.0f;
                        }
                        this.f70670a.f70682j[i15] = f17;
                    } else {
                        this.f70670a.f70682j[i15] = 0.0f;
                    }
                }
                return true;
            }
            for (int i16 = 0; i16 < 9; i16++) {
                float[] fArr = this.f70670a.f70682j;
                float f18 = fArr[i16] + (iVar.f70682j[i16] * f15);
                fArr[i16] = f18;
                if (Math.abs(f18) < 1.0E-4f) {
                    this.f70670a.f70682j[i16] = 0.0f;
                } else {
                    z15 = false;
                }
            }
            if (z15) {
                h.this.G(this.f70670a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f70670a = iVar;
        }

        public final boolean c() {
            for (int i15 = 8; i15 >= 0; i15--) {
                float f15 = this.f70670a.f70682j[i15];
                if (f15 > 0.0f) {
                    return false;
                }
                if (f15 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            for (int i15 = 8; i15 >= 0; i15--) {
                float f15 = iVar.f70682j[i15];
                float f16 = this.f70670a.f70682j[i15];
                if (f16 != f15) {
                    if (f16 < f15) {
                        return true;
                    }
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f70670a.f70682j, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f70670a != null) {
                for (int i15 = 0; i15 < 9; i15++) {
                    str = str + this.f70670a.f70682j[i15] + " ";
                }
            }
            return str + "] " + this.f70670a;
        }
    }

    public h(c cVar) {
        super(cVar);
        this.f70663g = 128;
        this.f70664h = new i[128];
        this.f70665i = new i[128];
        this.f70666j = 0;
        this.f70667k = new b(this);
        this.f70668l = cVar;
    }

    private void F(i iVar) {
        int i15;
        int i16 = this.f70666j + 1;
        i[] iVarArr = this.f70664h;
        if (i16 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f70664h = iVarArr2;
            this.f70665i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f70664h;
        int i17 = this.f70666j;
        iVarArr3[i17] = iVar;
        int i18 = i17 + 1;
        this.f70666j = i18;
        if (i18 > 1 && iVarArr3[i17].f70676c > iVar.f70676c) {
            int i19 = 0;
            while (true) {
                i15 = this.f70666j;
                if (i19 >= i15) {
                    break;
                }
                this.f70665i[i19] = this.f70664h[i19];
                i19++;
            }
            Arrays.sort(this.f70665i, 0, i15, new a());
            for (int i25 = 0; i25 < this.f70666j; i25++) {
                this.f70664h[i25] = this.f70665i[i25];
            }
        }
        iVar.f70674a = true;
        iVar.b(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void G(i iVar) {
        int i15 = 0;
        while (i15 < this.f70666j) {
            if (this.f70664h[i15] == iVar) {
                while (true) {
                    int i16 = this.f70666j;
                    if (i15 >= i16 - 1) {
                        this.f70666j = i16 - 1;
                        iVar.f70674a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f70664h;
                        int i17 = i15 + 1;
                        iVarArr[i15] = iVarArr[i17];
                        i15 = i17;
                    }
                }
            } else {
                i15++;
            }
        }
    }

    @Override // g5.b
    public void B(d dVar, g5.b bVar, boolean z15) {
        i iVar = bVar.f70626a;
        if (iVar == null) {
            return;
        }
        g5.b.a aVar = bVar.f70630e;
        int iF = aVar.f();
        for (int i15 = 0; i15 < iF; i15++) {
            i iVarA = aVar.a(i15);
            float fG = aVar.g(i15);
            this.f70667k.b(iVarA);
            if (this.f70667k.a(iVar, fG)) {
                F(iVarA);
            }
            this.f70627b += bVar.f70627b * fG;
        }
        G(iVar);
    }

    @Override // g5.b, g5.d.a
    public void b(i iVar) {
        this.f70667k.b(iVar);
        this.f70667k.e();
        iVar.f70682j[iVar.f70678e] = 1.0f;
        F(iVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002e  */
    @Override // g5.b, g5.d.a
    public i c(d dVar, boolean[] zArr) {
        int i15 = -1;
        for (int i16 = 0; i16 < this.f70666j; i16++) {
            i iVar = this.f70664h[i16];
            if (!zArr[iVar.f70676c]) {
                this.f70667k.b(iVar);
                if (i15 == -1) {
                    if (this.f70667k.c()) {
                        i15 = i16;
                    }
                } else if (this.f70667k.d(this.f70664h[i15])) {
                    i15 = i16;
                }
            }
        }
        if (i15 == -1) {
            return null;
        }
        return this.f70664h[i15];
    }

    @Override // g5.b, g5.d.a
    public void clear() {
        this.f70666j = 0;
        this.f70627b = 0.0f;
    }

    @Override // g5.b, g5.d.a
    public boolean isEmpty() {
        return this.f70666j == 0;
    }

    @Override // g5.b
    public String toString() {
        String str = " goal -> (" + this.f70627b + ") : ";
        for (int i15 = 0; i15 < this.f70666j; i15++) {
            this.f70667k.b(this.f70664h[i15]);
            str = str + this.f70667k + " ";
        }
        return str;
    }
}
