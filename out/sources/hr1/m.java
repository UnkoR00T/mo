package hr1;

import fr.q0;
import java.util.Map;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001a\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Lhr1/m;", "Ll00/g;", "Lhr1/c;", "", "Lhr1/d;", "Lyy/a;", "stateMachineFactory", "Lir1/b;", "mapper", "Lc54/a;", "getLocalFeaturesUseCase", "Lc54/c;", "updateLocalFeatureFlagUseCase", "<init>", "(Lyy/a;Lir1/b;Lc54/a;Lc54/c;)V", "Lhr1/d$a;", "m9", "(Lhr1/c;)Lhr1/d$a;", "b", "Lir1/b;", "c", "Lc54/a;", "d", "Lc54/c;", "e", "Lhr1/c;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lhr1/a;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements hr1.d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ir1.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c54.a getLocalFeaturesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final c54.c updateLocalFeatureFlagUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hr1.a> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<hr1.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<hr1.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f86404a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f86405b;

        /* JADX INFO: renamed from: hr1.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2016a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f86406a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f86407b;

            /* JADX INFO: renamed from: hr1.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2017a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f86408d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f86409e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f86410f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f86412h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f86413j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f86414k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f86415l;

                public C2017a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f86408d = obj;
                    this.f86409e |= PKIFailureInfo.systemUnavail;
                    return C2016a.this.F(null, this);
                }
            }

            public C2016a(mu.h hVar, m mVar) {
                this.f86406a = hVar;
                this.f86407b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2017a c2017a;
                if (eVar instanceof C2017a) {
                    c2017a = (C2017a) eVar;
                    int i15 = c2017a.f86409e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2017a.f86409e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2017a = new C2017a(eVar);
                    }
                } else {
                    c2017a = new C2017a(eVar);
                }
                Object obj2 = c2017a.f86408d;
                Object objE = uq.b.e();
                int i16 = c2017a.f86409e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f86406a;
                    hr1.d.Data dataM9 = this.f86407b.m9((State) obj);
                    c2017a.f86410f = vq.j.a(obj);
                    c2017a.f86412h = vq.j.a(c2017a);
                    c2017a.f86413j = vq.j.a(obj);
                    c2017a.f86414k = vq.j.a(hVar);
                    c2017a.f86415l = 0;
                    c2017a.f86409e = 1;
                    if (hVar.F(dataM9, c2017a) == objE) {
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
            this.f86404a = gVar;
            this.f86405b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super hr1.d.Data> hVar, tq.e eVar) {
            Object objA = this.f86404a.a(new C2016a(hVar, this.f86405b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhr1/a;", "action", "Lhr1/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhr1/a;Lhr1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<hr1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86417f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hr1.a aVar = (hr1.a) this.f86417f;
            Object objE = uq.b.e();
            int i15 = this.f86416e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<hr1.a> bVarY1 = m.this.Y1();
                this.f86417f = vq.j.a(aVar);
                this.f86416e = 1;
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
        public final Object w(hr1.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f86417f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Lhr1/c;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86419e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86420f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            return state.a(map);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f86420f;
            uq.b.e();
            if (this.f86419e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final Map<b54.c, ? extends Boolean> mapA = m.this.getLocalFeaturesUseCase.a(gz.b.a.C1792a.f78542a);
            return c0Var.b(new er.l() { // from class: hr1.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.c.O(mapA, (State) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            return ((c) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f86420f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lhr1/b;", "action", "Lk10/c0;", "Lhr1/c;", "state", "Lk10/l;", "<anonymous>", "(Lhr1/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<SetFeatureFlag, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f86422e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f86423f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86424g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Map map, State state) {
            return state.a(map);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            SetFeatureFlag setFeatureFlag = (SetFeatureFlag) this.f86423f;
            c0 c0Var = (c0) this.f86424g;
            uq.b.e();
            if (this.f86422e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            m.this.updateLocalFeatureFlagUseCase.a(new c54.c.Params(setFeatureFlag.getFeatureFlag(), setFeatureFlag.getEnabled()));
            final Map<b54.c, ? extends Boolean> mapA = m.this.getLocalFeaturesUseCase.a(gz.b.a.C1792a.f78542a);
            return c0Var.b(new er.l() { // from class: hr1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return m.d.O(mapA, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SetFeatureFlag setFeatureFlag, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = m.this.new d(eVar);
            dVar.f86423f = setFeatureFlag;
            dVar.f86424g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, ir1.b bVar, c54.a aVar2, c54.c cVar) {
        this.mapper = bVar;
        this.getLocalFeaturesUseCase = aVar2;
        this.updateLocalFeatureFlagUseCase = cVar;
        State state = new State(null, 1, null);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: hr1.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f86394a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hr1.d.Data m9(State state) {
        return this.mapper.b(new ir1.b.Params(state, new er.p() { // from class: hr1.k
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return m.n9(this.f86395a, (b54.c) obj, ((Boolean) obj2).booleanValue());
            }
        }, b9(hr1.a.C2015a.f86380a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(m mVar, b54.c cVar, boolean z15) {
        mVar.d9(new SetFeatureFlag(cVar, z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: hr1.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.q9(this.f86396a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(hr1.a.class), oVar, bVar);
        zVar.A(mVar.new c(null));
        zVar.v(q0.c(SetFeatureFlag.class), oVar, mVar.new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<hr1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<hr1.d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
