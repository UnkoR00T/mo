package t7;

import android.text.TextUtils;
import java.util.Arrays;
import w7.o0;

/* JADX INFO: loaded from: classes3.dex */
public final class f0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f188175f = o0.u0(0);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f188176g = o0.u0(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f188177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f188178b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f188179c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p[] f188180d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f188181e;

    public f0(p... pVarArr) {
        this("", pVarArr);
    }

    private static void c(String str, String str2, String str3, int i15) {
        w7.t.d("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i15 + ")"));
    }

    private static String d(String str) {
        return (str == null || str.equals("und")) ? "" : str;
    }

    private static int e(int i15) {
        return i15 | 16384;
    }

    private void f() {
        String strD = d(this.f188180d[0].f188369d);
        int iE = e(this.f188180d[0].f188371f);
        int i15 = 1;
        while (true) {
            p[] pVarArr = this.f188180d;
            if (i15 >= pVarArr.length) {
                return;
            }
            if (!strD.equals(d(pVarArr[i15].f188369d))) {
                p[] pVarArr2 = this.f188180d;
                c("languages", pVarArr2[0].f188369d, pVarArr2[i15].f188369d, i15);
                return;
            } else {
                if (iE != e(this.f188180d[i15].f188371f)) {
                    c("role flags", Integer.toBinaryString(this.f188180d[0].f188371f), Integer.toBinaryString(this.f188180d[i15].f188371f), i15);
                    return;
                }
                i15++;
            }
        }
    }

    public p a(int i15) {
        return this.f188180d[i15];
    }

    public int b(p pVar) {
        int i15 = 0;
        while (true) {
            p[] pVarArr = this.f188180d;
            if (i15 >= pVarArr.length) {
                return -1;
            }
            if (pVar == pVarArr[i15]) {
                return i15;
            }
            i15++;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f0.class == obj.getClass()) {
            f0 f0Var = (f0) obj;
            if (this.f188178b.equals(f0Var.f188178b) && Arrays.equals(this.f188180d, f0Var.f188180d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        if (this.f188181e == 0) {
            this.f188181e = ((527 + this.f188178b.hashCode()) * 31) + Arrays.hashCode(this.f188180d);
        }
        return this.f188181e;
    }

    public String toString() {
        return this.f188178b + ": " + Arrays.toString(this.f188180d);
    }

    public f0(String str, p... pVarArr) {
        zj.p.d(pVarArr.length > 0);
        this.f188178b = str;
        this.f188180d = pVarArr;
        this.f188177a = pVarArr.length;
        String str2 = pVarArr[0].f188381p;
        this.f188179c = TextUtils.isEmpty(str2) ? w.f(pVarArr[0].f188380o) : w.f(str2);
        f();
    }
}
