package u71;

import cl0.BEPassportChildApplicationCountryDictionary;
import fr.q0;
import java.util.ArrayList;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import x71.ChildPassportApplicationCorrespondenceCountryData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lu71/v;", "Ll00/g;", "Lu71/h;", "", "Lu71/i;", "Lyy/a;", "stateMachineFactory", "Lv71/b;", "mapper", "Lu71/g;", "setupData", "<init>", "(Lyy/a;Lv71/b;Lu71/g;)V", "state", "Lu71/i$a;", "n9", "(Lu71/h;)Lu71/i$a;", "b", "Lv71/b;", "c", "Lu71/g;", "d", "Lu71/h;", "initialState", "Lxw/b;", "Lu71/d;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<State, Object> implements i, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v71.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<u71.d> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<i.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f196135a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f196136b;

        /* JADX INFO: renamed from: u71.v$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5103a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f196137a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f196138b;

            /* JADX INFO: renamed from: u71.v$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5104a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f196139d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f196140e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f196141f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f196143h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f196144j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f196145k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f196146l;

                public C5104a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f196139d = obj;
                    this.f196140e |= PKIFailureInfo.systemUnavail;
                    return C5103a.this.F(null, this);
                }
            }

            public C5103a(mu.h hVar, v vVar) {
                this.f196137a = hVar;
                this.f196138b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5104a c5104a;
                if (eVar instanceof C5104a) {
                    c5104a = (C5104a) eVar;
                    int i15 = c5104a.f196140e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5104a.f196140e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5104a = new C5104a(eVar);
                    }
                } else {
                    c5104a = new C5104a(eVar);
                }
                Object obj2 = c5104a.f196139d;
                Object objE = uq.b.e();
                int i16 = c5104a.f196140e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f196137a;
                    i.Data dataN9 = this.f196138b.n9((State) obj);
                    c5104a.f196141f = vq.j.a(obj);
                    c5104a.f196143h = vq.j.a(c5104a);
                    c5104a.f196144j = vq.j.a(obj);
                    c5104a.f196145k = vq.j.a(hVar);
                    c5104a.f196146l = 0;
                    c5104a.f196140e = 1;
                    if (hVar.F(dataN9, c5104a) == objE) {
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

        public a(mu.g gVar, v vVar) {
            this.f196135a = gVar;
            this.f196136b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.Data> hVar, tq.e eVar) {
            Object objA = this.f196135a.a(new C5103a(hVar, this.f196136b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lu71/a;", "<unused var>", "Lu71/h;", "Loq/i0;", "<anonymous>", "(Lu71/a;Lu71/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<u71.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196147e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f196147e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<u71.d> bVarY1 = v.this.Y1();
                u71.d.a aVar = u71.d.a.f196096a;
                this.f196147e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(u71.a aVar, State state, tq.e<? super i0> eVar) {
            return v.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lu71/c;", "action", "Lu71/h;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lu71/c;Lu71/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<GoBackWithResult, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196149e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196150f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoBackWithResult goBackWithResult = (GoBackWithResult) this.f196150f;
            Object objE = uq.b.e();
            int i15 = this.f196149e;
            if (i15 == 0) {
                oq.u.b(obj);
                v.this.setupData.getContract().U7(new ChildPassportApplicationCorrespondenceCountryData(goBackWithResult.getSelectedCorrespondence()));
                xw.b<u71.d> bVarY1 = v.this.Y1();
                u71.d.a aVar = u71.d.a.f196096a;
                this.f196150f = vq.j.a(goBackWithResult);
                this.f196149e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(GoBackWithResult goBackWithResult, State state, tq.e<? super i0> eVar) {
            c cVar = v.this.new c(eVar);
            cVar.f196150f = goBackWithResult;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu71/e;", "action", "Lk10/c0;", "Lu71/h;", "state", "Lk10/l;", "<anonymous>", "(Lu71/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<QueryChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196152e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196153f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f196154g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(QueryChanged queryChanged, List list, State state) {
            return State.b(state, null, null, queryChanged.getQuery(), false, list, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final QueryChanged queryChanged = (QueryChanged) this.f196153f;
            c0 c0Var = (c0) this.f196154g;
            uq.b.e();
            if (this.f196152e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            List<BEPassportChildApplicationCountryDictionary> listC = ((State) c0Var.a()).c();
            final ArrayList arrayList = new ArrayList();
            for (Object obj2 : listC) {
                if (fu.r.b0(((BEPassportChildApplicationCountryDictionary) obj2).getName(), queryChanged.getQuery(), true)) {
                    arrayList.add(obj2);
                }
            }
            return c0Var.b(new er.l() { // from class: u71.w
                @Override // er.l
                public final Object b(Object obj3) {
                    return v.d.O(queryChanged, arrayList, (State) obj3);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(QueryChanged queryChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f196153f = queryChanged;
            dVar.f196154g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu71/b;", "<unused var>", "Lk10/c0;", "Lu71/h;", "state", "Lk10/l;", "<anonymous>", "(Lu71/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<u71.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196155e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196156f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, State state) {
            return State.b(state, null, null, "", false, ((State) c0Var.a()).c(), 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f196156f;
            uq.b.e();
            if (this.f196155e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u71.x
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.e.O(c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(u71.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f196156f = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lu71/f;", "action", "Lk10/c0;", "Lu71/h;", "state", "Lk10/l;", "<anonymous>", "(Lu71/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<SearchActiveChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f196157e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f196158f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f196159g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SearchActiveChanged searchActiveChanged, State state) {
            return State.b(state, null, null, null, searchActiveChanged.getIsActive(), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SearchActiveChanged searchActiveChanged = (SearchActiveChanged) this.f196158f;
            c0 c0Var = (c0) this.f196159g;
            uq.b.e();
            if (this.f196157e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: u71.y
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.f.O(searchActiveChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SearchActiveChanged searchActiveChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f196158f = searchActiveChanged;
            fVar.f196159g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public v(yy.a aVar, v71.b bVar, SetupData setupData) {
        this.mapper = bVar;
        this.setupData = setupData;
        ChildPassportApplicationCorrespondenceCountryData childPassportApplicationCorrespondenceCountryDataN8 = setupData.getContract().N8();
        State state = new State(childPassportApplicationCorrespondenceCountryDataN8 != null ? childPassportApplicationCorrespondenceCountryDataN8.getCountry() : null, setupData.b(), "", false, setupData.b());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: u71.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.s9(this.f196128a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final i.Data n9(State state) {
        return this.mapper.b(new v71.b.Params(state, b9(u71.a.f196091a), new er.l() { // from class: u71.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.o9(this.f196124a, (BEPassportChildApplicationCountryDictionary) obj);
            }
        }, new er.l() { // from class: u71.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.p9(this.f196125a, (String) obj);
            }
        }, b9(u71.b.f196093a), new er.l() { // from class: u71.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.q9(this.f196126a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(v vVar, BEPassportChildApplicationCountryDictionary bEPassportChildApplicationCountryDictionary) {
        vVar.d9(new GoBackWithResult(bEPassportChildApplicationCountryDictionary));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(v vVar, String str) {
        vVar.d9(new QueryChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(v vVar, boolean z15) {
        vVar.d9(new SearchActiveChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(State.class), new er.l() { // from class: u71.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.t9(this.f196127a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(v vVar, k10.z zVar) {
        b bVar = vVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(u71.a.class), oVar, bVar);
        zVar.x(q0.c(GoBackWithResult.class), oVar, vVar.new c(null));
        zVar.v(q0.c(QueryChanged.class), oVar, new d(null));
        zVar.v(q0.c(u71.b.class), oVar, new e(null));
        zVar.v(q0.c(SearchActiveChanged.class), oVar, new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<u71.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: r9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
