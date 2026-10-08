package zi3;

import fr.k;
import fr.t;
import gx.b;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lzi3/a;", "Lgx/b;", "<init>", "()V", "a", "Lzi3/a$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a implements b {
    public /* synthetic */ a(k kVar) {
        this();
    }

    private a() {
    }

    /* JADX INFO: renamed from: zi3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lzi3/a$a;", "Lzi3/a;", "", "plate", "vin", "", "skipForm", "Ljava/time/LocalDate;", "firstRegistrationDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/time/LocalDate;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "d", "c", "Ljava/lang/Boolean;", "()Ljava/lang/Boolean;", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ToVehicleHistory extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String plate;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String vin;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Boolean skipForm;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate firstRegistrationDate;

        public ToVehicleHistory(String str, String str2, Boolean bool, LocalDate localDate) {
            super(null);
            this.plate = str;
            this.vin = str2;
            this.skipForm = bool;
            this.firstRegistrationDate = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final LocalDate getFirstRegistrationDate() {
            return this.firstRegistrationDate;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlate() {
            return this.plate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Boolean getSkipForm() {
            return this.skipForm;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getVin() {
            return this.vin;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ToVehicleHistory)) {
                return false;
            }
            ToVehicleHistory toVehicleHistory = (ToVehicleHistory) other;
            return t.c(this.plate, toVehicleHistory.plate) && t.c(this.vin, toVehicleHistory.vin) && t.c(this.skipForm, toVehicleHistory.skipForm) && t.c(this.firstRegistrationDate, toVehicleHistory.firstRegistrationDate);
        }

        public int hashCode() {
            String str = this.plate;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.vin;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.skipForm;
            int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
            LocalDate localDate = this.firstRegistrationDate;
            return iHashCode3 + (localDate != null ? localDate.hashCode() : 0);
        }

        public String toString() {
            return "ToVehicleHistory(plate=" + this.plate + ", vin=" + this.vin + ", skipForm=" + this.skipForm + ", firstRegistrationDate=" + this.firstRegistrationDate + ")";
        }

        public /* synthetic */ ToVehicleHistory(String str, String str2, Boolean bool, LocalDate localDate, int i15, k kVar) {
            this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : str2, (i15 & 4) != 0 ? null : bool, (i15 & 8) != 0 ? null : localDate);
        }
    }
}
