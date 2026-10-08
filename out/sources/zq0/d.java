package zq0;

import fv.e0;
import ge4.x;
import java.util.List;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.HttpServiceParameters;
import pl.gov.coi.common.network.g0;
import pl.gov.coi.common.network.w;
import pl.gov.coi.common.network.y;
import tq0.BEFile;
import tq0.BEOrderDocumentRequest;
import tq0.BEOrderDocumentResponse;
import tq0.LandRegisterDocumentTypesFee;
import tq0.MyRegistry;
import tq0.OrderedDocumentByNumber;
import wx.FileContent;
import yq0.LandRegisterDocumentTypesFeeResponse;
import yq0.LandRegisterEntriesResponse;
import yq0.LandRegisterOrderedDocumentsResponse;
import yq0.LandRegisterReadyOrderedDocumentResponse;
import yq0.LandRegisterVerifyDocumentResponse;
import yq0.OrderLandRegisterDocumentRequestDto;
import yq0.OrderLandRegisterDocumentResponse;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\bH\u0096@¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u000e0\bH\u0096@¢\u0006\u0004\b\u000f\u0010\rJ\"\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\n0\bH\u0096@¢\u0006\u0004\b\u0011\u0010\rJ$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00140\b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016J$\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00190\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\u001d\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 J$\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\"\u001a\u00020!H\u0096@¢\u0006\u0004\b#\u0010\u001bJ$\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u001e0\b2\u0006\u0010\"\u001a\u00020$H\u0096@¢\u0006\u0004\b%\u0010\u001bJ$\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020'0\b2\u0006\u0010\"\u001a\u00020&H\u0096@¢\u0006\u0004\b(\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010)R\u001b\u0010.\u001a\u00020*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010+\u001a\u0004\b,\u0010-R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010+\u001a\u0004\b1\u00102R\u001b\u00106\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010+\u001a\u0004\b5\u00102¨\u00067"}, d2 = {"Lzq0/d;", "Lbr0/a;", "Lpl/gov/coi/common/network/w;", "httpServiceFactory", "Lpl/gov/coi/common/network/g0;", "networkCallMediator", "<init>", "(Lpl/gov/coi/common/network/w;Lpl/gov/coi/common/network/g0;)V", "Ldx/i;", "Ldx/b;", "", "Ltq0/u;", "A0", "(Ltq/e;)Ljava/lang/Object;", "Ltq0/r;", "v0", "Ltq0/v;", "b", "Ltq0/h;", "request", "Ltq0/i;", "x0", "(Ltq0/h;Ltq/e;)Ljava/lang/Object;", "", "verificationCode", "Ltq0/n;", "a", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Ltq0/b;", "documentId", "Ltq0/d;", "y0", "(Ltq0/b;Ltq/e;)Ljava/lang/Object;", "Ltq0/m;", "code", "B0", "Ltq0/a;", "z0", "Ltq0/j;", "Ltq0/c;", "w0", "Lpl/gov/coi/common/network/g0;", "Lwq0/a;", "Loq/k;", "m", "()Lwq0/a;", "nationalCourtRegister", "Lwq0/b;", "c", "l", "()Lwq0/b;", "documentOrderController", "d", "k", "documentDownloaderControllerLongPoll", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements br0.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g0 networkCallMediator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final oq.k nationalCourtRegister;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final oq.k documentOrderController;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k documentDownloaderControllerLongPoll;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236262d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236263e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236265g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236263e = obj;
            this.f236265g |= PKIFailureInfo.systemUnavail;
            return d.this.x0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyq0/a0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super x<OrderLandRegisterDocumentResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236266e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ BEOrderDocumentRequest f236268g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(BEOrderDocumentRequest bEOrderDocumentRequest, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f236268g = bEOrderDocumentRequest;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236266e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.b bVarL = d.this.l();
            OrderLandRegisterDocumentRequestDto orderLandRegisterDocumentRequestDtoU = xq0.a.u(this.f236268g);
            this.f236266e = 1;
            Object objC = bVarL.c(orderLandRegisterDocumentRequestDtoU, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new b(this.f236268g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<OrderLandRegisterDocumentResponse>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236269d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236270e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236272g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236270e = obj;
            this.f236272g |= PKIFailureInfo.systemUnavail;
            return d.this.z0(null, this);
        }
    }

    /* JADX INFO: renamed from: zq0.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class C6385d extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236273e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f236275g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6385d(String str, tq.e<? super C6385d> eVar) {
            super(1, eVar);
            this.f236275g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236273e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.b bVarL = d.this.l();
            String str = this.f236275g;
            this.f236273e = 1;
            Object objG = bVarL.g(str, this);
            return objG == objE ? objE : objG;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new C6385d(this.f236275g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((C6385d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class e extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236276d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236277e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236279g;

        e(tq.e<? super e> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236277e = obj;
            this.f236279g |= PKIFailureInfo.systemUnavail;
            return d.this.B0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236280e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f236282g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, tq.e<? super f> eVar) {
            super(1, eVar);
            this.f236282g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236280e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.b bVarK = d.this.k();
            String str = this.f236282g;
            this.f236280e = 1;
            Object objF = bVarK.f(str, this);
            return objF == objE ? objE : objF;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new f(this.f236282g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((f) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236284e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236286g;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236284e = obj;
            this.f236286g |= PKIFailureInfo.systemUnavail;
            return d.this.y0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lfv/e0;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.l<tq.e<? super x<e0>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236287e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ tq0.b f236289g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(tq0.b bVar, tq.e<? super h> eVar) {
            super(1, eVar);
            this.f236289g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236287e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.b bVarL = d.this.l();
            String id5 = this.f236289g.getId();
            this.f236287e = 1;
            Object objD = bVarL.d(id5, this);
            return objD == objE ? objE : objD;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new h(this.f236289g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<e0>> eVar) {
            return ((h) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236290d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236291e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236293g;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236291e = obj;
            this.f236293g |= PKIFailureInfo.systemUnavail;
            return d.this.w0(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyq0/r;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super x<LandRegisterReadyOrderedDocumentResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236294e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f236296g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(String str, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f236296g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236294e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.b bVarK = d.this.k();
            String str = this.f236296g;
            this.f236294e = 1;
            Object objE2 = bVarK.e(str, this);
            return objE2 == objE ? objE : objE2;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new j(this.f236296g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LandRegisterReadyOrderedDocumentResponse>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f236297d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f236299f;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236297d = obj;
            this.f236299f |= PKIFailureInfo.systemUnavail;
            return d.this.v0(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyq0/l;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.l<tq.e<? super x<LandRegisterDocumentTypesFeeResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236300e;

        l(tq.e<? super l> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236300e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.a aVarM = d.this.m();
            this.f236300e = 1;
            Object objA = aVarM.a(this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new l(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LandRegisterDocumentTypesFeeResponse>> eVar) {
            return ((l) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f236302d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f236304f;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236302d = obj;
            this.f236304f |= PKIFailureInfo.systemUnavail;
            return d.this.A0(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyq0/m;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super x<LandRegisterEntriesResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236305e;

        n(tq.e<? super n> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236305e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.a aVarM = d.this.m();
            this.f236305e = 1;
            Object objB = aVarM.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new n(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LandRegisterEntriesResponse>> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class o extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f236307d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f236309f;

        o(tq.e<? super o> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236307d = obj;
            this.f236309f |= PKIFailureInfo.systemUnavail;
            return d.this.b(this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyq0/q;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class p extends vq.k implements er.l<tq.e<? super x<LandRegisterOrderedDocumentsResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236310e;

        p(tq.e<? super p> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236310e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.b bVarL = d.this.l();
            this.f236310e = 1;
            Object objB = bVarL.b(this);
            return objB == objE ? objE : objB;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new p(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LandRegisterOrderedDocumentsResponse>> eVar) {
            return ((p) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class q extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f236312d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f236313e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f236315g;

        q(tq.e<? super q> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f236313e = obj;
            this.f236315g |= PKIFailureInfo.systemUnavail;
            return d.this.a(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lge4/x;", "Lyq0/t;", "<anonymous>", "()Lge4/x;"}, k = 3, mv = {2, 2, 0})
    static final class r extends vq.k implements er.l<tq.e<? super x<LandRegisterVerifyDocumentResponse>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f236316e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f236318g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        r(String str, tq.e<? super r> eVar) {
            super(1, eVar);
            this.f236318g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f236316e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            wq0.b bVarL = d.this.l();
            String str = this.f236318g;
            this.f236316e = 1;
            Object objA = bVarL.a(str, this);
            return objA == objE ? objE : objA;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return d.this.new r(this.f236318g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super x<LandRegisterVerifyDocumentResponse>> eVar) {
            return ((r) M(eVar)).J(i0.f148189a);
        }
    }

    public d(final w wVar, g0 g0Var) {
        this.networkCallMediator = g0Var;
        this.nationalCourtRegister = oq.l.a(new er.a() { // from class: zq0.a
            @Override // er.a
            public final Object a() {
                return d.n(wVar);
            }
        });
        this.documentOrderController = oq.l.a(new er.a() { // from class: zq0.b
            @Override // er.a
            public final Object a() {
                return d.j(wVar);
            }
        });
        this.documentDownloaderControllerLongPoll = oq.l.a(new er.a() { // from class: zq0.c
            @Override // er.a
            public final Object a() {
                return d.i(wVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wq0.b i(w wVar) {
        return (wq0.b) wVar.a(new y.Backend(new y.b.C3925b(new HttpServiceParameters(gu.b.o(zq0.e.f236319a), null, 2, null))), wq0.b.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wq0.b j(w wVar) {
        return (wq0.b) w.b(wVar, null, wq0.b.class, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wq0.b k() {
        return (wq0.b) this.documentDownloaderControllerLongPoll.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wq0.b l() {
        return (wq0.b) this.documentOrderController.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wq0.a m() {
        return (wq0.a) this.nationalCourtRegister.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final wq0.a n(w wVar) {
        return (wq0.a) w.b(wVar, null, wq0.a.class, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.a
    public Object A0(tq.e<? super dx.i<? extends dx.b, ? extends List<MyRegistry>>> eVar) throws Throwable {
        m mVar;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f236304f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f236304f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objB = mVar.f236302d;
        Object objE = uq.b.e();
        int i16 = mVar.f236304f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            n nVar = new n(null);
            mVar.f236304f = 1;
            objB = g0Var.b(nVar, mVar);
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
            return new dx.i.Right(xq0.a.q((LandRegisterEntriesResponse) ((dx.i.Right) iVar).b()));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.a
    public Object B0(String str, tq.e<? super dx.i<? extends dx.b, BEFile>> eVar) throws Throwable {
        e eVar2;
        if (eVar instanceof e) {
            eVar2 = (e) eVar;
            int i15 = eVar2.f236279g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                eVar2.f236279g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                eVar2 = new e(eVar);
            }
        } else {
            eVar2 = new e(eVar);
        }
        Object objB = eVar2.f236277e;
        Object objE = uq.b.e();
        int i16 = eVar2.f236279g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            f fVar = new f(str, null);
            eVar2.f236276d = vq.j.a(str);
            eVar2.f236279g = 1;
            objB = g0Var.b(fVar, eVar2);
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
            return new dx.i.Right(new BEFile(new FileContent(((e0) ((dx.i.Right) iVar).b()).h())));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.a
    public Object a(String str, tq.e<? super dx.i<? extends dx.b, tq0.n>> eVar) throws Throwable {
        q qVar;
        if (eVar instanceof q) {
            qVar = (q) eVar;
            int i15 = qVar.f236315g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                qVar.f236315g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                qVar = new q(eVar);
            }
        } else {
            qVar = new q(eVar);
        }
        Object objB = qVar.f236313e;
        Object objE = uq.b.e();
        int i16 = qVar.f236315g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            r rVar = new r(str, null);
            qVar.f236312d = vq.j.a(str);
            qVar.f236315g = 1;
            objB = g0Var.b(rVar, qVar);
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
            return xq0.a.m((LandRegisterVerifyDocumentResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.a
    public Object b(tq.e<? super dx.i<? extends dx.b, ? extends List<OrderedDocumentByNumber>>> eVar) throws Throwable {
        o oVar;
        if (eVar instanceof o) {
            oVar = (o) eVar;
            int i15 = oVar.f236309f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                oVar.f236309f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                oVar = new o(eVar);
            }
        } else {
            oVar = new o(eVar);
        }
        Object objB = oVar.f236307d;
        Object objE = uq.b.e();
        int i16 = oVar.f236309f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            p pVar = new p(null);
            oVar.f236309f = 1;
            objB = g0Var.b(pVar, oVar);
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
            return xq0.a.j((LandRegisterOrderedDocumentsResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.a
    public Object v0(tq.e<? super dx.i<? extends dx.b, LandRegisterDocumentTypesFee>> eVar) throws Throwable {
        k kVar;
        if (eVar instanceof k) {
            kVar = (k) eVar;
            int i15 = kVar.f236299f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                kVar.f236299f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                kVar = new k(eVar);
            }
        } else {
            kVar = new k(eVar);
        }
        Object objB = kVar.f236297d;
        Object objE = uq.b.e();
        int i16 = kVar.f236299f;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            l lVar = new l(null);
            kVar.f236299f = 1;
            objB = g0Var.b(lVar, kVar);
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
            return xq0.a.g((LandRegisterDocumentTypesFeeResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.a
    public Object w0(String str, tq.e<? super dx.i<? extends dx.b, ? extends tq0.c>> eVar) throws Throwable {
        i iVar;
        if (eVar instanceof i) {
            iVar = (i) eVar;
            int i15 = iVar.f236293g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f236293g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar);
            }
        } else {
            iVar = new i(eVar);
        }
        Object objB = iVar.f236291e;
        Object objE = uq.b.e();
        int i16 = iVar.f236293g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            j jVar = new j(str, null);
            iVar.f236290d = vq.j.a(str);
            iVar.f236293g = 1;
            objB = g0Var.b(jVar, iVar);
            if (objB == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objB);
        }
        dx.i iVar2 = (dx.i) objB;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (iVar2 instanceof dx.i.Right) {
            return xq0.a.k((LandRegisterReadyOrderedDocumentResponse) ((dx.i.Right) iVar2).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.a
    public Object x0(BEOrderDocumentRequest bEOrderDocumentRequest, tq.e<? super dx.i<? extends dx.b, BEOrderDocumentResponse>> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f236265g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f236265g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object objB = aVar.f236263e;
        Object objE = uq.b.e();
        int i16 = aVar.f236265g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            b bVar = new b(bEOrderDocumentRequest, null);
            aVar.f236262d = vq.j.a(bEOrderDocumentRequest);
            aVar.f236265g = 1;
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
            return xq0.a.o((OrderLandRegisterDocumentResponse) ((dx.i.Right) iVar).b());
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.a
    public Object y0(tq0.b bVar, tq.e<? super dx.i<? extends dx.b, BEFile>> eVar) throws Throwable {
        g gVar;
        if (eVar instanceof g) {
            gVar = (g) eVar;
            int i15 = gVar.f236286g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                gVar.f236286g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                gVar = new g(eVar);
            }
        } else {
            gVar = new g(eVar);
        }
        Object objB = gVar.f236284e;
        Object objE = uq.b.e();
        int i16 = gVar.f236286g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            h hVar = new h(bVar, null);
            gVar.f236283d = vq.j.a(bVar);
            gVar.f236286g = 1;
            objB = g0Var.b(hVar, gVar);
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
            return new dx.i.Right(new BEFile(new FileContent(((e0) ((dx.i.Right) iVar).b()).h())));
        }
        throw new oq.p();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // br0.a
    public Object z0(String str, tq.e<? super dx.i<? extends dx.b, BEFile>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f236272g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f236272g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objB = cVar.f236270e;
        Object objE = uq.b.e();
        int i16 = cVar.f236272g;
        if (i16 == 0) {
            u.b(objB);
            g0 g0Var = this.networkCallMediator;
            C6385d c6385d = new C6385d(str, null);
            cVar.f236269d = vq.j.a(str);
            cVar.f236272g = 1;
            objB = g0Var.b(c6385d, cVar);
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
            return new dx.i.Right(new BEFile(new FileContent(((e0) ((dx.i.Right) iVar).b()).h())));
        }
        throw new oq.p();
    }
}
