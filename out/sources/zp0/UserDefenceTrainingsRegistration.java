package zp0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: zp0.d0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001eR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lzp0/d0;", "", "", "Lzp0/t;", "registrations", "", "registrationAvailable", "Lzp0/y;", "registrationDisabledReason", "Lzp0/c;", "availableTrainings", "<init>", "(Ljava/util/List;ZLzp0/y;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "c", "()Ljava/util/List;", "b", "Z", "()Z", "Lzp0/y;", "()Lzp0/y;", "d", "getAvailableTrainings", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDefenceTrainingsRegistration {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEUserDefenceTrainingRegistration> registrations;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean registrationAvailable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final y registrationDisabledReason;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BEDefenceTrainingType> availableTrainings;

    public UserDefenceTrainingsRegistration(List<BEUserDefenceTrainingRegistration> list, boolean z15, y yVar, List<BEDefenceTrainingType> list2) {
        this.registrations = list;
        this.registrationAvailable = z15;
        this.registrationDisabledReason = yVar;
        this.availableTrainings = list2;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getRegistrationAvailable() {
        return this.registrationAvailable;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final y getRegistrationDisabledReason() {
        return this.registrationDisabledReason;
    }

    public final List<BEUserDefenceTrainingRegistration> c() {
        return this.registrations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDefenceTrainingsRegistration)) {
            return false;
        }
        UserDefenceTrainingsRegistration userDefenceTrainingsRegistration = (UserDefenceTrainingsRegistration) other;
        return fr.t.c(this.registrations, userDefenceTrainingsRegistration.registrations) && this.registrationAvailable == userDefenceTrainingsRegistration.registrationAvailable && this.registrationDisabledReason == userDefenceTrainingsRegistration.registrationDisabledReason && fr.t.c(this.availableTrainings, userDefenceTrainingsRegistration.availableTrainings);
    }

    public int hashCode() {
        int iHashCode = ((this.registrations.hashCode() * 31) + Boolean.hashCode(this.registrationAvailable)) * 31;
        y yVar = this.registrationDisabledReason;
        return ((iHashCode + (yVar == null ? 0 : yVar.hashCode())) * 31) + this.availableTrainings.hashCode();
    }

    public String toString() {
        return "UserDefenceTrainingsRegistration(registrations=" + this.registrations + ", registrationAvailable=" + this.registrationAvailable + ", registrationDisabledReason=" + this.registrationDisabledReason + ", availableTrainings=" + this.availableTrainings + ")";
    }
}
