package rm2;

import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B+\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lrm2/q;", "Ll00/g;", "Lrm2/d;", "", "Lrm2/e;", "Lyy/a;", "stateMachineFactory", "Lrm2/f;", "mapper", "Lhm2/f;", "checkIsIssueDescriptionValidUC", "Lsm2/a;", "contract", "<init>", "(Lyy/a;Lrm2/f;Lhm2/f;Lsm2/a;)V", "state", "Lrm2/e$a;", "n9", "(Lrm2/d;)Lrm2/e$a;", "b", "Lrm2/f;", "c", "Lhm2/f;", "d", "Lsm2/a;", "e", "Lrm2/d;", "initialState", "Lxw/b;", "Lrm2/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hm2.f checkIsIssueDescriptionValidUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sm2.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<rm2.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f174893a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f174894b;

        /* JADX INFO: renamed from: rm2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4466a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f174895a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f174896b;

            /* JADX INFO: renamed from: rm2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4467a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f174897d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f174898e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f174899f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f174901h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f174902j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f174903k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f174904l;

                public C4467a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f174897d = obj;
                    this.f174898e |= PKIFailureInfo.systemUnavail;
                    return C4466a.this.F(null, this);
                }
            }

            public C4466a(mu.h hVar, q qVar) {
                this.f174895a = hVar;
                this.f174896b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4467a c4467a;
                if (eVar instanceof C4467a) {
                    c4467a = (C4467a) eVar;
                    int i15 = c4467a.f174898e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4467a.f174898e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4467a = new C4467a(eVar);
                    }
                } else {
                    c4467a = new C4467a(eVar);
                }
                Object obj2 = c4467a.f174897d;
                Object objE = uq.b.e();
                int i16 = c4467a.f174898e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f174895a;
                    e.Data dataN9 = this.f174896b.n9((State) obj);
                    c4467a.f174899f = vq.j.a(obj);
                    c4467a.f174901h = vq.j.a(c4467a);
                    c4467a.f174902j = vq.j.a(obj);
                    c4467a.f174903k = vq.j.a(hVar);
                    c4467a.f174904l = 0;
                    c4467a.f174898e = 1;
                    if (hVar.F(dataN9, c4467a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f174893a = gVar;
            this.f174894b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f174893a.a(new C4466a(hVar, this.f174894b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lrm2/a;", "action", "Lrm2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lrm2/a;Lrm2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<rm2.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174905e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f174906f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            rm2.a aVar = (rm2.a) this.f174906f;
            Object objE = uq.b.e();
            int i15 = this.f174905e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                this.f174906f = vq.j.a(aVar);
                this.f174905e = 1;
                if (qVar.F(aVar, this) == objE) {
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
        public final Object w(rm2.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = q.this.new b(eVar);
            bVar.f174906f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrm2/c;", "action", "Lk10/c0;", "Lrm2/d;", "state", "Lk10/l;", "<anonymous>", "(Lrm2/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OnDescriptionChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f174908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f174909f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f174910g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnDescriptionChanged onDescriptionChanged, State state) {
            return state.a(onDescriptionChanged.getDescription(), hz.b.d.f86848c);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnDescriptionChanged onDescriptionChanged = (OnDescriptionChanged) this.f174909f;
            c0 c0Var = (c0) this.f174910g;
            uq.b.e();
            if (this.f174908e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.contract.v2(new sm2.a.FraudIssueDescriptionData(onDescriptionChanged.getDescription(), hz.b.C2039b.f86846c));
            return c0Var.b(new er.l() { // from class: rm2.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O(onDescriptionChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnDescriptionChanged onDescriptionChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f174909f = onDescriptionChanged;
            cVar.f174910g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lrm2/b;", "<unused var>", "Lk10/c0;", "Lrm2/d;", "state", "Lk10/l;", "<anonymous>", "(Lrm2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<rm2.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f174912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f174913f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f174914g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f174915h;

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
                java.lang.Object r0 = r7.f174915h
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r7.f174914g
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L27
                if (r2 == r4) goto L23
                if (r2 != r3) goto L1b
                java.lang.Object r1 = r7.f174912e
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
                rm2.q r8 = rm2.q.this
                hm2.f r8 = rm2.q.j9(r8)
                hm2.f$c r2 = new hm2.f$c
                java.lang.Object r5 = r0.a()
                rm2.d r5 = (rm2.State) r5
                java.lang.String r5 = r5.getDescription()
                hm2.f$b r6 = hm2.f.b.FRAUD
                r2.<init>(r5, r6)
                r7.f174915h = r0
                r7.f174914g = r4
                java.lang.Object r8 = r8.e(r2, r7)
                if (r8 != r1) goto L4c
                goto La0
            L4c:
                rm2.q r2 = rm2.q.this
                hz.g r8 = (hz.g) r8
                boolean r4 = r8 instanceof hz.g.Invalid
                if (r4 == 0) goto L83
                hz.b$c r1 = new hz.b$c
                hz.g$a r8 = (hz.g.Invalid) r8
                hz.a r8 = r8.b()
                mx.a r8 = r8.getErrorMessage()
                r1.<init>(r8)
                sm2.a r8 = rm2.q.k9(r2)
                sm2.a$a r2 = new sm2.a$a
                java.lang.Object r3 = r0.a()
                rm2.d r3 = (rm2.State) r3
                java.lang.String r3 = r3.getDescription()
                r2.<init>(r3, r1)
                r8.v2(r2)
                rm2.s r8 = new rm2.s
                r8.<init>()
                k10.l r8 = r0.b(r8)
                return r8
            L83:
                hz.g$b r4 = hz.g.b.f86853b
                boolean r4 = fr.t.c(r8, r4)
                if (r4 == 0) goto Lab
                rm2.a$c r4 = rm2.a.c.f174855a
                r7.f174915h = r0
                java.lang.Object r8 = vq.j.a(r8)
                r7.f174912e = r8
                r8 = 0
                r7.f174913f = r8
                r7.f174914g = r3
                java.lang.Object r8 = r2.F(r4, r7)
                if (r8 != r1) goto La1
            La0:
                return r1
            La1:
                rm2.t r8 = new rm2.t
                r8.<init>()
                k10.l r8 = r0.b(r8)
                return r8
            Lab:
                oq.p r8 = new oq.p
                r8.<init>()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: rm2.q.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(rm2.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f174915h = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, f fVar, hm2.f fVar2, sm2.a aVar2) {
        this.mapper = fVar;
        this.checkIsIssueDescriptionValidUC = fVar2;
        this.contract = aVar2;
        sm2.a.FraudIssueDescriptionData fraudIssueDescriptionDataN8 = aVar2.n8();
        State state = new State(fraudIssueDescriptionDataN8.getDescription(), fraudIssueDescriptionDataN8.getValidationState());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: rm2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f174885a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data n9(State state) {
        return this.mapper.b(new f.Params(state, b9(rm2.b.f174856a), b9(rm2.a.b.f174854a), b9(rm2.a.C4465a.f174853a), new er.l() { // from class: rm2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.o9(this.f174883a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(q qVar, String str) {
        qVar.d9(new OnDescriptionChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: rm2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f174884a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(rm2.a.class), oVar, bVar);
        zVar.v(q0.c(OnDescriptionChanged.class), oVar, qVar.new c(null));
        zVar.v(q0.c(rm2.b.class), oVar, qVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<rm2.a> Y1() {
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
    public /* bridge */ Object F(rm2.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(sm2.a aVar) {
        super.P5(aVar);
    }
}
