package s81;

import cl0.BEPassportChildApplicationOfficeDictionary;
import cl0.PassportChildApplicationVerifyOfficeElectronicDeliveryAddress;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v91.DropDownState;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003BK\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0013H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R&\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003068\u0014X\u0094\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180<8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@R \u0010G\u001a\b\u0012\u0004\u0012\u00020B0A8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F¨\u0006H"}, d2 = {"Ls81/g0;", "Ll00/g;", "Ls81/i;", "", "Ls81/o;", "Lyy/a;", "stateMachineFactory", "Lt81/b;", "mapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lol0/k;", "getPassportOfficesDictionaryUC", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericDomainErrorMapper", "Lol0/l;", "verifyOfficeElectronicDeliveryAddressUC", "Ls81/h;", "setupData", "<init>", "(Lyy/a;Lt81/b;Lac4/a;Lol0/k;Lhb4/d;Lib4/c;Lol0/l;Ls81/h;)V", "state", "Ls81/o$a;", "x9", "(Ls81/i;)Ls81/o$a;", "Ldx/b;", "domainError", "Lhb4/c;", "v9", "(Ldx/b;)Lhb4/c;", "data", "Loq/i0;", "y9", "(Ls81/h;)V", "b", "Lt81/b;", "c", "Lac4/a;", "d", "Lol0/k;", "e", "Lhb4/d;", "f", "Lib4/c;", "g", "Lol0/l;", "h", "Ls81/h;", "Ls81/k;", "j", "Ls81/k;", "initialState", "Lk10/t;", "k", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "l", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Ls81/c;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 extends l00.g<s81.i, Object> implements s81.o, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t81.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ol0.k getPassportOfficesDictionaryUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ol0.l verifyOfficeElectronicDeliveryAddressUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final s81.k initialState;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k10.t<s81.i, Object> stateMachine;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<s81.o.a> state;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<s81.c> navAction;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<s81.o.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f179006a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f179007b;

        /* JADX INFO: renamed from: s81.g0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C4596a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f179008a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g0 f179009b;

            /* JADX INFO: renamed from: s81.g0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C4597a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f179010d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f179011e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f179012f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f179014h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f179015j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f179016k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f179017l;

                public C4597a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f179010d = obj;
                    this.f179011e |= PKIFailureInfo.systemUnavail;
                    return C4596a.this.F(null, this);
                }
            }

            public C4596a(mu.h hVar, g0 g0Var) {
                this.f179008a = hVar;
                this.f179009b = g0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C4597a c4597a;
                if (eVar instanceof C4597a) {
                    c4597a = (C4597a) eVar;
                    int i15 = c4597a.f179011e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c4597a.f179011e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c4597a = new C4597a(eVar);
                    }
                } else {
                    c4597a = new C4597a(eVar);
                }
                Object obj2 = c4597a.f179010d;
                Object objE = uq.b.e();
                int i16 = c4597a.f179011e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f179008a;
                    s81.o.a aVarX9 = this.f179009b.x9((s81.i) obj);
                    c4597a.f179012f = vq.j.a(obj);
                    c4597a.f179014h = vq.j.a(c4597a);
                    c4597a.f179015j = vq.j.a(obj);
                    c4597a.f179016k = vq.j.a(hVar);
                    c4597a.f179017l = 0;
                    c4597a.f179011e = 1;
                    if (hVar.F(aVarX9, c4597a) == objE) {
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

        public a(mu.g gVar, g0 g0Var) {
            this.f179006a = gVar;
            this.f179007b = g0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super s81.o.a> hVar, tq.e eVar) {
            Object objA = this.f179006a.a(new C4596a(hVar, this.f179007b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ls81/k;", "state", "Lk10/l;", "Ls81/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<k10.c0<s81.k>, tq.e<? super k10.l<? extends s81.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179019f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ls81/i;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends s81.i>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f179021e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g0 f179022f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<s81.k> f179023g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, k10.c0<s81.k> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f179022f = g0Var;
                this.f179023g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(g0 g0Var, dx.b bVar, s81.k kVar) {
                return new Error(g0Var.v9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final s81.i.Initialized Y(List list, Integer num, g0 g0Var, s81.k kVar) {
                DropDownState dropDownState = new DropDownState(num, null, 2, null);
                u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionDataY3 = g0Var.setupData.getContract().y3();
                return new s81.i.Initialized(list, dropDownState, childPassportApplicationInstitutionDataY3 != null ? childPassportApplicationInstitutionDataY3.getInstitution() : null, g0Var.setupData.getPassportOfficePlace());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                BEPassportChildApplicationOfficeDictionary institution;
                Object objE = uq.b.e();
                int i15 = this.f179021e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ol0.k kVar = this.f179022f.getPassportOfficesDictionaryUC;
                    ol0.k.Params params = new ol0.k.Params(this.f179022f.setupData.getPassportOfficePlace());
                    this.f179021e = 1;
                    obj = kVar.c(params, this);
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
                k10.c0<s81.k> c0Var = this.f179023g;
                final g0 g0Var = this.f179022f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: s81.h0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return g0.b.a.X(g0Var, bVar, (k) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionDataY3 = g0Var.setupData.getContract().y3();
                final Integer numE = (childPassportApplicationInstitutionDataY3 == null || (institution = childPassportApplicationInstitutionDataY3.getInstitution()) == null) ? null : vq.b.e(list.indexOf(institution));
                return c0Var.d(new er.l() { // from class: s81.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.b.a.Y(list, numE, g0Var, (k) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f179022f, this.f179023g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends s81.i>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f179019f;
            Object objE = uq.b.e();
            int i15 = this.f179018e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = g0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(g0.this, c0Var, null);
            this.f179019f = vq.j.a(c0Var);
            this.f179018e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<s81.k> c0Var, tq.e<? super k10.l<? extends s81.i>> eVar) {
            return ((b) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            b bVar = g0.this.new b(eVar);
            bVar.f179019f = obj;
            return bVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls81/b;", "<unused var>", "Ls81/k;", "Loq/i0;", "<anonymous>", "(Ls81/b;Ls81/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<s81.b, s81.k, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179024e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179024e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.d dVar = s81.c.d.f178985a;
                this.f179024e = 1;
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
        public final Object w(s81.b bVar, s81.k kVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new c(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls81/a;", "<unused var>", "Ls81/k;", "Loq/i0;", "<anonymous>", "(Ls81/a;Ls81/k;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<s81.a, s81.k, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179026e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179026e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.a aVar = s81.c.a.f178982a;
                this.f179026e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(s81.a aVar, s81.k kVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new d(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls81/e;", "<unused var>", "Lk10/c0;", "Ls81/j;", "state", "Lk10/l;", "Ls81/i;", "<anonymous>", "(Ls81/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<s81.e, k10.c0<Error>, tq.e<? super k10.l<? extends s81.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179028e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179029f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s81.k O(Error error) {
            return s81.k.f179083a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f179029f;
            uq.b.e();
            if (this.f179028e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: s81.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.e.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s81.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends s81.i>> eVar2) {
            e eVar3 = new e(eVar2);
            eVar3.f179029f = c0Var;
            return eVar3.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls81/b;", "<unused var>", "Ls81/j;", "Loq/i0;", "<anonymous>", "(Ls81/b;Ls81/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<s81.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179030e;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179030e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.a aVar = s81.c.a.f178982a;
                this.f179030e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(s81.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return g0.this.new f(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ls81/g;", "<unused var>", "Ls81/i$b;", "state", "Loq/i0;", "<anonymous>", "(Ls81/g;Ls81/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<s81.g, s81.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179033f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            s81.i.Initialized initialized = (s81.i.Initialized) this.f179033f;
            Object objE = uq.b.e();
            int i15 = this.f179032e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.ToInstitutionPicker toInstitutionPicker = new s81.c.ToInstitutionPicker(initialized.d());
                this.f179033f = vq.j.a(initialized);
                this.f179032e = 1;
                if (bVarY1.F(toInstitutionPicker, this) == objE) {
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
        public final Object w(s81.g gVar, s81.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            g gVar2 = g0.this.new g(eVar);
            gVar2.f179033f = initialized;
            return gVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls81/d;", "<unused var>", "Lk10/c0;", "Ls81/i$b;", "state", "Lk10/l;", "Ls81/i;", "<anonymous>", "(Ls81/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<s81.d, k10.c0<s81.i.Initialized>, tq.e<? super k10.l<? extends s81.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179036f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Verifying X(String str, k10.c0 c0Var, s81.i.Initialized initialized) {
            return new Verifying(str, ((s81.i.Initialized) c0Var.a()).d(), ((s81.i.Initialized) c0Var.a()).getDropDownState(), ((s81.i.Initialized) c0Var.a()).getSelectedOffice(), ((s81.i.Initialized) c0Var.a()).getPassportOfficePlace());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s81.i.Error Y(g0 g0Var, s81.i.Initialized initialized) {
            return new s81.i.Error(g0Var.v9(new dx.b.Generic(null, 1, null)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s81.i.Initialized Z(s81.i.Initialized initialized) {
            return s81.i.Initialized.b(initialized, null, new DropDownState(null, new hz.b.Invalid(null, 1, null), 1, null), null, null, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final String unitCode;
            k10.l lVarD;
            final k10.c0 c0Var = (k10.c0) this.f179036f;
            uq.b.e();
            if (this.f179035e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (((s81.i.Initialized) c0Var.a()).getSelectedOffice() == null) {
                return c0Var.b(new er.l() { // from class: s81.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.h.Z((i.Initialized) obj2);
                    }
                });
            }
            BEPassportChildApplicationOfficeDictionary selectedOffice = ((s81.i.Initialized) c0Var.a()).getSelectedOffice();
            if (selectedOffice != null && (unitCode = selectedOffice.getUnitCode()) != null && (lVarD = c0Var.d(new er.l() { // from class: s81.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.h.X(unitCode, c0Var, (i.Initialized) obj2);
                }
            })) != null) {
                return lVarD;
            }
            final g0 g0Var = g0.this;
            return c0Var.d(new er.l() { // from class: s81.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.h.Y(g0Var, (i.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(s81.d dVar, k10.c0<s81.i.Initialized> c0Var, tq.e<? super k10.l<? extends s81.i>> eVar) {
            h hVar = g0.this.new h(eVar);
            hVar.f179036f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls81/f;", "<unused var>", "Lk10/c0;", "Ls81/i$b;", "state", "Lk10/l;", "Ls81/i;", "<anonymous>", "(Ls81/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<s81.f, k10.c0<s81.i.Initialized>, tq.e<? super k10.l<? extends s81.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179039f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s81.i.Initialized O(g0 g0Var, k10.c0 c0Var, s81.i.Initialized initialized) {
            BEPassportChildApplicationOfficeDictionary institution;
            u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionDataY3 = g0Var.setupData.getContract().y3();
            DropDownState dropDownState = new DropDownState((childPassportApplicationInstitutionDataY3 == null || (institution = childPassportApplicationInstitutionDataY3.getInstitution()) == null) ? null : Integer.valueOf(((s81.i.Initialized) c0Var.a()).d().indexOf(institution)), null, 2, null);
            u81.a.ChildPassportApplicationInstitutionData childPassportApplicationInstitutionDataY4 = g0Var.setupData.getContract().y3();
            return s81.i.Initialized.b(initialized, null, dropDownState, childPassportApplicationInstitutionDataY4 != null ? childPassportApplicationInstitutionDataY4.getInstitution() : null, null, 9, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f179039f;
            uq.b.e();
            if (this.f179038e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final g0 g0Var = g0.this;
            return c0Var.b(new er.l() { // from class: s81.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.i.O(g0Var, c0Var, (i.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s81.f fVar, k10.c0<s81.i.Initialized> c0Var, tq.e<? super k10.l<? extends s81.i>> eVar) {
            i iVar = g0.this.new i(eVar);
            iVar.f179039f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls81/b;", "<unused var>", "Ls81/i$b;", "Loq/i0;", "<anonymous>", "(Ls81/b;Ls81/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<s81.b, s81.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179041e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179041e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.d dVar = s81.c.d.f178985a;
                this.f179041e = 1;
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
        public final Object w(s81.b bVar, s81.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return g0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls81/a;", "<unused var>", "Ls81/i$b;", "Loq/i0;", "<anonymous>", "(Ls81/a;Ls81/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<s81.a, s81.i.Initialized, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179043e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179043e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.a aVar = s81.c.a.f178982a;
                this.f179043e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(s81.a aVar, s81.i.Initialized initialized, tq.e<? super oq.i0> eVar) {
            return g0.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ls81/n;", "state", "Lk10/l;", "Ls81/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.p<k10.c0<Verifying>, tq.e<? super k10.l<? extends s81.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179046f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ls81/i;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends s81.i>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f179048e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f179049f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f179050g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f179051h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f179052j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f179053k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ g0 f179054l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ k10.c0<Verifying> f179055m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g0 g0Var, k10.c0<Verifying> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f179054l = g0Var;
                this.f179055m = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error Y(g0 g0Var, dx.b bVar, k10.c0 c0Var, Verifying verifying) {
                return new Error(g0Var.v9(bVar), ((Verifying) c0Var.a()).getRecipientOfficeUnitCode(), ((Verifying) c0Var.a()).b(), ((Verifying) c0Var.a()).getDropDownState(), ((Verifying) c0Var.a()).getSelectedOffice(), ((Verifying) c0Var.a()).getPassportOfficePlace());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final s81.i.Initialized Z(k10.c0 c0Var, Verifying verifying) {
                return new s81.i.Initialized(((Verifying) c0Var.a()).b(), ((Verifying) c0Var.a()).getDropDownState(), ((Verifying) c0Var.a()).getSelectedOffice(), ((Verifying) c0Var.a()).getPassportOfficePlace());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final NoErrorAddress a0(k10.c0 c0Var, Verifying verifying) {
                return new NoErrorAddress(((Verifying) c0Var.a()).getRecipientOfficeUnitCode(), ((Verifying) c0Var.a()).b(), ((Verifying) c0Var.a()).getDropDownState(), ((Verifying) c0Var.a()).getSelectedOffice(), ((Verifying) c0Var.a()).getPassportOfficePlace());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final k10.c0<Verifying> c0Var;
                Object objE = uq.b.e();
                int i15 = this.f179053k;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ol0.l lVar = this.f179054l.verifyOfficeElectronicDeliveryAddressUC;
                    ol0.l.Params params = new ol0.l.Params(this.f179055m.a().getRecipientOfficeUnitCode());
                    this.f179053k = 1;
                    obj = lVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i15 == 1) {
                    oq.u.b(obj);
                } else {
                    if (i15 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    c0Var = (k10.c0) this.f179049f;
                    oq.u.b(obj);
                }
                return c0Var.d(new er.l() { // from class: s81.p0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.l.a.Z(c0Var, (Verifying) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                final k10.c0<Verifying> c0Var2 = this.f179055m;
                final g0 g0Var = this.f179054l;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: s81.o0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return g0.l.a.Y(g0Var, bVar, c0Var2, (Verifying) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                PassportChildApplicationVerifyOfficeElectronicDeliveryAddress passportChildApplicationVerifyOfficeElectronicDeliveryAddress = (PassportChildApplicationVerifyOfficeElectronicDeliveryAddress) ((dx.i.Right) iVar).b();
                if (!passportChildApplicationVerifyOfficeElectronicDeliveryAddress.getHasElectronicDeliveryAddress()) {
                    return c0Var2.d(new er.l() { // from class: s81.q0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return g0.l.a.a0(c0Var2, (Verifying) obj2);
                        }
                    });
                }
                xw.b<s81.c> bVarY1 = g0Var.Y1();
                s81.c.C4595c c4595c = s81.c.C4595c.f178984a;
                this.f179048e = vq.j.a(iVar);
                this.f179049f = c0Var2;
                this.f179050g = vq.j.a(passportChildApplicationVerifyOfficeElectronicDeliveryAddress);
                this.f179051h = 0;
                this.f179052j = 0;
                this.f179053k = 2;
                if (bVarY1.F(c4595c, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.d(new er.l() { // from class: s81.p0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return g0.l.a.Z(c0Var, (Verifying) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f179054l, this.f179055m, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends s81.i>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f179046f;
            Object objE = uq.b.e();
            int i15 = this.f179045e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = g0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(g0.this, c0Var, null);
            this.f179046f = vq.j.a(c0Var);
            this.f179045e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Verifying> c0Var, tq.e<? super k10.l<? extends s81.i>> eVar) {
            return ((l) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            l lVar = g0.this.new l(eVar);
            lVar.f179046f = obj;
            return lVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls81/b;", "<unused var>", "Ls81/n;", "Loq/i0;", "<anonymous>", "(Ls81/b;Ls81/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<s81.b, Verifying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179056e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179056e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.d dVar = s81.c.d.f178985a;
                this.f179056e = 1;
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
        public final Object w(s81.b bVar, Verifying verifying, tq.e<? super oq.i0> eVar) {
            return g0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls81/a;", "<unused var>", "Ls81/n;", "Loq/i0;", "<anonymous>", "(Ls81/a;Ls81/n;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<s81.a, Verifying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179058e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179058e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.a aVar = s81.c.a.f178982a;
                this.f179058e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(s81.a aVar, Verifying verifying, tq.e<? super oq.i0> eVar) {
            return g0.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls81/e;", "<unused var>", "Lk10/c0;", "Ls81/l;", "state", "Lk10/l;", "Ls81/i;", "<anonymous>", "(Ls81/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<s81.e, k10.c0<Error>, tq.e<? super k10.l<? extends s81.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179060e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179061f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Verifying O(k10.c0 c0Var, Error error) {
            return new Verifying(((Error) c0Var.a()).getRecipientOfficeUnitCode(), ((Error) c0Var.a()).c(), ((Error) c0Var.a()).getDropDownState(), ((Error) c0Var.a()).getSelectedOffice(), ((Error) c0Var.a()).getPassportOfficePlace());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f179061f;
            uq.b.e();
            if (this.f179060e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: s81.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.o.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s81.e eVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends s81.i>> eVar2) {
            o oVar = new o(eVar2);
            oVar.f179061f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls81/b;", "<unused var>", "Lk10/c0;", "Ls81/l;", "state", "Lk10/l;", "Ls81/i;", "<anonymous>", "(Ls81/b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<s81.b, k10.c0<Error>, tq.e<? super k10.l<? extends s81.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179062e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179063f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s81.i.Initialized O(k10.c0 c0Var, Error error) {
            return new s81.i.Initialized(((Error) c0Var.a()).c(), ((Error) c0Var.a()).getDropDownState(), ((Error) c0Var.a()).getSelectedOffice(), ((Error) c0Var.a()).getPassportOfficePlace());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f179063f;
            uq.b.e();
            if (this.f179062e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: s81.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.p.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s81.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends s81.i>> eVar) {
            p pVar = new p(eVar);
            pVar.f179063f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls81/b;", "<unused var>", "Ls81/m;", "Loq/i0;", "<anonymous>", "(Ls81/b;Ls81/m;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<s81.b, NoErrorAddress, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179064e;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179064e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.b bVar = s81.c.b.f178983a;
                this.f179064e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(s81.b bVar, NoErrorAddress noErrorAddress, tq.e<? super oq.i0> eVar) {
            return g0.this.new q(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ls81/a;", "<unused var>", "Lk10/c0;", "Ls81/m;", "state", "Lk10/l;", "Ls81/i;", "<anonymous>", "(Ls81/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<s81.a, k10.c0<NoErrorAddress>, tq.e<? super k10.l<? extends s81.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179066e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f179067f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final s81.i.Initialized O(k10.c0 c0Var, NoErrorAddress noErrorAddress) {
            return new s81.i.Initialized(((NoErrorAddress) c0Var.a()).b(), ((NoErrorAddress) c0Var.a()).getDropDownState(), ((NoErrorAddress) c0Var.a()).getSelectedOffice(), ((NoErrorAddress) c0Var.a()).getPassportOfficePlace());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f179067f;
            uq.b.e();
            if (this.f179066e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: s81.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return g0.r.O(c0Var, (NoErrorAddress) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(s81.a aVar, k10.c0<NoErrorAddress> c0Var, tq.e<? super k10.l<? extends s81.i>> eVar) {
            r rVar = new r(eVar);
            rVar.f179067f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls81/b;", "<unused var>", "Ls81/i$a;", "Loq/i0;", "<anonymous>", "(Ls81/b;Ls81/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<s81.b, s81.i.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f179068e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f179068e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<s81.c> bVarY1 = g0.this.Y1();
                s81.c.a aVar = s81.c.a.f178982a;
                this.f179068e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(s81.b bVar, s81.i.Error error, tq.e<? super oq.i0> eVar) {
            return g0.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    public g0(yy.a aVar, t81.b bVar, ac4.a aVar2, ol0.k kVar, hb4.d dVar, ib4.c cVar, ol0.l lVar, SetupData setupData) {
        this.mapper = bVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getPassportOfficesDictionaryUC = kVar;
        this.errorVMSFactory = dVar;
        this.genericDomainErrorMapper = cVar;
        this.verifyOfficeElectronicDeliveryAddressUC = lVar;
        this.setupData = setupData;
        s81.k kVar2 = s81.k.f179083a;
        this.initialState = kVar2;
        this.stateMachine = aVar.a(kVar2, new er.l() { // from class: s81.f0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.z9(this.f178993a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), x9(kVar2));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(g0 g0Var, k10.z zVar) {
        zVar.A(g0Var.new b(null));
        c cVar = g0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(s81.b.class), oVar, cVar);
        zVar.x(fr.q0.c(s81.a.class), oVar, g0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B9(g0 g0Var, k10.z zVar) {
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(s81.e.class), oVar, eVar);
        zVar.x(fr.q0.c(s81.b.class), oVar, g0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C9(g0 g0Var, k10.z zVar) {
        g gVar = g0Var.new g(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(s81.g.class), oVar, gVar);
        zVar.v(fr.q0.c(s81.d.class), oVar, g0Var.new h(null));
        zVar.v(fr.q0.c(s81.f.class), oVar, g0Var.new i(null));
        zVar.x(fr.q0.c(s81.b.class), oVar, g0Var.new j(null));
        zVar.x(fr.q0.c(s81.a.class), oVar, g0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D9(g0 g0Var, k10.z zVar) {
        zVar.A(g0Var.new l(null));
        m mVar = g0Var.new m(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(s81.b.class), oVar, mVar);
        zVar.x(fr.q0.c(s81.a.class), oVar, g0Var.new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(k10.z zVar) {
        o oVar = new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(s81.e.class), oVar2, oVar);
        zVar.v(fr.q0.c(s81.b.class), oVar2, new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(g0 g0Var, k10.z zVar) {
        q qVar = g0Var.new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(s81.b.class), oVar, qVar);
        zVar.v(fr.q0.c(s81.a.class), oVar, new r(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(g0 g0Var, k10.z zVar) {
        s sVar = g0Var.new s(null);
        zVar.x(fr.q0.c(s81.b.class), k10.o.CANCEL_PREVIOUS, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c v9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: s81.e0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.w9(this.f178991a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(g0 g0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                g0Var.d9(s81.e.f178990a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                g0Var.d9(s81.b.f178981a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final s81.o.a x9(s81.i state) {
        return this.mapper.b(new t81.b.Params(state, b9(s81.a.f178979a), b9(s81.b.f178981a), b9(s81.d.f178988a), b9(s81.g.f178994a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(final g0 g0Var, k10.v vVar) {
        vVar.c(fr.q0.c(s81.k.class), new er.l() { // from class: s81.x
            @Override // er.l
            public final Object b(Object obj) {
                return g0.A9(this.f179141a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: s81.y
            @Override // er.l
            public final Object b(Object obj) {
                return g0.B9(this.f179142a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s81.i.Initialized.class), new er.l() { // from class: s81.z
            @Override // er.l
            public final Object b(Object obj) {
                return g0.C9(this.f179145a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Verifying.class), new er.l() { // from class: s81.a0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.D9(this.f178980a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: s81.b0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.E9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(NoErrorAddress.class), new er.l() { // from class: s81.c0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.F9(this.f178987a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(s81.i.Error.class), new er.l() { // from class: s81.d0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.G9(this.f178989a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    @Override // zx.b
    public xw.b<s81.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<s81.i, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<s81.o.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public void P5(SetupData data) {
        d9(s81.f.f178992a);
    }
}
