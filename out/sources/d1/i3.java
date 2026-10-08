package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u0001*\u00020\u00058@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\b*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\"\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0010*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\"\u001a\u0010\u0015\u001a\u00020\f*\u0004\u0018\u00010\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, d2 = {"Le4/v;", "Ld1/l3;", "c", "(Le4/v;)Ld1/l3;", "rowColumnParentData", "Le4/a2;", "d", "(Le4/a2;)Ld1/l3;", "", "e", "(Ld1/l3;)F", "weight", "", "b", "(Ld1/l3;)Z", "fill", "Ld1/m0;", "a", "(Ld1/l3;)Ld1/m0;", "crossAxisAlignment", "f", "isRelative", "foundation-layout"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i3 {
    public static final m0 a(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getCrossAxisAlignment();
        }
        return null;
    }

    public static final boolean b(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getFill();
        }
        return true;
    }

    public static final RowColumnParentData c(p036e4.v vVar) {
        Object objE = vVar.e();
        if (objE instanceof RowColumnParentData) {
            return (RowColumnParentData) objE;
        }
        return null;
    }

    public static final RowColumnParentData d(p036e4.a2 a2Var) {
        Object objE = a2Var.e();
        if (objE instanceof RowColumnParentData) {
            return (RowColumnParentData) objE;
        }
        return null;
    }

    public static final float e(RowColumnParentData rowColumnParentData) {
        if (rowColumnParentData != null) {
            return rowColumnParentData.getWeight();
        }
        return 0.0f;
    }

    public static final boolean f(RowColumnParentData rowColumnParentData) {
        m0 m0VarA = a(rowColumnParentData);
        if (m0VarA != null) {
            return m0VarA.c();
        }
        return false;
    }
}
