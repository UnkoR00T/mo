package wm2;

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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B+\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001d8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lwm2/n;", "Ll00/g;", "Lwm2/b;", "Lwm2/a;", "Lwm2/c;", "", "Lyy/a;", "stateMachineFactory", "Lwm2/d;", "mapper", "Lhm2/b;", "checkIsAddedWebsiteAddressValidInDyzurnetUC", "Lxm2/a;", "contract", "<init>", "(Lyy/a;Lwm2/d;Lhm2/b;Lxm2/a;)V", "state", "Lwm2/c$a;", "o9", "(Lwm2/b;)Lwm2/c$a;", "b", "Lwm2/d;", "c", "Lhm2/b;", "d", "Lxm2/a;", "e", "Lwm2/b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lwm2/a$c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, wm2.a> implements wm2.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wm2.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hm2.b checkIsAddedWebsiteAddressValidInDyzurnetUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final xm2.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, wm2.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<wm2.a.c> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<wm2.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<wm2.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f214127a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f214128b;

        /* JADX INFO: renamed from: wm2.n$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5667a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f214129a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f214130b;

            /* JADX INFO: renamed from: wm2.n$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5668a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f214131d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f214132e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f214133f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f214135h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f214136j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f214137k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f214138l;

                public C5668a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f214131d = obj;
                    this.f214132e |= PKIFailureInfo.systemUnavail;
                    return C5667a.this.F(null, this);
                }
            }

            public C5667a(mu.h hVar, n nVar) {
                this.f214129a = hVar;
                this.f214130b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5668a c5668a;
                if (eVar instanceof C5668a) {
                    c5668a = (C5668a) eVar;
                    int i15 = c5668a.f214132e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5668a.f214132e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5668a = new C5668a(eVar);
                    }
                } else {
                    c5668a = new C5668a(eVar);
                }
                Object obj2 = c5668a.f214131d;
                Object objE = uq.b.e();
                int i16 = c5668a.f214132e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f214129a;
                    wm2.c.Data dataO9 = this.f214130b.o9((State) obj);
                    c5668a.f214133f = vq.j.a(obj);
                    c5668a.f214135h = vq.j.a(c5668a);
                    c5668a.f214136j = vq.j.a(obj);
                    c5668a.f214137k = vq.j.a(hVar);
                    c5668a.f214138l = 0;
                    c5668a.f214132e = 1;
                    if (hVar.F(dataO9, c5668a) == objE) {
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
            this.f214127a = gVar;
            this.f214128b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super wm2.c.Data> hVar, tq.e eVar) {
            Object objA = this.f214127a.a(new C5667a(hVar, this.f214128b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lwm2/a$c;", "action", "Lwm2/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lwm2/a$c;Lwm2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<wm2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214140f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            wm2.a.c cVar = (wm2.a.c) this.f214140f;
            Object objE = uq.b.e();
            int i15 = this.f214139e;
            if (i15 == 0) {
                u.b(obj);
                n nVar = n.this;
                this.f214140f = vq.j.a(cVar);
                this.f214139e = 1;
                if (nVar.F(cVar, this) == objE) {
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
        public final Object w(wm2.a.c cVar, State state, tq.e<? super i0> eVar) {
            b bVar = n.this.new b(eVar);
            bVar.f214140f = cVar;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwm2/a$a;", "<unused var>", "Lk10/c0;", "Lwm2/b;", "state", "Lk10/l;", "<anonymous>", "(Lwm2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<wm2.a.C5665a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f214142e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f214143f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f214144g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(hz.g gVar, State state) {
            return State.b(state, null, new hz.b.Invalid(((hz.g.Invalid) gVar).b().getErrorMessage()), 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            String str;
            c0 c0Var = (c0) this.f214144g;
            Object objE = uq.b.e();
            int i15 = this.f214143f;
            if (i15 == 0) {
                u.b(obj);
                String string = fu.r.u1(((State) c0Var.a()).getIllegalContentAddress()).toString();
                hm2.b bVar = n.this.checkIsAddedWebsiteAddressValidInDyzurnetUC;
                hm2.b.Params params = new hm2.b.Params(string);
                this.f214144g = c0Var;
                this.f214142e = string;
                this.f214143f = 1;
                Object objD = bVar.d(params, this);
                if (objD == objE) {
                    return objE;
                }
                str = string;
                obj = objD;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str = (String) this.f214142e;
                u.b(obj);
            }
            n nVar = n.this;
            final hz.g gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                return c0Var.b(new er.l() { // from class: wm2.o
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return n.c.O(gVar, (State) obj2);
                    }
                });
            }
            if (!fr.t.c(gVar, hz.g.b.f86853b)) {
                throw new oq.p();
            }
            nVar.contract.C3(str);
            nVar.d9(wm2.a.c.b.f214093a);
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wm2.a.C5665a c5665a, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = n.this.new c(eVar);
            cVar.f214144g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lwm2/a$b;", "action", "Lk10/c0;", "Lwm2/b;", "state", "Lk10/l;", "<anonymous>", "(Lwm2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<wm2.a.ChangeWebsiteAddress, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f214146e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f214147f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f214148g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(wm2.a.ChangeWebsiteAddress changeWebsiteAddress, State state) {
            return state.a(changeWebsiteAddress.getIllegalContentAddress(), hz.b.d.f86848c);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final wm2.a.ChangeWebsiteAddress changeWebsiteAddress = (wm2.a.ChangeWebsiteAddress) this.f214147f;
            c0 c0Var = (c0) this.f214148g;
            uq.b.e();
            if (this.f214146e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: wm2.p
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.O(changeWebsiteAddress, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(wm2.a.ChangeWebsiteAddress changeWebsiteAddress, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f214147f = changeWebsiteAddress;
            dVar.f214148g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, wm2.d dVar, hm2.b bVar, xm2.a aVar2) {
        this.mapper = dVar;
        this.checkIsAddedWebsiteAddressValidInDyzurnetUC = bVar;
        this.contract = aVar2;
        State state = new State("", hz.b.C2039b.f86846c);
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: wm2.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.r9(this.f214119a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wm2.c.Data o9(State state) {
        return this.mapper.b(new wm2.d.Params(state, new er.l() { // from class: wm2.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f214118a, (String) obj);
            }
        }, b9(wm2.a.c.C5666a.f214092a), b9(wm2.a.C5665a.f214090a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(n nVar, String str) {
        nVar.d9(new wm2.a.ChangeWebsiteAddress(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: wm2.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.s9(this.f214117a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(n nVar, z zVar) {
        b bVar = nVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(wm2.a.c.class), oVar, bVar);
        zVar.v(q0.c(wm2.a.C5665a.class), oVar, nVar.new c(null));
        zVar.v(q0.c(wm2.a.ChangeWebsiteAddress.class), oVar, new d(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<wm2.a.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, wm2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<wm2.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(wm2.a.c cVar, tq.e<? super i0> eVar) {
        return super.F(cVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(xm2.a aVar) {
        super.P5(aVar);
    }
}
