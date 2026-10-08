package d42;

import android.content.res.Resources;
import android.net.Uri;
import android.util.DisplayMetrics;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import e42.WebViewResultParam;
import java.util.List;
import m42.DeleteCardsRequiredData;
import mx.Label;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vr0.BECardPaymentProcess;
import vr0.BECardToken;
import vr0.BEStartCardPaymentResponseDomain;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006B{\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020.2\u0006\u0010-\u001a\u00020 H\u0016¢\u0006\u0004\b/\u00100J\u0018\u00103\u001a\u00020.2\u0006\u00102\u001a\u000201H\u0096\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020.H\u0096\u0001¢\u0006\u0004\b5\u00106R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010\u0019\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010T\u001a\u00020Q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010SR&\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030U8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR \u0010a\u001a\b\u0012\u0004\u0012\u00020\\0[8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R \u0010$\u001a\b\u0012\u0004\u0012\u00020%0b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020h0g8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bE\u0010i¨\u0006k"}, d2 = {"Ld42/o0;", "Ll00/g;", "Ld42/f;", "Ld42/a;", "Ld42/k;", "", "Li70/n;", "Lyy/a;", "stateMachineFactory", "Ld42/m;", "mapper", "Lcs0/g;", "startCardPaymentUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "Lz32/b;", "getCardPaymentInIntervalUseCase", "Liy/a;", "base64Coder", "Lib4/c;", "genericDomainErrorMapper", "Lcs0/f;", "getCardsUseCase", "Lcs0/a;", "abortCardPaymentUseCase", "snackBarManagerStateHolder", "Lmx/c;", "labelProvider", "Lhb4/d;", "errorVMSFactory", "Lcb4/j;", "dialogVMSFactory", "Ld42/b;", "setupData", "<init>", "(Lyy/a;Ld42/m;Lcs0/g;Lac4/a;Lz32/b;Liy/a;Lib4/c;Lcs0/f;Lcs0/a;Li70/n;Lmx/c;Lhb4/d;Lcb4/j;Ld42/b;)V", "state", "Ld42/k$a;", "P9", "(Ld42/f;)Ld42/k$a;", "Ldx/b;", "domainError", "Lhb4/c;", "N9", "(Ldx/b;)Lhb4/c;", "data", "Loq/i0;", "V9", "(Ld42/b;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Ld42/m;", "c", "Lcs0/g;", "d", "Lac4/a;", "e", "Lz32/b;", "f", "Liy/a;", "g", "Lib4/c;", "h", "Lcs0/f;", "j", "Lcs0/a;", "k", "Li70/n;", "l", "Lmx/c;", "m", "Lhb4/d;", "n", "Lcb4/j;", "p", "Ld42/b;", "Ld42/d;", "q", "Ld42/d;", "initialState", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ld42/a$f;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o0 extends l00.g<d42.f, d42.a> implements d42.k, zx.d, i70.n {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d42.m mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cs0.g startCardPaymentUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z32.b getCardPaymentInIntervalUseCase;

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
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final PaymentCardsSetupData setupData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final Init initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<d42.f, d42.a> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<d42.a.f> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<d42.k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d42.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f39872a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o0 f39873b;

        /* JADX INFO: renamed from: d42.o0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0870a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f39874a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f39875b;

            /* JADX INFO: renamed from: d42.o0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0871a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f39876d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f39877e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f39878f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f39880h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f39881j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f39882k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f39883l;

                public C0871a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f39876d = obj;
                    this.f39877e |= PKIFailureInfo.systemUnavail;
                    return C0870a.this.F(null, this);
                }
            }

            public C0870a(mu.h hVar, o0 o0Var) {
                this.f39874a = hVar;
                this.f39875b = o0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0871a c0871a;
                if (eVar instanceof C0871a) {
                    c0871a = (C0871a) eVar;
                    int i15 = c0871a.f39877e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0871a.f39877e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0871a = new C0871a(eVar);
                    }
                } else {
                    c0871a = new C0871a(eVar);
                }
                Object obj2 = c0871a.f39876d;
                Object objE = uq.b.e();
                int i16 = c0871a.f39877e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f39874a;
                    d42.k.a aVarP9 = this.f39875b.P9((d42.f) obj);
                    c0871a.f39878f = vq.j.a(obj);
                    c0871a.f39880h = vq.j.a(c0871a);
                    c0871a.f39881j = vq.j.a(obj);
                    c0871a.f39882k = vq.j.a(hVar);
                    c0871a.f39883l = 0;
                    c0871a.f39877e = 1;
                    if (hVar.F(aVarP9, c0871a) == objE) {
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

        public a(mu.g gVar, o0 o0Var) {
            this.f39872a = gVar;
            this.f39873b = o0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super d42.k.a> hVar, tq.e eVar) {
            Object objA = this.f39872a.a(new C0870a(hVar, this.f39873b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$i;", "<unused var>", "Lk10/c0;", "Ld42/j;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$i;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class a0 extends vq.k implements er.q<d42.a.i, k10.c0<Showing>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39884e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39885f;

        a0(tq.e<? super a0> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d42.i.Error O(k10.c0 c0Var, o0 o0Var, Showing showing) {
            return new d42.i.Error(new WebViewResultParam(false, ((Showing) c0Var.a()).getId(), ((Showing) c0Var.a()).getPaymentCardRequiredData()), o0Var.N9(new dx.b.g.SslCertificate(false)));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f39885f;
            uq.b.e();
            if (this.f39884e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o0 o0Var = o0.this;
            return c0Var.d(new er.l() { // from class: d42.j1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.a0.O(c0Var, o0Var, (Showing) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.i iVar, k10.c0<Showing> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            a0 a0Var = o0.this.new a0(eVar);
            a0Var.f39885f = c0Var;
            return a0Var.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld42/a$a;", "<unused var>", "Ld42/f;", "Loq/i0;", "<anonymous>", "(Ld42/a$a;Ld42/f;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<d42.a.C0866a, d42.f, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39887e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f39887e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<d42.a.f> bVarY1 = o0.this.Y1();
                d42.a.f.C0867a c0867a = d42.a.f.C0867a.f39739a;
                this.f39887e = 1;
                if (bVarY1.F(c0867a, this) == objE) {
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
        public final Object w(d42.a.C0866a c0866a, d42.f fVar, tq.e<? super oq.i0> eVar) {
            return o0.this.new b(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld42/a$c;", "action", "Ld42/i;", "state", "Loq/i0;", "<anonymous>", "(Ld42/a$c;Ld42/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<d42.a.GoToResult, d42.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f39889e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f39890f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f39891g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f39892h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f39893j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f39894k;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39896a;

            static {
                int[] iArr = new int[e42.a.values().length];
                try {
                    iArr[e42.a.SUCCESS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[e42.a.INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[e42.a.ERROR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f39896a = iArr;
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
            	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
            	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
            	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
            	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 269
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: d42.o0.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.GoToResult goToResult, d42.i iVar, tq.e<? super oq.i0> eVar) {
            c cVar = o0.this.new c(eVar);
            cVar.f39893j = goToResult;
            cVar.f39894k = iVar;
            return cVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ld42/i$a;", "<destruct>", "Loq/i0;", "<anonymous>", "(Ld42/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<d42.i.Dispatching, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39897e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39898f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d42.i.Dispatching dispatching = (d42.i.Dispatching) this.f39898f;
            uq.b.e();
            if (this.f39897e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            boolean isSuccess = dispatching.d().getIsSuccess();
            if (isSuccess) {
                o0.this.d9(d42.a.r.f39754a);
            } else {
                if (isSuccess) {
                    throw new oq.p();
                }
                o0.this.d9(d42.a.q.f39753a);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(d42.i.Dispatching dispatching, tq.e<? super oq.i0> eVar) {
            return ((d) v(dispatching, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = o0.this.new d(eVar);
            dVar.f39898f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$r;", "<unused var>", "Lk10/c0;", "Ld42/i$a;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$r;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<d42.a.r, k10.c0<d42.i.Dispatching>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39901f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d42.i.Loading O(k10.c0 c0Var, d42.i.Dispatching dispatching) {
            return new d42.i.Loading(((d42.i.Dispatching) c0Var.a()).getWebViewResultParam());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f39901f;
            uq.b.e();
            if (this.f39900e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d42.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.e.O(c0Var, (i.Dispatching) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.r rVar, k10.c0<d42.i.Dispatching> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f39901f = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld42/a$q;", "<unused var>", "Ld42/i$a;", "state", "Loq/i0;", "<anonymous>", "(Ld42/a$q;Ld42/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<d42.a.q, d42.i.Dispatching, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39902e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39903f;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f39905e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ o0 f39906f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ d42.i.Dispatching f39907g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, d42.i.Dispatching dispatching, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f39906f = o0Var;
                this.f39907g = dispatching;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f39905e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cs0.a aVar = this.f39906f.abortCardPaymentUseCase;
                    cs0.a.Params params = new cs0.a.Params(this.f39907g.getWebViewResultParam().getReferenceId(), this.f39907g.getWebViewResultParam().getPaymentCardRequiredData().getInstitutionId());
                    this.f39905e = 1;
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
                this.f39906f.d9(new d42.a.GoToResult(e42.a.ERROR));
                return oq.i0.f148189a;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f39906f, this.f39907g, eVar);
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
            d42.i.Dispatching dispatching = (d42.i.Dispatching) this.f39903f;
            Object objE = uq.b.e();
            int i15 = this.f39902e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = o0.this.callActionWithLoaderUseCase;
                a aVar2 = new a(o0.this, dispatching, null);
                this.f39903f = vq.j.a(dispatching);
                this.f39902e = 1;
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
        public final Object w(d42.a.q qVar, d42.i.Dispatching dispatching, tq.e<? super oq.i0> eVar) {
            f fVar = o0.this.new f(eVar);
            fVar.f39903f = dispatching;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ld42/i$c;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.p<k10.c0<d42.i.Loading>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39908e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39909f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ld42/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends d42.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f39911e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ o0 f39912f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<d42.i.Loading> f39913g;

            /* JADX INFO: renamed from: d42.o0$g$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final /* synthetic */ class C0872a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f39914a;

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
                    f39914a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, k10.c0<d42.i.Loading> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f39912f = o0Var;
                this.f39913g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final d42.i.Error V(o0 o0Var, dx.b bVar, k10.c0 c0Var, d42.i.Loading loading) {
                return new d42.i.Error(((d42.i.Loading) c0Var.a()).getWebViewResultParam(), o0Var.N9(bVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f39911e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    z32.b bVar = this.f39912f.getCardPaymentInIntervalUseCase;
                    z32.b.Params params = new z32.b.Params(this.f39913g.a().getWebViewResultParam().getReferenceId(), this.f39913g.a().getWebViewResultParam().getPaymentCardRequiredData().getInstitutionId());
                    this.f39911e = 1;
                    obj = bVar.d(params, this);
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
                final k10.c0<d42.i.Loading> c0Var = this.f39913g;
                final o0 o0Var = this.f39912f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar2 = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: d42.q0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.g.a.V(o0Var, bVar2, c0Var, (i.Loading) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                int i16 = C0872a.f39914a[((vr0.d) ((dx.i.Right) iVar).b()).ordinal()];
                if (i16 == 1) {
                    o0Var.d9(new d42.a.GoToResult(e42.a.SUCCESS));
                    return c0Var.c();
                }
                if (i16 == 2) {
                    o0Var.d9(new d42.a.GoToResult(e42.a.INFO));
                    return c0Var.c();
                }
                if (i16 != 3 && i16 != 4 && i16 != 5) {
                    throw new oq.p();
                }
                o0Var.d9(new d42.a.GoToResult(e42.a.ERROR));
                return c0Var.c();
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f39912f, this.f39913g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends d42.f>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f39909f;
            Object objE = uq.b.e();
            int i15 = this.f39908e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = o0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(o0.this, c0Var, null);
            this.f39909f = vq.j.a(c0Var);
            this.f39908e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<d42.i.Loading> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            return ((g) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            g gVar = o0.this.new g(eVar);
            gVar.f39909f = obj;
            return gVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$b;", "<unused var>", "Lk10/c0;", "Ld42/i$b;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<d42.a.b, k10.c0<d42.i.Error>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39915e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39916f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d42.i.Dispatching O(k10.c0 c0Var, d42.i.Error error) {
            return new d42.i.Dispatching(((d42.i.Error) c0Var.a()).getWebViewResultParam());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f39916f;
            uq.b.e();
            if (this.f39915e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d42.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.h.O(c0Var, (i.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.b bVar, k10.c0<d42.i.Error> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            h hVar = new h(eVar);
            hVar.f39916f = c0Var;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$k;", "<unused var>", "Lk10/c0;", "Ld42/i$b;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<d42.a.k, k10.c0<d42.i.Error>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39917e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39918f;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d42.i.Loading O(k10.c0 c0Var, d42.i.Error error) {
            return new d42.i.Loading(((d42.i.Error) c0Var.a()).getWebViewResultParam());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f39918f;
            uq.b.e();
            if (this.f39917e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d42.s0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.i.O(c0Var, (i.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.k kVar, k10.c0<d42.i.Error> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            i iVar = new i(eVar);
            iVar.f39918f = c0Var;
            return iVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$l;", "action", "Lk10/c0;", "Ld42/d;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$l;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<d42.a.Setup, k10.c0<Init>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39919e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39920f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f39921g;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Setup O(d42.a.Setup setup, Init init) {
            return new Setup(setup.getPaymentCardsNavParams());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final d42.a.Setup setup = (d42.a.Setup) this.f39920f;
            k10.c0 c0Var = (k10.c0) this.f39921g;
            uq.b.e();
            if (this.f39919e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d42.t0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.j.O(setup, (Init) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.Setup setup, k10.c0<Init> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            j jVar = new j(eVar);
            jVar.f39920f = setup;
            jVar.f39921g = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ld42/e;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.p<k10.c0<Setup>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39922e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39923f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ld42/f;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends d42.f>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f39925e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ o0 f39926f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Setup> f39927g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(o0 o0Var, k10.c0<Setup> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f39926f = o0Var;
                this.f39927g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error X(k10.c0 c0Var, o0 o0Var, dx.b bVar, Setup setup) {
                return new Error(((Setup) c0Var.a()).getPaymentCardsNavParams(), o0Var.N9(bVar));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final d42.f.a.Displayed Y(k10.c0 c0Var, List list, Setup setup) {
                return new d42.f.a.Displayed(((Setup) c0Var.a()).getPaymentCardsNavParams().getPaymentCardRequiredData(), list, ((Setup) c0Var.a()).getPaymentCardsNavParams().getReturnResult(), null);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f39925e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    cs0.f fVar = this.f39926f.getCardsUseCase;
                    cs0.f.Params params = new cs0.f.Params(false);
                    this.f39925e = 1;
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
                final k10.c0<Setup> c0Var = this.f39927g;
                final o0 o0Var = this.f39926f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: d42.u0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.k.a.X(c0Var, o0Var, bVar, (Setup) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                final List list = (List) ((dx.i.Right) iVar).b();
                return c0Var.d(new er.l() { // from class: d42.v0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o0.k.a.Y(c0Var, list, (Setup) obj2);
                    }
                });
            }

            public final tq.e<oq.i0> O(tq.e<?> eVar) {
                return new a(this.f39926f, this.f39927g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends d42.f>> eVar) {
                return ((a) O(eVar)).J(oq.i0.f148189a);
            }
        }

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f39923f;
            Object objE = uq.b.e();
            int i15 = this.f39922e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = o0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(o0.this, c0Var, null);
            this.f39923f = vq.j.a(c0Var);
            this.f39922e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Setup> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            return ((k) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            k kVar = o0.this.new k(eVar);
            kVar.f39923f = obj;
            return kVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld42/a$b;", "<unused var>", "Ld42/c;", "Loq/i0;", "<anonymous>", "(Ld42/a$b;Ld42/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<d42.a.b, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39928e;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f39928e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<d42.a.f> bVarY1 = o0.this.Y1();
                d42.a.f.C0867a c0867a = d42.a.f.C0867a.f39739a;
                this.f39928e = 1;
                if (bVarY1.F(c0867a, this) == objE) {
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
        public final Object w(d42.a.b bVar, Error error, tq.e<? super oq.i0> eVar) {
            return o0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$k;", "<unused var>", "Lk10/c0;", "Ld42/c;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<d42.a.k, k10.c0<Error>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39931f;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Setup O(k10.c0 c0Var, Error error) {
            return new Setup(((Error) c0Var.a()).getPaymentCardsNavParams());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f39931f;
            uq.b.e();
            if (this.f39930e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d42.w0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.m.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.k kVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            m mVar = new m(eVar);
            mVar.f39931f = c0Var;
            return mVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld42/a$n;", "action", "Ld42/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ld42/a$n;Ld42/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<d42.a.ShowSnackBarWithCloseIcon, d42.f.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39932e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39933f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d42.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon = (d42.a.ShowSnackBarWithCloseIcon) this.f39933f;
            uq.b.e();
            if (this.f39932e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o0.this.y(new p50.a.DefaultWithIcon(showSnackBarWithCloseIcon.getMessageLabel(), false, null, null, 14, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.ShowSnackBarWithCloseIcon showSnackBarWithCloseIcon, d42.f.a aVar, tq.e<? super oq.i0> eVar) {
            n nVar = o0.this.new n(eVar);
            nVar.f39933f = showSnackBarWithCloseIcon;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld42/a$m;", "action", "Ld42/f$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Ld42/a$m;Ld42/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<d42.a.ShowSnackBarNoIcon, d42.f.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39935e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39936f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d42.a.ShowSnackBarNoIcon showSnackBarNoIcon = (d42.a.ShowSnackBarNoIcon) this.f39936f;
            uq.b.e();
            if (this.f39935e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o0.this.y(new p50.a.Default(showSnackBarNoIcon.getMessageLabel(), false, null, 6, null));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.ShowSnackBarNoIcon showSnackBarNoIcon, d42.f.a aVar, tq.e<? super oq.i0> eVar) {
            o oVar = o0.this.new o(eVar);
            oVar.f39936f = showSnackBarNoIcon;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ld42/a$e;", "<unused var>", "Ld42/f$a;", "Loq/i0;", "<anonymous>", "(Ld42/a$e;Ld42/f$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<d42.a.e, d42.f.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39938e;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f39938e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o0.this.B0();
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.e eVar, d42.f.a aVar, tq.e<? super oq.i0> eVar2) {
            return o0.this.new p(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ld42/f$a$a;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<k10.c0<d42.f.a.Displayed>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39940e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39941f;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39943a;

            static {
                int[] iArr = new int[u42.a.values().length];
                try {
                    iArr[u42.a.DELETE_CARD_LAST_CARD_REMOVED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f39943a = iArr;
            }
        }

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d42.f.a.Displayed O(d42.f.a.Displayed displayed) {
            return d42.f.a.Displayed.e(displayed, null, null, null, null, 11, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f39941f;
            uq.b.e();
            if (this.f39940e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            u42.a returnResult = ((d42.f.a.Displayed) c0Var.a()).getReturnResult();
            if ((returnResult == null ? -1 : a.f39943a[returnResult.ordinal()]) != 1) {
                return c0Var.c();
            }
            o0.this.d9(new d42.a.ShowSnackBarNoIcon(o0.this.mapper.i()));
            return c0Var.b(new er.l() { // from class: d42.x0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.q.O((f.a.Displayed) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<d42.f.a.Displayed> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            return ((q) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            q qVar = o0.this.new q(eVar);
            qVar.f39941f = obj;
            return qVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld42/a$p;", "<unused var>", "Ld42/f$a$a;", "state", "Loq/i0;", "<anonymous>", "(Ld42/a$p;Ld42/f$a$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<d42.a.p, d42.f.a.Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39944e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39945f;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d42.f.a.Displayed displayed = (d42.f.a.Displayed) this.f39945f;
            Object objE = uq.b.e();
            int i15 = this.f39944e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<d42.a.f> bVarY1 = o0.this.Y1();
                d42.a.f.ToDeleteCards toDeleteCards = new d42.a.f.ToDeleteCards(new DeleteCardsRequiredData(new m42.b.PaymentCards(displayed.getPaymentCardRequiredData().getSourcePaymentId(), displayed.getPaymentCardRequiredData().getPaymentTitle(), displayed.getPaymentCardRequiredData().getAmountWithCurrency(), displayed.getPaymentCardRequiredData().c(), displayed.getPaymentCardRequiredData().getInstitutionId(), displayed.getPaymentCardRequiredData().getShouldBackToPaymentDetails()), displayed.c()));
                this.f39945f = vq.j.a(displayed);
                this.f39944e = 1;
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
        public final Object w(d42.a.p pVar, d42.f.a.Displayed displayed, tq.e<? super oq.i0> eVar) {
            r rVar = o0.this.new r(eVar);
            rVar.f39945f = displayed;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$o;", "action", "Lk10/c0;", "Ld42/f$a$a;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$o;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.q<d42.a.StartCardPayment, k10.c0<d42.f.a.Displayed>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39947e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39948f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f39949g;

        s(tq.e<? super s> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(d42.a.StartCardPayment startCardPayment, k10.c0 c0Var, d42.f.a.Displayed displayed) {
            return new Loading(startCardPayment.getCardToken(), startCardPayment.getSaveCard(), ((d42.f.a.Displayed) c0Var.a()).getPaymentCardRequiredData(), ((d42.f.a.Displayed) c0Var.a()).getReturnResult(), ((d42.f.a.Displayed) c0Var.a()).c(), null, 32, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final d42.a.StartCardPayment startCardPayment = (d42.a.StartCardPayment) this.f39948f;
            final k10.c0 c0Var = (k10.c0) this.f39949g;
            uq.b.e();
            if (this.f39947e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d42.y0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.s.O(startCardPayment, c0Var, (f.a.Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.StartCardPayment startCardPayment, k10.c0<d42.f.a.Displayed> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            s sVar = new s(eVar);
            sVar.f39948f = startCardPayment;
            sVar.f39949g = c0Var;
            return sVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$j;", "action", "Lk10/c0;", "Ld42/f$a$a;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$j;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class t extends vq.k implements er.q<d42.a.OpenGoToPaymentsDialog, k10.c0<d42.f.a.Displayed>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39950e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39951f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f39952g;

        t(tq.e<? super t> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d42.f.a.Displayed O(o0 o0Var, d42.a.OpenGoToPaymentsDialog openGoToPaymentsDialog, d42.f.a.Displayed displayed) {
            cb4.j jVar = o0Var.dialogVMSFactory;
            cb4.h.b bVar = cb4.h.b.f24985a;
            Label labelC = o0Var.labelProvider.c(t32.b.P);
            Label labelC2 = o0Var.labelProvider.c(t32.b.O);
            DialogButtonTextData dialogButtonTextData = new DialogButtonTextData(o0Var.labelProvider.c(t32.b.f187509y0), null, openGoToPaymentsDialog.a(), 2, null);
            Label labelC3 = o0Var.labelProvider.c(t32.b.f187437b);
            d42.a.d dVar = d42.a.d.f39737a;
            return d42.f.a.Displayed.e(displayed, null, null, null, jVar.a(new DialogData(bVar, labelC, labelC2, dialogButtonTextData, new DialogButtonTextData(labelC3, null, o0Var.b9(dVar), 2, null), null, o0Var.b9(dVar), 32, null)), 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final d42.a.OpenGoToPaymentsDialog openGoToPaymentsDialog = (d42.a.OpenGoToPaymentsDialog) this.f39951f;
            k10.c0 c0Var = (k10.c0) this.f39952g;
            uq.b.e();
            if (this.f39950e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final o0 o0Var = o0.this;
            return c0Var.b(new er.l() { // from class: d42.z0
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.t.O(o0Var, openGoToPaymentsDialog, (f.a.Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.OpenGoToPaymentsDialog openGoToPaymentsDialog, k10.c0<d42.f.a.Displayed> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            t tVar = o0.this.new t(eVar);
            tVar.f39951f = openGoToPaymentsDialog;
            tVar.f39952g = c0Var;
            return tVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$d;", "<unused var>", "Lk10/c0;", "Ld42/f$a$a;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class u extends vq.k implements er.q<d42.a.d, k10.c0<d42.f.a.Displayed>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39955f;

        u(tq.e<? super u> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d42.f.a.Displayed O(d42.f.a.Displayed displayed) {
            return d42.f.a.Displayed.e(displayed, null, null, null, null, 7, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f39955f;
            uq.b.e();
            if (this.f39954e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: d42.a1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.u.O((f.a.Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.d dVar, k10.c0<d42.f.a.Displayed> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            u uVar = new u(eVar);
            uVar.f39955f = c0Var;
            return uVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ld42/h;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class v extends vq.k implements er.p<k10.c0<Loading>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f39956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f39957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f39958g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f39959h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f39960j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f39962a;

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
                f39962a = iArr;
            }
        }

        v(tq.e<? super v> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error Z(k10.c0 c0Var, o0 o0Var, dx.b bVar, Loading loading) {
            return new Error(((Loading) c0Var.a()).getCardToken(), ((Loading) c0Var.a()).getSaveCard(), ((Loading) c0Var.a()).getPaymentCardRequiredData(), ((Loading) c0Var.a()).getReturnResult(), o0Var.N9(bVar), ((Loading) c0Var.a()).c(), null, 64, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error a0(k10.c0 c0Var, o0 o0Var, Loading loading) {
            return new Error(((Loading) c0Var.a()).getCardToken(), ((Loading) c0Var.a()).getSaveCard(), ((Loading) c0Var.a()).getPaymentCardRequiredData(), ((Loading) c0Var.a()).getReturnResult(), o0Var.N9(new dx.b.Parsing(null, 1, null)), ((Loading) c0Var.a()).c(), null, 64, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Showing b0(BECardPaymentProcess bECardPaymentProcess, o0 o0Var, k10.c0 c0Var, Loading loading) {
            Object objB;
            String transactionId = bECardPaymentProcess.getTransactionId();
            String redirectUrl = bECardPaymentProcess.getRedirectRequest().getRedirectUrl();
            dx.i iVarC = iy.a.c(o0Var.base64Coder, bECardPaymentProcess.getRedirectRequest().getRequestBody(), null, 2, null);
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
        public static final d42.f.a.Displayed c0(k10.c0 c0Var, Loading loading) {
            return new d42.f.a.Displayed(((Loading) c0Var.a()).getPaymentCardRequiredData(), ((Loading) c0Var.a()).c(), ((Loading) c0Var.a()).getReturnResult(), null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error d0(k10.c0 c0Var, o0 o0Var, Loading loading) {
            return new Error(((Loading) c0Var.a()).getCardToken(), ((Loading) c0Var.a()).getSaveCard(), ((Loading) c0Var.a()).getPaymentCardRequiredData(), ((Loading) c0Var.a()).getReturnResult(), o0Var.N9(new dx.b.Parsing(null, 1, null)), ((Loading) c0Var.a()).c(), null, 64, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final o0 o0Var;
            final k10.c0 c0Var = (k10.c0) this.f39960j;
            Object objE = uq.b.e();
            int i15 = this.f39959h;
            if (i15 == 0) {
                oq.u.b(obj);
                DisplayMetrics displayMetrics = Resources.getSystem().getDisplayMetrics();
                o0 o0Var2 = o0.this;
                cs0.g gVar = o0Var2.startCardPaymentUseCase;
                cs0.g.Params params = new cs0.g.Params(((Loading) c0Var.a()).getPaymentCardRequiredData().getInstitutionId(), ((Loading) c0Var.a()).getPaymentCardRequiredData().c(), ((Loading) c0Var.a()).getCardToken(), vq.b.a(((Loading) c0Var.a()).getSaveCard()), g42.a.a(displayMetrics.heightPixels, displayMetrics.widthPixels));
                this.f39960j = c0Var;
                this.f39956e = o0Var2;
                this.f39957f = vq.j.a(displayMetrics);
                this.f39958g = 0;
                this.f39959h = 1;
                obj = gVar.c(params, this);
                if (obj == objE) {
                    return objE;
                }
                o0Var = o0Var2;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o0Var = (o0) this.f39956e;
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: d42.b1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o0.v.Z(c0Var, o0Var, bVar, (Loading) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            BEStartCardPaymentResponseDomain bEStartCardPaymentResponseDomain = (BEStartCardPaymentResponseDomain) ((dx.i.Right) iVar).b();
            int i16 = a.f39962a[bEStartCardPaymentResponseDomain.getStatus().ordinal()];
            if (i16 == 1) {
                final BECardPaymentProcess process = bEStartCardPaymentResponseDomain.getProcess();
                return process == null ? c0Var.d(new er.l() { // from class: d42.c1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o0.v.a0(c0Var, o0Var, (Loading) obj2);
                    }
                }) : c0Var.d(new er.l() { // from class: d42.d1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return o0.v.b0(process, o0Var, c0Var, (Loading) obj2);
                    }
                });
            }
            if (i16 != 2) {
                if (i16 == 3) {
                    return c0Var.d(new er.l() { // from class: d42.f1
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return o0.v.d0(c0Var, o0Var, (Loading) obj2);
                        }
                    });
                }
                throw new oq.p();
            }
            k10.l lVarD = c0Var.d(new er.l() { // from class: d42.e1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.v.c0(c0Var, (Loading) obj2);
                }
            });
            o0Var.d9(new d42.a.ShowSnackBarWithCloseIcon(o0Var.mapper.q()));
            return lVarD;
        }

        @Override // er.p
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            return ((v) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            v vVar = o0.this.new v(eVar);
            vVar.f39960j = obj;
            return vVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$b;", "<unused var>", "Lk10/c0;", "Ld42/g;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class w extends vq.k implements er.q<d42.a.b, k10.c0<Error>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39963e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39964f;

        w(tq.e<? super w> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d42.f.a.Displayed O(k10.c0 c0Var, Error error) {
            return new d42.f.a.Displayed(((Error) c0Var.a()).getPaymentCardRequiredData(), ((Error) c0Var.a()).c(), ((Error) c0Var.a()).getReturnResult(), null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f39964f;
            uq.b.e();
            if (this.f39963e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d42.g1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.w.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.b bVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            w wVar = new w(eVar);
            wVar.f39964f = c0Var;
            return wVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$k;", "<unused var>", "Lk10/c0;", "Ld42/g;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$k;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class x extends vq.k implements er.q<d42.a.k, k10.c0<Error>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39965e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39966f;

        x(tq.e<? super x> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(k10.c0 c0Var, Error error) {
            return new Loading(((Error) c0Var.a()).getCardToken(), ((Error) c0Var.a()).getSaveCard(), ((Error) c0Var.a()).getPaymentCardRequiredData(), ((Error) c0Var.a()).getReturnResult(), ((Error) c0Var.a()).c(), null, 32, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final k10.c0 c0Var = (k10.c0) this.f39966f;
            uq.b.e();
            if (this.f39965e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: d42.h1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.x.O(c0Var, (Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.k kVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            x xVar = new x(eVar);
            xVar.f39966f = c0Var;
            return xVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ld42/a$h;", "<destruct>", "Lk10/c0;", "Ld42/j;", "state", "Lk10/l;", "Ld42/f;", "<anonymous>", "(Ld42/a$h;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class y extends vq.k implements er.q<d42.a.OnResponseReceived, k10.c0<Showing>, tq.e<? super k10.l<? extends d42.f>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39967e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39968f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f39969g;

        y(tq.e<? super y> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d42.i.Dispatching O(Uri uri, k10.c0 c0Var, Showing showing) {
            return new d42.i.Dispatching(new WebViewResultParam(showing.i().contains(String.valueOf(uri)), ((Showing) c0Var.a()).getId(), ((Showing) c0Var.a()).getPaymentCardRequiredData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d42.a.OnResponseReceived onResponseReceived = (d42.a.OnResponseReceived) this.f39968f;
            final k10.c0 c0Var = (k10.c0) this.f39969g;
            uq.b.e();
            if (this.f39967e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final Uri url = onResponseReceived.getUrl();
            Showing showing = (Showing) c0Var.a();
            return (showing.i().contains(String.valueOf(url)) || showing.f().contains(String.valueOf(url))) ? c0Var.d(new er.l() { // from class: d42.i1
                @Override // er.l
                public final Object b(Object obj2) {
                    return o0.y.O(url, c0Var, (Showing) obj2);
                }
            }) : c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.OnResponseReceived onResponseReceived, k10.c0<Showing> c0Var, tq.e<? super k10.l<? extends d42.f>> eVar) {
            y yVar = new y(eVar);
            yVar.f39968f = onResponseReceived;
            yVar.f39969g = c0Var;
            return yVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ld42/a$g;", "<unused var>", "Ld42/j;", "state", "Loq/i0;", "<anonymous>", "(Ld42/a$g;Ld42/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class z extends vq.k implements er.q<d42.a.g, Showing, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f39970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f39971f;

        z(tq.e<? super z> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Showing showing = (Showing) this.f39971f;
            uq.b.e();
            if (this.f39970e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            o0.this.d9(new d42.a.OnResponseReceived(Uri.parse((String) pq.v.l0(showing.f()))));
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(d42.a.g gVar, Showing showing, tq.e<? super oq.i0> eVar) {
            z zVar = o0.this.new z(eVar);
            zVar.f39971f = showing;
            return zVar.J(oq.i0.f148189a);
        }
    }

    public o0(yy.a aVar, d42.m mVar, cs0.g gVar, ac4.a aVar2, z32.b bVar, iy.a aVar3, ib4.c cVar, cs0.f fVar, cs0.a aVar4, i70.n nVar, mx.c cVar2, hb4.d dVar, cb4.j jVar, PaymentCardsSetupData paymentCardsSetupData) {
        this.mapper = mVar;
        this.startCardPaymentUseCase = gVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getCardPaymentInIntervalUseCase = bVar;
        this.base64Coder = aVar3;
        this.genericDomainErrorMapper = cVar;
        this.getCardsUseCase = fVar;
        this.abortCardPaymentUseCase = aVar4;
        this.snackBarManagerStateHolder = nVar;
        this.labelProvider = cVar2;
        this.errorVMSFactory = dVar;
        this.dialogVMSFactory = jVar;
        this.setupData = paymentCardsSetupData;
        Init init = new Init(paymentCardsSetupData.getData());
        this.initialState = init;
        this.stateMachine = aVar.a(init, new er.l() { // from class: d42.e0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.W9(this.f39774a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), P9(init));
    }

    public static final /* synthetic */ d42.m J9(o0 o0Var) {
        return o0Var.mapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c N9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: d42.d0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.O9(this.f39769a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(o0 o0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                o0Var.d9(d42.a.k.f39746a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                o0Var.d9(d42.a.b.f39735a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d42.k.a P9(d42.f state) {
        return this.mapper.b(new d42.m.Params(state, b9(d42.a.C0866a.f39734a), b9(new d42.a.OpenGoToPaymentsDialog(new er.a() { // from class: d42.y
            @Override // er.a
            public final Object a() {
                return o0.Q9(this.f39995a);
            }
        })), b9(new d42.a.OpenGoToPaymentsDialog(new er.a() { // from class: d42.z
            @Override // er.a
            public final Object a() {
                return o0.R9(this.f39998a);
            }
        })), b9(d42.a.p.f39752a), b9(d42.a.e.f39738a), new er.p() { // from class: d42.a0
            @Override // er.p
            public final Object B(Object obj, Object obj2) {
                return o0.S9(this.f39755a, (String) obj, (String) obj2);
            }
        }, new er.l() { // from class: d42.b0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.U9(this.f39757a, (Uri) obj);
            }
        }, b9(d42.a.g.f39742a), b9(d42.a.i.f39744a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(o0 o0Var) {
        o0Var.d9(new d42.a.StartCardPayment(null, true));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(o0 o0Var) {
        o0Var.d9(new d42.a.StartCardPayment(null, false));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(final o0 o0Var, final String str, final String str2) {
        o0Var.d9(new d42.a.OpenGoToPaymentsDialog(new er.a() { // from class: d42.c0
            @Override // er.a
            public final Object a() {
                return o0.T9(this.f39763a, str, str2);
            }
        }));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(o0 o0Var, String str, String str2) {
        o0Var.d9(new d42.a.StartCardPayment(new BECardToken(str, str2), false));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U9(o0 o0Var, Uri uri) {
        o0Var.d9(new d42.a.OnResponseReceived(uri));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 W9(final o0 o0Var, k10.v vVar) {
        vVar.c(fr.q0.c(d42.f.class), new er.l() { // from class: d42.u
            @Override // er.l
            public final Object b(Object obj) {
                return o0.X9(this.f39986a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Init.class), new er.l() { // from class: d42.i0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.Y9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Setup.class), new er.l() { // from class: d42.j0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ca(this.f39811a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: d42.k0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.da(this.f39825a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(d42.f.a.class), new er.l() { // from class: d42.l0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ea(this.f39828a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(d42.f.a.Displayed.class), new er.l() { // from class: d42.m0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.fa(this.f39847a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Loading.class), new er.l() { // from class: d42.n0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ga(this.f39851a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: d42.v
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ha((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Showing.class), new er.l() { // from class: d42.w
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ia(this.f39992a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(d42.i.class), new er.l() { // from class: d42.x
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ja(this.f39994a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(d42.i.Dispatching.class), new er.l() { // from class: d42.f0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.Z9(this.f39780a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(d42.i.Loading.class), new er.l() { // from class: d42.g0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.aa(this.f39790a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(d42.i.Error.class), new er.l() { // from class: d42.h0
            @Override // er.l
            public final Object b(Object obj) {
                return o0.ba((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 X9(o0 o0Var, k10.z zVar) {
        b bVar = o0Var.new b(null);
        zVar.x(fr.q0.c(d42.a.C0866a.class), k10.o.CANCEL_PREVIOUS, bVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Y9(k10.z zVar) {
        j jVar = new j(null);
        zVar.v(fr.q0.c(d42.a.Setup.class), k10.o.CANCEL_PREVIOUS, jVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Z9(o0 o0Var, k10.z zVar) {
        zVar.C(o0Var.new d(null));
        e eVar = new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(d42.a.r.class), oVar, eVar);
        zVar.x(fr.q0.c(d42.a.q.class), oVar, o0Var.new f(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 aa(o0 o0Var, k10.z zVar) {
        zVar.A(o0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ba(k10.z zVar) {
        h hVar = new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(d42.a.b.class), oVar, hVar);
        zVar.v(fr.q0.c(d42.a.k.class), oVar, new i(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ca(o0 o0Var, k10.z zVar) {
        zVar.A(o0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 da(o0 o0Var, k10.z zVar) {
        l lVar = o0Var.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(d42.a.b.class), oVar, lVar);
        zVar.v(fr.q0.c(d42.a.k.class), oVar, new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ea(o0 o0Var, k10.z zVar) {
        n nVar = o0Var.new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(d42.a.ShowSnackBarWithCloseIcon.class), oVar, nVar);
        zVar.x(fr.q0.c(d42.a.ShowSnackBarNoIcon.class), oVar, o0Var.new o(null));
        zVar.x(fr.q0.c(d42.a.e.class), oVar, o0Var.new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 fa(o0 o0Var, k10.z zVar) {
        zVar.A(o0Var.new q(null));
        r rVar = o0Var.new r(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(d42.a.p.class), oVar, rVar);
        zVar.v(fr.q0.c(d42.a.StartCardPayment.class), oVar, new s(null));
        zVar.v(fr.q0.c(d42.a.OpenGoToPaymentsDialog.class), oVar, o0Var.new t(null));
        zVar.v(fr.q0.c(d42.a.d.class), oVar, new u(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ga(o0 o0Var, k10.z zVar) {
        zVar.A(o0Var.new v(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ha(k10.z zVar) {
        w wVar = new w(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(d42.a.b.class), oVar, wVar);
        zVar.v(fr.q0.c(d42.a.k.class), oVar, new x(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ia(o0 o0Var, k10.z zVar) {
        y yVar = new y(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(d42.a.OnResponseReceived.class), oVar, yVar);
        zVar.x(fr.q0.c(d42.a.g.class), oVar, o0Var.new z(null));
        zVar.v(fr.q0.c(d42.a.i.class), oVar, o0Var.new a0(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 ja(o0 o0Var, k10.z zVar) {
        c cVar = o0Var.new c(null);
        zVar.x(fr.q0.c(d42.a.GoToResult.class), k10.o.CANCEL_PREVIOUS, cVar);
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: V9, reason: merged with bridge method [inline-methods] */
    public void P5(PaymentCardsSetupData data) {
        d9(new d42.a.Setup(data.getData()));
    }

    @Override // zx.b
    public xw.b<d42.a.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<d42.f, d42.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<d42.k.a> getState() {
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
