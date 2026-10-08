package p143z0;

import c5.d;
import er.l;
import er.p;
import f3.o;
import fr.m0;
import java.util.concurrent.CancellationException;
import ju.i;
import ju.p0;
import oq.u;
import p071kotlin.Metadata;
import p114t0.b1;
import tq.e;
import u0.AnimationState;
import u0.c0;
import u0.e2;
import uq.b;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001c\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\n\u001a\u00020\u0003H\u0096@¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lz0/i0;", "Lz0/j2;", "Lu0/c0;", "", "flingDecay", "Lf3/o;", "motionDurationScale", "<init>", "(Lu0/c0;Lf3/o;)V", "Lz0/h2;", "initialVelocity", "a", "(Lz0/h2;FLtq/e;)Ljava/lang/Object;", "Lc5/d;", "density", "Loq/i0;", "d", "(Lc5/d;)V", "Lu0/c0;", "b", "Lf3/o;", "", "c", "I", "f", "()I", "g", "(I)V", "lastAnimationCycleCount", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i0 implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private c0<Float> flingDecay;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final o motionDurationScale;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastAnimationCycleCount;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)F"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super Float>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f231308e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f231309f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f231310g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f231311h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ i0 f231312j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ h2 f231313k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(float f15, i0 i0Var, h2 h2Var, e<? super a> eVar) {
            super(2, eVar);
            this.f231311h = f15;
            this.f231312j = i0Var;
            this.f231313k = h2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(m0 m0Var, h2 h2Var, m0 m0Var2, i0 i0Var, u0.k kVar) {
            float fFloatValue = ((Number) kVar.e()).floatValue() - m0Var.f66406a;
            float fD = h2Var.d(fFloatValue);
            m0Var.f66406a = ((Number) kVar.e()).floatValue();
            m0Var2.f66406a = ((Number) kVar.f()).floatValue();
            if (Math.abs(fFloatValue - fD) > 0.5f) {
                kVar.a();
            }
            i0Var.g(i0Var.getLastAnimationCycleCount() + 1);
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            float f15;
            AnimationState animationState;
            m0 m0Var;
            Object objE = b.e();
            int i15 = this.f231310g;
            if (i15 == 0) {
                u.b(obj);
                if (Math.abs(this.f231311h) > 1.0f) {
                    final m0 m0Var2 = new m0();
                    m0Var2.f66406a = this.f231311h;
                    final m0 m0Var3 = new m0();
                    AnimationState animationStateC = u0.o.c(0.0f, this.f231311h, 0L, 0L, false, 28, null);
                    try {
                        c0 c0Var = this.f231312j.flingDecay;
                        final h2 h2Var = this.f231313k;
                        final i0 i0Var = this.f231312j;
                        l lVar = new l() { // from class: z0.h0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return i0.a.O(m0Var3, h2Var, m0Var2, i0Var, (u0.k) obj2);
                            }
                        };
                        this.f231308e = m0Var2;
                        this.f231309f = animationStateC;
                        this.f231310g = 1;
                        animationState = animationStateC;
                        try {
                            if (e2.v(animationState, c0Var, false, lVar, this, 2, null) == objE) {
                                return objE;
                            }
                            m0Var = m0Var2;
                            f15 = m0Var.f66406a;
                        } catch (CancellationException unused) {
                            m0Var = m0Var2;
                            m0Var.f66406a = ((Number) animationState.y()).floatValue();
                        }
                    } catch (CancellationException unused2) {
                        animationState = animationStateC;
                    }
                } else {
                    f15 = this.f231311h;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                animationState = (AnimationState) this.f231309f;
                m0Var = (m0) this.f231308e;
                try {
                    u.b(obj);
                } catch (CancellationException unused3) {
                    m0Var.f66406a = ((Number) animationState.y()).floatValue();
                }
                f15 = m0Var.f66406a;
            }
            return vq.b.d(f15);
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super Float> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final e<oq.i0> v(Object obj, e<?> eVar) {
            return new a(this.f231311h, this.f231312j, this.f231313k, eVar);
        }
    }

    public i0(c0<Float> c0Var, o oVar) {
        this.flingDecay = c0Var;
        this.motionDurationScale = oVar;
    }

    @Override // p143z0.e1
    public Object a(h2 h2Var, float f15, e<? super Float> eVar) {
        this.lastAnimationCycleCount = 0;
        return i.g(this.motionDurationScale, new a(f15, this, h2Var, null), eVar);
    }

    @Override // p143z0.j2
    public void d(d density) {
        this.flingDecay = b1.c(density);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    public final void g(int i15) {
        this.lastAnimationCycleCount = i15;
    }

    public /* synthetic */ i0(c0 c0Var, o oVar, int i15, fr.k kVar) {
        this(c0Var, (i15 & 2) != 0 ? n2.g() : oVar);
    }
}
