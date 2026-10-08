package mr2;

import al0.InvalidatedPassportResponse;
import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0002\n\u000bJ\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\t¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lmr2/a;", "", "Lmr2/a$b;", "c", "()Lmr2/a$b;", "Lmr2/a$a;", "invalidateData", "Loq/i0;", "t6", "(Lmr2/a$a;)V", "a", "b", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: mr2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Lmr2/a$a;", "", "Lal0/h0;", "invalidatedPassportResponse", "<init>", "(Lal0/h0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/h0;", "()Lal0/h0;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class InvalidateData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final InvalidatedPassportResponse invalidatedPassportResponse;

        public InvalidateData(InvalidatedPassportResponse invalidatedPassportResponse) {
            this.invalidatedPassportResponse = invalidatedPassportResponse;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final InvalidatedPassportResponse getInvalidatedPassportResponse() {
            return this.invalidatedPassportResponse;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof InvalidateData) && t.c(this.invalidatedPassportResponse, ((InvalidateData) other).invalidatedPassportResponse);
        }

        public int hashCode() {
            return this.invalidatedPassportResponse.hashCode();
        }

        public String toString() {
            return "InvalidateData(invalidatedPassportResponse=" + this.invalidatedPassportResponse + ')';
        }
    }

    /* JADX INFO: renamed from: mr2.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmr2/a$b;", "", "Ldr2/a$a;", "choosePassportData", "Lgr2/a$a;", "chooseReasonData", "<init>", "(Ldr2/a$a;Lgr2/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldr2/a$a;", "()Ldr2/a$a;", "b", "Lgr2/a$a;", "()Lgr2/a$a;", "passportinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SummaryData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final dr2.a.Data choosePassportData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final gr2.a.Data chooseReasonData;

        public SummaryData(dr2.a.Data c0996a, gr2.a.Data data) {
            this.choosePassportData = c0996a;
            this.chooseReasonData = data;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final dr2.a.Data getChoosePassportData() {
            return this.choosePassportData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final gr2.a.Data getChooseReasonData() {
            return this.chooseReasonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SummaryData)) {
                return false;
            }
            SummaryData summaryData = (SummaryData) other;
            return t.c(this.choosePassportData, summaryData.choosePassportData) && t.c(this.chooseReasonData, summaryData.chooseReasonData);
        }

        public int hashCode() {
            return (this.choosePassportData.hashCode() * 31) + this.chooseReasonData.hashCode();
        }

        public String toString() {
            return "SummaryData(choosePassportData=" + this.choosePassportData + ", chooseReasonData=" + this.chooseReasonData + ')';
        }
    }

    SummaryData c();

    void t6(InvalidateData invalidateData);
}
