package nj0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: nj0.j0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0010\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u000f\u0010\u0004R\u001a\u0010\u0015\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u0018"}, d2 = {"Lnj0/j0;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "commune", "b", "number", "Lnj0/f;", "c", "Lnj0/f;", "()Lnj0/f;", "okwAddress", "d", "okwName", "citizenservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegisteredAreaDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("commune")
    private final String commune;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("okwAddress")
    private final CitizenAddressDto okwAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("okwName")
    private final String okwName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getCommune() {
        return this.commune;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CitizenAddressDto getOkwAddress() {
        return this.okwAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOkwName() {
        return this.okwName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisteredAreaDto)) {
            return false;
        }
        RegisteredAreaDto registeredAreaDto = (RegisteredAreaDto) other;
        return fr.t.c(this.commune, registeredAreaDto.commune) && fr.t.c(this.number, registeredAreaDto.number) && fr.t.c(this.okwAddress, registeredAreaDto.okwAddress) && fr.t.c(this.okwName, registeredAreaDto.okwName);
    }

    public int hashCode() {
        return (((((this.commune.hashCode() * 31) + this.number.hashCode()) * 31) + this.okwAddress.hashCode()) * 31) + this.okwName.hashCode();
    }

    public String toString() {
        return "RegisteredAreaDto(commune=" + this.commune + ", number=" + this.number + ", okwAddress=" + this.okwAddress + ", okwName=" + this.okwName + ')';
    }
}
