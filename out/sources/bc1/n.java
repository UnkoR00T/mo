package bc1;

import cc1.BusinessAddressAvailabilityContractData;
import f00.j0;
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
import zb1.BusinessAddressSelectionContractData;
import zd1.HomeAddressContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001*B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR&\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006+"}, d2 = {"Lbc1/n;", "Ll00/g;", "Lbc1/e;", "", "Lbc1/f;", "Lyy/a;", "stateMachineFactory", "Ldc1/c;", "mapper", "Lcc1/a;", "contract", "<init>", "(Lyy/a;Ldc1/c;Lcc1/a;)V", "state", "Lbc1/f$a;", "m9", "(Lbc1/e;)Lbc1/f$a;", "b", "Ldc1/c;", "c", "Lcc1/a;", "d", "Lbc1/e;", "initialState", "Lxw/b;", "Lbc1/b;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class n extends l00.g<State, Object> implements f, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dc1.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cc1.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bc1.b> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<f.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lbc1/n$a;", "Lf00/j0;", "Lcc1/a;", "Lbc1/n;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<cc1.a, n> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<f.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f18122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f18123b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f18124a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ n f18125b;

            /* JADX INFO: renamed from: bc1.n$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0452a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f18126d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f18127e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f18128f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f18130h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f18131j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f18132k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f18133l;

                public C0452a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f18126d = obj;
                    this.f18127e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, n nVar) {
                this.f18124a = hVar;
                this.f18125b = nVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0452a c0452a;
                if (eVar instanceof C0452a) {
                    c0452a = (C0452a) eVar;
                    int i15 = c0452a.f18127e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0452a.f18127e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0452a = new C0452a(eVar);
                    }
                } else {
                    c0452a = new C0452a(eVar);
                }
                Object obj2 = c0452a.f18126d;
                Object objE = uq.b.e();
                int i16 = c0452a.f18127e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f18124a;
                    f.Data dataM9 = this.f18125b.m9((State) obj);
                    c0452a.f18128f = vq.j.a(obj);
                    c0452a.f18130h = vq.j.a(c0452a);
                    c0452a.f18131j = vq.j.a(obj);
                    c0452a.f18132k = vq.j.a(hVar);
                    c0452a.f18133l = 0;
                    c0452a.f18127e = 1;
                    if (hVar.F(dataM9, c0452a) == objE) {
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

        public b(mu.g gVar, n nVar) {
            this.f18122a = gVar;
            this.f18123b = nVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.Data> hVar, tq.e eVar) {
            Object objA = this.f18122a.a(new a(hVar, this.f18123b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lbc1/a;", "<unused var>", "Lbc1/e;", "Loq/i0;", "<anonymous>", "(Lbc1/a;Lbc1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<bc1.a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18134e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f18134e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<bc1.b> bVarY1 = n.this.Y1();
                bc1.b.a aVar = bc1.b.a.f18096a;
                this.f18134e = 1;
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
        public final Object w(bc1.a aVar, State state, tq.e<? super i0> eVar) {
            return n.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbc1/d;", "action", "Lk10/c0;", "Lbc1/e;", "state", "Lk10/l;", "<anonymous>", "(Lbc1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<Select, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f18136e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f18137f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f18138g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(Select select, State state) {
            return State.b(state, select.getAnswer(), null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final Select select = (Select) this.f18137f;
            c0 c0Var = (c0) this.f18138g;
            uq.b.e();
            if (this.f18136e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: bc1.o
                @Override // er.l
                public final Object b(Object obj2) {
                    return n.d.O(select, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(Select select, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f18137f = select;
            dVar.f18138g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lbc1/c;", "<unused var>", "Lk10/c0;", "Lbc1/e;", "state", "Lk10/l;", "<anonymous>", "(Lbc1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<bc1.c, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f18139e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f18140f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f18141g;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f18143a;

            static {
                int[] iArr = new int[kb1.a.values().length];
                try {
                    iArr[kb1.a.BUSINESS_ADDRESS_AVAILABLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[kb1.a.BUSINESS_ADDRESS_NOT_AVAILABLE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f18143a = iArr;
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, kb1.a.NONE, null, 2, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            kb1.a aVar;
            kb1.a aVar2;
            c0 c0Var = (c0) this.f18141g;
            Object objE = uq.b.e();
            int i15 = this.f18140f;
            if (i15 != 0) {
                if (i15 == 1) {
                    aVar = (kb1.a) this.f18139e;
                    u.b(obj);
                    n.this.contract.i4(new BusinessAddressAvailabilityContractData(aVar));
                    return c0Var.c();
                }
                if (i15 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar2 = (kb1.a) this.f18139e;
                u.b(obj);
                n.this.contract.i4(new BusinessAddressAvailabilityContractData(aVar2));
                n.this.contract.u0(new BusinessAddressSelectionContractData(((State) c0Var.a()).getHomeAddress()));
                return c0Var.c();
            }
            u.b(obj);
            kb1.a companyPlaceAnswer = ((State) c0Var.a()).getCompanyPlaceAnswer();
            int i16 = companyPlaceAnswer == null ? -1 : a.f18143a[companyPlaceAnswer.ordinal()];
            if (i16 == 1) {
                n nVar = n.this;
                bc1.b.c cVar = bc1.b.c.f18098a;
                this.f18141g = c0Var;
                this.f18139e = companyPlaceAnswer;
                this.f18140f = 1;
                if (nVar.F(cVar, this) != objE) {
                    aVar = companyPlaceAnswer;
                    n.this.contract.i4(new BusinessAddressAvailabilityContractData(aVar));
                    return c0Var.c();
                }
            } else {
                if (i16 != 2) {
                    return c0Var.b(new er.l() { // from class: bc1.p
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return n.e.O((State) obj2);
                        }
                    });
                }
                n nVar2 = n.this;
                bc1.b.C0451b c0451b = bc1.b.C0451b.f18097a;
                this.f18141g = c0Var;
                this.f18139e = companyPlaceAnswer;
                this.f18140f = 2;
                if (nVar2.F(c0451b, this) != objE) {
                    aVar2 = companyPlaceAnswer;
                    n.this.contract.i4(new BusinessAddressAvailabilityContractData(aVar2));
                    n.this.contract.u0(new BusinessAddressSelectionContractData(((State) c0Var.a()).getHomeAddress()));
                    return c0Var.c();
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(bc1.c cVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = n.this.new e(eVar);
            eVar2.f18141g = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public n(yy.a aVar, dc1.c cVar, cc1.a aVar2) {
        this.mapper = cVar;
        this.contract = aVar2;
        BusinessAddressAvailabilityContractData businessAddressAvailabilityContractDataA4 = aVar2.A4();
        kb1.a businessAddressAvailabilityAnswer = businessAddressAvailabilityContractDataA4 != null ? businessAddressAvailabilityContractDataA4.getBusinessAddressAvailabilityAnswer() : null;
        HomeAddressContractData homeAddressContractDataR = aVar2.r();
        State state = new State(businessAddressAvailabilityAnswer, homeAddressContractDataR != null ? homeAddressContractDataR.getHomeAddress() : null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: bc1.m
            @Override // er.l
            public final Object b(Object obj) {
                return n.p9(this.f18115a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), m9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.Data m9(State state) {
        return this.mapper.b(new dc1.c.Params(state, new er.l() { // from class: bc1.k
            @Override // er.l
            public final Object b(Object obj) {
                return n.n9(this.f18113a, (kb1.a) obj);
            }
        }, b9(bc1.c.f18099a), b9(bc1.a.f18095a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(n nVar, kb1.a aVar) {
        nVar.d9(new Select(aVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final n nVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: bc1.l
            @Override // er.l
            public final Object b(Object obj) {
                return n.q9(this.f18114a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(n nVar, z zVar) {
        c cVar = nVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(bc1.a.class), oVar, cVar);
        zVar.v(q0.c(Select.class), oVar, new d(null));
        zVar.v(q0.c(bc1.c.class), oVar, nVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bc1.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(bc1.b bVar, tq.e<? super i0> eVar) {
        return super.F(bVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
