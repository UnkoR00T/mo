package gs1;

import f00.j0;
import fr.q0;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001*B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lgs1/m;", "Ll00/g;", "Lgs1/d;", "", "Lgs1/e;", "Lyy/a;", "stateMachineFactory", "Lgs1/f;", "mapper", "Lgs1/s;", "setupContract", "<init>", "(Lyy/a;Lgs1/f;Lgs1/s;)V", "state", "Lgs1/e$a;", "l9", "(Lgs1/d;)Lgs1/e$a;", "b", "Lgs1/f;", "c", "Lgs1/s;", "d", "Lgs1/d;", "initialState", "Lxw/b;", "Lgs1/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s setupContract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gs1.c> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lgs1/m$a;", "Lf00/j0;", "Lgs1/s;", "Lgs1/m;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<s, m> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f76637a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f76638b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f76639a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f76640b;

            /* JADX INFO: renamed from: gs1.m$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1732a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f76641d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f76642e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f76643f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f76645h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f76646j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f76647k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f76648l;

                public C1732a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f76641d = obj;
                    this.f76642e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f76639a = hVar;
                this.f76640b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1732a c1732a;
                if (eVar instanceof C1732a) {
                    c1732a = (C1732a) eVar;
                    int i15 = c1732a.f76642e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1732a.f76642e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1732a = new C1732a(eVar);
                    }
                } else {
                    c1732a = new C1732a(eVar);
                }
                Object obj2 = c1732a.f76641d;
                Object objE = uq.b.e();
                int i16 = c1732a.f76642e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f76639a;
                    e.Data dataL9 = this.f76640b.l9((State) obj);
                    c1732a.f76643f = vq.j.a(obj);
                    c1732a.f76645h = vq.j.a(c1732a);
                    c1732a.f76646j = vq.j.a(obj);
                    c1732a.f76647k = vq.j.a(hVar);
                    c1732a.f76648l = 0;
                    c1732a.f76642e = 1;
                    if (hVar.F(dataL9, c1732a) == objE) {
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

        public b(mu.g gVar, m mVar) {
            this.f76637a = gVar;
            this.f76638b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f76637a.a(new a(hVar, this.f76638b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgs1/b;", "<unused var>", "Lk10/c0;", "Lgs1/d;", "state", "Lk10/l;", "<anonymous>", "(Lgs1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<gs1.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f76649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f76650f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76651g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, false, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f76651g;
            Object objE = uq.b.e();
            int i15 = this.f76650f;
            if (i15 == 0) {
                u.b(obj);
                FirstStepData firstStepData = ((State) c0Var.a()).getFirstStepData();
                if (firstStepData.getFoo().length() == 0) {
                    return c0Var.b(new er.l() { // from class: gs1.n
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return m.c.O((State) obj2);
                        }
                    });
                }
                m.this.setupContract.J7(firstStepData);
                xw.b<gs1.c> bVarY1 = m.this.Y1();
                gs1.c.b bVar = gs1.c.b.f76615a;
                this.f76651g = c0Var;
                this.f76649e = vq.j.a(firstStepData);
                this.f76650f = 1;
                if (bVarY1.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gs1.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f76651g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgs1/a;", "action", "Lk10/c0;", "Lgs1/d;", "state", "Lk10/l;", "<anonymous>", "(Lgs1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<OnInputDataChange, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f76654f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f76655g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(OnInputDataChange onInputDataChange, State state) {
            return state.a(new FirstStepData(onInputDataChange.getValue()), true);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final OnInputDataChange onInputDataChange = (OnInputDataChange) this.f76654f;
            c0 c0Var = (c0) this.f76655g;
            uq.b.e();
            if (this.f76653e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: gs1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.d.O(onInputDataChange, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(OnInputDataChange onInputDataChange, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f76654f = onInputDataChange;
            dVar.f76655g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, f fVar, s sVar) {
        this.mapper = fVar;
        this.setupContract = sVar;
        State state = new State(sVar.L5(), true);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: gs1.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f76628a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data l9(State state) {
        return this.mapper.b(new f.Params(state, new er.l() { // from class: gs1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f76630a, (String) obj);
            }
        }, b9(gs1.b.f76613a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, String str) {
        mVar.d9(new OnInputDataChange(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: gs1.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f76629a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(m mVar, z zVar) {
        c cVar = mVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(gs1.b.class), oVar, cVar);
        zVar.v(q0.c(OnInputDataChange.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<gs1.c> Y1() {
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
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(e.Data data) {
        super.P5(data);
    }
}
