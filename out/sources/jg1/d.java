package jg1;

import fr.t;
import ld1.KnownUserDataModel;
import p071kotlin.Metadata;
import qf1.ResumptionDate;
import qf1.SuspensionPeriod;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Ljg1/d;", "", "Lld1/h;", "a", "()Lld1/h;", "knownUserDataModel", "b", "Ljg1/d$a;", "Ljg1/d$b;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d {

    /* JADX INFO: renamed from: jg1.d$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljg1/d$a;", "Ljg1/d;", "Lqf1/a;", "resumptionDate", "Lld1/h;", "knownUserDataModel", "<init>", "(Lqf1/a;Lld1/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqf1/a;", "b", "()Lqf1/a;", "Lld1/h;", "()Lld1/h;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Resumption implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ResumptionDate resumptionDate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final KnownUserDataModel knownUserDataModel;

        public Resumption(ResumptionDate resumptionDate, KnownUserDataModel knownUserDataModel) {
            this.resumptionDate = resumptionDate;
            this.knownUserDataModel = knownUserDataModel;
        }

        @Override // jg1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public KnownUserDataModel getKnownUserDataModel() {
            return this.knownUserDataModel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ResumptionDate getResumptionDate() {
            return this.resumptionDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Resumption)) {
                return false;
            }
            Resumption resumption = (Resumption) other;
            return t.c(this.resumptionDate, resumption.resumptionDate) && t.c(this.knownUserDataModel, resumption.knownUserDataModel);
        }

        public int hashCode() {
            return (this.resumptionDate.hashCode() * 31) + this.knownUserDataModel.hashCode();
        }

        public String toString() {
            return "Resumption(resumptionDate=" + this.resumptionDate + ", knownUserDataModel=" + this.knownUserDataModel + ')';
        }
    }

    /* JADX INFO: renamed from: jg1.d$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljg1/d$b;", "Ljg1/d;", "Lqf1/c;", "suspensionPeriod", "Lld1/h;", "knownUserDataModel", "<init>", "(Lqf1/c;Lld1/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lqf1/c;", "b", "()Lqf1/c;", "Lld1/h;", "()Lld1/h;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Suspension implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final SuspensionPeriod suspensionPeriod;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final KnownUserDataModel knownUserDataModel;

        public Suspension(SuspensionPeriod suspensionPeriod, KnownUserDataModel knownUserDataModel) {
            this.suspensionPeriod = suspensionPeriod;
            this.knownUserDataModel = knownUserDataModel;
        }

        @Override // jg1.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public KnownUserDataModel getKnownUserDataModel() {
            return this.knownUserDataModel;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final SuspensionPeriod getSuspensionPeriod() {
            return this.suspensionPeriod;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Suspension)) {
                return false;
            }
            Suspension suspension = (Suspension) other;
            return t.c(this.suspensionPeriod, suspension.suspensionPeriod) && t.c(this.knownUserDataModel, suspension.knownUserDataModel);
        }

        public int hashCode() {
            return (this.suspensionPeriod.hashCode() * 31) + this.knownUserDataModel.hashCode();
        }

        public String toString() {
            return "Suspension(suspensionPeriod=" + this.suspensionPeriod + ", knownUserDataModel=" + this.knownUserDataModel + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    KnownUserDataModel getKnownUserDataModel();
}
