package jt2;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mt2.PeselRestrictionMoreInfoNavParams;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Ljt2/m;", "Ll00/g;", "Ljt2/d;", "", "Ljt2/e;", "Lyy/a;", "stateMachineFactory", "Lkt2/a;", "peselRestrictionMoreInfoScreenMapper", "Lmt2/c;", "setupData", "<init>", "(Lyy/a;Lkt2/a;Lmt2/c;)V", "state", "Ljt2/e$a;", "j9", "(Ljt2/d;)Ljt2/e$a;", "data", "Loq/i0;", "k9", "(Lmt2/c;)V", "b", "Lkt2/a;", "c", "Lmt2/c;", "d", "Ljt2/d;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ljt2/b;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kt2.a peselRestrictionMoreInfoScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private PeselRestrictionMoreInfoNavParams setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<jt2.b> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f105417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f105418b;

        /* JADX INFO: renamed from: jt2.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2504a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f105419a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f105420b;

            /* JADX INFO: renamed from: jt2.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2505a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f105421d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f105422e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f105423f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f105425h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f105426j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f105427k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f105428l;

                public C2505a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f105421d = obj;
                    this.f105422e |= PKIFailureInfo.systemUnavail;
                    return C2504a.this.F(null, this);
                }
            }

            public C2504a(mu.h hVar, m mVar) {
                this.f105419a = hVar;
                this.f105420b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2505a c2505a;
                if (eVar instanceof C2505a) {
                    c2505a = (C2505a) eVar;
                    int i15 = c2505a.f105422e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2505a.f105422e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2505a = new C2505a(eVar);
                    }
                } else {
                    c2505a = new C2505a(eVar);
                }
                Object obj2 = c2505a.f105421d;
                Object objE = uq.b.e();
                int i16 = c2505a.f105422e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f105419a;
                    e.Data dataJ9 = this.f105420b.j9((State) obj);
                    c2505a.f105423f = vq.j.a(obj);
                    c2505a.f105425h = vq.j.a(c2505a);
                    c2505a.f105426j = vq.j.a(obj);
                    c2505a.f105427k = vq.j.a(hVar);
                    c2505a.f105428l = 0;
                    c2505a.f105422e = 1;
                    if (hVar.F(dataJ9, c2505a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, m mVar) {
            this.f105417a = gVar;
            this.f105418b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f105417a.a(new C2504a(hVar, this.f105418b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljt2/a;", "<unused var>", "Ljt2/d;", "state", "Loq/i0;", "<anonymous>", "(Ljt2/a;Ljt2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<jt2.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105429e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105430f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r6.F(r2, r5) == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0055, code lost:
        
            if (r6.F(r2, r5) == r1) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0057, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f105430f
                jt2.d r0 = (jt2.State) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f105429e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1f
                if (r2 == r4) goto L1b
                if (r2 != r3) goto L13
                goto L1b
            L13:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1b:
                oq.u.b(r6)
                goto L58
            L1f:
                oq.u.b(r6)
                boolean r6 = r0.getShouldFinishProcess()
                if (r6 != r4) goto L3f
                jt2.m r6 = jt2.m.this
                xw.b r6 = r6.Y1()
                jt2.b$b r2 = jt2.b.C2503b.f105393a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f105430f = r0
                r5.f105429e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L58
                goto L57
            L3f:
                if (r6 != 0) goto L5b
                jt2.m r6 = jt2.m.this
                xw.b r6 = r6.Y1()
                jt2.b$a r2 = jt2.b.a.f105392a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f105430f = r0
                r5.f105429e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L58
            L57:
                return r1
            L58:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            L5b:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: jt2.m.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jt2.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f105430f = state;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Ljt2/c;", "action", "Lk10/c0;", "Ljt2/d;", "state", "Lk10/l;", "<anonymous>", "(Ljt2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<Setup, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105432e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f105433f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f105434g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Setup setup, State state) {
            return state.a(setup.getNavParams().getShouldCloseProcess());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Setup setup = (Setup) this.f105433f;
            c0 c0Var = (c0) this.f105434g;
            uq.b.e();
            if (this.f105432e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: jt2.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.c.O(setup, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Setup setup, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f105433f = setup;
            cVar.f105434g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, kt2.a aVar2, PeselRestrictionMoreInfoNavParams peselRestrictionMoreInfoNavParams) {
        this.peselRestrictionMoreInfoScreenMapper = aVar2;
        this.setupData = peselRestrictionMoreInfoNavParams;
        State state = new State(false);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: jt2.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.l9(this.f105410a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data j9(State state) {
        return this.peselRestrictionMoreInfoScreenMapper.b(new kt2.a.Params(state, b9(jt2.a.f105391a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: jt2.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f105409a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(jt2.a.class), oVar, bVar);
        zVar.v(q0.c(Setup.class), oVar, new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<jt2.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public void P5(PeselRestrictionMoreInfoNavParams data) {
        this.setupData = data;
        d9(new Setup(data));
    }
}
