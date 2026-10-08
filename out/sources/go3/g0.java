package go3;

import co3.QrCodeData;
import dn0.VerificationCertificate;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001e BA\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ$\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u001b\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010-\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006."}, d2 = {"Lgo3/g0;", "", "Lgo3/g0$a;", "Lgo3/g0$b;", "Lac4/a;", "callActionWithLoaderUseCase", "Lq34/j0;", "getDocumentValidityStatusUseCase", "Lgo3/s0;", "verificationCertificateUseCase", "Lgo3/j;", "getDocumentTypeByScopeUseCase", "Lgo3/c0;", "getVerificationDataUseCase", "Lco3/i;", "scopeMapper", "Lmx/c;", "labelProvider", "<init>", "(Lac4/a;Lq34/j0;Lgo3/s0;Lgo3/j;Lgo3/c0;Lco3/i;Lmx/c;)V", "Lrq0/b;", "documentType", "Ldx/i;", "Ldx/b;", "Loq/i0;", "i", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "params", "j", "(Lgo3/g0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lac4/a;", "b", "Lq34/j0;", "c", "Lgo3/s0;", "d", "Lgo3/j;", "e", "Lgo3/c0;", "f", "Lco3/i;", "Ldx/b$c;", "g", "Ldx/b$c;", "documentNotFoundError", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q34.j0 getDocumentValidityStatusUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final s0 verificationCertificateUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j getDocumentTypeByScopeUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final c0 getVerificationDataUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final co3.i scopeMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business documentNotFoundError;

    /* JADX INFO: renamed from: go3.g0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/g0$a;", "Lgz/b$a;", "Lco3/e;", "qrCodeData", "<init>", "(Lco3/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/e;", "()Lco3/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final QrCodeData qrCodeData;

        public Params(QrCodeData qrCodeData) {
            this.qrCodeData = qrCodeData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final QrCodeData getQrCodeData() {
            return this.qrCodeData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.qrCodeData, ((Params) other).qrCodeData);
        }

        public int hashCode() {
            return this.qrCodeData.hashCode();
        }

        public String toString() {
            return "Params(qrCodeData=" + this.qrCodeData + ')';
        }
    }

    /* JADX INFO: renamed from: go3.g0$b, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR%\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001e\u0010#\u001a\u0004\b\u001c\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lgo3/g0$b;", "", "Lk34/g;", "document", "Loq/r;", "Lk34/a0;", "scope", "", "Lco3/q;", "list", "", "encodedCertificate", "Lco3/n;", "subDocument", "<init>", "(Lk34/g;Loq/r;Ljava/util/List;Ljava/lang/String;Lco3/n;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/g;", "()Lk34/g;", "b", "Loq/r;", "d", "()Loq/r;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Ljava/lang/String;", "e", "Lco3/n;", "()Lco3/n;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g document;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<k34.a0, k34.a0> scope;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.q> list;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encodedCertificate;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n subDocument;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(k34.g gVar, oq.r<? extends k34.a0, ? extends k34.a0> rVar, List<? extends co3.q> list, String str, co3.n nVar) {
            this.document = gVar;
            this.scope = rVar;
            this.list = list;
            this.encodedCertificate = str;
            this.subDocument = nVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k34.g getDocument() {
            return this.document;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getEncodedCertificate() {
            return this.encodedCertificate;
        }

        public final List<co3.q> c() {
            return this.list;
        }

        public final oq.r<k34.a0, k34.a0> d() {
            return this.scope;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final co3.n getSubDocument() {
            return this.subDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.document, result.document) && fr.t.c(this.scope, result.scope) && fr.t.c(this.list, result.list) && fr.t.c(this.encodedCertificate, result.encodedCertificate) && fr.t.c(this.subDocument, result.subDocument);
        }

        public int hashCode() {
            int iHashCode = ((((((this.document.hashCode() * 31) + this.scope.hashCode()) * 31) + this.list.hashCode()) * 31) + this.encodedCertificate.hashCode()) * 31;
            co3.n nVar = this.subDocument;
            return iHashCode + (nVar == null ? 0 : nVar.hashCode());
        }

        public String toString() {
            return "Result(document=" + this.document + ", scope=" + this.scope + ", list=" + this.list + ", encodedCertificate=" + this.encodedCertificate + ", subDocument=" + this.subDocument + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75445d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75446e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75448g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75446e = obj;
            this.f75448g |= PKIFailureInfo.systemUnavail;
            return g0.this.i(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lgo3/g0$b;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends Result>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75449e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75450f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75451g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75452h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f75453j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f75454k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f75455l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75456m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75457n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f75458p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f75459q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Params f75461s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Params params, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f75461s = params;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x00d3 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:24:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:26:0x00d8  */
        /* JADX WARN: Code duplicated, block: B:29:0x0121  */
        /* JADX WARN: Code duplicated, block: B:32:0x012e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:33:0x012f  */
        /* JADX WARN: Code duplicated, block: B:35:0x0133  */
        /* JADX WARN: Code duplicated, block: B:38:0x0188  */
        /* JADX WARN: Code duplicated, block: B:41:0x018f A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:42:0x0190  */
        /* JADX WARN: Code duplicated, block: B:44:0x0194  */
        /* JADX WARN: Code duplicated, block: B:46:0x01bf  */
        /* JADX WARN: Code duplicated, block: B:48:0x01c5  */
        /* JADX WARN: Code duplicated, block: B:50:0x01cb  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k34.a0 a0VarA;
            Object objD;
            Object objI;
            k34.a0 a0Var;
            rq0.b bVar;
            dx.i iVar;
            g0 g0Var;
            Params params;
            oq.i0 i0Var;
            Object objD2;
            int i15;
            k34.a0 a0Var2;
            rq0.b bVar2;
            dx.i iVar2;
            g0 g0Var2;
            oq.i0 i0Var2;
            int i16;
            dx.i iVar3;
            VerificationCertificate verificationCertificate;
            Object objK;
            VerificationCertificate verificationCertificate2;
            dx.i iVar4;
            Object objE = uq.b.e();
            int i17 = this.f75459q;
            if (i17 == 0) {
                oq.u.b(obj);
                a0VarA = g0.this.scopeMapper.a(Integer.parseInt(this.f75461s.getQrCodeData().getAttribute1()));
                j jVar = g0.this.getDocumentTypeByScopeUseCase;
                j.Params params2 = new j.Params(a0VarA);
                this.f75449e = a0VarA;
                this.f75459q = 1;
                objD = jVar.d(params2, this);
                if (objD != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                a0VarA = (k34.a0) this.f75449e;
                oq.u.b(obj);
                objD = obj;
            } else {
                if (i17 == 2) {
                    rq0.b bVar3 = (rq0.b) this.f75450f;
                    k34.a0 a0Var3 = (k34.a0) this.f75449e;
                    oq.u.b(obj);
                    bVar = bVar3;
                    a0Var = a0Var3;
                    objI = obj;
                    iVar = (dx.i) objI;
                    g0Var = g0.this;
                    params = this.f75461s;
                    if (iVar instanceof dx.i.Left) {
                        return iVar;
                    }
                    if (iVar instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                    s0 s0Var = g0Var.verificationCertificateUseCase;
                    s0.Params params3 = new s0.Params(params.getQrCodeData().getSecurityToken(), Long.parseLong(params.getQrCodeData().getValidTime()));
                    this.f75449e = a0Var;
                    this.f75450f = vq.j.a(bVar);
                    this.f75451g = vq.j.a(iVar);
                    this.f75452h = g0Var;
                    this.f75453j = vq.j.a(i0Var);
                    this.f75455l = 0;
                    this.f75456m = 0;
                    this.f75459q = 3;
                    objD2 = s0Var.d(params3, this);
                    if (objD2 != objE) {
                        i15 = 0;
                        a0Var2 = a0Var;
                        bVar2 = bVar;
                        iVar2 = iVar;
                        g0Var2 = g0Var;
                        i0Var2 = i0Var;
                        i16 = 0;
                        iVar3 = (dx.i) objD2;
                        if (iVar3 instanceof dx.i.Left) {
                            return iVar3;
                        }
                        if (!(iVar3 instanceof dx.i.Right)) {
                            throw new oq.p();
                        }
                        verificationCertificate = (VerificationCertificate) ((dx.i.Right) iVar3).b();
                        c0 c0Var = g0Var2.getVerificationDataUseCase;
                        c0.Params params4 = new c0.Params(null, null, null, true, false, oq.y.a(a0Var2, null), null, 23, null);
                        this.f75449e = vq.j.a(a0Var2);
                        this.f75450f = vq.j.a(bVar2);
                        this.f75451g = vq.j.a(iVar2);
                        this.f75452h = vq.j.a(i0Var2);
                        this.f75453j = vq.j.a(iVar3);
                        this.f75454k = verificationCertificate;
                        this.f75455l = i16;
                        this.f75456m = i15;
                        this.f75457n = 0;
                        this.f75458p = 0;
                        this.f75459q = 4;
                        objK = c0Var.k(params4, this);
                        if (objK != objE) {
                            verificationCertificate2 = verificationCertificate;
                        }
                    }
                    return objE;
                }
                if (i17 == 3) {
                    int i18 = this.f75456m;
                    int i19 = this.f75455l;
                    oq.i0 i0Var3 = (oq.i0) this.f75453j;
                    g0 g0Var3 = (g0) this.f75452h;
                    dx.i iVar5 = (dx.i) this.f75451g;
                    rq0.b bVar4 = (rq0.b) this.f75450f;
                    k34.a0 a0Var4 = (k34.a0) this.f75449e;
                    oq.u.b(obj);
                    a0Var2 = a0Var4;
                    bVar2 = bVar4;
                    iVar2 = iVar5;
                    g0Var2 = g0Var3;
                    i0Var2 = i0Var3;
                    i16 = i19;
                    i15 = i18;
                    objD2 = obj;
                    iVar3 = (dx.i) objD2;
                    if (iVar3 instanceof dx.i.Left) {
                        return iVar3;
                    }
                    if (!(iVar3 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    verificationCertificate = (VerificationCertificate) ((dx.i.Right) iVar3).b();
                    c0 c0Var2 = g0Var2.getVerificationDataUseCase;
                    c0.Params params5 = new c0.Params(null, null, null, true, false, oq.y.a(a0Var2, null), null, 23, null);
                    this.f75449e = vq.j.a(a0Var2);
                    this.f75450f = vq.j.a(bVar2);
                    this.f75451g = vq.j.a(iVar2);
                    this.f75452h = vq.j.a(i0Var2);
                    this.f75453j = vq.j.a(iVar3);
                    this.f75454k = verificationCertificate;
                    this.f75455l = i16;
                    this.f75456m = i15;
                    this.f75457n = 0;
                    this.f75458p = 0;
                    this.f75459q = 4;
                    objK = c0Var2.k(params5, this);
                    if (objK != objE) {
                        verificationCertificate2 = verificationCertificate;
                    }
                    return objE;
                }
                if (i17 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                verificationCertificate2 = (VerificationCertificate) this.f75454k;
                oq.u.b(obj);
                objK = obj;
            }
            iVar4 = (dx.i) objK;
            if (iVar4 instanceof dx.i.Left) {
                return iVar4;
            }
            if (iVar4 instanceof dx.i.Right) {
                throw new oq.p();
            }
            c0.Result result = (c0.Result) ((dx.i.Right) iVar4).b();
            return new dx.i.Right(new Result(result.getDocument(), result.c(), result.f(), verificationCertificate2.getCertificate().getEncoded(), result.getSubDocument()));
            rq0.b bVar5 = (rq0.b) objD;
            g0 g0Var4 = g0.this;
            this.f75449e = a0VarA;
            this.f75450f = vq.j.a(bVar5);
            this.f75459q = 2;
            objI = g0Var4.i(bVar5, this);
            if (objI != objE) {
                a0Var = a0VarA;
                bVar = bVar5;
                iVar = (dx.i) objI;
                g0Var = g0.this;
                params = this.f75461s;
                if (iVar instanceof dx.i.Left) {
                    return iVar;
                }
                if (iVar instanceof dx.i.Right) {
                    throw new oq.p();
                }
                i0Var = (oq.i0) ((dx.i.Right) iVar).b();
                s0 s0Var2 = g0Var.verificationCertificateUseCase;
                s0.Params params6 = new s0.Params(params.getQrCodeData().getSecurityToken(), Long.parseLong(params.getQrCodeData().getValidTime()));
                this.f75449e = a0Var;
                this.f75450f = vq.j.a(bVar);
                this.f75451g = vq.j.a(iVar);
                this.f75452h = g0Var;
                this.f75453j = vq.j.a(i0Var);
                this.f75455l = 0;
                this.f75456m = 0;
                this.f75459q = 3;
                objD2 = s0Var2.d(params6, this);
                if (objD2 != objE) {
                    i15 = 0;
                    a0Var2 = a0Var;
                    bVar2 = bVar;
                    iVar2 = iVar;
                    g0Var2 = g0Var;
                    i0Var2 = i0Var;
                    i16 = 0;
                    iVar3 = (dx.i) objD2;
                    if (iVar3 instanceof dx.i.Left) {
                        return iVar3;
                    }
                    if (!(iVar3 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    verificationCertificate = (VerificationCertificate) ((dx.i.Right) iVar3).b();
                    c0 c0Var3 = g0Var2.getVerificationDataUseCase;
                    c0.Params params7 = new c0.Params(null, null, null, true, false, oq.y.a(a0Var2, null), null, 23, null);
                    this.f75449e = vq.j.a(a0Var2);
                    this.f75450f = vq.j.a(bVar2);
                    this.f75451g = vq.j.a(iVar2);
                    this.f75452h = vq.j.a(i0Var2);
                    this.f75453j = vq.j.a(iVar3);
                    this.f75454k = verificationCertificate;
                    this.f75455l = i16;
                    this.f75456m = i15;
                    this.f75457n = 0;
                    this.f75458p = 0;
                    this.f75459q = 4;
                    objK = c0Var3.k(params7, this);
                    if (objK != objE) {
                        verificationCertificate2 = verificationCertificate;
                        iVar4 = (dx.i) objK;
                        if (iVar4 instanceof dx.i.Left) {
                            return iVar4;
                        }
                        if (iVar4 instanceof dx.i.Right) {
                            throw new oq.p();
                        }
                        c0.Result result2 = (c0.Result) ((dx.i.Right) iVar4).b();
                        return new dx.i.Right(new Result(result2.getDocument(), result2.c(), result2.f(), verificationCertificate2.getCertificate().getEncoded(), result2.getSubDocument()));
                    }
                }
            }
            return objE;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return g0.this.new d(this.f75461s, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
            return ((d) M(eVar)).J(oq.i0.f148189a);
        }
    }

    public g0(ac4.a aVar, q34.j0 j0Var, s0 s0Var, j jVar, c0 c0Var, co3.i iVar, mx.c cVar) {
        this.callActionWithLoaderUseCase = aVar;
        this.getDocumentValidityStatusUseCase = j0Var;
        this.verificationCertificateUseCase = s0Var;
        this.getDocumentTypeByScopeUseCase = jVar;
        this.getVerificationDataUseCase = c0Var;
        this.scopeMapper = iVar;
        this.documentNotFoundError = new dx.b.Business(co3.a.DOCUMENT_NOT_FOUND, null, cVar.c(un3.b.M), cVar.c(un3.b.N), null, cVar.c(un3.b.f199406d), null, 82, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object i(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f75448g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f75448g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f75446e;
        Object objE = uq.b.e();
        int i16 = cVar.f75448g;
        if (i16 == 0) {
            oq.u.b(objC);
            q34.j0 j0Var = this.getDocumentValidityStatusUseCase;
            q34.j0.a.AllDocumentStatus allDocumentStatus = new q34.j0.a.AllDocumentStatus(bVar, null);
            cVar.f75445d = vq.j.a(bVar);
            cVar.f75448g = 1;
            objC = j0Var.c(allDocumentStatus, cVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objC);
        }
        dx.i iVar = (dx.i) objC;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left(this.documentNotFoundError);
        }
        if (iVar instanceof dx.i.Right) {
            return ((er0.h) ((dx.i.Right) iVar).b()) == er0.h.INACTIVE ? new dx.i.Left(this.documentNotFoundError) : new dx.i.Right(oq.i0.f148189a);
        }
        throw new oq.p();
    }

    public Object j(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new d(params, null), eVar, 1, null);
    }
}
