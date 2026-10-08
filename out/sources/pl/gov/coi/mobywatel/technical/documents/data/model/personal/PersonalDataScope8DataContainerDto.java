package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.MobileIdCardContainerDto;
import pl.gov.coi.mobywatel.technical.documents.data.model.MobileIdCardPersonalDataContainerDto;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8DataContainerDto;", "", "mobileIdCard", "Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardContainerDto;", "personalData", "Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardPersonalDataContainerDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardContainerDto;Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardPersonalDataContainerDto;)V", "getMobileIdCard", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardContainerDto;", "getPersonalData", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardPersonalDataContainerDto;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope8DataContainerDto {

    @c("mobileIdCard")
    private final MobileIdCardContainerDto mobileIdCard;

    @c("personalData")
    private final MobileIdCardPersonalDataContainerDto personalData;

    public PersonalDataScope8DataContainerDto(MobileIdCardContainerDto mobileIdCardContainerDto, MobileIdCardPersonalDataContainerDto mobileIdCardPersonalDataContainerDto) {
        this.mobileIdCard = mobileIdCardContainerDto;
        this.personalData = mobileIdCardPersonalDataContainerDto;
    }

    public static /* synthetic */ PersonalDataScope8DataContainerDto copy$default(PersonalDataScope8DataContainerDto personalDataScope8DataContainerDto, MobileIdCardContainerDto mobileIdCardContainerDto, MobileIdCardPersonalDataContainerDto mobileIdCardPersonalDataContainerDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            mobileIdCardContainerDto = personalDataScope8DataContainerDto.mobileIdCard;
        }
        if ((i15 & 2) != 0) {
            mobileIdCardPersonalDataContainerDto = personalDataScope8DataContainerDto.personalData;
        }
        return personalDataScope8DataContainerDto.copy(mobileIdCardContainerDto, mobileIdCardPersonalDataContainerDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MobileIdCardContainerDto getMobileIdCard() {
        return this.mobileIdCard;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final MobileIdCardPersonalDataContainerDto getPersonalData() {
        return this.personalData;
    }

    public final PersonalDataScope8DataContainerDto copy(MobileIdCardContainerDto mobileIdCard, MobileIdCardPersonalDataContainerDto personalData) {
        return new PersonalDataScope8DataContainerDto(mobileIdCard, personalData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope8DataContainerDto)) {
            return false;
        }
        PersonalDataScope8DataContainerDto personalDataScope8DataContainerDto = (PersonalDataScope8DataContainerDto) other;
        return t.c(this.mobileIdCard, personalDataScope8DataContainerDto.mobileIdCard) && t.c(this.personalData, personalDataScope8DataContainerDto.personalData);
    }

    public final MobileIdCardContainerDto getMobileIdCard() {
        return this.mobileIdCard;
    }

    public final MobileIdCardPersonalDataContainerDto getPersonalData() {
        return this.personalData;
    }

    public int hashCode() {
        return (this.mobileIdCard.hashCode() * 31) + this.personalData.hashCode();
    }

    public String toString() {
        return "PersonalDataScope8DataContainerDto(mobileIdCard=" + this.mobileIdCard + ", personalData=" + this.personalData + ')';
    }
}
