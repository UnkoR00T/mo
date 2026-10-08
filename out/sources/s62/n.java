package s62;

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

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B;\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0001\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R&\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030,8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R \u00108\u001a\b\u0012\u0004\u0012\u000203028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001c098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006>"}, d2 = {"Ls62/n;", "Ll00/g;", "Ls62/c;", "Ls62/a;", "Ls62/d;", "", "Lyy/a;", "stateMachineFactory", "Lt62/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "Lib4/c;", "genericDomainErrorHandler", "Li70/e;", "globalSnackBarManager", "Ls62/b;", "setupData", "<init>", "(Lyy/a;Lt62/a;La14/w;Lib4/c;Li70/e;Ls62/b;)V", "", "url", "Ldx/i;", "Ldx/b$c;", "Loq/i0;", "q9", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "state", "Ls62/d$a;", "o9", "(Ls62/c;)Ls62/d$a;", "b", "Lt62/a;", "c", "La14/w;", "d", "Lib4/c;", "e", "Li70/e;", "f", "Ls62/b;", "g", "Ls62/c;", "initialState", "Lk10/t;", "h", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ls62/a$c;", "j", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "fines_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, s62.a> implements s62.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t62.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e globalSnackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TicketDetailsDestinationParams setupData;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t<State, s62.a> stateMachine;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s62.a.c> navAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<s62.d.Data> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f178301d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f178302e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f178304g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f178302e = obj;
            this.f178304g |= PKIFailureInfo.systemUnavail;
            return n.this.q9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<s62.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f178305a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f178306b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f178307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f178308b;

            /* JADX INFO: renamed from: s62.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4569a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f178309d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f178310e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f178311f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f178313h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f178314j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f178315k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f178316l;

                public C4569a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f178309d = obj;
                    this.f178310e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f178307a = hVar;
                this.f178308b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4569a c4569a;
                if (eVar instanceof C4569a) {
                    c4569a = (C4569a) eVar;
                    int i15 = c4569a.f178310e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4569a.f178310e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4569a = new C4569a(eVar);
                    }
                } else {
                    c4569a = new C4569a(eVar);
                }
                Object obj2 = c4569a.f178309d;
                Object objE = uq.b.e();
                int i16 = c4569a.f178310e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f178307a;
                    s62.d.Data dataO9 = this.f178308b.o9((State) obj);
                    c4569a.f178311f = vq.j.a(obj);
                    c4569a.f178313h = vq.j.a(c4569a);
                    c4569a.f178314j = vq.j.a(obj);
                    c4569a.f178315k = vq.j.a(hVar);
                    c4569a.f178316l = 0;
                    c4569a.f178310e = 1;
                    if (hVar.F(dataO9, c4569a) == objE) {
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

        public b(mu.g gVar, n nVar) {
            this.f178305a = gVar;
            this.f178306b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super s62.d.Data> hVar, tq.e eVar) {
            Object objA = this.f178305a.a(new a(hVar, this.f178306b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls62/a$a;", "<unused var>", "Ls62/c;", "Loq/i0;", "<anonymous>", "(Ls62/a$a;Ls62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<s62.a.C4566a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178317e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178317e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<s62.a.c> bVarY1 = n.this.Y1();
                s62.a.c.C4567a c4567a = s62.a.c.C4567a.f178267a;
                this.f178317e = 1;
                if (bVarY1.F(c4567a, this) == objE) {
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
        public final Object w(s62.a.C4566a c4566a, State state, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls62/a$e;", "<unused var>", "Ls62/c;", "Loq/i0;", "<anonymous>", "(Ls62/a$e;Ls62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<s62.a.e, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178319e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f178319e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<s62.a.c> bVarY1 = n.this.Y1();
                s62.a.c.C4568c c4568c = s62.a.c.C4568c.f178269a;
                this.f178319e = 1;
                if (bVarY1.F(c4568c, this) == objE) {
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
        public final Object w(s62.a.e eVar, State state, tq.e<? super i0> eVar2) {
            return n.this.new d(eVar2).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls62/a$d;", "action", "Ls62/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls62/a$d;Ls62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<s62.a.OnUrlClick, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178322f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s62.a.OnUrlClick onUrlClick = (s62.a.OnUrlClick) this.f178322f;
            Object objE = uq.b.e();
            int i15 = this.f178321e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                String url = onUrlClick.getUrl();
                this.f178322f = vq.j.a(onUrlClick);
                this.f178321e = 1;
                if (nVar.q9(url, this) == objE) {
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
        public final Object w(s62.a.OnUrlClick onUrlClick, State state, tq.e<? super i0> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f178322f = onUrlClick;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls62/a$b;", "action", "Ls62/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ls62/a$b;Ls62/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<s62.a.Error, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f178324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f178325f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(n nVar, s62.a.Error error, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if ((bVar instanceof ib4.c.b.a.Close) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    nVar.d9(s62.a.C4566a.f178264a);
                } else {
                    if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                        throw new oq.p();
                    }
                    nVar.d9(error.getRetryAction());
                }
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final s62.a.Error error = (s62.a.Error) this.f178325f;
            Object objE = uq.b.e();
            int i15 = this.f178324e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<s62.a.c> bVarY1 = n.this.Y1();
                ib4.c cVar = n.this.genericDomainErrorHandler;
                dx.b domainError = error.getDomainError();
                final n nVar = n.this;
                s62.a.c.Error error2 = new s62.a.c.Error(cVar.b(new ib4.c.Params(domainError, false, new er.l() { // from class: s62.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.f.O(nVar, error, (ib4.c.b) obj2);
                    }
                }, 2, null)));
                this.f178325f = vq.j.a(error);
                this.f178324e = 1;
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
        public final Object w(s62.a.Error error, State state, tq.e<? super i0> eVar) {
            f fVar = n.this.new f(eVar);
            fVar.f178325f = error;
            return fVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, t62.a aVar2, w wVar, ib4.c cVar, i70.e eVar, TicketDetailsDestinationParams ticketDetailsDestinationParams) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.genericDomainErrorHandler = cVar;
        this.globalSnackBarManager = eVar;
        this.setupData = ticketDetailsDestinationParams;
        State state = new State(ticketDetailsDestinationParams.getPaymentStatus(), ticketDetailsDestinationParams.getTicket());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: s62.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.s9(this.f178291a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new b(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s62.d.Data o9(State state) {
        return this.mapper.b(new t62.a.Params(state, b9(s62.a.C4566a.f178264a), b9(s62.a.e.f178271a), new er.l() { // from class: s62.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f178290a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(n nVar, String str) {
        nVar.d9(new s62.a.OnUrlClick(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object q9(String str, tq.e<? super dx.i<dx.b.Business, i0>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f178304g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f178304g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objC = aVar.f178302e;
        Object objE = uq.b.e();
        int i16 = aVar.f178304g;
        if (i16 == 0) {
            u.b(objC);
            w wVar = this.openUrlIntentUseCase;
            w.Params params = new w.Params(str, false, 2, null);
            aVar.f178301d = vq.j.a(str);
            aVar.f178304g = 1;
            objC = wVar.c(params, aVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            this.globalSnackBarManager.y(new p50.a.Default(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, 6, null));
        }
        return iVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: s62.j
            @Override // er.l
            public final Object b(Object obj) {
                return n.t9(this.f178288a, (z) obj);
            }
        });
        vVar.c(q0.c(State.class), new er.l() { // from class: s62.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.u9(this.f178289a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        zVar.x(q0.c(s62.a.C4566a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(n nVar, z zVar) {
        d dVar = nVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(s62.a.e.class), oVar, dVar);
        zVar.x(q0.c(s62.a.OnUrlClick.class), oVar, nVar.new e(null));
        zVar.x(q0.c(s62.a.Error.class), oVar, nVar.new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s62.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, s62.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<s62.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(TicketDetailsDestinationParams ticketDetailsDestinationParams) {
        super.P5(ticketDetailsDestinationParams);
    }
}
