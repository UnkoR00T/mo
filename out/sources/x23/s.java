package x23;

import fr.q0;
import java.util.Set;
import k10.c0;
import k10.z;
import k23.BusinessDetailsData;
import k23.PlaceOfPurchaseData;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressFormVMSSetupData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0001\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0013\u001a\u00020\u0012*\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001d\u001a\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010*\u001a\b\u0012\u0004\u0012\u00020%0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R \u00100\u001a\b\u0012\u0004\u0012\u00020\u00120+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lx23/s;", "Ll00/g;", "Lx23/b;", "Lx23/a;", "Lx23/c;", "", "Lst3/h;", "addressFormVMSFactory", "Lyy/a;", "stateMachineFactory", "Lm23/c;", "validateBusinessDataUC", "Lx23/r;", "setupData", "Ly23/a;", "mapper", "<init>", "(Lst3/h;Lyy/a;Lm23/c;Lx23/r;Ly23/a;)V", "Lx23/c$a;", "q9", "(Lx23/b;)Lx23/c$a;", "b", "Lm23/c;", "c", "Ly23/a;", "d", "Loq/k;", "o9", "()Lx23/b;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lx23/a$a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class s extends l00.g<State, x23.a> implements x23.c, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m23.c validateBusinessDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y23.a mapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, x23.a> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<x23.a.InterfaceC5771a> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<x23.c.Data> state = a9(new a(e9().getState(), this), q9(o9()));

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<x23.c.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f216653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ s f216654b;

        /* JADX INFO: renamed from: x23.s$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5773a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f216655a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ s f216656b;

            /* JADX INFO: renamed from: x23.s$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5774a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f216657d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f216658e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f216659f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f216661h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f216662j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f216663k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f216664l;

                public C5774a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f216657d = obj;
                    this.f216658e |= PKIFailureInfo.systemUnavail;
                    return C5773a.this.F(null, this);
                }
            }

            public C5773a(mu.h hVar, s sVar) {
                this.f216655a = hVar;
                this.f216656b = sVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5774a c5774a;
                if (eVar instanceof C5774a) {
                    c5774a = (C5774a) eVar;
                    int i15 = c5774a.f216658e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5774a.f216658e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5774a = new C5774a(eVar);
                    }
                } else {
                    c5774a = new C5774a(eVar);
                }
                Object obj2 = c5774a.f216657d;
                Object objE = uq.b.e();
                int i16 = c5774a.f216658e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f216655a;
                    x23.c.Data dataQ9 = this.f216656b.q9((State) obj);
                    c5774a.f216659f = vq.j.a(obj);
                    c5774a.f216661h = vq.j.a(c5774a);
                    c5774a.f216662j = vq.j.a(obj);
                    c5774a.f216663k = vq.j.a(hVar);
                    c5774a.f216664l = 0;
                    c5774a.f216658e = 1;
                    if (hVar.F(dataQ9, c5774a) == objE) {
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

        public a(mu.g gVar, s sVar) {
            this.f216653a = gVar;
            this.f216654b = sVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super x23.c.Data> hVar, tq.e eVar) {
            Object objA = this.f216653a.a(new C5773a(hVar, this.f216654b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx23/a$a;", "action", "Lx23/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lx23/a$a;Lx23/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<x23.a.InterfaceC5771a, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216666f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            x23.a.InterfaceC5771a interfaceC5771a = (x23.a.InterfaceC5771a) this.f216666f;
            Object objE = uq.b.e();
            int i15 = this.f216665e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<x23.a.InterfaceC5771a> bVarY1 = s.this.Y1();
                this.f216666f = vq.j.a(interfaceC5771a);
                this.f216665e = 1;
                if (bVarY1.F(interfaceC5771a, this) == objE) {
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
        public final Object w(x23.a.InterfaceC5771a interfaceC5771a, State state, tq.e<? super i0> eVar) {
            b bVar = s.this.new b(eVar);
            bVar.f216666f = interfaceC5771a;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lst3/g$b;", "event", "Lx23/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lst3/g$b;Lx23/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<st3.g.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216669f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            st3.g.b bVar = (st3.g.b) this.f216669f;
            uq.b.e();
            if (this.f216668e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (fr.t.c(bVar, st3.g.b.a.f184307a)) {
                s.this.d9(x23.a.InterfaceC5771a.C5772a.f216609a);
            } else if (bVar instanceof st3.g.b.GoToError) {
                s.this.d9(new x23.a.InterfaceC5771a.ShowError(((st3.g.b.GoToError) bVar).getErrorData()));
            } else if (bVar instanceof st3.g.b.GoToSearch) {
                s.this.d9(new x23.a.InterfaceC5771a.ShowSearch(((st3.g.b.GoToSearch) bVar).getModel()));
            } else {
                if (!(bVar instanceof st3.g.b.Validated)) {
                    throw new oq.p();
                }
                s.this.d9(new x23.a.OnTerytValidated(((st3.g.b.Validated) bVar).getAddressResult()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(st3.g.b bVar, State state, tq.e<? super i0> eVar) {
            c cVar = s.this.new c(eVar);
            cVar.f216669f = bVar;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lx23/a$b;", "action", "Lk10/c0;", "Lx23/b;", "state", "Lk10/l;", "<anonymous>", "(Lx23/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<x23.a.OnNameChanged, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216671e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216672f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f216673g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(x23.a.OnNameChanged onNameChanged, State state) {
            return State.b(state, null, onNameChanged.getName(), hz.b.C2039b.f86846c, null, null, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final x23.a.OnNameChanged onNameChanged = (x23.a.OnNameChanged) this.f216672f;
            c0 c0Var = (c0) this.f216673g;
            uq.b.e();
            if (this.f216671e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: x23.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.d.O(onNameChanged, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(x23.a.OnNameChanged onNameChanged, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f216672f = onNameChanged;
            dVar.f216673g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lx23/a$d;", "action", "Lk10/c0;", "Lx23/b;", "state", "Lk10/l;", "<anonymous>", "(Lx23/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<x23.a.OnTerytValidated, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f216674e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f216675f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f216676g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f216677h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f216678j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ SetupData f216680l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(SetupData setupData, tq.e<? super e> eVar) {
            super(3, eVar);
            this.f216680l = setupData;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State V(hz.g gVar, State state) {
            return State.b(state, null, null, gVar.a(), null, new d60.j(State.a.f216622a), 11, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State X(hz.g gVar, State state) {
            return State.b(state, null, null, gVar.a(), null, null, 27, null);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00c8  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz.g gVar;
            hz.g gVar2;
            PlaceOfPurchaseData placeOfPurchaseDataN;
            Set<k23.c> setA;
            x23.a.OnTerytValidated onTerytValidated = (x23.a.OnTerytValidated) this.f216677h;
            c0 c0Var = (c0) this.f216678j;
            Object objE = uq.b.e();
            int i15 = this.f216676g;
            if (i15 != 0) {
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    gVar2 = (hz.g) this.f216674e;
                    oq.u.b(obj);
                }
                gVar = gVar2;
                return c0Var.b(new er.l() { // from class: x23.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.e.X(gVar, (State) obj2);
                    }
                });
            }
            oq.u.b(obj);
            m23.c cVar = s.this.validateBusinessDataUC;
            m23.c.Params params = new m23.c.Params(((State) c0Var.a()).getName());
            this.f216677h = onTerytValidated;
            this.f216678j = c0Var;
            this.f216676g = 1;
            obj = cVar.d(params, this);
            if (obj != objE) {
            }
            return objE;
            gVar = (hz.g) obj;
            if (gVar instanceof hz.g.Invalid) {
                return c0Var.b(new er.l() { // from class: x23.u
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return s.e.V(gVar, (State) obj2);
                    }
                });
            }
            st3.k addressResult = onTerytValidated.getAddressResult();
            if (!(addressResult instanceof st3.k.ValidWithResult)) {
                xw.b<st3.g.a> bVarE = ((State) c0Var.a()).getAddressFormVMS().e();
                st3.g.a.b bVar = st3.g.a.b.f184305a;
                this.f216677h = vq.j.a(onTerytValidated);
                this.f216678j = c0Var;
                this.f216674e = gVar;
                this.f216675f = vq.j.a(addressResult);
                this.f216676g = 2;
                if (bVarE.F(bVar, this) != objE) {
                    gVar2 = gVar;
                    gVar = gVar2;
                }
                return objE;
            }
            this.f216680l.getContract().D2(new BusinessDetailsData(((State) c0Var.a()).getBusinessSelection(), ((State) c0Var.a()).getName(), ((st3.k.ValidWithResult) addressResult).getAddressData()));
            if (((State) c0Var.a()).getBusinessSelection() != k23.c.SELLER || (placeOfPurchaseDataN = this.f216680l.getContract().N()) == null || (setA = placeOfPurchaseDataN.a()) == null) {
                s.this.d9(x23.a.InterfaceC5771a.c.f216611a);
            } else {
                k23.c cVar2 = k23.c.SUPPLIER;
                if (setA.contains(cVar2)) {
                    s.this.d9(new x23.a.InterfaceC5771a.GoToBusinessDetails(cVar2));
                } else {
                    s.this.d9(x23.a.InterfaceC5771a.c.f216611a);
                }
            }
            return c0Var.b(new er.l() { // from class: x23.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return s.e.X(gVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(x23.a.OnTerytValidated onTerytValidated, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = s.this.new e(this.f216680l, eVar);
            eVar2.f216677h = onTerytValidated;
            eVar2.f216678j = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lx23/a$c;", "<unused var>", "Lx23/b;", "state", "Loq/i0;", "<anonymous>", "(Lx23/a$c;Lx23/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<x23.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f216681e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f216682f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            State state = (State) this.f216682f;
            Object objE = uq.b.e();
            int i15 = this.f216681e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<st3.g.a> bVarE = state.getAddressFormVMS().e();
                st3.g.a.c cVar = st3.g.a.c.f184306a;
                this.f216682f = vq.j.a(state);
                this.f216681e = 1;
                if (bVarE.F(cVar, this) == objE) {
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
        public final Object w(x23.a.c cVar, State state, tq.e<? super i0> eVar) {
            f fVar = new f(eVar);
            fVar.f216682f = state;
            return fVar.J(i0.f148189a);
        }
    }

    public s(final st3.h hVar, yy.a aVar, m23.c cVar, final SetupData setupData, y23.a aVar2) {
        this.validateBusinessDataUC = cVar;
        this.mapper = aVar2;
        this.initialState = oq.l.a(new er.a() { // from class: x23.p
            @Override // er.a
            public final Object a() {
                return s.p9(setupData, hVar);
            }
        });
        this.stateMachine = aVar.a(o9(), new er.l() { // from class: x23.q
            @Override // er.l
            public final Object b(Object obj) {
                return s.t9(this.f216643a, setupData, (k10.v) obj);
            }
        });
    }

    private final State o9() {
        return (State) this.initialState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final State p9(SetupData setupData, st3.h hVar) {
        String nameOrPlace;
        AddressData address;
        BusinessDetailsData businessDetailsDataM0 = setupData.getContract().M0(setupData.getBusinessSelection());
        st3.g gVarA = hVar.a(new AddressFormVMSSetupData(AddressFormVMSSetupData.b.c.f184326a, true, (businessDetailsDataM0 == null || (address = businessDetailsDataM0.getAddress()) == null) ? null : st3.j.a(address)));
        if (businessDetailsDataM0 == null || (nameOrPlace = businessDetailsDataM0.getNameOrPlace()) == null) {
            nameOrPlace = "";
        }
        return new State(gVarA, nameOrPlace, null, setupData.getBusinessSelection(), null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x23.c.Data q9(State state) {
        return this.mapper.b(new y23.a.Params(state, new er.l() { // from class: x23.m
            @Override // er.l
            public final Object b(Object obj) {
                return s.r9(this.f216638a, (String) obj);
            }
        }, b9(x23.a.c.f216615a), b9(x23.a.InterfaceC5771a.C5772a.f216609a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(s sVar, String str) {
        sVar.d9(new x23.a.OnNameChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final s sVar, final SetupData setupData, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: x23.n
            @Override // er.l
            public final Object b(Object obj) {
                return s.u9(this.f216639a, setupData, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(s sVar, SetupData setupData, z zVar) {
        b bVar = sVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(x23.a.InterfaceC5771a.class), oVar, bVar);
        k10.k.r(zVar, new er.l() { // from class: x23.o
            @Override // er.l
            public final Object b(Object obj) {
                return s.v9((State) obj);
            }
        }, null, sVar.new c(null), 2, null);
        zVar.v(q0.c(x23.a.OnNameChanged.class), oVar, new d(null));
        zVar.v(q0.c(x23.a.OnTerytValidated.class), oVar, sVar.new e(setupData, null));
        zVar.x(q0.c(x23.a.c.class), oVar, new f(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final mu.g v9(State state) {
        return state.getAddressFormVMS().d();
    }

    @Override // zx.b
    public xw.b<x23.a.InterfaceC5771a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, x23.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<x23.c.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }
}
