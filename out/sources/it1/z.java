package it1;

import al0.BankRestrictionsSettings;
import fr.q0;
import mu.p0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BA\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u00101\u001a\b\u0012\u0004\u0012\u00020,0+8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R&\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R \u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u0017088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<¨\u0006="}, d2 = {"Lit1/z;", "Ll00/g;", "Lit1/h;", "Lit1/a;", "Lit1/i;", "", "Lyy/a;", "stateMachineFactory", "Lit1/j;", "mapper", "Lib4/c;", "genericDomainErrorHandler", "Lac4/a;", "callActionWithLoaderUseCase", "Lml0/h;", "getBankRestrictionsSettingsUC", "Lml0/q;", "getPassportsUC", "Lhb4/d;", "errorVMSFactory", "<init>", "(Lyy/a;Lit1/j;Lib4/c;Lac4/a;Lml0/h;Lml0/q;Lhb4/d;)V", "state", "Lit1/i$a;", "x9", "(Lit1/h;)Lit1/i$a;", "Ldx/b;", "domainError", "Lhb4/c;", "v9", "(Ldx/b;)Lhb4/c;", "b", "Lit1/j;", "c", "Lib4/c;", "d", "Lac4/a;", "e", "Lml0/h;", "f", "Lml0/q;", "g", "Lhb4/d;", "Lxw/b;", "Lit1/a$d;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z extends l00.g<it1.h, it1.a> implements it1.i, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final it1.j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorHandler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ml0.h getBankRestrictionsSettingsUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ml0.q getPassportsUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<it1.a.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<it1.h, it1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<it1.i.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<it1.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f97019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ z f97020b;

        /* JADX INFO: renamed from: it1.z$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2270a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f97021a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ z f97022b;

            /* JADX INFO: renamed from: it1.z$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2271a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f97023d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f97024e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f97025f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f97027h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f97028j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f97029k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f97030l;

                public C2271a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f97023d = obj;
                    this.f97024e |= PKIFailureInfo.systemUnavail;
                    return C2270a.this.F(null, this);
                }
            }

            public C2270a(mu.h hVar, z zVar) {
                this.f97021a = hVar;
                this.f97022b = zVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2271a c2271a;
                if (eVar instanceof C2271a) {
                    c2271a = (C2271a) eVar;
                    int i15 = c2271a.f97024e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2271a.f97024e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2271a = new C2271a(eVar);
                    }
                } else {
                    c2271a = new C2271a(eVar);
                }
                Object obj2 = c2271a.f97023d;
                Object objE = uq.b.e();
                int i16 = c2271a.f97024e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f97021a;
                    it1.i.a aVarX9 = this.f97022b.x9((it1.h) obj);
                    c2271a.f97025f = vq.j.a(obj);
                    c2271a.f97027h = vq.j.a(c2271a);
                    c2271a.f97028j = vq.j.a(obj);
                    c2271a.f97029k = vq.j.a(hVar);
                    c2271a.f97030l = 0;
                    c2271a.f97024e = 1;
                    if (hVar.F(aVarX9, c2271a) == objE) {
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

        public a(mu.g gVar, z zVar) {
            this.f97019a = gVar;
            this.f97020b = zVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super it1.i.a> hVar, tq.e eVar) {
            Object objA = this.f97019a.a(new C2270a(hVar, this.f97020b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lit1/a$d;", "action", "Lit1/h;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lit1/a$d;Lit1/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<it1.a.d, it1.h, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97031e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97032f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            it1.a.d dVar = (it1.a.d) this.f97032f;
            Object objE = uq.b.e();
            int i15 = this.f97031e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<it1.a.d> bVarY1 = z.this.Y1();
                this.f97032f = vq.j.a(dVar);
                this.f97031e = 1;
                if (bVarY1.F(dVar, this) == objE) {
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
        public final Object w(it1.a.d dVar, it1.h hVar, tq.e<? super oq.i0> eVar) {
            b bVar = z.this.new b(eVar);
            bVar.f97032f = dVar;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lit1/c;", "it", "Loq/i0;", "<anonymous>", "(Lit1/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<it1.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97034e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f97034e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(it1.a.c.f96947a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(it1.c cVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(cVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lit1/a$c;", "<unused var>", "Lk10/c0;", "Lit1/c;", "state", "Lk10/l;", "Lit1/h;", "<anonymous>", "(Lit1/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<it1.a.c, k10.c0<it1.c>, tq.e<? super k10.l<? extends it1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97036e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97037f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lit1/h;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends it1.h>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f97039e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ z f97040f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<it1.c> f97041g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<it1.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f97040f = zVar;
                this.f97041g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Y(z zVar, dx.b bVar, it1.c cVar) {
                return new Error(zVar.v9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Presentation Z(BankRestrictionsSettings bankRestrictionsSettings, it1.c cVar) {
                return new Presentation(bankRestrictionsSettings.a());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final it1.g a0(it1.c cVar) {
                return it1.g.f96969a;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f97039e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.h hVar = this.f97040f.getBankRestrictionsSettingsUC;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f97039e = 1;
                    obj = hVar.c(c1792a, this);
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
                k10.c0<it1.c> c0Var = this.f97041g;
                final z zVar = this.f97040f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: it1.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return z.d.a.Y(zVar, bVar, (c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BankRestrictionsSettings bankRestrictionsSettings = (BankRestrictionsSettings) ((dx.i.Right) iVar).b();
                return bankRestrictionsSettings.getIsAdult() ? c0Var.d(new er.l() { // from class: it1.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.d.a.Z(bankRestrictionsSettings, (c) obj2);
                    }
                }) : c0Var.d(new er.l() { // from class: it1.c0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return z.d.a.a0((c) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f97040f, this.f97041g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends it1.h>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f97037f;
            Object objE = uq.b.e();
            int i15 = this.f97036e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, c0Var, null);
            this.f97037f = vq.j.a(c0Var);
            this.f97036e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(it1.a.c cVar, k10.c0<it1.c> c0Var, tq.e<? super k10.l<? extends it1.h>> eVar) {
            d dVar = z.this.new d(eVar);
            dVar.f97037f = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lit1/a$f;", "<unused var>", "Lk10/c0;", "Lit1/f;", "state", "Lk10/l;", "Lit1/h;", "<anonymous>", "(Lit1/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<it1.a.f, k10.c0<Presentation>, tq.e<? super k10.l<? extends it1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97042e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97043f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GetPassportRestriction O(k10.c0 c0Var, Presentation presentation) {
            return new GetPassportRestriction(((Presentation) c0Var.a()).a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f97043f;
            uq.b.e();
            if (this.f97042e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: it1.d0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.e.O(c0Var, (Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(it1.a.f fVar, k10.c0<Presentation> c0Var, tq.e<? super k10.l<? extends it1.h>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f97043f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lit1/e;", "it", "Loq/i0;", "<anonymous>", "(Lit1/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.p<GetPassportRestriction, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97044e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f97044e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(it1.a.b.f96946a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(GetPassportRestriction getPassportRestriction, tq.e<? super oq.i0> eVar) {
            return ((f) v(getPassportRestriction, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return z.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lit1/a$b;", "action", "Lk10/c0;", "Lit1/e;", "state", "Lk10/l;", "Lit1/h;", "<anonymous>", "(Lit1/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<it1.a.b, k10.c0<GetPassportRestriction>, tq.e<? super k10.l<? extends it1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97046e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97047f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<Object>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f97049e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f97050f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f97051g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f97052h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f97053j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f97054k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ z f97055l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<GetPassportRestriction> f97056m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(z zVar, k10.c0<GetPassportRestriction> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f97055l = zVar;
                this.f97056m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(k10.c0 c0Var, z zVar, dx.b bVar, GetPassportRestriction getPassportRestriction) {
                return new Error(((GetPassportRestriction) c0Var.a()).a(), zVar.v9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Presentation Y(k10.c0 c0Var, GetPassportRestriction getPassportRestriction) {
                return new Presentation(((GetPassportRestriction) c0Var.a()).a());
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0097, code lost:
            
                if (r5.F(r2, r9) == r0) goto L29;
             */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x009a, code lost:
            
                r0 = r1;
             */
            /* JADX WARN: Code restructure failed: missing block: B:28:0x00b9, code lost:
            
                if (r5.F(r3, r9) == r0) goto L29;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 204
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: it1.z.g.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f97055l, this.f97056m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<Object>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f97047f;
            Object objE = uq.b.e();
            int i15 = this.f97046e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = z.this.callActionWithLoaderUseCase;
            a aVar2 = new a(z.this, c0Var, null);
            this.f97047f = vq.j.a(c0Var);
            this.f97046e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(it1.a.b bVar, k10.c0<GetPassportRestriction> c0Var, tq.e<? super k10.l<? extends it1.h>> eVar) {
            g gVar = z.this.new g(eVar);
            gVar.f97047f = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lit1/a$a;", "<unused var>", "Lit1/b;", "Loq/i0;", "<anonymous>", "(Lit1/a$a;Lit1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<it1.a.C2266a, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97057e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f97057e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            z.this.d9(it1.a.d.C2267a.f96948a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(it1.a.C2266a c2266a, Error error, tq.e<? super oq.i0> eVar) {
            return z.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lit1/a$e;", "<unused var>", "Lk10/c0;", "Lit1/b;", "state", "Lk10/l;", "Lit1/h;", "<anonymous>", "(Lit1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<it1.a.e, k10.c0<Error>, tq.e<? super k10.l<? extends it1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97059e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97060f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final it1.c O(Error error) {
            return it1.c.f96959a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f97060f;
            uq.b.e();
            if (this.f97059e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: it1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.i.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(it1.a.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends it1.h>> eVar2) {
            i iVar = new i(eVar2);
            iVar.f97060f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lit1/a$a;", "action", "Lk10/c0;", "Lit1/d;", "state", "Lk10/l;", "Lit1/h;", "<anonymous>", "(Lit1/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<it1.a.C2266a, k10.c0<Error>, tq.e<? super k10.l<? extends it1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97061e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97062f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Presentation O(k10.c0 c0Var, Error error) {
            return new Presentation(((Error) c0Var.a()).a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f97062f;
            uq.b.e();
            if (this.f97061e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: it1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.j.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(it1.a.C2266a c2266a, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends it1.h>> eVar) {
            j jVar = new j(eVar);
            jVar.f97062f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lit1/a$e;", "<unused var>", "Lk10/c0;", "Lit1/d;", "state", "Lk10/l;", "Lit1/h;", "<anonymous>", "(Lit1/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<it1.a.e, k10.c0<Error>, tq.e<? super k10.l<? extends it1.h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f97063e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f97064f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final GetPassportRestriction O(k10.c0 c0Var, Error error) {
            return new GetPassportRestriction(((Error) c0Var.a()).a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f97064f;
            uq.b.e();
            if (this.f97063e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: it1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return z.k.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(it1.a.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends it1.h>> eVar2) {
            k kVar = new k(eVar2);
            kVar.f97064f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    public z(yy.a aVar, it1.j jVar, ib4.c cVar, ac4.a aVar2, ml0.h hVar, ml0.q qVar, hb4.d dVar) {
        this.mapper = jVar;
        this.genericDomainErrorHandler = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getBankRestrictionsSettingsUC = hVar;
        this.getPassportsUC = qVar;
        this.errorVMSFactory = dVar;
        it1.c cVar2 = it1.c.f96959a;
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: it1.r
            @Override // er.l
            public final Object b(Object obj) {
                return z.z9(this.f97004a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), x9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(z zVar, k10.z zVar2) {
        b bVar = zVar.new b(null);
        zVar2.x(q0.c(it1.a.d.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new c(null));
        d dVar = zVar.new d(null);
        zVar2.v(q0.c(it1.a.c.class), k10.o.CANCEL_PREVIOUS, dVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(k10.z zVar) {
        e eVar = new e(null);
        zVar.v(q0.c(it1.a.f.class), k10.o.CANCEL_PREVIOUS, eVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(z zVar, k10.z zVar2) {
        zVar2.C(zVar.new f(null));
        g gVar = zVar.new g(null);
        zVar2.v(q0.c(it1.a.b.class), k10.o.CANCEL_PREVIOUS, gVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(z zVar, k10.z zVar2) {
        h hVar = zVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar2.x(q0.c(it1.a.C2266a.class), oVar, hVar);
        zVar2.v(q0.c(it1.a.e.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(it1.a.C2266a.class), oVar, jVar);
        zVar.v(q0.c(it1.a.e.class), oVar, new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c v9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorHandler.b(new ib4.c.Params(domainError, false, new er.l() { // from class: it1.y
            @Override // er.l
            public final Object b(Object obj) {
                return z.w9(this.f97009a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(z zVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                zVar.d9(it1.a.e.f96953a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                zVar.d9(it1.a.C2266a.f96945a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final it1.i.a x9(it1.h state) {
        return this.mapper.b(new it1.j.Params(state, b9(it1.a.d.C2268d.f96950a), b9(it1.a.d.C2267a.f96948a), b9(it1.a.f.f96954a), b9(it1.a.d.c.f96949a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(final z zVar, k10.v vVar) {
        vVar.c(q0.c(it1.h.class), new er.l() { // from class: it1.s
            @Override // er.l
            public final Object b(Object obj) {
                return z.A9(this.f97005a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(it1.c.class), new er.l() { // from class: it1.t
            @Override // er.l
            public final Object b(Object obj) {
                return z.B9(this.f97006a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Presentation.class), new er.l() { // from class: it1.u
            @Override // er.l
            public final Object b(Object obj) {
                return z.C9((k10.z) obj);
            }
        });
        vVar.c(q0.c(GetPassportRestriction.class), new er.l() { // from class: it1.v
            @Override // er.l
            public final Object b(Object obj) {
                return z.D9(this.f97007a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: it1.w
            @Override // er.l
            public final Object b(Object obj) {
                return z.E9(this.f97008a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(Error.class), new er.l() { // from class: it1.x
            @Override // er.l
            public final Object b(Object obj) {
                return z.F9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<it1.a.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<it1.h, it1.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<it1.i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(it1.a.d dVar, tq.e<? super oq.i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(it1.i.a aVar) {
        super.P5(aVar);
    }
}
