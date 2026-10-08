package e41;

import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressFormVMSSetupData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00120+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Le41/o;", "Ll00/g;", "Le41/b;", "Le41/a;", "Le41/c;", "", "Lyy/a;", "stateMachineFactory", "Lg41/a;", "mapper", "Lq31/c;", "exitDialogMapper", "Lst3/h;", "addressFormVMSFactory", "Lf41/a;", "contract", "<init>", "(Lyy/a;Lg41/a;Lq31/c;Lst3/h;Lf41/a;)V", "Le41/c$a;", "o9", "(Le41/b;)Le41/c$a;", "b", "Lg41/a;", "c", "Lq31/c;", "d", "Lf41/a;", "e", "Le41/b;", "initialState", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Le41/a$b;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<State, e41.a> implements e41.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g41.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q31.c exitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f41.a contract;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t<State, e41.a> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<e41.a.b> navAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<e41.c.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e41.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f47545a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f47546b;

        /* JADX INFO: renamed from: e41.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1092a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f47547a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f47548b;

            /* JADX INFO: renamed from: e41.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1093a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f47549d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f47550e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f47551f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f47553h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f47554j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f47555k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f47556l;

                public C1093a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f47549d = obj;
                    this.f47550e |= PKIFailureInfo.systemUnavail;
                    return C1092a.this.F(null, this);
                }
            }

            public C1092a(mu.h hVar, o oVar) {
                this.f47547a = hVar;
                this.f47548b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1093a c1093a;
                if (eVar instanceof C1093a) {
                    c1093a = (C1093a) eVar;
                    int i15 = c1093a.f47550e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1093a.f47550e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1093a = new C1093a(eVar);
                    }
                } else {
                    c1093a = new C1093a(eVar);
                }
                Object obj2 = c1093a.f47549d;
                Object objE = uq.b.e();
                int i16 = c1093a.f47550e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f47547a;
                    e41.c.Data dataO9 = this.f47548b.o9((State) obj);
                    c1093a.f47551f = vq.j.a(obj);
                    c1093a.f47553h = vq.j.a(c1093a);
                    c1093a.f47554j = vq.j.a(obj);
                    c1093a.f47555k = vq.j.a(hVar);
                    c1093a.f47556l = 0;
                    c1093a.f47550e = 1;
                    if (hVar.F(dataO9, c1093a) == objE) {
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

        public a(mu.g gVar, o oVar) {
            this.f47545a = gVar;
            this.f47546b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e41.c.Data> hVar, tq.e eVar) {
            Object objA = this.f47545a.a(new C1092a(hVar, this.f47546b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le41/a$b;", "action", "Le41/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Le41/a$b;Le41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<e41.a.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47557e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47558f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e41.a.b bVar = (e41.a.b) this.f47558f;
            Object objE = uq.b.e();
            int i15 = this.f47557e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<e41.a.b> bVarY1 = o.this.Y1();
                this.f47558f = vq.j.a(bVar);
                this.f47557e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(e41.a.b bVar, State state, tq.e<? super i0> eVar) {
            b bVar2 = o.this.new b(eVar);
            bVar2.f47558f = bVar;
            return bVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Le41/a$d;", "<unused var>", "Le41/b;", "Loq/i0;", "<anonymous>", "(Le41/a$d;Le41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<e41.a.d, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47560e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f47560e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            o.this.d9(new e41.a.b.ShowDialog(o.this.exitDialogMapper.b(new q31.c.Params(o.this.b9(e41.a.b.C1091b.f47514a)))));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(e41.a.d dVar, State state, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lst3/g$b;", "event", "Le41/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lst3/g$b;Le41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<st3.g.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47562e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47563f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            st3.g.b bVar = (st3.g.b) this.f47563f;
            uq.b.e();
            if (this.f47562e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            if (fr.t.c(bVar, st3.g.b.a.f184307a)) {
                o.this.d9(e41.a.b.C1090a.f47513a);
            } else if (bVar instanceof st3.g.b.GoToError) {
                o.this.d9(new e41.a.b.GoToError(((st3.g.b.GoToError) bVar).getErrorData()));
            } else if (bVar instanceof st3.g.b.GoToSearch) {
                o.this.d9(new e41.a.b.GoToSearch(((st3.g.b.GoToSearch) bVar).getModel()));
            } else {
                if (!(bVar instanceof st3.g.b.Validated)) {
                    throw new oq.p();
                }
                o.this.d9(new e41.a.OnValidated(((st3.g.b.Validated) bVar).getAddressResult()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(st3.g.b bVar, State state, tq.e<? super i0> eVar) {
            d dVar = o.this.new d(eVar);
            dVar.f47563f = bVar;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le41/a$c;", "action", "Le41/b;", "state", "Loq/i0;", "<anonymous>", "(Le41/a$c;Le41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<e41.a.OnValidated, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47565e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47566f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f47567g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e41.a.OnValidated onValidated = (e41.a.OnValidated) this.f47566f;
            State state = (State) this.f47567g;
            Object objE = uq.b.e();
            int i15 = this.f47565e;
            if (i15 == 0) {
                u.b(obj);
                if (onValidated.getAddressResult() instanceof st3.k.ValidWithResult) {
                    o.this.contract.W3(new f41.a.Data(((st3.k.ValidWithResult) onValidated.getAddressResult()).getAddressData().getProvince(), ((st3.k.ValidWithResult) onValidated.getAddressResult()).getAddressData().getCounty(), ((st3.k.ValidWithResult) onValidated.getAddressResult()).getAddressData().getCommunity(), ((st3.k.ValidWithResult) onValidated.getAddressResult()).getAddressData().getCity(), st3.c.c(((st3.k.ValidWithResult) onValidated.getAddressResult()).getAddressData())));
                    o.this.d9(e41.a.b.d.f47516a);
                } else {
                    xw.b<st3.g.a> bVarE = state.getAddressFormVMS().e();
                    st3.g.a.b bVar = st3.g.a.b.f184305a;
                    this.f47566f = vq.j.a(onValidated);
                    this.f47567g = vq.j.a(state);
                    this.f47565e = 1;
                    if (bVarE.F(bVar, this) == objE) {
                        return objE;
                    }
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
        public final Object w(e41.a.OnValidated onValidated, State state, tq.e<? super i0> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f47566f = onValidated;
            eVar2.f47567g = state;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le41/a$a;", "<unused var>", "Le41/b;", "state", "Loq/i0;", "<anonymous>", "(Le41/a$a;Le41/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<e41.a.C1089a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f47569e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f47570f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f47570f;
            Object objE = uq.b.e();
            int i15 = this.f47569e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<st3.g.a> bVarE = state.getAddressFormVMS().e();
                st3.g.a.c cVar = st3.g.a.c.f184306a;
                this.f47570f = vq.j.a(state);
                this.f47569e = 1;
                if (bVarE.F(cVar, this) == objE) {
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
        public final Object w(e41.a.C1089a c1089a, State state, tq.e<? super i0> eVar) {
            f fVar = new f(eVar);
            fVar.f47570f = state;
            return fVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, g41.a aVar2, q31.c cVar, st3.h hVar, f41.a aVar3) {
        this.mapper = aVar2;
        this.exitDialogMapper = cVar;
        this.contract = aVar3;
        boolean zL = aVar3.l();
        AddressFormVMSSetupData.b.d dVar = AddressFormVMSSetupData.b.d.f184327a;
        f41.a.Data dataC7 = aVar3.C7();
        State state = new State(zL, hVar.a(new AddressFormVMSSetupData(dVar, false, dataC7 != null ? new AddressFormVMSSetupData.a(dataC7.getProvince().getId(), dataC7.getCounty().getId(), dataC7.getCommunity().getId(), dataC7.getCity().getId(), null, null, null, null, 240, null) : null, 2, null)));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: e41.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.q9(this.f47537a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), o9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e41.c.Data o9(State state) {
        return this.mapper.b(new g41.a.Params(state, b9(e41.a.C1089a.f47512a), b9(e41.a.d.f47520a), b9(e41.a.b.C1090a.f47513a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(final o oVar, v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: e41.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.r9(this.f47536a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(o oVar, z zVar) {
        b bVar = oVar.new b(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(e41.a.b.class), oVar2, bVar);
        zVar.x(q0.c(e41.a.d.class), oVar2, oVar.new c(null));
        k10.k.r(zVar, new er.l() { // from class: e41.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.s9((State) obj);
            }
        }, null, oVar.new d(null), 2, null);
        zVar.x(q0.c(e41.a.OnValidated.class), oVar2, oVar.new e(null));
        zVar.x(q0.c(e41.a.C1089a.class), oVar2, new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g s9(State state) {
        return state.getAddressFormVMS().d();
    }

    @Override // zx.b
    public xw.b<e41.a.b> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<State, e41.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e41.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(f41.a aVar) {
        super.P5(aVar);
    }
}
