package ka3;

import p071kotlin.Metadata;
import y93.TripDetailsEditableData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lka3/h;", "", "b", "a", "Lka3/h$a;", "Lka3/h$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h {

    /* JADX INFO: renamed from: ka3.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lka3/h$b;", "Lka3/h;", "Lma3/a;", "contract", "<init>", "(Lma3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lma3/a;", "()Lma3/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Summary implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ma3.a contract;

        public Summary(ma3.a aVar) {
            this.contract = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ma3.a getContract() {
            return this.contract;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Summary) && fr.t.c(this.contract, ((Summary) other).contract);
        }

        public int hashCode() {
            return this.contract.hashCode();
        }

        public String toString() {
            return "Summary(contract=" + this.contract + ')';
        }
    }

    /* JADX INFO: renamed from: ka3.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lka3/h$a;", "Lka3/h;", "Ly93/a;", "detailsData", "", "isAfterUpdate", "<init>", "(Ly93/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ly93/a;", "()Ly93/a;", "b", "Z", "()Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Details implements h {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TripDetailsEditableData detailsData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAfterUpdate;

        public Details(TripDetailsEditableData tripDetailsEditableData, boolean z15) {
            this.detailsData = tripDetailsEditableData;
            this.isAfterUpdate = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TripDetailsEditableData getDetailsData() {
            return this.detailsData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getIsAfterUpdate() {
            return this.isAfterUpdate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Details)) {
                return false;
            }
            Details details = (Details) other;
            return fr.t.c(this.detailsData, details.detailsData) && this.isAfterUpdate == details.isAfterUpdate;
        }

        public int hashCode() {
            return (this.detailsData.hashCode() * 31) + Boolean.hashCode(this.isAfterUpdate);
        }

        public String toString() {
            return "Details(detailsData=" + this.detailsData + ", isAfterUpdate=" + this.isAfterUpdate + ')';
        }

        public /* synthetic */ Details(TripDetailsEditableData tripDetailsEditableData, boolean z15, int i15, fr.k kVar) {
            this(tripDetailsEditableData, (i15 & 2) != 0 ? false : z15);
        }
    }
}
