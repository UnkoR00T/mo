package ho3;

import co3.EncodedDocumentWithAdditionalScope;
import co3.QrCodeData;
import co3.n;
import dx.i;
import fr.t;
import go3.m;
import go3.m0;
import go3.s;
import k34.a0;
import oq.r;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.l1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001$B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ<\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00102\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J:\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0014\u001a\u00020\u00132\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010H\u0082@¢\u0006\u0004\b\u001a\u0010\u001bJ.\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010 J$\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00030\u00152\u0006\u0010!\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010,¨\u0006-"}, d2 = {"Lho3/g;", "", "Lho3/g$a;", "Loq/i0;", "Lgo3/m;", "getFamilyDocumentUseCase", "Lgo3/s;", "getOwnerDocumentUseCase", "Lgo3/m0;", "sendVerificationUseCase", "Lbo3/a;", "verificationContainersInteractor", "Lq34/l1;", "isDocumentStoredByIdUC", "<init>", "(Lgo3/m;Lgo3/s;Lgo3/m0;Lbo3/a;Lq34/l1;)V", "Loq/r;", "Lk34/a0;", "scope", "Lco3/n;", "subDocument", "Ldx/i;", "Ldx/b;", "Lco3/b;", "h", "(Loq/r;Lco3/n;Ltq/e;)Ljava/lang/Object;", "g", "(Lco3/n;Loq/r;Ltq/e;)Ljava/lang/Object;", "Lwn3/c;", "verificationEntryPoint", "", "e", "(Lk34/a0;Lwn3/c;Ltq/e;)Ljava/lang/Object;", "params", "f", "(Lho3/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo3/m;", "b", "Lgo3/s;", "c", "Lgo3/m0;", "d", "Lbo3/a;", "Lq34/l1;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final m getFamilyDocumentUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final s getOwnerDocumentUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final m0 sendVerificationUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l1 isDocumentStoredByIdUC;

    /* JADX INFO: renamed from: ho3.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010)\u001a\u0004\b*\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001f\u0010,\u001a\u0004\b%\u0010-R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b!\u0010\u0014R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b*\u0010/\u001a\u0004\b0\u00101¨\u00062"}, d2 = {"Lho3/g$a;", "Lgz/b$a;", "Lk34/g;", "selectedDocument", "Loq/r;", "Lk34/a0;", "scope", "Lco3/n;", "subDocument", "", "sessionUuid", "encodedCertificate", "Lco3/e;", "qrCodeData", "expirationDateTime", "Lwn3/c;", "verificationEntryPoint", "<init>", "(Lk34/g;Loq/r;Lco3/n;Ljava/lang/String;Ljava/lang/String;Lco3/e;Ljava/lang/String;Lwn3/c;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/g;", "f", "()Lk34/g;", "b", "Loq/r;", "d", "()Loq/r;", "c", "Lco3/n;", "i", "()Lco3/n;", "Ljava/lang/String;", "h", "e", "Lco3/e;", "()Lco3/e;", "g", "Lwn3/c;", "l", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g selectedDocument;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final r<a0, a0> scope;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final n subDocument;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionUuid;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encodedCertificate;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String expirationDateTime;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c verificationEntryPoint;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(k34.g gVar, r<? extends a0, ? extends a0> rVar, n nVar, String str, String str2, QrCodeData qrCodeData, String str3, wn3.c cVar) {
            this.selectedDocument = gVar;
            this.scope = rVar;
            this.subDocument = nVar;
            this.sessionUuid = str;
            this.encodedCertificate = str2;
            this.qrCodeData = qrCodeData;
            this.expirationDateTime = str3;
            this.verificationEntryPoint = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEncodedCertificate() {
            return this.encodedCertificate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getExpirationDateTime() {
            return this.expirationDateTime;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public final r<a0, a0> d() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.selectedDocument, params.selectedDocument) && t.c(this.scope, params.scope) && t.c(this.subDocument, params.subDocument) && t.c(this.sessionUuid, params.sessionUuid) && t.c(this.encodedCertificate, params.encodedCertificate) && t.c(this.qrCodeData, params.qrCodeData) && t.c(this.expirationDateTime, params.expirationDateTime) && t.c(this.verificationEntryPoint, params.verificationEntryPoint);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final k34.g getSelectedDocument() {
            return this.selectedDocument;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSessionUuid() {
            return this.sessionUuid;
        }

        public int hashCode() {
            int iHashCode = ((this.selectedDocument.hashCode() * 31) + this.scope.hashCode()) * 31;
            n nVar = this.subDocument;
            return ((((((((((iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31) + this.sessionUuid.hashCode()) * 31) + this.encodedCertificate.hashCode()) * 31) + this.qrCodeData.hashCode()) * 31) + this.expirationDateTime.hashCode()) * 31) + this.verificationEntryPoint.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final n getSubDocument() {
            return this.subDocument;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final wn3.c getVerificationEntryPoint() {
            return this.verificationEntryPoint;
        }

        public String toString() {
            return "Params(selectedDocument=" + this.selectedDocument + ", scope=" + this.scope + ", subDocument=" + this.subDocument + ", sessionUuid=" + this.sessionUuid + ", encodedCertificate=" + this.encodedCertificate + ", qrCodeData=" + this.qrCodeData + ", expirationDateTime=" + this.expirationDateTime + ", verificationEntryPoint=" + this.verificationEntryPoint + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86116d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86117e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f86118f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f86119g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f86121j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86119g = obj;
            this.f86121j |= PKIFailureInfo.systemUnavail;
            return g.this.e(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86122d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86123e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86124f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f86125g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f86126h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f86127j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f86128k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f86129l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f86130m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f86131n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f86132p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        /* synthetic */ Object f86133q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f86135s;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86133q = obj;
            this.f86135s |= PKIFailureInfo.systemUnavail;
            return g.this.f(null, this);
        }
    }

    public g(m mVar, s sVar, m0 m0Var, bo3.a aVar, l1 l1Var) {
        this.getFamilyDocumentUseCase = mVar;
        this.getOwnerDocumentUseCase = sVar;
        this.sendVerificationUseCase = m0Var;
        this.verificationContainersInteractor = aVar;
        this.isDocumentStoredByIdUC = l1Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:100:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:101:? A[LOOP:1: B:39:0x00d5->B:101:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:41:0x00db  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109  */
    /* JADX WARN: Code duplicated, block: B:51:0x0110  */
    /* JADX WARN: Code duplicated, block: B:52:0x0120  */
    /* JADX WARN: Code duplicated, block: B:54:0x0126  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0143, code lost:
    
        if (r12 == r1) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0188, code lost:
    
        if (r12 == r1) goto L71;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(k34.a0 r10, wn3.c r11, tq.e<? super dx.i<? extends dx.b, java.lang.String>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 517
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ho3.g.e(k34.a0, wn3.c, tq.e):java.lang.Object");
    }

    private final Object g(n nVar, r<? extends a0, ? extends a0> rVar, tq.e<? super i<? extends dx.b, EncodedDocumentWithAdditionalScope>> eVar) {
        return this.getFamilyDocumentUseCase.n(new m.Params(nVar, rVar), eVar);
    }

    private final Object h(r<? extends a0, ? extends a0> rVar, n nVar, tq.e<? super i<? extends dx.b, EncodedDocumentWithAdditionalScope>> eVar) {
        String value;
        if (nVar instanceof n.DynamicDocument) {
            value = ((n.DynamicDocument) nVar).getId();
        } else if (nVar instanceof n.DrivingLicenceDocument) {
            value = ((n.DrivingLicenceDocument) nVar).getSubtype().getValue();
        } else if (nVar instanceof n.d) {
            value = ((n.d) nVar).getId();
        } else {
            value = nVar instanceof n.RailwayDocument ? ((n.RailwayDocument) nVar).getCategory().getValue() : null;
        }
        return this.getOwnerDocumentUseCase.d(new s.Params(rVar, value), eVar);
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00ed A[PHI: r1
      0x00ed: PHI (r1v2 ho3.g$a) = (r1v0 ho3.g$a), (r1v3 ho3.g$a) binds: [B:24:0x00aa, B:35:0x00e7] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:44:0x0106 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0107  */
    /* JADX WARN: Code duplicated, block: B:47:0x010b  */
    /* JADX WARN: Code duplicated, block: B:50:0x014a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0156 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x0157  */
    /* JADX WARN: Code duplicated, block: B:56:0x015b  */
    /* JADX WARN: Code duplicated, block: B:58:0x017c  */
    /* JADX WARN: Code duplicated, block: B:62:0x018c  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:70:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c6, code lost:
    
        if (r2 == r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e1, code lost:
    
        if (r2 == r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00fb, code lost:
    
        if (r2 == r4) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x01dc, code lost:
    
        if (r2 == r4) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(ho3.g.Params r24, tq.e<? super dx.i<? extends dx.b, oq.i0>> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ho3.g.f(ho3.g$a, tq.e):java.lang.Object");
    }
}
