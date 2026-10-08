package h2;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002Bo\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b\u0012\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J&\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00028\u00002\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\tH\u0086@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\u00020\u00182\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\b\b\u0002\u0010 \u001a\u00028\u0000¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00052\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b#\u0010\u001dJ \u0010'\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0005H\u0080@¢\u0006\u0004\b'\u0010(R(\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\t8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b'\u00105\u001a\u0004\b6\u00107R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010*\u001a\u0004\b8\u0010,R#\u0010?\u001a\b\u0012\u0004\u0012\u00028\u0000098\u0006¢\u0006\u0012\n\u0004\b\u0012\u0010:\u0012\u0004\b=\u0010>\u001a\u0004\b;\u0010<R\u001b\u0010\u0016\u001a\u00028\u00008FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010@\u001a\u0004\bA\u0010BR\u0011\u0010D\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bC\u0010BR\u0011\u0010F\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bE\u0010BR\u0011\u0010H\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\bG\u0010\u0015R\u0017\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e8F¢\u0006\u0006\u001a\u0004\bI\u0010JR\u0011\u0010N\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\bL\u0010M¨\u0006O"}, d2 = {"Lh2/q1;", "T", "", "initialValue", "Lkotlin/Function1;", "", "positionalThreshold", "Lkotlin/Function0;", "velocityThreshold", "Lu0/l;", "snapAnimationSpec", "Lu0/c0;", "decayAnimationSpec", "", "confirmValueChange", "<init>", "(Ljava/lang/Object;Ler/l;Ler/a;Lu0/l;Lu0/c0;Ler/l;)V", "currentOffset", "f", "(F)Ljava/lang/Object;", "p", "()F", "targetValue", "animationSpec", "Loq/i0;", "e", "(Ljava/lang/Object;Lu0/l;Ltq/e;)Ljava/lang/Object;", "delta", "g", "(F)F", "Lz0/v0;", "newAnchors", "newTarget", "r", "(Lz0/v0;Ljava/lang/Object;)V", "o", "Lz0/e1;", "flingBehavior", "initialVelocity", "d", "(Lz0/e1;FLtq/e;)Ljava/lang/Object;", "a", "Ler/l;", "getPositionalThreshold$material3", "()Ler/l;", "b", "Ler/a;", "getVelocityThreshold$material3", "()Ler/a;", "c", "Lu0/l;", "getSnapAnimationSpec$material3", "()Lu0/l;", "Lu0/c0;", "getDecayAnimationSpec$material3", "()Lu0/c0;", "getConfirmValueChange", "Lz0/r;", "Lz0/r;", "h", "()Lz0/r;", "getAnchoredDraggableState$annotations", "()V", "anchoredDraggableState", "Lm2/f6;", "m", "()Ljava/lang/Object;", "k", "currentValue", "j", "closestValue", "l", "offset", "i", "()Lz0/v0;", "anchors", "n", "()Z", "isAnimationRunning", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<Float, Float> positionalThreshold;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.a<Float> velocityThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u0.l<Float> snapAnimationSpec;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u0.c0<Float> decayAnimationSpec;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.l<T, Boolean> confirmValueChange;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p143z0.r<T> anchoredDraggableState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final f6 targetValue;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f79960d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f79961e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ q1<T> f79962f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f79963g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(q1<T> q1Var, tq.e<? super a> eVar) {
            super(eVar);
            this.f79962f = q1Var;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f79961e = obj;
            this.f79963g |= PKIFailureInfo.systemUnavail;
            return this.f79962f.d(null, 0.0f, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lz0/b;", "Lz0/v0;", "it", "Loq/i0;", "<anonymous>", "(Lz0/b;Lz0/v0;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.q<p143z0.b, p143z0.v0<T>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79964e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f79965f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ fr.m0 f79966g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ p143z0.e1 f79967h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q1<T> f79968j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ float f79969k;

        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"h2/q1$b$a", "Lz0/h2;", "", "pixels", "d", "(F)F", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements p143z0.h2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q1<T> f79970a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p143z0.b f79971b;

            a(q1<T> q1Var, p143z0.b bVar) {
                this.f79970a = q1Var;
                this.f79971b = bVar;
            }

            @Override // p143z0.h2
            public float d(float pixels) {
                float fO = this.f79970a.o(pixels);
                float fL = fO - this.f79970a.l();
                p143z0.b.b(this.f79971b, fO, 0.0f, 2, null);
                return fL;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fr.m0 m0Var, p143z0.e1 e1Var, q1<T> q1Var, float f15, tq.e<? super b> eVar) {
            super(3, eVar);
            this.f79966g = m0Var;
            this.f79967h = e1Var;
            this.f79968j = q1Var;
            this.f79969k = f15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fr.m0 m0Var;
            Object objE = uq.b.e();
            int i15 = this.f79964e;
            if (i15 == 0) {
                oq.u.b(obj);
                a aVar = new a(this.f79968j, (p143z0.b) this.f79965f);
                fr.m0 m0Var2 = this.f79966g;
                p143z0.e1 e1Var = this.f79967h;
                float f15 = this.f79969k;
                this.f79965f = m0Var2;
                this.f79964e = 1;
                Object objA = e1Var.a(aVar, f15, this);
                if (objA == objE) {
                    return objE;
                }
                m0Var = m0Var2;
                obj = objA;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                m0Var = (fr.m0) this.f79965f;
                oq.u.b(obj);
            }
            m0Var.f66406a = ((Number) obj).floatValue();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p143z0.b bVar, p143z0.v0<T> v0Var, tq.e<? super oq.i0> eVar) {
            b bVar2 = new b(this.f79966g, this.f79967h, this.f79968j, this.f79969k, eVar);
            bVar2.f79965f = bVar;
            return bVar2.J(oq.i0.f148189a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public q1(T t15, er.l<? super Float, Float> lVar, er.a<Float> aVar, u0.l<Float> lVar2, u0.c0<Float> c0Var, er.l<? super T, Boolean> lVar3) {
        this.positionalThreshold = lVar;
        this.velocityThreshold = aVar;
        this.snapAnimationSpec = lVar2;
        this.decayAnimationSpec = c0Var;
        this.confirmValueChange = lVar3;
        this.anchoredDraggableState = (lVar == 0 || aVar == null) ? new p143z0.r<>(t15, lVar3) : p143z0.j.g(t15, lVar, aVar, lVar2, c0Var, lVar3);
        this.targetValue = x5.d(new er.a() { // from class: h2.p1
            @Override // er.a
            public final Object a() {
                return q1.q(this.f79948a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj) {
        return true;
    }

    private final T f(float currentOffset) {
        if (Float.isNaN(currentOffset)) {
            return k();
        }
        float fC = i().c(k());
        if (Float.isNaN(fC) || currentOffset == fC) {
            return k();
        }
        T tB = i().b(currentOffset);
        return tB == null ? k() : tB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object q(q1 q1Var) {
        return q1Var.n() ? q1Var.anchoredDraggableState.B() : q1Var.f(q1Var.l());
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object d(p143z0.e1 e1Var, float f15, tq.e<? super Float> eVar) throws Throwable {
        a aVar;
        fr.m0 m0Var;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f79963g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f79963g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(this, eVar);
            }
        } else {
            aVar = new a(this, eVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f79961e;
        Object objE = uq.b.e();
        int i16 = aVar2.f79963g;
        if (i16 == 0) {
            oq.u.b(obj);
            fr.m0 m0Var2 = new fr.m0();
            p143z0.r<T> rVar = this.anchoredDraggableState;
            b bVar = new b(m0Var2, e1Var, this, f15, null);
            m0Var = m0Var2;
            aVar2.f79960d = m0Var;
            aVar2.f79963g = 1;
            if (p143z0.r.m(rVar, null, bVar, aVar2, 1, null) == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            m0Var = (fr.m0) aVar2.f79960d;
            oq.u.b(obj);
        }
        return vq.b.d(m0Var.f66406a);
    }

    public final Object e(T t15, u0.l<Float> lVar, tq.e<? super oq.i0> eVar) throws Throwable {
        Object objV = p143z0.j.v(this.anchoredDraggableState, t15, lVar, eVar);
        return objV == uq.b.e() ? objV : oq.i0.f148189a;
    }

    public final float g(float delta) {
        return this.anchoredDraggableState.q(delta);
    }

    public final p143z0.r<T> h() {
        return this.anchoredDraggableState;
    }

    public final p143z0.v0<T> i() {
        return this.anchoredDraggableState.r();
    }

    public final T j() {
        return this.anchoredDraggableState.t();
    }

    public final T k() {
        return this.anchoredDraggableState.z();
    }

    public final float l() {
        return this.anchoredDraggableState.x();
    }

    public final T m() {
        return (T) this.targetValue.getValue();
    }

    public final boolean n() {
        return this.anchoredDraggableState.E();
    }

    public final float o(float delta) {
        return lr.m.m((Float.isNaN(l()) ? 0.0f : l()) + delta, this.anchoredDraggableState.r().e(), this.anchoredDraggableState.r().g());
    }

    public final float p() {
        return this.anchoredDraggableState.H();
    }

    public final void r(p143z0.v0<T> newAnchors, T newTarget) {
        this.anchoredDraggableState.V(newAnchors, newTarget);
    }

    public /* synthetic */ q1(Object obj, er.l lVar, er.a aVar, u0.l lVar2, u0.c0 c0Var, er.l lVar3, int i15, fr.k kVar) {
        this(obj, (i15 & 2) != 0 ? null : lVar, (i15 & 4) != 0 ? null : aVar, (i15 & 8) != 0 ? u0.m.j(0.0f, 0.0f, null, 7, null) : lVar2, (i15 & 16) != 0 ? u0.e0.c(0.0f, 0.0f, 3, null) : c0Var, (i15 & 32) != 0 ? new er.l() { // from class: h2.o1
            @Override // er.l
            public final Object b(Object obj2) {
                return Boolean.valueOf(q1.c(obj2));
            }
        } : lVar3);
    }
}
