package ln2;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001c8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lln2/p;", "Ll00/g;", "Lln2/d;", "", "Lln2/e;", "Lyy/a;", "stateMachineFactory", "Lln2/f;", "mapper", "Lhm2/f;", "checkIsIssueDescriptionValidUC", "Lmn2/a;", "contract", "<init>", "(Lyy/a;Lln2/f;Lhm2/f;Lmn2/a;)V", "state", "Lln2/e$a;", "n9", "(Lln2/d;)Lln2/e$a;", "b", "Lln2/f;", "c", "Lhm2/f;", "d", "Lmn2/a;", "e", "Lln2/d;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lln2/b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hm2.f checkIsIssueDescriptionValidUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mn2.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ln2.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f118954a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p f118955b;

        /* JADX INFO: renamed from: ln2.p$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2895a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f118956a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p f118957b;

            /* JADX INFO: renamed from: ln2.p$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2896a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f118958d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f118959e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f118960f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f118962h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f118963j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f118964k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f118965l;

                public C2896a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f118958d = obj;
                    this.f118959e |= PKIFailureInfo.systemUnavail;
                    return C2895a.this.F(null, this);
                }
            }

            public C2895a(mu.h hVar, p pVar) {
                this.f118956a = hVar;
                this.f118957b = pVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2896a c2896a;
                if (eVar instanceof C2896a) {
                    c2896a = (C2896a) eVar;
                    int i15 = c2896a.f118959e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2896a.f118959e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2896a = new C2896a(eVar);
                    }
                } else {
                    c2896a = new C2896a(eVar);
                }
                Object obj2 = c2896a.f118958d;
                Object objE = uq.b.e();
                int i16 = c2896a.f118959e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f118956a;
                    e.Data dataN9 = this.f118957b.n9((State) obj);
                    c2896a.f118960f = vq.j.a(obj);
                    c2896a.f118962h = vq.j.a(c2896a);
                    c2896a.f118963j = vq.j.a(obj);
                    c2896a.f118964k = vq.j.a(hVar);
                    c2896a.f118965l = 0;
                    c2896a.f118959e = 1;
                    if (hVar.F(dataN9, c2896a) == objE) {
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
            this.f118954a = gVar;
            this.f118955b = pVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f118954a.a(new C2895a(hVar, this.f118955b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lln2/b;", "action", "Lln2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lln2/b;Lln2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ln2.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118966e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118967f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ln2.b bVar = (ln2.b) this.f118967f;
            Object objE = uq.b.e();
            int i15 = this.f118966e;
            if (i15 == 0) {
                oq.u.b(obj);
                p pVar = p.this;
                this.f118967f = vq.j.a(bVar);
                this.f118966e = 1;
                if (pVar.F(bVar, this) == objE) {
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
        public final Object w(ln2.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = p.this.new b(eVar);
            bVar2.f118967f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lln2/a;", "action", "Lk10/c0;", "Lln2/d;", "state", "Lk10/l;", "<anonymous>", "(Lln2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<IssueDescriptionChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f118969e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f118970f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f118971g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(IssueDescriptionChanged issueDescriptionChanged, State state) {
            return state.a(issueDescriptionChanged.getIssueDescription(), hz.b.d.f86848c);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final IssueDescriptionChanged issueDescriptionChanged = (IssueDescriptionChanged) this.f118970f;
            c0 c0Var = (c0) this.f118971g;
            uq.b.e();
            if (this.f118969e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p.this.contract.z6(new mn2.a.IssueDescriptionData(issueDescriptionChanged.getIssueDescription(), hz.b.d.f86848c));
            return c0Var.b(new er.l() { // from class: ln2.q
                @Override // er.l
                public final Object b(Object obj2) {
                    return p.c.O(issueDescriptionChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(IssueDescriptionChanged issueDescriptionChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = p.this.new c(eVar);
            cVar.f118970f = issueDescriptionChanged;
            cVar.f118971g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lln2/c;", "<unused var>", "Lk10/c0;", "Lln2/d;", "state", "Lk10/l;", "<anonymous>", "(Lln2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ln2.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f118973e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f118974f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f118975g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f118976h;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(hz.b.Invalid invalid, State state) {
            return State.b(state, null, invalid, 1, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(State state) {
            return State.b(state, null, hz.b.d.f86848c, 1, null);
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x009e, code lost:
        
            if (r2.F(r4, r7) == r1) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = r7.f118976h
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f118975g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L27
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r1 = r7.f118973e
                hz.g r1 = (hz.g) r1
                oq.u.b(r8)
                goto La1
            L1b:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L23:
                oq.u.b(r8)
                goto L4c
            L27:
                oq.u.b(r8)
                ln2.p r8 = ln2.p.this
                hm2.f r8 = ln2.p.j9(r8)
                hm2.f$c r2 = new hm2.f$c
                java.lang.Object r5 = r0.a()
                ln2.d r5 = (ln2.State) r5
                java.lang.String r5 = r5.getIssueDescription()
                hm2.f$b r6 = hm2.f.b.WEBSITE
                r2.<init>(r5, r6)
                r7.f118976h = r0
                r7.f118975g = r4
                java.lang.Object r8 = r8.e(r2, r7)
                if (r8 != r1) goto L4c
                goto La0
            L4c:
                ln2.p r2 = ln2.p.this
                hz.g r8 = (hz.g) r8
                boolean r4 = r8 instanceof hz.g.Invalid
                if (r4 == 0) goto L83
                hz.b$c r1 = new hz.b$c
                hz.g$a r8 = (hz.g.Invalid) r8
                hz.a r8 = r8.b()
                mx.a r8 = r8.getErrorMessage()
                r1.<init>(r8)
                mn2.a r8 = ln2.p.k9(r2)
                mn2.a$a r2 = new mn2.a$a
                java.lang.Object r3 = r0.a()
                ln2.d r3 = (ln2.State) r3
                java.lang.String r3 = r3.getIssueDescription()
                r2.<init>(r3, r1)
                r8.z6(r2)
                ln2.r r8 = new ln2.r
                r8.<init>()
                k10.l r8 = r0.b(r8)
                return r8
            L83:
                hz.g$b r4 = hz.g.b.f86853b
                boolean r4 = fr.t.c(r8, r4)
                if (r4 == 0) goto Lab
                ln2.b$c r4 = ln2.b.c.f118916a
                r7.f118976h = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f118973e = r8
                r8 = 0
                r7.f118974f = r8
                r7.f118975g = r3
                java.lang.Object r8 = r2.F(r4, r7)
                if (r8 != r1) goto La1
            La0:
                return r1
            La1:
                ln2.s r8 = new ln2.s
                r8.<init>()
                k10.l r8 = r0.b(r8)
                return r8
            Lab:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: ln2.p.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(ln2.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = p.this.new d(eVar);
            dVar.f118976h = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public p(yy.a aVar, f fVar, hm2.f fVar2, mn2.a aVar2) {
        this.mapper = fVar;
        this.checkIsIssueDescriptionValidUC = fVar2;
        this.contract = aVar2;
        mn2.a.IssueDescriptionData issueDescriptionDataG3 = aVar2.g3();
        State state = new State(issueDescriptionDataG3.getIssueDescription(), issueDescriptionDataG3.getValidationState());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ln2.o
            @Override // er.l
            public final Object b(Object obj) {
                return p.q9(this.f118946a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data n9(State state) {
        return this.mapper.b(new f.Params(state, b9(ln2.c.f118917a), b9(ln2.b.a.f118914a), b9(ln2.b.C2894b.f118915a), new er.l() { // from class: ln2.m
            @Override // er.l
            public final Object b(Object obj) {
                return p.o9(this.f118944a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(p pVar, String str) {
        pVar.d9(new IssueDescriptionChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final p pVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ln2.n
            @Override // er.l
            public final Object b(Object obj) {
                return p.r9(this.f118945a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(p pVar, z zVar) {
        b bVar = pVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ln2.b.class), oVar, bVar);
        zVar.v(q0.c(IssueDescriptionChanged.class), oVar, pVar.new c(null));
        zVar.v(q0.c(ln2.c.class), oVar, pVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ln2.b> Y1() {
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
    public /* bridge */ Object F(ln2.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(mn2.a aVar) {
        super.P5(aVar);
    }
}
