package cy3;

import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import dy3.WebViewResultParam;
import fy3.DeleteCardsRequiredData;
import j30.ButtonTextData;
import java.util.List;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vr0.BECardPaymentProcess;
import vr0.BECardToken;
import vr0.BEStartCardPaymentResponseDomain;
import vw.NavigationDialogModel;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006Bs\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0002H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020,2\u0006\u0010+\u001a\u00020\u001eH\u0016¢\u0006\u0004\b-\u0010.J\u0018\u00101\u001a\u00020,2\u0006\u00100\u001a\u00020/H\u0096\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020,H\u0096\u0001¢\u0006\u0004\b3\u00104R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR&\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030Q8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010]\u001a\b\u0012\u0004\u0012\u00020X0W8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R \u0010\"\u001a\b\u0012\u0004\u0012\u00020#0^8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010f\u001a\b\u0012\u0004\u0012\u00020d0c8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010e¨\u0006g"}, d2 = {"Lcy3/p0;", "Ll00/g;", "Lcy3/f;", "Lcy3/a;", "Lcy3/k;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Lcy3/m;", "mapper", "Lcs0/g;", "startCardPaymentUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lux3/a;", "getCardPaymentInIntervalUseCase", "Liy/a;", "base64Coder", "Lib4/c;", "genericDomainErrorMapper", "Lcs0/f;", "getCardsUseCase", "Lcs0/a;", "abortCardPaymentUseCase", "snackBarManagerStateHolder", "Lmx/c;", "labelProvider", "Lhb4/d;", "errorVMSFactory", "Lcy3/b;", "setupData", "<init>", "(Lyy/a;Lcy3/m;Lcs0/g;Lac4/a;Lux3/a;Liy/a;Lib4/c;Lcs0/f;Lcs0/a;Li70/n;Lmx/c;Lhb4/d;Lcy3/b;)V", "state", "Lcy3/k$a;", "N9", "(Lcy3/f;)Lcy3/k$a;", "Ldx/b;", "domainError", "Lhb4/c;", "L9", "(Ldx/b;)Lhb4/c;", "data", "Loq/i0;", "T9", "(Lcy3/b;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lcy3/m;", "c", "Lcs0/g;", "d", "Lac4/a;", "e", "Lux3/a;", "f", "Liy/a;", "g", "Lib4/c;", "h", "Lcs0/f;", "j", "Lcs0/a;", "k", "Li70/n;", "l", "Lmx/c;", "m", "Lhb4/d;", "n", "Lcy3/b;", "Lcy3/d;", "p", "Lcy3/d;", "initialState", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lcy3/a$e;", "r", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "s", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class p0 extends l00.g<cy3.f, cy3.a> implements cy3.k, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final cy3.m mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cs0.g startCardPaymentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ux3.a getCardPaymentInIntervalUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final cs0.f getCardsUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final cs0.a abortCardPaymentUseCase;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final PaymentCardsSetupData setupData;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final Init initialState;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<cy3.f, cy3.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final xw.b<cy3.a.e> navAction;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<cy3.k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<cy3.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f38643a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ p0 f38644b;

        /* JADX INFO: renamed from: cy3.p0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0830a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f38645a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ p0 f38646b;

            /* JADX INFO: renamed from: cy3.p0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0831a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f38647d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f38648e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f38649f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f38651h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f38652j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f38653k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f38654l;

                public C0831a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f38647d = obj;
                    this.f38648e |= PKIFailureInfo.systemUnavail;
                    return C0830a.this.F(null, this);
                }
            }

            public C0830a(mu.h hVar, p0 p0Var) {
                this.f38645a = hVar;
                this.f38646b = p0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0831a c0831a;
                if (eVar instanceof C0831a) {
                    c0831a = (C0831a) eVar;
                    int i15 = c0831a.f38648e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0831a.f38648e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0831a = new C0831a(eVar);
                    }
                } else {
                    c0831a = new C0831a(eVar);
                }
                Object obj2 = c0831a.f38647d;
                Object objE = uq.b.e();
                int i16 = c0831a.f38648e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f38645a;
                    cy3.k.a aVarN9 = this.f38646b.N9((cy3.f) obj);
                    c0831a.f38649f = vq.j.a(obj);
                    c0831a.f38651h = vq.j.a(c0831a);
                    c0831a.f38652j = vq.j.a(obj);
                    c0831a.f38653k = vq.j.a(hVar);
                    c0831a.f38654l = 0;
                    c0831a.f38648e = 1;
                    if (hVar.F(aVarN9, c0831a) == objE) {
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

        public a(mu.g gVar, p0 p0Var) {
            this.f38643a = gVar;
            this.f38644b = p0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super cy3.k.a> hVar, tq.e eVar) {
            Object objA = this.f38643a.a(new C0830a(hVar, this.f38644b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcy3/a$a;", "<unused var>", "Lcy3/f;", "Loq/i0;", "<anonymous>", "(Lcy3/a$a;Lcy3/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<cy3.a.C0826a, cy3.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38655e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f38655e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cy3.a.e> bVarY1 = p0.this.Y1();
                cy3.a.e.C0827a c0827a = cy3.a.e.C0827a.f38510a;
                this.f38655e = 1;
                if (bVarY1.F(c0827a, this) == objE) {
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
        public final Object w(cy3.a.C0826a c0826a, cy3.f fVar, tq.e<? super oq.i0> eVar) {
            return p0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcy3/a$c;", "action", "Lcy3/i;", "state", "Loq/i0;", "<anonymous>", "(Lcy3/a$c;Lcy3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<cy3.a.GoToResult, cy3.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f38657e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f38658f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f38659g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f38660h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f38661j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f38662k;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38664a;

            static {
                int[] iArr = new int[dy3.b.values().length];
                try {
                    iArr[dy3.b.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[dy3.b.PAYMENT_IN_PROCESSING.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[dy3.b.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f38664a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            my3.f.b success;
            cy3.a.GoToResult goToResult = (cy3.a.GoToResult) this.f38661j;
            cy3.i iVar = (cy3.i) this.f38662k;
            Object objE = uq.b.e();
            int i15 = this.f38660h;
            if (i15 == 0) {
                oq.u.b(obj);
                String sourcePaymentId = iVar.getWebViewResultParam().getPaymentCardRequiredData().getSourcePaymentId();
                Label labelB = mx.b.b(iVar.getWebViewResultParam().getPaymentCardRequiredData().getPaymentTitle(), "paymentTitle");
                Label labelB2 = mx.b.b(iVar.getWebViewResultParam().getPaymentCardRequiredData().getAmountWithCurrency(), "paymentAmount");
                xw.b<cy3.a.e> bVarY1 = p0.this.Y1();
                int i16 = a.f38664a[goToResult.getGoToResultParam().ordinal()];
                if (i16 == 1) {
                    success = new my3.f.b.Success(sourcePaymentId, labelB, labelB2);
                } else if (i16 == 2) {
                    success = new my3.f.b.PaymentInProcessing(sourcePaymentId, labelB, labelB2);
                } else {
                    if (i16 != 3) {
                        throw new oq.p();
                    }
                    success = new my3.f.b.a.Generic(p0.this.mapper.l(), null, sourcePaymentId, labelB, labelB2);
                }
                cy3.a.e.GoToResult goToResult2 = new cy3.a.e.GoToResult(success);
                this.f38661j = vq.j.a(goToResult);
                this.f38662k = vq.j.a(iVar);
                this.f38657e = vq.j.a(sourcePaymentId);
                this.f38658f = vq.j.a(labelB);
                this.f38659g = vq.j.a(labelB2);
                this.f38660h = 1;
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
        public final Object w(cy3.a.GoToResult goToResult, cy3.i iVar, tq.e<? super oq.i0> eVar) {
            c cVar = p0.this.new c(eVar);
            cVar.f38661j = goToResult;
            cVar.f38662k = iVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcy3/i$a;", "<destruct>", "Loq/i0;", "<anonymous>", "(Lcy3/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<cy3.i.Dispatching, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38665e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38666f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cy3.i.Dispatching dispatching = (cy3.i.Dispatching) this.f38666f;
            uq.b.e();
            if (this.f38665e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean isSuccess = dispatching.b().getIsSuccess();
            if (isSuccess) {
                p0.this.d9(cy3.a.q.f38527a);
            } else {
                if (isSuccess) {
                    throw new oq.p();
                }
                p0.this.d9(cy3.a.p.f38526a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(cy3.i.Dispatching dispatching, tq.e<? super oq.i0> eVar) {
            return ((d) v(dispatching, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = p0.this.new d(eVar);
            dVar.f38666f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$q;", "<unused var>", "Lk10/c0;", "Lcy3/i$a;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$q;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<cy3.a.q, k10.c0<cy3.i.Dispatching>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38668e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38669f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cy3.i.Loading O(k10.c0 c0Var, cy3.i.Dispatching dispatching) {
            return new cy3.i.Loading(((cy3.i.Dispatching) c0Var.a()).getWebViewResultParam());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f38669f;
            uq.b.e();
            if (this.f38668e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cy3.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.e.O(c0Var, (i.Dispatching) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.q qVar, k10.c0<cy3.i.Dispatching> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f38669f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcy3/a$p;", "<unused var>", "Lcy3/i$a;", "state", "Loq/i0;", "<anonymous>", "(Lcy3/a$p;Lcy3/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<cy3.a.p, cy3.i.Dispatching, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38671f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f38673e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f38674f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ cy3.i.Dispatching f38675g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, cy3.i.Dispatching dispatching, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f38674f = p0Var;
                this.f38675g = dispatching;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f38673e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cs0.a aVar = this.f38674f.abortCardPaymentUseCase;
                    cs0.a.Params params = new cs0.a.Params(this.f38675g.getWebViewResultParam().getReferenceId(), this.f38675g.getWebViewResultParam().getPaymentCardRequiredData().getInstitutionId());
                    this.f38673e = 1;
                    if (aVar.c(params, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                oq.i0 i0Var = oq.i0.f148189a;
                this.f38674f.d9(new cy3.a.GoToResult(dy3.b.ERROR));
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f38674f, this.f38675g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super oq.i0> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cy3.i.Dispatching dispatching = (cy3.i.Dispatching) this.f38671f;
            Object objE = uq.b.e();
            int i15 = this.f38670e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = p0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(p0.this, dispatching, null);
                this.f38671f = vq.j.a(dispatching);
                this.f38670e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(cy3.a.p pVar, cy3.i.Dispatching dispatching, tq.e<? super oq.i0> eVar) {
            f fVar = p0.this.new f(eVar);
            fVar.f38671f = dispatching;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lcy3/i$c;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<cy3.i.Loading>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38676e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38677f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lcy3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends cy3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f38679e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f38680f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<cy3.i.Loading> f38681g;

            /* JADX INFO: renamed from: cy3.p0$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C0832a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f38682a;

                static {
                    int[] iArr = new int[vr0.d.values().length];
                    try {
                        iArr[vr0.d.ACCEPTED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[vr0.d.PENDING.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[vr0.d.FAILED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[vr0.d.REJECTED.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[vr0.d.UNKNOWN.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    f38682a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, k10.c0<cy3.i.Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f38680f = p0Var;
                this.f38681g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cy3.i.Error V(p0 p0Var, dx.b bVar, k10.c0 c0Var, cy3.i.Loading loading) {
                return new cy3.i.Error(((cy3.i.Loading) c0Var.a()).getWebViewResultParam(), p0Var.L9(bVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f38679e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    ux3.a aVar = this.f38680f.getCardPaymentInIntervalUseCase;
                    ux3.a.Params params = new ux3.a.Params(this.f38681g.a().getWebViewResultParam().getReferenceId(), this.f38681g.a().getWebViewResultParam().getPaymentCardRequiredData().getInstitutionId());
                    this.f38679e = 1;
                    obj = aVar.d(params, this);
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
                final k10.c0<cy3.i.Loading> c0Var = this.f38681g;
                final p0 p0Var = this.f38680f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: cy3.r0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.g.a.V(p0Var, bVar, c0Var, (i.Loading) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                int i16 = C0832a.f38682a[((vr0.d) ((dx.i.Right) iVar).b()).ordinal()];
                if (i16 == 1) {
                    p0Var.d9(new cy3.a.GoToResult(dy3.b.SUCCESS));
                    return c0Var.c();
                }
                if (i16 == 2) {
                    p0Var.d9(new cy3.a.GoToResult(dy3.b.PAYMENT_IN_PROCESSING));
                    return c0Var.c();
                }
                if (i16 != 3 && i16 != 4 && i16 != 5) {
                    throw new oq.p();
                }
                p0Var.d9(new cy3.a.GoToResult(dy3.b.ERROR));
                return c0Var.c();
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f38680f, this.f38681g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends cy3.f>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f38677f;
            Object objE = uq.b.e();
            int i15 = this.f38676e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p0.this, c0Var, null);
            this.f38677f = vq.j.a(c0Var);
            this.f38676e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<cy3.i.Loading> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = p0.this.new g(eVar);
            gVar.f38677f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$b;", "<unused var>", "Lk10/c0;", "Lcy3/i$b;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<cy3.a.b, k10.c0<cy3.i.Error>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38684f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cy3.i.Dispatching O(k10.c0 c0Var, cy3.i.Error error) {
            return new cy3.i.Dispatching(((cy3.i.Error) c0Var.a()).getWebViewResultParam());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f38684f;
            uq.b.e();
            if (this.f38683e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cy3.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.h.O(c0Var, (i.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.b bVar, k10.c0<cy3.i.Error> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            h hVar = new h(eVar);
            hVar.f38684f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$j;", "<unused var>", "Lk10/c0;", "Lcy3/i$b;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<cy3.a.j, k10.c0<cy3.i.Error>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38686f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cy3.i.Loading O(k10.c0 c0Var, cy3.i.Error error) {
            return new cy3.i.Loading(((cy3.i.Error) c0Var.a()).getWebViewResultParam());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f38686f;
            uq.b.e();
            if (this.f38685e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cy3.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.i.O(c0Var, (i.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.j jVar, k10.c0<cy3.i.Error> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            i iVar = new i(eVar);
            iVar.f38686f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$k;", "action", "Lk10/c0;", "Lcy3/d;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<cy3.a.Setup, k10.c0<Init>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38687e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38688f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38689g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Setup O(cy3.a.Setup setup, Init init) {
            return new Setup(setup.getPaymentCardsNavParams());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy3.a.Setup setup = (cy3.a.Setup) this.f38688f;
            k10.c0 c0Var = (k10.c0) this.f38689g;
            uq.b.e();
            if (this.f38687e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cy3.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.j.O(setup, (Init) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.Setup setup, k10.c0<Init> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            j jVar = new j(eVar);
            jVar.f38688f = setup;
            jVar.f38689g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lcy3/e;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<Setup>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38690e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38691f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lcy3/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends cy3.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f38693e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ p0 f38694f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Setup> f38695g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(p0 p0Var, k10.c0<Setup> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f38694f = p0Var;
                this.f38695g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(k10.c0 c0Var, p0 p0Var, dx.b bVar, Setup setup) {
                return new Error(((Setup) c0Var.a()).getPaymentCardsNavParams(), p0Var.L9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final cy3.f.a.Displayed Y(k10.c0 c0Var, List list, Setup setup) {
                return new cy3.f.a.Displayed(((Setup) c0Var.a()).getPaymentCardsNavParams().getPaymentCardRequiredData(), list, ((Setup) c0Var.a()).getPaymentCardsNavParams().getReturnResult());
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f38693e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cs0.f fVar = this.f38694f.getCardsUseCase;
                    cs0.f.Params params = new cs0.f.Params(false);
                    this.f38693e = 1;
                    obj = fVar.c(params, this);
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
                final k10.c0<Setup> c0Var = this.f38695g;
                final p0 p0Var = this.f38694f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: cy3.v0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.k.a.X(c0Var, p0Var, bVar, (Setup) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: cy3.w0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p0.k.a.Y(c0Var, list, (Setup) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f38694f, this.f38695g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends cy3.f>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f38691f;
            Object objE = uq.b.e();
            int i15 = this.f38690e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = p0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(p0.this, c0Var, null);
            this.f38691f = vq.j.a(c0Var);
            this.f38690e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Setup> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = p0.this.new k(eVar);
            kVar.f38691f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcy3/a$b;", "<unused var>", "Lcy3/c;", "Loq/i0;", "<anonymous>", "(Lcy3/a$b;Lcy3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<cy3.a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38696e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f38696e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cy3.a.e> bVarY1 = p0.this.Y1();
                cy3.a.e.C0827a c0827a = cy3.a.e.C0827a.f38510a;
                this.f38696e = 1;
                if (bVarY1.F(c0827a, this) == objE) {
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
        public final Object w(cy3.a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return p0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$j;", "<unused var>", "Lk10/c0;", "Lcy3/c;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<cy3.a.j, k10.c0<Error>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38698e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38699f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Setup O(k10.c0 c0Var, Error error) {
            return new Setup(((Error) c0Var.a()).getPaymentCardsNavParams());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f38699f;
            uq.b.e();
            if (this.f38698e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cy3.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.m.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.j jVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            m mVar = new m(eVar);
            mVar.f38699f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcy3/a$m;", "action", "Lcy3/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcy3/a$m;Lcy3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<cy3.a.ShowSnackBarWithCloseIcon, cy3.f.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38700e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38701f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cy3.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon = (cy3.a.ShowSnackBarWithCloseIcon) this.f38701f;
            uq.b.e();
            if (this.f38700e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.y(new p50.a.DefaultWithIcon(showSnackBarWithCloseIcon.getMessageLabel(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon, cy3.f.a aVar, tq.e<? super oq.i0> eVar) {
            n nVar = p0.this.new n(eVar);
            nVar.f38701f = showSnackBarWithCloseIcon;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcy3/a$l;", "action", "Lcy3/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lcy3/a$l;Lcy3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<cy3.a.ShowSnackBarNoIcon, cy3.f.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38704f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cy3.a.ShowSnackBarNoIcon showSnackBarNoIcon = (cy3.a.ShowSnackBarNoIcon) this.f38704f;
            uq.b.e();
            if (this.f38703e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.y(new p50.a.Default(showSnackBarNoIcon.getMessageLabel(), false, null, 6, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.ShowSnackBarNoIcon showSnackBarNoIcon, cy3.f.a aVar, tq.e<? super oq.i0> eVar) {
            o oVar = p0.this.new o(eVar);
            oVar.f38704f = showSnackBarNoIcon;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcy3/a$d;", "<unused var>", "Lcy3/f$a;", "Loq/i0;", "<anonymous>", "(Lcy3/a$d;Lcy3/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<cy3.a.d, cy3.f.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38706e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f38706e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.B0();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.d dVar, cy3.f.a aVar, tq.e<? super oq.i0> eVar) {
            return p0.this.new p(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lcy3/f$a$a;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<k10.c0<cy3.f.a.Displayed>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38708e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38709f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38711a;

            static {
                int[] iArr = new int[dy3.a.values().length];
                try {
                    iArr[dy3.a.DELETE_CARD_LAST_CARD_REMOVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f38711a = iArr;
            }
        }

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cy3.f.a.Displayed O(cy3.f.a.Displayed displayed) {
            return cy3.f.a.Displayed.d(displayed, null, null, null, 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f38709f;
            uq.b.e();
            if (this.f38708e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dy3.a returnResult = ((cy3.f.a.Displayed) c0Var.a()).getReturnResult();
            if ((returnResult == null ? -1 : a.f38711a[returnResult.ordinal()]) != 1) {
                return c0Var.c();
            }
            p0.this.d9(new cy3.a.ShowSnackBarNoIcon(p0.this.mapper.i()));
            return c0Var.b(new er.l() { // from class: cy3.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.q.O((f.a.Displayed) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<cy3.f.a.Displayed> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            return ((q) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            q qVar = p0.this.new q(eVar);
            qVar.f38709f = obj;
            return qVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcy3/a$o;", "<unused var>", "Lcy3/f$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lcy3/a$o;Lcy3/f$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<cy3.a.o, cy3.f.a.Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38712e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38713f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cy3.f.a.Displayed displayed = (cy3.f.a.Displayed) this.f38713f;
            Object objE = uq.b.e();
            int i15 = this.f38712e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cy3.a.e> bVarY1 = p0.this.Y1();
                cy3.a.e.ToDeleteCards toDeleteCards = new cy3.a.e.ToDeleteCards(new DeleteCardsRequiredData(displayed.getPaymentCardRequiredData(), displayed.c()));
                this.f38713f = vq.j.a(displayed);
                this.f38712e = 1;
                if (bVarY1.F(toDeleteCards, this) == objE) {
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
        public final Object w(cy3.a.o oVar, cy3.f.a.Displayed displayed, tq.e<? super oq.i0> eVar) {
            r rVar = p0.this.new r(eVar);
            rVar.f38713f = displayed;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$n;", "action", "Lk10/c0;", "Lcy3/f$a$a;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$n;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<cy3.a.StartCardPayment, k10.c0<cy3.f.a.Displayed>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38715e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38716f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38717g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(cy3.a.StartCardPayment startCardPayment, k10.c0 c0Var, cy3.f.a.Displayed displayed) {
            return new Loading(startCardPayment.getCardToken(), startCardPayment.getSaveCard(), ((cy3.f.a.Displayed) c0Var.a()).getPaymentCardRequiredData(), ((cy3.f.a.Displayed) c0Var.a()).getReturnResult(), ((cy3.f.a.Displayed) c0Var.a()).c());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final cy3.a.StartCardPayment startCardPayment = (cy3.a.StartCardPayment) this.f38716f;
            final k10.c0 c0Var = (k10.c0) this.f38717g;
            uq.b.e();
            if (this.f38715e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cy3.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.s.O(startCardPayment, c0Var, (f.a.Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.StartCardPayment startCardPayment, k10.c0<cy3.f.a.Displayed> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            s sVar = new s(eVar);
            sVar.f38716f = startCardPayment;
            sVar.f38717g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcy3/a$i;", "action", "Lcy3/f$a$a;", "state", "Loq/i0;", "<anonymous>", "(Lcy3/a$i;Lcy3/f$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<cy3.a.OpenGoToPaymentsDialog, cy3.f.a.Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38718e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38719f;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 O() {
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cy3.a.OpenGoToPaymentsDialog openGoToPaymentsDialog = (cy3.a.OpenGoToPaymentsDialog) this.f38719f;
            Object objE = uq.b.e();
            int i15 = this.f38718e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<cy3.a.e> bVarY1 = p0.this.Y1();
                cy3.a.e.ToPaymentsDialog toPaymentsDialog = new cy3.a.e.ToPaymentsDialog(new NavigationDialogModel(p0.this.labelProvider.c(px3.b.f163151y), p0.this.labelProvider.c(px3.b.f163150x), null, null, null, null, new ButtonTextData(null, p0.this.labelProvider.c(px3.b.Y), null, null, openGoToPaymentsDialog.a(), 13, null), new ButtonTextData(null, p0.this.labelProvider.c(px3.b.f163117a), null, null, new er.a() { // from class: cy3.a1
                    @Override // er.a
                    public final Object a() {
                        return p0.t.O();
                    }
                }, 13, null), 60, null));
                this.f38719f = vq.j.a(openGoToPaymentsDialog);
                this.f38718e = 1;
                if (bVarY1.F(toPaymentsDialog, this) == objE) {
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
        public final Object w(cy3.a.OpenGoToPaymentsDialog openGoToPaymentsDialog, cy3.f.a.Displayed displayed, tq.e<? super oq.i0> eVar) {
            t tVar = p0.this.new t(eVar);
            tVar.f38719f = openGoToPaymentsDialog;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lcy3/h;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f38721e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f38722f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f38723g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f38724h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f38725j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f38727a;

            static {
                int[] iArr = new int[vr0.e.values().length];
                try {
                    iArr[vr0.e.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[vr0.e.CARDS_LIMIT_EXCEEDED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[vr0.e.UNKNOWN.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f38727a = iArr;
            }
        }

        u(tq.e<? super u> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error Z(k10.c0 c0Var, p0 p0Var, dx.b bVar, Loading loading) {
            return new Error(((Loading) c0Var.a()).getCardToken(), ((Loading) c0Var.a()).getSaveCard(), ((Loading) c0Var.a()).getPaymentCardRequiredData(), ((Loading) c0Var.a()).getReturnResult(), p0Var.L9(bVar), ((Loading) c0Var.a()).c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error a0(k10.c0 c0Var, p0 p0Var, Loading loading) {
            return new Error(((Loading) c0Var.a()).getCardToken(), ((Loading) c0Var.a()).getSaveCard(), ((Loading) c0Var.a()).getPaymentCardRequiredData(), ((Loading) c0Var.a()).getReturnResult(), p0Var.L9(new dx.b.Parsing(null, 1, null)), ((Loading) c0Var.a()).c());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Showing b0(BECardPaymentProcess bECardPaymentProcess, p0 p0Var, k10.c0 c0Var, Loading loading) {
            Object objB;
            String transactionId = bECardPaymentProcess.getTransactionId();
            String redirectUrl = bECardPaymentProcess.getRedirectRequest().getRedirectUrl();
            dx.i iVarC = iy.a.c(p0Var.base64Coder, bECardPaymentProcess.getRedirectRequest().getRequestBody(), null, 2, null);
            if (iVarC instanceof dx.i.Left) {
                objB = new byte[0];
            } else {
                if (!(iVarC instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVarC).b();
            }
            return new Showing(transactionId, redirectUrl, new iy.a0((byte[]) objB), ((Loading) c0Var.a()).getPaymentCardRequiredData(), bECardPaymentProcess.getRedirectRequest().d(), bECardPaymentProcess.getRedirectRequest().a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cy3.f.a.Displayed c0(k10.c0 c0Var, Loading loading) {
            return new cy3.f.a.Displayed(((Loading) c0Var.a()).getPaymentCardRequiredData(), ((Loading) c0Var.a()).c(), ((Loading) c0Var.a()).getReturnResult());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error d0(k10.c0 c0Var, p0 p0Var, Loading loading) {
            return new Error(((Loading) c0Var.a()).getCardToken(), ((Loading) c0Var.a()).getSaveCard(), ((Loading) c0Var.a()).getPaymentCardRequiredData(), ((Loading) c0Var.a()).getReturnResult(), p0Var.L9(new dx.b.Parsing(null, 1, null)), ((Loading) c0Var.a()).c());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final p0 p0Var;
            final k10.c0 c0Var = (k10.c0) this.f38725j;
            Object objE = uq.b.e();
            int i15 = this.f38724h;
            if (i15 == 0) {
                oq.u.b(obj);
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                p0 p0Var2 = p0.this;
                cs0.g gVar = p0Var2.startCardPaymentUseCase;
                cs0.g.Params params = new cs0.g.Params(((Loading) c0Var.a()).getPaymentCardRequiredData().getInstitutionId(), ((Loading) c0Var.a()).getPaymentCardRequiredData().c(), ((Loading) c0Var.a()).getCardToken(), vq.b.a(((Loading) c0Var.a()).getSaveCard()), yx3.a.a(displayMetrics.heightPixels, displayMetrics.widthPixels));
                this.f38725j = c0Var;
                this.f38721e = p0Var2;
                this.f38722f = vq.j.a(displayMetrics);
                this.f38723g = 0;
                this.f38724h = 1;
                obj = gVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
                p0Var = p0Var2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p0Var = (p0) this.f38721e;
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: cy3.b1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p0.u.Z(c0Var, p0Var, bVar, (Loading) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            BEStartCardPaymentResponseDomain bEStartCardPaymentResponseDomain = (BEStartCardPaymentResponseDomain) ((dx.i.Right) iVar).b();
            int i16 = a.f38727a[bEStartCardPaymentResponseDomain.getStatus().ordinal()];
            if (i16 == 1) {
                final BECardPaymentProcess process = bEStartCardPaymentResponseDomain.getProcess();
                return process == null ? c0Var.d(new er.l() { // from class: cy3.c1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p0.u.a0(c0Var, p0Var, (Loading) obj2);
                    }
                }) : c0Var.d(new er.l() { // from class: cy3.d1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return p0.u.b0(process, p0Var, c0Var, (Loading) obj2);
                    }
                });
            }
            if (i16 != 2) {
                if (i16 == 3) {
                    return c0Var.d(new er.l() { // from class: cy3.f1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return p0.u.d0(c0Var, p0Var, (Loading) obj2);
                        }
                    });
                }
                throw new oq.p();
            }
            k10.l lVarD = c0Var.d(new er.l() { // from class: cy3.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.u.c0(c0Var, (Loading) obj2);
                }
            });
            p0Var.d9(new cy3.a.ShowSnackBarWithCloseIcon(p0Var.mapper.q()));
            return lVarD;
        }

        @Override // er.p
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            return ((u) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            u uVar = p0.this.new u(eVar);
            uVar.f38725j = obj;
            return uVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$b;", "<unused var>", "Lk10/c0;", "Lcy3/g;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.q<cy3.a.b, k10.c0<Error>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38729f;

        v(tq.e<? super v> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cy3.f.a.Displayed O(k10.c0 c0Var, Error error) {
            return new cy3.f.a.Displayed(((Error) c0Var.a()).getPaymentCardRequiredData(), ((Error) c0Var.a()).c(), ((Error) c0Var.a()).getReturnResult());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f38729f;
            uq.b.e();
            if (this.f38728e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cy3.g1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.v.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            v vVar = new v(eVar);
            vVar.f38729f = c0Var;
            return vVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$j;", "<unused var>", "Lk10/c0;", "Lcy3/g;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<cy3.a.j, k10.c0<Error>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38731f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(k10.c0 c0Var, Error error) {
            return new Loading(((Error) c0Var.a()).getCardToken(), ((Error) c0Var.a()).getSaveCard(), ((Error) c0Var.a()).getPaymentCardRequiredData(), ((Error) c0Var.a()).getReturnResult(), ((Error) c0Var.a()).c());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f38731f;
            uq.b.e();
            if (this.f38730e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: cy3.h1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.w.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.j jVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            w wVar = new w(eVar);
            wVar.f38731f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$g;", "<destruct>", "Lk10/c0;", "Lcy3/j;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<cy3.a.OnResponseReceived, k10.c0<Showing>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38732e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38733f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f38734g;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cy3.i.Dispatching O(Uri uri, k10.c0 c0Var, Showing showing) {
            return new cy3.i.Dispatching(new WebViewResultParam(showing.h().contains(String.valueOf(uri)), ((Showing) c0Var.a()).getId(), ((Showing) c0Var.a()).getPaymentCardRequiredData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            cy3.a.OnResponseReceived onResponseReceived = (cy3.a.OnResponseReceived) this.f38733f;
            final k10.c0 c0Var = (k10.c0) this.f38734g;
            uq.b.e();
            if (this.f38732e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final Uri url = onResponseReceived.getUrl();
            Showing showing = (Showing) c0Var.a();
            return (showing.h().contains(String.valueOf(url)) || showing.e().contains(String.valueOf(url))) ? c0Var.d(new er.l() { // from class: cy3.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.x.O(url, c0Var, (Showing) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.OnResponseReceived onResponseReceived, k10.c0<Showing> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            x xVar = new x(eVar);
            xVar.f38733f = onResponseReceived;
            xVar.f38734g = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcy3/a$f;", "<unused var>", "Lcy3/j;", "state", "Loq/i0;", "<anonymous>", "(Lcy3/a$f;Lcy3/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<cy3.a.f, Showing, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38736f;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Showing showing = (Showing) this.f38736f;
            uq.b.e();
            if (this.f38735e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            p0.this.d9(new cy3.a.OnResponseReceived(Uri.parse((String) pq.v.l0(showing.e()))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.f fVar, Showing showing, tq.e<? super oq.i0> eVar) {
            y yVar = p0.this.new y(eVar);
            yVar.f38736f = showing;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcy3/a$h;", "<unused var>", "Lk10/c0;", "Lcy3/j;", "state", "Lk10/l;", "Lcy3/f;", "<anonymous>", "(Lcy3/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<cy3.a.h, k10.c0<Showing>, tq.e<? super k10.l<? extends cy3.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f38738e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f38739f;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final cy3.i.Error O(k10.c0 c0Var, p0 p0Var, Showing showing) {
            return new cy3.i.Error(new WebViewResultParam(false, ((Showing) c0Var.a()).getId(), ((Showing) c0Var.a()).getPaymentCardRequiredData()), p0Var.L9(new dx.b.g.SslCertificate(false)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f38739f;
            uq.b.e();
            if (this.f38738e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final p0 p0Var = p0.this;
            return c0Var.d(new er.l() { // from class: cy3.j1
                @Override // er.l
                public final Object b(Object obj2) {
                    return p0.z.O(c0Var, p0Var, (Showing) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(cy3.a.h hVar, k10.c0<Showing> c0Var, tq.e<? super k10.l<? extends cy3.f>> eVar) {
            z zVar = p0.this.new z(eVar);
            zVar.f38739f = c0Var;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public p0(yy.a aVar, cy3.m mVar, cs0.g gVar, ac4.a aVar2, ux3.a aVar3, iy.a aVar4, ib4.c cVar, cs0.f fVar, cs0.a aVar5, i70.n nVar, mx.c cVar2, hb4.d dVar, PaymentCardsSetupData paymentCardsSetupData) {
        this.mapper = mVar;
        this.startCardPaymentUseCase = gVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getCardPaymentInIntervalUseCase = aVar3;
        this.base64Coder = aVar4;
        this.genericDomainErrorMapper = cVar;
        this.getCardsUseCase = fVar;
        this.abortCardPaymentUseCase = aVar5;
        this.snackBarManagerStateHolder = nVar;
        this.labelProvider = cVar2;
        this.errorVMSFactory = dVar;
        this.setupData = paymentCardsSetupData;
        Init init = new Init(paymentCardsSetupData.getData());
        this.initialState = init;
        this.stateMachine = aVar.a(init, new er.l() { // from class: cy3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.U9(this.f38552a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), N9(init));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c L9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: cy3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.M9(this.f38547a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(p0 p0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                p0Var.d9(cy3.a.j.f38519a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                p0Var.d9(cy3.a.b.f38507a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final cy3.k.a N9(cy3.f state) {
        return this.mapper.b(new cy3.m.Params(state, b9(cy3.a.C0826a.f38506a), b9(new cy3.a.OpenGoToPaymentsDialog(new er.a() { // from class: cy3.z
            @Override // er.a
            public final Object a() {
                return p0.O9(this.f38765a);
            }
        })), b9(new cy3.a.OpenGoToPaymentsDialog(new er.a() { // from class: cy3.a0
            @Override // er.a
            public final Object a() {
                return p0.P9(this.f38528a);
            }
        })), b9(cy3.a.o.f38525a), b9(cy3.a.d.f38509a), new er.p() { // from class: cy3.b0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return p0.Q9(this.f38530a, (String) obj, (String) obj2);
            }
        }, new er.l() { // from class: cy3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.S9(this.f38536a, (Uri) obj);
            }
        }, b9(cy3.a.f.f38515a), b9(cy3.a.h.f38517a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(p0 p0Var) {
        p0Var.d9(new cy3.a.StartCardPayment(null, true));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(p0 p0Var) {
        p0Var.d9(new cy3.a.StartCardPayment(null, false));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(final p0 p0Var, final String str, final String str2) {
        p0Var.d9(new cy3.a.OpenGoToPaymentsDialog(new er.a() { // from class: cy3.d0
            @Override // er.a
            public final Object a() {
                return p0.R9(this.f38540a, str, str2);
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(p0 p0Var, String str, String str2) {
        p0Var.d9(new cy3.a.StartCardPayment(new BECardToken(str, str2), false));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(p0 p0Var, Uri uri) {
        p0Var.d9(new cy3.a.OnResponseReceived(uri));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(final p0 p0Var, k10.v vVar) {
        vVar.c(fr.q0.c(cy3.f.class), new er.l() { // from class: cy3.v
            @Override // er.l
            public final Object b(Object obj) {
                return p0.V9(this.f38756a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Init.class), new er.l() { // from class: cy3.j0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.W9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Setup.class), new er.l() { // from class: cy3.k0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.aa(this.f38595a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: cy3.l0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ba(this.f38598a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cy3.f.a.class), new er.l() { // from class: cy3.m0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ca(this.f38617a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cy3.f.a.Displayed.class), new er.l() { // from class: cy3.n0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.da(this.f38621a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Loading.class), new er.l() { // from class: cy3.o0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ea(this.f38625a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: cy3.w
            @Override // er.l
            public final Object b(Object obj) {
                return p0.fa((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Showing.class), new er.l() { // from class: cy3.x
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ga(this.f38762a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cy3.i.class), new er.l() { // from class: cy3.y
            @Override // er.l
            public final Object b(Object obj) {
                return p0.ha(this.f38764a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cy3.i.Dispatching.class), new er.l() { // from class: cy3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.X9(this.f38561a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cy3.i.Loading.class), new er.l() { // from class: cy3.h0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Y9(this.f38568a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(cy3.i.Error.class), new er.l() { // from class: cy3.i0
            @Override // er.l
            public final Object b(Object obj) {
                return p0.Z9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 V9(p0 p0Var, k10.z zVar) {
        b bVar = p0Var.new b(null);
        zVar.x(fr.q0.c(cy3.a.C0826a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(k10.z zVar) {
        j jVar = new j(null);
        zVar.v(fr.q0.c(cy3.a.Setup.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(p0 p0Var, k10.z zVar) {
        zVar.C(p0Var.new d(null));
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(cy3.a.q.class), oVar, eVar);
        zVar.x(fr.q0.c(cy3.a.p.class), oVar, p0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(p0 p0Var, k10.z zVar) {
        zVar.A(p0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(cy3.a.b.class), oVar, hVar);
        zVar.v(fr.q0.c(cy3.a.j.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(p0 p0Var, k10.z zVar) {
        zVar.A(p0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(p0 p0Var, k10.z zVar) {
        l lVar = p0Var.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(cy3.a.b.class), oVar, lVar);
        zVar.v(fr.q0.c(cy3.a.j.class), oVar, new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(p0 p0Var, k10.z zVar) {
        n nVar = p0Var.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(cy3.a.ShowSnackBarWithCloseIcon.class), oVar, nVar);
        zVar.x(fr.q0.c(cy3.a.ShowSnackBarNoIcon.class), oVar, p0Var.new o(null));
        zVar.x(fr.q0.c(cy3.a.d.class), oVar, p0Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(p0 p0Var, k10.z zVar) {
        zVar.A(p0Var.new q(null));
        r rVar = p0Var.new r(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(cy3.a.o.class), oVar, rVar);
        zVar.v(fr.q0.c(cy3.a.StartCardPayment.class), oVar, new s(null));
        zVar.x(fr.q0.c(cy3.a.OpenGoToPaymentsDialog.class), oVar, p0Var.new t(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(p0 p0Var, k10.z zVar) {
        zVar.A(p0Var.new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(k10.z zVar) {
        v vVar = new v(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(cy3.a.b.class), oVar, vVar);
        zVar.v(fr.q0.c(cy3.a.j.class), oVar, new w(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(p0 p0Var, k10.z zVar) {
        x xVar = new x(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(cy3.a.OnResponseReceived.class), oVar, xVar);
        zVar.x(fr.q0.c(cy3.a.f.class), oVar, p0Var.new y(null));
        zVar.v(fr.q0.c(cy3.a.h.class), oVar, p0Var.new z(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(p0 p0Var, k10.z zVar) {
        c cVar = p0Var.new c(null);
        zVar.x(fr.q0.c(cy3.a.GoToResult.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: T9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentCardsSetupData data) {
        d9(new cy3.a.Setup(data.getData()));
    }

    @Override // zx.b
    public xw.b<cy3.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<cy3.f, cy3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<cy3.k.a> getState() {
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
