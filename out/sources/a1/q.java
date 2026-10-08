package a1;

import oq.i0;
import p071kotlin.Metadata;
import p143z0.h2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007JH\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r0\fH\u0096@¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"La1/q;", "La1/b;", "", "Lu0/p;", "Lu0/l;", "animationSpec", "<init>", "(Lu0/l;)V", "Lz0/h2;", "scope", "offset", "velocity", "Lkotlin/Function1;", "Loq/i0;", "onAnimationStep", "La1/a;", "b", "(Lz0/h2;FFLer/l;Ltq/e;)Ljava/lang/Object;", "a", "Lu0/l;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class q implements b<Float, u0.p> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final u0.l<Float> animationSpec;

    public q(u0.l<Float> lVar) {
        this.animationSpec = lVar;
    }

    @Override // a1.b
    public /* bridge */ /* synthetic */ Object a(h2 h2Var, Float f15, Float f16, er.l<? super Float, i0> lVar, tq.e eVar) {
        return b(h2Var, f15.floatValue(), f16.floatValue(), lVar, eVar);
    }

    public Object b(h2 h2Var, float f15, float f16, er.l<? super Float, i0> lVar, tq.e<? super a<Float, u0.p>> eVar) throws Throwable {
        Object objI = m.i(h2Var, Math.abs(f15) * Math.signum(f16), f15, u0.o.c(0.0f, f16, 0L, 0L, false, 28, null), this.animationSpec, lVar, eVar);
        return objI == uq.b.e() ? objI : (a) objI;
    }
}
