package nj3;

import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj3.d, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lnj3/d;", "", "Ljava/time/LocalDate;", "date", "", "isValid", "<init>", "(Ljava/time/LocalDate;Z)V", "a", "(Ljava/time/LocalDate;Z)Lnj3/d;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/time/LocalDate;", "c", "()Ljava/time/LocalDate;", "b", "Z", "d", "()Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegistrationState {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate date;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    public RegistrationState(LocalDate localDate, boolean z15) {
        this.date = localDate;
        this.isValid = z15;
    }

    public static /* synthetic */ RegistrationState b(RegistrationState registrationState, LocalDate localDate, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            localDate = registrationState.date;
        }
        if ((i15 & 2) != 0) {
            z15 = registrationState.isValid;
        }
        return registrationState.a(localDate, z15);
    }

    public final RegistrationState a(LocalDate date, boolean isValid) {
        return new RegistrationState(date, isValid);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegistrationState)) {
            return false;
        }
        RegistrationState registrationState = (RegistrationState) other;
        return fr.t.c(this.date, registrationState.date) && this.isValid == registrationState.isValid;
    }

    public int hashCode() {
        LocalDate localDate = this.date;
        return ((localDate == null ? 0 : localDate.hashCode()) * 31) + Boolean.hashCode(this.isValid);
    }

    public String toString() {
        return "RegistrationState(date=" + this.date + ", isValid=" + this.isValid + ')';
    }

    public /* synthetic */ RegistrationState(LocalDate localDate, boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : localDate, (i15 & 2) != 0 ? true : z15);
    }
}
