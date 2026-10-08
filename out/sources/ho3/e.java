package ho3;

import co3.QrCodeData;
import co3.SecondDocument;
import dx.i;
import fr.t;
import iy.c0;
import iy.i0;
import iy.j;
import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import k34.u;
import oq.p;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0017B9\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J$\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00030\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lho3/e;", "", "Lho3/e$a;", "Loq/i0;", "Len0/e;", "sendDataUC", "Liy/i0;", "x509CertificateDecoder", "Liy/a;", "base64Coder", "Liy/j;", "cmsManager", "Lfo3/b;", "repository", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Len0/e;Liy/i0;Liy/a;Liy/j;Lfo3/b;Lbo3/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lho3/e$a;Ltq/e;)Ljava/lang/Object;", "a", "Len0/e;", "b", "Liy/i0;", "c", "Liy/a;", "Liy/j;", "e", "Lfo3/b;", "f", "Lbo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final en0.e sendDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i0 x509CertificateDecoder;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j cmsManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final fo3.b repository;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: ho3.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001b\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b%\u0010+\u001a\u0004\b\u001f\u0010,R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b-\u0010\u001c\u001a\u0004\b.\u0010\u0013¨\u0006/"}, d2 = {"Lho3/e$a;", "Lgz/b$a;", "", "sessionId", "encodedCert", "mainDocument", "", "mainScope", "expireDateTime", "Lco3/e;", "qrCodeData", "Lco3/j;", "secondDocument", "Lk34/u;", "identityType", "schemaId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Lco3/e;Lco3/j;Lk34/u;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "m", "b", "c", "d", "I", "f", "e", "Lco3/e;", "h", "()Lco3/e;", "g", "Lco3/j;", "l", "()Lco3/j;", "Lk34/u;", "()Lk34/u;", "j", "i", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String sessionId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encodedCert;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mainDocument;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final int mainScope;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String expireDateTime;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final SecondDocument secondDocument;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final u identityType;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String schemaId;

        public Params(String str, String str2, String str3, int i15, String str4, QrCodeData qrCodeData, SecondDocument secondDocument, u uVar, String str5) {
            this.sessionId = str;
            this.encodedCert = str2;
            this.mainDocument = str3;
            this.mainScope = i15;
            this.expireDateTime = str4;
            this.qrCodeData = qrCodeData;
            this.secondDocument = secondDocument;
            this.identityType = uVar;
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
        public final u getIdentityType() {
            return this.identityType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMainDocument() {
            return this.mainDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.sessionId, params.sessionId) && t.c(this.encodedCert, params.encodedCert) && t.c(this.mainDocument, params.mainDocument) && this.mainScope == params.mainScope && t.c(this.expireDateTime, params.expireDateTime) && t.c(this.qrCodeData, params.qrCodeData) && t.c(this.secondDocument, params.secondDocument) && this.identityType == params.identityType && t.c(this.schemaId, params.schemaId);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getMainScope() {
            return this.mainScope;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.sessionId.hashCode() * 31) + this.encodedCert.hashCode()) * 31) + this.mainDocument.hashCode()) * 31) + Integer.hashCode(this.mainScope)) * 31) + this.expireDateTime.hashCode()) * 31) + this.qrCodeData.hashCode()) * 31;
            SecondDocument secondDocument = this.secondDocument;
            int iHashCode2 = (((iHashCode + (secondDocument == null ? 0 : secondDocument.hashCode())) * 31) + this.identityType.hashCode()) * 31;
            String str = this.schemaId;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getSchemaId() {
            return this.schemaId;
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
            return "Params(sessionId=" + this.sessionId + ", encodedCert=" + this.encodedCert + ", mainDocument=" + this.mainDocument + ", mainScope=" + this.mainScope + ", expireDateTime=" + this.expireDateTime + ", qrCodeData=" + this.qrCodeData + ", secondDocument=" + this.secondDocument + ", identityType=" + this.identityType + ", schemaId=" + this.schemaId + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86067d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86068e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86069f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f86070g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f86071h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f86072j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f86073k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f86074l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f86075m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f86076n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f86077p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f86078q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f86079r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f86080s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f86081t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        /* synthetic */ Object f86082v;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        int f86084x;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86082v = obj;
            this.f86084x |= PKIFailureInfo.systemUnavail;
            return e.this.d(null, this);
        }
    }

    public e(en0.e eVar, i0 i0Var, iy.a aVar, j jVar, fo3.b bVar, bo3.a aVar2) {
        this.sendDataUC = eVar;
        this.x509CertificateDecoder = i0Var;
        this.base64Coder = aVar;
        this.cmsManager = jVar;
        this.repository = bVar;
        this.verificationContainersInteractor = aVar2;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0147 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:40:0x0148 A[Catch: Exception -> 0x0091, c -> 0x0095, CancellationException -> 0x0099, TryCatch #6 {c -> 0x0095, CancellationException -> 0x0099, Exception -> 0x0091, blocks: (B:24:0x008c, B:37:0x0102, B:40:0x0148, B:42:0x014c, B:48:0x01c3, B:49:0x01c8), top: B:79:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:42:0x014c A[Catch: Exception -> 0x0091, c -> 0x0095, CancellationException -> 0x0099, TRY_LEAVE, TryCatch #6 {c -> 0x0095, CancellationException -> 0x0099, Exception -> 0x0091, blocks: (B:24:0x008c, B:37:0x0102, B:40:0x0148, B:42:0x014c, B:48:0x01c3, B:49:0x01c8), top: B:79:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:45:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c3 A[Catch: Exception -> 0x0091, c -> 0x0095, CancellationException -> 0x0099, TRY_ENTER, TryCatch #6 {c -> 0x0095, CancellationException -> 0x0099, Exception -> 0x0091, blocks: (B:24:0x008c, B:37:0x0102, B:40:0x0148, B:42:0x014c, B:48:0x01c3, B:49:0x01c8), top: B:79:0x008c }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:65:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:66:0x0208  */
    /* JADX WARN: Code duplicated, block: B:68:0x020c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0219  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public Object d(Params params, tq.e<? super i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        b bVar;
        String message;
        i iVarA;
        Object objB;
        ex.b aVar;
        X509Certificate x509Certificate;
        int i15;
        dx.j<dx.b> jVar;
        Params params2;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar2;
        ex.b bVar3;
        CertKeyPair certKeyPair;
        String strB;
        ex.b bVar4;
        ex.b bVar5;
        i<dx.b, byte[]> iVarC;
        en0.e eVar2;
        en0.e.Params params3;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i25 = bVar.f86084x;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f86084x = i25 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objB2 = bVar.f86082v;
        ?? E = uq.b.e();
        int i26 = bVar.f86084x;
        try {
            try {
                if (i26 == 0) {
                    oq.u.b(objB2);
                    dx.j<dx.b> jVarA = xw.c.f221622a.a();
                    try {
                        aVar = new ex.a();
                        x509Certificate = (X509Certificate) aVar.a(this.x509CertificateDecoder.decode((byte[]) aVar.a(iy.a.c(this.base64Coder, params.getEncodedCert(), null, 2, null))));
                        bo3.a aVar2 = this.verificationContainersInteractor;
                        u identityType = params.getIdentityType();
                        bVar.f86067d = params;
                        bVar.f86068e = jVarA;
                        bVar.f86069f = vq.j.a(aVar);
                        bVar.f86070g = vq.j.a(aVar);
                        bVar.f86071h = x509Certificate;
                        bVar.f86072j = aVar;
                        i15 = 0;
                        bVar.f86077p = 0;
                        bVar.f86078q = 0;
                        bVar.f86079r = 0;
                        bVar.f86080s = 0;
                        bVar.f86081t = 0;
                        bVar.f86084x = 1;
                        objB2 = aVar2.b(identityType, bVar);
                        if (objB2 != E) {
                            jVar = jVarA;
                            params2 = params;
                            i16 = 0;
                            i17 = 0;
                            i18 = 0;
                            i19 = 0;
                            bVar2 = aVar;
                            bVar3 = bVar2;
                            certKeyPair = (CertKeyPair) aVar.a((i) objB2);
                            strB = this.repository.b(params2.getQrCodeData(), params2.getMainDocument(), params2.getMainScope(), params2.getExpireDateTime(), params2.getSecondDocument(), params2.getSchemaId());
                            bVar4 = bVar2;
                            bVar5 = bVar3;
                            iVarC = this.cmsManager.c(strB, new CertKeyPair(certKeyPair.getCertificate(), certKeyPair.getPrivateKey()));
                            if (iVarC instanceof i.Left) {
                                return iVarC;
                            }
                            if (iVarC instanceof i.Right) {
                                throw new p();
                            }
                            byte[] bArr = (byte[]) ((i.Right) iVarC).b();
                            String strD = this.cmsManager.d(bArr, x509Certificate);
                            eVar2 = this.sendDataUC;
                            params3 = new en0.e.Params(params2.getSessionId(), c0.g(strD));
                            bVar.f86067d = vq.j.a(params2);
                            bVar.f86068e = jVar;
                            bVar.f86069f = vq.j.a(bVar5);
                            bVar.f86070g = vq.j.a(bVar4);
                            bVar.f86071h = vq.j.a(x509Certificate);
                            bVar.f86072j = vq.j.a(certKeyPair);
                            bVar.f86073k = vq.j.a(strB);
                            bVar.f86074l = vq.j.a(iVarC);
                            bVar.f86075m = vq.j.a(strD);
                            bVar.f86076n = vq.j.a(bArr);
                            bVar.f86077p = i15;
                            bVar.f86078q = i19;
                            bVar.f86079r = i18;
                            bVar.f86080s = i17;
                            bVar.f86081t = i16;
                            bVar.f86084x = 2;
                            if (eVar2.c(params3, bVar) != E) {
                                return new i.Right(oq.i0.f148189a);
                            }
                        }
                        return E;
                    } catch (ex.c e15) {
                        e = e15;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e16) {
                        throw e16;
                    } catch (Exception e17) {
                        e = e17;
                        E = jVarA;
                        px.f fVar = px.f.f163100a;
                        message = e.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        fVar.d(message, e, px.c.a(E));
                        iVarA = E.a(e);
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
                if (i26 != 1) {
                    if (i26 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    try {
                        oq.u.b(objB2);
                        return new i.Right(oq.i0.f148189a);
                    } catch (ex.c e18) {
                        e = e18;
                        return new i.Left((dx.b) ex.d.a(e));
                    } catch (CancellationException e19) {
                        throw e19;
                    }
                }
                i16 = bVar.f86081t;
                i17 = bVar.f86080s;
                i18 = bVar.f86079r;
                i19 = bVar.f86078q;
                i15 = bVar.f86077p;
                aVar = (ex.b) bVar.f86072j;
                x509Certificate = (X509Certificate) bVar.f86071h;
                bVar2 = (ex.b) bVar.f86070g;
                bVar3 = (ex.b) bVar.f86069f;
                jVar = (dx.j) bVar.f86068e;
                params2 = (Params) bVar.f86067d;
                try {
                    oq.u.b(objB2);
                    certKeyPair = (CertKeyPair) aVar.a((i) objB2);
                    strB = this.repository.b(params2.getQrCodeData(), params2.getMainDocument(), params2.getMainScope(), params2.getExpireDateTime(), params2.getSecondDocument(), params2.getSchemaId());
                    bVar4 = bVar2;
                    bVar5 = bVar3;
                    iVarC = this.cmsManager.c(strB, new CertKeyPair(certKeyPair.getCertificate(), certKeyPair.getPrivateKey()));
                    if (iVarC instanceof i.Left) {
                        return iVarC;
                    }
                    if (iVarC instanceof i.Right) {
                        throw new p();
                    }
                    byte[] bArr2 = (byte[]) ((i.Right) iVarC).b();
                    String strD2 = this.cmsManager.d(bArr2, x509Certificate);
                    eVar2 = this.sendDataUC;
                    params3 = new en0.e.Params(params2.getSessionId(), c0.g(strD2));
                    bVar.f86067d = vq.j.a(params2);
                    bVar.f86068e = jVar;
                    bVar.f86069f = vq.j.a(bVar5);
                    bVar.f86070g = vq.j.a(bVar4);
                    bVar.f86071h = vq.j.a(x509Certificate);
                    bVar.f86072j = vq.j.a(certKeyPair);
                    bVar.f86073k = vq.j.a(strB);
                    bVar.f86074l = vq.j.a(iVarC);
                    bVar.f86075m = vq.j.a(strD2);
                    bVar.f86076n = vq.j.a(bArr2);
                    bVar.f86077p = i15;
                    bVar.f86078q = i19;
                    bVar.f86079r = i18;
                    bVar.f86080s = i17;
                    bVar.f86081t = i16;
                    bVar.f86084x = 2;
                    if (eVar2.c(params3, bVar) != E) {
                        return new i.Right(oq.i0.f148189a);
                    }
                    return E;
                } catch (ex.c e25) {
                    e = e25;
                    return new i.Left((dx.b) ex.d.a(e));
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    E = jVar;
                    px.f fVar2 = px.f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(E));
                    iVarA = E.a(e);
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
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }
}
