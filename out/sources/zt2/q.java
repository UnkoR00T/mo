package zt2;

import bu2.CompanyDetails;
import bu2.SummaryData;
import bu2.VerifiedStatus;
import java.time.LocalDate;
import oq.i0;
import p071kotlin.Metadata;
import ts0.RestrictionsVerificationList;
import ts0.VerifyingInstitution;
import ts0.VerifyingInstitutionAddress;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lzt2/q;", "", "Lzt2/q$a;", "Lts0/r;", "Lus0/i;", "getVerificationUseCase", "Lac4/a;", "callActionWithLoaderUseCase", "<init>", "(Lus0/i;Lac4/a;)V", "Lbu2/b;", "Lbu2/a;", "idType", "", "f", "(Lbu2/b;Lbu2/a;)Ljava/lang/String;", "params", "Ldx/i;", "Ldx/b;", "g", "(Lzt2/q$a;Ltq/e;)Ljava/lang/Object;", "a", "Lus0/i;", "b", "Lac4/a;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final us0.i getVerificationUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: zt2.q$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzt2/q$a;", "Lgz/b$a;", "Lbu2/c;", "summaryData", "<init>", "(Lbu2/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbu2/c;", "()Lbu2/c;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
            return (other instanceof Params) && fr.t.c(this.summaryData, ((Params) other).summaryData);
        }

        public int hashCode() {
            return this.summaryData.hashCode();
        }

        public String toString() {
            return "Params(summaryData=" + this.summaryData + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lts0/r;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends RestrictionsVerificationList>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f237384e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f237385f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Params f237386g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q f237387h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Params params, q qVar, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f237386g = params;
            this.f237387h = qVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            VerifyingInstitution verifyingInstitution;
            Object objE = uq.b.e();
            int i15 = this.f237385f;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            String pesel = this.f237386g.getSummaryData().getVerificationCheckData().getPesel();
            String reason = this.f237386g.getSummaryData().getVerificationCheckData().getReason();
            String idNumber = this.f237386g.getSummaryData().getVerificationCheckData().getIdNumber();
            VerifiedStatus verifiedStatus = this.f237386g.getSummaryData().getVerifiedStatus();
            LocalDate pickedDate = verifiedStatus != null ? verifiedStatus.getPickedDate() : null;
            CompanyDetails companyDetails = this.f237386g.getSummaryData().getCompanyDetails();
            if (companyDetails != null) {
                q qVar = this.f237387h;
                verifyingInstitution = new VerifyingInstitution(companyDetails.getName(), new VerifyingInstitutionAddress(companyDetails.getCity(), companyDetails.getPostalCode(), companyDetails.getBuildingNumber(), companyDetails.getStreet(), companyDetails.getApartmentNumber()), qVar.f(companyDetails, bu2.a.KRS), qVar.f(companyDetails, bu2.a.REGON), qVar.f(companyDetails, bu2.a.NIP));
            } else {
                verifyingInstitution = null;
            }
            ts0.s sVar = new ts0.s(pesel, reason, idNumber, pickedDate, verifyingInstitution);
            us0.i iVar = this.f237387h.getVerificationUseCase;
            us0.i.Params params = new us0.i.Params(sVar);
            this.f237384e = vq.j.a(sVar);
            this.f237385f = 1;
            Object objC = iVar.c(params, this);
            return objC == objE ? objE : objC;
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return new b(this.f237386g, this.f237387h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, RestrictionsVerificationList>> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    public q(us0.i iVar, ac4.a aVar) {
        this.getVerificationUseCase = iVar;
        this.callActionWithLoaderUseCase = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String f(CompanyDetails companyDetails, bu2.a aVar) {
        String idNumber = companyDetails.getIdNumber();
        if (companyDetails.getCompanyIdType() == aVar) {
            return idNumber;
        }
        return null;
    }

    public Object g(Params params, tq.e<? super dx.i<? extends dx.b, RestrictionsVerificationList>> eVar) {
        return ac4.a.a(this.callActionWithLoaderUseCase, null, new b(params, this, null), eVar, 1, null);
    }
}
