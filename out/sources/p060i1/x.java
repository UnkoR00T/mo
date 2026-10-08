package p060i1;

import a1.g;
import androidx.compose.ui.platform.g1;
import c1.e;
import c5.d;
import c5.t;
import er.q;
import fr.s;
import p071kotlin.Metadata;
import p076m2.r;
import p114t0.d1;
import p143z0.a2;
import p143z0.d3;
import u0.c0;
import u0.g4;
import u0.l;
import u0.m;
import z3.a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JK\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\u000b2\b\b\u0003\u0010\r\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Li1/x;", "", "<init>", "()V", "Li1/i1;", "state", "Li1/b1;", "pagerSnapDistance", "Lu0/c0;", "", "decayAnimationSpec", "Lu0/l;", "snapAnimationSpec", "snapPositionalThreshold", "Lz0/d3;", "b", "(Li1/i1;Li1/b1;Lu0/c0;Lu0/l;FLm2/r;II)Lz0/d3;", "Lz0/a2;", "orientation", "Lz3/a;", "d", "(Li1/i1;Lz0/a2;Lm2/r;I)Lz3/a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final x f88070a = new x();

    private x() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(i1 i1Var, t tVar, float f15, float f16, float f17, float f18) {
        return g.c(i1Var, tVar, f15, f16, f17, f18);
    }

    public final d3 b(final i1 i1Var, b1 b1Var, c0<Float> c0Var, l<Float> lVar, final float f15, r rVar, int i15, int i16) {
        boolean z15 = true;
        if ((i16 & 2) != 0) {
            b1Var = b1.INSTANCE.a(1);
        }
        if ((i16 & 4) != 0) {
            c0Var = d1.b(rVar, 0);
        }
        if ((i16 & 8) != 0) {
            lVar = m.j(0.0f, 400.0f, Float.valueOf(g4.b(s.f66413a)), 1, null);
        }
        if ((i16 & 16) != 0) {
            f15 = 0.5f;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(1559769181, i15, -1, "androidx.compose.foundation.pager.PagerDefaults.flingBehavior (Pager.kt:386)");
        }
        if (!(0.0f <= f15 && f15 <= 1.0f)) {
            e.a("snapPositionalThreshold should be a number between 0 and 1. You've specified " + f15);
        }
        d dVar = (d) rVar.N(g1.f());
        final t tVar = (t) rVar.N(g1.l());
        boolean zW = ((((i15 & 14) ^ 6) > 4 && rVar.W(i1Var)) || (i15 & 6) == 4) | rVar.W(c0Var) | rVar.W(lVar);
        if ((((i15 & 112) ^ 48) <= 32 || !rVar.W(b1Var)) && (i15 & 48) != 32) {
            z15 = false;
        }
        boolean zW2 = zW | z15 | rVar.W(dVar) | rVar.c(tVar.ordinal());
        Object objE = rVar.E();
        if (zW2 || objE == r.INSTANCE.a()) {
            objE = a1.m.q(g.a(i1Var, b1Var, new q() { // from class: i1.w
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return Float.valueOf(x.c(i1Var, tVar, f15, ((Float) obj).floatValue(), ((Float) obj2).floatValue(), ((Float) obj3).floatValue()));
                }
            }), c0Var, lVar);
            rVar.v(objE);
        }
        d3 d3Var = (d3) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return d3Var;
    }

    public final a d(i1 i1Var, a2 a2Var, r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(877583120, i15, -1, "androidx.compose.foundation.pager.PagerDefaults.pageNestedScrollConnection (Pager.kt:435)");
        }
        boolean z15 = ((((i15 & 14) ^ 6) > 4 && rVar.W(i1Var)) || (i15 & 6) == 4) | ((((i15 & 112) ^ 48) > 32 && rVar.c(a2Var.ordinal())) || (i15 & 48) == 32);
        Object objE = rVar.E();
        if (z15 || objE == r.INSTANCE.a()) {
            objE = new a(i1Var, a2Var);
            rVar.v(objE);
        }
        a aVar = (a) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return aVar;
    }
}
