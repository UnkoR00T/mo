package v33;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import k23.AttachmentFile;
import k23.BusinessDetailsData;
import k23.DetailsModel;
import k23.OtherReportData;
import k23.PlaceOfPurchaseData;
import k23.ProductData;
import k23.ReportLocationDescription;
import k23.UserDocumentData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import st3.AddressData;
import st3.AddressTerytDetail;
import tt0.BEAttachmentsConfiguration;
import tt0.BEReportCategory;
import tt0.BEReportSubCategory;
import tt0.BESendReportResponse;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bs\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020%0#*\u00020\"H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010)\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020(0#*\u00020\"H\u0002¢\u0006\u0004\b)\u0010'J\u001f\u0010+\u001a\u000e\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020*0#*\u00020\"H\u0002¢\u0006\u0004\b+\u0010'J\u0013\u0010.\u001a\u00020-*\u00020,H\u0002¢\u0006\u0004\b.\u0010/J!\u00105\u001a\u0004\u0018\u0001042\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b5\u00106J\u0013\u00108\u001a\u000207*\u00020$H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010;\u001a\u00020:*\u00020\u0002H\u0002¢\u0006\u0004\b;\u0010<J\u0018\u0010@\u001a\u00020?2\u0006\u0010>\u001a\u00020=H\u0096\u0001¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020?H\u0096\u0001¢\u0006\u0004\bB\u0010CR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010QR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010WR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010YR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R&\u0010g\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR \u0010n\u001a\b\u0012\u0004\u0012\u00020i0h8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bj\u0010k\u001a\u0004\bl\u0010mR \u0010t\u001a\b\u0012\u0004\u0012\u00020:0o8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\br\u0010sR\u001a\u0010x\u001a\b\u0012\u0004\u0012\u00020v0u8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010w¨\u0006y"}, d2 = {"Lv33/d0;", "Ll00/g;", "Lv33/g;", "Lv33/f;", "Lv33/i;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lw33/c;", "mapper", "Lcb4/j;", "dialogVMSFactory", "Lp23/b;", "newReportExitDialogMapper", "Lac4/a;", "callActionWithLoaderUC", "Lm23/a;", "sendReportUC", "Lib4/c;", "genericDomainErrorMapper", "Lhb4/d;", "errorVMSFactory", "Lpx/d;", "remoteLogger", "La14/w;", "openUrlIntentUseCase", "snackBarManagerStateHolder", "Lj23/a;", "sanitaryContainersInteractor", "Lv33/j;", "contract", "<init>", "(Lyy/a;Lw33/c;Lcb4/j;Lp23/b;Lac4/a;Lm23/a;Lib4/c;Lhb4/d;Lpx/d;La14/w;Li70/n;Lj23/a;Lv33/j;)V", "Lv33/h;", "Ldx/i;", "Ldx/b;", "Ltt0/s;", "V9", "(Lv33/h;)Ldx/i;", "Ltt0/s$e;", "W9", "Ltt0/s$h;", "X9", "Lst3/b;", "Ltt0/s$a;", "U9", "(Lst3/b;)Ltt0/s$a;", "Lk23/k;", "providedMethodOfContact", "Lk23/n;", "userDocumentData", "Ltt0/s$b;", "E9", "(Lk23/k;Lk23/n;)Ltt0/s$b;", "Lhb4/c;", "G9", "(Ldx/b;)Lhb4/c;", "Lv33/i$a;", "J9", "(Lv33/g;)Lv33/i$a;", "Lp50/a;", "snackBarData", "Loq/i0;", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lw33/c;", "c", "Lcb4/j;", "d", "Lp23/b;", "e", "Lac4/a;", "f", "Lm23/a;", "g", "Lib4/c;", "h", "Lhb4/d;", "j", "Lpx/d;", "k", "La14/w;", "l", "Li70/n;", "m", "Lj23/a;", "n", "Lv33/j;", "Lv33/g$c$b;", "p", "Loq/k;", "F9", "()Lv33/g$c$b;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lv33/f$e;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d0 extends l00.g<v33.g, v33.f> implements v33.i, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final w33.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p23.b newReportExitDialogMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m23.a sendReportUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final a14.w openUrlIntentUseCase;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final j23.a sanitaryContainersInteractor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final v33.j contract;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<v33.g, v33.f> stateMachine;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final oq.k initialState = oq.l.a(new er.a() { // from class: v33.c0
        @Override // er.a
        public final Object a() {
            return d0.I9(this.f203444a);
        }
    });

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v33.f.e> navAction = new xw.b<>();

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<v33.i.a> state = a9(new b(e9().getState(), this), J9(F9()));

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f203461a;

        static {
            int[] iArr = new int[tt0.e.values().length];
            try {
                iArr[tt0.e.LOCATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tt0.e.PRODUCT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f203461a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<v33.i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f203462a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f203463b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f203464a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ d0 f203465b;

            /* JADX INFO: renamed from: v33.d0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5297a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f203466d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f203467e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f203468f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f203470h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f203471j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f203472k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f203473l;

                public C5297a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f203466d = obj;
                    this.f203467e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, d0 d0Var) {
                this.f203464a = hVar;
                this.f203465b = d0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5297a c5297a;
                if (eVar instanceof C5297a) {
                    c5297a = (C5297a) eVar;
                    int i15 = c5297a.f203467e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5297a.f203467e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5297a = new C5297a(eVar);
                    }
                } else {
                    c5297a = new C5297a(eVar);
                }
                Object obj2 = c5297a.f203466d;
                Object objE = uq.b.e();
                int i16 = c5297a.f203467e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f203464a;
                    v33.i.a aVarJ9 = this.f203465b.J9((v33.g) obj);
                    c5297a.f203468f = vq.j.a(obj);
                    c5297a.f203470h = vq.j.a(c5297a);
                    c5297a.f203471j = vq.j.a(obj);
                    c5297a.f203472k = vq.j.a(hVar);
                    c5297a.f203473l = 0;
                    c5297a.f203467e = 1;
                    if (hVar.F(aVarJ9, c5297a) == objE) {
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

        public b(mu.g gVar, d0 d0Var) {
            this.f203462a = gVar;
            this.f203463b = d0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super v33.i.a> hVar, tq.e eVar) {
            Object objA = this.f203462a.a(new a(hVar, this.f203463b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv33/f$e;", "action", "Lv33/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv33/f$e;Lv33/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<v33.f.e, v33.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203474e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203475f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v33.f.e eVar = (v33.f.e) this.f203475f;
            Object objE = uq.b.e();
            int i15 = this.f203474e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<v33.f.e> bVarY1 = d0.this.Y1();
                this.f203475f = vq.j.a(eVar);
                this.f203474e = 1;
                if (bVarY1.F(eVar, this) == objE) {
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
        public final Object w(v33.f.e eVar, v33.g gVar, tq.e<? super oq.i0> eVar2) {
            c cVar = d0.this.new c(eVar2);
            cVar.f203475f = eVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lv33/f$g;", "action", "Lv33/g;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lv33/f$g;Lv33/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<v33.f.OpenUrl, v33.g, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203477e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203478f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            v33.f.OpenUrl openUrl = (v33.f.OpenUrl) this.f203478f;
            Object objE = uq.b.e();
            int i15 = this.f203477e;
            if (i15 == 0) {
                oq.u.b(obj);
                a14.w wVar = d0.this.openUrlIntentUseCase;
                a14.w.Params params = new a14.w.Params(openUrl.getUrl(), false, 2, null);
                this.f203478f = vq.j.a(openUrl);
                this.f203477e = 1;
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
            d0 d0Var = d0.this;
            if (iVar instanceof dx.i.Left) {
                d0Var.y(new p50.a.DefaultWithIcon(((dx.b.Business) ((dx.i.Left) iVar).b()).getMessage(), false, null, null, 14, null));
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v33.f.OpenUrl openUrl, v33.g gVar, tq.e<? super oq.i0> eVar) {
            d dVar = d0.this.new d(eVar);
            dVar.f203478f = openUrl;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lv33/g$c$b;", "state", "Lk10/l;", "Lv33/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<v33.g.c.Screen>, tq.e<? super k10.l<? extends v33.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203480e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203481f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v33.g.c.Screen O(UserDocumentData userDocumentData, v33.g.c.Screen screen) {
            SummaryForm form = screen.getForm();
            return screen.b(form.a((64511 & 1) != 0 ? form.reportCategoryModel : null, (64511 & 2) != 0 ? form.reportSubType : null, (64511 & 4) != 0 ? form.detailsModel : null, (64511 & 8) != 0 ? form.place : null, (64511 & 16) != 0 ? form.otherReportData : null, (64511 & 32) != 0 ? form.providedMethodOfContact : null, (64511 & 64) != 0 ? form.productData : null, (64511 & 128) != 0 ? form.placeOfPurchaseData : null, (64511 & 256) != 0 ? form.sellerData : null, (64511 & 512) != 0 ? form.supplierData : null, (64511 & 1024) != 0 ? form.userDocumentData : userDocumentData, (64511 & 2048) != 0 ? form.locationDescription : null, (64511 & PKIFailureInfo.certConfirmed) != 0 ? form.isStatementChecked : false, (64511 & PKIFailureInfo.certRevoked) != 0 ? form.showStatementError : false, (64511 & 16384) != 0 ? form.files : null, (64511 & 32768) != 0 ? form.scrollInstance : null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f203481f;
            Object objE = uq.b.e();
            int i15 = this.f203480e;
            if (i15 == 0) {
                oq.u.b(obj);
                j23.a aVar = d0.this.sanitaryContainersInteractor;
                this.f203481f = c0Var;
                this.f203480e = 1;
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
            final UserDocumentData userDocumentData = (UserDocumentData) ((dx.i) obj).a();
            return c0Var.b(new er.l() { // from class: v33.e0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.e.O(userDocumentData, (g.c.Screen) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<v33.g.c.Screen> c0Var, tq.e<? super k10.l<? extends v33.g>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = d0.this.new e(eVar);
            eVar2.f203481f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv33/f$a;", "<unused var>", "Lk10/c0;", "Lv33/g$c$b;", "state", "Lk10/l;", "Lv33/g;", "<anonymous>", "(Lv33/f$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<v33.f.a, k10.c0<v33.g.c.Screen>, tq.e<? super k10.l<? extends v33.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203483e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203484f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v33.g.c.Dialog O(k10.c0 c0Var, d0 d0Var, v33.g.c.Screen screen) {
            return new v33.g.c.Dialog(((v33.g.c.Screen) c0Var.a()).getForm(), d0Var.dialogVMSFactory.a(d0Var.newReportExitDialogMapper.b(new p23.b.Params(d0Var.b9(v33.f.e.b.f203516a), d0Var.b9(v33.f.b.f203512a)))));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f203484f;
            uq.b.e();
            if (this.f203483e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final d0 d0Var = d0.this;
            return c0Var.d(new er.l() { // from class: v33.f0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.f.O(c0Var, d0Var, (g.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v33.f.a aVar, k10.c0<v33.g.c.Screen> c0Var, tq.e<? super k10.l<? extends v33.g>> eVar) {
            f fVar = d0.this.new f(eVar);
            fVar.f203484f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv33/f$f;", "action", "Lk10/c0;", "Lv33/g$c$b;", "state", "Lk10/l;", "Lv33/g;", "<anonymous>", "(Lv33/f$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<v33.f.OnStatementCheckedClicked, k10.c0<v33.g.c.Screen>, tq.e<? super k10.l<? extends v33.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203486e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203487f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f203488g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v33.g.c.Screen O(v33.f.OnStatementCheckedClicked onStatementCheckedClicked, v33.g.c.Screen screen) {
            SummaryForm form = screen.getForm();
            return screen.b(form.a((64511 & 1) != 0 ? form.reportCategoryModel : null, (64511 & 2) != 0 ? form.reportSubType : null, (64511 & 4) != 0 ? form.detailsModel : null, (64511 & 8) != 0 ? form.place : null, (64511 & 16) != 0 ? form.otherReportData : null, (64511 & 32) != 0 ? form.providedMethodOfContact : null, (64511 & 64) != 0 ? form.productData : null, (64511 & 128) != 0 ? form.placeOfPurchaseData : null, (64511 & 256) != 0 ? form.sellerData : null, (64511 & 512) != 0 ? form.supplierData : null, (64511 & 1024) != 0 ? form.userDocumentData : null, (64511 & 2048) != 0 ? form.locationDescription : null, (64511 & PKIFailureInfo.certConfirmed) != 0 ? form.isStatementChecked : onStatementCheckedClicked.getIsChecked(), (64511 & PKIFailureInfo.certRevoked) != 0 ? form.showStatementError : false, (64511 & 16384) != 0 ? form.files : null, (64511 & 32768) != 0 ? form.scrollInstance : null));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final v33.f.OnStatementCheckedClicked onStatementCheckedClicked = (v33.f.OnStatementCheckedClicked) this.f203487f;
            k10.c0 c0Var = (k10.c0) this.f203488g;
            uq.b.e();
            if (this.f203486e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: v33.g0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.g.O(onStatementCheckedClicked, (g.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v33.f.OnStatementCheckedClicked onStatementCheckedClicked, k10.c0<v33.g.c.Screen> c0Var, tq.e<? super k10.l<? extends v33.g>> eVar) {
            g gVar = new g(eVar);
            gVar.f203487f = onStatementCheckedClicked;
            gVar.f203488g = c0Var;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv33/f$h;", "<unused var>", "Lk10/c0;", "Lv33/g$c$b;", "state", "Lk10/l;", "Lv33/g;", "<anonymous>", "(Lv33/f$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<v33.f.h, k10.c0<v33.g.c.Screen>, tq.e<? super k10.l<? extends v33.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203489e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203490f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v33.g.c.Screen V(v33.g.c.Screen screen) {
            SummaryForm form = screen.getForm();
            return screen.b(form.a((64511 & 1) != 0 ? form.reportCategoryModel : null, (64511 & 2) != 0 ? form.reportSubType : null, (64511 & 4) != 0 ? form.detailsModel : null, (64511 & 8) != 0 ? form.place : null, (64511 & 16) != 0 ? form.otherReportData : null, (64511 & 32) != 0 ? form.providedMethodOfContact : null, (64511 & 64) != 0 ? form.productData : null, (64511 & 128) != 0 ? form.placeOfPurchaseData : null, (64511 & 256) != 0 ? form.sellerData : null, (64511 & 512) != 0 ? form.supplierData : null, (64511 & 1024) != 0 ? form.userDocumentData : null, (64511 & 2048) != 0 ? form.locationDescription : null, (64511 & PKIFailureInfo.certConfirmed) != 0 ? form.isStatementChecked : false, (64511 & PKIFailureInfo.certRevoked) != 0 ? form.showStatementError : true, (64511 & 16384) != 0 ? form.files : null, (64511 & 32768) != 0 ? form.scrollInstance : new d60.j(v33.g.a.f203523a)));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v33.g.c.SendingReport X(d0 d0Var, v33.g.c.Screen screen) {
            SummaryForm form = screen.getForm();
            SummaryForm summaryFormA = form.a((64511 & 1) != 0 ? form.reportCategoryModel : null, (64511 & 2) != 0 ? form.reportSubType : null, (64511 & 4) != 0 ? form.detailsModel : null, (64511 & 8) != 0 ? form.place : null, (64511 & 16) != 0 ? form.otherReportData : null, (64511 & 32) != 0 ? form.providedMethodOfContact : null, (64511 & 64) != 0 ? form.productData : null, (64511 & 128) != 0 ? form.placeOfPurchaseData : null, (64511 & 256) != 0 ? form.sellerData : null, (64511 & 512) != 0 ? form.supplierData : null, (64511 & 1024) != 0 ? form.userDocumentData : null, (64511 & 2048) != 0 ? form.locationDescription : null, (64511 & PKIFailureInfo.certConfirmed) != 0 ? form.isStatementChecked : false, (64511 & PKIFailureInfo.certRevoked) != 0 ? form.showStatementError : false, (64511 & 16384) != 0 ? form.files : null, (64511 & 32768) != 0 ? form.scrollInstance : null);
            List<wx.i> listH = d0Var.contract.h();
            ArrayList arrayList = new ArrayList(pq.v.y(listH, 10));
            Iterator<T> it = listH.iterator();
            while (it.hasNext()) {
                arrayList.add(new AttachmentFile((wx.i) it.next(), null, 2, null));
            }
            return new v33.g.c.SendingReport(summaryFormA, arrayList, d0Var.contract.p2());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f203490f;
            uq.b.e();
            if (this.f203489e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            if (!((v33.g.c.Screen) c0Var.a()).getForm().getIsStatementChecked()) {
                return c0Var.b(new er.l() { // from class: v33.h0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.h.V((g.c.Screen) obj2);
                    }
                });
            }
            final d0 d0Var = d0.this;
            return c0Var.d(new er.l() { // from class: v33.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.h.X(d0Var, (g.c.Screen) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(v33.f.h hVar, k10.c0<v33.g.c.Screen> c0Var, tq.e<? super k10.l<? extends v33.g>> eVar) {
            h hVar2 = d0.this.new h(eVar);
            hVar2.f203490f = c0Var;
            return hVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv33/f$b;", "<unused var>", "Lk10/c0;", "Lv33/g$c$a;", "state", "Lk10/l;", "Lv33/g;", "<anonymous>", "(Lv33/f$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<v33.f.b, k10.c0<v33.g.c.Dialog>, tq.e<? super k10.l<? extends v33.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203492e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203493f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v33.g.c.Screen O(k10.c0 c0Var, v33.g.c.Dialog dialog) {
            return new v33.g.c.Screen(((v33.g.c.Dialog) c0Var.a()).getForm());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f203493f;
            uq.b.e();
            if (this.f203492e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v33.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.i.O(c0Var, (g.c.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v33.f.b bVar, k10.c0<v33.g.c.Dialog> c0Var, tq.e<? super k10.l<? extends v33.g>> eVar) {
            i iVar = new i(eVar);
            iVar.f203493f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lv33/g$c$c;", "state", "Lk10/l;", "Lv33/g;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.p<k10.c0<v33.g.c.SendingReport>, tq.e<? super k10.l<? extends v33.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203494e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203495f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lv33/g;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends v33.g>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f203497e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f203498f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d0 f203499g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ k10.c0<v33.g.c.SendingReport> f203500h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d0 d0Var, k10.c0<v33.g.c.SendingReport> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f203499g = d0Var;
                this.f203500h = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final v33.g.c.SendingReportError Y(k10.c0 c0Var, d0 d0Var, dx.b bVar, v33.g.c.SendingReport sendingReport) {
                return new v33.g.c.SendingReportError(sendingReport.getForm(), ((v33.g.c.SendingReport) c0Var.a()).b(), ((v33.g.c.SendingReport) c0Var.a()).getAttachmentsConfiguration(), d0Var.G9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final v33.g.c.SendingReportError Z(m23.a.Result result, d0 d0Var, dx.b bVar, v33.g.c.SendingReport sendingReport) {
                return new v33.g.c.SendingReportError(sendingReport.getForm(), result.b(), result.getUpdatedAttachmentsConfiguration(), d0Var.G9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final v33.g.Success a0(BESendReportResponse bESendReportResponse, v33.g.c.SendingReport sendingReport) {
                return new v33.g.Success(bESendReportResponse);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f203498f;
                BEAttachmentsConfiguration bEAttachmentsConfiguration = null;
                if (i15 == 0) {
                    oq.u.b(obj);
                    dx.i iVarV9 = this.f203499g.V9(this.f203500h.a().getForm());
                    final d0 d0Var = this.f203499g;
                    final k10.c0<v33.g.c.SendingReport> c0Var = this.f203500h;
                    if (iVarV9 instanceof dx.i.Left) {
                        final dx.b bVar = (dx.b) ((dx.i.Left) iVarV9).b();
                        px.d dVar = d0Var.remoteLogger;
                        dx.b.Parsing parsing = bVar instanceof dx.b.Parsing ? (dx.b.Parsing) bVar : null;
                        px.b.y5(dVar, "Sanitary report: failed to create report request", parsing != null ? parsing.getE() : null, null, 4, null);
                        return c0Var.d(new er.l() { // from class: v33.k0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return d0.j.a.Y(c0Var, d0Var, bVar, (g.c.SendingReport) obj2);
                            }
                        });
                    }
                    if (!(iVarV9 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    tt0.s sVar = (tt0.s) ((dx.i.Right) iVarV9).b();
                    m23.a aVar = this.f203499g.sendReportUC;
                    m23.a.Params params = new m23.a.Params(sVar, this.f203500h.a().b(), this.f203500h.a().getAttachmentsConfiguration());
                    this.f203497e = vq.j.a(sVar);
                    this.f203498f = 1;
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
                final m23.a.Result result = (m23.a.Result) obj;
                v33.j jVar = this.f203499g.contract;
                BEAttachmentsConfiguration updatedAttachmentsConfiguration = result.getUpdatedAttachmentsConfiguration();
                List<AttachmentFile> listB = result.b();
                if (!(listB instanceof Collection) || !listB.isEmpty()) {
                    Iterator<T> it = listB.iterator();
                    do {
                        if (!it.hasNext()) {
                            bEAttachmentsConfiguration = updatedAttachmentsConfiguration;
                            break;
                        }
                    } while (((AttachmentFile) it.next()).getUploadedFile() == null);
                } else {
                    bEAttachmentsConfiguration = updatedAttachmentsConfiguration;
                    break;
                }
                jVar.s0(bEAttachmentsConfiguration);
                dx.i<dx.b, BESendReportResponse> iVarA = result.a();
                k10.c0<v33.g.c.SendingReport> c0Var2 = this.f203500h;
                final d0 d0Var2 = this.f203499g;
                if (iVarA instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVarA).b();
                    return c0Var2.d(new er.l() { // from class: v33.l0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return d0.j.a.Z(result, d0Var2, bVar2, (g.c.SendingReport) obj2);
                        }
                    });
                }
                if (!(iVarA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final BESendReportResponse bESendReportResponse = (BESendReportResponse) ((dx.i.Right) iVarA).b();
                return c0Var2.d(new er.l() { // from class: v33.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return d0.j.a.a0(bESendReportResponse, (g.c.SendingReport) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f203499g, this.f203500h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends v33.g>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f203495f;
            Object objE = uq.b.e();
            int i15 = this.f203494e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = d0.this.callActionWithLoaderUC;
            a aVar2 = new a(d0.this, c0Var, null);
            this.f203495f = vq.j.a(c0Var);
            this.f203494e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<v33.g.c.SendingReport> c0Var, tq.e<? super k10.l<? extends v33.g>> eVar) {
            return ((j) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            j jVar = d0.this.new j(eVar);
            jVar.f203495f = obj;
            return jVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv33/f$c;", "<unused var>", "Lk10/c0;", "Lv33/g$c$d;", "state", "Lk10/l;", "Lv33/g;", "<anonymous>", "(Lv33/f$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<v33.f.c, k10.c0<v33.g.c.SendingReportError>, tq.e<? super k10.l<? extends v33.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203501e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203502f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v33.g.c.Screen O(k10.c0 c0Var, v33.g.c.SendingReportError sendingReportError) {
            return new v33.g.c.Screen(((v33.g.c.SendingReportError) c0Var.a()).getForm());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f203502f;
            uq.b.e();
            if (this.f203501e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v33.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.k.O(c0Var, (g.c.SendingReportError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v33.f.c cVar, k10.c0<v33.g.c.SendingReportError> c0Var, tq.e<? super k10.l<? extends v33.g>> eVar) {
            k kVar = new k(eVar);
            kVar.f203502f = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lv33/f$d;", "<unused var>", "Lk10/c0;", "Lv33/g$c$d;", "state", "Lk10/l;", "Lv33/g;", "<anonymous>", "(Lv33/f$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<v33.f.d, k10.c0<v33.g.c.SendingReportError>, tq.e<? super k10.l<? extends v33.g>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f203504f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final v33.g.c.SendingReport O(v33.g.c.SendingReportError sendingReportError) {
            return new v33.g.c.SendingReport(sendingReportError.getForm(), sendingReportError.b(), sendingReportError.getAttachmentsConfiguration());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f203504f;
            uq.b.e();
            if (this.f203503e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: v33.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return d0.l.O((g.c.SendingReportError) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(v33.f.d dVar, k10.c0<v33.g.c.SendingReportError> c0Var, tq.e<? super k10.l<? extends v33.g>> eVar) {
            l lVar = new l(eVar);
            lVar.f203504f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lv33/f$a;", "<unused var>", "Lv33/g$b;", "Loq/i0;", "<anonymous>", "(Lv33/f$a;Lv33/g$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<v33.f.a, v33.g.Success, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f203505e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f203505e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            d0.this.d9(v33.f.e.b.f203516a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(v33.f.a aVar, v33.g.Success success, tq.e<? super oq.i0> eVar) {
            return d0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    public d0(yy.a aVar, w33.c cVar, cb4.j jVar, p23.b bVar, ac4.a aVar2, m23.a aVar3, ib4.c cVar2, hb4.d dVar, px.d dVar2, a14.w wVar, i70.n nVar, j23.a aVar4, v33.j jVar2) {
        this.mapper = cVar;
        this.dialogVMSFactory = jVar;
        this.newReportExitDialogMapper = bVar;
        this.callActionWithLoaderUC = aVar2;
        this.sendReportUC = aVar3;
        this.genericDomainErrorMapper = cVar2;
        this.errorVMSFactory = dVar;
        this.remoteLogger = dVar2;
        this.openUrlIntentUseCase = wVar;
        this.snackBarManagerStateHolder = nVar;
        this.sanitaryContainersInteractor = aVar4;
        this.contract = jVar2;
        this.stateMachine = aVar.a(F9(), new er.l() { // from class: v33.t
            @Override // er.l
            public final Object b(Object obj) {
                return d0.N9(this.f203607a, (k10.v) obj);
            }
        });
    }

    private final tt0.s.ApplicantData E9(k23.k providedMethodOfContact, UserDocumentData userDocumentData) {
        k23.k.Data.PhoneAndEmail phoneAndEmail;
        iy.b0 email;
        k23.k.Data.PhoneAndEmail phoneAndEmail2;
        String strE = null;
        if (fr.t.c(providedMethodOfContact, k23.k.a.f107699a)) {
            return null;
        }
        String firstName = userDocumentData.getFirstName();
        String surname = userDocumentData.getSurname();
        boolean z15 = providedMethodOfContact instanceof k23.k.Data;
        k23.k.Data data = z15 ? (k23.k.Data) providedMethodOfContact : null;
        String edorAddress = data != null ? data.getEdorAddress() : null;
        k23.k.Data data2 = z15 ? (k23.k.Data) providedMethodOfContact : null;
        PhoneNumber phoneNumber = (data2 == null || (phoneAndEmail2 = data2.getPhoneAndEmail()) == null) ? null : phoneAndEmail2.getPhoneNumber();
        k23.k.Data data3 = z15 ? (k23.k.Data) providedMethodOfContact : null;
        if (data3 != null && (phoneAndEmail = data3.getPhoneAndEmail()) != null && (email = phoneAndEmail.getEmail()) != null) {
            strE = iy.c0.e(email);
        }
        return new tt0.s.ApplicantData(firstName, surname, edorAddress, phoneNumber, strE);
    }

    private final v33.g.c.Screen F9() {
        return (v33.g.c.Screen) this.initialState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c G9(dx.b bVar) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: v33.b0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.H9(this.f203442a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H9(d0 d0Var, ib4.c.b bVar) {
        if (fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a) || (bVar instanceof ib4.c.b.a.Primary)) {
            d0Var.d9(v33.f.d.f203514a);
        } else {
            d0Var.d9(v33.f.c.f203513a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v33.g.c.Screen I9(d0 d0Var) {
        Set<k23.c> setA;
        Set<k23.c> setA2;
        PlaceOfPurchaseData placeOfPurchaseDataN = d0Var.contract.N();
        BEReportCategory bEReportCategoryS = d0Var.contract.S();
        BEReportSubCategory bEReportSubCategoryH6 = d0Var.contract.h6();
        DetailsModel detailsModelI0 = d0Var.contract.i0();
        AddressData addressDataO = d0Var.contract.o();
        OtherReportData otherReportDataP0 = d0Var.contract.P0();
        k23.k kVarK0 = d0Var.contract.K0();
        ProductData productDataG0 = d0Var.contract.G0();
        v33.j jVar = d0Var.contract;
        k23.c cVar = k23.c.SELLER;
        BusinessDetailsData businessDetailsDataM0 = jVar.M0(cVar);
        boolean zContains = false;
        if (!((placeOfPurchaseDataN == null || (setA2 = placeOfPurchaseDataN.a()) == null) ? false : setA2.contains(cVar))) {
            businessDetailsDataM0 = null;
        }
        v33.j jVar2 = d0Var.contract;
        k23.c cVar2 = k23.c.SUPPLIER;
        BusinessDetailsData businessDetailsDataM1 = jVar2.M0(cVar2);
        if (placeOfPurchaseDataN != null && (setA = placeOfPurchaseDataN.a()) != null) {
            zContains = setA.contains(cVar2);
        }
        return new v33.g.c.Screen(new SummaryForm(bEReportCategoryS, bEReportSubCategoryH6, detailsModelI0, addressDataO, otherReportDataP0, kVarK0, productDataG0, placeOfPurchaseDataN, businessDetailsDataM0, zContains ? businessDetailsDataM1 : null, null, d0Var.contract.I(), false, false, d0Var.contract.h(), null, 12288, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final v33.i.a J9(v33.g gVar) {
        return this.mapper.b(new w33.c.Params(gVar, new er.l() { // from class: v33.s
            @Override // er.l
            public final Object b(Object obj) {
                return d0.K9(this.f203606a, (String) obj);
            }
        }, b9(v33.f.h.f203520a), b9(v33.f.e.a.f203515a), b9(v33.f.a.f203511a), new er.l() { // from class: v33.u
            @Override // er.l
            public final Object b(Object obj) {
                return d0.L9(this.f203608a, ((Boolean) obj).booleanValue());
            }
        }, b9(v33.f.e.c.f203517a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(d0 d0Var, String str) {
        d0Var.d9(new v33.f.OpenUrl(str));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(d0 d0Var, boolean z15) {
        d0Var.d9(new v33.f.OnStatementCheckedClicked(z15));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(final d0 d0Var, k10.v vVar) {
        vVar.c(fr.q0.c(v33.g.class), new er.l() { // from class: v33.v
            @Override // er.l
            public final Object b(Object obj) {
                return d0.O9(this.f203609a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v33.g.c.Screen.class), new er.l() { // from class: v33.w
            @Override // er.l
            public final Object b(Object obj) {
                return d0.P9(this.f203610a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v33.g.c.Dialog.class), new er.l() { // from class: v33.x
            @Override // er.l
            public final Object b(Object obj) {
                return d0.Q9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v33.g.c.SendingReport.class), new er.l() { // from class: v33.y
            @Override // er.l
            public final Object b(Object obj) {
                return d0.R9(this.f203611a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v33.g.c.SendingReportError.class), new er.l() { // from class: v33.z
            @Override // er.l
            public final Object b(Object obj) {
                return d0.S9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(v33.g.Success.class), new er.l() { // from class: v33.a0
            @Override // er.l
            public final Object b(Object obj) {
                return d0.T9(this.f203441a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(d0 d0Var, k10.z zVar) {
        c cVar = d0Var.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(v33.f.e.class), oVar, cVar);
        zVar.x(fr.q0.c(v33.f.OpenUrl.class), oVar, d0Var.new d(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new e(null));
        f fVar = d0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(v33.f.a.class), oVar, fVar);
        zVar.v(fr.q0.c(v33.f.OnStatementCheckedClicked.class), oVar, new g(null));
        zVar.v(fr.q0.c(v33.f.h.class), oVar, d0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(k10.z zVar) {
        i iVar = new i(null);
        zVar.v(fr.q0.c(v33.f.b.class), k10.o.CANCEL_PREVIOUS, iVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(d0 d0Var, k10.z zVar) {
        zVar.A(d0Var.new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(k10.z zVar) {
        k kVar = new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(v33.f.c.class), oVar, kVar);
        zVar.v(fr.q0.c(v33.f.d.class), oVar, new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(d0 d0Var, k10.z zVar) {
        m mVar = d0Var.new m(null);
        zVar.x(fr.q0.c(v33.f.a.class), k10.o.CANCEL_PREVIOUS, mVar);
        return oq.i0.f148189a;
    }

    private final tt0.s.Address U9(AddressData addressData) {
        String name = addressData.getCity().getName();
        String id5 = addressData.getCity().getId();
        String name2 = addressData.getCommunity().getName();
        String id6 = addressData.getCommunity().getId();
        String name3 = addressData.getCounty().getName();
        String id7 = addressData.getCounty().getId();
        String name4 = addressData.getProvince().getName();
        String id8 = addressData.getProvince().getId();
        String buildingNumber = addressData.getBuildingNumber();
        if (fu.r.t0(buildingNumber)) {
            buildingNumber = null;
        }
        String apartmentNumber = addressData.getApartmentNumber();
        String str = !fu.r.t0(apartmentNumber) ? apartmentNumber : null;
        String postalCode = addressData.getPostalCode();
        String str2 = !fu.r.t0(postalCode) ? postalCode : null;
        AddressTerytDetail street = addressData.getStreet();
        String name5 = street != null ? street.getName() : null;
        AddressTerytDetail street2 = addressData.getStreet();
        return new tt0.s.Address(name, id5, name2, id6, name3, id7, name4, id8, buildingNumber, str, str2, name5, street2 != null ? street2.getId() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final dx.i<dx.b, tt0.s> V9(SummaryForm summaryForm) {
        Object objB;
        tt0.s sVar;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    int i15 = a.f203461a[summaryForm.getReportCategoryModel().getCode().ordinal()];
                    if (i15 == 1) {
                        sVar = (tt0.s) aVar.a(W9(summaryForm));
                    } else {
                        if (i15 != 2) {
                            throw new oq.p();
                        }
                        sVar = (tt0.s) aVar.a(X9(summaryForm));
                    }
                    return new dx.i.Right(sVar);
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    private final dx.i<dx.b, tt0.s.ObjectRequest> W9(SummaryForm summaryForm) {
        Object objB;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BEReportSubCategory reportSubType = summaryForm.getReportSubType();
                    if (reportSubType == null) {
                        aVar.b(new dx.b.Parsing(new Exception("reportSubType is null")));
                        throw new oq.g();
                    }
                    DetailsModel detailsModel = summaryForm.getDetailsModel();
                    if (detailsModel == null) {
                        aVar.b(new dx.b.Parsing(new Exception("detailsModel is null")));
                        throw new oq.g();
                    }
                    ReportLocationDescription locationDescription = summaryForm.getLocationDescription();
                    if (locationDescription == null) {
                        aVar.b(new dx.b.Parsing(new Exception("locationDescription is null")));
                        throw new oq.g();
                    }
                    AddressData place = summaryForm.getPlace();
                    if (place == null) {
                        aVar.b(new dx.b.Parsing(new Exception("place is null")));
                        throw new oq.g();
                    }
                    UserDocumentData userDocumentData = summaryForm.getUserDocumentData();
                    if (userDocumentData == null) {
                        aVar.b(new dx.b.Parsing(new Exception("userDocumentData is null")));
                        throw new oq.g();
                    }
                    k23.k providedMethodOfContact = summaryForm.getProvidedMethodOfContact();
                    if (providedMethodOfContact == null) {
                        aVar.b(new dx.b.Parsing(new Exception("providedMethodOfContact is null")));
                        throw new oq.g();
                    }
                    boolean z15 = locationDescription.getType() == k23.m.CARRIAGE;
                    String code = reportSubType.getCode();
                    String description = detailsModel.getDescription();
                    fz.b.OffsetDateTime offsetDateTimeC = detailsModel.c();
                    String name = locationDescription.getName();
                    if (!z15) {
                        name = null;
                    }
                    String name2 = locationDescription.getName();
                    if (z15) {
                        name2 = null;
                    }
                    tt0.s.LocationData locationData = new tt0.s.LocationData(z15, name2, name, U9(place));
                    boolean z16 = summaryForm.getOtherReportData() != null;
                    OtherReportData otherReportData = summaryForm.getOtherReportData();
                    String institutionName = otherReportData != null ? otherReportData.getInstitutionName() : null;
                    OtherReportData otherReportData2 = summaryForm.getOtherReportData();
                    String reportNumber = otherReportData2 != null ? otherReportData2.getReportNumber() : null;
                    OtherReportData otherReportData3 = summaryForm.getOtherReportData();
                    return new dx.i.Right(new tt0.s.ObjectRequest(code, z16, institutionName, reportNumber, otherReportData3 != null ? otherReportData3.getReportDate() : null, offsetDateTimeC, description, locationData, E9(providedMethodOfContact, userDocumentData)));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }

    private final dx.i<dx.b, tt0.s.ProductRequest> X9(SummaryForm summaryForm) {
        Object objB;
        tt0.s.BusinessDetailsData businessDetailsData;
        tt0.s.BusinessDetailsData businessDetailsData2;
        String nameOrPlace;
        AddressData address;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    BEReportSubCategory reportSubType = summaryForm.getReportSubType();
                    if (reportSubType == null) {
                        aVar.b(new dx.b.Parsing(new Exception("reportSubType is null")));
                        throw new oq.g();
                    }
                    DetailsModel detailsModel = summaryForm.getDetailsModel();
                    if (detailsModel == null) {
                        aVar.b(new dx.b.Parsing(new Exception("detailsModel is null")));
                        throw new oq.g();
                    }
                    UserDocumentData userDocumentData = summaryForm.getUserDocumentData();
                    if (userDocumentData == null) {
                        aVar.b(new dx.b.Parsing(new Exception("userDocumentData is null")));
                        throw new oq.g();
                    }
                    k23.k providedMethodOfContact = summaryForm.getProvidedMethodOfContact();
                    if (providedMethodOfContact == null) {
                        aVar.b(new dx.b.Parsing(new Exception("providedMethodOfContact is null")));
                        throw new oq.g();
                    }
                    ProductData productData = summaryForm.getProductData();
                    if (productData == null) {
                        aVar.b(new dx.b.Parsing(new Exception("productData is null")));
                        throw new oq.g();
                    }
                    PlaceOfPurchaseData placeOfPurchaseData = summaryForm.getPlaceOfPurchaseData();
                    if (placeOfPurchaseData == null) {
                        aVar.b(new dx.b.Parsing(new Exception("placeOfPurchaseData is null")));
                        throw new oq.g();
                    }
                    String code = reportSubType.getCode();
                    String description = detailsModel.getDescription();
                    k23.o webAddressAnswer = placeOfPurchaseData.getWebAddressAnswer();
                    k23.o oVar = k23.o.YES;
                    boolean z15 = true;
                    boolean z16 = webAddressAnswer == oVar;
                    String name = productData.getName();
                    String str = !fu.r.t0(name) ? name : null;
                    String batchNumber = productData.getBatchNumber();
                    String str2 = !fu.r.t0(batchNumber) ? batchNumber : null;
                    String expiryDate = productData.getExpiryDate();
                    String str3 = !fu.r.t0(expiryDate) ? expiryDate : null;
                    BusinessDetailsData supplierData = summaryForm.getSupplierData();
                    if (supplierData != null) {
                        String nameOrPlace2 = supplierData.getNameOrPlace();
                        if (fu.r.t0(nameOrPlace2)) {
                            nameOrPlace2 = null;
                        }
                        businessDetailsData = new tt0.s.BusinessDetailsData(nameOrPlace2, U9(supplierData.getAddress()));
                    } else {
                        businessDetailsData = null;
                    }
                    BusinessDetailsData sellerData = summaryForm.getSellerData();
                    if (sellerData != null) {
                        String nameOrPlace3 = sellerData.getNameOrPlace();
                        if (fu.r.t0(nameOrPlace3)) {
                            nameOrPlace3 = null;
                        }
                        businessDetailsData2 = new tt0.s.BusinessDetailsData(nameOrPlace3, U9(sellerData.getAddress()));
                    } else {
                        businessDetailsData2 = null;
                    }
                    tt0.s.BusinessDetailsData businessDetailsData3 = placeOfPurchaseData.getWebAddressAnswer() == k23.o.NO ? businessDetailsData2 : null;
                    BusinessDetailsData sellerData2 = summaryForm.getSellerData();
                    if (sellerData2 == null || (nameOrPlace = sellerData2.getNameOrPlace()) == null || fu.r.t0(nameOrPlace)) {
                        nameOrPlace = null;
                    }
                    tt0.s.ProductIntervention productIntervention = new tt0.s.ProductIntervention(z16, str2, str3, businessDetailsData, businessDetailsData3, placeOfPurchaseData.getWebAddressAnswer() == oVar ? new tt0.s.OnlineBusinessDetailsData(nameOrPlace, (sellerData2 == null || (address = sellerData2.getAddress()) == null) ? null : U9(address), placeOfPurchaseData.getWebAddress()) : null, str);
                    fz.b.OffsetDateTime offsetDateTimeC = detailsModel.c();
                    if (summaryForm.getOtherReportData() == null) {
                        z15 = false;
                    }
                    OtherReportData otherReportData = summaryForm.getOtherReportData();
                    String institutionName = otherReportData != null ? otherReportData.getInstitutionName() : null;
                    OtherReportData otherReportData2 = summaryForm.getOtherReportData();
                    String reportNumber = otherReportData2 != null ? otherReportData2.getReportNumber() : null;
                    OtherReportData otherReportData3 = summaryForm.getOtherReportData();
                    return new dx.i.Right(new tt0.s.ProductRequest(code, description, z15, institutionName, reportNumber, otherReportData3 != null ? otherReportData3.getReportDate() : null, offsetDateTimeC, productIntervention, null, E9(providedMethodOfContact, userDocumentData), 256, null));
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
                    if (objA instanceof dx.i.Left) {
                        objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
                    } else {
                        if (!(objA instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        objB = ((dx.i.Right) objA).b();
                    }
                    return new dx.i.Left(objB);
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: M9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(v33.j jVar) {
        super.P5(jVar);
    }

    @Override // zx.b
    public xw.b<v33.f.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<v33.g, v33.f> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<v33.i.a> getState() {
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
