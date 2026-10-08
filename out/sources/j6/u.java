package j6;

import android.view.View;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ViewParent f99746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ViewParent f99747b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final View f99748c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f99749d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int[] f99750e;

    public u(View view) {
        this.f99748c = view;
    }

    private boolean g(int i15, int i16, int i17, int i18, int[] iArr, int i19, int[] iArr2) {
        ViewParent viewParentH;
        int i25;
        int i26;
        int[] iArr3;
        if (!l() || (viewParentH = h(i19)) == null) {
            return false;
        }
        if (i15 == 0 && i16 == 0 && i17 == 0 && i18 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        if (iArr != null) {
            this.f99748c.getLocationInWindow(iArr);
            i25 = iArr[0];
            i26 = iArr[1];
        } else {
            i25 = 0;
            i26 = 0;
        }
        if (iArr2 == null) {
            int[] iArrI = i();
            iArrI[0] = 0;
            iArrI[1] = 0;
            iArr3 = iArrI;
        } else {
            iArr3 = iArr2;
        }
        t0.d(viewParentH, this.f99748c, i15, i16, i17, i18, i19, iArr3);
        if (iArr != null) {
            this.f99748c.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i25;
            iArr[1] = iArr[1] - i26;
        }
        return true;
    }

    private ViewParent h(int i15) {
        if (i15 == 0) {
            return this.f99746a;
        }
        if (i15 != 1) {
            return null;
        }
        return this.f99747b;
    }

    private int[] i() {
        if (this.f99750e == null) {
            this.f99750e = new int[2];
        }
        return this.f99750e;
    }

    private void n(int i15, ViewParent viewParent) {
        if (i15 == 0) {
            this.f99746a = viewParent;
        } else {
            if (i15 != 1) {
                return;
            }
            this.f99747b = viewParent;
        }
    }

    public boolean a(float f15, float f16, boolean z15) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return t0.a(viewParentH, this.f99748c, f15, f16, z15);
    }

    public boolean b(float f15, float f16) {
        ViewParent viewParentH;
        if (!l() || (viewParentH = h(0)) == null) {
            return false;
        }
        return t0.b(viewParentH, this.f99748c, f15, f16);
    }

    public boolean c(int i15, int i16, int[] iArr, int[] iArr2) {
        return d(i15, i16, iArr, iArr2, 0);
    }

    public boolean d(int i15, int i16, int[] iArr, int[] iArr2, int i17) {
        ViewParent viewParentH;
        int i18;
        int i19;
        if (!l() || (viewParentH = h(i17)) == null) {
            return false;
        }
        if (i15 == 0 && i16 == 0) {
            if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
            return false;
        }
        if (iArr2 != null) {
            this.f99748c.getLocationInWindow(iArr2);
            i18 = iArr2[0];
            i19 = iArr2[1];
        } else {
            i18 = 0;
            i19 = 0;
        }
        if (iArr == null) {
            iArr = i();
        }
        int[] iArr3 = iArr;
        iArr3[0] = 0;
        iArr3[1] = 0;
        t0.c(viewParentH, this.f99748c, i15, i16, iArr3, i17);
        if (iArr2 != null) {
            this.f99748c.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i18;
            iArr2[1] = iArr2[1] - i19;
        }
        return (iArr3[0] == 0 && iArr3[1] == 0) ? false : true;
    }

    public void e(int i15, int i16, int i17, int i18, int[] iArr, int i19, int[] iArr2) {
        g(i15, i16, i17, i18, iArr, i19, iArr2);
    }

    public boolean f(int i15, int i16, int i17, int i18, int[] iArr) {
        return g(i15, i16, i17, i18, iArr, 0, null);
    }

    public boolean j() {
        return k(0);
    }

    public boolean k(int i15) {
        return h(i15) != null;
    }

    public boolean l() {
        return this.f99749d;
    }

    public void m(boolean z15) {
        if (this.f99749d) {
            l0.z0(this.f99748c);
        }
        this.f99749d = z15;
    }

    public boolean o(int i15) {
        return p(i15, 0);
    }

    public boolean p(int i15, int i16) {
        if (k(i16)) {
            return true;
        }
        if (!l()) {
            return false;
        }
        View view = this.f99748c;
        for (ViewParent parent = this.f99748c.getParent(); parent != null; parent = parent.getParent()) {
            if (t0.f(parent, view, this.f99748c, i15, i16)) {
                n(i16, parent);
                t0.e(parent, view, this.f99748c, i15, i16);
                return true;
            }
            if (parent instanceof View) {
                view = (View) parent;
            }
        }
        return false;
    }

    public void q() {
        r(0);
    }

    public void r(int i15) {
        ViewParent viewParentH = h(i15);
        if (viewParentH != null) {
            t0.g(viewParentH, this.f99748c, i15);
            n(i15, null);
        }
    }
}
