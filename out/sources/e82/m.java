package e82;

import fp0.SummaryData;
import fr.t;
import iy.b0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.z0;
import ry.CertKeyPair;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u001a\u0012\u0004\u0012\u00020\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00030\u0001:\u0001\u0019B1\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0014\u0010\u0014\u001a\u00020\u0013*\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0016\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010!¨\u0006\""}, d2 = {"Le82/m;", "Lgz/b;", "Le82/m$a;", "Ldx/i;", "Ldx/b;", "", "Lgp0/a;", "getInstitutionAndCertDataUseCase", "Lgp0/d;", "sendReportSummaryFormUseCase", "Le82/k;", "getIdentityAndCertKeyPairUC", "Lq34/z0;", "getPeselFromPersonalIdCertificateUC", "Ly72/b;", "giosServerTimeInteractor", "<init>", "(Lgp0/a;Lgp0/d;Le82/k;Lq34/z0;Ly72/b;)V", "Lry/c;", "Lxw/g;", "e", "(Lry/c;Ltq/e;)Ljava/lang/Object;", "params", "f", "(Le82/m$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgp0/a;", "b", "Lgp0/d;", "c", "Le82/k;", "d", "Lq34/z0;", "Ly72/b;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m implements gz.b<Params, dx.i<? extends dx.b, ? extends String>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final gp0.a getInstitutionAndCertDataUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final gp0.d sendReportSummaryFormUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final k getIdentityAndCertKeyPairUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z0 getPeselFromPersonalIdCertificateUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final y72.b giosServerTimeInteractor;

    /* JADX INFO: renamed from: e82.m$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Le82/m$a;", "Lgz/b$a;", "Lfp0/j;", "summaryData", "<init>", "(Lfp0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfp0/j;", "()Lfp0/j;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SummaryData summaryData;

        public Params(SummaryData summaryData) {
            this.summaryData = summaryData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final SummaryData getSummaryData() {
            return this.summaryData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.summaryData, ((Params) other).summaryData);
        }

        public int hashCode() {
            return this.summaryData.hashCode();
        }

        public String toString() {
            return "Params(summaryData=" + this.summaryData + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f48498d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f48499e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f48501g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            this.f48499e = obj;
            this.f48501g |= PKIFailureInfo.systemUnavail;
            Object objE = m.this.e(null, this);
            return objE == uq.b.e() ? objE : xw.g.b((b0) objE);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f48502d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f48503e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f48504f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f48505g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f48506h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f48507j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f48508k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f48509l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f48510m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f48511n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f48512p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f48513q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f48514r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f48515s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f48517v;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f48515s = obj;
            this.f48517v |= PKIFailureInfo.systemUnavail;
            return m.this.f(null, this);
        }
    }

    public m(gp0.a aVar, gp0.d dVar, k kVar, z0 z0Var, y72.b bVar) {
        this.getInstitutionAndCertDataUseCase = aVar;
        this.sendReportSummaryFormUseCase = dVar;
        this.getIdentityAndCertKeyPairUC = kVar;
        this.getPeselFromPersonalIdCertificateUC = z0Var;
        this.giosServerTimeInteractor = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(CertKeyPair certKeyPair, tq.e<? super xw.g> eVar) throws Throwable {
        b bVar;
        b0 pesel;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f48501g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f48501g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        Object objC = bVar.f48499e;
        Object objE = uq.b.e();
        int i16 = bVar.f48501g;
        if (i16 == 0) {
            u.b(objC);
            z0 z0Var = this.getPeselFromPersonalIdCertificateUC;
            z0.a.Cert cert = new z0.a.Cert(certKeyPair.getCertificate());
            bVar.f48498d = vq.j.a(certKeyPair);
            bVar.f48501g = 1;
            objC = z0Var.c(cert, bVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(objC);
        }
        z0.Result result = (z0.Result) ((dx.i) objC).a();
        return (result == null || (pesel = result.getPesel()) == null) ? xw.g.INSTANCE.a() : xw.g.c(pesel);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0153 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x0154  */
    /* JADX WARN: Code duplicated, block: B:39:0x0158  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:48:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x01f5, code lost:
    
        if (r1 == r3) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(e82.m.Params r21, tq.e<? super dx.i<? extends dx.b, java.lang.String>> r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 519
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: e82.m.f(e82.m$a, tq.e):java.lang.Object");
    }
}
