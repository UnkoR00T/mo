package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDataDto;", "", "names", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDto;", "surname", "birthPlace", "<init>", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDto;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDto;)V", "getNames", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDataSplitDto;", "getSurname", "getBirthPlace", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationDataSplitDataDto {
    public static final int $stable = 0;

    @c("birthPlace")
    private final ChildPassportApplicationDataSplitDto birthPlace;

    @c("names")
    private final ChildPassportApplicationDataSplitDto names;

    @c("surname")
    private final ChildPassportApplicationDataSplitDto surname;

    public ChildPassportApplicationDataSplitDataDto(ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto, ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto2, ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto3) {
        this.names = childPassportApplicationDataSplitDto;
        this.surname = childPassportApplicationDataSplitDto2;
        this.birthPlace = childPassportApplicationDataSplitDto3;
    }

    public static /* synthetic */ ChildPassportApplicationDataSplitDataDto copy$default(ChildPassportApplicationDataSplitDataDto childPassportApplicationDataSplitDataDto, ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto, ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto2, ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            childPassportApplicationDataSplitDto = childPassportApplicationDataSplitDataDto.names;
        }
        if ((i15 & 2) != 0) {
            childPassportApplicationDataSplitDto2 = childPassportApplicationDataSplitDataDto.surname;
        }
        if ((i15 & 4) != 0) {
            childPassportApplicationDataSplitDto3 = childPassportApplicationDataSplitDataDto.birthPlace;
        }
        return childPassportApplicationDataSplitDataDto.copy(childPassportApplicationDataSplitDto, childPassportApplicationDataSplitDto2, childPassportApplicationDataSplitDto3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final ChildPassportApplicationDataSplitDto getNames() {
        return this.names;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ChildPassportApplicationDataSplitDto getSurname() {
        return this.surname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final ChildPassportApplicationDataSplitDto getBirthPlace() {
        return this.birthPlace;
    }

    public final ChildPassportApplicationDataSplitDataDto copy(ChildPassportApplicationDataSplitDto names, ChildPassportApplicationDataSplitDto surname, ChildPassportApplicationDataSplitDto birthPlace) {
        return new ChildPassportApplicationDataSplitDataDto(names, surname, birthPlace);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationDataSplitDataDto)) {
            return false;
        }
        ChildPassportApplicationDataSplitDataDto childPassportApplicationDataSplitDataDto = (ChildPassportApplicationDataSplitDataDto) other;
        return t.c(this.names, childPassportApplicationDataSplitDataDto.names) && t.c(this.surname, childPassportApplicationDataSplitDataDto.surname) && t.c(this.birthPlace, childPassportApplicationDataSplitDataDto.birthPlace);
    }

    public final ChildPassportApplicationDataSplitDto getBirthPlace() {
        return this.birthPlace;
    }

    public final ChildPassportApplicationDataSplitDto getNames() {
        return this.names;
    }

    public final ChildPassportApplicationDataSplitDto getSurname() {
        return this.surname;
    }

    public int hashCode() {
        ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto = this.names;
        int iHashCode = (childPassportApplicationDataSplitDto == null ? 0 : childPassportApplicationDataSplitDto.hashCode()) * 31;
        ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto2 = this.surname;
        int iHashCode2 = (iHashCode + (childPassportApplicationDataSplitDto2 == null ? 0 : childPassportApplicationDataSplitDto2.hashCode())) * 31;
        ChildPassportApplicationDataSplitDto childPassportApplicationDataSplitDto3 = this.birthPlace;
        return iHashCode2 + (childPassportApplicationDataSplitDto3 != null ? childPassportApplicationDataSplitDto3.hashCode() : 0);
    }

    public String toString() {
        return "ChildPassportApplicationDataSplitDataDto(names=" + this.names + ", surname=" + this.surname + ", birthPlace=" + this.birthPlace + ')';
    }
}
