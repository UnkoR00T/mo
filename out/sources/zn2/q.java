package zn2;

import a14.w;
import fr.q0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B3\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR&\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030 8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R \u0010,\u001a\b\u0012\u0004\u0012\u00020'0&8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00120-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lzn2/q;", "Ll00/g;", "Lzn2/f;", "", "Lzn2/g;", "Lyy/a;", "stateMachineFactory", "La14/w;", "openUrlUseCase", "Lao2/a;", "mapper", "Lu04/a;", "commonEndpoints", "Lzn2/d;", "setupData", "<init>", "(Lyy/a;La14/w;Lao2/a;Lu04/a;Lzn2/d;)V", "state", "Lzn2/g$a;", "n9", "(Lzn2/f;)Lzn2/g$a;", "b", "La14/w;", "c", "Lao2/a;", "d", "Lu04/a;", "e", "Lzn2/d;", "f", "Lzn2/f;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lzn2/b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w openUrlUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ao2.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final u04.a commonEndpoints;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final NetworkSecurityIssuesSuspiciousMessageNavigationParams setupData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<zn2.b> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f235754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f235755b;

        /* JADX INFO: renamed from: zn2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6367a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f235756a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f235757b;

            /* JADX INFO: renamed from: zn2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6368a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f235758d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f235759e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f235760f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f235762h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f235763j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f235764k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f235765l;

                public C6368a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f235758d = obj;
                    this.f235759e |= PKIFailureInfo.systemUnavail;
                    return C6367a.this.F(null, this);
                }
            }

            public C6367a(mu.h hVar, q qVar) {
                this.f235756a = hVar;
                this.f235757b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6368a c6368a;
                if (eVar instanceof C6368a) {
                    c6368a = (C6368a) eVar;
                    int i15 = c6368a.f235759e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6368a.f235759e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6368a = new C6368a(eVar);
                    }
                } else {
                    c6368a = new C6368a(eVar);
                }
                Object obj2 = c6368a.f235758d;
                Object objE = uq.b.e();
                int i16 = c6368a.f235759e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f235756a;
                    g.Data dataN9 = this.f235757b.n9((State) obj);
                    c6368a.f235760f = vq.j.a(obj);
                    c6368a.f235762h = vq.j.a(c6368a);
                    c6368a.f235763j = vq.j.a(obj);
                    c6368a.f235764k = vq.j.a(hVar);
                    c6368a.f235765l = 0;
                    c6368a.f235759e = 1;
                    if (hVar.F(dataN9, c6368a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f235754a = gVar;
            this.f235755b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f235754a.a(new C6367a(hVar, this.f235755b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzn2/a;", "<unused var>", "Lzn2/f;", "Loq/i0;", "<anonymous>", "(Lzn2/a;Lzn2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<zn2.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235766e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235766e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<zn2.b> bVarY1 = q.this.Y1();
                zn2.b.a aVar = zn2.b.a.f235722a;
                this.f235766e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(zn2.a aVar, State state, tq.e<? super i0> eVar) {
            return q.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lzn2/c;", "<unused var>", "Lzn2/f;", "Loq/i0;", "<anonymous>", "(Lzn2/c;Lzn2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<OpenWebsite, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f235768e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f235768e;
            if (i15 == 0) {
                u.b(obj);
                w wVar = q.this.openUrlUseCase;
                w.Params params = new w.Params(q.this.commonEndpoints.j0(), false, 2, null);
                this.f235768e = 1;
                if (wVar.c(params, this) == objE) {
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
        public final Object w(OpenWebsite openWebsite, State state, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, w wVar, ao2.a aVar2, u04.a aVar3, NetworkSecurityIssuesSuspiciousMessageNavigationParams networkSecurityIssuesSuspiciousMessageNavigationParams) {
        this.openUrlUseCase = wVar;
        this.mapper = aVar2;
        this.commonEndpoints = aVar3;
        this.setupData = networkSecurityIssuesSuspiciousMessageNavigationParams;
        State state = new State(networkSecurityIssuesSuspiciousMessageNavigationParams.getScreenType());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: zn2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.q9(this.f235745a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data n9(State state) {
        return this.mapper.b(new ao2.a.Params(state, new er.l() { // from class: zn2.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.o9(this.f235742a, (String) obj);
            }
        }, b9(zn2.a.f235721a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(q qVar, String str) {
        qVar.d9(new OpenWebsite(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final q qVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: zn2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f235743a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: zn2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f235744a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        zVar.x(q0.c(zn2.a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(q qVar, z zVar) {
        c cVar = qVar.new c(null);
        zVar.x(q0.c(OpenWebsite.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<zn2.b> Y1() {
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
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(NetworkSecurityIssuesSuspiciousMessageNavigationParams networkSecurityIssuesSuspiciousMessageNavigationParams) {
        super.P5(networkSecurityIssuesSuspiciousMessageNavigationParams);
    }
}
