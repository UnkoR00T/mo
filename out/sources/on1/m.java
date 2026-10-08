package on1;

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

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R&\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lon1/m;", "Ll00/g;", "Lon1/c;", "", "Lon1/d;", "Lyy/a;", "stateMachineFactory", "Lpn1/a;", "mapper", "Lon1/e;", "data", "<init>", "(Lyy/a;Lpn1/a;Lon1/e;)V", "state", "Lon1/d$a;", "j9", "(Lon1/c;)Lon1/d$a;", "b", "Lpn1/a;", "c", "Lon1/e;", "d", "Lon1/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lon1/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pn1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ProhibitedAccessData data;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<on1.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f147091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f147092b;

        /* JADX INFO: renamed from: on1.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3660a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f147093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f147094b;

            /* JADX INFO: renamed from: on1.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3661a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f147095d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f147096e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f147097f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f147099h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f147100j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f147101k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f147102l;

                public C3661a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f147095d = obj;
                    this.f147096e |= PKIFailureInfo.systemUnavail;
                    return C3660a.this.F(null, this);
                }
            }

            public C3660a(mu.h hVar, m mVar) {
                this.f147093a = hVar;
                this.f147094b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3661a c3661a;
                if (eVar instanceof C3661a) {
                    c3661a = (C3661a) eVar;
                    int i15 = c3661a.f147096e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3661a.f147096e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3661a = new C3661a(eVar);
                    }
                } else {
                    c3661a = new C3661a(eVar);
                }
                Object obj2 = c3661a.f147095d;
                Object objE = uq.b.e();
                int i16 = c3661a.f147096e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f147093a;
                    d.Data dataJ9 = this.f147094b.j9((State) obj);
                    c3661a.f147097f = vq.j.a(obj);
                    c3661a.f147099h = vq.j.a(c3661a);
                    c3661a.f147100j = vq.j.a(obj);
                    c3661a.f147101k = vq.j.a(hVar);
                    c3661a.f147102l = 0;
                    c3661a.f147096e = 1;
                    if (hVar.F(dataJ9, c3661a) == objE) {
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
            this.f147091a = gVar;
            this.f147092b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f147091a.a(new C3660a(hVar, this.f147092b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lon1/b;", "<unused var>", "Lon1/c;", "Loq/i0;", "<anonymous>", "(Lon1/b;Lon1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<on1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f147103e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f147103e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<on1.a> bVarY1 = m.this.Y1();
                on1.a.C3659a c3659a = on1.a.C3659a.f147068a;
                this.f147103e = 1;
                if (bVarY1.F(c3659a, this) == objE) {
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
        public final Object w(on1.b bVar, State state, tq.e<? super i0> eVar) {
            return m.this.new b(eVar).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, pn1.a aVar2, ProhibitedAccessData prohibitedAccessData) {
        this.mapper = aVar2;
        this.data = prohibitedAccessData;
        State state = new State(prohibitedAccessData);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: on1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.l9(this.f147084a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), j9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data j9(State state) {
        return this.mapper.b(new pn1.a.Params(state, b9(on1.b.f147069a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: on1.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f147083a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        zVar.x(q0.c(on1.b.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<on1.a> Y1() {
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
    /* JADX INFO: renamed from: k9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(ProhibitedAccessData prohibitedAccessData) {
        super.P5(prohibitedAccessData);
    }
}
