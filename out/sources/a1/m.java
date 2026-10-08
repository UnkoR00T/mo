package a1;

import androidx.compose.ui.platform.g1;
import fr.m0;
import java.util.concurrent.CancellationException;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p114t0.d1;
import p143z0.d3;
import p143z0.h2;
import u0.AnimationState;
import u0.c0;
import u0.e2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001aX\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0015*\u00020\f2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u0016\u0010\u0017\u001a^\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0015*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00032\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00192\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u001b\u0010\u001c\u001af\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u0015*\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\u00032\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00100\u00192\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010 \u001a\u001b\u0010\"\u001a\u00020\u0003*\u00020\u00032\u0006\u0010!\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\"\u0010#\u001a'\u0010(\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00032\u0006\u0010'\u001a\u00020\u0003H\u0000¢\u0006\u0004\b(\u0010)\"\u001a\u0010/\u001a\u00020*8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u00060"}, d2 = {"La1/n;", "snapLayoutInfoProvider", "Lu0/c0;", "", "decayAnimationSpec", "Lu0/l;", "snapAnimationSpec", "Lz0/d3;", "q", "(La1/n;Lu0/c0;Lu0/l;)Lz0/d3;", "p", "(La1/n;Lm2/r;I)Lz0/d3;", "Lz0/h2;", "initialTargetOffset", "initialVelocity", "La1/b;", "Lu0/p;", "animation", "Lkotlin/Function1;", "Loq/i0;", "onAnimationStep", "La1/a;", "k", "(Lz0/h2;FFLa1/b;Ler/l;Ltq/e;)Ljava/lang/Object;", "targetOffset", "Lu0/n;", "animationState", "f", "(Lz0/h2;FLu0/n;Lu0/c0;Ler/l;Ltq/e;)Ljava/lang/Object;", "cancelOffset", "animationSpec", "i", "(Lz0/h2;FFLu0/n;Lu0/l;Ler/l;Ltq/e;)Ljava/lang/Object;", "target", "n", "(FF)F", "La1/d;", "snappingOffset", "lowerBound", "upperBound", "l", "(IFF)F", "Lc5/h;", "a", "F", "o", "()F", "MinFlingVelocityDp", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f1214a = c5.h.n(400);

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f1215d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1216e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f1217f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f1218g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f1219h;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1218g = obj;
            this.f1219h |= PKIFailureInfo.systemUnavail;
            return m.f(null, 0.0f, null, null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f1220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f1221e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f1222f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f1223g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f1224h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f1225j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1224h = obj;
            this.f1225j |= PKIFailureInfo.systemUnavail;
            return m.i(null, 0.0f, 0.0f, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(final h2 h2Var, final float f15, AnimationState<Float, u0.p> animationState, c0<Float> c0Var, final er.l<? super Float, i0> lVar, tq.e<? super a1.a<Float, u0.p>> eVar) throws Throwable {
        a aVar;
        m0 m0Var;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f1219h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f1219h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f1218g;
        Object objE = uq.b.e();
        int i16 = aVar.f1219h;
        if (i16 == 0) {
            u.b(obj);
            final m0 m0Var2 = new m0();
            boolean z15 = animationState.y().floatValue() == 0.0f;
            er.l lVar2 = new er.l() { // from class: a1.k
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.h(f15, m0Var2, h2Var, lVar, (u0.k) obj2);
                }
            };
            aVar.f1216e = animationState;
            aVar.f1217f = m0Var2;
            aVar.f1215d = f15;
            aVar.f1219h = 1;
            if (e2.u(animationState, c0Var, !z15, lVar2, aVar) == objE) {
                return objE;
            }
            m0Var = m0Var2;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f15 = aVar.f1215d;
            m0Var = (m0) aVar.f1217f;
            animationState = (AnimationState) aVar.f1216e;
            u.b(obj);
        }
        return new a1.a(vq.b.d(f15 - m0Var.f66406a), animationState);
    }

    private static final void g(u0.k<Float, u0.p> kVar, h2 h2Var, er.l<? super Float, i0> lVar, float f15) {
        float fD;
        try {
            fD = h2Var.d(f15);
        } catch (CancellationException unused) {
            kVar.a();
            fD = 0.0f;
        }
        lVar.b(Float.valueOf(fD));
        if (Math.abs(f15 - fD) > 0.5f) {
            kVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(float f15, m0 m0Var, h2 h2Var, er.l lVar, u0.k kVar) {
        if (Math.abs(((Number) kVar.e()).floatValue()) >= Math.abs(f15)) {
            float fN = n(((Number) kVar.e()).floatValue(), f15);
            g(kVar, h2Var, lVar, fN - m0Var.f66406a);
            kVar.a();
            m0Var.f66406a = fN;
        } else {
            g(kVar, h2Var, lVar, ((Number) kVar.e()).floatValue() - m0Var.f66406a);
            m0Var.f66406a = ((Number) kVar.e()).floatValue();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    public static final Object i(final h2 h2Var, float f15, final float f16, AnimationState<Float, u0.p> animationState, u0.l<Float> lVar, final er.l<? super Float, i0> lVar2, tq.e<? super a1.a<Float, u0.p>> eVar) throws Throwable {
        b bVar;
        float f17;
        AnimationState<Float, u0.p> animationState2;
        m0 m0Var;
        float f18;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f1225j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f1225j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f1224h;
        Object objE = uq.b.e();
        int i16 = bVar2.f1225j;
        if (i16 == 0) {
            u.b(obj);
            final m0 m0Var2 = new m0();
            float fFloatValue = animationState.y().floatValue();
            Float fD = vq.b.d(f15);
            boolean z15 = animationState.y().floatValue() == 0.0f;
            er.l lVar3 = new er.l() { // from class: a1.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.j(f16, m0Var2, h2Var, lVar2, (u0.k) obj2);
                }
            };
            bVar2.f1222f = animationState;
            bVar2.f1223g = m0Var2;
            f17 = f15;
            bVar2.f1220d = f17;
            bVar2.f1221e = fFloatValue;
            bVar2.f1225j = 1;
            if (e2.x(animationState, fD, lVar, !z15, lVar3, bVar2) == objE) {
                return objE;
            }
            animationState2 = animationState;
            m0Var = m0Var2;
            f18 = fFloatValue;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f18 = bVar2.f1221e;
            float f19 = bVar2.f1220d;
            m0Var = (m0) bVar2.f1223g;
            AnimationState<Float, u0.p> animationState3 = (AnimationState) bVar2.f1222f;
            u.b(obj);
            f17 = f19;
            animationState2 = animationState3;
        }
        return new a1.a(vq.b.d(f17 - m0Var.f66406a), u0.o.g(animationState2, 0.0f, n(animationState2.y().floatValue(), f18), 0L, 0L, false, 29, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(float f15, m0 m0Var, h2 h2Var, er.l lVar, u0.k kVar) {
        float fD;
        float fN = n(((Number) kVar.e()).floatValue(), f15);
        float f16 = fN - m0Var.f66406a;
        try {
            fD = h2Var.d(f16);
        } catch (CancellationException unused) {
            kVar.a();
            fD = 0.0f;
        }
        lVar.b(Float.valueOf(fD));
        if (Math.abs(f16 - fD) > 0.5f || fN != ((Number) kVar.e()).floatValue()) {
            kVar.a();
        }
        m0Var.f66406a += fD;
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object k(h2 h2Var, float f15, float f16, a1.b<Float, u0.p> bVar, er.l<? super Float, i0> lVar, tq.e<? super a1.a<Float, u0.p>> eVar) {
        return bVar.a(h2Var, vq.b.d(f15), vq.b.d(f16), lVar, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public static final float l(int i15, float f15, float f16) {
        d.Companion companion = d.INSTANCE;
        if (d.e(i15, companion.a())) {
            if (Math.abs(f16) <= Math.abs(f15)) {
                f15 = f16;
            }
        } else if (d.e(i15, companion.b())) {
            f15 = f16;
        } else if (!d.e(i15, companion.c())) {
            f15 = 0.0f;
        }
        if (m(f15)) {
            return f15;
        }
        return 0.0f;
    }

    private static final boolean m(float f15) {
        return (f15 == Float.POSITIVE_INFINITY || f15 == Float.NEGATIVE_INFINITY) ? false : true;
    }

    private static final float n(float f15, float f16) {
        if (f16 == 0.0f) {
            return 0.0f;
        }
        return f16 > 0.0f ? lr.m.i(f15, f16) : lr.m.d(f15, f16);
    }

    public static final float o() {
        return f1214a;
    }

    public static final d3 p(n nVar, r rVar, int i15) {
        if (t.k()) {
            t.o(-1921733134, i15, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:230)");
        }
        Object obj = (c5.d) rVar.N(g1.f());
        c0 c0VarB = d1.b(rVar, 0);
        boolean zW = rVar.W(c0VarB) | ((((i15 & 14) ^ 6) > 4 && rVar.W(nVar)) || (i15 & 6) == 4) | rVar.W(obj);
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = q(nVar, c0VarB, u0.m.j(0.0f, 400.0f, null, 5, null));
            rVar.v(objE);
        }
        d3 d3Var = (d3) objE;
        if (t.k()) {
            t.n();
        }
        return d3Var;
    }

    public static final d3 q(n nVar, c0<Float> c0Var, u0.l<Float> lVar) {
        return new h(nVar, c0Var, lVar);
    }
}
