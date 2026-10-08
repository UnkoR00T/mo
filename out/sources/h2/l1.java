package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001b\u0010\u0002\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u0004\u0018\u00010\u0005*\u00020\u00048@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\f\u001a\u00020\u0000*\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b\"\u001a\u0010\u000e\u001a\u00020\u0000*\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000b¨\u0006\u000f"}, d2 = {"", "other", "d", "(II)I", "Le4/v;", "", "b", "(Le4/v;)Ljava/lang/Object;", "layoutId", "Le4/a2;", "c", "(Le4/a2;)I", "widthOrZero", "a", "heightOrZero", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l1 {
    public static final int a(p036e4.a2 a2Var) {
        if (a2Var != null) {
            return a2Var.getHeight();
        }
        return 0;
    }

    public static final Object b(p036e4.v vVar) {
        Object objE = vVar.e();
        p036e4.h0 h0Var = objE instanceof p036e4.h0 ? (p036e4.h0) objE : null;
        if (h0Var != null) {
            return h0Var.getLayoutId();
        }
        return null;
    }

    public static final int c(p036e4.a2 a2Var) {
        if (a2Var != null) {
            return a2Var.getWidth();
        }
        return 0;
    }

    public static final int d(int i15, int i16) {
        return i15 == Integer.MAX_VALUE ? i15 : lr.m.e(i15 - i16, 0);
    }
}
