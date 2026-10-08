package lz1;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import un0.AvailableElectionSupport;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0001\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Llz1/l;", "Ll00/g;", "Llz1/c;", "", "Llz1/d;", "Lmz1/a;", "mapper", "Lun0/a;", "availableElectionSupport", "Lyy/a;", "stateMachineFactory", "<init>", "(Lmz1/a;Lun0/a;Lyy/a;)V", "state", "Llz1/d$a;", "k9", "(Llz1/c;)Llz1/d$a;", "b", "Lmz1/a;", "c", "Lun0/a;", "d", "Llz1/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Llz1/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "electoralsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mz1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AvailableElectionSupport availableElectionSupport;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<lz1.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f121675a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f121676b;

        /* JADX INFO: renamed from: lz1.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2982a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f121677a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f121678b;

            /* JADX INFO: renamed from: lz1.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2983a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f121679d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f121680e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f121681f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f121683h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f121684j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f121685k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f121686l;

                public C2983a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f121679d = obj;
                    this.f121680e |= PKIFailureInfo.systemUnavail;
                    return C2982a.this.F(null, this);
                }
            }

            public C2982a(mu.h hVar, l lVar) {
                this.f121677a = hVar;
                this.f121678b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2983a c2983a;
                if (eVar instanceof C2983a) {
                    c2983a = (C2983a) eVar;
                    int i15 = c2983a.f121680e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2983a.f121680e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2983a = new C2983a(eVar);
                    }
                } else {
                    c2983a = new C2983a(eVar);
                }
                Object obj2 = c2983a.f121679d;
                Object objE = uq.b.e();
                int i16 = c2983a.f121680e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f121677a;
                    d.Data dataK9 = this.f121678b.k9((State) obj);
                    c2983a.f121681f = vq.j.a(obj);
                    c2983a.f121683h = vq.j.a(c2983a);
                    c2983a.f121684j = vq.j.a(obj);
                    c2983a.f121685k = vq.j.a(hVar);
                    c2983a.f121686l = 0;
                    c2983a.f121680e = 1;
                    if (hVar.F(dataK9, c2983a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f121675a = gVar;
            this.f121676b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f121675a.a(new C2982a(hVar, this.f121676b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llz1/a;", "action", "Llz1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Llz1/a;Llz1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<lz1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121688f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lz1.a aVar = (lz1.a) this.f121688f;
            Object objE = uq.b.e();
            int i15 = this.f121687e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                this.f121688f = vq.j.a(aVar);
                this.f121687e = 1;
                if (lVar.F(aVar, this) == objE) {
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
        public final Object w(lz1.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f121688f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Llz1/b;", "<unused var>", "Llz1/c;", "state", "Loq/i0;", "<anonymous>", "(Llz1/b;Llz1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<lz1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f121690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f121691f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f121691f;
            Object objE = uq.b.e();
            int i15 = this.f121690e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                lz1.a.Next next = new lz1.a.Next(state.getAvailableElectionSupport());
                this.f121691f = vq.j.a(state);
                this.f121690e = 1;
                if (lVar.F(next, this) == objE) {
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
        public final Object w(lz1.b bVar, State state, tq.e<? super i0> eVar) {
            c cVar = l.this.new c(eVar);
            cVar.f121691f = state;
            return cVar.J(i0.f148189a);
        }
    }

    public l(mz1.a aVar, AvailableElectionSupport availableElectionSupport, yy.a aVar2) {
        this.mapper = aVar;
        this.availableElectionSupport = availableElectionSupport;
        State state = new State(availableElectionSupport);
        this.initialState = state;
        this.stateMachine = aVar2.a(state, new er.l() { // from class: lz1.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.m9(this.f121668a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), k9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data k9(State state) {
        return this.mapper.b(new mz1.a.Params(state, b9(lz1.a.b.f121651a), b9(lz1.a.C2981a.f121650a), b9(lz1.b.f121653a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final l lVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: lz1.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f121667a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(lz1.a.class), oVar, bVar);
        zVar.x(q0.c(lz1.b.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<lz1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: j9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(lz1.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(AvailableElectionSupport availableElectionSupport) {
        super.P5(availableElectionSupport);
    }
}
