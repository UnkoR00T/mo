package in;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a f93499a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f93500b;

    b(a aVar, int[] iArr) {
        if (iArr.length == 0) {
            throw new IllegalArgumentException();
        }
        this.f93499a = aVar;
        int length = iArr.length;
        int i15 = 1;
        if (length <= 1 || iArr[0] != 0) {
            this.f93500b = iArr;
            return;
        }
        while (i15 < length && iArr[i15] == 0) {
            i15++;
        }
        if (i15 == length) {
            this.f93500b = new int[]{0};
            return;
        }
        int[] iArr2 = new int[length - i15];
        this.f93500b = iArr2;
        System.arraycopy(iArr, i15, iArr2, 0, iArr2.length);
    }

    b a(b bVar) {
        if (!this.f93499a.equals(bVar.f93499a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f()) {
            return bVar;
        }
        if (bVar.f()) {
            return this;
        }
        int[] iArr = this.f93500b;
        int[] iArr2 = bVar.f93500b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i15 = length; i15 < iArr.length; i15++) {
            iArr3[i15] = a.a(iArr2[i15 - length], iArr[i15]);
        }
        return new b(this.f93499a, iArr3);
    }

    b[] b(b bVar) {
        if (!this.f93499a.equals(bVar.f93499a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.f()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b bVarE = this.f93499a.e();
        int iF = this.f93499a.f(bVar.c(bVar.e()));
        b bVarA = this;
        while (bVarA.e() >= bVar.e() && !bVarA.f()) {
            int iE = bVarA.e() - bVar.e();
            int iH = this.f93499a.h(bVarA.c(bVarA.e()), iF);
            b bVarH = bVar.h(iE, iH);
            bVarE = bVarE.a(this.f93499a.b(iE, iH));
            bVarA = bVarA.a(bVarH);
        }
        return new b[]{bVarE, bVarA};
    }

    int c(int i15) {
        int[] iArr = this.f93500b;
        return iArr[(iArr.length - 1) - i15];
    }

    int[] d() {
        return this.f93500b;
    }

    int e() {
        return this.f93500b.length - 1;
    }

    boolean f() {
        return this.f93500b[0] == 0;
    }

    b g(b bVar) {
        if (!this.f93499a.equals(bVar.f93499a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (f() || bVar.f()) {
            return this.f93499a.e();
        }
        int[] iArr = this.f93500b;
        int length = iArr.length;
        int[] iArr2 = bVar.f93500b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i15 = 0; i15 < length; i15++) {
            int i16 = iArr[i15];
            for (int i17 = 0; i17 < length2; i17++) {
                int i18 = i15 + i17;
                iArr3[i18] = a.a(iArr3[i18], this.f93499a.h(i16, iArr2[i17]));
            }
        }
        return new b(this.f93499a, iArr3);
    }

    b h(int i15, int i16) {
        if (i15 < 0) {
            throw new IllegalArgumentException();
        }
        if (i16 == 0) {
            return this.f93499a.e();
        }
        int length = this.f93500b.length;
        int[] iArr = new int[i15 + length];
        for (int i17 = 0; i17 < length; i17++) {
            iArr[i17] = this.f93499a.h(this.f93500b[i17], i16);
        }
        return new b(this.f93499a, iArr);
    }

    public String toString() {
        if (f()) {
            return d.f37012h1;
        }
        StringBuilder sb5 = new StringBuilder(e() * 8);
        for (int iE = e(); iE >= 0; iE--) {
            int iC = c(iE);
            if (iC != 0) {
                if (iC < 0) {
                    if (iE == e()) {
                        sb5.append("-");
                    } else {
                        sb5.append(" - ");
                    }
                    iC = -iC;
                } else if (sb5.length() > 0) {
                    sb5.append(" + ");
                }
                if (iE == 0 || iC != 1) {
                    int iG = this.f93499a.g(iC);
                    if (iG == 0) {
                        sb5.append('1');
                    } else if (iG == 1) {
                        sb5.append('a');
                    } else {
                        sb5.append("a^");
                        sb5.append(iG);
                    }
                }
                if (iE != 0) {
                    if (iE == 1) {
                        sb5.append('x');
                    } else {
                        sb5.append("x^");
                        sb5.append(iE);
                    }
                }
            }
        }
        return sb5.toString();
    }
}
