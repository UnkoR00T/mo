package bs1;

import fr.q0;
import fu.r;
import java.util.List;
import k10.c0;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B!\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u000f\u001a\u00020\u000e*\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R,\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00188\u0014X\u0095\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR \u0010&\u001a\b\u0012\u0004\u0012\u00020!0 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R&\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000e0'8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b(\u0010)\u0012\u0004\b,\u0010\u001e\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lbs1/k;", "Ll00/g;", "Lbs1/b;", "Lbs1/a;", "Lbs1/c;", "", "Lyy/a;", "stateMachineFactory", "Lcs1/c;", "searchAddressMapper", "Le14/c;", "findAddressesUseCase", "<init>", "(Lyy/a;Lcs1/c;Le14/c;)V", "Lbs1/c$a;", "n9", "(Lbs1/b;)Lbs1/c$a;", "b", "Lcs1/c;", "c", "Le14/c;", "d", "Lbs1/b;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Lbs1/a$c;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k extends l00.g<State, bs1.a> implements bs1.c, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cs1.c searchAddressMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e14.c findAddressesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<State, bs1.a> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bs1.a.c> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<bs1.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<bs1.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f21307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k f21308b;

        /* JADX INFO: renamed from: bs1.k$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0554a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f21309a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ k f21310b;

            /* JADX INFO: renamed from: bs1.k$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0555a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f21311d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f21312e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f21313f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f21315h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f21316j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f21317k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f21318l;

                public C0555a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f21311d = obj;
                    this.f21312e |= PKIFailureInfo.systemUnavail;
                    return C0554a.this.F(null, this);
                }
            }

            public C0554a(mu.h hVar, k kVar) {
                this.f21309a = hVar;
                this.f21310b = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0555a c0555a;
                if (eVar instanceof C0555a) {
                    c0555a = (C0555a) eVar;
                    int i15 = c0555a.f21312e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0555a.f21312e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0555a = new C0555a(eVar);
                    }
                } else {
                    c0555a = new C0555a(eVar);
                }
                Object obj2 = c0555a.f21311d;
                Object objE = uq.b.e();
                int i16 = c0555a.f21312e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f21309a;
                    bs1.c.Data dataN9 = this.f21310b.n9((State) obj);
                    c0555a.f21313f = vq.j.a(obj);
                    c0555a.f21315h = vq.j.a(c0555a);
                    c0555a.f21316j = vq.j.a(obj);
                    c0555a.f21317k = vq.j.a(hVar);
                    c0555a.f21318l = 0;
                    c0555a.f21312e = 1;
                    if (hVar.F(dataN9, c0555a) == objE) {
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

        public a(mu.g gVar, k kVar) {
            this.f21307a = gVar;
            this.f21308b = kVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super bs1.c.Data> hVar, tq.e eVar) {
            Object objA = this.f21307a.a(new C0554a(hVar, this.f21308b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbs1/a$a;", "<unused var>", "Lbs1/b;", "Loq/i0;", "<anonymous>", "(Lbs1/a$a;Lbs1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<bs1.a.C0552a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21319e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f21319e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bs1.a.c> bVarY1 = k.this.Y1();
                bs1.a.c.C0553a c0553a = bs1.a.c.C0553a.f21282a;
                this.f21319e = 1;
                if (bVarY1.F(c0553a, this) == objE) {
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
        public final Object w(bs1.a.C0552a c0552a, State state, tq.e<? super i0> eVar) {
            return k.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbs1/a$b;", "action", "Lbs1/b;", "state", "Loq/i0;", "<anonymous>", "(Lbs1/a$b;Lbs1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<bs1.a.FindAddresses, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21321e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21322f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bs1.a.FindAddresses findAddresses = (bs1.a.FindAddresses) this.f21322f;
            Object objE = uq.b.e();
            int i15 = this.f21321e;
            if (i15 == 0) {
                u.b(obj);
                e14.c cVar = k.this.findAddressesUseCase;
                e14.c.Params params = new e14.c.Params(findAddresses.getCenter(), findAddresses.getDistance(), findAddresses.getSearchText(), null);
                this.f21322f = vq.j.a(findAddresses);
                this.f21321e = 1;
                obj = cVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            k kVar = k.this;
            if (iVar instanceof dx.i.Right) {
                kVar.d9(new bs1.a.OnListChanged((List) ((dx.i.Right) iVar).b()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(bs1.a.FindAddresses findAddresses, State state, tq.e<? super i0> eVar) {
            c cVar = k.this.new c(eVar);
            cVar.f21322f = findAddresses;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbs1/a$f;", "action", "Lk10/c0;", "Lbs1/b;", "state", "Lk10/l;", "<anonymous>", "(Lbs1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<bs1.a.OnSearchTextChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21324e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21325f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f21326g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(bs1.a.OnSearchTextChanged onSearchTextChanged, State state) {
            return State.b(state, onSearchTextChanged.getText(), null, null, null, 14, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bs1.a.OnSearchTextChanged onSearchTextChanged = (bs1.a.OnSearchTextChanged) this.f21325f;
            c0 c0Var = (c0) this.f21326g;
            uq.b.e();
            if (this.f21324e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            k kVar = k.this;
            double dA = vy.i.a(Double.parseDouble(((State) c0Var.a()).getDistance()));
            kVar.d9(new bs1.a.FindAddresses(onSearchTextChanged.getText(), ((State) c0Var.a()).getCenter(), dA, null));
            return c0Var.b(new er.l() { // from class: bs1.l
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.d.O(onSearchTextChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bs1.a.OnSearchTextChanged onSearchTextChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = k.this.new d(eVar);
            dVar.f21325f = onSearchTextChanged;
            dVar.f21326g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbs1/a$d;", "action", "Lk10/c0;", "Lbs1/b;", "state", "Lk10/l;", "<anonymous>", "(Lbs1/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bs1.a.OnDistanceChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21328e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21329f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f21330g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(bs1.a.OnDistanceChanged onDistanceChanged, State state) {
            return State.b(state, null, null, null, onDistanceChanged.getDistance(), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bs1.a.OnDistanceChanged onDistanceChanged = (bs1.a.OnDistanceChanged) this.f21329f;
            c0 c0Var = (c0) this.f21330g;
            uq.b.e();
            if (this.f21328e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Double dS = r.s(onDistanceChanged.getDistance());
            if (dS != null) {
                double dA = vy.i.a(dS.doubleValue());
                k.this.d9(new bs1.a.FindAddresses(((State) c0Var.a()).getSearchText(), ((State) c0Var.a()).getCenter(), dA, null));
            }
            return c0Var.b(new er.l() { // from class: bs1.m
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.e.O(onDistanceChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bs1.a.OnDistanceChanged onDistanceChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = k.this.new e(eVar);
            eVar2.f21329f = onDistanceChanged;
            eVar2.f21330g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbs1/a$e;", "action", "Lk10/c0;", "Lbs1/b;", "state", "Lk10/l;", "<anonymous>", "(Lbs1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<bs1.a.OnListChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f21332e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f21333f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f21334g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(bs1.a.OnListChanged onListChanged, State state) {
            return State.b(state, null, onListChanged.a(), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final bs1.a.OnListChanged onListChanged = (bs1.a.OnListChanged) this.f21333f;
            c0 c0Var = (c0) this.f21334g;
            uq.b.e();
            if (this.f21332e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: bs1.n
                @Override // er.l
                public final Object b(Object obj2) {
                    return k.f.O(onListChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bs1.a.OnListChanged onListChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f21333f = onListChanged;
            fVar.f21334g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    public k(yy.a aVar, cs1.c cVar, e14.c cVar2) {
        this.searchAddressMapper = cVar;
        this.findAddressesUseCase = cVar2;
        State state = new State("", v.n(), t04.b.f186822a.b(), "70");
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: bs1.g
            @Override // er.l
            public final Object b(Object obj) {
                return k.r9(this.f21297a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), n9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final bs1.c.Data n9(State state) {
        return this.searchAddressMapper.b(new cs1.c.Params(state, new er.l() { // from class: bs1.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.o9(this.f21298a, (String) obj);
            }
        }, b9(bs1.a.C0552a.f21277a), new er.l() { // from class: bs1.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.p9(this.f21299a, (String) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(k kVar, String str) {
        kVar.d9(new bs1.a.OnSearchTextChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(k kVar, String str) {
        kVar.d9(new bs1.a.OnDistanceChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final k kVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: bs1.j
            @Override // er.l
            public final Object b(Object obj) {
                return k.s9(this.f21300a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(k kVar, z zVar) {
        b bVar = kVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bs1.a.C0552a.class), oVar, bVar);
        zVar.x(q0.c(bs1.a.FindAddresses.class), oVar, kVar.new c(null));
        zVar.v(q0.c(bs1.a.OnSearchTextChanged.class), oVar, kVar.new d(null));
        zVar.v(q0.c(bs1.a.OnDistanceChanged.class), oVar, kVar.new e(null));
        zVar.v(q0.c(bs1.a.OnListChanged.class), oVar, new f(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bs1.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, bs1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<bs1.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
