package g4;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\t\u001a\u00020\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001b\u0010\f\u001a\u00020\b*\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\f\u0010\r\"\u0018\u0010\u0006\u001a\u00020\u0005*\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lg4/i1;", "Loq/i0;", "d", "(Lg4/i1;)V", "Lf3/m$c;", "", "useMinimumTouchTarget", "clipBounds", "Lm3/g;", "b", "(Lf3/m$c;ZZ)Lm3/g;", "Le4/b0;", "a", "(Le4/b0;Z)Lm3/g;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "c", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j1 {
    public static final m3.g a(p036e4.b0 b0Var, boolean z15) {
        return p036e4.c0.e(b0Var).Y(b0Var, z15);
    }

    public static final m3.g b(f3.m.c cVar, boolean z15, boolean z16) {
        if (cVar.getNode().getIsAttached()) {
            return !z15 ? a(h.n(cVar, s0.a(8)), z16) : h.n(cVar, s0.a(8)).h4();
        }
        return m3.g.INSTANCE.a();
    }

    public static final boolean c(SemanticsConfiguration semanticsConfiguration) {
        return n4.q.a(semanticsConfiguration, n4.p.f131279a.l()) != null;
    }

    public static final void d(i1 i1Var) {
        h.s(i1Var).Z0();
    }
}
