package k42;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;
import x40.LinkData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lk42/a;", "", "a", "b", "Lk42/a$a;", "Lk42/a$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: k42.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lk42/a$a;", "Lk42/a;", "Lmx/a;", "noPaymentsLabel", "Lx40/a;", "govSiteLinkData", "<init>", "(Lmx/a;Lx40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Lx40/a;", "()Lx40/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NoPayments implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f108388c = LinkData.f216731g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label noPaymentsLabel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final LinkData govSiteLinkData;

        public NoPayments(Label label, LinkData linkData) {
            this.noPaymentsLabel = label;
            this.govSiteLinkData = linkData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LinkData getGovSiteLinkData() {
            return this.govSiteLinkData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getNoPaymentsLabel() {
            return this.noPaymentsLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof NoPayments)) {
                return false;
            }
            NoPayments noPayments = (NoPayments) other;
            return t.c(this.noPaymentsLabel, noPayments.noPaymentsLabel) && t.c(this.govSiteLinkData, noPayments.govSiteLinkData);
        }

        public int hashCode() {
            return (this.noPaymentsLabel.hashCode() * 31) + this.govSiteLinkData.hashCode();
        }

        public String toString() {
            return "NoPayments(noPaymentsLabel=" + this.noPaymentsLabel + ", govSiteLinkData=" + this.govSiteLinkData + ')';
        }
    }

    /* JADX INFO: renamed from: k42.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lk42/a$b;", "Lk42/a;", "Lmx/a;", "noPendingPaymentsLabel", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class WithPayments implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label noPendingPaymentsLabel;

        public WithPayments(Label label) {
            this.noPendingPaymentsLabel = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getNoPendingPaymentsLabel() {
            return this.noPendingPaymentsLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof WithPayments) && t.c(this.noPendingPaymentsLabel, ((WithPayments) other).noPendingPaymentsLabel);
        }

        public int hashCode() {
            return this.noPendingPaymentsLabel.hashCode();
        }

        public String toString() {
            return "WithPayments(noPendingPaymentsLabel=" + this.noPendingPaymentsLabel + ')';
        }
    }
}
