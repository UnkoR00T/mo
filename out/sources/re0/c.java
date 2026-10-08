package re0;

import dx.i;
import dx.j;
import eg0.l;
import fr.k;
import fr.t;
import iy.i0;
import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import k80.QrCodeData;
import k80.SecondDocument;
import k80.UserDataRequest;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lre0/c;", "", "Lre0/c$a;", "Loq/i0;", "Leg0/l;", "getUserCertUC", "Liy/i0;", "x509CertificateDecoder", "Liy/a;", "base64Coder", "Ll80/d;", "sendVerificationDataUC", "<init>", "(Leg0/l;Liy/i0;Liy/a;Ll80/d;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lre0/c$a;Ltq/e;)Ljava/lang/Object;", "a", "Leg0/l;", "b", "Liy/i0;", "c", "Liy/a;", "Ll80/d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l getUserCertUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i0 x509CertificateDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final l80.d sendVerificationDataUC;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f173388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f173389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f173390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f173391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f173392h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f173393j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f173394k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f173395l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f173396m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f173397n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f173398p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f173399q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f173400r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f173401s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        long f173402t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f173403v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f173405x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f173403v = obj;
            this.f173405x |= PKIFailureInfo.systemUnavail;
            return c.this.d(null, this);
        }
    }

    public c(l lVar, i0 i0Var, iy.a aVar, l80.d dVar) {
        this.getUserCertUC = lVar;
        this.x509CertificateDecoder = i0Var;
        this.base64Coder = aVar;
        this.sendVerificationDataUC = dVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3 */
    public Object d(Params params, tq.e<? super i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        b bVar;
        Object objB;
        int i15;
        int i16;
        ex.b bVar2;
        Object obj;
        ex.b bVar3;
        Params params2;
        X509Certificate x509Certificate;
        ex.b bVar4;
        int i17;
        int i18;
        long j15;
        j<dx.b> jVarA;
        String str;
        UserDataRequest userDataRequest;
        int i19;
        ex.b bVar5;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f173405x;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f173405x = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f173403v;
        Object objE = uq.b.e();
        ?? r15 = bVar.f173405x;
        try {
            try {
                if (r15 != 0) {
                    try {
                        if (r15 == 1) {
                            long j16 = bVar.f173402t;
                            int i26 = bVar.f173401s;
                            int i27 = bVar.f173400r;
                            i15 = bVar.f173399q;
                            i16 = bVar.f173398p;
                            int i28 = bVar.f173397n;
                            ex.b bVar6 = (ex.b) bVar.f173395l;
                            UserDataRequest userDataRequest2 = (UserDataRequest) bVar.f173394k;
                            X509Certificate x509Certificate2 = (X509Certificate) bVar.f173393j;
                            String str2 = (String) bVar.f173392h;
                            bVar2 = (ex.b) bVar.f173391g;
                            obj = objC;
                            ex.b bVar7 = (ex.b) bVar.f173390f;
                            j<dx.b> jVar = (j) bVar.f173389e;
                            Params params3 = (Params) bVar.f173388d;
                            try {
                                u.b(obj);
                                bVar3 = bVar7;
                                params2 = params3;
                                x509Certificate = x509Certificate2;
                                bVar4 = bVar6;
                                i17 = i26;
                                i18 = i27;
                                j15 = j16;
                                jVarA = jVar;
                                str = str2;
                                userDataRequest = userDataRequest2;
                                i19 = i28;
                            } catch (ex.c e15) {
                                e = e15;
                                return new i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                i iVarA = r15.a(e);
                                if (iVarA instanceof i.Left) {
                                    objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof i.Right)) {
                                        throw new p();
                                    }
                                    objB = ((i.Right) iVarA).b();
                                }
                                return new i.Left(objB);
                            }
                        } else {
                            if (r15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar5 = (ex.b) bVar.f173395l;
                            u.b(objC);
                        }
                        bVar5.a((i) objC);
                        return new i.Right(oq.i0.f148189a);
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                }
                u.b(objC);
                jVarA = xw.c.f221622a.a();
                ex.a aVar = new ex.a();
                String str3 = params.getQrCodeData().getServiceType() + k80.e.a(params.getQrCodeData().getQrType());
                x509Certificate = (X509Certificate) aVar.a(this.x509CertificateDecoder.decode((byte[]) aVar.a(iy.a.c(this.base64Coder, params.getEncodedCertificate(), null, 2, null))));
                long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis());
                UserDataRequest userDataRequest3 = new UserDataRequest(str3, params.getMainScope(), params.getScopeType(), params.getMainDocument(), seconds, Long.parseLong(params.getExpireDateTime()), params.getSecondDocument(), params.getSchemaId());
                l lVar = this.getUserCertUC;
                gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
                bVar.f173388d = params;
                bVar.f173389e = jVarA;
                bVar.f173390f = vq.j.a(aVar);
                bVar.f173391g = aVar;
                bVar.f173392h = vq.j.a(str3);
                bVar.f173393j = x509Certificate;
                bVar.f173394k = userDataRequest3;
                bVar.f173395l = aVar;
                i17 = 0;
                bVar.f173397n = 0;
                bVar.f173398p = 0;
                bVar.f173399q = 0;
                bVar.f173400r = 0;
                bVar.f173401s = 0;
                bVar.f173402t = seconds;
                bVar.f173405x = 1;
                Object objC2 = lVar.c(c1792a, bVar);
                if (objC2 == objE) {
                    return objE;
                }
                obj = objC2;
                j15 = seconds;
                params2 = params;
                i18 = 0;
                i15 = 0;
                i16 = 0;
                bVar2 = aVar;
                bVar3 = bVar2;
                userDataRequest = userDataRequest3;
                str = str3;
                i19 = 0;
                bVar4 = bVar3;
                CertKeyPair certKeyPair = (CertKeyPair) bVar4.a((i) obj);
                l80.d dVar = this.sendVerificationDataUC;
                l80.d.Params params4 = new l80.d.Params(params2.getSessionId(), userDataRequest, x509Certificate, certKeyPair);
                bVar.f173388d = vq.j.a(params2);
                bVar.f173389e = jVarA;
                bVar.f173390f = vq.j.a(bVar3);
                bVar.f173391g = vq.j.a(bVar2);
                bVar.f173392h = vq.j.a(str);
                bVar.f173393j = vq.j.a(x509Certificate);
                bVar.f173394k = vq.j.a(userDataRequest);
                bVar.f173395l = bVar2;
                bVar.f173396m = vq.j.a(certKeyPair);
                bVar.f173397n = i19;
                bVar.f173398p = i16;
                bVar.f173399q = i15;
                bVar.f173400r = i18;
                bVar.f173401s = i17;
                bVar.f173402t = j15;
                bVar.f173405x = 2;
                objC = dVar.c(params4, bVar);
                if (objC == objE) {
                    return objE;
                }
                bVar5 = bVar2;
                bVar5.a((i) objC);
                return new i.Right(oq.i0.f148189a);
            } catch (Exception e19) {
                e = e19;
            }
        } catch (ex.c e25) {
            e = e25;
        } catch (CancellationException e26) {
            throw e26;
        }
    }

    /* JADX INFO: renamed from: re0.c$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0014R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b$\u0010\u0014R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b!\u0010\u0012R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b\u001d\u0010\u0012R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b*\u0010\u001b\u001a\u0004\b*\u0010\u0012R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010\u001b\u001a\u0004\b\u001a\u0010\u0012¨\u0006,"}, d2 = {"Lre0/c$a;", "Lgz/b$a;", "", "sessionId", "Lk80/d;", "qrCodeData", "", "mainScope", "scopeType", "mainDocument", "expireDateTime", "Lk80/g;", "secondDocument", "schemaId", "encodedCertificate", "<init>", "(Ljava/lang/String;Lk80/d;IILjava/lang/String;Ljava/lang/String;Lk80/g;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "m", "b", "Lk80/d;", "f", "()Lk80/d;", "c", "I", "d", "i", "e", "g", "Lk80/g;", "l", "()Lk80/g;", "h", "j", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int mainScope;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int scopeType;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mainDocument;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final String expireDateTime;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final SecondDocument secondDocument;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String schemaId;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encodedCertificate;

        public Params(String str, QrCodeData qrCodeData, int i15, int i16, String str2, String str3, SecondDocument secondDocument, String str4, String str5) {
            this.sessionId = str;
            this.qrCodeData = qrCodeData;
            this.mainScope = i15;
            this.scopeType = i16;
            this.mainDocument = str2;
            this.expireDateTime = str3;
            this.secondDocument = secondDocument;
            this.schemaId = str4;
            this.encodedCertificate = str5;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getEncodedCertificate() {
            return this.encodedCertificate;
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
        public final int getMainScope() {
            return this.mainScope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.sessionId, params.sessionId) && t.c(this.qrCodeData, params.qrCodeData) && this.mainScope == params.mainScope && this.scopeType == params.scopeType && t.c(this.mainDocument, params.mainDocument) && t.c(this.expireDateTime, params.expireDateTime) && t.c(this.secondDocument, params.secondDocument) && t.c(this.schemaId, params.schemaId) && t.c(this.encodedCertificate, params.encodedCertificate);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getSchemaId() {
            return this.schemaId;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.sessionId.hashCode() * 31) + this.qrCodeData.hashCode()) * 31) + Integer.hashCode(this.mainScope)) * 31) + Integer.hashCode(this.scopeType)) * 31) + this.mainDocument.hashCode()) * 31) + this.expireDateTime.hashCode()) * 31;
            SecondDocument secondDocument = this.secondDocument;
            int iHashCode2 = (iHashCode + (secondDocument == null ? 0 : secondDocument.hashCode())) * 31;
            String str = this.schemaId;
            return ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.encodedCertificate.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final int getScopeType() {
            return this.scopeType;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final SecondDocument getSecondDocument() {
            return this.secondDocument;
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public final String getSessionId() {
            return this.sessionId;
        }

        public String toString() {
            return "Params(sessionId=" + this.sessionId + ", qrCodeData=" + this.qrCodeData + ", mainScope=" + this.mainScope + ", scopeType=" + this.scopeType + ", mainDocument=" + this.mainDocument + ", expireDateTime=" + this.expireDateTime + ", secondDocument=" + this.secondDocument + ", schemaId=" + this.schemaId + ", encodedCertificate=" + this.encodedCertificate + ')';
        }

        public /* synthetic */ Params(String str, QrCodeData qrCodeData, int i15, int i16, String str2, String str3, SecondDocument secondDocument, String str4, String str5, int i17, k kVar) {
            this(str, qrCodeData, i15, (i17 & 8) != 0 ? 0 : i16, str2, str3, secondDocument, str4, str5);
        }
    }
}
