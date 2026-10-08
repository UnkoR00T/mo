package so;

import android.graphics.Path;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private l f182683a;

    m(l lVar) {
        this.f182683a = lVar;
    }

    private Path a(a[] aVarArr) {
        Path path = new Path();
        int length = aVarArr.length;
        int i15 = 0;
        for (int i16 = 0; i16 < length; i16++) {
            if (aVarArr[i16].f182687d) {
                a aVar = aVarArr[i15];
                a aVar2 = aVarArr[i16];
                ArrayList arrayList = new ArrayList();
                for (int i17 = i15; i17 <= i16; i17++) {
                    arrayList.add(aVarArr[i17]);
                }
                if (aVarArr[i15].f182686c) {
                    arrayList.add(aVar);
                } else if (aVarArr[i16].f182686c) {
                    arrayList.add(0, aVar2);
                } else {
                    a aVarF = f(aVar, aVar2);
                    arrayList.add(0, aVarF);
                    arrayList.add(aVarF);
                }
                g(path, (a) arrayList.get(0));
                int size = arrayList.size();
                int i18 = 1;
                while (i18 < size) {
                    a aVar3 = (a) arrayList.get(i18);
                    if (aVar3.f182686c) {
                        d(path, aVar3);
                    } else {
                        int i19 = i18 + 1;
                        if (((a) arrayList.get(i19)).f182686c) {
                            h(path, aVar3, (a) arrayList.get(i19));
                            i18 = i19;
                        } else {
                            h(path, aVar3, f(aVar3, (a) arrayList.get(i19)));
                        }
                    }
                    i18++;
                }
                path.close();
                i15 = i16 + 1;
            }
        }
        return path;
    }

    private a[] b(l lVar) {
        int iE = lVar.e();
        a[] aVarArr = new a[iE];
        int i15 = 0;
        int i16 = 0;
        int iG = -1;
        while (i15 < iE) {
            if (iG == -1) {
                iG = lVar.g(i16);
            }
            boolean z15 = true;
            boolean z16 = iG == i15;
            if (z16) {
                i16++;
                iG = -1;
            }
            short sF = lVar.f(i15);
            short sB = lVar.b(i15);
            if ((lVar.d(i15) & 1) == 0) {
                z15 = false;
            }
            aVarArr[i15] = new a(sF, sB, z15, z16);
            i15++;
        }
        return aVarArr;
    }

    private void d(Path path, a aVar) {
        path.lineTo(aVar.f182684a, aVar.f182685b);
        if (yo.a.b()) {
            String.format(Locale.US, "%d,%d", Integer.valueOf(aVar.f182684a), Integer.valueOf(aVar.f182685b));
        }
    }

    private int e(int i15, int i16) {
        return i15 + ((i16 - i15) / 2);
    }

    private a f(a aVar, a aVar2) {
        return new a(e(aVar.f182684a, aVar2.f182684a), e(aVar.f182685b, aVar2.f182685b));
    }

    private void g(Path path, a aVar) {
        path.moveTo(aVar.f182684a, aVar.f182685b);
        if (yo.a.b()) {
            String.format(Locale.US, "%d,%d", Integer.valueOf(aVar.f182684a), Integer.valueOf(aVar.f182685b));
        }
    }

    private void h(Path path, a aVar, a aVar2) {
        path.quadTo(aVar.f182684a, aVar.f182685b, aVar2.f182684a, aVar2.f182685b);
        if (yo.a.b()) {
            String.format(Locale.US, "%d,%d %d,%d", Integer.valueOf(aVar.f182684a), Integer.valueOf(aVar.f182685b), Integer.valueOf(aVar2.f182684a), Integer.valueOf(aVar2.f182685b));
        }
    }

    public Path c() {
        return a(b(this.f182683a));
    }

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f182684a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f182685b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f182686c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f182687d;

        a(int i15, int i16, boolean z15, boolean z16) {
            this.f182684a = i15;
            this.f182685b = i16;
            this.f182686c = z15;
            this.f182687d = z16;
        }

        public String toString() {
            return String.format(Locale.US, "Point(%d,%d,%s,%s)", Integer.valueOf(this.f182684a), Integer.valueOf(this.f182685b), this.f182686c ? "onCurve" : "", this.f182687d ? "endOfContour" : "");
        }

        a(int i15, int i16) {
            this(i15, i16, true, false);
        }
    }
}
