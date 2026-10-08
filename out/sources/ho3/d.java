package ho3;

import co3.QrCodeData;
import co3.n;
import co3.q;
import dn0.VerificationCertificate;
import dx.i;
import eo3.VerificationSelector;
import fr.t;
import go3.c0;
import go3.s0;
import java.util.List;
import k34.a0;
import oq.p;
import oq.r;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.j;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lho3/d;", "", "Lho3/d$a;", "Lho3/d$b;", "Lgo3/s0;", "verificationCertificateUseCase", "Lgo3/c0;", "getVerificationDataUseCase", "<init>", "(Lgo3/s0;Lgo3/c0;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lho3/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo3/s0;", "b", "Lgo3/c0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s0 verificationCertificateUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 getVerificationDataUseCase;

    /* JADX INFO: renamed from: ho3.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lho3/d$a;", "Lgz/b$a;", "Lco3/e;", "qrCodeData", "Lwn3/c;", "entryPoint", "<init>", "(Lco3/e;Lwn3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/e;", "b", "()Lco3/e;", "Lwn3/c;", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        public Params(QrCodeData qrCodeData, wn3.c cVar) {
            this.qrCodeData = qrCodeData;
            this.entryPoint = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wn3.c getEntryPoint() {
            return this.entryPoint;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
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
            return t.c(this.qrCodeData, params.qrCodeData) && t.c(this.entryPoint, params.entryPoint);
        }

        public int hashCode() {
            int iHashCode = this.qrCodeData.hashCode() * 31;
            wn3.c cVar = this.entryPoint;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Params(qrCodeData=" + this.qrCodeData + ", entryPoint=" + this.entryPoint + ')';
        }
    }

    /* JADX INFO: renamed from: ho3.d$b, reason: from toString */
    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0007\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010(\u001a\u0004\b$\u0010\u0015R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b\u001d\u0010'R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b,\u0010%\u001a\u0004\b,\u0010'R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/¨\u00060"}, d2 = {"Lho3/d$b;", "", "Lk34/g;", "document", "Loq/r;", "Lk34/a0;", "scope", "", "Lco3/q;", "list", "", "encodedCertificate", "availableDocuments", "Lco3/n;", "subDocument", "subDocumentList", "Leo3/v;", "verificationSelector", "<init>", "(Lk34/g;Loq/r;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lco3/n;Ljava/util/List;Leo3/v;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/g;", "b", "()Lk34/g;", "Loq/r;", "e", "()Loq/r;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Ljava/lang/String;", "f", "Lco3/n;", "()Lco3/n;", "g", "h", "Leo3/v;", "()Leo3/v;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g document;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final r<a0, a0> scope;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<q> list;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encodedCertificate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<k34.g> availableDocuments;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final n subDocument;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<n> subDocumentList;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final VerificationSelector verificationSelector;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(k34.g gVar, r<? extends a0, ? extends a0> rVar, List<? extends q> list, String str, List<? extends k34.g> list2, n nVar, List<? extends n> list3, VerificationSelector verificationSelector) {
            this.document = gVar;
            this.scope = rVar;
            this.list = list;
            this.encodedCertificate = str;
            this.availableDocuments = list2;
            this.subDocument = nVar;
            this.subDocumentList = list3;
            this.verificationSelector = verificationSelector;
        }

        public final List<k34.g> a() {
            return this.availableDocuments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final k34.g getDocument() {
            return this.document;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getEncodedCertificate() {
            return this.encodedCertificate;
        }

        public final List<q> d() {
            return this.list;
        }

        public final r<a0, a0> e() {
            return this.scope;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return t.c(this.document, result.document) && t.c(this.scope, result.scope) && t.c(this.list, result.list) && t.c(this.encodedCertificate, result.encodedCertificate) && t.c(this.availableDocuments, result.availableDocuments) && t.c(this.subDocument, result.subDocument) && t.c(this.subDocumentList, result.subDocumentList) && t.c(this.verificationSelector, result.verificationSelector);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final n getSubDocument() {
            return this.subDocument;
        }

        public final List<n> g() {
            return this.subDocumentList;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final VerificationSelector getVerificationSelector() {
            return this.verificationSelector;
        }

        public int hashCode() {
            int iHashCode = ((((((((this.document.hashCode() * 31) + this.scope.hashCode()) * 31) + this.list.hashCode()) * 31) + this.encodedCertificate.hashCode()) * 31) + this.availableDocuments.hashCode()) * 31;
            n nVar = this.subDocument;
            int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
            List<n> list = this.subDocumentList;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            VerificationSelector verificationSelector = this.verificationSelector;
            return iHashCode3 + (verificationSelector != null ? verificationSelector.hashCode() : 0);
        }

        public String toString() {
            return "Result(document=" + this.document + ", scope=" + this.scope + ", list=" + this.list + ", encodedCertificate=" + this.encodedCertificate + ", availableDocuments=" + this.availableDocuments + ", subDocument=" + this.subDocument + ", subDocumentList=" + this.subDocumentList + ", verificationSelector=" + this.verificationSelector + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f86044d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f86045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f86046f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f86047g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f86048h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f86049j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f86051l;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f86049j = obj;
            this.f86051l |= PKIFailureInfo.systemUnavail;
            return d.this.d(null, this);
        }
    }

    public d(s0 s0Var, c0 c0Var) {
        this.verificationCertificateUseCase = s0Var;
        this.getVerificationDataUseCase = c0Var;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x00c5 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:32:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:34:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:36:0x0101  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object d(Params params, tq.e<? super i<? extends dx.b, Result>> eVar) throws Throwable {
        c cVar;
        Params params2;
        VerificationCertificate verificationCertificate;
        i iVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f86051l;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f86051l = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objD = cVar.f86049j;
        Object objE = uq.b.e();
        int i16 = cVar.f86051l;
        if (i16 == 0) {
            u.b(objD);
            s0 s0Var = this.verificationCertificateUseCase;
            s0.Params params3 = new s0.Params(params.getQrCodeData().getSecurityToken(), Long.parseLong(params.getQrCodeData().getValidTime()));
            cVar.f86044d = params;
            cVar.f86051l = 1;
            objD = s0Var.d(params3, cVar);
            if (objD != objE) {
                params2 = params;
            }
            return objE;
        }
        if (i16 == 1) {
            params2 = (Params) cVar.f86044d;
            u.b(objD);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            verificationCertificate = (VerificationCertificate) cVar.f86046f;
            u.b(objD);
        }
        iVar = (i) objD;
        if (iVar instanceof i.Left) {
            return iVar;
        }
        if (iVar instanceof i.Right) {
            throw new p();
        }
        c0.Result result = (c0.Result) ((i.Right) iVar).b();
        List<k34.g> listA = result.a();
        r<a0, a0> rVarC = result.c();
        return new i.Right(new Result(result.getDocument(), rVarC, result.f(), verificationCertificate.getCertificate().getEncoded(), listA, result.getSubDocument(), result.e(), result.getVerificationSelector()));
        i iVar2 = (i) objD;
        if (iVar2 instanceof i.Left) {
            return iVar2;
        }
        if (!(iVar2 instanceof i.Right)) {
            throw new p();
        }
        VerificationCertificate verificationCertificate2 = (VerificationCertificate) ((i.Right) iVar2).b();
        c0 c0Var = this.getVerificationDataUseCase;
        c0.Params params4 = new c0.Params(null, null, params2.getEntryPoint(), false, false, null, null, 50, null);
        cVar.f86044d = j.a(params2);
        cVar.f86045e = j.a(iVar2);
        cVar.f86046f = verificationCertificate2;
        cVar.f86047g = 0;
        cVar.f86048h = 0;
        cVar.f86051l = 2;
        objD = c0Var.k(params4, cVar);
        if (objD != objE) {
            verificationCertificate = verificationCertificate2;
            iVar = (i) objD;
            if (iVar instanceof i.Left) {
                return iVar;
            }
            if (iVar instanceof i.Right) {
                throw new p();
            }
            c0.Result result2 = (c0.Result) ((i.Right) iVar).b();
            List<k34.g> listA2 = result2.a();
            r<a0, a0> rVarC2 = result2.c();
            return new i.Right(new Result(result2.getDocument(), rVarC2, result2.f(), verificationCertificate.getCertificate().getEncoded(), listA2, result2.getSubDocument(), result2.e(), result2.getVerificationSelector()));
        }
        return objE;
    }
}
