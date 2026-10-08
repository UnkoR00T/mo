package p143z0;

import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lz0/k2;", "", "<init>", "()V", "Lz0/e1;", "a", "(Lm2/r;I)Lz0/e1;", "Lc5/t;", "layoutDirection", "Lz0/a2;", "orientation", "", "reverseScrolling", "b", "(Lc5/t;Lz0/a2;Z)Z", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final k2 f231404a = new k2();

    private k2() {
    }

    public final e1 a(r rVar, int i15) {
        if (t.k()) {
            t.o(1107739818, i15, -1, "androidx.compose.foundation.gestures.ScrollableDefaults.flingBehavior (Scrollable.kt:622)");
        }
        e1 e1VarB = y2.b(rVar, 0);
        if (t.k()) {
            t.n();
        }
        return e1VarB;
    }

    public final boolean b(c5.t layoutDirection, a2 orientation, boolean reverseScrolling) {
        return (layoutDirection != c5.t.Rtl || orientation == a2.Vertical) ? !reverseScrolling : reverseScrolling;
    }
}
