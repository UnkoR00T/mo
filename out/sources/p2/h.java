package p2;

import p071kotlin.Metadata;
import r0.i0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081@\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0010\u0010\u000f\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0011"}, d2 = {"Lp2/h;", "", "Lr0/i0;", "list", "b", "(Lr0/i0;)Lr0/i0;", "", "value", "Loq/i0;", "a", "(Lr0/i0;I)V", "", "d", "(Lr0/i0;)Z", "e", "(Lr0/i0;)I", "f", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h {
    public static final void a(i0 i0Var, int i15) {
        if (i0Var._size == 0 || !(i0Var.e(0) == i15 || i0Var.e(i0Var._size - 1) == i15)) {
            int i16 = i0Var._size;
            i0Var.k(i15);
            while (i16 > 0) {
                int i17 = ((i16 + 1) >>> 1) - 1;
                int iE = i0Var.e(i17);
                if (i15 <= iE) {
                    break;
                }
                i0Var.r(i16, iE);
                i16 = i17;
            }
            i0Var.r(i16, i15);
        }
    }

    public static i0 b(i0 i0Var) {
        return i0Var;
    }

    public static /* synthetic */ i0 c(i0 i0Var, int i15, fr.k kVar) {
        int i16 = 1;
        if ((i15 & 1) != 0) {
            i0Var = new i0(0, i16, null);
        }
        return b(i0Var);
    }

    public static final boolean d(i0 i0Var) {
        return i0Var._size != 0;
    }

    public static final int e(i0 i0Var) {
        return i0Var.d();
    }

    public static final int f(i0 i0Var) {
        int iE;
        int i15 = i0Var._size;
        int iE2 = i0Var.e(0);
        while (i0Var._size != 0 && i0Var.e(0) == iE2) {
            i0Var.r(0, i0Var.i());
            i0Var.p(i0Var._size - 1);
            int i16 = i0Var._size;
            int i17 = i16 >>> 1;
            int i18 = 0;
            while (i18 < i17) {
                int iE3 = i0Var.e(i18);
                int i19 = (i18 + 1) * 2;
                int i25 = i19 - 1;
                int iE4 = i0Var.e(i25);
                if (i19 < i16 && (iE = i0Var.e(i19)) > iE4) {
                    if (iE <= iE3) {
                        break;
                    }
                    i0Var.r(i18, iE);
                    i0Var.r(i19, iE3);
                    i18 = i19;
                } else {
                    if (iE4 <= iE3) {
                        break;
                    }
                    i0Var.r(i18, iE4);
                    i0Var.r(i25, iE3);
                    i18 = i25;
                }
            }
        }
        return iE2;
    }
}
