package mp2;

import al0.PassportChildAgreementGetChildData;
import al0.PassportChildApplicationChildData;
import fr.q0;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005BS\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\b\b\u0001\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J!\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u0002H\u0002¢\u0006\u0004\b\"\u0010#R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R \u0010>\u001a\b\u0012\u0004\u0012\u000209088\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R&\u0010D\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030?8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010CR \u0010 \u001a\b\u0012\u0004\u0012\u00020!0E8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I¨\u0006J"}, d2 = {"Lmp2/u;", "Ll00/g;", "Lmp2/d;", "Lmp2/c;", "Lmp2/e;", "", "Lyy/a;", "stateMachineFactory", "Lnp2/a;", "mapper", "La14/w;", "openUrlIntentUseCase", "Lep2/f;", "checkIsPlaceOfBirthCorrectUC", "Lml0/w;", "passportChildApplicationAgreementUC", "Lib4/c;", "genericErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Lop2/a;", "dataContract", "<init>", "(Lyy/a;Lnp2/a;La14/w;Lep2/f;Lml0/w;Lib4/c;Lac4/a;Lhb4/d;Lop2/a;)V", "Ldx/b;", "domainError", "retryAction", "Lhb4/c;", "x9", "(Ldx/b;Lmp2/c;)Lhb4/c;", "state", "Lmp2/e$a;", "z9", "(Lmp2/d;)Lmp2/e$a;", "b", "Lnp2/a;", "c", "La14/w;", "d", "Lep2/f;", "e", "Lml0/w;", "f", "Lib4/c;", "g", "Lac4/a;", "h", "Lhb4/d;", "j", "Lop2/a;", "Lmp2/d$c;", "k", "Lmp2/d$c;", "initialState", "Lxw/b;", "Lmp2/c$e;", "l", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class u extends l00.g<mp2.d, mp2.c> implements mp2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final np2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ep2.f checkIsPlaceOfBirthCorrectUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ml0.w passportChildApplicationAgreementUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final op2.a dataContract;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mp2.d.c initialState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final xw.b<mp2.c.e> navAction;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k10.t<mp2.d, mp2.c> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<mp2.e.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<mp2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f127549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u f127550b;

        /* JADX INFO: renamed from: mp2.u$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3153a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f127551a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ u f127552b;

            /* JADX INFO: renamed from: mp2.u$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3154a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f127553d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f127554e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f127555f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f127557h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f127558j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f127559k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f127560l;

                public C3154a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f127553d = obj;
                    this.f127554e |= PKIFailureInfo.systemUnavail;
                    return C3153a.this.F(null, this);
                }
            }

            public C3153a(mu.h hVar, u uVar) {
                this.f127551a = hVar;
                this.f127552b = uVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3154a c3154a;
                if (eVar instanceof C3154a) {
                    c3154a = (C3154a) eVar;
                    int i15 = c3154a.f127554e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3154a.f127554e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3154a = new C3154a(eVar);
                    }
                } else {
                    c3154a = new C3154a(eVar);
                }
                Object obj2 = c3154a.f127553d;
                Object objE = uq.b.e();
                int i16 = c3154a.f127554e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f127551a;
                    mp2.e.a aVarZ9 = this.f127552b.z9((mp2.d) obj);
                    c3154a.f127555f = vq.j.a(obj);
                    c3154a.f127557h = vq.j.a(c3154a);
                    c3154a.f127558j = vq.j.a(obj);
                    c3154a.f127559k = vq.j.a(hVar);
                    c3154a.f127560l = 0;
                    c3154a.f127554e = 1;
                    if (hVar.F(aVarZ9, c3154a) == objE) {
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

        public a(mu.g gVar, u uVar) {
            this.f127549a = gVar;
            this.f127550b = uVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super mp2.e.a> hVar, tq.e eVar) {
            Object objA = this.f127549a.a(new C3153a(hVar, this.f127550b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmp2/c$c;", "<unused var>", "Lmp2/d;", "Loq/i0;", "<anonymous>", "(Lmp2/c$c;Lmp2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<mp2.c.C3149c, mp2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127561e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127561e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                mp2.c.e.b bVar = mp2.c.e.b.f127490a;
                this.f127561e = 1;
                if (uVar.F(bVar, this) == objE) {
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
        public final Object w(mp2.c.C3149c c3149c, mp2.d dVar, tq.e<? super i0> eVar) {
            return u.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmp2/c$e$c;", "<unused var>", "Lmp2/d;", "Loq/i0;", "<anonymous>", "(Lmp2/c$e$c;Lmp2/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<mp2.c.e.C3150c, mp2.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127563e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127563e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                mp2.c.e.C3150c c3150c = mp2.c.e.C3150c.f127491a;
                this.f127563e = 1;
                if (uVar.F(c3150c, this) == objE) {
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
        public final Object w(mp2.c.e.C3150c c3150c, mp2.d dVar, tq.e<? super i0> eVar) {
            return u.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lmp2/d$c;", "it", "Loq/i0;", "<anonymous>", "(Lmp2/d$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<mp2.d.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127565e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f127565e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u.this.d9(mp2.c.d.f127488a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mp2.d.c cVar, tq.e<? super i0> eVar) {
            return ((d) v(cVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return u.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmp2/c$d;", "<unused var>", "Lk10/c0;", "Lmp2/d$c;", "state", "Lk10/l;", "Lmp2/d;", "<anonymous>", "(Lmp2/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<mp2.c.d, k10.c0<mp2.d.c>, tq.e<? super k10.l<? extends mp2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127567e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f127568f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f127569g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f127570h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lmp2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends mp2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f127572e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ u f127573f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ op2.a.ChildDataSetupData f127574g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<mp2.d.c> f127575h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(u uVar, op2.a.ChildDataSetupData childDataSetupData, k10.c0<mp2.d.c> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f127573f = uVar;
                this.f127574g = childDataSetupData;
                this.f127575h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mp2.d.Error Z(u uVar, dx.b bVar, mp2.d.c cVar) {
                return new mp2.d.Error(uVar.x9(bVar, mp2.c.d.f127488a));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mp2.d.a a0(mp2.d.c cVar) {
                return mp2.d.a.f127496a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mp2.d.Initialized b0(PassportChildApplicationChildData passportChildApplicationChildData, op2.a.ChildDataSetupData childDataSetupData, mp2.d.c cVar) {
                iy.b0 birthPlaceInput;
                op2.a.ChildDataSetupFormData childDataSetupFormData = childDataSetupData.getChildDataSetupFormData();
                return new mp2.d.Initialized(passportChildApplicationChildData, (childDataSetupFormData == null || (birthPlaceInput = childDataSetupFormData.getBirthPlaceInput()) == null) ? null : iy.c0.e(birthPlaceInput), hz.b.C2039b.f86846c);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final mp2.d.Error c0(u uVar, mp2.d.c cVar) {
                return new mp2.d.Error(uVar.x9(new dx.b.Generic(null, 1, null), null));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objD;
                Object objE = uq.b.e();
                int i15 = this.f127572e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ml0.w wVar = this.f127573f.passportChildApplicationAgreementUC;
                    ml0.w.Params params = new ml0.w.Params(this.f127574g.getPassportType(), this.f127574g.getChildId());
                    this.f127572e = 1;
                    obj = wVar.c(params, this);
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
                k10.c0<mp2.d.c> c0Var = this.f127575h;
                final u uVar = this.f127573f;
                final op2.a.ChildDataSetupData childDataSetupData = this.f127574g;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: mp2.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.e.a.Z(uVar, bVar, (d.c) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                PassportChildAgreementGetChildData passportChildAgreementGetChildData = (PassportChildAgreementGetChildData) ((dx.i.Right) iVar).b();
                if (passportChildAgreementGetChildData.getAgreementAlreadyExists()) {
                    return c0Var.d(new er.l() { // from class: mp2.x
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return u.e.a.a0((d.c) obj2);
                        }
                    });
                }
                final PassportChildApplicationChildData childData = passportChildAgreementGetChildData.getChildData();
                return (childData == null || (objD = c0Var.d(new er.l() { // from class: mp2.y
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.e.a.b0(childData, childDataSetupData, (d.c) obj2);
                    }
                })) == null) ? c0Var.d(new er.l() { // from class: mp2.z
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.e.a.c0(uVar, (d.c) obj2);
                    }
                }) : objD;
            }

            public final tq.e<i0> X(tq.e<?> eVar) {
                return new a(this.f127573f, this.f127574g, this.f127575h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends mp2.d>> eVar) {
                return ((a) X(eVar)).J(i0.f148189a);
            }
        }

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mp2.d.Error O(u uVar, mp2.d.c cVar) {
            return new mp2.d.Error(uVar.x9(new dx.b.Generic(null, 1, null), null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            e eVar;
            k10.c0 c0Var = (k10.c0) this.f127570h;
            Object objE = uq.b.e();
            int i15 = this.f127569g;
            if (i15 == 0) {
                oq.u.b(obj);
                op2.a.ChildDataSetupData childDataSetupDataA2 = u.this.dataContract.a2();
                if (childDataSetupDataA2 != null) {
                    u uVar = u.this;
                    ac4.a aVar = uVar.callActionWithLoaderUseCase;
                    a aVar2 = new a(uVar, childDataSetupDataA2, c0Var, null);
                    this.f127570h = c0Var;
                    this.f127567e = vq.j.a(childDataSetupDataA2);
                    this.f127568f = 0;
                    this.f127569g = 1;
                    eVar = this;
                    obj = ac4.a.a(aVar, null, aVar2, eVar, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    eVar = this;
                }
                final u uVar2 = u.this;
                return c0Var.d(new er.l() { // from class: mp2.v
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.e.O(uVar2, (d.c) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            eVar = this;
            k10.l lVar = (k10.l) obj;
            if (lVar != null) {
                return lVar;
            }
            final u uVar3 = u.this;
            return c0Var.d(new er.l() { // from class: mp2.v
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.e.O(uVar3, (d.c) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mp2.c.d dVar, k10.c0<mp2.d.c> c0Var, tq.e<? super k10.l<? extends mp2.d>> eVar) {
            e eVar2 = u.this.new e(eVar);
            eVar2.f127570h = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmp2/c$b;", "action", "Lk10/c0;", "Lmp2/d$d;", "state", "Lk10/l;", "Lmp2/d;", "<anonymous>", "(Lmp2/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<mp2.c.BirthPlaceInputChanged, k10.c0<mp2.d.Initialized>, tq.e<? super k10.l<? extends mp2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127576e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127577f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f127578g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mp2.d.Initialized O(mp2.c.BirthPlaceInputChanged birthPlaceInputChanged, mp2.d.Initialized initialized) {
            return mp2.d.Initialized.b(initialized, null, birthPlaceInputChanged.getValue(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final mp2.c.BirthPlaceInputChanged birthPlaceInputChanged = (mp2.c.BirthPlaceInputChanged) this.f127577f;
            k10.c0 c0Var = (k10.c0) this.f127578g;
            uq.b.e();
            if (this.f127576e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: mp2.a0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.f.O(birthPlaceInputChanged, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mp2.c.BirthPlaceInputChanged birthPlaceInputChanged, k10.c0<mp2.d.Initialized> c0Var, tq.e<? super k10.l<? extends mp2.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f127577f = birthPlaceInputChanged;
            fVar.f127578g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmp2/c$g;", "action", "Lmp2/d$d;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lmp2/c$g;Lmp2/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<mp2.c.OpenUrl, mp2.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127579e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127580f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mp2.c.OpenUrl openUrl = (mp2.c.OpenUrl) this.f127580f;
            Object objE = uq.b.e();
            int i15 = this.f127579e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = u.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f127580f = vq.j.a(openUrl);
                this.f127579e = 1;
                if (wVar.c(params, this) == objE) {
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
        public final Object w(mp2.c.OpenUrl openUrl, mp2.d.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = u.this.new g(eVar);
            gVar.f127580f = openUrl;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmp2/c$f;", "<unused var>", "Lk10/c0;", "Lmp2/d$d;", "state", "Lk10/l;", "Lmp2/d;", "<anonymous>", "(Lmp2/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<mp2.c.f, k10.c0<mp2.d.Initialized>, tq.e<? super k10.l<? extends mp2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127582e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f127583f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f127584g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mp2.d.Initialized O(hz.b bVar, mp2.d.Initialized initialized) {
            return mp2.d.Initialized.b(initialized, null, null, bVar, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hz.b bVarA;
            hz.b bVar;
            char[] data;
            k10.c0 c0Var = (k10.c0) this.f127584g;
            Object objE = uq.b.e();
            int i15 = this.f127583f;
            if (i15 == 0) {
                oq.u.b(obj);
                ep2.f fVar = u.this.checkIsPlaceOfBirthCorrectUC;
                String birthPlaceInput = ((mp2.d.Initialized) c0Var.a()).getBirthPlaceInput();
                if (birthPlaceInput == null) {
                    birthPlaceInput = "";
                }
                hz.g gVarE = fVar.e(new ep2.f.Params(birthPlaceInput));
                iy.b0 placeOfBirth = ((mp2.d.Initialized) c0Var.a()).getChildData().getPlaceOfBirth();
                String string = (placeOfBirth == null || (data = placeOfBirth.getData()) == null) ? null : data.toString();
                if (string != null && !fu.r.t0(string)) {
                    gVarE = null;
                }
                if (gVarE == null || (bVarA = hz.b.INSTANCE.a(gVarE)) == null) {
                    bVarA = hz.b.d.f86848c;
                }
                if (fr.t.c(bVarA, hz.b.d.f86848c)) {
                    op2.a aVar = u.this.dataContract;
                    PassportChildApplicationChildData childData = ((mp2.d.Initialized) c0Var.a()).getChildData();
                    eq2.b bVar2 = eq2.b.PICKER;
                    iy.b0 firstName = childData.getFirstName();
                    iy.b0 secondName = childData.getSecondName();
                    iy.b0 anotherNames = childData.getAnotherNames();
                    iy.b0 surname = childData.getSurname();
                    iy.b0 pesel = childData.getPesel();
                    fz.b.LocalDate dateOfBirth = childData.getDateOfBirth();
                    iy.b0 placeOfBirth2 = childData.getPlaceOfBirth();
                    if (placeOfBirth2 == null) {
                        String birthPlaceInput2 = ((mp2.d.Initialized) c0Var.a()).getBirthPlaceInput();
                        iy.b0 b0VarG = birthPlaceInput2 != null ? iy.c0.g(birthPlaceInput2) : null;
                        if (b0VarG == null) {
                            throw new IllegalStateException("This field cannot be null");
                        }
                        placeOfBirth2 = b0VarG;
                    }
                    aVar.g5(new eq2.a(bVar2, firstName, secondName, anotherNames, surname, pesel, dateOfBirth, placeOfBirth2, childData.getChecksum(), null));
                    u uVar = u.this;
                    mp2.c.e.d dVar = mp2.c.e.d.f127492a;
                    this.f127584g = c0Var;
                    this.f127582e = bVarA;
                    this.f127583f = 1;
                    if (uVar.F(dVar, this) == objE) {
                        return objE;
                    }
                    bVar = bVarA;
                }
                return c0Var.b(new er.l() { // from class: mp2.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return u.h.O(bVarA, (d.Initialized) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (hz.b) this.f127582e;
            oq.u.b(obj);
            bVarA = bVar;
            return c0Var.b(new er.l() { // from class: mp2.b0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.h.O(bVarA, (d.Initialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mp2.c.f fVar, k10.c0<mp2.d.Initialized> c0Var, tq.e<? super k10.l<? extends mp2.d>> eVar) {
            h hVar = u.this.new h(eVar);
            hVar.f127584g = c0Var;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lmp2/c$a;", "<unused var>", "Lmp2/d$d;", "state", "Loq/i0;", "<anonymous>", "(Lmp2/c$a;Lmp2/d$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<mp2.c.a, mp2.d.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127586e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127587f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mp2.d.Initialized initialized = (mp2.d.Initialized) this.f127587f;
            Object objE = uq.b.e();
            int i15 = this.f127586e;
            if (i15 == 0) {
                oq.u.b(obj);
                op2.a aVar = u.this.dataContract;
                PassportChildApplicationChildData childData = initialized.getChildData();
                String birthPlaceInput = initialized.getBirthPlaceInput();
                aVar.U5(new op2.a.ChildDataSetupFormData(childData, birthPlaceInput != null ? iy.c0.g(birthPlaceInput) : null));
                u uVar = u.this;
                mp2.c.e.a aVar2 = mp2.c.e.a.f127489a;
                this.f127587f = vq.j.a(initialized);
                this.f127586e = 1;
                if (uVar.F(aVar2, this) == objE) {
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
        public final Object w(mp2.c.a aVar, mp2.d.Initialized initialized, tq.e<? super i0> eVar) {
            i iVar = u.this.new i(eVar);
            iVar.f127587f = initialized;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lmp2/c$h;", "<unused var>", "Lk10/c0;", "Lmp2/d$b;", "state", "Lk10/l;", "Lmp2/d;", "<anonymous>", "(Lmp2/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<mp2.c.h, k10.c0<mp2.d.Error>, tq.e<? super k10.l<? extends mp2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127589e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f127590f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final mp2.d.c O(mp2.d.Error error) {
            return mp2.d.c.f127498a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f127590f;
            uq.b.e();
            if (this.f127589e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: mp2.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.j.O((d.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(mp2.c.h hVar, k10.c0<mp2.d.Error> c0Var, tq.e<? super k10.l<? extends mp2.d>> eVar) {
            j jVar = new j(eVar);
            jVar.f127590f = c0Var;
            return jVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lmp2/c$a;", "<unused var>", "Lmp2/d$b;", "Loq/i0;", "<anonymous>", "(Lmp2/c$a;Lmp2/d$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<mp2.c.a, mp2.d.Error, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f127591e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f127591e;
            if (i15 == 0) {
                oq.u.b(obj);
                u uVar = u.this;
                mp2.c.e.a aVar = mp2.c.e.a.f127489a;
                this.f127591e = 1;
                if (uVar.F(aVar, this) == objE) {
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
        public final Object w(mp2.c.a aVar, mp2.d.Error error, tq.e<? super i0> eVar) {
            return u.this.new k(eVar).J(i0.f148189a);
        }
    }

    public u(yy.a aVar, np2.a aVar2, a14.w wVar, ep2.f fVar, ml0.w wVar2, ib4.c cVar, ac4.a aVar3, hb4.d dVar, op2.a aVar4) {
        this.mapper = aVar2;
        this.openUrlIntentUseCase = wVar;
        this.checkIsPlaceOfBirthCorrectUC = fVar;
        this.passportChildApplicationAgreementUC = wVar2;
        this.genericErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.errorVMSFactory = dVar;
        this.dataContract = aVar4;
        mp2.d.c cVar2 = mp2.d.c.f127498a;
        this.initialState = cVar2;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: mp2.t
            @Override // er.l
            public final Object b(Object obj) {
                return u.D9(this.f127536a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), z9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(u uVar, String str) {
        uVar.d9(new mp2.c.BirthPlaceInputChanged(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(u uVar, String str) {
        uVar.d9(new mp2.c.OpenUrl(str));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(final u uVar, k10.v vVar) {
        vVar.c(q0.c(mp2.d.class), new er.l() { // from class: mp2.m
            @Override // er.l
            public final Object b(Object obj) {
                return u.E9(this.f127528a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mp2.d.c.class), new er.l() { // from class: mp2.n
            @Override // er.l
            public final Object b(Object obj) {
                return u.F9(this.f127529a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mp2.d.Initialized.class), new er.l() { // from class: mp2.o
            @Override // er.l
            public final Object b(Object obj) {
                return u.G9(this.f127530a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(mp2.d.Error.class), new er.l() { // from class: mp2.p
            @Override // er.l
            public final Object b(Object obj) {
                return u.H9(this.f127531a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E9(u uVar, k10.z zVar) {
        b bVar = uVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(mp2.c.C3149c.class), oVar, bVar);
        zVar.x(q0.c(mp2.c.e.C3150c.class), oVar, uVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(u uVar, k10.z zVar) {
        zVar.C(uVar.new d(null));
        e eVar = uVar.new e(null);
        zVar.v(q0.c(mp2.c.d.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(u uVar, k10.z zVar) {
        f fVar = new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(mp2.c.BirthPlaceInputChanged.class), oVar, fVar);
        zVar.x(q0.c(mp2.c.OpenUrl.class), oVar, uVar.new g(null));
        zVar.v(q0.c(mp2.c.f.class), oVar, uVar.new h(null));
        zVar.x(q0.c(mp2.c.a.class), oVar, uVar.new i(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H9(u uVar, k10.z zVar) {
        j jVar = new j(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(mp2.c.h.class), oVar, jVar);
        zVar.x(q0.c(mp2.c.a.class), oVar, uVar.new k(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c x9(dx.b domainError, final mp2.c retryAction) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: mp2.s
            @Override // er.l
            public final Object b(Object obj) {
                return u.y9(retryAction, this, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(mp2.c cVar, u uVar, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                if (cVar != null) {
                    uVar.d9(cVar);
                }
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                uVar.d9(mp2.c.a.f127485a);
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mp2.e.a z9(mp2.d state) {
        return this.mapper.b(new np2.a.Params(state, new er.l() { // from class: mp2.q
            @Override // er.l
            public final Object b(Object obj) {
                return u.A9(this.f127532a, (String) obj);
            }
        }, new er.l() { // from class: mp2.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.B9(this.f127533a, (String) obj);
            }
        }, b9(mp2.c.f.f127493a), b9(mp2.c.a.f127485a), b9(mp2.c.C3149c.f127487a), b9(mp2.c.e.C3150c.f127491a)));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: C9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(op2.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<mp2.c.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<mp2.d, mp2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<mp2.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: w9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(mp2.c.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }
}
