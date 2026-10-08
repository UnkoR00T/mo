package dq0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: dq0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0010R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Ldq0/l;", "", "", "email", "Ldq0/k;", "phoneNumber", "", "trainingId", "", "Ldq0/m;", "childRegistrations", "<init>", "(Ljava/lang/String;Ldq0/k;ILjava/util/List;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getEmail", "b", "Ldq0/k;", "getPhoneNumber", "()Ldq0/k;", "c", "I", "getTrainingId", "d", "Ljava/util/List;", "getChildRegistrations", "()Ljava/util/List;", "militaryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegisterForDefenceTrainingDataDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("email")
    private final String email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("phoneNumber")
    private final PhoneNumberDto phoneNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("trainingId")
    private final int trainingId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("childRegistrations")
    private final List<RegisterForDefenceTrainingDataRegisteredChildDto> childRegistrations;

    public RegisterForDefenceTrainingDataDto(String str, PhoneNumberDto phoneNumberDto, int i15, List<RegisterForDefenceTrainingDataRegisteredChildDto> list) {
        this.email = str;
        this.phoneNumber = phoneNumberDto;
        this.trainingId = i15;
        this.childRegistrations = list;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisterForDefenceTrainingDataDto)) {
            return false;
        }
        RegisterForDefenceTrainingDataDto registerForDefenceTrainingDataDto = (RegisterForDefenceTrainingDataDto) other;
        return fr.t.c(this.email, registerForDefenceTrainingDataDto.email) && fr.t.c(this.phoneNumber, registerForDefenceTrainingDataDto.phoneNumber) && this.trainingId == registerForDefenceTrainingDataDto.trainingId && fr.t.c(this.childRegistrations, registerForDefenceTrainingDataDto.childRegistrations);
    }

    public int hashCode() {
        int iHashCode = ((((this.email.hashCode() * 31) + this.phoneNumber.hashCode()) * 31) + Integer.hashCode(this.trainingId)) * 31;
        List<RegisterForDefenceTrainingDataRegisteredChildDto> list = this.childRegistrations;
        return iHashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "RegisterForDefenceTrainingDataDto(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ", trainingId=" + this.trainingId + ", childRegistrations=" + this.childRegistrations + ')';
    }
}
