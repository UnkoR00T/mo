package u0;

import java.util.concurrent.CancellationException;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p076m2.c6;
import p076m2.f6;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004B;\b\u0007\u0012\u0006\u0010\u0005\u001a\u00028\u0000\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00018\u0000\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJZ\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r2\u0006\u0010\u000f\u001a\u00028\u00002 \u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJb\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00132\u0006\u0010\u001b\u001a\u00028\u00002\u000e\b\u0002\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c2\b\b\u0002\u0010\u000f\u001a\u00028\u00002\"\b\u0002\u0010\u0012\u001a\u001c\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010H\u0086@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0018\u0010 \u001a\u00020\u00112\u0006\u0010\u001b\u001a\u00028\u0000H\u0086@¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0011H\u0086@¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000$¢\u0006\u0004\b%\u0010&R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0016\u0010\b\u001a\u0004\u0018\u00018\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001018\u0000X\u0080\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R+\u0010>\u001a\u0002072\u0006\u00108\u001a\u0002078F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u001e\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R+\u0010\u001b\u001a\u00028\u00002\u0006\u00108\u001a\u00028\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b?\u00109\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010F\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010ER \u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010N\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u0019\u0010L\u0012\u0004\bM\u0010\u001aR\u001a\u0010P\u001a\u00028\u00018\u0002X\u0082\u0004¢\u0006\f\n\u0004\b4\u0010L\u0012\u0004\bO\u0010\u001aR\u0016\u0010Q\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010LR\u0016\u0010R\u001a\u00028\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010LR\u0011\u0010\u0016\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bS\u0010AR\u0011\u0010V\u001a\u00028\u00018F¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0011\u0010X\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\bW\u0010A¨\u0006Y"}, d2 = {"Lu0/c;", "T", "Lu0/t;", "V", "", "initialValue", "Lu0/y2;", "typeConverter", "visibilityThreshold", "", AnnotatedPrivateKey.LABEL, "<init>", "(Ljava/lang/Object;Lu0/y2;Ljava/lang/Object;Ljava/lang/String;)V", "Lu0/g;", "animation", "initialVelocity", "Lkotlin/Function1;", "Loq/i0;", "block", "Lu0/j;", "q", "(Lu0/g;Ljava/lang/Object;Ler/l;Ltq/e;)Ljava/lang/Object;", "value", "h", "(Ljava/lang/Object;)Ljava/lang/Object;", "i", "()V", "targetValue", "Lu0/l;", "animationSpec", "e", "(Ljava/lang/Object;Lu0/l;Ljava/lang/Object;Ler/l;Ltq/e;)Ljava/lang/Object;", "t", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "u", "(Ltq/e;)Ljava/lang/Object;", "Lm2/f6;", "g", "()Lm2/f6;", "a", "Lu0/y2;", "l", "()Lu0/y2;", "b", "Ljava/lang/Object;", "c", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "Lu0/n;", "d", "Lu0/n;", "j", "()Lu0/n;", "internalState", "", "<set-?>", "Lm2/a3;", "p", "()Z", "r", "(Z)V", "isRunning", "f", "k", "()Ljava/lang/Object;", "s", "(Ljava/lang/Object;)V", "Lu0/g1;", "Lu0/g1;", "mutatorMutex", "Lu0/q1;", "Lu0/q1;", "getDefaultSpringSpec$animation_core", "()Lu0/q1;", "defaultSpringSpec", "Lu0/t;", "getNegativeInfinityBounds$annotations", "negativeInfinityBounds", "getPositiveInfinityBounds$annotations", "positiveInfinityBounds", "lowerBoundVector", "upperBoundVector", "m", "o", "()Lu0/t;", "velocityVector", "n", "velocity", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c<T, V extends t> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y2<T, V> typeConverter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final T visibilityThreshold;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String label;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AnimationState<T, V> internalState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 isRunning;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 targetValue;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g1 mutatorMutex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final q1<T> defaultSpringSpec;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final V negativeInfinityBounds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final V positiveInfinityBounds;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private V lowerBoundVector;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private V upperBoundVector;

    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0003\"\u0004\b\u0000\u0010\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lu0/t;", "V", "Lu0/j;", "<anonymous>", "()Lu0/j;"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.l<tq.e<? super AnimationResult<T, V>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ c<T, V> f193540h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ T f193541j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ g<T, V> f193542k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f193543l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ er.l<c<T, V>, oq.i0> f193544m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(c<T, V> cVar, T t15, g<T, V> gVar, long j15, er.l<? super c<T, V>, oq.i0> lVar, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f193540h = cVar;
            this.f193541j = t15;
            this.f193542k = gVar;
            this.f193543l = j15;
            this.f193544m = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final oq.i0 V(c cVar, AnimationState animationState, er.l lVar, fr.l0 l0Var, k kVar) {
            e2.F(kVar, cVar.j());
            Object objH = cVar.h(kVar.e());
            if (!fr.t.c(objH, kVar.e())) {
                cVar.j().E(objH);
                animationState.E(objH);
                if (lVar != null) {
                    lVar.b(cVar);
                }
                kVar.a();
                l0Var.f66404a = true;
            } else if (lVar != null) {
                lVar.b(cVar);
            }
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            AnimationState animationState;
            fr.l0 l0Var;
            Object objE = uq.b.e();
            int i15 = this.f193539g;
            try {
                if (i15 == 0) {
                    oq.u.b(obj);
                    this.f193540h.j().F(this.f193540h.l().a().b(this.f193541j));
                    this.f193540h.s(this.f193542k.g());
                    this.f193540h.r(true);
                    final AnimationState animationStateH = o.h(this.f193540h.j(), null, null, 0L, Long.MIN_VALUE, false, 23, null);
                    final fr.l0 l0Var2 = new fr.l0();
                    g<T, V> gVar = this.f193542k;
                    long j15 = this.f193543l;
                    final c<T, V> cVar = this.f193540h;
                    final er.l<c<T, V>, oq.i0> lVar = this.f193544m;
                    er.l lVar2 = new er.l() { // from class: u0.b
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return c.a.V(cVar, animationStateH, lVar, l0Var2, (k) obj2);
                        }
                    };
                    this.f193537e = animationStateH;
                    this.f193538f = l0Var2;
                    this.f193539g = 1;
                    if (e2.k(animationStateH, gVar, j15, lVar2, this) == objE) {
                        return objE;
                    }
                    animationState = animationStateH;
                    l0Var = l0Var2;
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    l0Var = (fr.l0) this.f193538f;
                    animationState = (AnimationState) this.f193537e;
                    oq.u.b(obj);
                }
                h hVar = l0Var.f66404a ? h.BoundReached : h.Finished;
                this.f193540h.i();
                return new AnimationResult(animationState, hVar);
            } catch (CancellationException e15) {
                this.f193540h.i();
                throw e15;
            }
        }

        public final tq.e<oq.i0> N(tq.e<?> eVar) {
            return new a(this.f193540h, this.f193541j, this.f193542k, this.f193543l, this.f193544m, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super AnimationResult<T, V>> eVar) {
            return ((a) N(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193545e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c<T, V> f193546f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ T f193547g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<T, V> cVar, T t15, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f193546f = cVar;
            this.f193547g = t15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f193545e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f193546f.i();
            Object objH = this.f193546f.h(this.f193547g);
            this.f193546f.j().E(objH);
            this.f193546f.s(objH);
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new b(this.f193546f, this.f193547g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: u0.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class C5046c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193548e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c<T, V> f193549f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5046c(c<T, V> cVar, tq.e<? super C5046c> eVar) {
            super(1, eVar);
            this.f193549f = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f193548e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f193549f.i();
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return new C5046c(this.f193549f, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((C5046c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public c(T t15, y2<T, V> y2Var, T t16, String str) {
        this.typeConverter = y2Var;
        this.visibilityThreshold = t16;
        this.label = str;
        this.internalState = new AnimationState<>(y2Var, t15, null, 0L, 0L, false, 60, null);
        this.isRunning = c6.e(Boolean.FALSE, null, 2, null);
        this.targetValue = c6.e(t15, null, 2, null);
        this.mutatorMutex = new g1();
        this.defaultSpringSpec = new q1<>(0.0f, 0.0f, t16, 3, null);
        t tVarO = o();
        V v15 = tVarO instanceof p ? d.f193570e : tVarO instanceof q ? d.f193571f : tVarO instanceof r ? d.f193572g : d.f193573h;
        this.negativeInfinityBounds = v15;
        t tVarO2 = o();
        V v16 = tVarO2 instanceof p ? d.f193566a : tVarO2 instanceof q ? d.f193567b : tVarO2 instanceof r ? d.f193568c : d.f193569d;
        this.positiveInfinityBounds = v16;
        this.lowerBoundVector = v15;
        this.upperBoundVector = v16;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object f(c cVar, Object obj, l lVar, Object obj2, er.l lVar2, tq.e eVar, int i15, Object obj3) {
        if ((i15 & 2) != 0) {
            lVar = cVar.defaultSpringSpec;
        }
        l lVar3 = lVar;
        if ((i15 & 4) != 0) {
            obj2 = cVar.n();
        }
        Object obj4 = obj2;
        if ((i15 & 8) != 0) {
            lVar2 = null;
        }
        return cVar.e(obj, lVar3, obj4, lVar2, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final T h(T value) {
        if (fr.t.c(this.lowerBoundVector, this.negativeInfinityBounds) && fr.t.c(this.upperBoundVector, this.positiveInfinityBounds)) {
            return value;
        }
        V vB = this.typeConverter.a().b(value);
        int size = vB.getSize();
        boolean z15 = false;
        for (int i15 = 0; i15 < size; i15++) {
            if (vB.a(i15) < this.lowerBoundVector.a(i15) || vB.a(i15) > this.upperBoundVector.a(i15)) {
                vB.e(i15, lr.m.m(vB.a(i15), this.lowerBoundVector.a(i15), this.upperBoundVector.a(i15)));
                z15 = true;
            }
        }
        return z15 ? this.typeConverter.b().b(vB) : value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void i() {
        AnimationState<T, V> animationState = this.internalState;
        animationState.z().d();
        animationState.C(Long.MIN_VALUE);
        r(false);
    }

    private final Object q(g<T, V> gVar, T t15, er.l<? super c<T, V>, oq.i0> lVar, tq.e<? super AnimationResult<T, V>> eVar) {
        return g1.e(this.mutatorMutex, null, new a(this, t15, gVar, this.internalState.getLastFrameTimeNanos(), lVar, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean z15) {
        this.isRunning.setValue(Boolean.valueOf(z15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s(T t15) {
        this.targetValue.setValue(t15);
    }

    public final Object e(T t15, l<T> lVar, T t16, er.l<? super c<T, V>, oq.i0> lVar2, tq.e<? super AnimationResult<T, V>> eVar) {
        return q(i.a(lVar, this.typeConverter, m(), t15, t16), t16, lVar2, eVar);
    }

    public final f6<T> g() {
        return this.internalState;
    }

    public final AnimationState<T, V> j() {
        return this.internalState;
    }

    public final T k() {
        return this.targetValue.getValue();
    }

    public final y2<T, V> l() {
        return this.typeConverter;
    }

    public final T m() {
        return this.internalState.getValue();
    }

    public final T n() {
        return (T) this.typeConverter.b().b(o());
    }

    public final V o() {
        return (V) this.internalState.z();
    }

    public final boolean p() {
        return ((Boolean) this.isRunning.getValue()).booleanValue();
    }

    public final Object t(T t15, tq.e<? super oq.i0> eVar) {
        Object objE = g1.e(this.mutatorMutex, null, new b(this, t15, null), eVar, 1, null);
        return objE == uq.b.e() ? objE : oq.i0.f148189a;
    }

    public final Object u(tq.e<? super oq.i0> eVar) {
        Object objE = g1.e(this.mutatorMutex, null, new C5046c(this, null), eVar, 1, null);
        return objE == uq.b.e() ? objE : oq.i0.f148189a;
    }

    public /* synthetic */ c(Object obj, y2 y2Var, Object obj2, String str, int i15, fr.k kVar) {
        this(obj, y2Var, (i15 & 4) != 0 ? null : obj2, (i15 & 8) != 0 ? "Animatable" : str);
    }
}
