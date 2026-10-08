package go3;

import co3.InstitutionDataModel;
import co3.QrCodeData;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0013\u0015B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ$\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00030\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgo3/f0;", "", "Lgo3/f0$a;", "Lgo3/f0$b;", "Lgo3/c;", "fetchInstitutionDataUseCase", "Lgo3/c0;", "getVerificationDataUseCase", "Lgo3/u0;", "verifyMainDocumentValidityUseCase", "Lgo3/w0;", "verifySelectedDocumentValidityUseCase", "<init>", "(Lgo3/c;Lgo3/c0;Lgo3/u0;Lgo3/w0;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/f0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo3/c;", "b", "Lgo3/c0;", "c", "Lgo3/u0;", "Lgo3/w0;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final go3.c fetchInstitutionDataUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c0 getVerificationDataUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final u0 verifyMainDocumentValidityUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final w0 verifySelectedDocumentValidityUseCase;

    /* JADX INFO: renamed from: go3.f0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/f0$a;", "Lgz/b$a;", "Lco3/e;", "qrCodeData", "<init>", "(Lco3/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/e;", "()Lco3/e;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: go3.f0$b, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b\u001e\u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\"\u0010*R\u001f\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010!¨\u0006-"}, d2 = {"Lgo3/f0$b;", "", "Lk34/g;", "document", "", "Lco3/q;", "verificationData", "Loq/r;", "Lk34/a0;", "scope", "Lco3/c;", "institutionData", "Lco3/n;", "subDocument", "subDocumentList", "<init>", "(Lk34/g;Ljava/util/List;Loq/r;Lco3/c;Lco3/n;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/g;", "()Lk34/g;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "c", "Loq/r;", "getScope", "()Loq/r;", "Lco3/c;", "()Lco3/c;", "e", "Lco3/n;", "()Lco3/n;", "f", "getSubDocumentList", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.g document;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.q> verificationData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final oq.r<k34.a0, k34.a0> scope;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final InstitutionDataModel institutionData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n subDocument;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.n> subDocumentList;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(k34.g gVar, List<? extends co3.q> list, oq.r<? extends k34.a0, ? extends k34.a0> rVar, InstitutionDataModel institutionDataModel, co3.n nVar, List<? extends co3.n> list2) {
            this.document = gVar;
            this.verificationData = list;
            this.scope = rVar;
            this.institutionData = institutionDataModel;
            this.subDocument = nVar;
            this.subDocumentList = list2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final k34.g getDocument() {
            return this.document;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InstitutionDataModel getInstitutionData() {
            return this.institutionData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final co3.n getSubDocument() {
            return this.subDocument;
        }

        public final List<co3.q> d() {
            return this.verificationData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.document, result.document) && fr.t.c(this.verificationData, result.verificationData) && fr.t.c(this.scope, result.scope) && fr.t.c(this.institutionData, result.institutionData) && fr.t.c(this.subDocument, result.subDocument) && fr.t.c(this.subDocumentList, result.subDocumentList);
        }

        public int hashCode() {
            int iHashCode = ((((((this.document.hashCode() * 31) + this.verificationData.hashCode()) * 31) + this.scope.hashCode()) * 31) + this.institutionData.hashCode()) * 31;
            co3.n nVar = this.subDocument;
            int iHashCode2 = (iHashCode + (nVar == null ? 0 : nVar.hashCode())) * 31;
            List<co3.n> list = this.subDocumentList;
            return iHashCode2 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Result(document=" + this.document + ", verificationData=" + this.verificationData + ", scope=" + this.scope + ", institutionData=" + this.institutionData + ", subDocument=" + this.subDocument + ", subDocumentList=" + this.subDocumentList + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75414a;

        static {
            int[] iArr = new int[co3.f.values().length];
            try {
                iArr[co3.f.STATIC.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[co3.f.DYNAMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f75414a = iArr;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75415d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f75416e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f75417f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f75418g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f75419h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f75420j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f75421k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f75422l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f75423m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f75424n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f75425p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f75426q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f75427r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        int f75428s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f75429t;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f75431w;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75429t = obj;
            this.f75431w |= PKIFailureInfo.systemUnavail;
            return f0.this.d(null, this);
        }
    }

    public f0(go3.c cVar, c0 c0Var, u0 u0Var, w0 w0Var) {
        this.fetchInstitutionDataUseCase = cVar;
        this.getVerificationDataUseCase = c0Var;
        this.verifyMainDocumentValidityUseCase = u0Var;
        this.verifySelectedDocumentValidityUseCase = w0Var;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0150 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:45:0x0151  */
    /* JADX WARN: Code duplicated, block: B:47:0x0155  */
    /* JADX WARN: Code duplicated, block: B:50:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:53:0x01c3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:54:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:56:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:59:0x0221  */
    /* JADX WARN: Code duplicated, block: B:62:0x022a A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x022b  */
    /* JADX WARN: Code duplicated, block: B:65:0x022f  */
    /* JADX WARN: Code duplicated, block: B:67:0x0256  */
    /* JADX WARN: Code duplicated, block: B:69:0x025c  */
    /* JADX WARN: Code duplicated, block: B:71:0x0262  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public Object d(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) throws Throwable {
        d dVar;
        Params params2;
        oq.i0 i0Var;
        go3.c.b aVar;
        dx.i iVar;
        Params params3;
        int i15;
        int i16;
        QrCodeData qrCodeData;
        oq.i0 i0Var2;
        dx.i iVar2;
        InstitutionDataModel institutionDataModel;
        Object objK;
        InstitutionDataModel institutionDataModel2;
        int i17;
        int i18;
        dx.i iVar3;
        c0.Result bVar;
        c0.Result bVar2;
        InstitutionDataModel institutionDataModel3;
        dx.i iVar4;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i19 = dVar.f75431w;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f75431w = i19 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objA = dVar.f75429t;
        Object objE = uq.b.e();
        int i25 = dVar.f75431w;
        if (i25 == 0) {
            oq.u.b(objA);
            u0 u0Var = this.verifyMainDocumentValidityUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            dVar.f75415d = params;
            dVar.f75431w = 1;
            objA = u0Var.a(c1792a, dVar);
            if (objA != objE) {
                params2 = params;
            }
            return objE;
        }
        if (i25 == 1) {
            params2 = (Params) dVar.f75415d;
            oq.u.b(objA);
        } else {
            if (i25 == 2) {
                int i26 = dVar.f75424n;
                int i27 = dVar.f75423m;
                QrCodeData qrCodeData2 = (QrCodeData) dVar.f75418g;
                i0Var = (oq.i0) dVar.f75417f;
                dx.i iVar5 = (dx.i) dVar.f75416e;
                Params params4 = (Params) dVar.f75415d;
                oq.u.b(objA);
                iVar = iVar5;
                params3 = params4;
                qrCodeData = qrCodeData2;
                i16 = i27;
                i15 = i26;
                i0Var2 = i0Var;
                iVar2 = (dx.i) objA;
                if (iVar2 instanceof dx.i.Left) {
                    return iVar2;
                }
                if (iVar2 instanceof dx.i.Right) {
                    throw new oq.p();
                }
                institutionDataModel = (InstitutionDataModel) ((dx.i.Right) iVar2).b();
                c0 c0Var = this.getVerificationDataUseCase;
                c0.Params aVar2 = new c0.Params(null, null, null, true, false, oq.y.a(institutionDataModel.getScope(), null), vq.b.e(institutionDataModel.getInstitutionId()), 23, null);
                dVar.f75415d = vq.j.a(params3);
                dVar.f75416e = vq.j.a(iVar);
                dVar.f75417f = vq.j.a(i0Var2);
                dVar.f75418g = vq.j.a(qrCodeData);
                dVar.f75419h = vq.j.a(iVar2);
                dVar.f75420j = institutionDataModel;
                dVar.f75423m = i16;
                dVar.f75424n = i15;
                dVar.f75425p = 0;
                dVar.f75426q = 0;
                dVar.f75431w = 3;
                objK = c0Var.k(aVar2, dVar);
                if (objK != objE) {
                    institutionDataModel2 = institutionDataModel;
                    objA = objK;
                    i17 = 0;
                    i18 = 0;
                    iVar3 = (dx.i) objA;
                    if (iVar3 instanceof dx.i.Left) {
                        return iVar3;
                    }
                    if (!(iVar3 instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    bVar = (c0.Result) ((dx.i.Right) iVar3).b();
                    w0 w0Var = this.verifySelectedDocumentValidityUseCase;
                    w0.Params aVar3 = new w0.Params(bVar.getDocument().getType());
                    dVar.f75415d = vq.j.a(params3);
                    dVar.f75416e = vq.j.a(iVar);
                    dVar.f75417f = vq.j.a(i0Var2);
                    dVar.f75418g = vq.j.a(qrCodeData);
                    dVar.f75419h = vq.j.a(iVar2);
                    dVar.f75420j = institutionDataModel2;
                    dVar.f75421k = vq.j.a(iVar3);
                    dVar.f75422l = bVar;
                    dVar.f75423m = i16;
                    dVar.f75424n = i15;
                    dVar.f75425p = i18;
                    dVar.f75426q = i17;
                    dVar.f75427r = 0;
                    dVar.f75428s = 0;
                    dVar.f75431w = 4;
                    objA = w0Var.e(aVar3, dVar);
                    if (objA != objE) {
                        bVar2 = bVar;
                    }
                }
                return objE;
            }
            if (i25 == 3) {
                int i28 = dVar.f75426q;
                i18 = dVar.f75425p;
                i15 = dVar.f75424n;
                i16 = dVar.f75423m;
                InstitutionDataModel institutionDataModel4 = (InstitutionDataModel) dVar.f75420j;
                iVar2 = (dx.i) dVar.f75419h;
                qrCodeData = (QrCodeData) dVar.f75418g;
                i0Var2 = (oq.i0) dVar.f75417f;
                iVar = (dx.i) dVar.f75416e;
                params3 = (Params) dVar.f75415d;
                oq.u.b(objA);
                i17 = i28;
                institutionDataModel2 = institutionDataModel4;
                iVar3 = (dx.i) objA;
                if (iVar3 instanceof dx.i.Left) {
                    return iVar3;
                }
                if (!(iVar3 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                bVar = (c0.Result) ((dx.i.Right) iVar3).b();
                w0 w0Var2 = this.verifySelectedDocumentValidityUseCase;
                w0.Params aVar4 = new w0.Params(bVar.getDocument().getType());
                dVar.f75415d = vq.j.a(params3);
                dVar.f75416e = vq.j.a(iVar);
                dVar.f75417f = vq.j.a(i0Var2);
                dVar.f75418g = vq.j.a(qrCodeData);
                dVar.f75419h = vq.j.a(iVar2);
                dVar.f75420j = institutionDataModel2;
                dVar.f75421k = vq.j.a(iVar3);
                dVar.f75422l = bVar;
                dVar.f75423m = i16;
                dVar.f75424n = i15;
                dVar.f75425p = i18;
                dVar.f75426q = i17;
                dVar.f75427r = 0;
                dVar.f75428s = 0;
                dVar.f75431w = 4;
                objA = w0Var2.e(aVar4, dVar);
                if (objA != objE) {
                    bVar2 = bVar;
                }
                return objE;
            }
            if (i25 != 4) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (c0.Result) dVar.f75422l;
            institutionDataModel2 = (InstitutionDataModel) dVar.f75420j;
            oq.u.b(objA);
        }
        institutionDataModel3 = institutionDataModel2;
        iVar4 = (dx.i) objA;
        if (iVar4 instanceof dx.i.Left) {
            return iVar4;
        }
        if (iVar4 instanceof dx.i.Right) {
            throw new oq.p();
        }
        return new dx.i.Right(new Result(bVar2.getDocument(), bVar2.f(), bVar2.c(), institutionDataModel3, bVar2.getSubDocument(), bVar2.e()));
        dx.i iVar6 = (dx.i) objA;
        if (iVar6 instanceof dx.i.Left) {
            return iVar6;
        }
        if (!(iVar6 instanceof dx.i.Right)) {
            throw new oq.p();
        }
        i0Var = (oq.i0) ((dx.i.Right) iVar6).b();
        QrCodeData qrCodeData3 = params2.getQrCodeData();
        go3.c cVar = this.fetchInstitutionDataUseCase;
        int i29 = Integer.parseInt(qrCodeData3.getAttribute1());
        int i35 = Integer.parseInt(qrCodeData3.getStakeholderID());
        int i36 = c.f75414a[qrCodeData3.getQrType().ordinal()];
        if (i36 == 1) {
            aVar = go3.c.b.C1708b.f75237a;
        } else {
            if (i36 != 2) {
                throw new oq.p();
            }
            aVar = new go3.c.b.Dynamic(Long.parseLong(qrCodeData3.getValidTime()));
        }
        go3.c.Params aVar5 = new go3.c.Params(i29, i35, aVar);
        dVar.f75415d = vq.j.a(params2);
        dVar.f75416e = vq.j.a(iVar6);
        dVar.f75417f = vq.j.a(i0Var);
        dVar.f75418g = vq.j.a(qrCodeData3);
        dVar.f75423m = 0;
        dVar.f75424n = 0;
        dVar.f75431w = 2;
        Object objF = cVar.f(aVar5, dVar);
        if (objF != objE) {
            iVar = iVar6;
            params3 = params2;
            objA = objF;
            i15 = 0;
            i16 = 0;
            qrCodeData = qrCodeData3;
            i0Var2 = i0Var;
            iVar2 = (dx.i) objA;
            if (iVar2 instanceof dx.i.Left) {
                return iVar2;
            }
            if (iVar2 instanceof dx.i.Right) {
                throw new oq.p();
            }
            institutionDataModel = (InstitutionDataModel) ((dx.i.Right) iVar2).b();
            c0 c0Var2 = this.getVerificationDataUseCase;
            c0.Params aVar6 = new c0.Params(null, null, null, true, false, oq.y.a(institutionDataModel.getScope(), null), vq.b.e(institutionDataModel.getInstitutionId()), 23, null);
            dVar.f75415d = vq.j.a(params3);
            dVar.f75416e = vq.j.a(iVar);
            dVar.f75417f = vq.j.a(i0Var2);
            dVar.f75418g = vq.j.a(qrCodeData);
            dVar.f75419h = vq.j.a(iVar2);
            dVar.f75420j = institutionDataModel;
            dVar.f75423m = i16;
            dVar.f75424n = i15;
            dVar.f75425p = 0;
            dVar.f75426q = 0;
            dVar.f75431w = 3;
            objK = c0Var2.k(aVar6, dVar);
            if (objK != objE) {
                institutionDataModel2 = institutionDataModel;
                objA = objK;
                i17 = 0;
                i18 = 0;
                iVar3 = (dx.i) objA;
                if (iVar3 instanceof dx.i.Left) {
                    return iVar3;
                }
                if (!(iVar3 instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                bVar = (c0.Result) ((dx.i.Right) iVar3).b();
                w0 w0Var3 = this.verifySelectedDocumentValidityUseCase;
                w0.Params aVar7 = new w0.Params(bVar.getDocument().getType());
                dVar.f75415d = vq.j.a(params3);
                dVar.f75416e = vq.j.a(iVar);
                dVar.f75417f = vq.j.a(i0Var2);
                dVar.f75418g = vq.j.a(qrCodeData);
                dVar.f75419h = vq.j.a(iVar2);
                dVar.f75420j = institutionDataModel2;
                dVar.f75421k = vq.j.a(iVar3);
                dVar.f75422l = bVar;
                dVar.f75423m = i16;
                dVar.f75424n = i15;
                dVar.f75425p = i18;
                dVar.f75426q = i17;
                dVar.f75427r = 0;
                dVar.f75428s = 0;
                dVar.f75431w = 4;
                objA = w0Var3.e(aVar7, dVar);
                if (objA != objE) {
                    bVar2 = bVar;
                    institutionDataModel3 = institutionDataModel2;
                    iVar4 = (dx.i) objA;
                    if (iVar4 instanceof dx.i.Left) {
                        return iVar4;
                    }
                    if (iVar4 instanceof dx.i.Right) {
                        throw new oq.p();
                    }
                    return new dx.i.Right(new Result(bVar2.getDocument(), bVar2.f(), bVar2.c(), institutionDataModel3, bVar2.getSubDocument(), bVar2.e()));
                }
            }
        }
        return objE;
    }
}
