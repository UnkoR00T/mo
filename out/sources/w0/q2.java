package w0;

import n4.ProgressBarRangeInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\u001a5\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0003\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0013\u0010\t\u001a\u00020\u0000*\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lf3/m;", "", "value", "Llr/e;", "valueRange", "", "steps", "d", "(Lf3/m;FLlr/e;I)Lf3/m;", "c", "(Lf3/m;)Lf3/m;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q2 {
    public static final f3.m c(f3.m mVar) {
        return n4.v.c(mVar, true, new er.l() { // from class: w0.p2
            @Override // er.l
            public final Object b(Object obj) {
                return q2.f((n4.i0) obj);
            }
        });
    }

    public static final f3.m d(f3.m mVar, final float f15, final lr.e<Float> eVar, final int i15) {
        return n4.v.c(mVar, true, new er.l() { // from class: w0.o2
            @Override // er.l
            public final Object b(Object obj) {
                return q2.e(f15, eVar, i15, (n4.i0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(float f15, lr.e eVar, int i15, n4.i0 i0Var) {
        n4.f0.q0(i0Var, new ProgressBarRangeInfo(((Number) lr.m.q(Float.valueOf(f15), eVar)).floatValue(), eVar, i15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(n4.i0 i0Var) {
        n4.f0.q0(i0Var, ProgressBarRangeInfo.INSTANCE.a());
        return oq.i0.f148189a;
    }
}
