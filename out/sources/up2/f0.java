package up2;

import java.time.LocalDate;
import jl0.VerifyPassportChildApplicationAgreementRequest;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wp2.FieldItem;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B\u0083\u0001\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 \u0012\b\b\u0001\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J!\u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\b\u0010(\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020-2\u0006\u0010,\u001a\u00020\u0002H\u0002¢\u0006\u0004\b.\u0010/J-\u00104\u001a\b\u0012\u0004\u0012\u00028\u000001\"\u0004\b\u0000\u00100*\b\u0012\u0004\u0012\u00028\u0000012\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u001b\u00109\u001a\u000206*\u0002062\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u001b\u0010<\u001a\u00020;*\u00020;2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b<\u0010=R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R \u0010d\u001a\b\u0012\u0004\u0012\u00020_0^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR&\u0010j\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bf\u0010g\u001a\u0004\bh\u0010iR \u0010,\u001a\b\u0012\u0004\u0012\u00020-0k8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o¨\u0006p"}, d2 = {"Lup2/f0;", "Ll00/g;", "Lup2/d;", "Lup2/c;", "Lup2/e;", "", "Lyy/a;", "stateMachineFactory", "Lvp2/b;", "mapper", "Lez/e;", "dateFormatter", "Lez/c;", "dateConverter", "Lep2/k;", "isNameValidUC", "Lep2/i;", "isLastNameValidUC", "Lj14/m;", "checkPeselNumberCorrectUC", "Lep2/f;", "checkIsPlaceOfBirthCorrectUC", "Lg14/a;", "getInfoFromPeselUC", "Lep2/d;", "checkIsDateOfBirthValidUC", "Ltl0/h;", "verifyPassportChildApplicationAgreementsUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lhb4/d;", "errorVMSFactory", "Lib4/c;", "genericErrorMapper", "Lwp2/b;", "setupData", "<init>", "(Lyy/a;Lvp2/b;Lez/e;Lez/c;Lep2/k;Lep2/i;Lj14/m;Lep2/f;Lg14/a;Lep2/d;Ltl0/h;Lac4/a;Lhb4/d;Lib4/c;Lwp2/b;)V", "Ldx/b;", "domainError", "retryAction", "Lhb4/c;", "M9", "(Ldx/b;Lup2/c;)Lhb4/c;", "state", "Lup2/e$a;", "O9", "(Lup2/d;)Lup2/e$a;", "T", "Lwp2/a;", "Lhz/b;", "validationState", "X9", "(Lwp2/a;Lhz/b;)Lwp2/a;", "Liy/b0;", "", "isRequired", "ea", "(Liy/b0;Z)Liy/b0;", "", "fa", "(Ljava/lang/String;Z)Ljava/lang/String;", "b", "Lvp2/b;", "c", "Lez/e;", "d", "Lez/c;", "e", "Lep2/k;", "f", "Lep2/i;", "g", "Lj14/m;", "h", "Lep2/f;", "j", "Lg14/a;", "k", "Lep2/d;", "l", "Ltl0/h;", "m", "Lac4/a;", "n", "Lhb4/d;", "p", "Lib4/c;", "q", "Lwp2/b;", "Lup2/d$b$c;", "r", "Lup2/d$b$c;", "initialState", "Lxw/b;", "Lup2/c$a;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "t", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "v", "Lmu/p0;", "getState", "()Lmu/p0;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 extends l00.g<up2.d, up2.c> implements up2.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final vp2.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ep2.k isNameValidUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ep2.i isLastNameValidUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final j14.m checkPeselNumberCorrectUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ep2.f checkIsPlaceOfBirthCorrectUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g14.a getInfoFromPeselUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ep2.d checkIsDateOfBirthValidUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final tl0.h verifyPassportChildApplicationAgreementsUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericErrorMapper;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final wp2.b setupData;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final up2.d.b.Presentation initialState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<up2.c.a> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final k10.t<up2.d, up2.c> stateMachine;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<up2.e.a> state;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.l<xw.g, oq.i0> {
        a() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(xw.g gVar) {
            c(gVar.getValue());
            return oq.i0.f148189a;
        }

        public final void c(iy.b0 b0Var) {
            f0.this.d9(new up2.c.OnPeselChanged(b0Var, null));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<up2.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f199690a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f199691b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f199692a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f0 f199693b;

            /* JADX INFO: renamed from: up2.f0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5193a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f199694d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f199695e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f199696f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f199698h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f199699j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f199700k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f199701l;

                public C5193a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f199694d = obj;
                    this.f199695e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, f0 f0Var) {
                this.f199692a = hVar;
                this.f199693b = f0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5193a c5193a;
                if (eVar instanceof C5193a) {
                    c5193a = (C5193a) eVar;
                    int i15 = c5193a.f199695e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5193a.f199695e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5193a = new C5193a(eVar);
                    }
                } else {
                    c5193a = new C5193a(eVar);
                }
                Object obj2 = c5193a.f199694d;
                Object objE = uq.b.e();
                int i16 = c5193a.f199695e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f199692a;
                    up2.e.a aVarO9 = this.f199693b.O9((up2.d) obj);
                    c5193a.f199696f = vq.j.a(obj);
                    c5193a.f199698h = vq.j.a(c5193a);
                    c5193a.f199699j = vq.j.a(obj);
                    c5193a.f199700k = vq.j.a(hVar);
                    c5193a.f199701l = 0;
                    c5193a.f199695e = 1;
                    if (hVar.F(aVarO9, c5193a) == objE) {
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

        public b(mu.g gVar, f0 f0Var) {
            this.f199690a = gVar;
            this.f199691b = f0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super up2.e.a> hVar, tq.e eVar) {
            Object objA = this.f199690a.a(new a(hVar, this.f199691b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$h;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<up2.c.OnNoNameSwitchChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199702e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199703f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199704g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation O(up2.c.OnNoNameSwitchChanged onNoNameSwitchChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), null, null, null, null, null, null, null, onNoNameSwitchChanged.getChecked(), false, false, false, null, false, 8063, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnNoNameSwitchChanged onNoNameSwitchChanged = (up2.c.OnNoNameSwitchChanged) this.f199703f;
            k10.c0 c0Var = (k10.c0) this.f199704g;
            uq.b.e();
            if (this.f199702e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up2.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.c.O(onNoNameSwitchChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnNoNameSwitchChanged onNoNameSwitchChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            c cVar = new c(eVar);
            cVar.f199703f = onNoNameSwitchChanged;
            cVar.f199704g = c0Var;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$g;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<up2.c.OnNoLastNameSwitchChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199706f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199707g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation O(up2.c.OnNoLastNameSwitchChanged onNoLastNameSwitchChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), null, null, null, null, null, null, null, false, onNoLastNameSwitchChanged.getChecked(), false, false, null, false, 7935, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnNoLastNameSwitchChanged onNoLastNameSwitchChanged = (up2.c.OnNoLastNameSwitchChanged) this.f199706f;
            k10.c0 c0Var = (k10.c0) this.f199707g;
            uq.b.e();
            if (this.f199705e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up2.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.d.O(onNoLastNameSwitchChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnNoLastNameSwitchChanged onNoLastNameSwitchChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            d dVar = new d(eVar);
            dVar.f199706f = onNoLastNameSwitchChanged;
            dVar.f199707g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$i;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<up2.c.OnNoPeselSwitchChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199709f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199710g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation O(up2.c.OnNoPeselSwitchChanged onNoPeselSwitchChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), null, null, null, null, null, new FieldItem(hz.b.C2039b.f86846c, iy.b0.INSTANCE.a()), null, false, false, onNoPeselSwitchChanged.getChecked(), false, null, true, 3551, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnNoPeselSwitchChanged onNoPeselSwitchChanged = (up2.c.OnNoPeselSwitchChanged) this.f199709f;
            k10.c0 c0Var = (k10.c0) this.f199710g;
            uq.b.e();
            if (this.f199708e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up2.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.e.O(onNoPeselSwitchChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnNoPeselSwitchChanged onNoPeselSwitchChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f199709f = onNoPeselSwitchChanged;
            eVar2.f199710g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$c;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<up2.c.OnBirthDateChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199711e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199712f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199713g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation O(up2.c.OnBirthDateChanged onBirthDateChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), null, null, null, null, null, new FieldItem(hz.b.C2039b.f86846c, onBirthDateChanged.getBirthDate()), null, false, false, false, false, null, false, 8159, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnBirthDateChanged onBirthDateChanged = (up2.c.OnBirthDateChanged) this.f199712f;
            k10.c0 c0Var = (k10.c0) this.f199713g;
            uq.b.e();
            if (this.f199711e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up2.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.f.O(onBirthDateChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnBirthDateChanged onBirthDateChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            f fVar = new f(eVar);
            fVar.f199712f = onBirthDateChanged;
            fVar.f199713g = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lup2/c$m;", "action", "Lup2/d$b$c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lup2/c$m;Lup2/d$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<up2.c.m, up2.d.b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f199714e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f199715f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f199716g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(f0 f0Var, LocalDate localDate) {
            f0Var.d9(new up2.c.OnBirthDateChanged(iy.c0.g(f0Var.dateFormatter.d(new fz.b.LocalDate(localDate), fz.c.DOTTED))));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f199716g;
            if (i15 == 0) {
                oq.u.b(obj);
                LocalDate localDateNow = LocalDate.now();
                LocalDate localDateMinusYears = localDateNow.minusYears(18L);
                xw.b<up2.c.a> bVarY1 = f0.this.Y1();
                final f0 f0Var = f0.this;
                up2.c.a.ToDatePicker toDatePicker = new up2.c.a.ToDatePicker(new uw.j.Single(null, localDateNow, new er.l() { // from class: up2.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f0.g.O(f0Var, (LocalDate) obj2);
                    }
                }, localDateMinusYears, localDateNow, 1, null));
                this.f199714e = vq.j.a(localDateNow);
                this.f199715f = vq.j.a(localDateMinusYears);
                this.f199716g = 1;
                if (bVarY1.F(toDatePicker, this) == objE) {
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
        public final Object w(up2.c.m mVar, up2.d.b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            return f0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$b;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<up2.c.b, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f199718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f199719f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f199720g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f199721h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f199722j;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.VerifyingAgreement V(up2.d.b.Presentation presentation) {
            return new up2.d.b.VerifyingAgreement(presentation.getData());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation X(f0 f0Var, hz.b bVar, hz.b bVar2, hz.b bVar3, hz.b bVar4, hz.b bVar5, hz.b bVar6, hz.b bVar7, up2.d.b.Presentation presentation) {
            FieldItem fieldItem;
            up2.d.b.Data data = presentation.getData();
            FieldItem fieldItemX9 = f0Var.X9(presentation.getData().f(), bVar);
            FieldItem fieldItemX10 = f0Var.X9(presentation.getData().n(), bVar2);
            FieldItem fieldItemX11 = f0Var.X9(presentation.getData().l(), bVar3);
            FieldItem fieldItemX12 = f0Var.X9(presentation.getData().g(), bVar4);
            FieldItem fieldItemX13 = f0Var.X9(presentation.getData().m(), bVar5);
            FieldItem fieldItemX14 = f0Var.X9(presentation.getData().d(), bVar6);
            FieldItem<iy.b0> fieldItemC = presentation.getData().c();
            if (fieldItemC == null || (fieldItem = f0Var.X9(fieldItemC, bVar7)) == null) {
                fieldItem = new FieldItem(bVar7, iy.b0.INSTANCE.a());
            }
            return presentation.a(up2.d.b.Data.b(data, fieldItemX9, fieldItemX10, fieldItemX11, fieldItemX12, fieldItemX13, fieldItem, fieldItemX14, false, false, false, false, null, false, 8064, null));
        }

        /* JADX WARN: Code duplicated, block: B:24:0x013d  */
        /* JADX WARN: Code duplicated, block: B:28:0x0199  */
        /* JADX WARN: Code duplicated, block: B:31:0x023b  */
        /* JADX WARN: Code duplicated, block: B:32:0x0242  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objF;
            hz.b bVarA;
            Object objF2;
            hz.b bVarA2;
            Object objF3;
            hz.b bVar;
            hz.b bVar2;
            hz.b bVarA3;
            Object objF4;
            final hz.b bVar3;
            final hz.b bVar4;
            final hz.b bVar5;
            final hz.b bVarA4;
            final hz.b bVarA5;
            final hz.b bVarA6;
            FieldItem<iy.b0> fieldItemC;
            iy.b0 b0VarD;
            final hz.b bVarA7;
            k10.c0 c0Var = (k10.c0) this.f199722j;
            Object objE = uq.b.e();
            int i15 = this.f199721h;
            if (i15 == 0) {
                oq.u.b(obj);
                ep2.k kVar = f0.this.isNameValidUC;
                ep2.k.Params params = new ep2.k.Params(f0.this.ea(((up2.d.b.Presentation) c0Var.a()).getData().f().d(), !((up2.d.b.Presentation) c0Var.a()).getData().getNoNameSwitchChecked()), !((up2.d.b.Presentation) c0Var.a()).getData().getNoNameSwitchChecked());
                this.f199722j = c0Var;
                this.f199721h = 1;
                objF = kVar.f(params, this);
                if (objF != objE) {
                }
                return objE;
            }
            if (i15 == 1) {
                oq.u.b(obj);
                objF = obj;
            } else {
                if (i15 == 2) {
                    bVarA = (hz.b) this.f199718e;
                    oq.u.b(obj);
                    objF2 = obj;
                    bVarA2 = ((hz.g) objF2).a();
                    ep2.k kVar2 = f0.this.isNameValidUC;
                    ep2.k.Params params2 = new ep2.k.Params(f0.this.ea(((up2.d.b.Presentation) c0Var.a()).getData().l().d(), !((up2.d.b.Presentation) c0Var.a()).getData().getNoNameSwitchChecked()), false);
                    this.f199722j = c0Var;
                    this.f199718e = bVarA;
                    this.f199719f = bVarA2;
                    this.f199721h = 3;
                    objF3 = kVar2.f(params2, this);
                    if (objF3 != objE) {
                        bVar = bVarA;
                        bVar2 = bVarA2;
                        bVarA3 = ((hz.g) objF3).a();
                        ep2.i iVar = f0.this.isLastNameValidUC;
                        ep2.i.Params params3 = new ep2.i.Params(f0.this.ea(((up2.d.b.Presentation) c0Var.a()).getData().g().d(), !((up2.d.b.Presentation) c0Var.a()).getData().getNoLastNameSwitchChecked()), !((up2.d.b.Presentation) c0Var.a()).getData().getNoLastNameSwitchChecked());
                        this.f199722j = c0Var;
                        this.f199718e = bVar;
                        this.f199719f = bVar2;
                        this.f199720g = bVarA3;
                        this.f199721h = 4;
                        objF4 = iVar.f(params3, this);
                        if (objF4 != objE) {
                            bVar3 = bVarA3;
                            bVar4 = bVar;
                        }
                    }
                    return objE;
                }
                if (i15 == 3) {
                    bVar2 = (hz.b) this.f199719f;
                    hz.b bVar6 = (hz.b) this.f199718e;
                    oq.u.b(obj);
                    bVar = bVar6;
                    objF3 = obj;
                    bVarA3 = ((hz.g) objF3).a();
                    ep2.i iVar2 = f0.this.isLastNameValidUC;
                    ep2.i.Params params4 = new ep2.i.Params(f0.this.ea(((up2.d.b.Presentation) c0Var.a()).getData().g().d(), !((up2.d.b.Presentation) c0Var.a()).getData().getNoLastNameSwitchChecked()), !((up2.d.b.Presentation) c0Var.a()).getData().getNoLastNameSwitchChecked());
                    this.f199722j = c0Var;
                    this.f199718e = bVar;
                    this.f199719f = bVar2;
                    this.f199720g = bVarA3;
                    this.f199721h = 4;
                    objF4 = iVar2.f(params4, this);
                    if (objF4 != objE) {
                        bVar3 = bVarA3;
                        bVar4 = bVar;
                    }
                    return objE;
                }
                if (i15 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hz.b bVar7 = (hz.b) this.f199720g;
                bVar2 = (hz.b) this.f199719f;
                hz.b bVar8 = (hz.b) this.f199718e;
                oq.u.b(obj);
                objF4 = obj;
                bVar3 = bVar7;
                bVar4 = bVar8;
            }
            bVar5 = bVar2;
            bVarA4 = ((hz.g) objF4).a();
            bVarA5 = f0.this.checkPeselNumberCorrectUC.a(new j14.m.Params(f0.this.fa(iy.c0.e(((up2.d.b.Presentation) c0Var.a()).getData().m().d().getValue()), !((up2.d.b.Presentation) c0Var.a()).getData().getNoPeselSwitchChecked()), !((up2.d.b.Presentation) c0Var.a()).getData().getNoPeselSwitchChecked())).a();
            bVarA6 = f0.this.checkIsPlaceOfBirthCorrectUC.e(new ep2.f.Params(iy.c0.e(((up2.d.b.Presentation) c0Var.a()).getData().d().d()))).a();
            ep2.d dVar = f0.this.checkIsDateOfBirthValidUC;
            fieldItemC = ((up2.d.b.Presentation) c0Var.a()).getData().c();
            if (fieldItemC != null) {
                b0VarD = fieldItemC.d();
            } else {
                b0VarD = null;
            }
            bVarA7 = dVar.b(new ep2.d.Params(b0VarD)).a();
            if (!bVar4.a() && bVar5.a() && bVar3.a() && bVarA4.a() && bVarA5.a() && bVarA6.a() && bVarA7.a()) {
                return c0Var.d(new er.l() { // from class: up2.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f0.h.V((d.b.Presentation) obj2);
                    }
                });
            }
            final f0 f0Var = f0.this;
            return c0Var.b(new er.l() { // from class: up2.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.h.X(f0Var, bVar4, bVar5, bVar3, bVarA4, bVarA5, bVarA6, bVarA7, (d.b.Presentation) obj2);
                }
            });
            bVarA = ((hz.g) objF).a();
            ep2.k kVar3 = f0.this.isNameValidUC;
            ep2.k.Params params5 = new ep2.k.Params(f0.this.ea(((up2.d.b.Presentation) c0Var.a()).getData().n().d(), !((up2.d.b.Presentation) c0Var.a()).getData().getNoNameSwitchChecked()), false);
            this.f199722j = c0Var;
            this.f199718e = bVarA;
            this.f199721h = 2;
            objF2 = kVar3.f(params5, this);
            if (objF2 != objE) {
                bVarA2 = ((hz.g) objF2).a();
                ep2.k kVar4 = f0.this.isNameValidUC;
                ep2.k.Params params6 = new ep2.k.Params(f0.this.ea(((up2.d.b.Presentation) c0Var.a()).getData().l().d(), !((up2.d.b.Presentation) c0Var.a()).getData().getNoNameSwitchChecked()), false);
                this.f199722j = c0Var;
                this.f199718e = bVarA;
                this.f199719f = bVarA2;
                this.f199721h = 3;
                objF3 = kVar4.f(params6, this);
                if (objF3 != objE) {
                    bVar = bVarA;
                    bVar2 = bVarA2;
                    bVarA3 = ((hz.g) objF3).a();
                    ep2.i iVar3 = f0.this.isLastNameValidUC;
                    ep2.i.Params params7 = new ep2.i.Params(f0.this.ea(((up2.d.b.Presentation) c0Var.a()).getData().g().d(), !((up2.d.b.Presentation) c0Var.a()).getData().getNoLastNameSwitchChecked()), !((up2.d.b.Presentation) c0Var.a()).getData().getNoLastNameSwitchChecked());
                    this.f199722j = c0Var;
                    this.f199718e = bVar;
                    this.f199719f = bVar2;
                    this.f199720g = bVarA3;
                    this.f199721h = 4;
                    objF4 = iVar3.f(params7, this);
                    if (objF4 != objE) {
                        bVar3 = bVarA3;
                        bVar4 = bVar;
                        bVar5 = bVar2;
                        bVarA4 = ((hz.g) objF4).a();
                        bVarA5 = f0.this.checkPeselNumberCorrectUC.a(new j14.m.Params(f0.this.fa(iy.c0.e(((up2.d.b.Presentation) c0Var.a()).getData().m().d().getValue()), !((up2.d.b.Presentation) c0Var.a()).getData().getNoPeselSwitchChecked()), !((up2.d.b.Presentation) c0Var.a()).getData().getNoPeselSwitchChecked())).a();
                        bVarA6 = f0.this.checkIsPlaceOfBirthCorrectUC.e(new ep2.f.Params(iy.c0.e(((up2.d.b.Presentation) c0Var.a()).getData().d().d()))).a();
                        ep2.d dVar2 = f0.this.checkIsDateOfBirthValidUC;
                        fieldItemC = ((up2.d.b.Presentation) c0Var.a()).getData().c();
                        if (fieldItemC != null) {
                            b0VarD = fieldItemC.d();
                        } else {
                            b0VarD = null;
                        }
                        bVarA7 = dVar2.b(new ep2.d.Params(b0VarD)).a();
                        if (!bVar4.a()) {
                        }
                        final f0 f0Var2 = f0.this;
                        return c0Var.b(new er.l() { // from class: up2.h0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return f0.h.X(f0Var2, bVar4, bVar5, bVar3, bVarA4, bVarA5, bVarA6, bVarA7, (d.b.Presentation) obj2);
                            }
                        });
                    }
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.b bVar, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            h hVar = f0.this.new h(eVar);
            hVar.f199722j = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lup2/c$a$a;", "<unused var>", "Lup2/d$b$c;", "snapshot", "Loq/i0;", "<anonymous>", "(Lup2/c$a$a;Lup2/d$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<up2.c.a.C5187a, up2.d.b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199724e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199725f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            iy.b0 b0VarD;
            up2.d.b.Presentation presentation = (up2.d.b.Presentation) this.f199725f;
            Object objE = uq.b.e();
            int i15 = this.f199724e;
            if (i15 == 0) {
                oq.u.b(obj);
                wp2.b bVar = f0.this.setupData;
                iy.b0 b0VarD2 = presentation.getData().f().d();
                iy.b0 b0VarD3 = presentation.getData().n().d();
                iy.b0 b0VarD4 = presentation.getData().l().d();
                iy.b0 b0VarD5 = presentation.getData().g().d();
                xw.g gVarD = presentation.getData().m().d();
                fz.b.LocalDate localDate = null;
                iy.b0 value = gVarD != null ? gVarD.getValue() : null;
                FieldItem<iy.b0> fieldItemC = presentation.getData().c();
                String strE = (fieldItemC == null || (b0VarD = fieldItemC.d()) == null) ? null : iy.c0.e(b0VarD);
                if (strE != null && strE.length() != 0) {
                    LocalDate localDateO = f0.this.dateConverter.o(iy.c0.e(presentation.getData().c().d()), fz.c.DOTTED);
                    if (localDateO == null) {
                        localDateO = LocalDate.now();
                    }
                    localDate = new fz.b.LocalDate(localDateO);
                }
                bVar.h7(new wp2.b.c(b0VarD2, b0VarD3, b0VarD4, b0VarD5, value, localDate, presentation.getData().d().d(), presentation.getData().getNoNameSwitchChecked(), presentation.getData().getNoLastNameSwitchChecked(), presentation.getData().getNoPeselSwitchChecked(), null));
                xw.b<up2.c.a> bVarY1 = f0.this.Y1();
                up2.c.a.C5187a c5187a = up2.c.a.C5187a.f199594a;
                this.f199725f = vq.j.a(presentation);
                this.f199724e = 1;
                if (bVarY1.F(c5187a, this) == objE) {
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
        public final Object w(up2.c.a.C5187a c5187a, up2.d.b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            i iVar = f0.this.new i(eVar);
            iVar.f199725f = presentation;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lup2/c$a$b;", "<unused var>", "Lup2/d$b$c;", "Loq/i0;", "<anonymous>", "(Lup2/c$a$b;Lup2/d$b$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<up2.c.a.b, up2.d.b.Presentation, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199727e;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f199727e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<up2.c.a> bVarY1 = f0.this.Y1();
                up2.c.a.b bVar = up2.c.a.b.f199595a;
                this.f199727e = 1;
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
        public final Object w(up2.c.a.b bVar, up2.d.b.Presentation presentation, tq.e<? super oq.i0> eVar) {
            return f0.this.new j(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$e;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<up2.c.OnFirstNameChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199729e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199730f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199731g;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation O(up2.c.OnFirstNameChanged onFirstNameChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), new FieldItem(hz.b.C2039b.f86846c, onFirstNameChanged.getFirstName()), null, null, null, null, null, null, false, false, false, false, null, false, 8190, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnFirstNameChanged onFirstNameChanged = (up2.c.OnFirstNameChanged) this.f199730f;
            k10.c0 c0Var = (k10.c0) this.f199731g;
            uq.b.e();
            if (this.f199729e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up2.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.k.O(onFirstNameChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnFirstNameChanged onFirstNameChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            k kVar = new k(eVar);
            kVar.f199730f = onFirstNameChanged;
            kVar.f199731g = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$l;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<up2.c.OnSecondNameChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199734g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation O(up2.c.OnSecondNameChanged onSecondNameChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), null, new FieldItem(hz.b.C2039b.f86846c, onSecondNameChanged.getSecondName()), null, null, null, null, null, false, false, false, false, null, false, 8189, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnSecondNameChanged onSecondNameChanged = (up2.c.OnSecondNameChanged) this.f199733f;
            k10.c0 c0Var = (k10.c0) this.f199734g;
            uq.b.e();
            if (this.f199732e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up2.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.l.O(onSecondNameChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnSecondNameChanged onSecondNameChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            l lVar = new l(eVar);
            lVar.f199733f = onSecondNameChanged;
            lVar.f199734g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$j;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<up2.c.OnOtherNameChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199737g;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation O(up2.c.OnOtherNameChanged onOtherNameChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), null, null, new FieldItem(hz.b.C2039b.f86846c, onOtherNameChanged.getOtherName()), null, null, null, null, false, false, false, false, null, false, 8187, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnOtherNameChanged onOtherNameChanged = (up2.c.OnOtherNameChanged) this.f199736f;
            k10.c0 c0Var = (k10.c0) this.f199737g;
            uq.b.e();
            if (this.f199735e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up2.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.m.O(onOtherNameChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnOtherNameChanged onOtherNameChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            m mVar = new m(eVar);
            mVar.f199736f = onOtherNameChanged;
            mVar.f199737g = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$f;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<up2.c.OnLastNameChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199739f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199740g;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation O(up2.c.OnLastNameChanged onLastNameChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), null, null, null, new FieldItem(hz.b.C2039b.f86846c, onLastNameChanged.getLastName()), null, null, null, false, false, false, false, null, false, 8183, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnLastNameChanged onLastNameChanged = (up2.c.OnLastNameChanged) this.f199739f;
            k10.c0 c0Var = (k10.c0) this.f199740g;
            uq.b.e();
            if (this.f199738e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up2.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.n.O(onLastNameChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnLastNameChanged onLastNameChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            n nVar = new n(eVar);
            nVar.f199739f = onLastNameChanged;
            nVar.f199740g = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$d;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<up2.c.OnBirthPlaceChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199741e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199742f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199743g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation O(up2.c.OnBirthPlaceChanged onBirthPlaceChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), null, null, null, null, null, null, new FieldItem(hz.b.C2039b.f86846c, onBirthPlaceChanged.getBirthPlace()), false, false, false, false, null, false, 8127, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnBirthPlaceChanged onBirthPlaceChanged = (up2.c.OnBirthPlaceChanged) this.f199742f;
            k10.c0 c0Var = (k10.c0) this.f199743g;
            uq.b.e();
            if (this.f199741e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: up2.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.o.O(onBirthPlaceChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnBirthPlaceChanged onBirthPlaceChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            o oVar = new o(eVar);
            oVar.f199742f = onBirthPlaceChanged;
            oVar.f199743g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$k;", "action", "Lk10/c0;", "Lup2/d$b$c;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<up2.c.OnPeselChanged, k10.c0<up2.d.b.Presentation>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199745f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f199746g;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation V(f0 f0Var, fz.b.LocalDate localDate, up2.c.OnPeselChanged onPeselChanged, up2.d.b.Presentation presentation) {
            return presentation.a(up2.d.b.Data.b(presentation.getData(), null, null, null, null, new FieldItem(hz.b.C2039b.f86846c, xw.g.b(onPeselChanged.getPesel())), new FieldItem(null, iy.c0.g(f0Var.dateFormatter.d(new fz.b.LocalDate(localDate.getDate()), fz.c.DOTTED)), 1, null), null, false, false, false, false, null, false, 4047, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Presentation X(up2.c.OnPeselChanged onPeselChanged, up2.d.b.Presentation presentation) {
            up2.d.b.Data data = presentation.getData();
            iy.b0 pesel = onPeselChanged.getPesel();
            hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
            return presentation.a(up2.d.b.Data.b(data, null, null, null, null, new FieldItem(c2039b, xw.g.b(pesel)), new FieldItem(c2039b, iy.b0.INSTANCE.a()), null, false, false, false, false, null, true, 4047, null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final up2.c.OnPeselChanged onPeselChanged = (up2.c.OnPeselChanged) this.f199745f;
            k10.c0 c0Var = (k10.c0) this.f199746g;
            uq.b.e();
            if (this.f199744e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final fz.b.LocalDate localDate = null;
            g14.a.b bVarA = f0.this.getInfoFromPeselUC.a(new g14.a.Params(onPeselChanged.getPesel(), null));
            if (bVarA instanceof g14.a.b.Success) {
                localDate = new fz.b.LocalDate(((g14.a.b.Success) bVarA).getBirthDate());
            } else if (!fr.t.c(bVarA, g14.a.b.C1568a.f69766a) && !fr.t.c(bVarA, g14.a.b.C1569b.f69767a)) {
                throw new oq.p();
            }
            if (localDate != null) {
                final f0 f0Var = f0.this;
                k10.l lVarB = c0Var.b(new er.l() { // from class: up2.s0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f0.p.V(f0Var, localDate, onPeselChanged, (d.b.Presentation) obj2);
                    }
                });
                if (lVarB != null) {
                    return lVarB;
                }
            }
            return c0Var.b(new er.l() { // from class: up2.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.p.X(onPeselChanged, (d.b.Presentation) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.OnPeselChanged onPeselChanged, k10.c0<up2.d.b.Presentation> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            p pVar = f0.this.new p(eVar);
            pVar.f199745f = onPeselChanged;
            pVar.f199746g = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lup2/d$b$d;", "state", "Loq/i0;", "<anonymous>", "(Lup2/d$b$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<up2.d.b.VerifyingAgreement, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199748e;

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f199748e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            f0.this.d9(up2.c.n.f199618a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(up2.d.b.VerifyingAgreement verifyingAgreement, tq.e<? super oq.i0> eVar) {
            return ((q) v(verifyingAgreement, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return f0.this.new q(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$n;", "action", "Lk10/c0;", "Lup2/d$b$d;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<up2.c.n, k10.c0<up2.d.b.VerifyingAgreement>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f199750e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f199751f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f199752g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f199753h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f199754j;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lup2/d;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends up2.d>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f199756e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f199757f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f199758g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f199759h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            boolean f199760j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f199761k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ f0 f199762l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ al0.s0 f199763m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<up2.d.b.VerifyingAgreement> f199764n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ up2.c.n f199765p;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f0 f0Var, al0.s0 s0Var, k10.c0<up2.d.b.VerifyingAgreement> c0Var, up2.c.n nVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f199762l = f0Var;
                this.f199763m = s0Var;
                this.f199764n = c0Var;
                this.f199765p = nVar;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final up2.d.b.Error Y(k10.c0 c0Var, f0 f0Var, dx.b bVar, up2.c.n nVar, up2.d.b.VerifyingAgreement verifyingAgreement) {
                return new up2.d.b.Error(((up2.d.b.VerifyingAgreement) c0Var.a()).getData(), f0Var.M9(bVar, nVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final up2.d.a Z(up2.d.b.VerifyingAgreement verifyingAgreement) {
                return up2.d.a.f199620a;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final up2.d.b.Presentation a0(up2.d.b.VerifyingAgreement verifyingAgreement) {
                return new up2.d.b.Presentation(verifyingAgreement.getData());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                String strE;
                Object objC;
                iy.b0 b0VarD;
                k10.c0<up2.d.b.VerifyingAgreement> c0Var;
                iy.b0 b0VarD2;
                String strE2;
                Object objE = uq.b.e();
                int i15 = this.f199761k;
                String str = "";
                if (i15 != 0) {
                    if (i15 == 1) {
                        oq.u.b(obj);
                        objC = obj;
                    } else {
                        if (i15 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0Var = (k10.c0) this.f199757f;
                        oq.u.b(obj);
                    }
                    return c0Var.d(new er.l() { // from class: up2.x0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return f0.r.a.a0((d.b.VerifyingAgreement) obj2);
                        }
                    });
                }
                oq.u.b(obj);
                tl0.h hVar = this.f199762l.verifyPassportChildApplicationAgreementsUC;
                al0.s0 s0Var = this.f199763m;
                iy.b0 b0VarEa = this.f199762l.ea(this.f199764n.a().getData().m().d().getValue(), !this.f199764n.a().getData().getNoPeselSwitchChecked());
                ez.c cVar = this.f199762l.dateConverter;
                FieldItem<iy.b0> fieldItemC = this.f199764n.a().getData().c();
                if (fieldItemC == null || (b0VarD = fieldItemC.d()) == null || (strE = iy.c0.e(b0VarD)) == null) {
                    strE = "";
                }
                LocalDate localDateO = cVar.o(strE, fz.c.DOTTED);
                if (localDateO == null) {
                    localDateO = LocalDate.now();
                }
                tl0.h.Params params = new tl0.h.Params(s0Var, new VerifyPassportChildApplicationAgreementRequest(b0VarEa, new fz.b.LocalDate(localDateO), this.f199762l.ea(this.f199764n.a().getData().f().d(), !this.f199764n.a().getData().getNoNameSwitchChecked()), this.f199764n.a().getData().d().d(), this.f199762l.ea(this.f199764n.a().getData().n().d(), !this.f199764n.a().getData().getNoNameSwitchChecked()), this.f199762l.ea(this.f199764n.a().getData().g().d(), !this.f199764n.a().getData().getNoLastNameSwitchChecked())));
                this.f199761k = 1;
                objC = hVar.c(params, this);
                if (objC != objE) {
                }
                return objE;
                dx.i iVar = (dx.i) objC;
                final k10.c0<up2.d.b.VerifyingAgreement> c0Var2 = this.f199764n;
                final f0 f0Var = this.f199762l;
                final up2.c.n nVar = this.f199765p;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var2.d(new er.l() { // from class: up2.v0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return f0.r.a.Y(c0Var2, f0Var, bVar, nVar, (d.b.VerifyingAgreement) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                boolean zBooleanValue = ((Boolean) ((dx.i.Right) iVar).b()).booleanValue();
                if (zBooleanValue) {
                    return c0Var2.d(new er.l() { // from class: up2.w0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return f0.r.a.Z((d.b.VerifyingAgreement) obj2);
                        }
                    });
                }
                wp2.b bVar2 = f0Var.setupData;
                eq2.b bVar3 = eq2.b.MANUAL;
                iy.b0 b0VarC = iy.c0.c(f0Var.ea(c0Var2.a().getData().f().d(), !c0Var2.a().getData().getNoNameSwitchChecked()));
                iy.b0 b0VarC2 = iy.c0.c(f0Var.ea(c0Var2.a().getData().n().d(), !c0Var2.a().getData().getNoNameSwitchChecked()));
                iy.b0 b0VarC3 = iy.c0.c(f0Var.ea(c0Var2.a().getData().l().d(), !c0Var2.a().getData().getNoNameSwitchChecked()));
                iy.b0 b0VarC4 = iy.c0.c(f0Var.ea(c0Var2.a().getData().g().d(), true ^ c0Var2.a().getData().getNoLastNameSwitchChecked()));
                xw.g gVarB = xw.g.b(xw.g.c(c0Var2.a().getData().m().d().getValue()));
                gVarB.getValue();
                if (c0Var2.a().getData().getNoPeselSwitchChecked()) {
                    gVarB = null;
                }
                iy.b0 value = gVarB != null ? gVarB.getValue() : null;
                ez.c cVar2 = f0Var.dateConverter;
                FieldItem<iy.b0> fieldItemC2 = c0Var2.a().getData().c();
                if (fieldItemC2 != null && (b0VarD2 = fieldItemC2.d()) != null && (strE2 = iy.c0.e(b0VarD2)) != null) {
                    str = strE2;
                }
                LocalDate localDateO2 = cVar2.o(str, fz.c.DOTTED);
                if (localDateO2 == null) {
                    localDateO2 = LocalDate.now();
                }
                bVar2.w2(new eq2.a(bVar3, b0VarC, b0VarC2, b0VarC3, b0VarC4, value, new fz.b.LocalDate(localDateO2), c0Var2.a().getData().d().d(), null, null));
                xw.b<up2.c.a> bVarY1 = f0Var.Y1();
                up2.c.a.d dVar = up2.c.a.d.f199597a;
                this.f199756e = vq.j.a(iVar);
                this.f199757f = c0Var2;
                this.f199758g = 0;
                this.f199760j = zBooleanValue;
                this.f199759h = 0;
                this.f199761k = 2;
                if (bVarY1.F(dVar, this) != objE) {
                    c0Var = c0Var2;
                    return c0Var.d(new er.l() { // from class: up2.x0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return f0.r.a.a0((d.b.VerifyingAgreement) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f199762l, this.f199763m, this.f199764n, this.f199765p, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends up2.d>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.Error O(k10.c0 c0Var, f0 f0Var, up2.c.n nVar, up2.d.b.VerifyingAgreement verifyingAgreement) {
            return new up2.d.b.Error(((up2.d.b.VerifyingAgreement) c0Var.a()).getData(), f0Var.M9(new dx.b.Generic(null, 1, null), nVar));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            r rVar;
            al0.s0 passportType;
            final up2.c.n nVar = (up2.c.n) this.f199753h;
            final k10.c0 c0Var = (k10.c0) this.f199754j;
            Object objE = uq.b.e();
            int i15 = this.f199752g;
            if (i15 == 0) {
                oq.u.b(obj);
                wp2.b.EnterChildSetupData enterChildSetupDataE0 = f0.this.setupData.e0();
                if (enterChildSetupDataE0 == null || (passportType = enterChildSetupDataE0.getPassportType()) == null) {
                    rVar = this;
                } else {
                    f0 f0Var = f0.this;
                    ac4.a aVar = f0Var.callActionWithLoaderUseCase;
                    a aVar2 = new a(f0Var, passportType, c0Var, nVar, null);
                    this.f199753h = nVar;
                    this.f199754j = c0Var;
                    this.f199750e = vq.j.a(passportType);
                    this.f199751f = 0;
                    this.f199752g = 1;
                    rVar = this;
                    obj = ac4.a.a(aVar, null, aVar2, rVar, 1, null);
                    if (obj == objE) {
                        return objE;
                    }
                }
                final f0 f0Var2 = f0.this;
                return c0Var.d(new er.l() { // from class: up2.u0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f0.r.O(c0Var, f0Var2, nVar, (d.b.VerifyingAgreement) obj2);
                    }
                });
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            rVar = this;
            k10.l lVar = (k10.l) obj;
            if (lVar != null) {
                return lVar;
            }
            final f0 f0Var3 = f0.this;
            return c0Var.d(new er.l() { // from class: up2.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.r.O(c0Var, f0Var3, nVar, (d.b.VerifyingAgreement) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.n nVar, k10.c0<up2.d.b.VerifyingAgreement> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            r rVar = f0.this.new r(eVar);
            rVar.f199753h = nVar;
            rVar.f199754j = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lup2/c$a$b;", "<unused var>", "Lup2/d$a;", "Loq/i0;", "<anonymous>", "(Lup2/c$a$b;Lup2/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<up2.c.a.b, up2.d.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199766e;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f199766e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                up2.c.a.C5188c c5188c = up2.c.a.C5188c.f199596a;
                this.f199766e = 1;
                if (f0Var.F(c5188c, this) == objE) {
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
        public final Object w(up2.c.a.b bVar, up2.d.a aVar, tq.e<? super oq.i0> eVar) {
            return f0.this.new s(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lup2/c$n;", "<unused var>", "Lk10/c0;", "Lup2/d$b$b;", "state", "Lk10/l;", "Lup2/d;", "<anonymous>", "(Lup2/c$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<up2.c.n, k10.c0<up2.d.b.Error>, tq.e<? super k10.l<? extends up2.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f199769f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final up2.d.b.VerifyingAgreement O(k10.c0 c0Var, up2.d.b.Error error) {
            return new up2.d.b.VerifyingAgreement(((up2.d.b.Error) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f199769f;
            uq.b.e();
            if (this.f199768e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: up2.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return f0.t.O(c0Var, (d.b.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(up2.c.n nVar, k10.c0<up2.d.b.Error> c0Var, tq.e<? super k10.l<? extends up2.d>> eVar) {
            t tVar = new t(eVar);
            tVar.f199769f = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lup2/c$a$a;", "<unused var>", "Lup2/d$b$b;", "Loq/i0;", "<anonymous>", "(Lup2/c$a$a;Lup2/d$b$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<up2.c.a.C5187a, up2.d.b.Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f199770e;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f199770e;
            if (i15 == 0) {
                oq.u.b(obj);
                f0 f0Var = f0.this;
                up2.c.a.C5187a c5187a = up2.c.a.C5187a.f199594a;
                this.f199770e = 1;
                if (f0Var.F(c5187a, this) == objE) {
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
        public final Object w(up2.c.a.C5187a c5187a, up2.d.b.Error error, tq.e<? super oq.i0> eVar) {
            return f0.this.new u(eVar).J(oq.i0.f148189a);
        }
    }

    public f0(yy.a aVar, vp2.b bVar, ez.e eVar, ez.c cVar, ep2.k kVar, ep2.i iVar, j14.m mVar, ep2.f fVar, g14.a aVar2, ep2.d dVar, tl0.h hVar, ac4.a aVar3, hb4.d dVar2, ib4.c cVar2, wp2.b bVar2) {
        iy.b0 pesel;
        String strE;
        iy.b0 birthPlace;
        fz.b.LocalDate birthDate;
        iy.b0 pesel2;
        iy.b0 lastName;
        iy.b0 otherName;
        iy.b0 secondName;
        iy.b0 firstName;
        this.mapper = bVar;
        this.dateFormatter = eVar;
        this.dateConverter = cVar;
        this.isNameValidUC = kVar;
        this.isLastNameValidUC = iVar;
        this.checkPeselNumberCorrectUC = mVar;
        this.checkIsPlaceOfBirthCorrectUC = fVar;
        this.getInfoFromPeselUC = aVar2;
        this.checkIsDateOfBirthValidUC = dVar;
        this.verifyPassportChildApplicationAgreementsUC = hVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.errorVMSFactory = dVar2;
        this.genericErrorMapper = cVar2;
        this.setupData = bVar2;
        wp2.b.EnterChildSetupData enterChildSetupDataE0 = bVar2.e0();
        wp2.b.c enterChildSetupFormData = enterChildSetupDataE0 != null ? enterChildSetupDataE0.getEnterChildSetupFormData() : null;
        String strE2 = (enterChildSetupFormData == null || (firstName = enterChildSetupFormData.getFirstName()) == null) ? null : iy.c0.e(firstName);
        boolean z15 = true;
        FieldItem fieldItem = new FieldItem(null, iy.c0.g(strE2 == null ? "" : strE2), 1, null);
        String strE3 = (enterChildSetupFormData == null || (secondName = enterChildSetupFormData.getSecondName()) == null) ? null : iy.c0.e(secondName);
        FieldItem fieldItem2 = new FieldItem(null, iy.c0.g(strE3 == null ? "" : strE3), 1, null);
        String strE4 = (enterChildSetupFormData == null || (otherName = enterChildSetupFormData.getOtherName()) == null) ? null : iy.c0.e(otherName);
        FieldItem fieldItem3 = new FieldItem(null, iy.c0.g(strE4 == null ? "" : strE4), 1, null);
        String strE5 = (enterChildSetupFormData == null || (lastName = enterChildSetupFormData.getLastName()) == null) ? null : iy.c0.e(lastName);
        FieldItem fieldItem4 = new FieldItem(null, iy.c0.g(strE5 == null ? "" : strE5), 1, null);
        FieldItem fieldItem5 = new FieldItem(null, xw.g.b((enterChildSetupFormData == null || (pesel2 = enterChildSetupFormData.getPesel()) == null) ? xw.g.INSTANCE.a() : pesel2), 1, null);
        FieldItem fieldItem6 = (enterChildSetupFormData == null || (birthDate = enterChildSetupFormData.getBirthDate()) == null) ? null : new FieldItem(null, iy.c0.g(eVar.d(new fz.b.LocalDate(birthDate.getDate()), fz.c.DOTTED)), 1, null);
        String strE6 = (enterChildSetupFormData == null || (birthPlace = enterChildSetupFormData.getBirthPlace()) == null) ? null : iy.c0.e(birthPlace);
        FieldItem fieldItem7 = new FieldItem(null, iy.c0.g(strE6 != null ? strE6 : ""), 1, null);
        boolean noNameSwitchChecked = enterChildSetupFormData != null ? enterChildSetupFormData.getNoNameSwitchChecked() : false;
        boolean noLastNameSwitchChecked = enterChildSetupFormData != null ? enterChildSetupFormData.getNoLastNameSwitchChecked() : false;
        boolean noPeselSwitchChecked = enterChildSetupFormData != null ? enterChildSetupFormData.getNoPeselSwitchChecked() : false;
        boolean z16 = (enterChildSetupDataE0 != null ? enterChildSetupDataE0.getPassportType() : null) == al0.s0.TEMPORARY;
        kq2.b whoAgrees = (enterChildSetupDataE0 == null || (whoAgrees = enterChildSetupDataE0.getWhoAgrees()) == null) ? kq2.b.PARENT : whoAgrees;
        if (enterChildSetupFormData != null && (pesel = enterChildSetupFormData.getPesel()) != null && (strE = iy.c0.e(pesel)) != null && strE.length() != 0) {
            z15 = false;
        }
        up2.d.b.Presentation presentation = new up2.d.b.Presentation(new up2.d.b.Data(fieldItem, fieldItem2, fieldItem3, fieldItem4, fieldItem5, fieldItem6, fieldItem7, noNameSwitchChecked, noLastNameSwitchChecked, noPeselSwitchChecked, z16, whoAgrees, z15));
        this.initialState = presentation;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(presentation, new er.l() { // from class: up2.v
            @Override // er.l
            public final Object b(Object obj) {
                return f0.Z9(this.f199817a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), O9(presentation));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c M9(dx.b domainError, final up2.c retryAction) {
        return this.errorVMSFactory.a(this.genericErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: up2.u
            @Override // er.l
            public final Object b(Object obj) {
                return f0.N9(retryAction, this, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(up2.c cVar, f0 f0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                if (cVar != null) {
                    f0Var.d9(cVar);
                }
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                f0Var.d9(up2.c.a.C5187a.f199594a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final up2.e.a O9(up2.d state) {
        return this.mapper.b(new vp2.b.Params(state, b9(up2.c.a.C5187a.f199594a), b9(up2.c.a.b.f199595a), b9(up2.c.b.f199599a), new er.l() { // from class: up2.r
            @Override // er.l
            public final Object b(Object obj) {
                return f0.P9(this.f199804a, (String) obj);
            }
        }, new er.l() { // from class: up2.w
            @Override // er.l
            public final Object b(Object obj) {
                return f0.Q9(this.f199822a, (String) obj);
            }
        }, new er.l() { // from class: up2.x
            @Override // er.l
            public final Object b(Object obj) {
                return f0.R9(this.f199823a, (String) obj);
            }
        }, new er.l() { // from class: up2.y
            @Override // er.l
            public final Object b(Object obj) {
                return f0.S9(this.f199824a, (String) obj);
            }
        }, new a(), new er.l() { // from class: up2.z
            @Override // er.l
            public final Object b(Object obj) {
                return f0.T9(this.f199826a, (String) obj);
            }
        }, new er.l() { // from class: up2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.U9(this.f199588a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: up2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.V9(this.f199592a, ((Boolean) obj).booleanValue());
            }
        }, new er.l() { // from class: up2.c0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.W9(this.f199619a, ((Boolean) obj).booleanValue());
            }
        }, b9(up2.c.m.f199617a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(f0 f0Var, String str) {
        f0Var.d9(new up2.c.OnFirstNameChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(f0 f0Var, String str) {
        f0Var.d9(new up2.c.OnSecondNameChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(f0 f0Var, String str) {
        f0Var.d9(new up2.c.OnOtherNameChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(f0 f0Var, String str) {
        f0Var.d9(new up2.c.OnLastNameChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(f0 f0Var, String str) {
        f0Var.d9(new up2.c.OnBirthPlaceChanged(iy.c0.g(str)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(f0 f0Var, boolean z15) {
        f0Var.d9(new up2.c.OnNoNameSwitchChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(f0 f0Var, boolean z15) {
        f0Var.d9(new up2.c.OnNoLastNameSwitchChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(f0 f0Var, boolean z15) {
        f0Var.d9(new up2.c.OnNoPeselSwitchChanged(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <T> FieldItem<T> X9(FieldItem<T> fieldItem, hz.b bVar) {
        return FieldItem.b(fieldItem, bVar, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(final f0 f0Var, k10.v vVar) {
        vVar.c(fr.q0.c(up2.d.b.Presentation.class), new er.l() { // from class: up2.d0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.aa(this.f199643a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(up2.d.b.VerifyingAgreement.class), new er.l() { // from class: up2.e0
            @Override // er.l
            public final Object b(Object obj) {
                return f0.ba(this.f199668a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(up2.d.a.class), new er.l() { // from class: up2.s
            @Override // er.l
            public final Object b(Object obj) {
                return f0.ca(this.f199806a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(up2.d.b.Error.class), new er.l() { // from class: up2.t
            @Override // er.l
            public final Object b(Object obj) {
                return f0.da(this.f199810a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(f0 f0Var, k10.z zVar) {
        h hVar = f0Var.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(up2.c.b.class), oVar, hVar);
        zVar.x(fr.q0.c(up2.c.a.C5187a.class), oVar, f0Var.new i(null));
        zVar.x(fr.q0.c(up2.c.a.b.class), oVar, f0Var.new j(null));
        zVar.v(fr.q0.c(up2.c.OnFirstNameChanged.class), oVar, new k(null));
        zVar.v(fr.q0.c(up2.c.OnSecondNameChanged.class), oVar, new l(null));
        zVar.v(fr.q0.c(up2.c.OnOtherNameChanged.class), oVar, new m(null));
        zVar.v(fr.q0.c(up2.c.OnLastNameChanged.class), oVar, new n(null));
        zVar.v(fr.q0.c(up2.c.OnBirthPlaceChanged.class), oVar, new o(null));
        zVar.v(fr.q0.c(up2.c.OnPeselChanged.class), oVar, f0Var.new p(null));
        zVar.v(fr.q0.c(up2.c.OnNoNameSwitchChanged.class), oVar, new c(null));
        zVar.v(fr.q0.c(up2.c.OnNoLastNameSwitchChanged.class), oVar, new d(null));
        zVar.v(fr.q0.c(up2.c.OnNoPeselSwitchChanged.class), oVar, new e(null));
        zVar.v(fr.q0.c(up2.c.OnBirthDateChanged.class), oVar, new f(null));
        zVar.x(fr.q0.c(up2.c.m.class), oVar, f0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(f0 f0Var, k10.z zVar) {
        zVar.C(f0Var.new q(null));
        r rVar = f0Var.new r(null);
        zVar.v(fr.q0.c(up2.c.n.class), k10.o.CANCEL_PREVIOUS, rVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(f0 f0Var, k10.z zVar) {
        s sVar = f0Var.new s(null);
        zVar.x(fr.q0.c(up2.c.a.b.class), k10.o.CANCEL_PREVIOUS, sVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(f0 f0Var, k10.z zVar) {
        t tVar = new t(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(up2.c.n.class), oVar, tVar);
        zVar.x(fr.q0.c(up2.c.a.C5187a.class), oVar, f0Var.new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final iy.b0 ea(iy.b0 b0Var, boolean z15) {
        return z15 ? b0Var : iy.b0.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String fa(String str, boolean z15) {
        return z15 ? str : "";
    }

    @Override // zx.b
    /* JADX INFO: renamed from: L9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(up2.c.a aVar, tq.e<? super oq.i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    public xw.b<up2.c.a> Y1() {
        return this.navAction;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: Y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(wp2.b bVar) {
        super.P5(bVar);
    }

    @Override // l00.g
    protected k10.t<up2.d, up2.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<up2.e.a> getState() {
        return this.state;
    }
}
