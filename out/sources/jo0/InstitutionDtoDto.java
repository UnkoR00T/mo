package jo0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.u0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Ljo0/u0;", "", "", "name", "Ljo0/t0;", "address", "<init>", "(Ljava/lang/String;Ljo0/t0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getName", "b", "Ljo0/t0;", "getAddress", "()Ljo0/t0;", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InstitutionDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("name")
    private final String name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final InstitutionAddressDtoDto address;

    public InstitutionDtoDto(String str, InstitutionAddressDtoDto institutionAddressDtoDto) {
        this.name = str;
        this.address = institutionAddressDtoDto;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InstitutionDtoDto)) {
            return false;
        }
        InstitutionDtoDto institutionDtoDto = (InstitutionDtoDto) other;
        return fr.t.c(this.name, institutionDtoDto.name) && fr.t.c(this.address, institutionDtoDto.address);
    }

    public int hashCode() {
        int iHashCode = this.name.hashCode() * 31;
        InstitutionAddressDtoDto institutionAddressDtoDto = this.address;
        return iHashCode + (institutionAddressDtoDto == null ? 0 : institutionAddressDtoDto.hashCode());
    }

    public String toString() {
        return "InstitutionDtoDto(name=" + this.name + ", address=" + this.address + ')';
    }
}
