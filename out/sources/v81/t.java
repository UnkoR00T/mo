package v81;

import cl0.BEPassportChildApplicationOfficeDictionary;
import fr.q0;
import java.util.ArrayList;
import java.util.List;
import k10.c0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lv81/t;", "Ll00/g;", "Lv81/f;", "", "Lv81/g;", "Lyy/a;", "stateMachineFactory", "Lw81/b;", "mapper", "Lv81/e;", "setupData", "<init>", "(Lyy/a;Lw81/b;Lv81/e;)V", "state", "Lv81/g$a;", "o9", "(Lv81/f;)Lv81/g$a;", "b", "Lw81/b;", "c", "Lv81/e;", "d", "Lv81/f;", "initialState", "Lxw/b;", "Lv81/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<State, Object> implements g, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w81.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v81.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<g.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<g.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f204459a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f204460b;

        /* JADX INFO: renamed from: v81.t$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5334a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f204461a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f204462b;

            /* JADX INFO: renamed from: v81.t$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5335a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f204463d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f204464e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f204465f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f204467h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f204468j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f204469k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f204470l;

                public C5335a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f204463d = obj;
                    this.f204464e |= PKIFailureInfo.systemUnavail;
                    return C5334a.this.F(null, this);
                }
            }

            public C5334a(mu.h hVar, t tVar) {
                this.f204461a = hVar;
                this.f204462b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5335a c5335a;
                if (eVar instanceof C5335a) {
                    c5335a = (C5335a) eVar;
                    int i15 = c5335a.f204464e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5335a.f204464e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5335a = new C5335a(eVar);
                    }
                } else {
                    c5335a = new C5335a(eVar);
                }
                Object obj2 = c5335a.f204463d;
                Object objE = uq.b.e();
                int i16 = c5335a.f204464e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f204461a;
                    g.Data dataO9 = this.f204462b.o9((State) obj);
                    c5335a.f204465f = vq.j.a(obj);
                    c5335a.f204467h = vq.j.a(c5335a);
                    c5335a.f204468j = vq.j.a(obj);
                    c5335a.f204469k = vq.j.a(hVar);
                    c5335a.f204470l = 0;
                    c5335a.f204464e = 1;
                    if (hVar.F(dataO9, c5335a) == objE) {
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

        public a(mu.g gVar, t tVar) {
            this.f204459a = gVar;
            this.f204460b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super g.Data> hVar, tq.e eVar) {
            Object objA = this.f204459a.a(new C5334a(hVar, this.f204460b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv81/b;", "action", "Lv81/f;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv81/b;Lv81/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<v81.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204472f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v81.b bVar = (v81.b) this.f204472f;
            Object objE = uq.b.e();
            int i15 = this.f204471e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (bVar instanceof v81.b.GoBackWithResult) {
                    t.this.setupData.getContract().d1(new u81.a.ChildPassportApplicationInstitutionData(((v81.b.GoBackWithResult) bVar).getSelectedInstitution()));
                }
                t tVar = t.this;
                this.f204472f = vq.j.a(bVar);
                this.f204471e = 1;
                if (tVar.F(bVar, this) == objE) {
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
        public final Object w(v81.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = t.this.new b(eVar);
            bVar2.f204472f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lv81/c;", "action", "Lk10/c0;", "Lv81/f;", "state", "Lk10/l;", "<anonymous>", "(Lv81/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<QueryChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204475f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204476g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(QueryChanged queryChanged, List list, State state) {
            return State.b(state, null, null, queryChanged.getQuery(), false, list, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final QueryChanged queryChanged = (QueryChanged) this.f204475f;
            c0 c0Var = (c0) this.f204476g;
            uq.b.e();
            if (this.f204474e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            List<BEPassportChildApplicationOfficeDictionary> listC = ((State) c0Var.a()).c();
            final ArrayList arrayList = new ArrayList();
            for (Object obj2 : listC) {
                if (fu.r.b0(((BEPassportChildApplicationOfficeDictionary) obj2).getUnitName(), queryChanged.getQuery(), true)) {
                    arrayList.add(obj2);
                }
            }
            return c0Var.b(new er.l() { // from class: v81.u
                @Override // er.l
                public final Object b(Object obj3) {
                    return t.c.O(queryChanged, arrayList, (State) obj3);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(QueryChanged queryChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = new c(eVar);
            cVar.f204475f = queryChanged;
            cVar.f204476g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lv81/a;", "<unused var>", "Lk10/c0;", "Lv81/f;", "state", "Lk10/l;", "<anonymous>", "(Lv81/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<v81.a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204478f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, State state) {
            return State.b(state, null, null, "", false, ((State) c0Var.a()).c(), 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f204478f;
            uq.b.e();
            if (this.f204477e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v81.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.d.O(c0Var, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v81.a aVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f204478f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lv81/d;", "action", "Lk10/c0;", "Lv81/f;", "state", "Lk10/l;", "<anonymous>", "(Lv81/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<SearchActiveChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f204479e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f204480f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f204481g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(SearchActiveChanged searchActiveChanged, State state) {
            return State.b(state, null, null, null, searchActiveChanged.getIsActive(), null, 23, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final SearchActiveChanged searchActiveChanged = (SearchActiveChanged) this.f204480f;
            c0 c0Var = (c0) this.f204481g;
            uq.b.e();
            if (this.f204479e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v81.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return t.e.O(searchActiveChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(SearchActiveChanged searchActiveChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f204480f = searchActiveChanged;
            eVar2.f204481g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, w81.b bVar, SetupData setupData) {
        this.mapper = bVar;
        this.setupData = setupData;
        u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionDataY3 = setupData.getContract().y3();
        State state = new State(childPassportApplicationInstitutionDataY3 != null ? childPassportApplicationInstitutionDataY3.getInstitution() : null, setupData.b(), "", false, setupData.b());
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: v81.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.t9(this.f204452a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final g.Data o9(State state) {
        return this.mapper.b(new w81.b.Params(state, b9(v81.b.a.f204419a), new er.l() { // from class: v81.o
            @Override // er.l
            public final Object b(Object obj) {
                return t.p9(this.f204448a, (BEPassportChildApplicationOfficeDictionary) obj);
            }
        }, new er.l() { // from class: v81.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.q9(this.f204449a, (String) obj);
            }
        }, b9(v81.a.f204418a), new er.l() { // from class: v81.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.r9(this.f204450a, ((Boolean) obj).booleanValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(t tVar, BEPassportChildApplicationOfficeDictionary bEPassportChildApplicationOfficeDictionary) {
        tVar.d9(new v81.b.GoBackWithResult(bEPassportChildApplicationOfficeDictionary));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(t tVar, String str) {
        tVar.d9(new QueryChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(t tVar, boolean z15) {
        tVar.d9(new SearchActiveChanged(z15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: v81.r
            @Override // er.l
            public final Object b(Object obj) {
                return t.u9(this.f204451a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(t tVar, k10.z zVar) {
        b bVar = tVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(v81.b.class), oVar, bVar);
        zVar.v(q0.c(QueryChanged.class), oVar, new c(null));
        zVar.v(q0.c(v81.a.class), oVar, new d(null));
        zVar.v(q0.c(SearchActiveChanged.class), oVar, new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<v81.b> Y1() {
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
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(v81.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
