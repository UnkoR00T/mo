package an2;

import fr.q0;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B#\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R&\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00198\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lan2/n;", "Ll00/g;", "Lan2/b;", "Lan2/a;", "Lan2/c;", "", "Lyy/a;", "stateMachineFactory", "Lan2/d;", "mapper", "Lbn2/a;", "contract", "<init>", "(Lyy/a;Lan2/d;Lbn2/a;)V", "state", "Lan2/c$a;", "n9", "(Lan2/b;)Lan2/c$a;", "b", "Lan2/d;", "c", "Lbn2/a;", "d", "Lan2/b;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "f", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lan2/a$b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, an2.a> implements an2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final an2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bn2.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, an2.a> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p0<an2.c.Data> state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<an2.a.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<an2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f7988a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f7989b;

        /* JADX INFO: renamed from: an2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0179a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f7990a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f7991b;

            /* JADX INFO: renamed from: an2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0180a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f7992d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f7993e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f7994f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f7996h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f7997j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f7998k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f7999l;

                public C0180a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f7992d = obj;
                    this.f7993e |= PKIFailureInfo.systemUnavail;
                    return C0179a.this.F(null, this);
                }
            }

            public C0179a(mu.h hVar, n nVar) {
                this.f7990a = hVar;
                this.f7991b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0180a c0180a;
                if (eVar instanceof C0180a) {
                    c0180a = (C0180a) eVar;
                    int i15 = c0180a.f7993e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0180a.f7993e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0180a = new C0180a(eVar);
                    }
                } else {
                    c0180a = new C0180a(eVar);
                }
                Object obj2 = c0180a.f7992d;
                Object objE = uq.b.e();
                int i16 = c0180a.f7993e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f7990a;
                    an2.c.Data dataN9 = this.f7991b.n9((State) obj);
                    c0180a.f7994f = vq.j.a(obj);
                    c0180a.f7996h = vq.j.a(c0180a);
                    c0180a.f7997j = vq.j.a(obj);
                    c0180a.f7998k = vq.j.a(hVar);
                    c0180a.f7999l = 0;
                    c0180a.f7993e = 1;
                    if (hVar.F(dataN9, c0180a) == objE) {
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
            this.f7988a = gVar;
            this.f7989b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super an2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f7988a.a(new C0179a(hVar, this.f7989b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lan2/a$b;", "action", "Lan2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lan2/a$b;Lan2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<an2.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8000e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f8001f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            an2.a.b bVar = (an2.a.b) this.f8001f;
            Object objE = uq.b.e();
            int i15 = this.f8000e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                this.f8001f = vq.j.a(bVar);
                this.f8000e = 1;
                if (nVar.F(bVar, this) == objE) {
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
        public final Object w(an2.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = n.this.new b(eVar);
            bVar2.f8001f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lan2/a$a;", "action", "Lk10/c0;", "Lan2/b;", "state", "Lk10/l;", "<anonymous>", "(Lan2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<an2.a.ChangeIssueDescription, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8003e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f8004f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f8005g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(an2.a.ChangeIssueDescription changeIssueDescription, State state) {
            return state.a(changeIssueDescription.getIssueDescription());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final an2.a.ChangeIssueDescription changeIssueDescription = (an2.a.ChangeIssueDescription) this.f8004f;
            c0 c0Var = (c0) this.f8005g;
            uq.b.e();
            if (this.f8003e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n.this.contract.y7(changeIssueDescription.getIssueDescription());
            return c0Var.b(new er.l() { // from class: an2.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.c.O(changeIssueDescription, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(an2.a.ChangeIssueDescription changeIssueDescription, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f8004f = changeIssueDescription;
            cVar.f8005g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lan2/a$c;", "<unused var>", "Lan2/b;", "Loq/i0;", "<anonymous>", "(Lan2/a$c;Lan2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<an2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f8007e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f8007e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            n.this.d9(an2.a.b.c.f7956a);
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(an2.a.c cVar, State state, tq.e<? super i0> eVar) {
            return n.this.new d(eVar).J(i0.f148189a);
        }
    }

    public n(yy.a aVar, an2.d dVar, bn2.a aVar2) {
        this.mapper = dVar;
        this.contract = aVar2;
        State state = new State(aVar2.Y3());
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: an2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f7981a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final an2.c.Data n9(State state) {
        return this.mapper.b(new an2.d.Params(state, b9(an2.a.c.f7957a), b9(an2.a.b.C0178b.f7955a), b9(an2.a.b.C0177a.f7954a), new er.l() { // from class: an2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.o9(this.f7979a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(n nVar, String str) {
        nVar.d9(new an2.a.ChangeIssueDescription(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: an2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f7980a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(an2.a.b.class), oVar, bVar);
        zVar.v(q0.c(an2.a.ChangeIssueDescription.class), oVar, nVar.new c(null));
        zVar.x(q0.c(an2.a.c.class), oVar, nVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<an2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, an2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<an2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: m9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(an2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(bn2.a aVar) {
        super.P5(aVar);
    }
}
