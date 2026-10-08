package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J[\u0010\u0011\u001a\u00020\u0005\"\u0004\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00140\u00132\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016H\u0001¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lh2/n1;", "", "<init>", "()V", "T", "Lf3/m;", "Lh2/q1;", "state", "Lz0/a2;", "orientation", "", "enabled", "reverseDirection", "Lz0/e1;", "flingBehavior", "Lb1/l;", "interactionSource", "b", "(Lf3/m;Lh2/q1;Lz0/a2;ZZLz0/e1;Lb1/l;Lm2/r;II)Lf3/m;", "Lkotlin/Function1;", "", "positionalThreshold", "Lu0/l;", "animationSpec", "Lz0/d3;", "a", "(Lh2/q1;Ler/l;Lu0/l;Lm2/r;I)Lz0/d3;", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final n1 f79921a = new n1();

    private n1() {
    }

    public final <T> p143z0.d3 a(q1<T> q1Var, er.l<? super Float, Float> lVar, u0.l<Float> lVar2, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1389740237, i15, -1, "androidx.compose.material3.internal.MaterialAnchoredDraggableDefaults.flingBehavior (MaterialAnchoredDraggable.kt:340)");
        }
        p143z0.d3 d3VarC = p143z0.d.f231212a.c(q1Var.h(), lVar, lVar2, rVar, (i15 & 1008) | (p143z0.d.f231216e << 9), 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return d3VarC;
    }

    public final <T> f3.m b(f3.m mVar, q1<T> q1Var, p143z0.a2 a2Var, boolean z15, boolean z16, p143z0.e1 e1Var, b1.l lVar, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 4) != 0) {
            z15 = true;
        }
        if ((i16 & 8) != 0) {
            z16 = rVar.N(androidx.compose.ui.platform.g1.l()) == c5.t.Rtl;
        }
        p143z0.e1 e1Var2 = (i16 & 16) != 0 ? null : e1Var;
        b1.l lVar2 = (i16 & 32) != 0 ? null : lVar;
        if (p076m2.t.k()) {
            p076m2.t.o(-556993920, i15, -1, "androidx.compose.material3.internal.MaterialAnchoredDraggableDefaults.materialAnchoredDraggable (MaterialAnchoredDraggable.kt:324)");
        }
        f3.m mVarR = p143z0.j.r(mVar, q1Var.h(), z16, a2Var, z15, lVar2, null, e1Var2, 32, null);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVarR;
    }
}
