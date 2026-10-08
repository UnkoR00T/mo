package bo2;

import a14.w;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR&\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030!8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130.8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lbo2/n;", "Ll00/g;", "Lbo2/c;", "Lbo2/a;", "Lbo2/d;", "", "Lyy/a;", "stateMachineFactory", "La14/w;", "openUrlUseCase", "Lib4/c;", "genericDomainErrorHandler", "Lbo2/f;", "mapper", "Lbo2/b;", "setupData", "<init>", "(Lyy/a;La14/w;Lib4/c;Lbo2/f;Lbo2/b;)V", "state", "Lbo2/d$a;", "n9", "(Lbo2/c;)Lbo2/d$a;", "b", "La14/w;", "c", "Lib4/c;", "d", "Lbo2/f;", "e", "Lbo2/b;", "f", "Lbo2/c;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lbo2/a$c;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, bo2.a> implements bo2.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w openUrlUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f mapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final NetworkSecurityIssuesWelcomePageNavigationParams setupData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<State, bo2.a> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bo2.a.c> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<bo2.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<bo2.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f20624a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f20625b;

        /* JADX INFO: renamed from: bo2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0543a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f20626a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f20627b;

            /* JADX INFO: renamed from: bo2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0544a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f20628d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f20629e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f20630f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f20632h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f20633j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f20634k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f20635l;

                public C0544a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f20628d = obj;
                    this.f20629e |= PKIFailureInfo.systemUnavail;
                    return C0543a.this.F(null, this);
                }
            }

            public C0543a(mu.h hVar, n nVar) {
                this.f20626a = hVar;
                this.f20627b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0544a c0544a;
                if (eVar instanceof C0544a) {
                    c0544a = (C0544a) eVar;
                    int i15 = c0544a.f20629e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0544a.f20629e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0544a = new C0544a(eVar);
                    }
                } else {
                    c0544a = new C0544a(eVar);
                }
                Object obj2 = c0544a.f20628d;
                Object objE = uq.b.e();
                int i16 = c0544a.f20629e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f20626a;
                    bo2.d.Data dataN9 = this.f20627b.n9((State) obj);
                    c0544a.f20630f = vq.j.a(obj);
                    c0544a.f20632h = vq.j.a(c0544a);
                    c0544a.f20633j = vq.j.a(obj);
                    c0544a.f20634k = vq.j.a(hVar);
                    c0544a.f20635l = 0;
                    c0544a.f20629e = 1;
                    if (hVar.F(dataN9, c0544a) == objE) {
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

        public a(mu.g gVar, n nVar) {
            this.f20624a = gVar;
            this.f20625b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bo2.d.Data> hVar, tq.e eVar) {
            Object objA = this.f20624a.a(new C0543a(hVar, this.f20625b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbo2/a$b;", "action", "Lbo2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbo2/a$b;Lbo2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<bo2.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20636e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20637f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(n nVar, bo2.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    nVar.d9(bo2.a.C0538a.f20576a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    nVar.d9(error);
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bo2.a.Error error = (bo2.a.Error) this.f20637f;
            Object objE = uq.b.e();
            int i15 = this.f20636e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bo2.a.c> bVarY1 = n.this.Y1();
                ib4.c cVar = n.this.genericDomainErrorHandler;
                dx.b domainError = error.getDomainError();
                final n nVar = n.this;
                bo2.a.c.Error error2 = new bo2.a.c.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: bo2.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.b.O(nVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f20637f = vq.j.a(error);
                this.f20636e = 1;
                if (bVarY1.F(error2, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bo2.a.Error error, State state, tq.e<? super i0> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f20637f = error;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbo2/a$e;", "action", "Lbo2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbo2/a$e;Lbo2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<bo2.a.OnUrlClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20639e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20640f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bo2.a.OnUrlClick onUrlClick = (bo2.a.OnUrlClick) this.f20640f;
            Object objE = uq.b.e();
            int i15 = this.f20639e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = n.this.openUrlUseCase;
                w.Params params = new w.Params(onUrlClick.getUrl(), false, 2, null);
                this.f20640f = vq.j.a(onUrlClick);
                this.f20639e = 1;
                obj = wVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            n nVar = n.this;
            if (iVar instanceof dx.i.Left) {
                nVar.d9(new bo2.a.Error((dx.b.Business) ((dx.i.Left) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bo2.a.OnUrlClick onUrlClick, State state, tq.e<? super i0> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f20640f = onUrlClick;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbo2/a$d;", "<unused var>", "Lbo2/c;", "state", "Loq/i0;", "<anonymous>", "(Lbo2/a$d;Lbo2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<bo2.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20642e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f20643f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f20643f;
            Object objE = uq.b.e();
            int i15 = this.f20642e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bo2.a.c> bVarY1 = n.this.Y1();
                bo2.a.c.Next next = new bo2.a.c.Next(state.getNextDestination());
                this.f20643f = vq.j.a(state);
                this.f20642e = 1;
                if (bVarY1.F(next, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bo2.a.d dVar, State state, tq.e<? super i0> eVar) {
            d dVar2 = n.this.new d(eVar);
            dVar2.f20643f = state;
            return dVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbo2/a$a;", "<unused var>", "Lbo2/c;", "Loq/i0;", "<anonymous>", "(Lbo2/a$a;Lbo2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bo2.a.C0538a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f20645e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f20645e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bo2.a.c> bVarY1 = n.this.Y1();
                bo2.a.c.C0539a c0539a = bo2.a.c.C0539a.f20578a;
                this.f20645e = 1;
                if (bVarY1.F(c0539a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bo2.a.C0538a c0538a, State state, tq.e<? super i0> eVar) {
            return n.this.new e(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, w wVar, ib4.c cVar, f fVar, NetworkSecurityIssuesWelcomePageNavigationParams networkSecurityIssuesWelcomePageNavigationParams) {
        this.openUrlUseCase = wVar;
        this.genericDomainErrorHandler = cVar;
        this.mapper = fVar;
        this.setupData = networkSecurityIssuesWelcomePageNavigationParams;
        State state = new State(networkSecurityIssuesWelcomePageNavigationParams.getPageType(), networkSecurityIssuesWelcomePageNavigationParams.getTopBarTitle(), networkSecurityIssuesWelcomePageNavigationParams.getNextDestination());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: bo2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f20615a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bo2.d.Data n9(State state) {
        return this.mapper.b(new f.Params(state, new er.l() { // from class: bo2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f20613a, (String) obj);
            }
        }, b9(bo2.a.d.f20581a), b9(bo2.a.C0538a.f20576a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, String str) {
        nVar.d9(new bo2.a.OnUrlClick(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: bo2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f20614a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bo2.a.Error.class), oVar, bVar);
        zVar.x(q0.c(bo2.a.OnUrlClick.class), oVar, nVar.new c(null));
        zVar.x(q0.c(bo2.a.d.class), oVar, nVar.new d(null));
        zVar.x(q0.c(bo2.a.C0538a.class), oVar, nVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bo2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, bo2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bo2.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(NetworkSecurityIssuesWelcomePageNavigationParams networkSecurityIssuesWelcomePageNavigationParams) {
        super.P5(networkSecurityIssuesWelcomePageNavigationParams);
    }
}
