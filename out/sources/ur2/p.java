package ur2;

import fr.q0;
import iy.b0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001+B!\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006,"}, d2 = {"Lur2/p;", "Ll00/g;", "Lur2/f;", "", "Lur2/g;", "Lyy/a;", "stateMachineFactory", "Lqr2/a;", "checkPassportPickupApplicationNumberCorrectUC", "Lvr2/b;", "mapper", "<init>", "(Lyy/a;Lqr2/a;Lvr2/b;)V", "state", "Lur2/g$a;", "m9", "(Lur2/f;)Lur2/g$a;", "b", "Lqr2/a;", "c", "Lvr2/b;", "d", "Lur2/f;", "initialState", "Lxw/b;", "Lur2/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "h", "a", "passportpickup_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f200438j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final qr2.a checkPassportPickupApplicationNumberCorrectUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vr2.b mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f200445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f200446b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f200447a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f200448b;

            /* JADX INFO: renamed from: ur2.p$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5215a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f200449d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f200450e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f200451f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f200453h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f200454j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f200455k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f200456l;

                public C5215a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f200449d = obj;
                    this.f200450e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, p pVar) {
                this.f200447a = hVar;
                this.f200448b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5215a c5215a;
                if (eVar instanceof C5215a) {
                    c5215a = (C5215a) eVar;
                    int i15 = c5215a.f200450e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5215a.f200450e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5215a = new C5215a(eVar);
                    }
                } else {
                    c5215a = new C5215a(eVar);
                }
                Object obj2 = c5215a.f200449d;
                Object objE = uq.b.e();
                int i16 = c5215a.f200450e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f200447a;
                    g.Data dataM9 = this.f200448b.m9((State) obj);
                    c5215a.f200451f = vq.j.a(obj);
                    c5215a.f200453h = vq.j.a(c5215a);
                    c5215a.f200454j = vq.j.a(obj);
                    c5215a.f200455k = vq.j.a(hVar);
                    c5215a.f200456l = 0;
                    c5215a.f200450e = 1;
                    if (hVar.F(dataM9, c5215a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public b(mu.g gVar, p pVar) {
            this.f200445a = gVar;
            this.f200446b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f200445a.a(new a(hVar, this.f200446b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lur2/b;", "action", "Lk10/c0;", "Lur2/f;", "state", "Lk10/l;", "<anonymous>", "(Lur2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnApplicationNumberChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200457e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200458f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200459g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(b0 b0Var, State state) {
            return State.b(state, b0Var, hz.b.d.f86848c, false, 4, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            OnApplicationNumberChanged onApplicationNumberChanged = (OnApplicationNumberChanged) this.f200458f;
            c0 c0Var = (c0) this.f200459g;
            uq.b.e();
            if (this.f200457e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            String strE = iy.c0.e(onApplicationNumberChanged.getValue());
            StringBuilder sb5 = new StringBuilder();
            int length = strE.length();
            for (int i15 = 0; i15 < length; i15++) {
                char cCharAt = strE.charAt(i15);
                if (Character.isDigit(cCharAt)) {
                    sb5.append(cCharAt);
                }
            }
            final b0 b0VarG = iy.c0.g(fu.r.H1(sb5.toString(), 16));
            return c0Var.b(new er.l() { // from class: ur2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(b0VarG, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnApplicationNumberChanged onApplicationNumberChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f200458f = onApplicationNumberChanged;
            cVar.f200459g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lur2/e;", "<unused var>", "Lk10/c0;", "Lur2/f;", "state", "Lk10/l;", "<anonymous>", "(Lur2/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ur2.e, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200460e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f200461f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, null, false, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f200461f;
            uq.b.e();
            if (this.f200460e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ur2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur2.e eVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar2) {
            d dVar = new d(eVar2);
            dVar.f200461f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lur2/d;", "<unused var>", "Lk10/c0;", "Lur2/f;", "state", "Lk10/l;", "<anonymous>", "(Lur2/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ur2.d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f200462e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f200463f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f200464g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return State.b(state, null, new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage()), false, 5, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0080, code lost:
        
            if (r2.F(r4, r6) == r1) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f200464g
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f200463f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L22
                if (r2 != r3) goto L1a
                java.lang.Object r1 = r6.f200462e
                hz.g r1 = (hz.g) r1
                oq.u.b(r7)
                goto L83
            L1a:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L22:
                oq.u.b(r7)
                goto L49
            L26:
                oq.u.b(r7)
                ur2.p r7 = ur2.p.this
                qr2.a r7 = ur2.p.j9(r7)
                qr2.a$b r2 = new qr2.a$b
                java.lang.Object r5 = r0.a()
                ur2.f r5 = (ur2.State) r5
                iy.b0 r5 = r5.getApplicationNumber()
                r2.<init>(r5)
                r6.f200464g = r0
                r6.f200463f = r4
                java.lang.Object r7 = r7.d(r2, r6)
                if (r7 != r1) goto L49
                goto L82
            L49:
                hz.g r7 = (hz.g) r7
                boolean r2 = r7 instanceof hz.g.Invalid
                if (r2 == 0) goto L59
                ur2.s r1 = new ur2.s
                r1.<init>()
                k10.l r7 = r0.b(r1)
                return r7
            L59:
                hz.g$b r2 = hz.g.b.f86853b
                boolean r2 = fr.t.c(r7, r2)
                if (r2 == 0) goto L88
                ur2.p r2 = ur2.p.this
                ur2.a$b r4 = new ur2.a$b
                java.lang.Object r5 = r0.a()
                ur2.f r5 = (ur2.State) r5
                iy.b0 r5 = r5.getApplicationNumber()
                r4.<init>(r5)
                r6.f200464g = r0
                java.lang.Object r7 = vq.j.a(r7)
                r6.f200462e = r7
                r6.f200463f = r3
                java.lang.Object r7 = r2.F(r4, r6)
                if (r7 != r1) goto L83
            L82:
                return r1
            L83:
                k10.l r7 = r0.c()
                return r7
            L88:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ur2.p.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ur2.d dVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = p.this.new e(eVar);
            eVar2.f200464g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lur2/c;", "<unused var>", "Lur2/f;", "Loq/i0;", "<anonymous>", "(Lur2/c;Lur2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ur2.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f200466e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f200466e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                a.C5214a c5214a = a.C5214a.f200405a;
                this.f200466e = 1;
                if (pVar.F(c5214a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ur2.c cVar, State state, tq.e<? super i0> eVar) {
            return p.this.new f(eVar).J(i0.f148189a);
        }
    }

    public p(yy.a aVar, qr2.a aVar2, vr2.b bVar) {
        this.checkPassportPickupApplicationNumberCorrectUC = aVar2;
        this.mapper = bVar;
        State state = new State(null, null, false, 7, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ur2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.p9(this.f200434a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data m9(State state) {
        vr2.b bVar = this.mapper;
        er.a<i0> aVarB9 = b9(ur2.e.f200412a);
        er.a<i0> aVarB10 = b9(ur2.c.f200410a);
        return bVar.b(new vr2.b.Params(state, new er.l() { // from class: ur2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.n9(this.f200436a, (b0) obj);
            }
        }, aVarB9, b9(ur2.d.f200411a), aVarB10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(p pVar, b0 b0Var) {
        pVar.d9(new OnApplicationNumberChanged(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ur2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f200435a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(p pVar, z zVar) {
        c cVar = new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(OnApplicationNumberChanged.class), oVar, cVar);
        zVar.v(q0.c(ur2.e.class), oVar, new d(null));
        zVar.v(q0.c(ur2.d.class), oVar, pVar.new e(null));
        zVar.x(q0.c(ur2.c.class), oVar, pVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<g.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
