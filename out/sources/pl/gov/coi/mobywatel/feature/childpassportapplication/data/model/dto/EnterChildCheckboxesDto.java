package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/EnterChildCheckboxesDto;", "", "noNameSwitchChecked", "", "noLastNameSwitchChecked", "citizenshipCheckBoxChecked", "<init>", "(ZZZ)V", "getNoNameSwitchChecked", "()Z", "getNoLastNameSwitchChecked", "getCitizenshipCheckBoxChecked", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EnterChildCheckboxesDto {
    public static final int $stable = 0;

    @c("citizenshipCheckBoxChecked")
    private final boolean citizenshipCheckBoxChecked;

    @c("noLastNameSwitchChecked")
    private final boolean noLastNameSwitchChecked;

    @c("noNameSwitchChecked")
    private final boolean noNameSwitchChecked;

    public EnterChildCheckboxesDto(boolean z15, boolean z16, boolean z17) {
        this.noNameSwitchChecked = z15;
        this.noLastNameSwitchChecked = z16;
        this.citizenshipCheckBoxChecked = z17;
    }

    public static /* synthetic */ EnterChildCheckboxesDto copy$default(EnterChildCheckboxesDto enterChildCheckboxesDto, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = enterChildCheckboxesDto.noNameSwitchChecked;
        }
        if ((i15 & 2) != 0) {
            z16 = enterChildCheckboxesDto.noLastNameSwitchChecked;
        }
        if ((i15 & 4) != 0) {
            z17 = enterChildCheckboxesDto.citizenshipCheckBoxChecked;
        }
        return enterChildCheckboxesDto.copy(z15, z16, z17);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getNoNameSwitchChecked() {
        return this.noNameSwitchChecked;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getNoLastNameSwitchChecked() {
        return this.noLastNameSwitchChecked;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getCitizenshipCheckBoxChecked() {
        return this.citizenshipCheckBoxChecked;
    }

    public final EnterChildCheckboxesDto copy(boolean noNameSwitchChecked, boolean noLastNameSwitchChecked, boolean citizenshipCheckBoxChecked) {
        return new EnterChildCheckboxesDto(noNameSwitchChecked, noLastNameSwitchChecked, citizenshipCheckBoxChecked);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EnterChildCheckboxesDto)) {
            return false;
        }
        EnterChildCheckboxesDto enterChildCheckboxesDto = (EnterChildCheckboxesDto) other;
        return this.noNameSwitchChecked == enterChildCheckboxesDto.noNameSwitchChecked && this.noLastNameSwitchChecked == enterChildCheckboxesDto.noLastNameSwitchChecked && this.citizenshipCheckBoxChecked == enterChildCheckboxesDto.citizenshipCheckBoxChecked;
    }

    public final boolean getCitizenshipCheckBoxChecked() {
        return this.citizenshipCheckBoxChecked;
    }

    public final boolean getNoLastNameSwitchChecked() {
        return this.noLastNameSwitchChecked;
    }

    public final boolean getNoNameSwitchChecked() {
        return this.noNameSwitchChecked;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.noNameSwitchChecked) * 31) + Boolean.hashCode(this.noLastNameSwitchChecked)) * 31) + Boolean.hashCode(this.citizenshipCheckBoxChecked);
    }

    public String toString() {
        return "EnterChildCheckboxesDto(noNameSwitchChecked=" + this.noNameSwitchChecked + ", noLastNameSwitchChecked=" + this.noLastNameSwitchChecked + ", citizenshipCheckBoxChecked=" + this.citizenshipCheckBoxChecked + ')';
    }
}
