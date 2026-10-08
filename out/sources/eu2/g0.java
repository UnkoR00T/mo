package eu2;

import bu2.CompanyDetails;
import bu2.VerificationCheckData;
import bu2.VerifiedStatus;
import iu2.WizardResultData;
import java.time.LocalDate;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006BY\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b$\u0010%J\u0018\u0010(\u001a\u00020#2\u0006\u0010'\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010&H\u0096@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020#2\u0006\u0010-\u001a\u00020,H\u0096@¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010,H\u0096@¢\u0006\u0004\b0\u0010+J\u0018\u00103\u001a\u00020#2\u0006\u00102\u001a\u000201H\u0096@¢\u0006\u0004\b3\u00104J\u0012\u00105\u001a\u0004\u0018\u000101H\u0096@¢\u0006\u0004\b5\u0010+J\u0017\u00108\u001a\u00020#2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020#2\u0006\u0010;\u001a\u00020:H\u0016¢\u0006\u0004\b<\u0010=JA\u0010D\u001a\u00020#2\b\u0010?\u001a\u0004\u0018\u00010>2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020#0@2\b\u0010B\u001a\u0004\u0018\u00010>2\b\u0010C\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bD\u0010ER\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR&\u0010]\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030X8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010d\u001a\b\u0012\u0004\u0012\u00020_0^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010cR \u0010g\u001a\b\u0012\u0004\u0012\u00020e0^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bf\u0010a\u001a\u0004\bP\u0010cR&\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001e0h8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\bi\u0010j\u0012\u0004\bm\u0010n\u001a\u0004\bk\u0010l¨\u0006o"}, d2 = {"Leu2/g0;", "Ll00/g;", "Leu2/c;", "Leu2/a;", "Leu2/d;", "", "Leu2/b;", "Lyy/a;", "stateMachineFactory", "Lfu2/a;", "mapper", "Luu2/b;", "exitDialogMapper", "Lzt2/r;", "saveWizardCompanyDetailsUseCase", "Lzt2/m;", "getWizardCompanyDetailsUseCase", "Lzt2/s;", "saveWizardVerificationCheckDataUseCase", "Lzt2/n;", "getWizardVerificationCheckDataUseCase", "Lzt2/t;", "saveWizardVerifiedStatusUseCase", "Lzt2/o;", "getWizardVerifiedStatusUseCase", "Lzt2/k;", "clearWizardDataUseCase", "<init>", "(Lyy/a;Lfu2/a;Luu2/b;Lzt2/r;Lzt2/m;Lzt2/s;Lzt2/n;Lzt2/t;Lzt2/o;Lzt2/k;)V", "state", "Leu2/d$a;", "t9", "(Leu2/c;)Leu2/d$a;", "Lcu2/i$d;", "destination", "Loq/i0;", "D8", "(Lcu2/i$d;)V", "Lbu2/b;", "companyDetails", "i1", "(Lbu2/b;Ltq/e;)Ljava/lang/Object;", "D6", "(Ltq/e;)Ljava/lang/Object;", "Lbu2/d;", "verificationCheckData", "J", "(Lbu2/d;Ltq/e;)Ljava/lang/Object;", "s", "Lbu2/e;", "verifiedStatus", "w0", "(Lbu2/e;Ltq/e;)Ljava/lang/Object;", "Y", "Liu2/a;", "wizardResultData", "H0", "(Liu2/a;)V", "Ljb4/b;", "errorData", "b0", "(Ljb4/b;)V", "Ljava/time/LocalDate;", "initialDate", "Lkotlin/Function1;", "onDateChange", "minimumDate", "maximumDate", "t0", "(Ljava/time/LocalDate;Ler/l;Ljava/time/LocalDate;Ljava/time/LocalDate;)V", "b", "Lfu2/a;", "c", "Luu2/b;", "d", "Lzt2/r;", "e", "Lzt2/m;", "f", "Lzt2/s;", "g", "Lzt2/n;", "h", "Lzt2/t;", "j", "Lzt2/o;", "k", "Lzt2/k;", "Lk10/t;", "l", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Leu2/a$d;", "m", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Leu2/a$e;", "n", "nestedNavAction", "Lmu/p0;", "p", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "()V", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 extends l00.g<eu2.c, eu2.a> implements eu2.d, zx.d, eu2.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fu2.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uu2.b exitDialogMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final zt2.r saveWizardCompanyDetailsUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final zt2.m getWizardCompanyDetailsUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final zt2.s saveWizardVerificationCheckDataUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final zt2.n getWizardVerificationCheckDataUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final zt2.t saveWizardVerifiedStatusUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final zt2.o getWizardVerifiedStatusUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final zt2.k clearWizardDataUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k10.t<eu2.c, eu2.a> stateMachine;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final xw.b<eu2.a.d> navAction;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<eu2.a.e> nestedNavAction;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<eu2.d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<eu2.d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f53633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ g0 f53634b;

        /* JADX INFO: renamed from: eu2.g0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C1267a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f53635a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ g0 f53636b;

            /* JADX INFO: renamed from: eu2.g0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1268a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f53637d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f53638e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f53639f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f53641h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f53642j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f53643k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f53644l;

                public C1268a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f53637d = obj;
                    this.f53638e |= PKIFailureInfo.systemUnavail;
                    return C1267a.this.F(null, this);
                }
            }

            public C1267a(mu.h hVar, g0 g0Var) {
                this.f53635a = hVar;
                this.f53636b = g0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1268a c1268a;
                if (eVar instanceof C1268a) {
                    c1268a = (C1268a) eVar;
                    int i15 = c1268a.f53638e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1268a.f53638e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1268a = new C1268a(eVar);
                    }
                } else {
                    c1268a = new C1268a(eVar);
                }
                Object obj2 = c1268a.f53637d;
                Object objE = uq.b.e();
                int i16 = c1268a.f53638e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f53635a;
                    eu2.d.Data dataT9 = this.f53636b.t9((eu2.c) obj);
                    c1268a.f53639f = vq.j.a(obj);
                    c1268a.f53641h = vq.j.a(c1268a);
                    c1268a.f53642j = vq.j.a(obj);
                    c1268a.f53643k = vq.j.a(hVar);
                    c1268a.f53644l = 0;
                    c1268a.f53638e = 1;
                    if (hVar.F(dataT9, c1268a) == objE) {
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
            this.f53633a = gVar;
            this.f53634b = g0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super eu2.d.Data> hVar, tq.e eVar) {
            Object objA = this.f53633a.a(new C1267a(hVar, this.f53634b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leu2/a$k;", "action", "Leu2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Leu2/a$k;Leu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<eu2.a.ToDatePicker, eu2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53646f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eu2.a.ToDatePicker toDatePicker = (eu2.a.ToDatePicker) this.f53646f;
            Object objE = uq.b.e();
            int i15 = this.f53645e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eu2.a.d> bVarY1 = g0.this.Y1();
                eu2.a.d.ToDatePicker toDatePicker2 = new eu2.a.d.ToDatePicker(toDatePicker.getInitialDate(), toDatePicker.d(), toDatePicker.getMinimumDate(), toDatePicker.getMaximumDate());
                this.f53646f = vq.j.a(toDatePicker);
                this.f53645e = 1;
                if (bVarY1.F(toDatePicker2, this) == objE) {
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
        public final Object w(eu2.a.ToDatePicker toDatePicker, eu2.c cVar, tq.e<? super oq.i0> eVar) {
            b bVar = g0.this.new b(eVar);
            bVar.f53646f = toDatePicker;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lk10/c0;", "Leu2/c;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<k10.c0<eu2.c>, tq.e<? super k10.l<? extends eu2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53649f;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f53649f;
            Object objE = uq.b.e();
            int i15 = this.f53648e;
            if (i15 == 0) {
                oq.u.b(obj);
                zt2.k kVar = g0.this.clearWizardDataUseCase;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f53649f = c0Var;
                this.f53648e = 1;
                if (kVar.a(c1792a, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<eu2.c> c0Var, tq.e<? super k10.l<? extends eu2.c>> eVar) {
            return ((c) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            c cVar = g0.this.new c(eVar);
            cVar.f53649f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Leu2/a$j;", "action", "Lk10/c0;", "Leu2/c;", "state", "Lk10/l;", "<anonymous>", "(Leu2/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<eu2.a.StepChanged, k10.c0<eu2.c>, tq.e<? super k10.l<? extends eu2.c>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53651e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53652f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f53653g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eu2.c.a Y(eu2.c cVar) {
            return eu2.c.a.f53606a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eu2.c.C1266c Z(eu2.c cVar) {
            return eu2.c.C1266c.f53608a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eu2.c.d a0(eu2.c cVar) {
            return eu2.c.d.f53609a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final eu2.c.b b0(eu2.c cVar) {
            return eu2.c.b.f53607a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eu2.a.StepChanged stepChanged = (eu2.a.StepChanged) this.f53652f;
            k10.c0 c0Var = (k10.c0) this.f53653g;
            uq.b.e();
            if (this.f53651e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            cu2.i.d destination = stepChanged.getDestination();
            if (fr.t.c(destination, cu2.i.d.a.f37982a)) {
                return c0Var.d(new er.l() { // from class: eu2.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.d.Y((c) obj2);
                    }
                });
            }
            if (fr.t.c(destination, cu2.i.d.c.f37986a)) {
                return c0Var.d(new er.l() { // from class: eu2.i0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.d.Z((c) obj2);
                    }
                });
            }
            if (fr.t.c(destination, cu2.i.d.C0806d.f37988a)) {
                return c0Var.d(new er.l() { // from class: eu2.j0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.d.a0((c) obj2);
                    }
                });
            }
            if (fr.t.c(destination, cu2.i.d.b.f37984a)) {
                return c0Var.d(new er.l() { // from class: eu2.k0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return g0.d.b0((c) obj2);
                    }
                });
            }
            throw new oq.p();
        }

        @Override // er.q
        /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
        public final Object w(eu2.a.StepChanged stepChanged, k10.c0<eu2.c> c0Var, tq.e<? super k10.l<? extends eu2.c>> eVar) {
            d dVar = new d(eVar);
            dVar.f53652f = stepChanged;
            dVar.f53653g = c0Var;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leu2/a$g;", "action", "Leu2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Leu2/a$g;Leu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<eu2.a.SaveCompanyContractData, eu2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53655f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eu2.a.SaveCompanyContractData saveCompanyContractData = (eu2.a.SaveCompanyContractData) this.f53655f;
            Object objE = uq.b.e();
            int i15 = this.f53654e;
            if (i15 == 0) {
                oq.u.b(obj);
                zt2.r rVar = g0.this.saveWizardCompanyDetailsUseCase;
                zt2.r.Params params = new zt2.r.Params(saveCompanyContractData.getCompanyDetails());
                this.f53655f = vq.j.a(saveCompanyContractData);
                this.f53654e = 1;
                if (rVar.d(params, this) == objE) {
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
        public final Object w(eu2.a.SaveCompanyContractData saveCompanyContractData, eu2.c cVar, tq.e<? super oq.i0> eVar) {
            e eVar2 = g0.this.new e(eVar);
            eVar2.f53655f = saveCompanyContractData;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leu2/a$h;", "action", "Leu2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Leu2/a$h;Leu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<eu2.a.SaveVerificationCheckData, eu2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53658f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eu2.a.SaveVerificationCheckData saveVerificationCheckData = (eu2.a.SaveVerificationCheckData) this.f53658f;
            Object objE = uq.b.e();
            int i15 = this.f53657e;
            if (i15 == 0) {
                oq.u.b(obj);
                zt2.s sVar = g0.this.saveWizardVerificationCheckDataUseCase;
                zt2.s.Params params = new zt2.s.Params(saveVerificationCheckData.getVerificationCheckData());
                this.f53658f = vq.j.a(saveVerificationCheckData);
                this.f53657e = 1;
                if (sVar.d(params, this) == objE) {
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
        public final Object w(eu2.a.SaveVerificationCheckData saveVerificationCheckData, eu2.c cVar, tq.e<? super oq.i0> eVar) {
            f fVar = g0.this.new f(eVar);
            fVar.f53658f = saveVerificationCheckData;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leu2/a$i;", "action", "Leu2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Leu2/a$i;Leu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<eu2.a.SaveVerifiedStatus, eu2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53661f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eu2.a.SaveVerifiedStatus saveVerifiedStatus = (eu2.a.SaveVerifiedStatus) this.f53661f;
            Object objE = uq.b.e();
            int i15 = this.f53660e;
            if (i15 == 0) {
                oq.u.b(obj);
                zt2.t tVar = g0.this.saveWizardVerifiedStatusUseCase;
                zt2.t.Params params = new zt2.t.Params(saveVerifiedStatus.getVerifiedStatus());
                this.f53661f = vq.j.a(saveVerifiedStatus);
                this.f53660e = 1;
                if (tVar.d(params, this) == objE) {
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
        public final Object w(eu2.a.SaveVerifiedStatus saveVerifiedStatus, eu2.c cVar, tq.e<? super oq.i0> eVar) {
            g gVar = g0.this.new g(eVar);
            gVar.f53661f = saveVerifiedStatus;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leu2/a$f;", "<unused var>", "Leu2/c;", "Loq/i0;", "<anonymous>", "(Leu2/a$f;Leu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<eu2.a.f, eu2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53663e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f53663e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eu2.a.d> bVarY1 = g0.this.Y1();
                eu2.a.d.OpenExitDialog openExitDialog = new eu2.a.d.OpenExitDialog(g0.this.exitDialogMapper.b(new uu2.b.Params(g0.this.b9(eu2.a.b.f53583a))));
                this.f53663e = 1;
                if (bVarY1.F(openExitDialog, this) == objE) {
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
        public final Object w(eu2.a.f fVar, eu2.c cVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new h(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leu2/a$b;", "<unused var>", "Leu2/c;", "Loq/i0;", "<anonymous>", "(Leu2/a$b;Leu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<eu2.a.b, eu2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53665e;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f53665e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eu2.a.d> bVarY1 = g0.this.Y1();
                eu2.a.d.c cVar = eu2.a.d.c.f53587a;
                this.f53665e = 1;
                if (bVarY1.F(cVar, this) == objE) {
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
        public final Object w(eu2.a.b bVar, eu2.c cVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leu2/a$c;", "action", "Leu2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Leu2/a$c;Leu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<eu2.a.GoToResult, eu2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53667e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53668f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eu2.a.GoToResult goToResult = (eu2.a.GoToResult) this.f53668f;
            Object objE = uq.b.e();
            int i15 = this.f53667e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eu2.a.d> bVarY1 = g0.this.Y1();
                eu2.a.d.GoToResult goToResult2 = new eu2.a.d.GoToResult(goToResult.getWizardResultData());
                this.f53668f = vq.j.a(goToResult);
                this.f53667e = 1;
                if (bVarY1.F(goToResult2, this) == objE) {
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
        public final Object w(eu2.a.GoToResult goToResult, eu2.c cVar, tq.e<? super oq.i0> eVar) {
            j jVar = g0.this.new j(eVar);
            jVar.f53668f = goToResult;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Leu2/a$a;", "action", "Leu2/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Leu2/a$a;Leu2/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<eu2.a.Error, eu2.c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f53671f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            eu2.a.Error error = (eu2.a.Error) this.f53671f;
            Object objE = uq.b.e();
            int i15 = this.f53670e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eu2.a.d> bVarY1 = g0.this.Y1();
                eu2.a.d.Error error2 = new eu2.a.d.Error(error.getErrorData());
                this.f53671f = vq.j.a(error);
                this.f53670e = 1;
                if (bVarY1.F(error2, this) == objE) {
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
        public final Object w(eu2.a.Error error, eu2.c cVar, tq.e<? super oq.i0> eVar) {
            k kVar = g0.this.new k(eVar);
            kVar.f53671f = error;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leu2/a$e$a;", "<unused var>", "Leu2/c$a;", "Loq/i0;", "<anonymous>", "(Leu2/a$e$a;Leu2/c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<eu2.a.e.C1265a, eu2.c.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53673e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f53673e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eu2.a.d> bVarY1 = g0.this.Y1();
                eu2.a.d.C1263a c1263a = eu2.a.d.C1263a.f53585a;
                this.f53673e = 1;
                if (bVarY1.F(c1263a, this) == objE) {
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
        public final Object w(eu2.a.e.C1265a c1265a, eu2.c.a aVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leu2/a$e$a;", "<unused var>", "Leu2/c$c;", "Loq/i0;", "<anonymous>", "(Leu2/a$e$a;Leu2/c$c;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<eu2.a.e.C1265a, eu2.c.C1266c, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53675e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f53675e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eu2.a.e> bVarG = g0.this.g();
                eu2.a.e.C1265a c1265a = eu2.a.e.C1265a.f53594a;
                this.f53675e = 1;
                if (bVarG.F(c1265a, this) == objE) {
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
        public final Object w(eu2.a.e.C1265a c1265a, eu2.c.C1266c c1266c, tq.e<? super oq.i0> eVar) {
            return g0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leu2/a$e$a;", "<unused var>", "Leu2/c$d;", "Loq/i0;", "<anonymous>", "(Leu2/a$e$a;Leu2/c$d;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<eu2.a.e.C1265a, eu2.c.d, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53677e;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f53677e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eu2.a.e> bVarG = g0.this.g();
                eu2.a.e.C1265a c1265a = eu2.a.e.C1265a.f53594a;
                this.f53677e = 1;
                if (bVarG.F(c1265a, this) == objE) {
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
        public final Object w(eu2.a.e.C1265a c1265a, eu2.c.d dVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new n(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Leu2/a$e$a;", "<unused var>", "Leu2/c$b;", "Loq/i0;", "<anonymous>", "(Leu2/a$e$a;Leu2/c$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<eu2.a.e.C1265a, eu2.c.b, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f53679e;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f53679e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<eu2.a.e> bVarG = g0.this.g();
                eu2.a.e.C1265a c1265a = eu2.a.e.C1265a.f53594a;
                this.f53679e = 1;
                if (bVarG.F(c1265a, this) == objE) {
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
        public final Object w(eu2.a.e.C1265a c1265a, eu2.c.b bVar, tq.e<? super oq.i0> eVar) {
            return g0.this.new o(eVar).J(oq.i0.f148189a);
        }
    }

    public g0(yy.a aVar, fu2.a aVar2, uu2.b bVar, zt2.r rVar, zt2.m mVar, zt2.s sVar, zt2.n nVar, zt2.t tVar, zt2.o oVar, zt2.k kVar) {
        this.mapper = aVar2;
        this.exitDialogMapper = bVar;
        this.saveWizardCompanyDetailsUseCase = rVar;
        this.getWizardCompanyDetailsUseCase = mVar;
        this.saveWizardVerificationCheckDataUseCase = sVar;
        this.getWizardVerificationCheckDataUseCase = nVar;
        this.saveWizardVerifiedStatusUseCase = tVar;
        this.getWizardVerifiedStatusUseCase = oVar;
        this.clearWizardDataUseCase = kVar;
        eu2.c.a aVar3 = eu2.c.a.f53606a;
        this.stateMachine = aVar.a(aVar3, new er.l() { // from class: eu2.a0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.v9(this.f53604a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.nestedNavAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), t9(aVar3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A9(g0 g0Var, k10.z zVar) {
        o oVar = g0Var.new o(null);
        zVar.x(fr.q0.c(eu2.a.e.C1265a.class), k10.o.CANCEL_PREVIOUS, oVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final eu2.d.Data t9(eu2.c state) {
        return this.mapper.b(new fu2.a.Params(state, b9(eu2.a.e.C1265a.f53594a), b9(eu2.a.f.f53595a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v9(final g0 g0Var, k10.v vVar) {
        vVar.c(fr.q0.c(eu2.c.class), new er.l() { // from class: eu2.b0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.w9(this.f53605a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(eu2.c.a.class), new er.l() { // from class: eu2.c0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.x9(this.f53610a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(eu2.c.C1266c.class), new er.l() { // from class: eu2.d0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.y9(this.f53613a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(eu2.c.d.class), new er.l() { // from class: eu2.e0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.z9(this.f53615a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(eu2.c.b.class), new er.l() { // from class: eu2.f0
            @Override // er.l
            public final Object b(Object obj) {
                return g0.A9(this.f53617a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w9(g0 g0Var, k10.z zVar) {
        zVar.A(g0Var.new c(null));
        d dVar = new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(eu2.a.StepChanged.class), oVar, dVar);
        zVar.x(fr.q0.c(eu2.a.SaveCompanyContractData.class), oVar, g0Var.new e(null));
        zVar.x(fr.q0.c(eu2.a.SaveVerificationCheckData.class), oVar, g0Var.new f(null));
        zVar.x(fr.q0.c(eu2.a.SaveVerifiedStatus.class), oVar, g0Var.new g(null));
        zVar.x(fr.q0.c(eu2.a.f.class), oVar, g0Var.new h(null));
        zVar.x(fr.q0.c(eu2.a.b.class), oVar, g0Var.new i(null));
        zVar.x(fr.q0.c(eu2.a.GoToResult.class), oVar, g0Var.new j(null));
        zVar.x(fr.q0.c(eu2.a.Error.class), oVar, g0Var.new k(null));
        zVar.x(fr.q0.c(eu2.a.ToDatePicker.class), oVar, g0Var.new b(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x9(g0 g0Var, k10.z zVar) {
        l lVar = g0Var.new l(null);
        zVar.x(fr.q0.c(eu2.a.e.C1265a.class), k10.o.CANCEL_PREVIOUS, lVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y9(g0 g0Var, k10.z zVar) {
        m mVar = g0Var.new m(null);
        zVar.x(fr.q0.c(eu2.a.e.C1265a.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z9(g0 g0Var, k10.z zVar) {
        n nVar = g0Var.new n(null);
        zVar.x(fr.q0.c(eu2.a.e.C1265a.class), k10.o.CANCEL_PREVIOUS, nVar);
        return oq.i0.f148189a;
    }

    @Override // eu2.b
    public Object D6(tq.e<? super CompanyDetails> eVar) {
        return this.getWizardCompanyDetailsUseCase.a(gz.b.a.C1792a.f78542a, eVar);
    }

    @Override // eu2.b
    public void D8(cu2.i.d destination) {
        d9(new eu2.a.StepChanged(destination));
    }

    @Override // eu2.b
    public void H0(WizardResultData wizardResultData) {
        d9(new eu2.a.GoToResult(wizardResultData));
    }

    @Override // eu2.b
    public Object J(VerificationCheckData verificationCheckData, tq.e<? super oq.i0> eVar) {
        d9(new eu2.a.SaveVerificationCheckData(verificationCheckData));
        return oq.i0.f148189a;
    }

    @Override // eu2.b
    public Object Y(tq.e<? super VerifiedStatus> eVar) {
        return this.getWizardVerifiedStatusUseCase.a(gz.b.a.C1792a.f78542a, eVar);
    }

    @Override // zx.b
    public xw.b<eu2.a.d> Y1() {
        return this.navAction;
    }

    @Override // eu2.b
    public void b0(jb4.b errorData) {
        d9(new eu2.a.Error(errorData));
    }

    @Override // l00.g
    protected k10.t<eu2.c, eu2.a> e9() {
        return this.stateMachine;
    }

    @Override // eu2.b
    public xw.b<eu2.a.e> g() {
        return this.nestedNavAction;
    }

    @Override // l00.e
    public mu.p0<eu2.d.Data> getState() {
        return this.state;
    }

    @Override // eu2.b
    public Object i1(CompanyDetails companyDetails, tq.e<? super oq.i0> eVar) {
        d9(new eu2.a.SaveCompanyContractData(companyDetails));
        return oq.i0.f148189a;
    }

    @Override // eu2.b
    public Object s(tq.e<? super VerificationCheckData> eVar) {
        return this.getWizardVerificationCheckDataUseCase.a(gz.b.a.C1792a.f78542a, eVar);
    }

    @Override // eu2.b
    public void t0(LocalDate initialDate, er.l<? super LocalDate, oq.i0> onDateChange, LocalDate minimumDate, LocalDate maximumDate) {
        d9(new eu2.a.ToDatePicker(initialDate, onDateChange, minimumDate, maximumDate));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: u9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(oq.i0 i0Var) {
        super.P5(i0Var);
    }

    @Override // eu2.b
    public Object w0(VerifiedStatus verifiedStatus, tq.e<? super oq.i0> eVar) {
        d9(new eu2.a.SaveVerifiedStatus(verifiedStatus));
        return oq.i0.f148189a;
    }
}
