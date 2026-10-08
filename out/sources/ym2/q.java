package ym2;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u00020\u0016*\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010!\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R&\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\"8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R \u00103\u001a\b\u0012\u0004\u0012\u00020.0-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lym2/q;", "Ll00/g;", "Lym2/b;", "Lym2/a;", "Lym2/c;", "", "Lyy/a;", "stateMachineFactory", "Lym2/e;", "mapper", "Lhm2/e;", "checkIsAddressesListValidUC", "Lzm2/a;", "contract", "<init>", "(Lyy/a;Lym2/e;Lhm2/e;Lzm2/a;)V", "state", "Lym2/c$a;", "q9", "(Lym2/b;)Lym2/c$a;", "", "", "Lhz/b;", "p9", "(Ljava/util/List;)Lhz/b;", "b", "Lym2/e;", "c", "Lhm2/e;", "d", "Lzm2/a;", "e", "Lym2/b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Lym2/a$b;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<State, ym2.a> implements ym2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ym2.e mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hm2.e checkIsAddressesListValidUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zm2.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, ym2.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<ym2.c.Data> state;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ym2.a.b> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<ym2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f227972a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f227973b;

        /* JADX INFO: renamed from: ym2.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C6123a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f227974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f227975b;

            /* JADX INFO: renamed from: ym2.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6124a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f227976d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f227977e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f227978f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f227980h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f227981j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f227982k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f227983l;

                public C6124a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f227976d = obj;
                    this.f227977e |= PKIFailureInfo.systemUnavail;
                    return C6123a.this.F(null, this);
                }
            }

            public C6123a(mu.h hVar, q qVar) {
                this.f227974a = hVar;
                this.f227975b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6124a c6124a;
                if (eVar instanceof C6124a) {
                    c6124a = (C6124a) eVar;
                    int i15 = c6124a.f227977e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6124a.f227977e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6124a = new C6124a(eVar);
                    }
                } else {
                    c6124a = new C6124a(eVar);
                }
                Object obj2 = c6124a.f227976d;
                Object objE = uq.b.e();
                int i16 = c6124a.f227977e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f227974a;
                    ym2.c.Data dataQ9 = this.f227975b.q9((State) obj);
                    c6124a.f227978f = vq.j.a(obj);
                    c6124a.f227980h = vq.j.a(c6124a);
                    c6124a.f227981j = vq.j.a(obj);
                    c6124a.f227982k = vq.j.a(hVar);
                    c6124a.f227983l = 0;
                    c6124a.f227977e = 1;
                    if (hVar.F(dataQ9, c6124a) == objE) {
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

        public a(mu.g gVar, q qVar) {
            this.f227972a = gVar;
            this.f227973b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super ym2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f227972a.a(new C6123a(hVar, this.f227973b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lym2/a$b;", "action", "Lym2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lym2/a$b;Lym2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<ym2.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227985f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ym2.a.b bVar = (ym2.a.b) this.f227985f;
            Object objE = uq.b.e();
            int i15 = this.f227984e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                this.f227985f = vq.j.a(bVar);
                this.f227984e = 1;
                if (qVar.F(bVar, this) == objE) {
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
        public final Object w(ym2.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = q.this.new b(eVar);
            bVar2.f227985f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lym2/a$a;", "<unused var>", "Lym2/b;", "Loq/i0;", "<anonymous>", "(Lym2/a$a;Lym2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ym2.a.C6120a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227987e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f227987e;
            if (i15 == 0) {
                oq.u.b(obj);
                q qVar = q.this;
                ym2.a.b.c cVar = ym2.a.b.c.f227925a;
                this.f227987e = 1;
                if (qVar.F(cVar, this) == objE) {
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
        public final Object w(ym2.a.C6120a c6120a, State state, tq.e<? super i0> eVar) {
            return q.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lym2/a$c;", "<unused var>", "Lk10/c0;", "Lym2/b;", "state", "Lk10/l;", "<anonymous>", "(Lym2/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ym2.a.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227989e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227990f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, hz.g gVar, State state) {
            return state.a(((State) c0Var.a()).b(), new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final c0 c0Var = (c0) this.f227990f;
            Object objE = uq.b.e();
            int i15 = this.f227989e;
            if (i15 == 0) {
                oq.u.b(obj);
                hm2.e eVar = q.this.checkIsAddressesListValidUC;
                hm2.e.Params params = new hm2.e.Params(((State) c0Var.a()).b());
                this.f227990f = c0Var;
                this.f227989e = 1;
                obj = eVar.d(params, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            q qVar = q.this;
            final hz.g gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                return c0Var.b(new er.l() { // from class: ym2.r
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return q.d.O(c0Var, gVar, (State) obj2);
                    }
                });
            }
            if (!fr.t.c(gVar, hz.g.b.f86853b)) {
                throw new oq.p();
            }
            qVar.d9(ym2.a.b.d.f227926a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ym2.a.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f227990f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lym2/a$d;", "action", "Lk10/c0;", "Lym2/b;", "state", "Lk10/l;", "<anonymous>", "(Lym2/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ym2.a.RemoveWebsiteAddress, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f227992e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f227993f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f227994g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, q qVar, ym2.a.RemoveWebsiteAddress removeWebsiteAddress, State state) {
            List<String> listI1 = pq.v.i1(((State) c0Var.a()).b());
            listI1.remove(removeWebsiteAddress.getWebsiteIndex());
            return state.a(listI1, qVar.p9(((State) c0Var.a()).b()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ym2.a.RemoveWebsiteAddress removeWebsiteAddress = (ym2.a.RemoveWebsiteAddress) this.f227993f;
            final c0 c0Var = (c0) this.f227994g;
            uq.b.e();
            if (this.f227992e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            q.this.contract.j1(removeWebsiteAddress.getWebsiteIndex());
            final q qVar = q.this;
            return c0Var.b(new er.l() { // from class: ym2.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.e.O(c0Var, qVar, removeWebsiteAddress, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ym2.a.RemoveWebsiteAddress removeWebsiteAddress, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = q.this.new e(eVar);
            eVar2.f227993f = removeWebsiteAddress;
            eVar2.f227994g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public q(yy.a aVar, ym2.e eVar, hm2.e eVar2, zm2.a aVar2) {
        this.mapper = eVar;
        this.checkIsAddressesListValidUC = eVar2;
        this.contract = aVar2;
        State state = new State(aVar2.b1(), hz.b.C2039b.f86846c);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: ym2.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f227964a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), q9(state));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hz.b p9(List<String> list) {
        return !list.isEmpty() ? hz.b.d.f86848c : new hz.b.Invalid(null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ym2.c.Data q9(State state) {
        return this.mapper.b(new ym2.e.Params(state, b9(ym2.a.C6120a.f227922a), b9(ym2.a.c.f227927a), b9(ym2.a.b.C6121a.f227923a), b9(ym2.a.b.C6122b.f227924a), new er.l() { // from class: ym2.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f227962a, ((Integer) obj).intValue());
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(q qVar, int i15) {
        qVar.d9(new ym2.a.RemoveWebsiteAddress(i15));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ym2.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.u9(this.f227963a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ym2.a.b.class), oVar, bVar);
        zVar.x(q0.c(ym2.a.C6120a.class), oVar, qVar.new c(null));
        zVar.v(q0.c(ym2.a.c.class), oVar, qVar.new d(null));
        zVar.v(q0.c(ym2.a.RemoveWebsiteAddress.class), oVar, qVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ym2.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, ym2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<ym2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ym2.a.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(zm2.a aVar) {
        super.P5(aVar);
    }
}
