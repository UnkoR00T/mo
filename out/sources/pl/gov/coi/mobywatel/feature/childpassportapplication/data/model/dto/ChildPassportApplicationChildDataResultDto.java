package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationChildDataResultDto;", "", "childData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationGetChildDataDto;", "birthPlaceInput", "", "citizenshipCheckBoxChecked", "", "<init>", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationGetChildDataDto;Ljava/lang/String;Z)V", "getChildData", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationGetChildDataDto;", "getBirthPlaceInput", "()Ljava/lang/String;", "getCitizenshipCheckBoxChecked", "()Z", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationChildDataResultDto {
    public static final int $stable = 8;

    @c("birthPlaceInput")
    private final String birthPlaceInput;

    @c("childData")
    private final PassportChildApplicationGetChildDataDto childData;

    @c("citizenshipCheckBoxChecked")
    private final boolean citizenshipCheckBoxChecked;

    public ChildPassportApplicationChildDataResultDto(PassportChildApplicationGetChildDataDto passportChildApplicationGetChildDataDto, String str, boolean z15) {
        this.childData = passportChildApplicationGetChildDataDto;
        this.birthPlaceInput = str;
        this.citizenshipCheckBoxChecked = z15;
    }

    public static /* synthetic */ ChildPassportApplicationChildDataResultDto copy$default(ChildPassportApplicationChildDataResultDto childPassportApplicationChildDataResultDto, PassportChildApplicationGetChildDataDto passportChildApplicationGetChildDataDto, String str, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            passportChildApplicationGetChildDataDto = childPassportApplicationChildDataResultDto.childData;
        }
        if ((i15 & 2) != 0) {
            str = childPassportApplicationChildDataResultDto.birthPlaceInput;
        }
        if ((i15 & 4) != 0) {
            z15 = childPassportApplicationChildDataResultDto.citizenshipCheckBoxChecked;
        }
        return childPassportApplicationChildDataResultDto.copy(passportChildApplicationGetChildDataDto, str, z15);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PassportChildApplicationGetChildDataDto getChildData() {
        return this.childData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBirthPlaceInput() {
        return this.birthPlaceInput;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCitizenshipCheckBoxChecked() {
        return this.citizenshipCheckBoxChecked;
    }

    public final ChildPassportApplicationChildDataResultDto copy(PassportChildApplicationGetChildDataDto childData, String birthPlaceInput, boolean citizenshipCheckBoxChecked) {
        return new ChildPassportApplicationChildDataResultDto(childData, birthPlaceInput, citizenshipCheckBoxChecked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationChildDataResultDto)) {
            return false;
        }
        ChildPassportApplicationChildDataResultDto childPassportApplicationChildDataResultDto = (ChildPassportApplicationChildDataResultDto) other;
        return t.c(this.childData, childPassportApplicationChildDataResultDto.childData) && t.c(this.birthPlaceInput, childPassportApplicationChildDataResultDto.birthPlaceInput) && this.citizenshipCheckBoxChecked == childPassportApplicationChildDataResultDto.citizenshipCheckBoxChecked;
    }

    public final String getBirthPlaceInput() {
        return this.birthPlaceInput;
    }

    public final PassportChildApplicationGetChildDataDto getChildData() {
        return this.childData;
    }

    public final boolean getCitizenshipCheckBoxChecked() {
        return this.citizenshipCheckBoxChecked;
    }

    public int hashCode() {
        PassportChildApplicationGetChildDataDto passportChildApplicationGetChildDataDto = this.childData;
        int iHashCode = (passportChildApplicationGetChildDataDto == null ? 0 : passportChildApplicationGetChildDataDto.hashCode()) * 31;
        String str = this.birthPlaceInput;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Boolean.hashCode(this.citizenshipCheckBoxChecked);
    }

    public String toString() {
        return "ChildPassportApplicationChildDataResultDto(childData=" + this.childData + ", birthPlaceInput=" + this.birthPlaceInput + ", citizenshipCheckBoxChecked=" + this.citizenshipCheckBoxChecked + ')';
    }
}
