package go3;

import co3.QrCodeData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0011\u000fB\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lgo3/h0;", "", "Lgo3/h0$b;", "", "Lgo3/d;", "fetchQrCodeDataUseCase", "Lgo3/b;", "checkVerificationTypeUseCase", "<init>", "(Lgo3/d;Lgo3/b;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/h0$b;Ltq/e;)Ljava/lang/Object;", "a", "Lgo3/d;", "b", "Lgo3/b;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h0 implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final a f75462c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f75463d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d fetchQrCodeDataUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b checkVerificationTypeUseCase;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lgo3/h0$a;", "", "<init>", "()V", "", "QR_CODE_SEPARATOR", "Ljava/lang/String;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: go3.h0$b, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lgo3/h0$b;", "Lgz/b$a;", "", "qrCode", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String qrCode;

        public Params(String str) {
            this.qrCode = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getQrCode() {
            return this.qrCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.qrCode, ((Params) other).qrCode);
        }

        public int hashCode() {
            return this.qrCode.hashCode();
        }

        public String toString() {
            return "Params(qrCode=" + this.qrCode + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75467d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75468e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75469f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75470g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f75471h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f75472j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75474l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75472j = obj;
            this.f75474l |= PKIFailureInfo.systemUnavail;
            return h0.this.d(null, this);
        }
    }

    public h0(d dVar, b bVar) {
        this.fetchQrCodeDataUseCase = dVar;
        this.checkVerificationTypeUseCase = bVar;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, String>> eVar) throws Throwable {
        c cVar;
        Params params2;
        QrCodeData qrCodeData;
        dx.i iVar;
        co3.u uVar;
        String attribute1;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f75474l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f75474l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f75472j;
        Object objE = uq.b.e();
        int i16 = cVar.f75474l;
        if (i16 == 0) {
            oq.u.b(objD);
            d dVar = this.fetchQrCodeDataUseCase;
            d.Params params3 = new d.Params(params.getQrCode());
            cVar.f75467d = vq.j.a(params);
            cVar.f75474l = 1;
            objD = dVar.d(params3, cVar);
            if (objD != objE) {
                params2 = params;
            }
            return objE;
        }
        if (i16 == 1) {
            params2 = (Params) cVar.f75467d;
            oq.u.b(objD);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            qrCodeData = (QrCodeData) cVar.f75469f;
            oq.u.b(objD);
        }
        iVar = (dx.i) objD;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (iVar instanceof dx.i.Right) {
            throw new oq.p();
        }
        uVar = (co3.u) ((dx.i.Right) iVar).b();
        Integer numE = vq.b.e(qrCodeData.getServiceType());
        co3.f qrType = qrCodeData.getQrType();
        String version = qrCodeData.getVersion();
        String macAddress = qrCodeData.getMacAddress();
        String deviceType = qrCodeData.getDeviceType();
        String stakeholderID = qrCodeData.getStakeholderID();
        String commLayerToken = qrCodeData.getCommLayerToken();
        String securityToken = qrCodeData.getSecurityToken();
        String currentTime = qrCodeData.getCurrentTime();
        String validTime = qrCodeData.getValidTime();
        String recipientID = qrCodeData.getRecipientID();
        String feedbackData = qrCodeData.getFeedbackData();
        if (fr.t.c(uVar, co3.u.b.f28656a)) {
            attribute1 = "";
        } else {
            if (!fr.t.c(uVar, co3.u.a.f28655a) && !fr.t.c(uVar, co3.u.c.f28657a)) {
                throw new oq.p();
            }
            attribute1 = qrCodeData.getAttribute1();
        }
        return new dx.i.Right(pq.v.v0(pq.v.q(numE, qrType, version, macAddress, deviceType, stakeholderID, commLayerToken, securityToken, currentTime, validTime, recipientID, feedbackData, attribute1, qrCodeData.getAttribute2(), qrCodeData.getAttribute3()), ";", null, null, 0, null, null, 62, null));
        dx.i iVar2 = (dx.i) objD;
        if (iVar2 instanceof dx.i.Left) {
            return iVar2;
        }
        if (!(iVar2 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        QrCodeData qrCodeData2 = (QrCodeData) ((dx.i.Right) iVar2).b();
        b bVar = this.checkVerificationTypeUseCase;
        b.Params params4 = new b.Params(qrCodeData2);
        cVar.f75467d = vq.j.a(params2);
        cVar.f75468e = vq.j.a(iVar2);
        cVar.f75469f = qrCodeData2;
        cVar.f75470g = 0;
        cVar.f75471h = 0;
        cVar.f75474l = 2;
        objD = bVar.d(params4, cVar);
        if (objD != objE) {
            qrCodeData = qrCodeData2;
            iVar = (dx.i) objD;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (iVar instanceof dx.i.Right) {
                throw new oq.p();
            }
            uVar = (co3.u) ((dx.i.Right) iVar).b();
            Integer numE2 = vq.b.e(qrCodeData.getServiceType());
            co3.f qrType2 = qrCodeData.getQrType();
            String version2 = qrCodeData.getVersion();
            String macAddress2 = qrCodeData.getMacAddress();
            String deviceType2 = qrCodeData.getDeviceType();
            String stakeholderID2 = qrCodeData.getStakeholderID();
            String commLayerToken2 = qrCodeData.getCommLayerToken();
            String securityToken2 = qrCodeData.getSecurityToken();
            String currentTime2 = qrCodeData.getCurrentTime();
            String validTime2 = qrCodeData.getValidTime();
            String recipientID2 = qrCodeData.getRecipientID();
            String feedbackData2 = qrCodeData.getFeedbackData();
            if (fr.t.c(uVar, co3.u.b.f28656a)) {
                attribute1 = "";
            } else {
                if (!fr.t.c(uVar, co3.u.a.f28655a)) {
                    throw new oq.p();
                }
                attribute1 = qrCodeData.getAttribute1();
            }
            return new dx.i.Right(pq.v.v0(pq.v.q(numE2, qrType2, version2, macAddress2, deviceType2, stakeholderID2, commLayerToken2, securityToken2, currentTime2, validTime2, recipientID2, feedbackData2, attribute1, qrCodeData.getAttribute2(), qrCodeData.getAttribute3()), ";", null, null, 0, null, null, 62, null));
        }
        return objE;
    }
}
