package jc2;

import al0.BEGenerateXmlResponse;
import nb2.SummaryModel;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJU\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$\"\b\b\u0000\u0010\u001c*\u00020\u0002*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001d2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u00032\u0018\u0010#\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u00020!H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010>\u001a\u00020;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R,\u0010F\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030?8\u0014X\u0094\u0004¢\u0006\u0012\n\u0004\b@\u0010A\u0012\u0004\bD\u0010E\u001a\u0004\bB\u0010CR \u0010M\u001a\b\u0012\u0004\u0012\u00020H0G8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR \u0010'\u001a\b\u0012\u0004\u0012\u00020(0N8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010R¨\u0006S"}, d2 = {"Ljc2/e0;", "Ll00/g;", "Ljc2/d;", "Ljc2/c;", "Ljc2/k;", "", "Lyy/a;", "stateMachineFactory", "Llc2/f;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lsb2/b;", "invalidateIdCardLossOrDamageUC", "Lib4/c;", "genericDomainErrorMapper", "Lsb2/a;", "generateTheftXmlUC", "Lwz3/j;", "signBase64XmlUC", "Lsb2/c;", "submitTheftXmlUC", "Lhb4/d;", "errorVMSFactory", "Lkc2/a;", "contract", "<init>", "(Lyy/a;Llc2/f;Lac4/a;Lsb2/b;Lib4/c;Lsb2/a;Lwz3/j;Lsb2/c;Lhb4/d;Lkc2/a;)V", "T", "Lk10/c0;", "Lk44/a;", "error", "onReauthenticated", "Lkotlin/Function2;", "Lhb4/c;", "errorState", "Lk10/l;", "B9", "(Lk10/c0;Lk44/a;Ljc2/c;Ler/p;)Lk10/l;", "state", "Ljc2/k$a;", "E9", "(Ljc2/d;)Ljc2/k$a;", "b", "Llc2/f;", "c", "Lac4/a;", "d", "Lsb2/b;", "e", "Lib4/c;", "f", "Lsb2/a;", "g", "Lwz3/j;", "h", "Lsb2/c;", "j", "Lhb4/d;", "Ljc2/d$b;", "k", "Ljc2/d$b;", "initialState", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Ljc2/c$c;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 extends l00.g<jc2.d, jc2.c> implements jc2.k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final lc2.f mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final sb2.b invalidateIdCardLossOrDamageUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final sb2.a generateTheftXmlUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final wz3.j signBase64XmlUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final sb2.c submitTheftXmlUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final jc2.d.Initialized initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<jc2.d, jc2.c> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<jc2.c.InterfaceC2399c> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<jc2.k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<jc2.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f101471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f101472b;

        /* JADX INFO: renamed from: jc2.e0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2401a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f101473a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f101474b;

            /* JADX INFO: renamed from: jc2.e0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2402a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f101475d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f101476e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f101477f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f101479h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f101480j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f101481k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f101482l;

                public C2402a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f101475d = obj;
                    this.f101476e |= PKIFailureInfo.systemUnavail;
                    return C2401a.this.F(null, this);
                }
            }

            public C2401a(mu.h hVar, e0 e0Var) {
                this.f101473a = hVar;
                this.f101474b = e0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2402a c2402a;
                if (eVar instanceof C2402a) {
                    c2402a = (C2402a) eVar;
                    int i15 = c2402a.f101476e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2402a.f101476e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2402a = new C2402a(eVar);
                    }
                } else {
                    c2402a = new C2402a(eVar);
                }
                Object obj2 = c2402a.f101475d;
                Object objE = uq.b.e();
                int i16 = c2402a.f101476e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f101473a;
                    jc2.k.a aVarE9 = this.f101474b.E9((jc2.d) obj);
                    c2402a.f101477f = vq.j.a(obj);
                    c2402a.f101479h = vq.j.a(c2402a);
                    c2402a.f101480j = vq.j.a(obj);
                    c2402a.f101481k = vq.j.a(hVar);
                    c2402a.f101482l = 0;
                    c2402a.f101476e = 1;
                    if (hVar.F(aVarE9, c2402a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public a(mu.g gVar, e0 e0Var) {
            this.f101471a = gVar;
            this.f101472b = e0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super jc2.k.a> hVar, tq.e eVar) {
            Object objA = this.f101471a.a(new C2401a(hVar, this.f101472b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljc2/c$d;", "<unused var>", "Ljc2/d;", "Loq/i0;", "<anonymous>", "(Ljc2/c$d;Ljc2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<jc2.c.d, jc2.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101483e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f101483e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                jc2.c.InterfaceC2399c.a aVar = jc2.c.InterfaceC2399c.a.f101437a;
                this.f101483e = 1;
                if (e0Var.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.c.d dVar, jc2.d dVar2, tq.e<? super oq.i0> eVar) {
            return e0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljc2/c$e;", "<unused var>", "Ljc2/d;", "Loq/i0;", "<anonymous>", "(Ljc2/c$e;Ljc2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<jc2.c.e, jc2.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101485e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f101485e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                jc2.c.InterfaceC2399c.b bVar = jc2.c.InterfaceC2399c.b.f101438a;
                this.f101485e = 1;
                if (e0Var.F(bVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.c.e eVar, jc2.d dVar, tq.e<? super oq.i0> eVar2) {
            return e0.this.new c(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljc2/c$b;", "action", "Ljc2/d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljc2/c$b;Ljc2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<jc2.c.GoToEdorAuth, jc2.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101487e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101488f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(e0 e0Var, jc2.c.GoToEdorAuth goToEdorAuth, iy.b0 b0Var) {
            e0Var.d9(goToEdorAuth.getRetryAction());
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final jc2.c.GoToEdorAuth goToEdorAuth = (jc2.c.GoToEdorAuth) this.f101488f;
            Object objE = uq.b.e();
            int i15 = this.f101487e;
            if (i15 == 0) {
                oq.u.b(obj);
                e0 e0Var = e0.this;
                final e0 e0Var2 = e0.this;
                jc2.c.InterfaceC2399c.EdorAuth edorAuth = new jc2.c.InterfaceC2399c.EdorAuth(new mv3.a.EdorAddressRequired(new er.l() { // from class: jc2.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e0.d.O(e0Var2, goToEdorAuth, (iy.b0) obj2);
                    }
                }, null, 2, null));
                this.f101488f = vq.j.a(goToEdorAuth);
                this.f101487e = 1;
                if (e0Var.F(edorAuth, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.c.GoToEdorAuth goToEdorAuth, jc2.d dVar, tq.e<? super oq.i0> eVar) {
            d dVar2 = e0.this.new d(eVar);
            dVar2.f101488f = goToEdorAuth;
            return dVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/c$h;", "action", "Lk10/c0;", "Ljc2/d$b;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<jc2.c.OnStatementChecked, k10.c0<jc2.d.Initialized>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101490e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101491f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f101492g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jc2.d.Initialized O(jc2.c.OnStatementChecked onStatementChecked, jc2.d.Initialized initialized) {
            return jc2.d.Initialized.d(initialized, null, null, jc2.d.StatementData.b(initialized.getStatementData(), onStatementChecked.getChecked(), false, false, 4, null), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final jc2.c.OnStatementChecked onStatementChecked = (jc2.c.OnStatementChecked) this.f101491f;
            k10.c0 c0Var = (k10.c0) this.f101492g;
            uq.b.e();
            if (this.f101490e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jc2.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.e.O(onStatementChecked, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.c.OnStatementChecked onStatementChecked, k10.c0<jc2.d.Initialized> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f101491f = onStatementChecked;
            eVar2.f101492g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/c$f;", "<unused var>", "Lk10/c0;", "Ljc2/d$b;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<jc2.c.f, k10.c0<jc2.d.Initialized>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101493e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101494f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jc2.d.Initialized O(jc2.d.Initialized initialized) {
            return jc2.d.Initialized.d(initialized, null, null, jc2.d.StatementData.b(initialized.getStatementData(), false, false, false, 3, null), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f101494f;
            uq.b.e();
            if (this.f101493e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: jc2.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.f.O((d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.c.f fVar, k10.c0<jc2.d.Initialized> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            f fVar2 = new f(eVar);
            fVar2.f101494f = c0Var;
            return fVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/c$g;", "<unused var>", "Lk10/c0;", "Ljc2/d$b;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<jc2.c.g, k10.c0<jc2.d.Initialized>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101495e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101496f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jc2.d.Initialized V(jc2.d.Initialized initialized) {
            return jc2.d.Initialized.d(initialized, null, null, jc2.d.StatementData.b(initialized.getStatementData(), false, true, true, 1, null), 3, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jc2.d X(k10.c0 c0Var, jc2.d.Initialized initialized) {
            hl0.a invalidationData = ((jc2.d.Initialized) c0Var.a()).getInvalidationData();
            if (invalidationData instanceof hl0.a.c) {
                return new Sending((hl0.a.c) invalidationData, initialized.getUserEdorAddress(), ((jc2.d.Initialized) c0Var.a()).getStatementData());
            }
            if (invalidationData instanceof hl0.a.Theft) {
                return new Generating((hl0.a.Theft) invalidationData, initialized.getUserEdorAddress(), ((jc2.d.Initialized) c0Var.a()).getStatementData());
            }
            throw new oq.p();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f101496f;
            uq.b.e();
            if (this.f101495e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean isChecked = ((jc2.d.Initialized) c0Var.a()).getStatementData().getIsChecked();
            if (!isChecked) {
                return c0Var.b(new er.l() { // from class: jc2.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e0.g.V((d.Initialized) obj2);
                    }
                });
            }
            if (isChecked) {
                return c0Var.d(new er.l() { // from class: jc2.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e0.g.X(c0Var, (d.Initialized) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.c.g gVar, k10.c0<jc2.d.Initialized> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            g gVar2 = new g(eVar);
            gVar2.f101496f = c0Var;
            return gVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljc2/h;", "it", "Loq/i0;", "<anonymous>", "(Ljc2/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<Sending, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101497e;

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f101497e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0.this.d9(jc2.c.i.f101446a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Sending sending, tq.e<? super oq.i0> eVar) {
            return ((h) v(sending, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return e0.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/c$i;", "action", "Lk10/c0;", "Ljc2/h;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/c$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<jc2.c.i, k10.c0<Sending>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101499e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101500f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f101501g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljc2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends jc2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f101503e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f101504f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f101505g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f101506h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f101507j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f101508k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f101509l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f101510m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ e0 f101511n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<Sending> f101512p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ jc2.c.i f101513q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, k10.c0<Sending> c0Var, jc2.c.i iVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f101511n = e0Var;
                this.f101512p = c0Var;
                this.f101513q = iVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jc2.d V(Sending sending, hb4.c cVar) {
                return new Error(sending.getInvalidationData(), sending.getUserEdorAddress(), sending.getStatementData(), cVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f101510m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    sb2.b bVar = this.f101511n.invalidateIdCardLossOrDamageUC;
                    sb2.b.Params params = new sb2.b.Params(this.f101512p.a().getInvalidationData());
                    this.f101510m = 1;
                    obj = bVar.e(params, this);
                    if (obj != objE) {
                    }
                }
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    k10.l lVar = (k10.l) this.f101505g;
                    oq.u.b(obj);
                    return lVar;
                }
                oq.u.b(obj);
                dx.i iVar = (dx.i) obj;
                e0 e0Var = this.f101511n;
                k10.c0<Sending> c0Var = this.f101512p;
                jc2.c.i iVar2 = this.f101513q;
                if (iVar instanceof dx.i.Left) {
                    return e0Var.B9(c0Var, (k44.a) ((dx.i.Left) iVar).b(), iVar2, new er.p() { // from class: jc2.k0
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return e0.i.a.V((Sending) obj2, (hb4.c) obj3);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                oq.i0 i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                Object objC = c0Var.c();
                jc2.c.InterfaceC2399c.d dVar = jc2.c.InterfaceC2399c.d.f101440a;
                this.f101503e = vq.j.a(iVar);
                this.f101504f = vq.j.a(i0Var);
                this.f101505g = objC;
                this.f101506h = vq.j.a(objC);
                this.f101507j = 0;
                this.f101508k = 0;
                this.f101509l = 0;
                this.f101510m = 2;
                return e0Var.F(dVar, this) == objE ? objE : objC;
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f101511n, this.f101512p, this.f101513q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends jc2.d>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jc2.c.i iVar = (jc2.c.i) this.f101500f;
            k10.c0 c0Var = (k10.c0) this.f101501g;
            Object objE = uq.b.e();
            int i15 = this.f101499e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = e0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(e0.this, c0Var, iVar, null);
            this.f101500f = vq.j.a(iVar);
            this.f101501g = vq.j.a(c0Var);
            this.f101499e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.c.i iVar, k10.c0<Sending> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            i iVar2 = e0.this.new i(eVar);
            iVar2.f101500f = iVar;
            iVar2.f101501g = c0Var;
            return iVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/a;", "<unused var>", "Lk10/c0;", "Ljc2/g;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<jc2.a, k10.c0<Error>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101514e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101515f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jc2.d.Initialized O(Error error) {
            return new jc2.d.Initialized(error.getInvalidationData(), error.getUserEdorAddress(), error.getStatementData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f101515f;
            uq.b.e();
            if (this.f101514e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jc2.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.j.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.a aVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f101515f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/b;", "<unused var>", "Lk10/c0;", "Ljc2/g;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<jc2.b, k10.c0<Error>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101517f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Sending O(Error error) {
            return new Sending(error.getInvalidationData(), error.getUserEdorAddress(), error.getStatementData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f101517f;
            uq.b.e();
            if (this.f101516e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jc2.m0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.k.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f101517f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljc2/f;", "it", "Loq/i0;", "<anonymous>", "(Ljc2/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<Generating, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101518e;

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f101518e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0.this.d9(jc2.c.a.f101435a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Generating generating, tq.e<? super oq.i0> eVar) {
            return ((l) v(generating, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return e0.this.new l(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/c$a;", "action", "Lk10/c0;", "Ljc2/f;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/c$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<jc2.c.a, k10.c0<Generating>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101520e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101521f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f101522g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljc2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends jc2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f101524e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ e0 f101525f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Generating> f101526g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ jc2.c.a f101527h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, k10.c0<Generating> c0Var, jc2.c.a aVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f101525f = e0Var;
                this.f101526g = c0Var;
                this.f101527h = aVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jc2.d X(Generating generating, hb4.c cVar) {
                return new Error(generating.getInvalidationData(), generating.getUserEdorAddress(), generating.getStatementData(), cVar);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Submitting Y(BEGenerateXmlResponse bEGenerateXmlResponse, Generating generating) {
                return new Submitting(generating.getInvalidationData(), generating.getUserEdorAddress(), generating.getStatementData(), bEGenerateXmlResponse);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f101524e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    sb2.a aVar = this.f101525f.generateTheftXmlUC;
                    sb2.a.Params params = new sb2.a.Params(this.f101526g.a().getInvalidationData());
                    this.f101524e = 1;
                    obj = aVar.e(params, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                dx.i iVar = (dx.i) obj;
                e0 e0Var = this.f101525f;
                k10.c0<Generating> c0Var = this.f101526g;
                jc2.c.a aVar2 = this.f101527h;
                if (iVar instanceof dx.i.Left) {
                    return e0Var.B9(c0Var, (k44.a) ((dx.i.Left) iVar).b(), aVar2, new er.p() { // from class: jc2.n0
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return e0.m.a.X((Generating) obj2, (hb4.c) obj3);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BEGenerateXmlResponse bEGenerateXmlResponse = (BEGenerateXmlResponse) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: jc2.o0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return e0.m.a.Y(bEGenerateXmlResponse, (Generating) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f101525f, this.f101526g, this.f101527h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends jc2.d>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jc2.c.a aVar = (jc2.c.a) this.f101521f;
            k10.c0 c0Var = (k10.c0) this.f101522g;
            Object objE = uq.b.e();
            int i15 = this.f101520e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar2 = e0.this.callActionWithLoaderUseCase;
            a aVar3 = new a(e0.this, c0Var, aVar, null);
            this.f101521f = vq.j.a(aVar);
            this.f101522g = vq.j.a(c0Var);
            this.f101520e = 1;
            Object objA = ac4.a.a(aVar2, null, aVar3, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.c.a aVar, k10.c0<Generating> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            m mVar = e0.this.new m(eVar);
            mVar.f101521f = aVar;
            mVar.f101522g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/a;", "<unused var>", "Lk10/c0;", "Ljc2/e;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<jc2.a, k10.c0<Error>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101529f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jc2.d.Initialized O(Error error) {
            return new jc2.d.Initialized(error.getInvalidationData(), error.getUserEdorAddress(), error.getStatementData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f101529f;
            uq.b.e();
            if (this.f101528e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jc2.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.n.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.a aVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            n nVar = new n(eVar);
            nVar.f101529f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/b;", "<unused var>", "Lk10/c0;", "Ljc2/e;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<jc2.b, k10.c0<Error>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101531f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Generating O(Error error) {
            return new Generating(error.getInvalidationData(), error.getUserEdorAddress(), error.getStatementData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f101531f;
            uq.b.e();
            if (this.f101530e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jc2.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.o.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            o oVar = new o(eVar);
            oVar.f101531f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljc2/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ljc2/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.p<Submitting, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101532e;

        p(tq.e<? super p> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f101532e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            e0.this.d9(jc2.c.j.f101447a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Submitting submitting, tq.e<? super oq.i0> eVar) {
            return ((p) v(submitting, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return e0.this.new p(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/c$j;", "action", "Lk10/c0;", "Ljc2/j;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/c$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<jc2.c.j, k10.c0<Submitting>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101534e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101535f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f101536g;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljc2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends jc2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f101538e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f101539f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f101540g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f101541h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f101542j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f101543k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f101544l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f101545m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ e0 f101546n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<Submitting> f101547p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ jc2.c.j f101548q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(e0 e0Var, k10.c0<Submitting> c0Var, jc2.c.j jVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f101546n = e0Var;
                this.f101547p = c0Var;
                this.f101548q = jVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final jc2.d V(Submitting submitting, hb4.c cVar) {
                return new Error(submitting.getInvalidationData(), submitting.getUserEdorAddress(), submitting.getStatementData(), cVar, submitting.getGenerateXmlResponse());
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00e5  */
            /* JADX WARN: Code duplicated, block: B:34:0x00f7  */
            /* JADX WARN: Code duplicated, block: B:36:0x00fb  */
            /* JADX WARN: Code duplicated, block: B:39:0x012d A[RETURN] */
            /* JADX WARN: Code duplicated, block: B:40:0x012e  */
            /* JADX WARN: Code restructure failed: missing block: B:27:0x00d6, code lost:
            
                if (r11 == r0) goto L38;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 320
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: jc2.e0.q.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f101546n, this.f101547p, this.f101548q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends jc2.d>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jc2.c.j jVar = (jc2.c.j) this.f101535f;
            k10.c0 c0Var = (k10.c0) this.f101536g;
            Object objE = uq.b.e();
            int i15 = this.f101534e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = e0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(e0.this, c0Var, jVar, null);
            this.f101535f = vq.j.a(jVar);
            this.f101536g = vq.j.a(c0Var);
            this.f101534e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.c.j jVar, k10.c0<Submitting> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            q qVar = e0.this.new q(eVar);
            qVar.f101535f = jVar;
            qVar.f101536g = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/a;", "<unused var>", "Lk10/c0;", "Ljc2/i;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<jc2.a, k10.c0<Error>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101549e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101550f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jc2.d.Initialized O(Error error) {
            return new jc2.d.Initialized(error.getInvalidationData(), error.getUserEdorAddress(), error.getStatementData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f101550f;
            uq.b.e();
            if (this.f101549e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jc2.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.r.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.a aVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            r rVar = new r(eVar);
            rVar.f101550f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljc2/b;", "<unused var>", "Lk10/c0;", "Ljc2/i;", "state", "Lk10/l;", "Ljc2/d;", "<anonymous>", "(Ljc2/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<jc2.b, k10.c0<Error>, tq.e<? super k10.l<? extends jc2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f101551e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f101552f;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Submitting O(Error error) {
            return new Submitting(error.getInvalidationData(), error.getUserEdorAddress(), error.getStatementData(), error.getResponse());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f101552f;
            uq.b.e();
            if (this.f101551e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jc2.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return e0.s.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jc2.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jc2.d>> eVar) {
            s sVar = new s(eVar);
            sVar.f101552f = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    public e0(yy.a aVar, lc2.f fVar, ac4.a aVar2, sb2.b bVar, ib4.c cVar, sb2.a aVar3, wz3.j jVar, sb2.c cVar2, hb4.d dVar, kc2.a aVar4) {
        this.mapper = fVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.invalidateIdCardLossOrDamageUC = bVar;
        this.genericDomainErrorMapper = cVar;
        this.generateTheftXmlUC = aVar3;
        this.signBase64XmlUC = jVar;
        this.submitTheftXmlUC = cVar2;
        this.errorVMSFactory = dVar;
        SummaryModel summaryModelW1 = aVar4.W1();
        jc2.d.Initialized initialized = new jc2.d.Initialized(summaryModelW1.getInvalidationData(), summaryModelW1.getUserEdorAddress(), null, 4, null);
        this.initialState = initialized;
        this.stateMachine = aVar.a(initialized, new er.l() { // from class: jc2.u
            @Override // er.l
            public final Object b(Object obj) {
                return e0.H9(this.f101606a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), E9(initialized));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T extends jc2.d> k10.l<jc2.d> B9(k10.c0<? extends T> c0Var, k44.a aVar, jc2.c cVar, final er.p<? super T, ? super hb4.c, ? extends jc2.d> pVar) {
        if (aVar instanceof k44.a.Domain) {
            final jb4.b bVarB = this.genericDomainErrorMapper.b(new ib4.c.Params(((k44.a.Domain) aVar).getDomain(), false, new er.l() { // from class: jc2.d0
                @Override // er.l
                public final Object b(Object obj) {
                    return e0.C9(this.f101454a, (ib4.c.b) obj);
                }
            }, 2, null));
            return c0Var.d(new er.l() { // from class: jc2.t
                @Override // er.l
                public final Object b(Object obj) {
                    return e0.D9(pVar, this, bVarB, (d) obj);
                }
            });
        }
        if (!fr.t.c(aVar, k44.a.b.f108417a)) {
            throw new oq.p();
        }
        k10.l lVarC = c0Var.c();
        d9(new jc2.c.GoToEdorAuth(cVar));
        return lVarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(e0 e0Var, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            e0Var.d9(jc2.a.f101432a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            e0Var.d9(jc2.b.f101433a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final jc2.d D9(er.p pVar, e0 e0Var, jb4.b bVar, jc2.d dVar) {
        return (jc2.d) pVar.B(dVar, e0Var.errorVMSFactory.a(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jc2.k.a E9(jc2.d state) {
        return this.mapper.b(new lc2.f.Params(state, b9(jc2.c.g.f101444a), new er.l() { // from class: jc2.s
            @Override // er.l
            public final Object b(Object obj) {
                return e0.F9(this.f101602a, ((Boolean) obj).booleanValue());
            }
        }, b9(jc2.c.f.f101443a), b9(jc2.c.d.f101441a), b9(jc2.c.e.f101442a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(e0 e0Var, boolean z15) {
        e0Var.d9(new jc2.c.OnStatementChecked(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(final e0 e0Var, k10.v vVar) {
        vVar.c(fr.q0.c(jc2.d.class), new er.l() { // from class: jc2.v
            @Override // er.l
            public final Object b(Object obj) {
                return e0.I9(this.f101607a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jc2.d.Initialized.class), new er.l() { // from class: jc2.w
            @Override // er.l
            public final Object b(Object obj) {
                return e0.J9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Sending.class), new er.l() { // from class: jc2.x
            @Override // er.l
            public final Object b(Object obj) {
                return e0.K9(this.f101610a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: jc2.y
            @Override // er.l
            public final Object b(Object obj) {
                return e0.L9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Generating.class), new er.l() { // from class: jc2.z
            @Override // er.l
            public final Object b(Object obj) {
                return e0.M9(this.f101611a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: jc2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.N9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Submitting.class), new er.l() { // from class: jc2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.O9(this.f101434a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: jc2.c0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.P9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(e0 e0Var, k10.z zVar) {
        b bVar = e0Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(jc2.c.d.class), oVar, bVar);
        zVar.x(fr.q0.c(jc2.c.e.class), oVar, e0Var.new c(null));
        zVar.x(fr.q0.c(jc2.c.GoToEdorAuth.class), oVar, e0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(jc2.c.OnStatementChecked.class), oVar, eVar);
        zVar.v(fr.q0.c(jc2.c.f.class), oVar, new f(null));
        zVar.v(fr.q0.c(jc2.c.g.class), oVar, new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(e0 e0Var, k10.z zVar) {
        zVar.C(e0Var.new h(null));
        i iVar = e0Var.new i(null);
        zVar.v(fr.q0.c(jc2.c.i.class), k10.o.CANCEL_PREVIOUS, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(jc2.a.class), oVar, jVar);
        zVar.v(fr.q0.c(jc2.b.class), oVar, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(e0 e0Var, k10.z zVar) {
        zVar.C(e0Var.new l(null));
        m mVar = e0Var.new m(null);
        zVar.v(fr.q0.c(jc2.c.a.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(k10.z zVar) {
        n nVar = new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(jc2.a.class), oVar, nVar);
        zVar.v(fr.q0.c(jc2.b.class), oVar, new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(e0 e0Var, k10.z zVar) {
        zVar.C(e0Var.new p(null));
        q qVar = e0Var.new q(null);
        zVar.v(fr.q0.c(jc2.c.j.class), k10.o.CANCEL_PREVIOUS, qVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(k10.z zVar) {
        r rVar = new r(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(jc2.a.class), oVar, rVar);
        zVar.v(fr.q0.c(jc2.b.class), oVar, new s(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: A9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(jc2.c.InterfaceC2399c interfaceC2399c, tq.e<? super oq.i0> eVar) {
        return super.F(interfaceC2399c, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(kc2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<jc2.c.InterfaceC2399c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<jc2.d, jc2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<jc2.k.a> getState() {
        return this.state;
    }
}
