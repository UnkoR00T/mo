package gd1;

import fr.t;
import jd1.OpenCompanyWizardData;
import ld1.SummaryStatusEntryData;
import mx.Label;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lgd1/b;", "Lxw/f;", "Lgd1/b$a;", "Lld1/q;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "c", "(Lgd1/b$a;)Lld1/q;", "a", "Lmx/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements xw.f<Params, SummaryStatusEntryData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: gd1.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgd1/b$a;", "", "Ljd1/a;", "openCompanyWizardData", "Lld1/p;", "summaryStatus", "<init>", "(Ljd1/a;Lld1/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljd1/a;", "()Ljd1/a;", "b", "Lld1/p;", "()Lld1/p;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OpenCompanyWizardData openCompanyWizardData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ld1.p summaryStatus;

        public Params(OpenCompanyWizardData openCompanyWizardData, ld1.p pVar) {
            this.openCompanyWizardData = openCompanyWizardData;
            this.summaryStatus = pVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final OpenCompanyWizardData getOpenCompanyWizardData() {
            return this.openCompanyWizardData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ld1.p getSummaryStatus() {
            return this.summaryStatus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.openCompanyWizardData, params.openCompanyWizardData) && this.summaryStatus == params.summaryStatus;
        }

        public int hashCode() {
            return (this.openCompanyWizardData.hashCode() * 31) + this.summaryStatus.hashCode();
        }

        public String toString() {
            return "Params(openCompanyWizardData=" + this.openCompanyWizardData + ", summaryStatus=" + this.summaryStatus + ')';
        }
    }

    /* JADX INFO: renamed from: gd1.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class C1650b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71929a;

        static {
            int[] iArr = new int[ld1.p.values().length];
            try {
                iArr[ld1.p.SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ld1.p.FAILURE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f71929a = iArr;
        }
    }

    public b(mx.c cVar) {
        this.labelProvider = cVar;
    }

    @Override // er.l
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public SummaryStatusEntryData b(Params params) {
        Label labelC;
        ld1.o bullets;
        ld1.p summaryStatus = params.getSummaryStatus();
        ld1.l lVar = ld1.l.APPLICATION;
        ld1.p summaryStatus2 = params.getSummaryStatus();
        int[] iArr = C1650b.f71929a;
        int i15 = iArr[summaryStatus2.ordinal()];
        if (i15 == 1) {
            labelC = this.labelProvider.c(ha1.a.f82438k3);
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(ha1.a.O1);
        }
        int i16 = iArr[params.getSummaryStatus().ordinal()];
        if (i16 == 1) {
            Label labelC2 = this.labelProvider.c(ha1.a.f82414h3);
            Label labelC3 = this.labelProvider.c(ha1.a.f82454m3);
            if (params.getOpenCompanyWizardData().getKrusData() != null) {
                labelC3 = null;
            }
            Label labelC4 = this.labelProvider.c(ha1.a.f82422i3);
            if (params.getOpenCompanyWizardData().getKrusData() == null) {
                labelC4 = null;
            }
            bullets = new ld1.o.Bullets(v.s(labelC2, labelC3, labelC4, params.getOpenCompanyWizardData().getEdorAddressData().getCreatePublicAddressData() != null ? this.labelProvider.c(ha1.a.f82430j3) : null, this.labelProvider.c(ha1.a.f82446l3)));
        } else {
            if (i16 != 2) {
                throw new oq.p();
            }
            bullets = new ld1.o.Text(this.labelProvider.c(ha1.a.N1));
        }
        return new SummaryStatusEntryData(summaryStatus, lVar, labelC, bullets);
    }
}
