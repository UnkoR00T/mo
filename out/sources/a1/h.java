package a1;

import fr.m0;
import fr.t;
import ju.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p143z0.d3;
import p143z0.h2;
import p143z0.n2;
import u0.AnimationState;
import u0.c0;
import u0.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ<\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013JD\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0017*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u00052\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u0018\u0010\u0019JD\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00110\u0010*\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0082@¢\u0006\u0004\b\u001c\u0010\u0019J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ0\u0010!\u001a\u00020\u0005*\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e0\rH\u0096@¢\u0006\u0004\b!\u0010\u0013J\u001a\u0010$\u001a\u00020\u001d2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010+R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\"\u00105\u001a\u00020.8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00066"}, d2 = {"La1/h;", "Lz0/d3;", "La1/n;", "snapLayoutInfoProvider", "Lu0/c0;", "", "decayAnimationSpec", "Lu0/l;", "snapAnimationSpec", "<init>", "(La1/n;Lu0/c0;Lu0/l;)V", "Lz0/h2;", "initialVelocity", "Lkotlin/Function1;", "Loq/i0;", "onRemainingScrollOffsetUpdate", "La1/a;", "Lu0/p;", "j", "(Lz0/h2;FLer/l;Ltq/e;)Ljava/lang/Object;", "offset", "velocity", "updateRemainingScrollOffset", "Lu0/n;", "m", "(Lz0/h2;FFLer/l;Ltq/e;)Ljava/lang/Object;", "initialTargetOffset", "onAnimationStep", "l", "", "k", "(FF)Z", "onRemainingDistanceUpdated", "b", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "La1/n;", "Lu0/c0;", "c", "Lu0/l;", "Lf3/o;", "d", "Lf3/o;", "getMotionScaleDuration$foundation", "()Lf3/o;", "setMotionScaleDuration$foundation", "(Lf3/o;)V", "motionScaleDuration", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n snapLayoutInfoProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0<Float> decayAnimationSpec;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u0.l<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private f3.o motionScaleDuration = n2.g();

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f1186d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f1187e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f1189g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1187e = obj;
            this.f1189g |= PKIFailureInfo.systemUnavail;
            return h.this.j(null, 0.0f, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "La1/a;", "", "Lu0/p;", "<anonymous>", "(Lju/p0;)La1/a;"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super a1.a<Float, u0.p>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f1190e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1191f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f1193h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.l<Float, i0> f1194j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ h2 f1195k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(float f15, er.l<? super Float, i0> lVar, h2 h2Var, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f1193h = f15;
            this.f1194j = lVar;
            this.f1195k = h2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 V(m0 m0Var, er.l lVar, float f15) {
            float f16 = m0Var.f66406a - f15;
            m0Var.f66406a = f16;
            lVar.b(Float.valueOf(f16));
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 X(m0 m0Var, er.l lVar, float f15) {
            float f16 = m0Var.f66406a - f15;
            m0Var.f66406a = f16;
            lVar.b(Float.valueOf(f16));
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final m0 m0Var;
            Object objM;
            Object objE = uq.b.e();
            int i15 = this.f1191f;
            if (i15 == 0) {
                u.b(obj);
                float fB = h.this.snapLayoutInfoProvider.b(this.f1193h, e0.a(h.this.decayAnimationSpec, 0.0f, this.f1193h));
                if (Float.isNaN(fB)) {
                    c1.e.c("calculateApproachOffset returned NaN. Please use a valid value.");
                }
                m0Var = new m0();
                float fAbs = Math.abs(fB) * Math.signum(this.f1193h);
                m0Var.f66406a = fAbs;
                this.f1194j.b(vq.b.d(fAbs));
                h hVar = h.this;
                h2 h2Var = this.f1195k;
                float f15 = m0Var.f66406a;
                float f16 = this.f1193h;
                final er.l<Float, i0> lVar = this.f1194j;
                er.l lVar2 = new er.l() { // from class: a1.i
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h.b.V(m0Var, lVar, ((Float) obj2).floatValue());
                    }
                };
                this.f1190e = m0Var;
                this.f1191f = 1;
                objM = hVar.m(h2Var, f15, f16, lVar2, this);
                if (objM != objE) {
                }
            }
            if (i15 != 1) {
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            m0 m0Var2 = (m0) this.f1190e;
            u.b(obj);
            m0Var = m0Var2;
            objM = obj;
            AnimationState animationState = (AnimationState) objM;
            float fA = h.this.snapLayoutInfoProvider.a(((Number) animationState.y()).floatValue());
            if (Float.isNaN(fA)) {
                c1.e.c("calculateSnapOffset returned NaN. Please use a valid value.");
            }
            m0Var.f66406a = fA;
            h2 h2Var2 = this.f1195k;
            AnimationState animationStateG = u0.o.g(animationState, 0.0f, 0.0f, 0L, 0L, false, 30, null);
            u0.l lVar3 = h.this.snapAnimationSpec;
            final er.l<Float, i0> lVar4 = this.f1194j;
            er.l lVar5 = new er.l() { // from class: a1.j
                @Override // er.l
                public final Object b(Object obj2) {
                    return h.b.X(m0Var, lVar4, ((Float) obj2).floatValue());
                }
            };
            this.f1190e = null;
            this.f1191f = 2;
            Object objI = m.i(h2Var2, fA, fA, animationStateG, lVar3, lVar5, this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super a1.a<Float, u0.p>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return h.this.new b(this.f1193h, this.f1194j, this.f1195k, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1196d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1198f;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1196d = obj;
            this.f1198f |= PKIFailureInfo.systemUnavail;
            return h.this.b(null, 0.0f, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f1199d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f1201f;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f1199d = obj;
            this.f1201f |= PKIFailureInfo.systemUnavail;
            return h.this.m(null, 0.0f, 0.0f, null, this);
        }
    }

    public h(n nVar, c0<Float> c0Var, u0.l<Float> lVar) {
        this.snapLayoutInfoProvider = nVar;
        this.decayAnimationSpec = c0Var;
        this.snapAnimationSpec = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(h2 h2Var, float f15, er.l<? super Float, i0> lVar, tq.e<? super a1.a<Float, u0.p>> eVar) throws Throwable {
        a aVar;
        er.l<? super Float, i0> lVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f1189g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f1189g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objG = aVar.f1187e;
        Object objE = uq.b.e();
        int i16 = aVar.f1189g;
        if (i16 == 0) {
            u.b(objG);
            f3.o oVar = this.motionScaleDuration;
            b bVar = new b(f15, lVar, h2Var, null);
            aVar.f1186d = lVar;
            aVar.f1189g = 1;
            objG = ju.i.g(oVar, bVar, aVar);
            if (objG == objE) {
                return objE;
            }
            lVar2 = lVar;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar2 = (er.l) aVar.f1186d;
            u.b(objG);
        }
        a1.a aVar2 = (a1.a) objG;
        lVar2.b(vq.b.d(0.0f));
        return aVar2;
    }

    private final boolean k(float offset, float velocity) {
        return Math.abs(e0.a(this.decayAnimationSpec, 0.0f, velocity)) >= Math.abs(offset);
    }

    private final Object l(h2 h2Var, float f15, float f16, er.l<? super Float, i0> lVar, tq.e<? super a1.a<Float, u0.p>> eVar) {
        return m.k(h2Var, f15, f16, k(f15, f16) ? new a1.c(this.decayAnimationSpec) : new q(this.snapAnimationSpec), lVar, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object m(h2 h2Var, float f15, float f16, er.l<? super Float, i0> lVar, tq.e<? super AnimationState<Float, u0.p>> eVar) throws Throwable {
        d dVar;
        h hVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f1201f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f1201f = i15 - PKIFailureInfo.systemUnavail;
                hVar = this;
            } else {
                hVar = this;
                dVar = hVar.new d(eVar);
            }
        } else {
            hVar = this;
            dVar = hVar.new d(eVar);
        }
        d dVar2 = dVar;
        Object objL = dVar2.f1199d;
        Object objE = uq.b.e();
        int i16 = dVar2.f1201f;
        if (i16 == 0) {
            u.b(objL);
            if (Math.abs(f15) == 0.0f || Math.abs(f16) == 0.0f) {
                return u0.o.c(f15, f16, 0L, 0L, false, 28, null);
            }
            dVar2.f1201f = 1;
            objL = hVar.l(h2Var, f15, f16, lVar, dVar2);
            if (objL == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objL);
        }
        return ((a1.a) objL).c();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p143z0.d3
    public Object b(h2 h2Var, float f15, er.l<? super Float, i0> lVar, tq.e<? super Float> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f1198f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f1198f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objJ = cVar.f1196d;
        Object objE = uq.b.e();
        int i16 = cVar.f1198f;
        if (i16 == 0) {
            u.b(objJ);
            cVar.f1198f = 1;
            objJ = j(h2Var, f15, lVar, cVar);
            if (objJ == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objJ);
        }
        a1.a aVar = (a1.a) objJ;
        return vq.b.d(((Number) aVar.a()).floatValue() != 0.0f ? ((Number) aVar.b().y()).floatValue() : 0.0f);
    }

    public boolean equals(Object other) {
        if (other instanceof h) {
            h hVar = (h) other;
            if (t.c(hVar.snapAnimationSpec, this.snapAnimationSpec) && t.c(hVar.decayAnimationSpec, this.decayAnimationSpec) && t.c(hVar.snapLayoutInfoProvider, this.snapLayoutInfoProvider)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.snapAnimationSpec.hashCode() * 31) + this.decayAnimationSpec.hashCode()) * 31) + this.snapLayoutInfoProvider.hashCode();
    }
}
