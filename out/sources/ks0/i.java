package ks0;

import ge4.x;
import js0.CheckWalletPaymentStatusResponse;
import js0.GooglePaySendPaymentTokenRequest;
import js0.GooglePaySendPaymentTokenResponse;
import js0.StartGooglePayPaymentRequest;
import js0.StartGooglePayPaymentResponse;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import xr0.BECheckWalletPaymentStatus;
import xr0.BEGooglePaySendPaymentTokenRequestModel;
import xr0.BEGooglePaySendPaymentTokenResponseModel;
import xr0.BEStartGooglePayPaymentRequestModel;
import xr0.BEStartGooglePayPaymentResponseModel;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ$\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00110\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00160\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u0017\u0010\u0018J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00190\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0096@¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001bR\u001b\u0010 \u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010$\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lks0/i;", "Lms0/c;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Lxr0/g;", "startGooglePayPaymentRequestModel", "Ldx/i;", "Ldx/b;", "Lxr0/h;", "c", "(Lxr0/g;Ltq/e;)Ljava/lang/Object;", "Lxr0/c;", "googlePaySendPaymentTokenRequestModel", "Lxr0/d;", "d", "(Lxr0/c;Ltq/e;)Ljava/lang/Object;", "", "transactionId", "Loq/i0;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lxr0/a;", "b", "Lpl/gov/coi/common/network/g0;", "Lhs0/e;", "Loq/k;", "i", "()Lhs0/e;", "googlePayClient", "Lhs0/i;", "j", "()Lhs0/i;", "paymentsClient", "paymentservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements ms0.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k googlePayClient;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k paymentsClient;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112439e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112441g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112439e = obj;
            this.f112441g |= PKIFailureInfo.systemUnavail;
            return i.this.b(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/p;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<CheckWalletPaymentStatusResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112442e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112444g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f112444g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112442e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.i iVarJ = i.this.j();
            String str = this.f112444g;
            this.f112442e = 1;
            Object objB = iVarJ.b(str, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new b(this.f112444g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<CheckWalletPaymentStatusResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Loq/i0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super x<i0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112445e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f112447g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tq.e<? super c> eVar) {
            super(1, eVar);
            this.f112447g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112445e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.e eVarI = i.this.i();
            String str = this.f112447g;
            this.f112445e = 1;
            Object objA = eVarI.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new c(this.f112447g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<i0>> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112448d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112449e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112451g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112449e = obj;
            this.f112451g |= PKIFailureInfo.systemUnavail;
            return i.this.d(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/u;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.l<tq.e<? super x<GooglePaySendPaymentTokenResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112452e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEGooglePaySendPaymentTokenRequestModel f112454g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(BEGooglePaySendPaymentTokenRequestModel bEGooglePaySendPaymentTokenRequestModel, tq.e<? super e> eVar) {
            super(1, eVar);
            this.f112454g = bEGooglePaySendPaymentTokenRequestModel;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112452e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.e eVarI = i.this.i();
            GooglePaySendPaymentTokenRequest googlePaySendPaymentTokenRequestH = is0.b.h(this.f112454g);
            this.f112452e = 1;
            Object objB = eVarI.b(googlePaySendPaymentTokenRequestH, this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new e(this.f112454g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<GooglePaySendPaymentTokenResponse>> eVar) {
            return ((e) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f112455d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f112456e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f112458g;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f112456e = obj;
            this.f112458g |= PKIFailureInfo.systemUnavail;
            return i.this.c(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Ljs0/y0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.l<tq.e<? super x<StartGooglePayPaymentResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f112459e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEStartGooglePayPaymentRequestModel f112461g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(BEStartGooglePayPaymentRequestModel bEStartGooglePayPaymentRequestModel, tq.e<? super g> eVar) {
            super(1, eVar);
            this.f112461g = bEStartGooglePayPaymentRequestModel;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f112459e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            hs0.e eVarI = i.this.i();
            StartGooglePayPaymentRequest startGooglePayPaymentRequestI = is0.b.i(this.f112461g);
            this.f112459e = 1;
            Object objC = eVarI.c(startGooglePayPaymentRequestI, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return i.this.new g(this.f112461g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<StartGooglePayPaymentResponse>> eVar) {
            return ((g) M(eVar)).J(i0.f148189a);
        }
    }

    public i(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.googlePayClient = oq.l.a(new er.a() { // from class: ks0.g
            @Override // er.a
            public final Object a() {
                return i.k(wVar);
            }
        });
        this.paymentsClient = oq.l.a(new er.a() { // from class: ks0.h
            @Override // er.a
            public final Object a() {
                return i.l(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.e i() {
        return (hs0.e) this.googlePayClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final hs0.i j() {
        return (hs0.i) this.paymentsClient.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.e k(w wVar) {
        return (hs0.e) w.b(wVar, null, hs0.e.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final hs0.i l(w wVar) {
        return (hs0.i) w.b(wVar, null, hs0.i.class, 1, null);
    }

    @Override // ms0.c
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
        return this.networkCallMediator.b(new c(str, null), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.c
    public Object b(String str, tq.e<? super dx.i<? extends dx.b, BECheckWalletPaymentStatus>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f112441g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f112441g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f112439e;
        Object objE = uq.b.e();
        int i16 = aVar.f112441g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(str, null);
            aVar.f112438d = vq.j.a(str);
            aVar.f112441g = 1;
            objB = g0Var.b(bVar, aVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(is0.b.a((CheckWalletPaymentStatusResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.c
    public Object c(BEStartGooglePayPaymentRequestModel bEStartGooglePayPaymentRequestModel, tq.e<? super dx.i<? extends dx.b, BEStartGooglePayPaymentResponseModel>> eVar) throws Throwable {
        f fVar;
        if (eVar instanceof f) {
            fVar = (f) eVar;
            int i15 = fVar.f112458g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                fVar.f112458g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                fVar = new f(eVar);
            }
        } else {
            fVar = new f(eVar);
        }
        Object objB = fVar.f112456e;
        Object objE = uq.b.e();
        int i16 = fVar.f112458g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            g gVar = new g(bEStartGooglePayPaymentRequestModel, null);
            fVar.f112455d = vq.j.a(bEStartGooglePayPaymentRequestModel);
            fVar.f112458g = 1;
            objB = g0Var.b(gVar, fVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(is0.b.d((StartGooglePayPaymentResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // ms0.c
    public Object d(BEGooglePaySendPaymentTokenRequestModel bEGooglePaySendPaymentTokenRequestModel, tq.e<? super dx.i<? extends dx.b, BEGooglePaySendPaymentTokenResponseModel>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f112451g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f112451g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objB = dVar.f112449e;
        Object objE = uq.b.e();
        int i16 = dVar.f112451g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            e eVar2 = new e(bEGooglePaySendPaymentTokenRequestModel, null);
            dVar.f112448d = vq.j.a(bEGooglePaySendPaymentTokenRequestModel);
            dVar.f112451g = 1;
            objB = g0Var.b(eVar2, dVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar = (dx.i) objB;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            return new dx.i.Right(is0.b.c((GooglePaySendPaymentTokenResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }
}
