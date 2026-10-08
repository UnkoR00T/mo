package jy2;

import fr.q0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Ljy2/r;", "Ll00/g;", "Ljy2/g;", "", "Ljy2/h;", "Lyy/a;", "stateMachineFactory", "Lky2/a;", "mapper", "Lq34/d;", "checkServiceTemporaryInterruptionUC", "Lal0/g;", "applicationOwnerWithAge", "<init>", "(Lyy/a;Lky2/a;Lq34/d;Lal0/g;)V", "state", "Ljy2/h$a;", "l9", "(Ljy2/g;)Ljy2/h$a;", "b", "Lky2/a;", "c", "Lq34/d;", "d", "Lal0/g;", "e", "Ljy2/g;", "initialState", "Lxw/b;", "Ljy2/d;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, Object> implements h, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ky2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q34.d checkServiceTemporaryInterruptionUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final al0.g applicationOwnerWithAge;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f106513a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f106514b;

        /* JADX INFO: renamed from: jy2.r$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2536a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f106515a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f106516b;

            /* JADX INFO: renamed from: jy2.r$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2537a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f106517d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f106518e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f106519f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f106521h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f106522j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f106523k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f106524l;

                public C2537a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f106517d = obj;
                    this.f106518e |= PKIFailureInfo.systemUnavail;
                    return C2536a.this.F(null, this);
                }
            }

            public C2536a(mu.h hVar, r rVar) {
                this.f106515a = hVar;
                this.f106516b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2537a c2537a;
                if (eVar instanceof C2537a) {
                    c2537a = (C2537a) eVar;
                    int i15 = c2537a.f106518e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2537a.f106518e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2537a = new C2537a(eVar);
                    }
                } else {
                    c2537a = new C2537a(eVar);
                }
                Object obj2 = c2537a.f106517d;
                Object objE = uq.b.e();
                int i16 = c2537a.f106518e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f106515a;
                    h.Data dataL9 = this.f106516b.l9((State) obj);
                    c2537a.f106519f = vq.j.a(obj);
                    c2537a.f106521h = vq.j.a(c2537a);
                    c2537a.f106522j = vq.j.a(obj);
                    c2537a.f106523k = vq.j.a(hVar);
                    c2537a.f106524l = 0;
                    c2537a.f106518e = 1;
                    if (hVar.F(dataL9, c2537a) == objE) {
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

        public a(mu.g gVar, r rVar) {
            this.f106513a = gVar;
            this.f106514b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f106513a.a(new C2536a(hVar, this.f106514b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljy2/e;", "<unused var>", "Ljy2/g;", "Loq/i0;", "<anonymous>", "(Ljy2/e;Ljy2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106525e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f106526f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f106527g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f106528h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f106529j;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0072, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
        
            if (r1.F(r4, r6) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f106529j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r6.f106526f
                cb4.d r0 = (cb4.DialogData) r0
                goto L22
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r0 = r6.f106526f
                oq.i0 r0 = (oq.i0) r0
            L22:
                java.lang.Object r0 = r6.f106525e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto La0
            L2b:
                oq.u.b(r7)
                goto L48
            L2f:
                oq.u.b(r7)
                jy2.r r7 = jy2.r.this
                q34.d r7 = jy2.r.i9(r7)
                q34.d$a r1 = new q34.d$a
                rq0.c r5 = rq0.c.MY_CASES
                r1.<init>(r5)
                r6.f106529j = r4
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L48
                goto L9f
            L48:
                dx.i r7 = (dx.i) r7
                jy2.r r1 = jy2.r.this
                boolean r4 = r7 instanceof dx.i.Left
                r5 = 0
                if (r4 == 0) goto L75
                r2 = r7
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                oq.i0 r2 = (oq.i0) r2
                jy2.d$c r4 = jy2.d.c.f106487a
                java.lang.Object r7 = vq.j.a(r7)
                r6.f106525e = r7
                java.lang.Object r7 = vq.j.a(r2)
                r6.f106526f = r7
                r6.f106527g = r5
                r6.f106528h = r5
                r6.f106529j = r3
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto La0
                goto L9f
            L75:
                boolean r3 = r7 instanceof dx.i.Right
                if (r3 == 0) goto La3
                r3 = r7
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                jy2.d$b r4 = new jy2.d$b
                r4.<init>(r3)
                java.lang.Object r7 = vq.j.a(r7)
                r6.f106525e = r7
                java.lang.Object r7 = vq.j.a(r3)
                r6.f106526f = r7
                r6.f106527g = r5
                r6.f106528h = r5
                r6.f106529j = r2
                java.lang.Object r7 = r1.F(r4, r6)
                if (r7 != r0) goto La0
            L9f:
                return r0
            La0:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            La3:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: jy2.r.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(e eVar, State state, tq.e<? super i0> eVar2) {
            return r.this.new b(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljy2/f;", "<unused var>", "Ljy2/g;", "Loq/i0;", "<anonymous>", "(Ljy2/f;Ljy2/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<f, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106531e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f106531e;
            if (i15 == 0) {
                oq.u.b(obj);
                r rVar = r.this;
                d.a aVar = d.a.f106485a;
                this.f106531e = 1;
                if (rVar.F(aVar, this) == objE) {
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
        public final Object w(f fVar, State state, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    public r(yy.a aVar, ky2.a aVar2, q34.d dVar, al0.g gVar) {
        this.mapper = aVar2;
        this.checkServiceTemporaryInterruptionUC = dVar;
        this.applicationOwnerWithAge = gVar;
        State state = new State(gVar);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: jy2.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.n9(this.f106505a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data l9(State state) {
        return this.mapper.b(new ky2.a.Params(state, b9(e.f106488a), b9(f.f106489a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(final r rVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: jy2.p
            @Override // er.l
            public final Object b(Object obj) {
                return r.o9(this.f106504a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(r rVar, z zVar) {
        b bVar = rVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(e.class), oVar, bVar);
        zVar.x(q0.c(f.class), oVar, rVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(al0.g gVar) {
        super.P5(gVar);
    }
}
