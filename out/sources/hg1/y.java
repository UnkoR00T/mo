package hg1;

import java.time.LocalDate;
import jg1.CompanyManagementEntryPointContractData;
import ld1.CompanyApplicationCitizenData;
import ld1.KnownUserDataModel;
import ma1.CompanyData;
import na1.CompanySuspensionOptions;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qf1.ResumptionDate;
import qf1.SuspensionPeriod;
import rf1.CompanyDetailsContractData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001cBs\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0013\u0010(\u001a\u00020'*\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0018\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020*H\u0096\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b/\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR \u0010O\u001a\b\u0012\u0004\u0012\u00020J0I8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bM\u0010NR\u0014\u0010S\u001a\u00020P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR&\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030T8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0Z8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^R\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020`0_8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010a¨\u0006d"}, d2 = {"Lhg1/y;", "Ll00/g;", "Lhg1/m;", "Lhg1/k;", "Lhg1/n;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lkg1/j;", "mapper", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lla1/a;", "companyInteractor", "Lgb1/b;", "companyApplicationInteractor", "Lac4/a;", "callActionWithLoaderUseCase", "Lkg1/d;", "errorMapper", "Lhb4/d;", "errorVMSFactory", "Lez/c;", "dateConverter", "Lez/a;", "currentTimeProvider", "Lof1/a;", "companySuspensionContainersInteractor", "Lhg1/l;", "setupData", "<init>", "(Lyy/a;Lkg1/j;La14/w;Li70/n;Lla1/a;Lgb1/b;Lac4/a;Lkg1/d;Lhb4/d;Lez/c;Lez/a;Lof1/a;Lhg1/l;)V", "state", "Lhg1/n$a;", "D9", "(Lhg1/m;)Lhg1/n$a;", "Lkg1/d$b;", "Ljb4/b;", "C9", "(Lkg1/d$b;)Ljb4/b;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lkg1/j;", "c", "La14/w;", "d", "Li70/n;", "e", "Lla1/a;", "f", "Lgb1/b;", "g", "Lac4/a;", "h", "Lkg1/d;", "j", "Lhb4/d;", "k", "Lez/c;", "l", "Lez/a;", "m", "Lof1/a;", "n", "Lhg1/l;", "Lxw/b;", "Lhg1/k$d;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lhg1/m$d;", "q", "Lhg1/m$d;", "initialState", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y extends l00.g<hg1.m, hg1.k> implements hg1.n, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kg1.j mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final la1.a companyInteractor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final gb1.b companyApplicationInteractor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final kg1.d errorMapper;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final ez.c dateConverter;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final of1.a companySuspensionContainersInteractor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<hg1.k.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final hg1.m.d initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<hg1.m, hg1.k> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<hg1.n.a> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lhg1/y$a;", "", "Lhg1/l;", "Lhg1/y;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends f00.j0 {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<hg1.n.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f84462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ y f84463b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f84464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ y f84465b;

            /* JADX INFO: renamed from: hg1.y$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1956a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f84466d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f84467e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f84468f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f84470h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f84471j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f84472k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f84473l;

                public C1956a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f84466d = obj;
                    this.f84467e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, y yVar) {
                this.f84464a = hVar;
                this.f84465b = yVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1956a c1956a;
                if (eVar instanceof C1956a) {
                    c1956a = (C1956a) eVar;
                    int i15 = c1956a.f84467e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1956a.f84467e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1956a = new C1956a(eVar);
                    }
                } else {
                    c1956a = new C1956a(eVar);
                }
                Object obj2 = c1956a.f84466d;
                Object objE = uq.b.e();
                int i16 = c1956a.f84467e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f84464a;
                    hg1.n.a aVarD9 = this.f84465b.D9((hg1.m) obj);
                    c1956a.f84468f = vq.j.a(obj);
                    c1956a.f84470h = vq.j.a(c1956a);
                    c1956a.f84471j = vq.j.a(obj);
                    c1956a.f84472k = vq.j.a(hVar);
                    c1956a.f84473l = 0;
                    c1956a.f84467e = 1;
                    if (hVar.F(aVarD9, c1956a) == objE) {
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

        public b(mu.g gVar, y yVar) {
            this.f84462a = gVar;
            this.f84463b = yVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super hg1.n.a> hVar, tq.e eVar) {
            Object objA = this.f84462a.a(new a(hVar, this.f84463b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lhg1/m$d;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<hg1.m.d>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84475f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lhg1/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends hg1.m>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f84477e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ y f84478f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<hg1.m.d> f84479g;

            /* JADX INFO: renamed from: hg1.y$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C1957a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f84480a;

                static {
                    int[] iArr = new int[ma1.l.values().length];
                    try {
                        iArr[ma1.l.SUSPEND_COMPANY.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ma1.l.RESUME_COMPANY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f84480a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, k10.c0<hg1.m.d> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f84478f = yVar;
                this.f84479g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hg1.m.ErrorInitial Z(y yVar, dx.b bVar, hg1.m.d dVar) {
                return new hg1.m.ErrorInitial(yVar.errorVMSFactory.a(yVar.C9(new kg1.d.b.GetCompanyDetails(bVar))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hg1.m.ErrorInitial a0(y yVar, hg1.m.d dVar) {
                return new hg1.m.ErrorInitial(yVar.errorVMSFactory.a(yVar.C9(new kg1.d.b.GeneralError(new dx.b.Generic(new NullPointerException("CompanyManagementEntryPoint is null"))))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hg1.m.e b0(ma1.l lVar, y yVar, ma1.f fVar, long j15, hg1.m.d dVar) {
                LocalDate localDate;
                long j16;
                LocalDate localDatePlusDays;
                LocalDate from;
                String resumptionDate;
                String startDate;
                LocalDate localDateO;
                LocalDate startResumptionDate;
                String suspensionFromDate;
                int i15 = C1957a.f84480a[lVar.ordinal()];
                if (i15 != 1) {
                    if (i15 != 2) {
                        throw new oq.p();
                    }
                    jg1.d dVarA8 = yVar.setupData.getContract().a8();
                    jg1.d.Resumption resumption = dVarA8 instanceof jg1.d.Resumption ? (jg1.d.Resumption) dVarA8 : null;
                    ResumptionDate resumptionDate2 = resumption != null ? resumption.getResumptionDate() : null;
                    LocalDate localDateC = yVar.currentTimeProvider.c();
                    CompanyData companyData = fVar.getCompanyData();
                    if (companyData == null || (suspensionFromDate = companyData.getSuspensionFromDate()) == null || (localDateO = yVar.dateConverter.o(suspensionFromDate, fz.c.DOTTED)) == null) {
                        localDateO = localDateC;
                    }
                    LocalDate localDate2 = (LocalDate) sq.a.k(localDateC, localDateO);
                    LocalDate localDate3 = (resumptionDate2 == null || (startResumptionDate = resumptionDate2.getStartResumptionDate()) == null) ? localDate2 : startResumptionDate;
                    CompanyData companyData2 = fVar.getCompanyData();
                    return new hg1.m.e.Resumption(localDate2, localDate3, null, ma1.s.a(companyData2 != null ? companyData2.getCategoryEdition() : null), 4, null);
                }
                jg1.d dVarA9 = yVar.setupData.getContract().a8();
                jg1.d.Suspension suspension = dVarA9 instanceof jg1.d.Suspension ? (jg1.d.Suspension) dVarA9 : null;
                SuspensionPeriod suspensionPeriod = suspension != null ? suspension.getSuspensionPeriod() : null;
                LocalDate localDateC2 = yVar.currentTimeProvider.c();
                CompanyData companyData3 = fVar.getCompanyData();
                LocalDate localDateO2 = (companyData3 == null || (startDate = companyData3.getStartDate()) == null) ? null : yVar.dateConverter.o(startDate, fz.c.DOTTED);
                CompanyData companyData4 = fVar.getCompanyData();
                LocalDate localDateO3 = (companyData4 == null || (resumptionDate = companyData4.getResumptionDate()) == null) ? null : yVar.dateConverter.o(resumptionDate, fz.c.DOTTED);
                if (localDateO3 == null) {
                    localDate = localDateO2 == null ? localDateC2 : localDateO2;
                } else {
                    localDate = localDateO3;
                }
                LocalDate localDate4 = (suspensionPeriod == null || (from = suspensionPeriod.getFrom()) == null) ? (LocalDate) sq.a.k(localDateC2, localDate) : from;
                CompanySuspensionOptions suspensionOptions = fVar.getSuspensionOptions();
                if (suspensionPeriod == null || (localDatePlusDays = suspensionPeriod.getTo()) == null) {
                    j16 = j15;
                    localDatePlusDays = localDate4.plusDays(j16);
                } else {
                    j16 = j15;
                }
                LocalDate localDate5 = localDatePlusDays;
                CompanyData companyData5 = fVar.getCompanyData();
                return new hg1.m.e.Suspension(suspensionOptions, localDate4, localDate5, localDate, j16, null, ma1.s.a(companyData5 != null ? companyData5.getCategoryEdition() : null), 32, null);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hg1.m.ErrorInitial c0(y yVar, hg1.m.d dVar) {
                return new hg1.m.ErrorInitial(yVar.errorVMSFactory.a(yVar.C9(new kg1.d.b.GeneralError(new dx.b.Generic(new NullPointerException("CompanySuspensionOptions is null"))))));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final ma1.l entryPoint;
                Object objE = uq.b.e();
                int i15 = this.f84477e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    la1.a aVar = this.f84478f.companyInteractor;
                    this.f84477e = 1;
                    obj = aVar.a(this);
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
                k10.c0<hg1.m.d> c0Var = this.f84479g;
                final y yVar = this.f84478f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: hg1.z
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.c.a.Z(yVar, bVar, (m.d) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final ma1.f fVar = (ma1.f) ((dx.i.Right) iVar).b();
                if (fVar.getSuspensionOptions() == null) {
                    return c0Var.d(new er.l() { // from class: hg1.c0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.c.a.c0(yVar, (m.d) obj2);
                        }
                    });
                }
                CompanyManagementEntryPointContractData companyManagementEntryPointContractDataF1 = yVar.setupData.getContract().f1();
                if (companyManagementEntryPointContractDataF1 == null || (entryPoint = companyManagementEntryPointContractDataF1.getEntryPoint()) == null) {
                    return c0Var.d(new er.l() { // from class: hg1.a0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.c.a.a0(yVar, (m.d) obj2);
                        }
                    });
                }
                yVar.setupData.getContract().t5(new CompanyDetailsContractData(fVar.getCompanyData()));
                final long minSuspensionDays = fVar.getSuspensionOptions().getMinSuspensionDays();
                return c0Var.d(new er.l() { // from class: hg1.b0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.c.a.b0(entryPoint, yVar, fVar, minSuspensionDays, (m.d) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> X(tq.e<?> eVar) {
                return new a(this.f84478f, this.f84479g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends hg1.m>> eVar) {
                return ((a) X(eVar)).J(oq.i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f84475f;
            Object objE = uq.b.e();
            int i15 = this.f84474e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = y.this.callActionWithLoaderUseCase;
            a aVar2 = new a(y.this, c0Var, null);
            this.f84475f = vq.j.a(c0Var);
            this.f84474e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<hg1.m.d> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = y.this.new c(eVar);
            cVar.f84475f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lhg1/m$c;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<k10.c0<hg1.m.GetCitizenData>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f84482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f84483g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f84484h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f84485j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f84486k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lhg1/m;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends hg1.m>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f84488e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f84489f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f84490g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f84491h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f84492j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f84493k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            boolean f84494l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f84495m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ y f84496n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            final /* synthetic */ k10.c0<hg1.m.GetCitizenData> f84497p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            final /* synthetic */ String f84498q;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(y yVar, k10.c0<hg1.m.GetCitizenData> c0Var, String str, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f84496n = yVar;
                this.f84497p = c0Var;
                this.f84498q = str;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hg1.m.ErrorInitialized X(k10.c0 c0Var, y yVar, dx.b bVar, hg1.m.GetCitizenData getCitizenData) {
                return new hg1.m.ErrorInitialized(((hg1.m.GetCitizenData) c0Var.a()).getData(), yVar.errorVMSFactory.a(yVar.C9(new kg1.d.b.GetCitizenData(bVar))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final hg1.m.e Y(hg1.m.e eVar, hg1.m.GetCitizenData getCitizenData) {
                return eVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                final k10.c0<hg1.m.GetCitizenData> c0Var;
                hg1.k.d dVar;
                final hg1.m.e eVar;
                Object objE = uq.b.e();
                int i15 = this.f84495m;
                if (i15 == 0) {
                    oq.u.b(obj);
                    gb1.b bVar = this.f84496n.companyApplicationInteractor;
                    this.f84495m = 1;
                    obj = bVar.a(this);
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
                    eVar = (hg1.m.e) this.f84491h;
                    c0Var = (k10.c0) this.f84489f;
                    oq.u.b(obj);
                }
                return c0Var.d(new er.l() { // from class: hg1.f0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.d.a.Y(eVar, (m.GetCitizenData) obj2);
                    }
                });
                dx.i iVar = (dx.i) obj;
                c0Var = this.f84497p;
                final y yVar = this.f84496n;
                String str = this.f84498q;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: hg1.e0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.d.a.X(c0Var, yVar, bVar2, (m.GetCitizenData) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                CompanyApplicationCitizenData companyApplicationCitizenData = (CompanyApplicationCitizenData) ((dx.i.Right) iVar).b();
                hg1.m.e data = c0Var.a().getData();
                if (data instanceof hg1.m.e.Resumption) {
                    yVar.setupData.getContract().l5(new jg1.d.Resumption(new ResumptionDate(((hg1.m.e.Resumption) data).getStartResumptionDate()), new KnownUserDataModel(companyApplicationCitizenData, str)));
                } else {
                    if (!(data instanceof hg1.m.e.Suspension)) {
                        throw new oq.p();
                    }
                    hg1.m.e.Suspension suspension = (hg1.m.e.Suspension) data;
                    yVar.setupData.getContract().l5(new jg1.d.Suspension(new SuspensionPeriod(suspension.getStartSuspensionDate(), suspension.getEndSuspensionDate()), new KnownUserDataModel(companyApplicationCitizenData, str)));
                }
                hg1.m.e data2 = c0Var.a().getData();
                boolean isPkdCodesUpdateRequired = c0Var.a().getData().getIsPkdCodesUpdateRequired();
                xw.b<hg1.k.d> bVarY1 = yVar.Y1();
                if (isPkdCodesUpdateRequired) {
                    dVar = hg1.k.d.f.f84381a;
                } else {
                    dVar = companyApplicationCitizenData.getPermanentAddress() != null ? hg1.k.d.C1951d.f84376a : hg1.k.d.c.f84375a;
                }
                this.f84488e = vq.j.a(iVar);
                this.f84489f = c0Var;
                this.f84490g = vq.j.a(companyApplicationCitizenData);
                this.f84491h = data2;
                this.f84492j = 0;
                this.f84493k = 0;
                this.f84494l = isPkdCodesUpdateRequired;
                this.f84495m = 2;
                if (bVarY1.F(dVar, this) != objE) {
                    eVar = data2;
                    return c0Var.d(new er.l() { // from class: hg1.f0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return y.d.a.Y(eVar, (m.GetCitizenData) obj2);
                        }
                    });
                }
                return objE;
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f84496n, this.f84497p, this.f84498q, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends hg1.m>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.ErrorInitialized O(k10.c0 c0Var, y yVar, dx.b bVar, hg1.m.GetCitizenData getCitizenData) {
            return new hg1.m.ErrorInitialized(((hg1.m.GetCitizenData) c0Var.a()).getData(), yVar.errorVMSFactory.a(yVar.C9(new kg1.d.b.GeneralError(bVar))));
        }

        /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
        
            if (r12 == r1) goto L21;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f84486k
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f84485j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2b
                if (r2 == r4) goto L27
                if (r2 != r3) goto L1f
                java.lang.Object r0 = r11.f84482f
                java.lang.String r0 = (java.lang.String) r0
                java.lang.Object r0 = r11.f84481e
                dx.i r0 = (dx.i) r0
                oq.u.b(r12)
                goto L93
            L1f:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L27:
                oq.u.b(r12)
                goto L3f
            L2b:
                oq.u.b(r12)
                hg1.y r12 = hg1.y.this
                of1.a r12 = hg1.y.u9(r12)
                r11.f84486k = r0
                r11.f84485j = r4
                java.lang.Object r12 = r12.a(r11)
                if (r12 != r1) goto L3f
                goto L92
            L3f:
                dx.i r12 = (dx.i) r12
                hg1.y r2 = hg1.y.this
                boolean r4 = r12 instanceof dx.i.Left
                if (r4 == 0) goto L59
                dx.i$b r12 = (dx.i.Left) r12
                java.lang.Object r12 = r12.b()
                dx.b r12 = (dx.b) r12
                hg1.d0 r1 = new hg1.d0
                r1.<init>()
                k10.l r12 = r0.d(r1)
                return r12
            L59:
                boolean r4 = r12 instanceof dx.i.Right
                if (r4 == 0) goto L96
                r4 = r12
                dx.i$c r4 = (dx.i.Right) r4
                java.lang.Object r4 = r4.b()
                java.lang.String r4 = (java.lang.String) r4
                ac4.a r5 = hg1.y.r9(r2)
                hg1.y$d$a r7 = new hg1.y$d$a
                r6 = 0
                r7.<init>(r2, r0, r4, r6)
                java.lang.Object r0 = vq.j.a(r0)
                r11.f84486k = r0
                java.lang.Object r12 = vq.j.a(r12)
                r11.f84481e = r12
                java.lang.Object r12 = vq.j.a(r4)
                r11.f84482f = r12
                r12 = 0
                r11.f84483g = r12
                r11.f84484h = r12
                r11.f84485j = r3
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r1) goto L93
            L92:
                return r1
            L93:
                k10.l r12 = (k10.l) r12
                return r12
            L96:
                oq.p r12 = new oq.p
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: hg1.y.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<hg1.m.GetCitizenData> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar) {
            return ((d) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = y.this.new d(eVar);
            dVar.f84486k = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhg1/k$a;", "<unused var>", "Lhg1/m$e$b;", "Loq/i0;", "<anonymous>", "(Lhg1/k$a;Lhg1/m$e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<hg1.k.a, hg1.m.e.Suspension, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84499e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84499e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hg1.k.d> bVarY1 = y.this.Y1();
                hg1.k.d.a aVar = hg1.k.d.a.f84373a;
                this.f84499e = 1;
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
        public final Object w(hg1.k.a aVar, hg1.m.e.Suspension suspension, tq.e<? super oq.i0> eVar) {
            return y.this.new e(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhg1/k$g;", "action", "Lhg1/m$e$b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lhg1/k$g;Lhg1/m$e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<hg1.k.OpenUrl, hg1.m.e.Suspension, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84502f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hg1.k.OpenUrl openUrl = (hg1.k.OpenUrl) this.f84502f;
            Object objE = uq.b.e();
            int i15 = this.f84501e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = y.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f84502f = vq.j.a(openUrl);
                this.f84501e = 1;
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
            y yVar = y.this;
            if (iVar instanceof dx.i.Left) {
                yVar.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(hg1.k.OpenUrl openUrl, hg1.m.e.Suspension suspension, tq.e<? super oq.i0> eVar) {
            f fVar = y.this.new f(eVar);
            fVar.f84502f = openUrl;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhg1/k$h;", "action", "Lk10/c0;", "Lhg1/m$e$b;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lhg1/k$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<hg1.k.SelectSuspensionPeriod, k10.c0<hg1.m.e.Suspension>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84504e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84505f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f84506g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.e.Suspension O(hg1.k.SelectSuspensionPeriod selectSuspensionPeriod, hg1.m.e.Suspension suspension) {
            return selectSuspensionPeriod.getPeriodType() == na1.a.SUSPEND ? hg1.m.e.Suspension.c(suspension, null, null, null, null, 0L, selectSuspensionPeriod.getPeriodType(), false, 91, null) : hg1.m.e.Suspension.c(suspension, null, null, null, null, 0L, selectSuspensionPeriod.getPeriodType(), false, 95, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hg1.k.SelectSuspensionPeriod selectSuspensionPeriod = (hg1.k.SelectSuspensionPeriod) this.f84505f;
            k10.c0 c0Var = (k10.c0) this.f84506g;
            uq.b.e();
            if (this.f84504e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hg1.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.g.O(selectSuspensionPeriod, (m.e.Suspension) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hg1.k.SelectSuspensionPeriod selectSuspensionPeriod, k10.c0<hg1.m.e.Suspension> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar) {
            g gVar = new g(eVar);
            gVar.f84505f = selectSuspensionPeriod;
            gVar.f84506g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhg1/k$j;", "action", "Lk10/c0;", "Lhg1/m$e$b;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lhg1/k$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<hg1.k.SetSuspensionDate, k10.c0<hg1.m.e.Suspension>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84507e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84508f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f84509g;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.e.Suspension O(hg1.k.SetSuspensionDate setSuspensionDate, y yVar, hg1.m.e.Suspension suspension) {
            hg1.n.a.InitializedSuspension.InterfaceC1954a idPicker = setSuspensionDate.getIdPicker();
            if (!fr.t.c(idPicker, hg1.n.a.InitializedSuspension.InterfaceC1954a.C1955a.f84423a)) {
                if (fr.t.c(idPicker, hg1.n.a.InitializedSuspension.InterfaceC1954a.b.f84424a)) {
                    return hg1.m.e.Suspension.c(suspension, null, null, setSuspensionDate.getDate(), null, 0L, null, false, 123, null);
                }
                throw new oq.p();
            }
            LocalDate localDate = (LocalDate) sq.a.k(yVar.currentTimeProvider.c(), setSuspensionDate.getDate().plusDays(suspension.getMinSuspensionDays()));
            LocalDate endSuspensionDate = suspension.getEndSuspensionDate();
            if (endSuspensionDate != null) {
                boolean zIsBefore = endSuspensionDate.isBefore(localDate);
                if (!zIsBefore) {
                    if (zIsBefore) {
                        throw new oq.p();
                    }
                    localDate = endSuspensionDate;
                }
            } else {
                localDate = null;
            }
            return hg1.m.e.Suspension.c(suspension, null, setSuspensionDate.getDate(), localDate, null, 0L, null, false, 121, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hg1.k.SetSuspensionDate setSuspensionDate = (hg1.k.SetSuspensionDate) this.f84508f;
            k10.c0 c0Var = (k10.c0) this.f84509g;
            uq.b.e();
            if (this.f84507e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final y yVar = y.this;
            return c0Var.b(new er.l() { // from class: hg1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.h.O(setSuspensionDate, yVar, (m.e.Suspension) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hg1.k.SetSuspensionDate setSuspensionDate, k10.c0<hg1.m.e.Suspension> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar) {
            h hVar = y.this.new h(eVar);
            hVar.f84508f = setSuspensionDate;
            hVar.f84509g = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhg1/k$f;", "action", "Lhg1/m$e$b;", "state", "Loq/i0;", "<anonymous>", "(Lhg1/k$f;Lhg1/m$e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<hg1.k.OpenDatePicker, hg1.m.e.Suspension, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f84511e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f84512f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f84513g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f84514h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f84515j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f84516k;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(y yVar, hg1.k.OpenDatePicker openDatePicker, LocalDate localDate) {
            yVar.d9(new hg1.k.SetSuspensionDate(localDate, openDatePicker.getIdPicker()));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            oq.r rVarA;
            final hg1.k.OpenDatePicker openDatePicker = (hg1.k.OpenDatePicker) this.f84515j;
            hg1.m.e.Suspension suspension = (hg1.m.e.Suspension) this.f84516k;
            Object objE = uq.b.e();
            int i15 = this.f84514h;
            if (i15 == 0) {
                oq.u.b(obj);
                LocalDate localDateC = y.this.currentTimeProvider.c();
                hg1.n.a.InitializedSuspension.InterfaceC1954a idPicker = openDatePicker.getIdPicker();
                if (fr.t.c(idPicker, hg1.n.a.InitializedSuspension.InterfaceC1954a.C1955a.f84423a)) {
                    rVarA = oq.y.a(suspension.getMinStartSuspensionDate(), suspension.getStartSuspensionDate());
                } else {
                    if (!fr.t.c(idPicker, hg1.n.a.InitializedSuspension.InterfaceC1954a.b.f84424a)) {
                        throw new oq.p();
                    }
                    LocalDate localDate = (LocalDate) sq.a.k(localDateC, suspension.getStartSuspensionDate().plusDays(suspension.getMinSuspensionDays()));
                    LocalDate endSuspensionDate = suspension.getEndSuspensionDate();
                    if (endSuspensionDate == null) {
                        endSuspensionDate = localDate;
                    }
                    rVarA = oq.y.a(localDate, endSuspensionDate);
                }
                LocalDate localDate2 = (LocalDate) rVarA.a();
                LocalDate localDate3 = (LocalDate) rVarA.b();
                xw.b<hg1.k.d> bVarY1 = y.this.Y1();
                final y yVar = y.this;
                hg1.k.d.ShowDataPicker showDataPicker = new hg1.k.d.ShowDataPicker(localDate3, localDate2, null, new er.l() { // from class: hg1.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.i.O(yVar, openDatePicker, (LocalDate) obj2);
                    }
                });
                this.f84515j = vq.j.a(openDatePicker);
                this.f84516k = vq.j.a(suspension);
                this.f84511e = vq.j.a(localDateC);
                this.f84512f = vq.j.a(localDate2);
                this.f84513g = vq.j.a(localDate3);
                this.f84514h = 1;
                if (bVarY1.F(showDataPicker, this) == objE) {
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
        public final Object w(hg1.k.OpenDatePicker openDatePicker, hg1.m.e.Suspension suspension, tq.e<? super oq.i0> eVar) {
            i iVar = y.this.new i(eVar);
            iVar.f84515j = openDatePicker;
            iVar.f84516k = suspension;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhg1/k$e;", "<unused var>", "Lk10/c0;", "Lhg1/m$e$b;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lhg1/k$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<hg1.k.e, k10.c0<hg1.m.e.Suspension>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84518e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84519f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f84520a;

            static {
                int[] iArr = new int[na1.a.values().length];
                try {
                    iArr[na1.a.SUSPEND.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[na1.a.RESUME_WITH_DATA_ADJUSTMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f84520a = iArr;
            }
        }

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.GetCitizenData V(k10.c0 c0Var, hg1.m.e.Suspension suspension) {
            return new hg1.m.GetCitizenData((hg1.m.e) c0Var.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.e.Suspension X(hg1.m.e.Suspension suspension) {
            return hg1.m.e.Suspension.c(suspension, null, null, null, null, 0L, na1.a.NONE, false, 95, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f84519f;
            uq.b.e();
            if (this.f84518e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            na1.a suspensionPeriodSelection = ((hg1.m.e.Suspension) c0Var.a()).getSuspensionPeriodSelection();
            int i15 = suspensionPeriodSelection == null ? -1 : a.f84520a[suspensionPeriodSelection.ordinal()];
            return (i15 == 1 || i15 == 2) ? c0Var.d(new er.l() { // from class: hg1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.j.V(c0Var, (m.e.Suspension) obj2);
                }
            }) : c0Var.b(new er.l() { // from class: hg1.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.j.X((m.e.Suspension) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(hg1.k.e eVar, k10.c0<hg1.m.e.Suspension> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar2) {
            j jVar = new j(eVar2);
            jVar.f84519f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhg1/k$a;", "<unused var>", "Lhg1/m$e$a;", "Loq/i0;", "<anonymous>", "(Lhg1/k$a;Lhg1/m$e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<hg1.k.a, hg1.m.e.Resumption, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84521e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84521e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hg1.k.d> bVarY1 = y.this.Y1();
                hg1.k.d.b bVar = hg1.k.d.b.f84374a;
                this.f84521e = 1;
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
        public final Object w(hg1.k.a aVar, hg1.m.e.Resumption resumption, tq.e<? super oq.i0> eVar) {
            return y.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhg1/k$i;", "action", "Lk10/c0;", "Lhg1/m$e$a;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lhg1/k$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<hg1.k.SetResumptionDate, k10.c0<hg1.m.e.Resumption>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84523e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84524f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f84525g;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.e.Resumption O(hg1.k.SetResumptionDate setResumptionDate, hg1.m.e.Resumption resumption) {
            return hg1.m.e.Resumption.c(resumption, null, setResumptionDate.getDate(), null, false, 13, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final hg1.k.SetResumptionDate setResumptionDate = (hg1.k.SetResumptionDate) this.f84524f;
            k10.c0 c0Var = (k10.c0) this.f84525g;
            uq.b.e();
            if (this.f84523e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: hg1.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.l.O(setResumptionDate, (m.e.Resumption) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hg1.k.SetResumptionDate setResumptionDate, k10.c0<hg1.m.e.Resumption> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar) {
            l lVar = new l(eVar);
            lVar.f84524f = setResumptionDate;
            lVar.f84525g = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lhg1/k$f;", "<unused var>", "Lhg1/m$e$a;", "state", "Loq/i0;", "<anonymous>", "(Lhg1/k$f;Lhg1/m$e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<hg1.k.OpenDatePicker, hg1.m.e.Resumption, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84527f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O(y yVar, LocalDate localDate) {
            yVar.d9(new hg1.k.SetResumptionDate(localDate));
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            hg1.m.e.Resumption resumption = (hg1.m.e.Resumption) this.f84527f;
            Object objE = uq.b.e();
            int i15 = this.f84526e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hg1.k.d> bVarY1 = y.this.Y1();
                LocalDate minResumptionDate = resumption.getMinResumptionDate();
                LocalDate localDateC = y.this.currentTimeProvider.c();
                final y yVar = y.this;
                hg1.k.d.ShowDataPicker showDataPicker = new hg1.k.d.ShowDataPicker(localDateC, minResumptionDate, null, new er.l() { // from class: hg1.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return y.m.O(yVar, (LocalDate) obj2);
                    }
                });
                this.f84527f = vq.j.a(resumption);
                this.f84526e = 1;
                if (bVarY1.F(showDataPicker, this) == objE) {
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
        public final Object w(hg1.k.OpenDatePicker openDatePicker, hg1.m.e.Resumption resumption, tq.e<? super oq.i0> eVar) {
            m mVar = y.this.new m(eVar);
            mVar.f84527f = resumption;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhg1/k$e;", "<unused var>", "Lk10/c0;", "Lhg1/m$e$a;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lhg1/k$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<hg1.k.e, k10.c0<hg1.m.e.Resumption>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84529e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84530f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.GetCitizenData O(k10.c0 c0Var, hg1.m.e.Resumption resumption) {
            return new hg1.m.GetCitizenData((hg1.m.e) c0Var.a());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f84530f;
            uq.b.e();
            if (this.f84529e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hg1.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.n.O(c0Var, (m.e.Resumption) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hg1.k.e eVar, k10.c0<hg1.m.e.Resumption> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar2) {
            n nVar = new n(eVar2);
            nVar.f84530f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhg1/k$c;", "<unused var>", "Lk10/c0;", "Lhg1/m$a;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lhg1/k$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<hg1.k.c, k10.c0<hg1.m.ErrorInitial>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84531e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84532f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.d O(hg1.m.ErrorInitial errorInitial) {
            return hg1.m.d.f84395a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f84532f;
            uq.b.e();
            if (this.f84531e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hg1.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.o.O((m.ErrorInitial) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hg1.k.c cVar, k10.c0<hg1.m.ErrorInitial> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar) {
            o oVar = new o(eVar);
            oVar.f84532f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lhg1/k$a;", "<unused var>", "Lhg1/m$a;", "Loq/i0;", "<anonymous>", "(Lhg1/k$a;Lhg1/m$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<hg1.k.a, hg1.m.ErrorInitial, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84533e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f84533e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<hg1.k.d> bVarY1 = y.this.Y1();
                hg1.k.d.a aVar = hg1.k.d.a.f84373a;
                this.f84533e = 1;
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
        public final Object w(hg1.k.a aVar, hg1.m.ErrorInitial errorInitial, tq.e<? super oq.i0> eVar) {
            return y.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhg1/k$b;", "<unused var>", "Lk10/c0;", "Lhg1/m$b;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lhg1/k$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.q<hg1.k.b, k10.c0<hg1.m.ErrorInitialized>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84535e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84536f;

        q(tq.e<? super q> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.GetCitizenData O(k10.c0 c0Var, hg1.m.ErrorInitialized errorInitialized) {
            return new hg1.m.GetCitizenData(((hg1.m.ErrorInitialized) c0Var.a()).getData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f84536f;
            uq.b.e();
            if (this.f84535e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hg1.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.q.O(c0Var, (m.ErrorInitialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hg1.k.b bVar, k10.c0<hg1.m.ErrorInitialized> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar) {
            q qVar = new q(eVar);
            qVar.f84536f = c0Var;
            return qVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lhg1/k$a;", "<unused var>", "Lk10/c0;", "Lhg1/m$b;", "state", "Lk10/l;", "Lhg1/m;", "<anonymous>", "(Lhg1/k$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<hg1.k.a, k10.c0<hg1.m.ErrorInitialized>, tq.e<? super k10.l<? extends hg1.m>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f84537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f84538f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final hg1.m.e O(k10.c0 c0Var, hg1.m.ErrorInitialized errorInitialized) {
            return ((hg1.m.ErrorInitialized) c0Var.a()).getData();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f84538f;
            uq.b.e();
            if (this.f84537e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: hg1.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return y.r.O(c0Var, (m.ErrorInitialized) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(hg1.k.a aVar, k10.c0<hg1.m.ErrorInitialized> c0Var, tq.e<? super k10.l<? extends hg1.m>> eVar) {
            r rVar = new r(eVar);
            rVar.f84538f = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    public y(yy.a aVar, kg1.j jVar, a14.w wVar, i70.n nVar, la1.a aVar2, gb1.b bVar, ac4.a aVar3, kg1.d dVar, hb4.d dVar2, ez.c cVar, ez.a aVar4, of1.a aVar5, SetupData setupData) {
        this.mapper = jVar;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.companyInteractor = aVar2;
        this.companyApplicationInteractor = bVar;
        this.callActionWithLoaderUseCase = aVar3;
        this.errorMapper = dVar;
        this.errorVMSFactory = dVar2;
        this.dateConverter = cVar;
        this.currentTimeProvider = aVar4;
        this.companySuspensionContainersInteractor = aVar5;
        this.setupData = setupData;
        hg1.m.d dVar3 = hg1.m.d.f84395a;
        this.initialState = dVar3;
        this.stateMachine = aVar.a(dVar3, new er.l() { // from class: hg1.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.I9(this.f84445a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), D9(dVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b C9(kg1.d.b bVar) {
        return this.errorMapper.b(new kg1.d.Params(bVar, b9(hg1.k.c.f84372a), b9(hg1.k.b.f84371a), b9(hg1.k.a.f84370a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hg1.n.a D9(hg1.m state) {
        return this.mapper.b(new kg1.j.Params(state, b9(hg1.k.a.f84370a), b9(hg1.k.e.f84382a), new er.l() { // from class: hg1.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.E9(this.f84442a, (n.a.InitializedSuspension.InterfaceC1954a) obj);
            }
        }, new er.l() { // from class: hg1.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.F9(this.f84443a, (String) obj);
            }
        }, new er.l() { // from class: hg1.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.G9(this.f84444a, (na1.a) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E9(y yVar, hg1.n.a.InitializedSuspension.InterfaceC1954a interfaceC1954a) {
        yVar.d9(new hg1.k.OpenDatePicker(interfaceC1954a));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(y yVar, String str) {
        yVar.d9(new hg1.k.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(y yVar, na1.a aVar) {
        yVar.d9(new hg1.k.SelectSuspensionPeriod(aVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(final y yVar, k10.v vVar) {
        vVar.c(fr.q0.c(hg1.m.d.class), new er.l() { // from class: hg1.o
            @Override // er.l
            public final Object b(Object obj) {
                return y.J9(this.f84433a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hg1.m.GetCitizenData.class), new er.l() { // from class: hg1.p
            @Override // er.l
            public final Object b(Object obj) {
                return y.K9(this.f84434a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hg1.m.e.Suspension.class), new er.l() { // from class: hg1.q
            @Override // er.l
            public final Object b(Object obj) {
                return y.L9(this.f84436a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hg1.m.e.Resumption.class), new er.l() { // from class: hg1.r
            @Override // er.l
            public final Object b(Object obj) {
                return y.M9(this.f84438a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hg1.m.ErrorInitial.class), new er.l() { // from class: hg1.s
            @Override // er.l
            public final Object b(Object obj) {
                return y.N9(this.f84439a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(hg1.m.ErrorInitialized.class), new er.l() { // from class: hg1.t
            @Override // er.l
            public final Object b(Object obj) {
                return y.O9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(y yVar, k10.z zVar) {
        zVar.A(yVar.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(y yVar, k10.z zVar) {
        zVar.A(yVar.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(y yVar, k10.z zVar) {
        e eVar = yVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(hg1.k.a.class), oVar, eVar);
        zVar.x(fr.q0.c(hg1.k.OpenUrl.class), oVar, yVar.new f(null));
        zVar.v(fr.q0.c(hg1.k.SelectSuspensionPeriod.class), oVar, new g(null));
        zVar.v(fr.q0.c(hg1.k.SetSuspensionDate.class), oVar, yVar.new h(null));
        zVar.x(fr.q0.c(hg1.k.OpenDatePicker.class), oVar, yVar.new i(null));
        zVar.v(fr.q0.c(hg1.k.e.class), oVar, new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(y yVar, k10.z zVar) {
        k kVar = yVar.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(hg1.k.a.class), oVar, kVar);
        zVar.v(fr.q0.c(hg1.k.SetResumptionDate.class), oVar, new l(null));
        zVar.x(fr.q0.c(hg1.k.OpenDatePicker.class), oVar, yVar.new m(null));
        zVar.v(fr.q0.c(hg1.k.e.class), oVar, new n(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(y yVar, k10.z zVar) {
        o oVar = new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(hg1.k.c.class), oVar2, oVar);
        zVar.x(fr.q0.c(hg1.k.a.class), oVar2, yVar.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(k10.z zVar) {
        q qVar = new q(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(hg1.k.b.class), oVar, qVar);
        zVar.v(fr.q0.c(hg1.k.a.class), oVar, new r(null));
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: H9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<hg1.k.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<hg1.m, hg1.k> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<hg1.n.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
