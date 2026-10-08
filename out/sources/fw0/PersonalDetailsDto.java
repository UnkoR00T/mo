package fw0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fw0.g1, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\r\u001a\u0004\b\u0011\u0010\u0004¨\u0006\u0013"}, d2 = {"Lfw0/g1;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "lastname", "b", "names", "c", "pesel", "vehicleservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDetailsDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("lastname")
    private final String lastname;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("names")
    private final String names;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getLastname() {
        return this.lastname;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNames() {
        return this.names;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPesel() {
        return this.pesel;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDetailsDto)) {
            return false;
        }
        PersonalDetailsDto personalDetailsDto = (PersonalDetailsDto) other;
        return fr.t.c(this.lastname, personalDetailsDto.lastname) && fr.t.c(this.names, personalDetailsDto.names) && fr.t.c(this.pesel, personalDetailsDto.pesel);
    }

    public int hashCode() {
        return (((this.lastname.hashCode() * 31) + this.names.hashCode()) * 31) + this.pesel.hashCode();
    }

    public String toString() {
        return "PersonalDetailsDto(lastname=" + this.lastname + ", names=" + this.names + ", pesel=" + this.pesel + ')';
    }
}
