package b81;

import er.q;
import fr.q0;
import i61.DataSplitData;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lb81/m;", "Ll00/g;", "Lb81/c;", "", "Lb81/d;", "Lyy/a;", "stateMachineFactory", "Lc81/b;", "mapper", "Ld81/a;", "contract", "<init>", "(Lyy/a;Lc81/b;Ld81/a;)V", "state", "Lb81/d$a;", "l9", "(Lb81/c;)Lb81/d$a;", "b", "Lc81/b;", "c", "Ld81/a;", "d", "Lb81/c;", "initialState", "Lxw/b;", "Lb81/a;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<State, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c81.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final d81.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<b81.a> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f17559a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f17560b;

        /* JADX INFO: renamed from: b81.m$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0425a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f17561a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f17562b;

            /* JADX INFO: renamed from: b81.m$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0426a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f17563d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f17564e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f17565f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f17567h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f17568j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f17569k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f17570l;

                public C0426a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f17563d = obj;
                    this.f17564e |= PKIFailureInfo.systemUnavail;
                    return C0425a.this.F(null, this);
                }
            }

            public C0425a(mu.h hVar, m mVar) {
                this.f17561a = hVar;
                this.f17562b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0426a c0426a;
                if (eVar instanceof C0426a) {
                    c0426a = (C0426a) eVar;
                    int i15 = c0426a.f17564e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0426a.f17564e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0426a = new C0426a(eVar);
                    }
                } else {
                    c0426a = new C0426a(eVar);
                }
                Object obj2 = c0426a.f17563d;
                Object objE = uq.b.e();
                int i16 = c0426a.f17564e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f17561a;
                    d.Data dataL9 = this.f17562b.l9((State) obj);
                    c0426a.f17565f = vq.j.a(obj);
                    c0426a.f17567h = vq.j.a(c0426a);
                    c0426a.f17568j = vq.j.a(obj);
                    c0426a.f17569k = vq.j.a(hVar);
                    c0426a.f17570l = 0;
                    c0426a.f17564e = 1;
                    if (hVar.F(dataL9, c0426a) == objE) {
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
            this.f17559a = gVar;
            this.f17560b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f17559a.a(new C0425a(hVar, this.f17560b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb81/a;", "action", "Lb81/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lb81/a;Lb81/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<b81.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17571e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17572f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            b81.a aVar = (b81.a) this.f17572f;
            Object objE = uq.b.e();
            int i15 = this.f17571e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f17572f = vq.j.a(aVar);
                this.f17571e = 1;
                if (mVar.F(aVar, this) == objE) {
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
        public final Object w(b81.a aVar, State state, tq.e<? super i0> eVar) {
            b bVar = m.this.new b(eVar);
            bVar.f17572f = aVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lb81/b;", "action", "Lb81/c;", "state", "Loq/i0;", "<anonymous>", "(Lb81/b;Lb81/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<ToEditDataSplit, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f17574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f17575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f17576g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f17578a;

            static {
                int[] iArr = new int[d81.b.values().length];
                try {
                    iArr[d81.b.NAMES.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[d81.b.SURNAME.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[d81.b.BIRTH_PLACE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f17578a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object toEditNamesSplit;
            ToEditDataSplit toEditDataSplit = (ToEditDataSplit) this.f17575f;
            State state = (State) this.f17576g;
            Object objE = uq.b.e();
            int i15 = this.f17574e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                int i16 = a.f17578a[toEditDataSplit.getDataSplitType().ordinal()];
                if (i16 == 1) {
                    DataSplitData dataSplitData = state.getDataSplitData();
                    toEditNamesSplit = new b81.a.ToEditNamesSplit(dataSplitData != null ? dataSplitData.getNames() : null);
                } else if (i16 == 2) {
                    DataSplitData dataSplitData2 = state.getDataSplitData();
                    toEditNamesSplit = new b81.a.ToEditSurnameSplit(dataSplitData2 != null ? dataSplitData2.getSurname() : null);
                } else {
                    if (i16 != 3) {
                        throw new oq.p();
                    }
                    DataSplitData dataSplitData3 = state.getDataSplitData();
                    toEditNamesSplit = new b81.a.ToEditBirthPlaceSplit(dataSplitData3 != null ? dataSplitData3.getBirthPlace() : null);
                }
                this.f17575f = vq.j.a(toEditDataSplit);
                this.f17576g = vq.j.a(state);
                this.f17574e = 1;
                if (mVar.F(toEditNamesSplit, this) == objE) {
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
        public final Object w(ToEditDataSplit toEditDataSplit, State state, tq.e<? super i0> eVar) {
            c cVar = m.this.new c(eVar);
            cVar.f17575f = toEditDataSplit;
            cVar.f17576g = state;
            return cVar.J(i0.f148189a);
        }
    }

    public m(yy.a aVar, c81.b bVar, d81.a aVar2) {
        this.mapper = bVar;
        this.contract = aVar2;
        State state = new State(aVar2.v8());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: b81.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.o9(this.f17552a, (v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), l9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data l9(State state) {
        return this.mapper.b(new c81.b.Params(state, b9(b81.a.b.f17525a), b9(b81.a.C0424a.f17524a), new er.l() { // from class: b81.k
            @Override // er.l
            public final Object b(Object obj) {
                return m.m9(this.f17551a, (d81.b) obj);
            }
        }, b9(b81.a.f.f17532a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(m mVar, d81.b bVar) {
        mVar.d9(new ToEditDataSplit(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final m mVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: b81.j
            @Override // er.l
            public final Object b(Object obj) {
                return m.p9(this.f17550a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(m mVar, z zVar) {
        b bVar = mVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(b81.a.class), oVar, bVar);
        zVar.x(q0.c(ToEditDataSplit.class), oVar, mVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<b81.a> Y1() {
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
    public /* bridge */ Object F(b81.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(d81.a aVar) {
        super.P5(aVar);
    }
}
