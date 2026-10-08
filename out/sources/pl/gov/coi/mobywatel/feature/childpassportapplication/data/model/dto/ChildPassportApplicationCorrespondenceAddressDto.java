package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationCorrespondenceAddressDto;", "", "addressData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddressDataDto;", "address", "", "<init>", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddressDataDto;Ljava/lang/String;)V", "getAddressData", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationAddressDataDto;", "getAddress", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationCorrespondenceAddressDto {
    public static final int $stable = 0;

    @c("address")
    private final String address;

    @c("addressData")
    private final ChildPassportApplicationAddressDataDto addressData;

    /* JADX WARN: Multi-variable type inference failed */
    public ChildPassportApplicationCorrespondenceAddressDto() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ ChildPassportApplicationCorrespondenceAddressDto copy$default(ChildPassportApplicationCorrespondenceAddressDto childPassportApplicationCorrespondenceAddressDto, ChildPassportApplicationAddressDataDto childPassportApplicationAddressDataDto, String str, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            childPassportApplicationAddressDataDto = childPassportApplicationCorrespondenceAddressDto.addressData;
        }
        if ((i15 & 2) != 0) {
            str = childPassportApplicationCorrespondenceAddressDto.address;
        }
        return childPassportApplicationCorrespondenceAddressDto.copy(childPassportApplicationAddressDataDto, str);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChildPassportApplicationAddressDataDto getAddressData() {
        return this.addressData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    public final ChildPassportApplicationCorrespondenceAddressDto copy(ChildPassportApplicationAddressDataDto addressData, String address) {
        return new ChildPassportApplicationCorrespondenceAddressDto(addressData, address);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationCorrespondenceAddressDto)) {
            return false;
        }
        ChildPassportApplicationCorrespondenceAddressDto childPassportApplicationCorrespondenceAddressDto = (ChildPassportApplicationCorrespondenceAddressDto) other;
        return t.c(this.addressData, childPassportApplicationCorrespondenceAddressDto.addressData) && t.c(this.address, childPassportApplicationCorrespondenceAddressDto.address);
    }

    public final String getAddress() {
        return this.address;
    }

    public final ChildPassportApplicationAddressDataDto getAddressData() {
        return this.addressData;
    }

    public int hashCode() {
        ChildPassportApplicationAddressDataDto childPassportApplicationAddressDataDto = this.addressData;
        int iHashCode = (childPassportApplicationAddressDataDto == null ? 0 : childPassportApplicationAddressDataDto.hashCode()) * 31;
        String str = this.address;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "ChildPassportApplicationCorrespondenceAddressDto(addressData=" + this.addressData + ", address=" + this.address + ')';
    }

    public ChildPassportApplicationCorrespondenceAddressDto(ChildPassportApplicationAddressDataDto childPassportApplicationAddressDataDto, String str) {
        this.addressData = childPassportApplicationAddressDataDto;
        this.address = str;
    }

    public /* synthetic */ ChildPassportApplicationCorrespondenceAddressDto(ChildPassportApplicationAddressDataDto childPassportApplicationAddressDataDto, String str, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : childPassportApplicationAddressDataDto, (i15 & 2) != 0 ? null : str);
    }
}
