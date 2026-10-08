package p047f5;

import c5.h;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J.\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004H&ø\u0001\u0000¢\u0006\u0004\b\b\u0010\tø\u0001\u0001\u0082\u0002\r\n\u0005\b¡\u001e0\u0001\n\u0004\b!0\u0001¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lf5/f0;", "", "Lf5/i$c;", "anchor", "Lc5/h;", "margin", "goneMargin", "Loq/i0;", "a", "(Lf5/i$c;FF)V", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface f0 {
    static /* synthetic */ void b(f0 f0Var, i.VerticalAnchor cVar, float f15, float f16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: linkTo-VpY3zN4");
        }
        if ((i15 & 2) != 0) {
            f15 = h.n(0);
        }
        if ((i15 & 4) != 0) {
            f16 = h.n(0);
        }
        f0Var.a(cVar, f15, f16);
    }

    void a(i.VerticalAnchor anchor, float margin, float goneMargin);
}
