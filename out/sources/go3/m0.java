package go3;

import co3.QrCodeData;
import co3.SecondDocument;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 &2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0019\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010%\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006'"}, d2 = {"Lgo3/m0;", "", "Lgo3/m0$b;", "Loq/i0;", "Lco3/i;", "scopeMapper", "Lz92/e;", "saveHistoryUseCase", "Lmx/c;", "labelProvider", "Lho3/e;", "prepareAndSendDataUC", "Lbo3/a;", "verificationContainersInteractor", "Lez/a;", "currentTimeProvider", "<init>", "(Lco3/i;Lz92/e;Lmx/c;Lho3/e;Lbo3/a;Lez/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/m0$b;Ltq/e;)Ljava/lang/Object;", "a", "Lco3/i;", "b", "Lz92/e;", "c", "Lmx/c;", "Lho3/e;", "e", "Lbo3/a;", "f", "Lez/a;", "Ldx/b$c;", "g", "Ldx/b$c;", "verificationExpiredError", "h", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m0 implements gz.b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f75611i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final co3.i scopeMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z92.e saveHistoryUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ho3.e prepareAndSendDataUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business verificationExpiredError;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75628d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75629e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75630f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75631g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75632h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f75633j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f75634k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75635l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75636m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f75637n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f75639q;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75637n = obj;
            this.f75639q |= PKIFailureInfo.systemUnavail;
            return m0.this.d(null, this);
        }
    }

    public m0(co3.i iVar, z92.e eVar, mx.c cVar, ho3.e eVar2, bo3.a aVar, ez.a aVar2) {
        this.scopeMapper = iVar;
        this.saveHistoryUseCase = eVar;
        this.labelProvider = cVar;
        this.prepareAndSendDataUC = eVar2;
        this.verificationContainersInteractor = aVar;
        this.currentTimeProvider = aVar2;
        this.verificationExpiredError = new dx.b.Business(co3.a.VERIFICATION_EXPIRED, null, cVar.c(un3.b.f199468p1), cVar.c(un3.b.f199458n1), null, cVar.c(un3.b.f199463o1), cVar.c(un3.b.f199406d), 18, null);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0110  */
    /* JADX WARN: Code duplicated, block: B:33:0x011c  */
    /* JADX WARN: Code duplicated, block: B:34:0x0120  */
    /* JADX WARN: Code duplicated, block: B:41:0x0137  */
    /* JADX WARN: Code duplicated, block: B:43:0x013f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0145  */
    /* JADX WARN: Code duplicated, block: B:47:0x0149  */
    /* JADX WARN: Code duplicated, block: B:60:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0198, code lost:
    
        if (r1 == r3) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(go3.m0.Params r26, tq.e<? super dx.i<? extends dx.b, oq.i0>> r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 490
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.m0.d(go3.m0$b, tq.e):java.lang.Object");
    }

    /* JADX INFO: renamed from: go3.m0$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b\u001d\u0010\u0014R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b!\u0010\u0014R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b%\u0010(R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u001e\u001a\u0004\b \u0010\u0014R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b)\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b0\u0010\u001e\u001a\u0004\b-\u0010\u0014¨\u00061"}, d2 = {"Lgo3/m0$b;", "Lgz/b$a;", "", "sessionId", "encodedCert", "Loq/r;", "Lk34/a0;", "scope", "mainDocument", "Lco3/j;", "pictureData", "expireDateTime", "Lrq0/b;", "documentType", "Lco3/e;", "qrCodeData", "schemaId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Loq/r;Ljava/lang/String;Lco3/j;Ljava/lang/String;Lrq0/b;Lco3/e;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "l", "b", "c", "Loq/r;", "i", "()Loq/r;", "d", "e", "Lco3/j;", "()Lco3/j;", "f", "g", "Lrq0/b;", "()Lrq0/b;", "h", "Lco3/e;", "()Lco3/e;", "j", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encodedCert;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<k34.a0, k34.a0> scope;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mainDocument;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final SecondDocument pictureData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String expireDateTime;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String schemaId;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(String str, String str2, oq.r<? extends k34.a0, ? extends k34.a0> rVar, String str3, SecondDocument secondDocument, String str4, rq0.b bVar, QrCodeData qrCodeData, String str5) {
            this.sessionId = str;
            this.encodedCert = str2;
            this.scope = rVar;
            this.mainDocument = str3;
            this.pictureData = secondDocument;
            this.expireDateTime = str4;
            this.documentType = bVar;
            this.qrCodeData = qrCodeData;
            this.schemaId = str5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEncodedCert() {
            return this.encodedCert;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getExpireDateTime() {
            return this.expireDateTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getMainDocument() {
            return this.mainDocument;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final SecondDocument getPictureData() {
            return this.pictureData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.sessionId, params.sessionId) && fr.t.c(this.encodedCert, params.encodedCert) && fr.t.c(this.scope, params.scope) && fr.t.c(this.mainDocument, params.mainDocument) && fr.t.c(this.pictureData, params.pictureData) && fr.t.c(this.expireDateTime, params.expireDateTime) && fr.t.c(this.documentType, params.documentType) && fr.t.c(this.qrCodeData, params.qrCodeData) && fr.t.c(this.schemaId, params.schemaId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSchemaId() {
            return this.schemaId;
        }

        public int hashCode() {
            int iHashCode = ((((((this.sessionId.hashCode() * 31) + this.encodedCert.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.mainDocument.hashCode()) * 31;
            SecondDocument secondDocument = this.pictureData;
            int iHashCode2 = (((((((iHashCode + (secondDocument == null ? 0 : secondDocument.hashCode())) * 31) + this.expireDateTime.hashCode()) * 31) + this.documentType.hashCode()) * 31) + this.qrCodeData.hashCode()) * 31;
            String str = this.schemaId;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final oq.r<k34.a0, k34.a0> i() {
            return this.scope;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public String toString() {
            return "Params(sessionId=" + this.sessionId + ", encodedCert=" + this.encodedCert + ", scope=" + this.scope + ", mainDocument=" + this.mainDocument + ", pictureData=" + this.pictureData + ", expireDateTime=" + this.expireDateTime + ", documentType=" + this.documentType + ", qrCodeData=" + this.qrCodeData + ", schemaId=" + this.schemaId + ')';
        }

        public /* synthetic */ Params(String str, String str2, oq.r rVar, String str3, SecondDocument secondDocument, String str4, rq0.b bVar, QrCodeData qrCodeData, String str5, int i15, fr.k kVar) {
            this(str, str2, rVar, str3, secondDocument, str4, bVar, qrCodeData, (i15 & 256) != 0 ? null : str5);
        }
    }
}
