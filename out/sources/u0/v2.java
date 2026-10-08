package u0;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import u0.k2.a;
import u0.k2.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000^\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a5\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\t\u0010\n\u001a5\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001ac\u0010\u0014\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0013R\b\u0012\u0004\u0012\u00028\u00000\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001aC\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u0016\u001a\u00028\u00012\u0006\u0010\u0001\u001a\u00028\u00012\u0006\u0010\u0017\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0018\u0010\u0019\u001ao\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010\u001e\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001c2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u001f\u0010 \u001ak\u0010$\u001a\u00020#\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u0000\"\b\b\u0002\u0010\u0010*\u00020\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00042\u001c\u0010\"\u001a\u0018\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020!R\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\u001a\u001a\u00028\u00012\u0006\u0010\u001b\u001a\u00028\u00012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001cH\u0003¢\u0006\u0004\b$\u0010%\"$\u0010*\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030'\u0012\u0004\u0012\u00020#0&8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006+"}, d2 = {"T", "targetState", "", AnnotatedPrivateKey.LABEL, "Lu0/k2;", "x", "(Ljava/lang/Object;Ljava/lang/String;Lm2/r;II)Lu0/k2;", "Lu0/w2;", "transitionState", "t", "(Lu0/w2;Ljava/lang/String;Lm2/r;II)Lu0/k2;", "Lu0/d1;", "y", "(Lu0/d1;Ljava/lang/String;Lm2/r;II)Lu0/k2;", ip.a.f96137b, "Lu0/t;", "V", "Lu0/y2;", "typeConverter", "Lu0/k2$a;", "p", "(Lu0/k2;Lu0/y2;Ljava/lang/String;Lm2/r;II)Lu0/k2$a;", "initialState", "childLabel", "n", "(Lu0/k2;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/String;Lm2/r;I)Lu0/k2;", "initialValue", "targetValue", "Lu0/j0;", "animationSpec", "Lm2/f6;", "r", "(Lu0/k2;Ljava/lang/Object;Ljava/lang/Object;Lu0/j0;Lu0/y2;Ljava/lang/String;Lm2/r;I)Lm2/f6;", "Lu0/k2$d;", "transitionAnimation", "Loq/i0;", "k", "(Lu0/k2;Lu0/k2$d;Ljava/lang/Object;Ljava/lang/Object;Lu0/j0;Lm2/r;I)V", "Lkotlin/Function1;", "Lu0/m1;", "a", "Ler/l;", "SeekableTransitionStateTotalDurationChanged", "animation-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class v2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final er.l<m1<?>, oq.i0> f193911a = new er.l() { // from class: u0.s2
        @Override // er.l
        public final Object b(Object obj) {
            return v2.j((m1) obj);
        }
    };

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"u0/v2$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f193912a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2 f193913b;

        public a(k2 k2Var, k2 k2Var2) {
            this.f193912a = k2Var;
            this.f193913b = k2Var2;
        }

        @Override // p076m2.r0
        public void j() {
            this.f193912a.K(this.f193913b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"u0/v2$b", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f193914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2.a f193915b;

        public b(k2 k2Var, k2.a aVar) {
            this.f193914a = k2Var;
            this.f193915b = aVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f193914a.I(this.f193915b);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"u0/v2$c", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f193916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2.d f193917b;

        public c(k2 k2Var, k2.d dVar) {
            this.f193916a = k2Var;
            this.f193917b = dVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f193916a.J(this.f193917b);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f193918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f193919f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(er.a<oq.i0> aVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f193919f = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f193918e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f193919f.a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new d(this.f193919f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f193920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f193921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f193922g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ w2<T> f193923h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(w2<T> w2Var, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f193923h = w2Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a compositionContinuationMutex;
            w2 w2Var;
            Object objE = uq.b.e();
            int i15 = this.f193922g;
            if (i15 == 0) {
                oq.u.b(obj);
                ((m1) this.f193923h).M();
                compositionContinuationMutex = ((m1) this.f193923h).getCompositionContinuationMutex();
                w2 w2Var2 = this.f193923h;
                this.f193920e = compositionContinuationMutex;
                this.f193921f = w2Var2;
                this.f193922g = 1;
                if (compositionContinuationMutex.h(null, this) == objE) {
                    return objE;
                }
                w2Var = w2Var2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                w2Var = (w2) this.f193921f;
                compositionContinuationMutex = (su.a) this.f193920e;
                oq.u.b(obj);
            }
            try {
                ((m1) w2Var).U(((m1) w2Var).b());
                ju.n nVarH = ((m1) w2Var).H();
                if (nVarH != null) {
                    oq.t.Companion companion = oq.t.INSTANCE;
                    nVarH.i(oq.t.b(((m1) w2Var).b()));
                }
                ((m1) w2Var).V(null);
                oq.i0 i0Var = oq.i0.f148189a;
                return oq.i0.f148189a;
            } finally {
                compositionContinuationMutex.r(null);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f193923h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"u0/v2$f", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ w2 f193924a;

        public f(w2 w2Var) {
            this.f193924a = w2Var;
        }

        @Override // p076m2.r0
        public void j() {
            ((m1) this.f193924a).X(null);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"u0/v2$g", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f193925a;

        public g(k2 k2Var) {
            this.f193925a = k2Var;
        }

        @Override // p076m2.r0
        public void j() {
            this.f193925a.D();
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"u0/v2$h", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements p076m2.r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ k2 f193926a;

        public h(k2 k2Var) {
            this.f193926a = k2Var;
        }

        @Override // p076m2.r0
        public void j() {
            this.f193926a.D();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(m1 m1Var) {
        m1Var.N();
        return oq.i0.f148189a;
    }

    private static final <S, T, V extends t> void k(final k2<S> k2Var, final k2<S>.d<T, V> dVar, final T t15, final T t16, final j0<T> j0Var, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(867041821);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(k2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.W(dVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(t15) : rVarH.G(t15) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(t16) : rVarH.G(t16) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i16 |= (32768 & i15) == 0 ? rVarH.W(j0Var) : rVarH.G(j0Var) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (rVarH.r((i16 & 9363) != 9362, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(867041821, i16, -1, "androidx.compose.animation.core.UpdateInitialAndTargetValues (Transition.kt:1927)");
            }
            if (k2Var.B()) {
                dVar.R(t15, t16, j0Var);
            } else {
                dVar.T(t16, j0Var);
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: u0.n2
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v2.l(k2Var, dVar, t15, t16, j0Var, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(k2 k2Var, k2.d dVar, Object obj, Object obj2, j0 j0Var, int i15, p076m2.r rVar, int i16) {
        k(k2Var, dVar, obj, obj2, j0Var, rVar, p076m2.g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final <S, T> k2<T> n(final k2<S> k2Var, T t15, T t16, String str, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-198307638, i15, -1, "androidx.compose.animation.core.createChildTransitionInternal (Transition.kt:1800)");
        }
        int i16 = (i15 & 14) ^ 6;
        boolean z15 = true;
        boolean z16 = (i16 > 4 && rVar.W(k2Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z16 || objE == p076m2.r.INSTANCE.a()) {
            objE = new k2(new d1(t15), k2Var, k2Var.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String() + " > " + str);
            rVar.v(objE);
        }
        final k2<T> k2Var2 = (k2) objE;
        if ((i16 <= 4 || !rVar.W(k2Var)) && (i15 & 6) != 4) {
            z15 = false;
        }
        boolean zW = rVar.W(k2Var2) | z15;
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: u0.q2
                @Override // er.l
                public final Object b(Object obj) {
                    return v2.o(k2Var, k2Var2, (p076m2.s0) obj);
                }
            };
            rVar.v(objE2);
        }
        Function0.a(k2Var2, (er.l) objE2, rVar, 0);
        if (k2Var.B()) {
            k2Var2.M(t15, t16, k2Var.getLastSeekedTimeNanos());
        } else {
            k2Var2.Y(t16);
            k2Var2.Q(false);
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return k2Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 o(k2 k2Var, k2 k2Var2, p076m2.s0 s0Var) {
        k2Var.g(k2Var2);
        return new a(k2Var, k2Var2);
    }

    public static final <S, T, V extends t> k2<S>.a<T, V> p(final k2<S> k2Var, y2<T, V> y2Var, String str, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            str = "DeferredAnimation";
        }
        if (p076m2.t.k()) {
            p076m2.t.o(-1714122528, i15, -1, "androidx.compose.animation.core.createDeferredAnimation (Transition.kt:1758)");
        }
        int i17 = (i15 & 14) ^ 6;
        boolean z15 = true;
        boolean z16 = (i17 > 4 && rVar.W(k2Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z16 || objE == p076m2.r.INSTANCE.a()) {
            objE = k2Var.new a(y2Var, str);
            rVar.v(objE);
        }
        final k2<S>.a<T, V> aVar = (k2.a) objE;
        if ((i17 <= 4 || !rVar.W(k2Var)) && (i15 & 6) != 4) {
            z15 = false;
        }
        boolean zG = rVar.G(aVar) | z15;
        Object objE2 = rVar.E();
        if (zG || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: u0.r2
                @Override // er.l
                public final Object b(Object obj) {
                    return v2.q(k2Var, aVar, (p076m2.s0) obj);
                }
            };
            rVar.v(objE2);
        }
        Function0.a(aVar, (er.l) objE2, rVar, 0);
        if (k2Var.B()) {
            aVar.d();
        }
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 q(k2 k2Var, k2.a aVar, p076m2.s0 s0Var) {
        return new b(k2Var, aVar);
    }

    public static final <S, T, V extends t> f6<T> r(final k2<S> k2Var, T t15, T t16, j0<T> j0Var, y2<T, V> y2Var, String str, p076m2.r rVar, int i15) throws Throwable {
        c3.l lVar;
        if (p076m2.t.k()) {
            p076m2.t.o(-304821198, i15, -1, "androidx.compose.animation.core.createTransitionAnimation (Transition.kt:1889)");
        }
        int i16 = i15 & 14;
        int i17 = i16 ^ 6;
        boolean z15 = (i17 > 4 && rVar.W(k2Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            c3.l.Companion companion = c3.l.INSTANCE;
            c3.l lVarD = companion.d();
            er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                lVar = lVarE;
                try {
                    Object dVar = k2Var.new d(t15, o.i(y2Var, t16), y2Var, str);
                    companion.l(lVarD, lVar, lVarG);
                    rVar.v(dVar);
                    objE = dVar;
                } catch (Throwable th4) {
                    th = th4;
                    companion.l(lVarD, lVar, lVarG);
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                lVar = lVarE;
            }
        }
        final k2.d dVar2 = (k2.d) objE;
        int i18 = (i15 >> 3) & 8;
        int i19 = i15 << 3;
        k(k2Var, dVar2, t15, t16, j0Var, rVar, (i18 << 9) | (i18 << 6) | i16 | (i19 & 896) | (i19 & 7168) | (57344 & i19));
        boolean zW = rVar.W(dVar2) | ((i17 > 4 && rVar.W(k2Var)) || (i15 & 6) == 4);
        Object objE2 = rVar.E();
        if (zW || objE2 == p076m2.r.INSTANCE.a()) {
            objE2 = new er.l() { // from class: u0.m2
                @Override // er.l
                public final Object b(Object obj) {
                    return v2.s(k2Var, dVar2, (p076m2.s0) obj);
                }
            };
            rVar.v(objE2);
        }
        Function0.a(dVar2, (er.l) objE2, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return dVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 s(k2 k2Var, k2.d dVar, p076m2.s0 s0Var) {
        k2Var.f(dVar);
        return new c(k2Var, dVar);
    }

    public static final <T> k2<T> t(final w2<T> w2Var, String str, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            str = null;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(1643203617, i15, -1, "androidx.compose.animation.core.rememberTransition (Transition.kt:811)");
        }
        int i17 = (i15 & 14) ^ 6;
        boolean z15 = true;
        boolean z16 = (i17 > 4 && rVar.W(w2Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z16 || objE == p076m2.r.INSTANCE.a()) {
            c3.l.Companion companion = c3.l.INSTANCE;
            c3.l lVarD = companion.d();
            er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                Object k2Var = new k2((w2) w2Var, str);
                companion.l(lVarD, lVarE, lVarG);
                rVar.v(k2Var);
                objE = k2Var;
            } catch (Throwable th4) {
                companion.l(lVarD, lVarE, lVarG);
                throw th4;
            }
        }
        final k2<T> k2Var2 = (k2) objE;
        if (w2Var instanceof m1) {
            rVar.X(-1357590553);
            Object objE2 = rVar.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE2 == companion2.a()) {
                objE2 = Function0.i(tq.j.f191408a, rVar);
                rVar.v(objE2);
            }
            final ju.p0 p0Var = (ju.p0) objE2;
            boolean zG = rVar.G(p0Var) | ((i17 > 4 && rVar.W(w2Var)) || (i15 & 6) == 4);
            Object objE3 = rVar.E();
            if (zG || objE3 == companion2.a()) {
                objE3 = new er.l() { // from class: u0.o2
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v2.u(w2Var, p0Var, (p076m2.s0) obj);
                    }
                };
                rVar.v(objE3);
            }
            Function0.a(p0Var, (er.l) objE3, rVar, 0);
            m1 m1Var = (m1) w2Var;
            Object objA = m1Var.a();
            Object objB = m1Var.b();
            if ((i17 <= 4 || !rVar.W(w2Var)) && (i15 & 6) != 4) {
                z15 = false;
            }
            Object objE4 = rVar.E();
            if (z15 || objE4 == companion2.a()) {
                objE4 = new e(w2Var, null);
                rVar.v(objE4);
            }
            Function0.e(objA, objB, (er.p) objE4, rVar, 0);
            rVar.R();
        } else {
            rVar.X(-1356604288);
            k2Var2.h(w2Var.b(), rVar, 0);
            rVar.R();
        }
        boolean zW = rVar.W(k2Var2);
        Object objE5 = rVar.E();
        if (zW || objE5 == p076m2.r.INSTANCE.a()) {
            objE5 = new er.l() { // from class: u0.p2
                @Override // er.l
                public final Object b(Object obj) {
                    return v2.w(k2Var2, (p076m2.s0) obj);
                }
            };
            rVar.v(objE5);
        }
        Function0.a(k2Var2, (er.l) objE5, rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return k2Var2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 u(w2 w2Var, final ju.p0 p0Var, p076m2.s0 s0Var) {
        final Object objA = u0.a.a();
        ((m1) w2Var).X(new c3.m0(new er.l() { // from class: u0.t2
            @Override // er.l
            public final Object b(Object obj) {
                return v2.v(objA, p0Var, (er.a) obj);
            }
        }));
        return new f(w2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(Object obj, ju.p0 p0Var, er.a aVar) {
        if (obj == u0.a.a()) {
            aVar.a();
        } else {
            ju.k.d(p0Var, null, null, new d(aVar, null), 3, null);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 w(k2 k2Var, p076m2.s0 s0Var) {
        return new g(k2Var);
    }

    public static final <T> k2<T> x(T t15, String str, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            str = null;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(2029166765, i15, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:87)");
        }
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = new k2(t15, str);
            rVar.v(objE);
        }
        final k2<T> k2Var = (k2) objE;
        k2Var.h(t15, rVar, (i15 & 8) | 48 | (i15 & 14));
        Object objE2 = rVar.E();
        if (objE2 == companion.a()) {
            objE2 = new er.l() { // from class: u0.u2
                @Override // er.l
                public final Object b(Object obj) {
                    return v2.z(k2Var, (p076m2.s0) obj);
                }
            };
            rVar.v(objE2);
        }
        Function0.a(k2Var, (er.l) objE2, rVar, 54);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return k2Var;
    }

    @oq.a
    public static final <T> k2<T> y(d1<T> d1Var, String str, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 2) != 0) {
            str = null;
        }
        if (p076m2.t.k()) {
            p076m2.t.o(882913843, i15, -1, "androidx.compose.animation.core.updateTransition (Transition.kt:883)");
        }
        k2<T> k2VarT = t(d1Var, str, rVar, i15 & 126, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return k2VarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final p076m2.r0 z(k2 k2Var, p076m2.s0 s0Var) {
        return new h(k2Var);
    }
}
