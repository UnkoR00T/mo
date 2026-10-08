package re0;

import dx.i;
import dx.j;
import fr.t;
import java.util.concurrent.CancellationException;
import k80.Certificate;
import k80.QrCodeData;
import k80.SecondDocument;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vf0.DocumentScope;
import ye0.SecondDocumentInfo;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0011B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00030\r2\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lre0/g;", "", "Lre0/g$a;", "Loq/i0;", "Leg0/e;", "getDocumentScopeUC", "Lre0/c;", "sendUserVerificationDataUC", "Liy/a;", "base64Coder", "<init>", "(Leg0/e;Lre0/c;Liy/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lre0/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Leg0/e;", "b", "Lre0/c;", "c", "Liy/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final eg0.e getDocumentScopeUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final re0.c sendUserVerificationDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: re0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001b\u001a\u0004\b\u001d\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u001a\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b'\u0010\u0011¨\u0006,"}, d2 = {"Lre0/g$a;", "Lgz/b$a;", "", "documentId", "scopeName", "Lvf0/d;", "documentType", "Lk80/d;", "qrCodeData", "Lk80/a;", "certificate", "Lye0/a;", "secondDocumentInfo", "schemaId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lvf0/d;Lk80/d;Lk80/a;Lye0/a;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "h", "c", "Lvf0/d;", "()Lvf0/d;", "d", "Lk80/d;", "()Lk80/d;", "e", "Lk80/a;", "()Lk80/a;", "f", "Lye0/a;", "i", "()Lye0/a;", "g", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String scopeName;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final vf0.d documentType;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final Certificate certificate;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final SecondDocumentInfo secondDocumentInfo;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final String schemaId;

        public Params(String str, String str2, vf0.d dVar, QrCodeData qrCodeData, Certificate certificate, SecondDocumentInfo secondDocumentInfo, String str3) {
            this.documentId = str;
            this.scopeName = str2;
            this.documentType = dVar;
            this.qrCodeData = qrCodeData;
            this.certificate = certificate;
            this.secondDocumentInfo = secondDocumentInfo;
            this.schemaId = str3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Certificate getCertificate() {
            return this.certificate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final vf0.d getDocumentType() {
            return this.documentType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.documentId, params.documentId) && t.c(this.scopeName, params.scopeName) && this.documentType == params.documentType && t.c(this.qrCodeData, params.qrCodeData) && t.c(this.certificate, params.certificate) && t.c(this.secondDocumentInfo, params.secondDocumentInfo) && t.c(this.schemaId, params.schemaId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getSchemaId() {
            return this.schemaId;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getScopeName() {
            return this.scopeName;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.documentId.hashCode() * 31) + this.scopeName.hashCode()) * 31) + this.documentType.hashCode()) * 31) + this.qrCodeData.hashCode()) * 31) + this.certificate.hashCode()) * 31;
            SecondDocumentInfo secondDocumentInfo = this.secondDocumentInfo;
            int iHashCode2 = (iHashCode + (secondDocumentInfo == null ? 0 : secondDocumentInfo.hashCode())) * 31;
            String str = this.schemaId;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final SecondDocumentInfo getSecondDocumentInfo() {
            return this.secondDocumentInfo;
        }

        public String toString() {
            return "Params(documentId=" + this.documentId + ", scopeName=" + this.scopeName + ", documentType=" + this.documentType + ", qrCodeData=" + this.qrCodeData + ", certificate=" + this.certificate + ", secondDocumentInfo=" + this.secondDocumentInfo + ", schemaId=" + this.schemaId + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f173429a;

        static {
            int[] iArr = new int[vf0.d.values().length];
            try {
                iArr[vf0.d.SCHOOL_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vf0.d.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vf0.d.FAMILY_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[vf0.d.DISABLED_PERSON_IDENTIFICATION_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[vf0.d.UUT_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f173429a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f173430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f173432f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f173433g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f173434h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f173435j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f173436k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f173437l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f173438m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f173439n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f173440p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f173441q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f173442r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f173443s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f173445v;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173443s = obj;
            this.f173445v |= PKIFailureInfo.systemUnavail;
            return g.this.d(null, this);
        }
    }

    public g(eg0.e eVar, re0.c cVar, iy.a aVar) {
        this.getDocumentScopeUC = eVar;
        this.sendUserVerificationDataUC = cVar;
        this.base64Coder = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:57:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:59:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:61:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:63:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:67:0x01bd A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #9 {Exception -> 0x0051, blocks: (B:14:0x004c, B:81:0x0254, B:83:0x0261, B:86:0x026f, B:53:0x0179, B:55:0x018c, B:73:0x01d1, B:75:0x01eb, B:77:0x0204, B:67:0x01bd, B:68:0x01c2, B:47:0x0120, B:49:0x012e, B:43:0x00e0), top: B:102:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:71:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x01eb A[Catch: Exception -> 0x0051, c -> 0x0054, CancellationException -> 0x0057, TryCatch #9 {Exception -> 0x0051, blocks: (B:14:0x004c, B:81:0x0254, B:83:0x0261, B:86:0x026f, B:53:0x0179, B:55:0x018c, B:73:0x01d1, B:75:0x01eb, B:77:0x0204, B:67:0x01bd, B:68:0x01c2, B:47:0x0120, B:49:0x012e, B:43:0x00e0), top: B:102:0x0028 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0201  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:80:0x0253  */
    /* JADX WARN: Code duplicated, block: B:89:0x0278  */
    /* JADX WARN: Code duplicated, block: B:92:0x0289  */
    /* JADX WARN: Code duplicated, block: B:93:0x0297  */
    /* JADX WARN: Code duplicated, block: B:95:0x029b  */
    /* JADX WARN: Code duplicated, block: B:98:0x02a8  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v8 */
    public Object d(Params params, tq.e<? super i<? extends dx.b, i0>> eVar) throws Throwable {
        c cVar;
        String message;
        i iVarA;
        Object objB;
        ex.b aVar;
        Params params2;
        int i15;
        j<dx.b> jVarA;
        ex.b bVar;
        int i16;
        ex.b bVar2;
        int i17;
        int i18;
        int i19;
        int i25;
        int i26;
        int i27;
        ex.b bVar3;
        DocumentScope documentScope;
        ex.b bVar4;
        Params params3;
        ex.b bVar5;
        Params params4;
        DocumentScope documentScope2;
        int i28;
        DocumentScope documentScope3;
        int i29;
        SecondDocument secondDocument;
        int i35;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i36 = cVar.f173445v;
            if ((i36 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f173445v = i36 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f173443s;
        Object objE = uq.b.e();
        ?? r15 = cVar.f173445v;
        try {
            try {
                if (r15 == 0) {
                    u.b(objD);
                    jVarA = xw.c.f221622a.a();
                    aVar = new ex.a();
                    eg0.e eVar2 = this.getDocumentScopeUC;
                    eg0.e.Params params5 = new eg0.e.Params(params.getDocumentId(), params.getScopeName());
                    cVar.f173430d = params;
                    cVar.f173431e = jVarA;
                    cVar.f173432f = vq.j.a(aVar);
                    cVar.f173433g = aVar;
                    cVar.f173434h = aVar;
                    cVar.f173437l = 0;
                    cVar.f173438m = 0;
                    cVar.f173439n = 0;
                    cVar.f173440p = 0;
                    cVar.f173441q = 0;
                    cVar.f173445v = 1;
                    objD = eVar2.c(params5, cVar);
                    if (objD != objE) {
                        params2 = params;
                        i15 = 0;
                        i19 = 0;
                        i18 = 0;
                        i16 = 0;
                        i17 = 0;
                        bVar2 = aVar;
                        bVar = bVar2;
                    }
                    return objE;
                }
                try {
                    if (r15 != 1) {
                        if (r15 == 2) {
                            int i37 = cVar.f173441q;
                            i25 = cVar.f173440p;
                            i18 = cVar.f173439n;
                            i26 = cVar.f173438m;
                            i27 = cVar.f173437l;
                            bVar3 = (ex.b) cVar.f173436k;
                            documentScope = (DocumentScope) cVar.f173434h;
                            bVar4 = (ex.b) cVar.f173433g;
                            bVar2 = (ex.b) cVar.f173432f;
                            j<dx.b> jVar = (j) cVar.f173431e;
                            params3 = (Params) cVar.f173430d;
                            try {
                                u.b(objD);
                                i15 = i37;
                                jVarA = jVar;
                                documentScope2 = (DocumentScope) bVar3.a((i) objD);
                                params4 = params3;
                                i19 = i25;
                                i17 = i27;
                                i16 = i26;
                                re0.c cVar2 = this.sendUserVerificationDataUC;
                                String securityToken = params4.getQrCodeData().getSecurityToken();
                                QrCodeData qrCodeData = params4.getQrCodeData();
                                i28 = b.f173429a[params4.getDocumentType().ordinal()];
                                documentScope3 = documentScope2;
                                if (i28 != 1) {
                                    if (i28 == 2) {
                                        i35 = 1000000;
                                    } else if (i28 == 3) {
                                        i35 = 1001000;
                                    } else if (i28 == 4) {
                                        i35 = 1002000;
                                    } else {
                                        if (i28 != 5) {
                                            throw new p();
                                        }
                                        i35 = 5000000;
                                    }
                                    i29 = i35;
                                } else {
                                    i29 = 1002;
                                }
                                Params params6 = params4;
                                ex.b bVar6 = bVar2;
                                String strE = iy.a.e(this.base64Coder, documentScope.getScopeData(), null, 2, null);
                                String validTime = params6.getQrCodeData().getValidTime();
                                if (documentScope3 != null) {
                                    secondDocument = new SecondDocument(iy.a.e(this.base64Coder, documentScope3.getScopeData(), null, 2, null), 1002);
                                } else {
                                    secondDocument = null;
                                }
                                re0.c.Params params7 = new re0.c.Params(securityToken, qrCodeData, i29, 0, strE, validTime, secondDocument, params6.getSchemaId(), params6.getCertificate().getEncoded(), 8, null);
                                cVar.f173430d = vq.j.a(params6);
                                cVar.f173431e = jVarA;
                                cVar.f173432f = vq.j.a(bVar6);
                                cVar.f173433g = vq.j.a(bVar4);
                                cVar.f173434h = bVar4;
                                cVar.f173435j = vq.j.a(documentScope);
                                cVar.f173436k = vq.j.a(documentScope3);
                                cVar.f173437l = i17;
                                cVar.f173438m = i16;
                                cVar.f173439n = i18;
                                cVar.f173440p = i19;
                                cVar.f173441q = i15;
                                cVar.f173445v = 3;
                                objD = cVar2.d(params7, cVar);
                                if (objD != objE) {
                                    bVar5 = bVar4;
                                }
                                return objE;
                            } catch (ex.c e15) {
                                e = e15;
                                return new i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                px.f fVar = px.f.f163100a;
                                message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                iVarA = r15.a(e);
                                if (iVarA instanceof i.Left) {
                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (iVarA instanceof i.Right) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                return new i.Left(objB);
                            }
                        }
                        if (r15 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        bVar5 = (ex.b) cVar.f173434h;
                        u.b(objD);
                        bVar5.a((i) objD);
                        return new i.Right(i0.f148189a);
                    }
                    int i38 = cVar.f173441q;
                    int i39 = cVar.f173440p;
                    int i45 = cVar.f173439n;
                    int i46 = cVar.f173438m;
                    int i47 = cVar.f173437l;
                    aVar = (ex.b) cVar.f173434h;
                    ex.b bVar7 = (ex.b) cVar.f173433g;
                    ex.b bVar8 = (ex.b) cVar.f173432f;
                    j<dx.b> jVar2 = (j) cVar.f173431e;
                    params2 = (Params) cVar.f173430d;
                    try {
                        u.b(objD);
                        i15 = i38;
                        jVarA = jVar2;
                        bVar = bVar7;
                        i16 = i46;
                        bVar2 = bVar8;
                        i17 = i47;
                        i18 = i45;
                        i19 = i39;
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    } catch (Exception e25) {
                        e = e25;
                        r15 = jVar2;
                        px.f fVar2 = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar2.d(message, e, px.c.a(r15));
                        iVarA = r15.a(e);
                        if (iVarA instanceof i.Left) {
                            objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                        } else {
                            if (iVarA instanceof i.Right) {
                                throw new p();
                            }
                            objB = ((i.Right) iVarA).b();
                        }
                        return new i.Left(objB);
                    }
                } catch (CancellationException e26) {
                    throw e26;
                }
                DocumentScope documentScope4 = (DocumentScope) aVar.a((i) objD);
                SecondDocumentInfo secondDocumentInfo = params2.getSecondDocumentInfo();
                if (secondDocumentInfo != null) {
                    eg0.e eVar3 = this.getDocumentScopeUC;
                    ex.b bVar9 = bVar2;
                    eg0.e.Params params8 = new eg0.e.Params(secondDocumentInfo.getDocumentId(), secondDocumentInfo.getScopeName());
                    cVar.f173430d = params2;
                    cVar.f173431e = jVarA;
                    cVar.f173432f = vq.j.a(bVar9);
                    cVar.f173433g = bVar;
                    cVar.f173434h = documentScope4;
                    cVar.f173435j = vq.j.a(secondDocumentInfo);
                    cVar.f173436k = bVar;
                    cVar.f173437l = i17;
                    cVar.f173438m = i16;
                    cVar.f173439n = i18;
                    cVar.f173440p = i19;
                    cVar.f173441q = i15;
                    cVar.f173442r = 0;
                    cVar.f173445v = 2;
                    Object objC = eVar3.c(params8, cVar);
                    if (objC != objE) {
                        bVar2 = bVar9;
                        i25 = i19;
                        i26 = i16;
                        i27 = i17;
                        bVar3 = bVar;
                        params3 = params2;
                        documentScope = documentScope4;
                        objD = objC;
                        bVar4 = bVar3;
                        documentScope2 = (DocumentScope) bVar3.a((i) objD);
                        params4 = params3;
                        i19 = i25;
                        i17 = i27;
                        i16 = i26;
                        re0.c cVar3 = this.sendUserVerificationDataUC;
                        String securityToken2 = params4.getQrCodeData().getSecurityToken();
                        QrCodeData qrCodeData2 = params4.getQrCodeData();
                        i28 = b.f173429a[params4.getDocumentType().ordinal()];
                        documentScope3 = documentScope2;
                        if (i28 != 1) {
                            if (i28 == 2) {
                                i35 = 1000000;
                            } else if (i28 == 3) {
                                i35 = 1001000;
                            } else if (i28 == 4) {
                                i35 = 1002000;
                            } else {
                                if (i28 != 5) {
                                    throw new p();
                                }
                                i35 = 5000000;
                            }
                            i29 = i35;
                        } else {
                            i29 = 1002;
                        }
                        Params params9 = params4;
                        ex.b bVar10 = bVar2;
                        String strE2 = iy.a.e(this.base64Coder, documentScope.getScopeData(), null, 2, null);
                        String validTime2 = params9.getQrCodeData().getValidTime();
                        if (documentScope3 != null) {
                            secondDocument = new SecondDocument(iy.a.e(this.base64Coder, documentScope3.getScopeData(), null, 2, null), 1002);
                        } else {
                            secondDocument = null;
                        }
                        re0.c.Params params10 = new re0.c.Params(securityToken2, qrCodeData2, i29, 0, strE2, validTime2, secondDocument, params9.getSchemaId(), params9.getCertificate().getEncoded(), 8, null);
                        cVar.f173430d = vq.j.a(params9);
                        cVar.f173431e = jVarA;
                        cVar.f173432f = vq.j.a(bVar10);
                        cVar.f173433g = vq.j.a(bVar4);
                        cVar.f173434h = bVar4;
                        cVar.f173435j = vq.j.a(documentScope);
                        cVar.f173436k = vq.j.a(documentScope3);
                        cVar.f173437l = i17;
                        cVar.f173438m = i16;
                        cVar.f173439n = i18;
                        cVar.f173440p = i19;
                        cVar.f173441q = i15;
                        cVar.f173445v = 3;
                        objD = cVar3.d(params10, cVar);
                        if (objD != objE) {
                            bVar5 = bVar4;
                            bVar5.a((i) objD);
                            return new i.Right(i0.f148189a);
                        }
                    }
                } else {
                    params4 = params2;
                    bVar4 = bVar;
                    documentScope = documentScope4;
                    documentScope2 = null;
                    re0.c cVar4 = this.sendUserVerificationDataUC;
                    String securityToken3 = params4.getQrCodeData().getSecurityToken();
                    QrCodeData qrCodeData3 = params4.getQrCodeData();
                    i28 = b.f173429a[params4.getDocumentType().ordinal()];
                    documentScope3 = documentScope2;
                    if (i28 != 1) {
                        if (i28 == 2) {
                            i35 = 1000000;
                        } else if (i28 == 3) {
                            i35 = 1001000;
                        } else if (i28 == 4) {
                            i35 = 1002000;
                        } else {
                            if (i28 != 5) {
                                throw new p();
                            }
                            i35 = 5000000;
                        }
                        i29 = i35;
                    } else {
                        i29 = 1002;
                    }
                    Params params11 = params4;
                    ex.b bVar11 = bVar2;
                    String strE3 = iy.a.e(this.base64Coder, documentScope.getScopeData(), null, 2, null);
                    String validTime3 = params11.getQrCodeData().getValidTime();
                    if (documentScope3 != null) {
                        secondDocument = new SecondDocument(iy.a.e(this.base64Coder, documentScope3.getScopeData(), null, 2, null), 1002);
                    } else {
                        secondDocument = null;
                    }
                    re0.c.Params params12 = new re0.c.Params(securityToken3, qrCodeData3, i29, 0, strE3, validTime3, secondDocument, params11.getSchemaId(), params11.getCertificate().getEncoded(), 8, null);
                    cVar.f173430d = vq.j.a(params11);
                    cVar.f173431e = jVarA;
                    cVar.f173432f = vq.j.a(bVar11);
                    cVar.f173433g = vq.j.a(bVar4);
                    cVar.f173434h = bVar4;
                    cVar.f173435j = vq.j.a(documentScope);
                    cVar.f173436k = vq.j.a(documentScope3);
                    cVar.f173437l = i17;
                    cVar.f173438m = i16;
                    cVar.f173439n = i18;
                    cVar.f173440p = i19;
                    cVar.f173441q = i15;
                    cVar.f173445v = 3;
                    objD = cVar4.d(params12, cVar);
                    if (objD != objE) {
                        bVar5 = bVar4;
                        bVar5.a((i) objD);
                        return new i.Right(i0.f148189a);
                    }
                }
                return objE;
            } catch (Exception e27) {
                e = e27;
            }
        } catch (ex.c e28) {
            e = e28;
        } catch (CancellationException e29) {
            throw e29;
        }
    }
}
