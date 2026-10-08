package hn2;

import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lhn2/p;", "Ll00/g;", "Lhn2/d;", "", "Lhn2/e;", "Lyy/a;", "stateMachineFactory", "Lhn2/f;", "mapper", "Lhm2/d;", "checkIsAddedWebsiteAddressValidUC", "Lin2/a;", "contract", "<init>", "(Lyy/a;Lhn2/f;Lhm2/d;Lin2/a;)V", "state", "Lhn2/e$a;", "n9", "(Lhn2/d;)Lhn2/e$a;", "b", "Lhn2/f;", "c", "Lhm2/d;", "d", "Lin2/a;", "e", "Lhn2/d;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lhn2/c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hm2.d checkIsAddedWebsiteAddressValidUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final in2.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hn2.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f85892a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f85893b;

        /* JADX INFO: renamed from: hn2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1997a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f85894a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f85895b;

            /* JADX INFO: renamed from: hn2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1998a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f85896d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f85897e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f85898f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f85900h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f85901j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f85902k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f85903l;

                public C1998a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f85896d = obj;
                    this.f85897e |= PKIFailureInfo.systemUnavail;
                    return C1997a.this.F(null, this);
                }
            }

            public C1997a(mu.h hVar, p pVar) {
                this.f85894a = hVar;
                this.f85895b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1998a c1998a;
                if (eVar instanceof C1998a) {
                    c1998a = (C1998a) eVar;
                    int i15 = c1998a.f85897e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1998a.f85897e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1998a = new C1998a(eVar);
                    }
                } else {
                    c1998a = new C1998a(eVar);
                }
                Object obj2 = c1998a.f85896d;
                Object objE = uq.b.e();
                int i16 = c1998a.f85897e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f85894a;
                    e.Data dataN9 = this.f85895b.n9((State) obj);
                    c1998a.f85898f = vq.j.a(obj);
                    c1998a.f85900h = vq.j.a(c1998a);
                    c1998a.f85901j = vq.j.a(obj);
                    c1998a.f85902k = vq.j.a(hVar);
                    c1998a.f85903l = 0;
                    c1998a.f85897e = 1;
                    if (hVar.F(dataN9, c1998a) == objE) {
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

        public a(mu.g gVar, p pVar) {
            this.f85892a = gVar;
            this.f85893b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f85892a.a(new C1997a(hVar, this.f85893b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhn2/c;", "action", "Lhn2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhn2/c;Lhn2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<hn2.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85905f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hn2.c cVar = (hn2.c) this.f85905f;
            Object objE = uq.b.e();
            int i15 = this.f85904e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                this.f85905f = vq.j.a(cVar);
                this.f85904e = 1;
                if (pVar.F(cVar, this) == objE) {
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
        public final Object w(hn2.c cVar, State state, tq.e<? super i0> eVar) {
            b bVar = p.this.new b(eVar);
            bVar.f85905f = cVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhn2/a;", "<unused var>", "Lk10/c0;", "Lhn2/d;", "state", "Lk10/l;", "<anonymous>", "(Lhn2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<hn2.a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f85907e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f85908f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f85909g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f85910h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f85911j;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return State.b(state, null, new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage()), 1, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0096, code lost:
        
            if (r4.F(r5, r6) == r1) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f85911j
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f85910h
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2f
                if (r2 == r4) goto L27
                if (r2 != r3) goto L1f
                java.lang.Object r1 = r6.f85908f
                hz.g r1 = (hz.g) r1
                java.lang.Object r1 = r6.f85907e
                java.lang.String r1 = (java.lang.String) r1
                oq.u.b(r7)
                goto L99
            L1f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L27:
                java.lang.Object r2 = r6.f85907e
                java.lang.String r2 = (java.lang.String) r2
                oq.u.b(r7)
                goto L5c
            L2f:
                oq.u.b(r7)
                java.lang.Object r7 = r0.a()
                hn2.d r7 = (hn2.State) r7
                java.lang.String r7 = r7.getMaliciousWebsiteAddress()
                java.lang.CharSequence r7 = fu.r.u1(r7)
                java.lang.String r2 = r7.toString()
                hn2.p r7 = hn2.p.this
                hm2.d r7 = hn2.p.j9(r7)
                hm2.d$a r5 = new hm2.d$a
                r5.<init>(r2)
                r6.f85911j = r0
                r6.f85907e = r2
                r6.f85910h = r4
                java.lang.Object r7 = r7.d(r5, r6)
                if (r7 != r1) goto L5c
                goto L98
            L5c:
                hn2.p r4 = hn2.p.this
                hz.g r7 = (hz.g) r7
                boolean r5 = r7 instanceof hz.g.Invalid
                if (r5 == 0) goto L6e
                hn2.q r1 = new hn2.q
                r1.<init>()
                k10.l r7 = r0.b(r1)
                return r7
            L6e:
                hz.g$b r5 = hz.g.b.f86853b
                boolean r5 = fr.t.c(r7, r5)
                if (r5 == 0) goto L9e
                in2.a r5 = hn2.p.k9(r4)
                r5.M4(r2)
                hn2.c$b r5 = hn2.c.b.f85858a
                r6.f85911j = r0
                java.lang.Object r2 = vq.j.a(r2)
                r6.f85907e = r2
                java.lang.Object r7 = vq.j.a(r7)
                r6.f85908f = r7
                r7 = 0
                r6.f85909g = r7
                r6.f85910h = r3
                java.lang.Object r7 = r4.F(r5, r6)
                if (r7 != r1) goto L99
            L98:
                return r1
            L99:
                k10.l r7 = r0.c()
                return r7
            L9e:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hn2.p.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hn2.a aVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f85911j = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhn2/b;", "action", "Lk10/c0;", "Lhn2/d;", "state", "Lk10/l;", "<anonymous>", "(Lhn2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ChangeWebsiteAddress, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f85913e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f85914f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f85915g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(ChangeWebsiteAddress changeWebsiteAddress, State state) {
            return state.a(changeWebsiteAddress.getMaliciousWebsiteAddress(), hz.b.d.f86848c);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ChangeWebsiteAddress changeWebsiteAddress = (ChangeWebsiteAddress) this.f85914f;
            c0 c0Var = (c0) this.f85915g;
            uq.b.e();
            if (this.f85913e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hn2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.d.O(changeWebsiteAddress, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ChangeWebsiteAddress changeWebsiteAddress, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f85914f = changeWebsiteAddress;
            dVar.f85915g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, f fVar, hm2.d dVar, in2.a aVar2) {
        this.mapper = fVar;
        this.checkIsAddedWebsiteAddressValidUC = dVar;
        this.contract = aVar2;
        State state = new State("", hz.b.C2039b.f86846c);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: hn2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f85884a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data n9(State state) {
        return this.mapper.b(new f.Params(state, new er.l() { // from class: hn2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.o9(this.f85883a, (String) obj);
            }
        }, b9(hn2.c.a.f85857a), b9(hn2.a.f85855a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(p pVar, String str) {
        pVar.d9(new ChangeWebsiteAddress(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final p pVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: hn2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f85882a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hn2.c.class), oVar, bVar);
        zVar.v(q0.c(hn2.a.class), oVar, pVar.new c(null));
        zVar.v(q0.c(ChangeWebsiteAddress.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hn2.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(hn2.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(in2.a aVar) {
        super.P5(aVar);
    }
}
