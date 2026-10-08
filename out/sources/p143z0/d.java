package p143z0;

import androidx.compose.ui.platform.g1;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import u0.c0;
import u0.e0;
import u0.l;
import u0.m;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JI\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u0007¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\b0\n8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\r\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\b0\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001d"}, d2 = {"Lz0/d;", "", "<init>", "()V", "T", "Lz0/r;", "state", "Lkotlin/Function1;", "", "positionalThreshold", "Lu0/l;", "animationSpec", "Lz0/d3;", "c", "(Lz0/r;Ler/l;Lu0/l;Lm2/r;II)Lz0/d3;", "b", "Lu0/l;", "f", "()Lu0/l;", "SnapAnimationSpec", "Ler/l;", "e", "()Ler/l;", "PositionalThreshold", "Lu0/c0;", "d", "Lu0/c0;", "()Lu0/c0;", "DecayAnimationSpec", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f231212a = new d();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final l<Float> SnapAnimationSpec = m.l(0, 0, null, 7, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final er.l<Float, Float> PositionalThreshold = new er.l() { // from class: z0.c
        @Override // er.l
        public final Object b(Object obj) {
            return Float.valueOf(d.b(((Float) obj).floatValue()));
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final c0<Float> DecayAnimationSpec = e0.c(0.0f, 0.0f, 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f231216e = 8;

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float b(float f15) {
        return f15 / 2.0f;
    }

    public final <T> d3 c(r<T> rVar, er.l<? super Float, Float> lVar, l<Float> lVar2, r rVar2, int i15, int i16) {
        if ((i16 & 2) != 0) {
            lVar = PositionalThreshold;
        }
        if ((i16 & 4) != 0) {
            lVar2 = SnapAnimationSpec;
        }
        if (t.k()) {
            t.o(-952742024, i15, -1, "androidx.compose.foundation.gestures.AnchoredDraggableDefaults.flingBehavior (AnchoredDraggable.kt:1554)");
        }
        c5.d dVar = (c5.d) rVar2.N(g1.f());
        boolean zW = ((((i15 & 14) ^ 6) > 4 && rVar2.W(rVar)) || (i15 & 6) == 4) | rVar2.W(dVar) | ((((i15 & 112) ^ 48) > 32 && rVar2.W(lVar)) || (i15 & 48) == 32) | rVar2.W(lVar2);
        Object objE = rVar2.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = j.s(rVar, dVar, lVar, lVar2);
            rVar2.v(objE);
        }
        d3 d3Var = (d3) objE;
        if (t.k()) {
            t.n();
        }
        return d3Var;
    }

    public final c0<Float> d() {
        return DecayAnimationSpec;
    }

    public final er.l<Float, Float> e() {
        return PositionalThreshold;
    }

    public final l<Float> f() {
        return SnapAnimationSpec;
    }
}
