package gg1;

import fr.t;
import ld1.SummaryStatusEntryData;
import ld1.o;
import ld1.p;
import mx.Label;
import p071kotlin.Metadata;
import qg1.CompanySuspensionWizardData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgg1/c;", "Lxw/f;", "Lgg1/c$a;", "Lld1/q;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgg1/c$a;)Lld1/q;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements xw.f<Params, SummaryStatusEntryData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gg1.c$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgg1/c$a;", "", "Lqg1/a;", "companySuspensionWizardData", "Lld1/p;", "summaryStatus", "Lqf1/b;", "suspensionFailureErrorType", "<init>", "(Lqg1/a;Lld1/p;Lqf1/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqg1/a;", "()Lqg1/a;", "b", "Lld1/p;", "()Lld1/p;", "c", "Lqf1/b;", "()Lqf1/b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CompanySuspensionWizardData companySuspensionWizardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p summaryStatus;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final qf1.b suspensionFailureErrorType;

        public Params(CompanySuspensionWizardData companySuspensionWizardData, p pVar, qf1.b bVar) {
            this.companySuspensionWizardData = companySuspensionWizardData;
            this.summaryStatus = pVar;
            this.suspensionFailureErrorType = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CompanySuspensionWizardData getCompanySuspensionWizardData() {
            return this.companySuspensionWizardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final p getSummaryStatus() {
            return this.summaryStatus;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final qf1.b getSuspensionFailureErrorType() {
            return this.suspensionFailureErrorType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.companySuspensionWizardData, params.companySuspensionWizardData) && this.summaryStatus == params.summaryStatus && this.suspensionFailureErrorType == params.suspensionFailureErrorType;
        }

        public int hashCode() {
            int iHashCode = ((this.companySuspensionWizardData.hashCode() * 31) + this.summaryStatus.hashCode()) * 31;
            qf1.b bVar = this.suspensionFailureErrorType;
            return iHashCode + (bVar == null ? 0 : bVar.hashCode());
        }

        public String toString() {
            return "Params(companySuspensionWizardData=" + this.companySuspensionWizardData + ", summaryStatus=" + this.summaryStatus + ", suspensionFailureErrorType=" + this.suspensionFailureErrorType + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72854a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f72855b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f72856c;

        static {
            int[] iArr = new int[ma1.l.values().length];
            try {
                iArr[ma1.l.SUSPEND_COMPANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ma1.l.RESUME_COMPANY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72854a = iArr;
            int[] iArr2 = new int[qf1.b.values().length];
            try {
                iArr2[qf1.b.SIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            f72855b = iArr2;
            int[] iArr3 = new int[p.values().length];
            try {
                iArr3[p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr3[p.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            f72856c = iArr3;
        }
    }

    public c(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SummaryStatusEntryData b(Params params) {
        int i15;
        Label labelC;
        int i16;
        o.Text text;
        p summaryStatus = params.getSummaryStatus();
        ld1.l lVar = ld1.l.MANAGEMENT;
        p summaryStatus2 = params.getSummaryStatus();
        int[] iArr = b.f72856c;
        int i17 = iArr[summaryStatus2.ordinal()];
        if (i17 == 1) {
            mx.c cVar = this.labelProvider;
            int i18 = b.f72854a[params.getCompanySuspensionWizardData().getCompanyManagementEntryPointContractData().getEntryPoint().ordinal()];
            if (i18 == 1) {
                i15 = ha1.a.f82406g3;
            } else {
                if (i18 != 2) {
                    throw new oq.p();
                }
                i15 = ha1.a.f82392e5;
            }
            labelC = cVar.c(i15);
        } else {
            if (i17 != 2) {
                throw new oq.p();
            }
            mx.c cVar2 = this.labelProvider;
            qf1.b suspensionFailureErrorType = params.getSuspensionFailureErrorType();
            labelC = cVar2.c((suspensionFailureErrorType == null ? -1 : b.f72855b[suspensionFailureErrorType.ordinal()]) == 1 ? ha1.a.Y5 : ha1.a.O1);
        }
        int i19 = iArr[params.getSummaryStatus().ordinal()];
        if (i19 == 1) {
            mx.c cVar3 = this.labelProvider;
            int i25 = b.f72854a[params.getCompanySuspensionWizardData().getCompanyManagementEntryPointContractData().getEntryPoint().ordinal()];
            if (i25 == 1) {
                i16 = ha1.a.f82398f3;
            } else {
                if (i25 != 2) {
                    throw new oq.p();
                }
                i16 = ha1.a.f82384d5;
            }
            text = new o.Text(cVar3.c(i16));
        } else {
            if (i19 != 2) {
                throw new oq.p();
            }
            text = new o.Text(this.labelProvider.c(ha1.a.N1));
        }
        return new SummaryStatusEntryData(summaryStatus, lVar, labelC, text);
    }
}
