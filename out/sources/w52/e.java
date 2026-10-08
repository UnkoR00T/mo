package w52;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import p024c42.r2;
import p024c42.s2;
import p024c42.v2;
import p024c42.y2;
import p071kotlin.Metadata;
import s52.StampDutyPaymentsSummaryData;
import y52.StampDutyCommitmentTypeData;
import y52.StampDutyCommitmentVariantData;
import y52.StampDutyInstitutionResult;
import y52.StampDutyInstitutionsData;
import y52.StampDutyPaymentsCommitmentTypeResult;
import y52.StampDutyPaymentsCommitmentVariantResult;
import y52.StampDutyPaymentsPersonalDataResult;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001c\u001a\u0004\u0018\u00010\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001f\u001a\u0004\u0018\u00010\u00158VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lw52/e;", "Lw52/d;", "Lx52/a;", "stampDutyPaymentsWizardDataSource", "<init>", "(Lx52/a;)V", "Ly52/b;", "data", "Loq/i0;", i.f37089p, "(Ly52/b;)V", "T3", "Ly52/a;", "X7", "(Ly52/a;)V", "Ly52/d;", "L1", "(Ly52/d;)V", "", "J8", "()Ljava/lang/String;", "Ly52/g;", "S5", "(Ly52/g;)V", "a", "Lx52/a;", "X0", "()Ly52/a;", "commitmentTypeData", "i", "()Ly52/g;", "personalData", "Ls52/a;", "c", "()Ls52/a;", "summaryData", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f210469b = h00.a.f79185b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final x52.a stampDutyPaymentsWizardDataSource;

    public e(x52.a aVar) {
        this.stampDutyPaymentsWizardDataSource = aVar;
    }

    @Override // w52.b
    public void H2(StampDutyCommitmentVariantData data) {
        this.stampDutyPaymentsWizardDataSource.a(s2.f23303a, new StampDutyPaymentsCommitmentVariantResult(data));
    }

    @Override // w52.c
    public String J8() {
        String commitmentTypeCode;
        StampDutyCommitmentTypeData stampDutyCommitmentTypeDataX0 = X0();
        return (stampDutyCommitmentTypeDataX0 == null || (commitmentTypeCode = stampDutyCommitmentTypeDataX0.getCommitmentTypeCode()) == null) ? "" : commitmentTypeCode;
    }

    @Override // w52.c
    public void L1(StampDutyInstitutionsData data) {
        this.stampDutyPaymentsWizardDataSource.a(v2.f23327a, new StampDutyInstitutionResult(data));
    }

    @Override // w52.f
    public void S5(y52.g data) {
        this.stampDutyPaymentsWizardDataSource.a(y2.f23361a, new StampDutyPaymentsPersonalDataResult(data));
    }

    @Override // w52.a
    public void T3(StampDutyCommitmentVariantData data) {
        H2(data);
    }

    @Override // w52.a
    public StampDutyCommitmentTypeData X0() {
        return (StampDutyCommitmentTypeData) this.stampDutyPaymentsWizardDataSource.b(r2.f23298a);
    }

    @Override // w52.a
    public void X7(StampDutyCommitmentTypeData data) {
        this.stampDutyPaymentsWizardDataSource.a(r2.f23298a, new StampDutyPaymentsCommitmentTypeResult(data));
    }

    @Override // w52.g
    public StampDutyPaymentsSummaryData c() {
        return this.stampDutyPaymentsWizardDataSource.e();
    }

    @Override // w52.f
    public y52.g i() {
        return (y52.g) this.stampDutyPaymentsWizardDataSource.b(y2.f23361a);
    }
}
