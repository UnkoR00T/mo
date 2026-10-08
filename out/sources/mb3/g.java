package mb3;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import y93.TripDetailsEditableData;
import z93.TravelPersonalData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lmb3/g;", "", "Lz93/p;", "i", "()Lz93/p;", "personalData", "b", "a", "Lmb3/g$a;", "Lmb3/g$b;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: mb3.g$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lmb3/g$a;", "Lmb3/g;", "Ly93/a;", "editData", "<init>", "(Ly93/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly93/a;", "()Ly93/a;", "Lz93/p;", "i", "()Lz93/p;", "personalData", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ExistingTrip implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TripDetailsEditableData editData;

        public ExistingTrip(TripDetailsEditableData tripDetailsEditableData) {
            this.editData = tripDetailsEditableData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final TripDetailsEditableData getEditData() {
            return this.editData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ExistingTrip) && t.c(this.editData, ((ExistingTrip) other).editData);
        }

        public int hashCode() {
            return this.editData.hashCode();
        }

        @Override // mb3.g
        /* JADX INFO: renamed from: i */
        public TravelPersonalData getPersonalData() {
            return this.editData.getPersonalData();
        }

        public String toString() {
            return "ExistingTrip(editData=" + this.editData + ')';
        }
    }

    /* JADX INFO: renamed from: mb3.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lmb3/g$b;", "Lmb3/g;", "Lz93/p;", "personalData", "<init>", "(Lz93/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz93/p;", "i", "()Lz93/p;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class NewTrip implements g {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f125278b = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final TravelPersonalData personalData;

        public NewTrip(TravelPersonalData travelPersonalData) {
            this.personalData = travelPersonalData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof NewTrip) && t.c(this.personalData, ((NewTrip) other).personalData);
        }

        public int hashCode() {
            return this.personalData.hashCode();
        }

        @Override // mb3.g
        /* JADX INFO: renamed from: i, reason: from getter */
        public TravelPersonalData getPersonalData() {
            return this.personalData;
        }

        public String toString() {
            return "NewTrip(personalData=" + this.personalData + ')';
        }
    }

    /* JADX INFO: renamed from: i */
    TravelPersonalData getPersonalData();
}
