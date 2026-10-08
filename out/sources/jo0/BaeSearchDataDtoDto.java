package jo0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jo0.p, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007R\"\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\f\u0010\u0017R\"\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u001c"}, d2 = {"Ljo0/p;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "fullName", "I", "getIndex", "index", "", "Ljo0/e;", "c", "Ljava/util/List;", "()Ljava/util/List;", "address", "Ljo0/c1;", "d", "officialIds", "electronicdeliveryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaeSearchDataDtoDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("fullName")
    private final String fullName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("index")
    private final int index;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("address")
    private final List<AddressDtoDto> address;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("officialIds")
    private final List<OfficialIdDto> officialIds;

    public final List<AddressDtoDto> a() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getFullName() {
        return this.fullName;
    }

    public final List<OfficialIdDto> c() {
        return this.officialIds;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaeSearchDataDtoDto)) {
            return false;
        }
        BaeSearchDataDtoDto baeSearchDataDtoDto = (BaeSearchDataDtoDto) other;
        return fr.t.c(this.fullName, baeSearchDataDtoDto.fullName) && this.index == baeSearchDataDtoDto.index && fr.t.c(this.address, baeSearchDataDtoDto.address) && fr.t.c(this.officialIds, baeSearchDataDtoDto.officialIds);
    }

    public int hashCode() {
        int iHashCode = ((this.fullName.hashCode() * 31) + Integer.hashCode(this.index)) * 31;
        List<AddressDtoDto> list = this.address;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<OfficialIdDto> list2 = this.officialIds;
        return iHashCode2 + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "BaeSearchDataDtoDto(fullName=" + this.fullName + ", index=" + this.index + ", address=" + this.address + ", officialIds=" + this.officialIds + ')';
    }
}
