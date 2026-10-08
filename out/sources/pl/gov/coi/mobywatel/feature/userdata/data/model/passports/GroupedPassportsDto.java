package pl.gov.coi.mobywatel.feature.userdata.data.model.passports;

import androidx.annotation.Keep;
import fr.t;
import java.util.List;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes9.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/GroupedPassportsDto;", "", "validPassports", "", "Lpl/gov/coi/mobywatel/feature/userdata/data/model/passports/PassportVisualizationDto;", "revokedPassports", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getValidPassports", "()Ljava/util/List;", "getRevokedPassports", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "userdata_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GroupedPassportsDto {
    public static final int $stable = 8;

    @c("revokedPassports")
    private final List<PassportVisualizationDto> revokedPassports;

    @c("validPassports")
    private final List<PassportVisualizationDto> validPassports;

    public GroupedPassportsDto(List<PassportVisualizationDto> list, List<PassportVisualizationDto> list2) {
        this.validPassports = list;
        this.revokedPassports = list2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupedPassportsDto copy$default(GroupedPassportsDto groupedPassportsDto, List list, List list2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            list = groupedPassportsDto.validPassports;
        }
        if ((i15 & 2) != 0) {
            list2 = groupedPassportsDto.revokedPassports;
        }
        return groupedPassportsDto.copy(list, list2);
    }

    public final List<PassportVisualizationDto> component1() {
        return this.validPassports;
    }

    public final List<PassportVisualizationDto> component2() {
        return this.revokedPassports;
    }

    public final GroupedPassportsDto copy(List<PassportVisualizationDto> validPassports, List<PassportVisualizationDto> revokedPassports) {
        return new GroupedPassportsDto(validPassports, revokedPassports);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GroupedPassportsDto)) {
            return false;
        }
        GroupedPassportsDto groupedPassportsDto = (GroupedPassportsDto) other;
        return t.c(this.validPassports, groupedPassportsDto.validPassports) && t.c(this.revokedPassports, groupedPassportsDto.revokedPassports);
    }

    public final List<PassportVisualizationDto> getRevokedPassports() {
        return this.revokedPassports;
    }

    public final List<PassportVisualizationDto> getValidPassports() {
        return this.validPassports;
    }

    public int hashCode() {
        return (this.validPassports.hashCode() * 31) + this.revokedPassports.hashCode();
    }

    public String toString() {
        return "GroupedPassportsDto(validPassports=" + this.validPassports + ", revokedPassports=" + this.revokedPassports + ')';
    }
}
