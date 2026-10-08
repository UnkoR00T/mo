package p114t0;

import android.view.ViewConfiguration;
import androidx.compose.ui.platform.g1;
import c5.d;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import u0.c0;
import u0.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\u001a\u001b\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\"\u001a\u0010\b\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007¨\u0006\t"}, d2 = {"T", "Lu0/c0;", "b", "(Lm2/r;I)Lu0/c0;", "", "a", "F", "()F", "platformFlingScrollFriction", "animation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f186275a = ViewConfiguration.getScrollFriction();

    public static final float a() {
        return f186275a;
    }

    public static final <T> c0<T> b(r rVar, int i15) {
        if (t.k()) {
            t.o(904445851, i15, -1, "androidx.compose.animation.rememberSplineBasedDecay (SplineBasedFloatDecayAnimationSpec.android.kt:40)");
        }
        d dVar = (d) rVar.N(g1.f());
        boolean zB = rVar.b(dVar.getDensity());
        Object objE = rVar.E();
        if (zB || objE == r.INSTANCE.a()) {
            objE = e0.d(new c1(dVar));
            rVar.v(objE);
        }
        c0<T> c0Var = (c0) objE;
        if (t.k()) {
            t.n();
        }
        return c0Var;
    }
}
