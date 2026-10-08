package v1;

import a4.x;
import c5.h;
import f3.m;
import g4.DpTouchBoundsExpansion;
import g4.o1;
import oq.i0;
import p071kotlin.Metadata;
import p079n1.d7;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b\"\u001a\u0010\u000e\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u001a\u0010\u0010\u001a\u00020\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000b\u001a\u0004\b\u000f\u0010\r\"\u001a\u0010\u0015\u001a\u00020\u00118\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\n\u0010\u0014¨\u0006\u0016"}, d2 = {"Lf3/m;", "", "enabled", "showHoverIcon", "Lkotlin/Function0;", "Loq/i0;", "onHandwritingSlopExceeded", "b", "(Lf3/m;ZZLer/a;)Lf3/m;", "Lc5/h;", "a", "F", "getHandwritingBoundsVerticalOffset", "()F", "HandwritingBoundsVerticalOffset", "getHandwritingBoundsHorizontalOffset", "HandwritingBoundsHorizontalOffset", "Lg4/p;", "c", "Lg4/p;", "()Lg4/p;", "HandwritingBoundsExpansion", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f203002a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f203003b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final DpTouchBoundsExpansion f203004c;

    static {
        float fN = h.n(40);
        f203002a = fN;
        float fN2 = h.n(10);
        f203003b = fN2;
        f203004c = o1.a(fN2, fN, fN2, fN);
    }

    public static final DpTouchBoundsExpansion a() {
        return f203004c;
    }

    public static final m b(m mVar, boolean z15, boolean z16, er.a<i0> aVar) {
        if (!z15 || !d.a()) {
            return mVar;
        }
        if (z16) {
            mVar = x.c(mVar, d7.a(), false, f203004c);
        }
        return mVar.u(new a(aVar));
    }
}
