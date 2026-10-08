package jy3;

import by3.BlikRequiredData;
import dy3.PaymentCardRequiredData;
import dy3.PaymentCardsNavParams;
import iy3.GooglePayNavParams;
import ly3.OneClickRequiredData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import qx3.MakePaymentInitialData;
import xr0.BEGooglePaySendPaymentTokenRequestModel;
import xr0.BEGooglePayTokenModel;
import xr0.BEIntermediateSigningKeyModel;
import xr0.BEStartGooglePayPaymentRequestModel;
import xr0.BEStartGooglePayPaymentResponseModel;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B{\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\b\b\u0001\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\b+\u0010,R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR&\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030K8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010W\u001a\b\u0012\u0004\u0012\u00020R0Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR \u0010$\u001a\b\u0012\u0004\u0012\u00020%0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\¨\u0006]"}, d2 = {"Ljy3/h0;", "Ll00/g;", "Ljy3/e;", "Ljy3/a;", "Ljy3/k;", "", "Lyy/a;", "stateMachineFactory", "Ljy3/m;", "mapper", "Lib4/c;", "genericDomainErrorMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lvx3/a;", "getOneClickPaymentTypeUseCase", "Ldz/a;", "currencyFormatter", "Ls44/c;", "isGooglePayRemoteFlagActiveUC", "Ls44/b;", "isGooglePayReadyUC", "Ls44/a;", "getGPClientPaymentStatusUpdatesUC", "Ls44/d;", "requestClientPaymentUC", "Lds0/d;", "startGooglePayPaymentUC", "Lds0/b;", "notifyAboutGooglePayErrorUC", "Lhb4/d;", "errorVMSFactory", "Ljy3/b;", "setupData", "<init>", "(Lyy/a;Ljy3/m;Lib4/c;Lac4/a;Lvx3/a;Ldz/a;Ls44/c;Ls44/b;Ls44/a;Ls44/d;Lds0/d;Lds0/b;Lhb4/d;Ljy3/b;)V", "state", "Ljy3/k$a;", "H9", "(Ljy3/e;)Ljy3/k$a;", "Ldx/b;", "domainError", "Lhb4/c;", "F9", "(Ldx/b;)Lhb4/c;", "b", "Ljy3/m;", "c", "Lib4/c;", "d", "Lac4/a;", "e", "Lvx3/a;", "f", "Ldz/a;", "g", "Ls44/c;", "h", "Ls44/b;", "j", "Ls44/a;", "k", "Ls44/d;", "l", "Lds0/d;", "m", "Lds0/b;", "n", "Lhb4/d;", "p", "Ljy3/b;", "Ljy3/d;", "q", "Ljy3/d;", "initialState", "Lk10/t;", "r", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Ljy3/a$e;", "s", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "t", "Lmu/p0;", "getState", "()Lmu/p0;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 extends l00.g<jy3.e, jy3.a> implements jy3.k, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final jy3.m mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final vx3.a getOneClickPaymentTypeUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final dz.a currencyFormatter;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final s44.c isGooglePayRemoteFlagActiveUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final s44.b isGooglePayReadyUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final s44.a getGPClientPaymentStatusUpdatesUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final s44.d requestClientPaymentUC;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final ds0.d startGooglePayPaymentUC;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ds0.b notifyAboutGooglePayErrorUC;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final SetupData setupData;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final jy3.d initialState;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final k10.t<jy3.e, jy3.a> stateMachine;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final xw.b<jy3.a.e> navAction;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final mu.p0<jy3.k.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<jy3.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f106600a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ h0 f106601b;

        /* JADX INFO: renamed from: jy3.h0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2543a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f106602a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h0 f106603b;

            /* JADX INFO: renamed from: jy3.h0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2544a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f106604d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f106605e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f106606f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f106608h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f106609j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f106610k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f106611l;

                public C2544a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f106604d = obj;
                    this.f106605e |= PKIFailureInfo.systemUnavail;
                    return C2543a.this.F(null, this);
                }
            }

            public C2543a(mu.h hVar, h0 h0Var) {
                this.f106602a = hVar;
                this.f106603b = h0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2544a c2544a;
                if (eVar instanceof C2544a) {
                    c2544a = (C2544a) eVar;
                    int i15 = c2544a.f106605e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2544a.f106605e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2544a = new C2544a(eVar);
                    }
                } else {
                    c2544a = new C2544a(eVar);
                }
                Object obj2 = c2544a.f106604d;
                Object objE = uq.b.e();
                int i16 = c2544a.f106605e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f106602a;
                    jy3.k.a aVarH9 = this.f106603b.H9((jy3.e) obj);
                    c2544a.f106606f = vq.j.a(obj);
                    c2544a.f106608h = vq.j.a(c2544a);
                    c2544a.f106609j = vq.j.a(obj);
                    c2544a.f106610k = vq.j.a(hVar);
                    c2544a.f106611l = 0;
                    c2544a.f106605e = 1;
                    if (hVar.F(aVarH9, c2544a) == objE) {
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

        public a(mu.g gVar, h0 h0Var) {
            this.f106600a = gVar;
            this.f106601b = h0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super jy3.k.a> hVar, tq.e eVar) {
            Object objA = this.f106600a.a(new C2543a(hVar, this.f106601b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljy3/a$e;", "action", "Ljy3/e;", "stateSnapshot", "Loq/i0;", "<anonymous>", "(Ljy3/a$e;Ljy3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<jy3.a.e, jy3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106612e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106613f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jy3.a.e eVar = (jy3.a.e) this.f106613f;
            Object objE = uq.b.e();
            int i15 = this.f106612e;
            if (i15 == 0) {
                oq.u.b(obj);
                h0 h0Var = h0.this;
                this.f106613f = vq.j.a(eVar);
                this.f106612e = 1;
                if (h0Var.F(eVar, this) == objE) {
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
        public final Object w(jy3.a.e eVar, jy3.e eVar2, tq.e<? super oq.i0> eVar3) {
            b bVar = h0.this.new b(eVar3);
            bVar.f106613f = eVar;
            return bVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljy3/a$d;", "<unused var>", "Ljy3/e;", "Loq/i0;", "<anonymous>", "(Ljy3/a$d;Ljy3/e;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<jy3.a.d, jy3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106615e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f106615e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<jy3.a.e> bVarY1 = h0.this.Y1();
                jy3.a.e.C2539a c2539a = jy3.a.e.C2539a.f106539a;
                this.f106615e = 1;
                if (bVarY1.F(c2539a, this) == objE) {
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
        public final Object w(jy3.a.d dVar, jy3.e eVar, tq.e<? super oq.i0> eVar2) {
            return h0.this.new c(eVar2).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljy3/e$a$a$b;", "state", "Loq/i0;", "<anonymous>", "(Ljy3/e$a$a$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<jy3.e.a.InterfaceC2541a.GooglePayCancelled, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106617e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106618f;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jy3.e.a.InterfaceC2541a.GooglePayCancelled googlePayCancelled = (jy3.e.a.InterfaceC2541a.GooglePayCancelled) this.f106618f;
            Object objE = uq.b.e();
            int i15 = this.f106617e;
            if (i15 == 0) {
                oq.u.b(obj);
                ds0.b bVar = h0.this.notifyAboutGooglePayErrorUC;
                ds0.b.Params params = new ds0.b.Params(googlePayCancelled.getTransactionId());
                this.f106618f = vq.j.a(googlePayCancelled);
                this.f106617e = 1;
                if (bVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            h0.this.d9(jy3.a.d.f106538a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(jy3.e.a.InterfaceC2541a.GooglePayCancelled googlePayCancelled, tq.e<? super oq.i0> eVar) {
            return ((d) v(googlePayCancelled, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            d dVar = h0.this.new d(eVar);
            dVar.f106618f = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ljy3/d;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<k10.c0<jy3.d>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106620e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106621f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(h0 h0Var, boolean z15, jy3.d dVar) {
            return new Displayed(h0Var.setupData.getMakePaymentInitialData(), z15, h0Var.isGooglePayRemoteFlagActiveUC.a(gz.b.a.C1792a.f78542a).booleanValue());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f106621f;
            Object objE = uq.b.e();
            int i15 = this.f106620e;
            if (i15 == 0) {
                oq.u.b(obj);
                s44.b bVar = h0.this.isGooglePayReadyUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                this.f106621f = c0Var;
                this.f106620e = 1;
                obj = bVar.c(c1792a, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            final boolean zBooleanValue = ((Boolean) obj).booleanValue();
            final h0 h0Var = h0.this;
            return c0Var.d(new er.l() { // from class: jy3.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.e.O(h0Var, zBooleanValue, (d) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<jy3.d> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            return ((e) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = h0.this.new e(eVar);
            eVar2.f106621f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljy3/a$c;", "action", "Lk10/c0;", "Ljy3/h;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Ljy3/a$c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<jy3.a.c, k10.c0<Displayed>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106623e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106624f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Ljy3/e;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends jy3.e>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f106626e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ h0 f106627f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ k10.c0<Displayed> f106628g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h0 h0Var, k10.c0<Displayed> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f106627f = h0Var;
                this.f106628g = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Error V(h0 h0Var, dx.b bVar, Displayed displayed) {
                return new Error(displayed.getMakePaymentInitialData(), displayed.getIsGooglePayRemoteFlagActive(), displayed.getIsGooglePayReady(), h0Var.F9(bVar));
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f106626e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    vx3.a aVar = this.f106627f.getOneClickPaymentTypeUseCase;
                    gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                    this.f106626e = 1;
                    obj = aVar.a(c1792a, this);
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
                k10.c0<Displayed> c0Var = this.f106628g;
                final h0 h0Var = this.f106627f;
                if (iVar instanceof dx.i.Left) {
                    final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                    return c0Var.d(new er.l() { // from class: jy3.j0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return h0.f.a.V(h0Var, bVar, (Displayed) obj2);
                        }
                    });
                }
                if (!(iVar instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                tx3.a aVar2 = (tx3.a) ((dx.i.Right) iVar).b();
                if (aVar2 instanceof tx3.a.OneClickAliasesList) {
                    h0Var.d9(new jy3.a.ToOneClickAliases(((tx3.a.OneClickAliasesList) aVar2).a()));
                } else {
                    if (!fr.t.c(aVar2, tx3.a.C5038a.f192591a)) {
                        throw new oq.p();
                    }
                    h0Var.d9(jy3.a.h.f106546a);
                }
                return c0Var.c();
            }

            public final tq.e<oq.i0> N(tq.e<?> eVar) {
                return new a(this.f106627f, this.f106628g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends jy3.e>> eVar) {
                return ((a) N(eVar)).J(oq.i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f106624f;
            Object objE = uq.b.e();
            int i15 = this.f106623e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = h0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(h0.this, c0Var, null);
            this.f106624f = vq.j.a(c0Var);
            this.f106623e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jy3.a.c cVar, k10.c0<Displayed> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            f fVar = h0.this.new f(eVar);
            fVar.f106624f = c0Var;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljy3/a$h;", "<unused var>", "Ljy3/h;", "state", "Loq/i0;", "<anonymous>", "(Ljy3/a$h;Ljy3/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<jy3.a.h, Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f106630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f106631g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f106632h;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Displayed displayed = (Displayed) this.f106632h;
            Object objE = uq.b.e();
            int i15 = this.f106631g;
            if (i15 == 0) {
                oq.u.b(obj);
                MakePaymentInitialData makePaymentInitialData = displayed.getMakePaymentInitialData();
                h0 h0Var = h0.this;
                xw.b<jy3.a.e> bVarY1 = h0Var.Y1();
                jy3.a.e.ToBlik toBlik = new jy3.a.e.ToBlik(new BlikRequiredData(makePaymentInitialData.getSourcePaymentId(), makePaymentInitialData.g(), h0Var.currencyFormatter.b(makePaymentInitialData.getAmount(), makePaymentInitialData.getCurrency()), makePaymentInitialData.getPaymentTitle(), makePaymentInitialData.getPaymentPackageId()));
                this.f106632h = vq.j.a(displayed);
                this.f106629e = vq.j.a(makePaymentInitialData);
                this.f106630f = 0;
                this.f106631g = 1;
                if (bVarY1.F(toBlik, this) == objE) {
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
        public final Object w(jy3.a.h hVar, Displayed displayed, tq.e<? super oq.i0> eVar) {
            g gVar = h0.this.new g(eVar);
            gVar.f106632h = displayed;
            return gVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljy3/a$j;", "action", "Ljy3/h;", "state", "Loq/i0;", "<anonymous>", "(Ljy3/a$j;Ljy3/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<jy3.a.ToOneClickAliases, Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106634e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f106635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f106636g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f106637h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f106638j;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            jy3.a.ToOneClickAliases toOneClickAliases = (jy3.a.ToOneClickAliases) this.f106637h;
            Displayed displayed = (Displayed) this.f106638j;
            Object objE = uq.b.e();
            int i15 = this.f106636g;
            if (i15 == 0) {
                oq.u.b(obj);
                MakePaymentInitialData makePaymentInitialData = displayed.getMakePaymentInitialData();
                h0 h0Var = h0.this;
                xw.b<jy3.a.e> bVarY1 = h0Var.Y1();
                jy3.a.e.ToOneClickAliases toOneClickAliases2 = new jy3.a.e.ToOneClickAliases(new OneClickRequiredData(new BlikRequiredData(makePaymentInitialData.getSourcePaymentId(), makePaymentInitialData.g(), h0Var.currencyFormatter.b(makePaymentInitialData.getAmount(), makePaymentInitialData.getCurrency()), makePaymentInitialData.getPaymentTitle(), makePaymentInitialData.getPaymentPackageId()), toOneClickAliases.a()));
                this.f106637h = vq.j.a(toOneClickAliases);
                this.f106638j = vq.j.a(displayed);
                this.f106634e = vq.j.a(makePaymentInitialData);
                this.f106635f = 0;
                this.f106636g = 1;
                if (bVarY1.F(toOneClickAliases2, this) == objE) {
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
        public final Object w(jy3.a.ToOneClickAliases toOneClickAliases, Displayed displayed, tq.e<? super oq.i0> eVar) {
            h hVar = h0.this.new h(eVar);
            hVar.f106637h = toOneClickAliases;
            hVar.f106638j = displayed;
            return hVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ljy3/a$i;", "<unused var>", "Ljy3/h;", "state", "Loq/i0;", "<anonymous>", "(Ljy3/a$i;Ljy3/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<jy3.a.i, Displayed, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f106641f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f106642g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f106643h;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Displayed displayed = (Displayed) this.f106643h;
            Object objE = uq.b.e();
            int i15 = this.f106642g;
            if (i15 == 0) {
                oq.u.b(obj);
                MakePaymentInitialData makePaymentInitialData = displayed.getMakePaymentInitialData();
                h0 h0Var = h0.this;
                xw.b<jy3.a.e> bVarY1 = h0Var.Y1();
                jy3.a.e.ToCards toCards = new jy3.a.e.ToCards(new PaymentCardsNavParams(new PaymentCardRequiredData(makePaymentInitialData.getSourcePaymentId(), makePaymentInitialData.g(), makePaymentInitialData.getInstitutionId(), makePaymentInitialData.getPaymentTitle(), h0Var.currencyFormatter.b(makePaymentInitialData.getAmount(), makePaymentInitialData.getCurrency())), null));
                this.f106643h = vq.j.a(displayed);
                this.f106640e = vq.j.a(makePaymentInitialData);
                this.f106641f = 0;
                this.f106642g = 1;
                if (bVarY1.F(toCards, this) == objE) {
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
        public final Object w(jy3.a.i iVar, Displayed displayed, tq.e<? super oq.i0> eVar) {
            i iVar2 = h0.this.new i(eVar);
            iVar2.f106643h = displayed;
            return iVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljy3/a$f;", "<unused var>", "Lk10/c0;", "Ljy3/h;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Ljy3/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<jy3.a.f, k10.c0<Displayed>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106646f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Displayed displayed) {
            return new Loading(displayed.getMakePaymentInitialData(), displayed.getIsGooglePayRemoteFlagActive(), displayed.getIsGooglePayReady());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f106646f;
            uq.b.e();
            if (this.f106645e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jy3.k0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.j.O((Displayed) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jy3.a.f fVar, k10.c0<Displayed> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            j jVar = new j(eVar);
            jVar.f106646f = c0Var;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljy3/a$a;", "<unused var>", "Ljy3/i;", "Loq/i0;", "<anonymous>", "(Ljy3/a$a;Ljy3/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<jy3.a.C2538a, Error, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106647e;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f106647e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0.this.d9(jy3.a.d.f106538a);
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jy3.a.C2538a c2538a, Error error, tq.e<? super oq.i0> eVar) {
            return h0.this.new k(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljy3/a$g;", "<unused var>", "Lk10/c0;", "Ljy3/i;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Ljy3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<jy3.a.g, k10.c0<Error>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106649e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106650f;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(Error error) {
            return new Displayed(error.getMakePaymentInitialData(), error.getIsGooglePayReady(), error.getIsGooglePayRemoteFlagActive());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f106650f;
            uq.b.e();
            if (this.f106649e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jy3.l0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.l.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jy3.a.g gVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            l lVar = new l(eVar);
            lVar.f106650f = c0Var;
            return lVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljy3/g;", "state", "Loq/i0;", "<anonymous>", "(Ljy3/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.p<Loading, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106651e;

        m(tq.e<? super m> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f106651e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            h0.this.d9(jy3.a.b.f106536a);
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(Loading loading, tq.e<? super oq.i0> eVar) {
            return ((m) v(loading, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return h0.this.new m(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljy3/a$b;", "action", "Lk10/c0;", "Ljy3/g;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Ljy3/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<jy3.a.b, k10.c0<Loading>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106653e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106654f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Error V(h0 h0Var, dx.b bVar, Loading loading) {
            return new Error(loading.getMakePaymentInitialData(), loading.getIsGooglePayRemoteFlagActive(), loading.getIsGooglePayReady(), h0Var.F9(bVar));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jy3.e.a.InterfaceC2541a.RequestGooglePay X(BEStartGooglePayPaymentResponseModel bEStartGooglePayPaymentResponseModel, Loading loading) {
            return new jy3.e.a.InterfaceC2541a.RequestGooglePay(loading.getMakePaymentInitialData(), loading.getIsGooglePayRemoteFlagActive(), loading.getIsGooglePayReady(), bEStartGooglePayPaymentResponseModel);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f106654f;
            Object objE = uq.b.e();
            int i15 = this.f106653e;
            if (i15 == 0) {
                oq.u.b(obj);
                ds0.d dVar = h0.this.startGooglePayPaymentUC;
                MakePaymentInitialData makePaymentInitialData = ((Loading) c0Var.a()).getMakePaymentInitialData();
                ds0.d.Params params = new ds0.d.Params(new BEStartGooglePayPaymentRequestModel(makePaymentInitialData.getInstitutionId(), makePaymentInitialData.g()));
                this.f106654f = c0Var;
                this.f106653e = 1;
                obj = dVar.c(params, this);
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
            final h0 h0Var = h0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: jy3.m0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return h0.n.V(h0Var, bVar, (Loading) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final BEStartGooglePayPaymentResponseModel bEStartGooglePayPaymentResponseModel = (BEStartGooglePayPaymentResponseModel) ((dx.i.Right) iVar).b();
            return c0Var.d(new er.l() { // from class: jy3.n0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.n.X(bEStartGooglePayPaymentResponseModel, (Loading) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(jy3.a.b bVar, k10.c0<Loading> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            n nVar = h0.this.new n(eVar);
            nVar.f106654f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljy3/a$a;", "action", "Lk10/c0;", "Ljy3/f;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Ljy3/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<jy3.a.C2538a, k10.c0<Error>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106656e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106657f;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(Error error) {
            return new Displayed(error.getMakePaymentInitialData(), error.getIsGooglePayReady(), error.getIsGooglePayRemoteFlagActive());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f106657f;
            uq.b.e();
            if (this.f106656e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jy3.o0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.o.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jy3.a.C2538a c2538a, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            o oVar = new o(eVar);
            oVar.f106657f = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ljy3/a$g;", "<unused var>", "Lk10/c0;", "Ljy3/f;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Ljy3/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.q<jy3.a.g, k10.c0<Error>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106658e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106659f;

        p(tq.e<? super p> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Loading O(Error error) {
            return new Loading(error.getMakePaymentInitialData(), error.getIsGooglePayRemoteFlagActive(), error.getIsGooglePayReady());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f106659f;
            uq.b.e();
            if (this.f106658e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: jy3.p0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.p.O((Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(jy3.a.g gVar, k10.c0<Error> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            p pVar = new p(eVar);
            pVar.f106659f = c0Var;
            return pVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ljy3/e$a$a$d;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class q extends vq.k implements er.p<k10.c0<jy3.e.a.InterfaceC2541a.RequestGooglePay>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106661f;

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jy3.e.a.InterfaceC2541a.CollectGooglePayStatus O(jy3.e.a.InterfaceC2541a.RequestGooglePay requestGooglePay) {
            return new jy3.e.a.InterfaceC2541a.CollectGooglePayStatus(requestGooglePay.getMakePaymentInitialData(), requestGooglePay.getIsGooglePayRemoteFlagActive(), requestGooglePay.getIsGooglePayReady(), requestGooglePay.getResponseModel());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f106661f;
            Object objE = uq.b.e();
            int i15 = this.f106660e;
            if (i15 == 0) {
                oq.u.b(obj);
                s44.d dVar = h0.this.requestClientPaymentUC;
                s44.d.Params params = new s44.d.Params(((jy3.e.a.InterfaceC2541a.RequestGooglePay) c0Var.a()).getResponseModel().getGateway(), ((jy3.e.a.InterfaceC2541a.RequestGooglePay) c0Var.a()).getResponseModel().getGatewayMerchantId(), ((jy3.e.a.InterfaceC2541a.RequestGooglePay) c0Var.a()).getResponseModel().getTotalAmount(), ((jy3.e.a.InterfaceC2541a.RequestGooglePay) c0Var.a()).getMakePaymentInitialData().getInstitutionName());
                this.f106661f = c0Var;
                this.f106660e = 1;
                if (dVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: jy3.q0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.q.O((e.a.InterfaceC2541a.RequestGooglePay) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<jy3.e.a.InterfaceC2541a.RequestGooglePay> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            return ((q) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            q qVar = h0.this.new q(eVar);
            qVar.f106661f = obj;
            return qVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lq44/a;", "status", "Lk10/c0;", "Ljy3/e$a$a$a;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Lq44/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.q<q44.a, k10.c0<jy3.e.a.InterfaceC2541a.CollectGooglePayStatus>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f106663e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f106664f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f106665g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f106666h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f106667j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f106668k;

        r(tq.e<? super r> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed X(jy3.e.a.InterfaceC2541a.CollectGooglePayStatus collectGooglePayStatus) {
            return new Displayed(collectGooglePayStatus.getMakePaymentInitialData(), true, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jy3.e.a.InterfaceC2541a.GooglePayError Y(String str, jy3.e.a.InterfaceC2541a.CollectGooglePayStatus collectGooglePayStatus) {
            return new jy3.e.a.InterfaceC2541a.GooglePayError(collectGooglePayStatus.getMakePaymentInitialData(), collectGooglePayStatus.getIsGooglePayRemoteFlagActive(), collectGooglePayStatus.getIsGooglePayReady(), str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final jy3.e.a.InterfaceC2541a.GooglePayCancelled Z(String str, jy3.e.a.InterfaceC2541a.CollectGooglePayStatus collectGooglePayStatus) {
            return new jy3.e.a.InterfaceC2541a.GooglePayCancelled(collectGooglePayStatus.getMakePaymentInitialData(), collectGooglePayStatus.getIsGooglePayRemoteFlagActive(), collectGooglePayStatus.getIsGooglePayReady(), str);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            q44.a aVar = (q44.a) this.f106667j;
            k10.c0 c0Var = (k10.c0) this.f106668k;
            Object objE = uq.b.e();
            int i15 = this.f106666h;
            if (i15 == 0) {
                oq.u.b(obj);
                final String transactionId = ((jy3.e.a.InterfaceC2541a.CollectGooglePayStatus) c0Var.a()).getResponseModel().getTransactionId();
                if (fr.t.c(aVar, q44.a.d.f164732a)) {
                    return c0Var.c();
                }
                if (!(aVar instanceof q44.a.Success)) {
                    if (fr.t.c(aVar, q44.a.b.f164729a)) {
                        return c0Var.d(new er.l() { // from class: jy3.s0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return h0.r.Y(transactionId, (e.a.InterfaceC2541a.CollectGooglePayStatus) obj2);
                            }
                        });
                    }
                    if (fr.t.c(aVar, q44.a.C4092a.f164728a)) {
                        return c0Var.d(new er.l() { // from class: jy3.t0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return h0.r.Z(transactionId, (e.a.InterfaceC2541a.CollectGooglePayStatus) obj2);
                            }
                        });
                    }
                    throw new oq.p();
                }
                MakePaymentInitialData makePaymentInitialData = ((jy3.e.a.InterfaceC2541a.CollectGooglePayStatus) c0Var.a()).getMakePaymentInitialData();
                h0 h0Var = h0.this;
                xw.b<jy3.a.e> bVarY1 = h0Var.Y1();
                q44.a.Success success = (q44.a.Success) aVar;
                jy3.a.e.ToGooglePay toGooglePay = new jy3.a.e.ToGooglePay(new GooglePayNavParams(makePaymentInitialData.getSourcePaymentId(), mx.b.b(makePaymentInitialData.getPaymentTitle(), "paymentTitle"), mx.b.b(h0Var.currencyFormatter.b(makePaymentInitialData.getAmount(), makePaymentInitialData.getCurrency()), "paymentAmount"), new BEGooglePaySendPaymentTokenRequestModel(new BEGooglePayTokenModel(new BEIntermediateSigningKeyModel(success.getGooglePayTokenModel().getIntermediateSigningKey().a(), success.getGooglePayTokenModel().getIntermediateSigningKey().getSignedKey()), success.getGooglePayTokenModel().getProtocolVersion(), success.getGooglePayTokenModel().getSignature(), success.getGooglePayTokenModel().getSignedMessage()), transactionId)));
                this.f106667j = vq.j.a(aVar);
                this.f106668k = c0Var;
                this.f106663e = vq.j.a(transactionId);
                this.f106664f = vq.j.a(makePaymentInitialData);
                this.f106665g = 0;
                this.f106666h = 1;
                if (bVarY1.F(toGooglePay, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: jy3.r0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.r.X((e.a.InterfaceC2541a.CollectGooglePayStatus) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: V, reason: merged with bridge method [inline-methods] */
        public final Object w(q44.a aVar, k10.c0<jy3.e.a.InterfaceC2541a.CollectGooglePayStatus> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            r rVar = h0.this.new r(eVar);
            rVar.f106667j = aVar;
            rVar.f106668k = c0Var;
            return rVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Ljy3/e$a$a$c;", "state", "Lk10/l;", "Ljy3/e;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class s extends vq.k implements er.p<k10.c0<jy3.e.a.InterfaceC2541a.GooglePayError>, tq.e<? super k10.l<? extends jy3.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f106670e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f106671f;

        s(tq.e<? super s> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Displayed O(jy3.e.a.InterfaceC2541a.GooglePayError googlePayError) {
            return new Displayed(googlePayError.getMakePaymentInitialData(), true, true);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f106671f;
            Object objE = uq.b.e();
            int i15 = this.f106670e;
            if (i15 == 0) {
                oq.u.b(obj);
                ds0.b bVar = h0.this.notifyAboutGooglePayErrorUC;
                ds0.b.Params params = new ds0.b.Params(((jy3.e.a.InterfaceC2541a.GooglePayError) c0Var.a()).getTransactionId());
                this.f106671f = c0Var;
                this.f106670e = 1;
                if (bVar.c(params, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.d(new er.l() { // from class: jy3.u0
                @Override // er.l
                public final Object b(Object obj2) {
                    return h0.s.O((e.a.InterfaceC2541a.GooglePayError) obj2);
                }
            });
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<jy3.e.a.InterfaceC2541a.GooglePayError> c0Var, tq.e<? super k10.l<? extends jy3.e>> eVar) {
            return ((s) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            s sVar = h0.this.new s(eVar);
            sVar.f106671f = obj;
            return sVar;
        }
    }

    public h0(yy.a aVar, jy3.m mVar, ib4.c cVar, ac4.a aVar2, vx3.a aVar3, dz.a aVar4, s44.c cVar2, s44.b bVar, s44.a aVar5, s44.d dVar, ds0.d dVar2, ds0.b bVar2, hb4.d dVar3, SetupData setupData) {
        this.mapper = mVar;
        this.genericDomainErrorMapper = cVar;
        this.callActionWithLoaderUseCase = aVar2;
        this.getOneClickPaymentTypeUseCase = aVar3;
        this.currencyFormatter = aVar4;
        this.isGooglePayRemoteFlagActiveUC = cVar2;
        this.isGooglePayReadyUC = bVar;
        this.getGPClientPaymentStatusUpdatesUC = aVar5;
        this.requestClientPaymentUC = dVar;
        this.startGooglePayPaymentUC = dVar2;
        this.notifyAboutGooglePayErrorUC = bVar2;
        this.errorVMSFactory = dVar3;
        this.setupData = setupData;
        jy3.d dVar4 = jy3.d.f106552a;
        this.initialState = dVar4;
        this.stateMachine = aVar.a(dVar4, new er.l() { // from class: jy3.x
            @Override // er.l
            public final Object b(Object obj) {
                return h0.J9(this.f106723a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), H9(dVar4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hb4.c F9(dx.b domainError) {
        return this.errorVMSFactory.a(this.genericDomainErrorMapper.b(new ib4.c.Params(domainError, false, new er.l() { // from class: jy3.w
            @Override // er.l
            public final Object b(Object obj) {
                return h0.G9(this.f106721a, (ib4.c.b) obj);
            }
        }, 2, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G9(h0 h0Var, ib4.c.b bVar) {
        if (!(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
            if (bVar instanceof ib4.c.b.AbstractC2161b.C2162b) {
                h0Var.d9(jy3.a.g.f106545a);
            } else {
                if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
                    throw new oq.p();
                }
                h0Var.d9(jy3.a.C2538a.f106535a);
            }
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jy3.k.a H9(jy3.e state) {
        return this.mapper.b(new jy3.m.Params(state, b9(jy3.a.d.f106538a), b9(jy3.a.h.f106546a), b9(jy3.a.c.f106537a), b9(jy3.a.i.f106547a), b9(jy3.a.f.f106544a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(final h0 h0Var, k10.v vVar) {
        vVar.c(fr.q0.c(jy3.e.class), new er.l() { // from class: jy3.v
            @Override // er.l
            public final Object b(Object obj) {
                return h0.K9(this.f106720a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jy3.d.class), new er.l() { // from class: jy3.y
            @Override // er.l
            public final Object b(Object obj) {
                return h0.L9(this.f106725a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Displayed.class), new er.l() { // from class: jy3.z
            @Override // er.l
            public final Object b(Object obj) {
                return h0.M9(this.f106726a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: jy3.a0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.N9(this.f106549a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Loading.class), new er.l() { // from class: jy3.b0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.O9(this.f106551a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(Error.class), new er.l() { // from class: jy3.c0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.P9((k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jy3.e.a.InterfaceC2541a.RequestGooglePay.class), new er.l() { // from class: jy3.d0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.Q9(this.f106553a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jy3.e.a.InterfaceC2541a.CollectGooglePayStatus.class), new er.l() { // from class: jy3.e0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.R9(this.f106570a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jy3.e.a.InterfaceC2541a.GooglePayError.class), new er.l() { // from class: jy3.f0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.S9(this.f106575a, (k10.z) obj);
            }
        });
        vVar.c(fr.q0.c(jy3.e.a.InterfaceC2541a.GooglePayCancelled.class), new er.l() { // from class: jy3.g0
            @Override // er.l
            public final Object b(Object obj) {
                return h0.T9(this.f106579a, (k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(h0 h0Var, k10.z zVar) {
        b bVar = h0Var.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(jy3.a.e.class), oVar, bVar);
        zVar.x(fr.q0.c(jy3.a.d.class), oVar, h0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(h0 h0Var, k10.z zVar) {
        zVar.A(h0Var.new e(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(h0 h0Var, k10.z zVar) {
        f fVar = h0Var.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(jy3.a.c.class), oVar, fVar);
        zVar.x(fr.q0.c(jy3.a.h.class), oVar, h0Var.new g(null));
        zVar.x(fr.q0.c(jy3.a.ToOneClickAliases.class), oVar, h0Var.new h(null));
        zVar.x(fr.q0.c(jy3.a.i.class), oVar, h0Var.new i(null));
        zVar.v(fr.q0.c(jy3.a.f.class), oVar, new j(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(h0 h0Var, k10.z zVar) {
        k kVar = h0Var.new k(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(fr.q0.c(jy3.a.C2538a.class), oVar, kVar);
        zVar.v(fr.q0.c(jy3.a.g.class), oVar, new l(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(h0 h0Var, k10.z zVar) {
        zVar.C(h0Var.new m(null));
        n nVar = h0Var.new n(null);
        zVar.v(fr.q0.c(jy3.a.b.class), k10.o.CANCEL_PREVIOUS, nVar);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P9(k10.z zVar) {
        o oVar = new o(null);
        k10.o oVar2 = k10.o.CANCEL_PREVIOUS;
        zVar.v(fr.q0.c(jy3.a.C2538a.class), oVar2, oVar);
        zVar.v(fr.q0.c(jy3.a.g.class), oVar2, new p(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(h0 h0Var, k10.z zVar) {
        zVar.A(h0Var.new q(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(h0 h0Var, k10.z zVar) {
        k10.k.m(zVar, (mu.g) h0Var.getGPClientPaymentStatusUpdatesUC.a(gz.b.a.C1792a.f78542a), null, h0Var.new r(null), 2, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S9(h0 h0Var, k10.z zVar) {
        zVar.A(h0Var.new s(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 T9(h0 h0Var, k10.z zVar) {
        zVar.C(h0Var.new d(null));
        return oq.i0.f148189a;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: E9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(jy3.a.e eVar, tq.e<? super oq.i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: I9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(SetupData setupData) {
        super.P5(setupData);
    }

    @Override // zx.b
    public xw.b<jy3.a.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<jy3.e, jy3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public mu.p0<jy3.k.a> getState() {
        return this.state;
    }
}
