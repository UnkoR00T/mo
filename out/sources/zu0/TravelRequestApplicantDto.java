package zu0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: zu0.w, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0003\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lzu0/w;", "", "", "isParticipant", "", "email", "Lzu0/l;", "phone", "<init>", "(ZLjava/lang/String;Lzu0/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "getEmail", "c", "Lzu0/l;", "getPhone", "()Lzu0/l;", "travelabroadservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TravelRequestApplicantDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("isParticipant")
    private final boolean isParticipant;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("phone")
    private final PhoneContactDetailsDto phone;

    public TravelRequestApplicantDto(boolean z15, String str, PhoneContactDetailsDto phoneContactDetailsDto) {
        this.isParticipant = z15;
        this.email = str;
        this.phone = phoneContactDetailsDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TravelRequestApplicantDto)) {
            return false;
        }
        TravelRequestApplicantDto travelRequestApplicantDto = (TravelRequestApplicantDto) other;
        return this.isParticipant == travelRequestApplicantDto.isParticipant && fr.t.c(this.email, travelRequestApplicantDto.email) && fr.t.c(this.phone, travelRequestApplicantDto.phone);
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.isParticipant) * 31;
        String str = this.email;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        PhoneContactDetailsDto phoneContactDetailsDto = this.phone;
        return iHashCode2 + (phoneContactDetailsDto != null ? phoneContactDetailsDto.hashCode() : 0);
    }

    public String toString() {
        return "TravelRequestApplicantDto(isParticipant=" + this.isParticipant + ", email=" + this.email + ", phone=" + this.phone + ')';
    }
}
