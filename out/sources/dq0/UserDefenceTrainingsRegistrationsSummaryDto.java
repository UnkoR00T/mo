package dq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq0.r0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010R\u001a\u0010\u0015\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\f8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u000f\u001a\u0004\b\u0018\u0010\u0010R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001b\u001a\u0004\b\u0017\u0010\u001c¨\u0006\u001e"}, d2 = {"Ldq0/r0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "Ldq0/h;", "a", "Ljava/util/List;", "()Ljava/util/List;", "availableTrainings", "b", "Z", "()Z", "registrationAvailable", "Ldq0/p0;", "c", "d", "registrations", "Ldq0/f;", "Ldq0/f;", "()Ldq0/f;", "registrationDisabledReason", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserDefenceTrainingsRegistrationsSummaryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("availableTrainings")
    private final List<DefenceTrainingTypeDto> availableTrainings;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationAvailable")
    private final boolean registrationAvailable;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrations")
    private final List<UserDefenceTrainingRegistrationDto> registrations;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("registrationDisabledReason")
    private final f registrationDisabledReason;

    public final List<DefenceTrainingTypeDto> a() {
        return this.availableTrainings;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getRegistrationAvailable() {
        return this.registrationAvailable;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final f getRegistrationDisabledReason() {
        return this.registrationDisabledReason;
    }

    public final List<UserDefenceTrainingRegistrationDto> d() {
        return this.registrations;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserDefenceTrainingsRegistrationsSummaryDto)) {
            return false;
        }
        UserDefenceTrainingsRegistrationsSummaryDto userDefenceTrainingsRegistrationsSummaryDto = (UserDefenceTrainingsRegistrationsSummaryDto) other;
        return fr.t.c(this.availableTrainings, userDefenceTrainingsRegistrationsSummaryDto.availableTrainings) && this.registrationAvailable == userDefenceTrainingsRegistrationsSummaryDto.registrationAvailable && fr.t.c(this.registrations, userDefenceTrainingsRegistrationsSummaryDto.registrations) && this.registrationDisabledReason == userDefenceTrainingsRegistrationsSummaryDto.registrationDisabledReason;
    }

    public int hashCode() {
        int iHashCode = ((((this.availableTrainings.hashCode() * 31) + Boolean.hashCode(this.registrationAvailable)) * 31) + this.registrations.hashCode()) * 31;
        f fVar = this.registrationDisabledReason;
        return iHashCode + (fVar == null ? 0 : fVar.hashCode());
    }

    public String toString() {
        return "UserDefenceTrainingsRegistrationsSummaryDto(availableTrainings=" + this.availableTrainings + ", registrationAvailable=" + this.registrationAvailable + ", registrations=" + this.registrations + ", registrationDisabledReason=" + this.registrationDisabledReason + ')';
    }
}
