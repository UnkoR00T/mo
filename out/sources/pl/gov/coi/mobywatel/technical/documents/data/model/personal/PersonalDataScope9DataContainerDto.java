package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.MobileIdCardContainerDto;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope9DataContainerDto;", "", "mobileIdCard", "Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardContainerDto;", "personalData", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto;", "personalIdCard", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardContainerDto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto;)V", "getMobileIdCard", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdCardContainerDto;", "getPersonalData", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataContainerDto;", "getPersonalIdCard", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalIdCardContainerDto;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope9DataContainerDto {

    @c("mobileIdCard")
    private final MobileIdCardContainerDto mobileIdCard;

    @c("personalData")
    private final PersonalDataContainerDto personalData;

    @c("personalIdCard")
    private final PersonalIdCardContainerDto personalIdCard;

    public PersonalDataScope9DataContainerDto(MobileIdCardContainerDto mobileIdCardContainerDto, PersonalDataContainerDto personalDataContainerDto, PersonalIdCardContainerDto personalIdCardContainerDto) {
        this.mobileIdCard = mobileIdCardContainerDto;
        this.personalData = personalDataContainerDto;
        this.personalIdCard = personalIdCardContainerDto;
    }

    public static /* synthetic */ PersonalDataScope9DataContainerDto copy$default(PersonalDataScope9DataContainerDto personalDataScope9DataContainerDto, MobileIdCardContainerDto mobileIdCardContainerDto, PersonalDataContainerDto personalDataContainerDto, PersonalIdCardContainerDto personalIdCardContainerDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            mobileIdCardContainerDto = personalDataScope9DataContainerDto.mobileIdCard;
        }
        if ((i15 & 2) != 0) {
            personalDataContainerDto = personalDataScope9DataContainerDto.personalData;
        }
        if ((i15 & 4) != 0) {
            personalIdCardContainerDto = personalDataScope9DataContainerDto.personalIdCard;
        }
        return personalDataScope9DataContainerDto.copy(mobileIdCardContainerDto, personalDataContainerDto, personalIdCardContainerDto);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final MobileIdCardContainerDto getMobileIdCard() {
        return this.mobileIdCard;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PersonalDataContainerDto getPersonalData() {
        return this.personalData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PersonalIdCardContainerDto getPersonalIdCard() {
        return this.personalIdCard;
    }

    public final PersonalDataScope9DataContainerDto copy(MobileIdCardContainerDto mobileIdCard, PersonalDataContainerDto personalData, PersonalIdCardContainerDto personalIdCard) {
        return new PersonalDataScope9DataContainerDto(mobileIdCard, personalData, personalIdCard);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope9DataContainerDto)) {
            return false;
        }
        PersonalDataScope9DataContainerDto personalDataScope9DataContainerDto = (PersonalDataScope9DataContainerDto) other;
        return t.c(this.mobileIdCard, personalDataScope9DataContainerDto.mobileIdCard) && t.c(this.personalData, personalDataScope9DataContainerDto.personalData) && t.c(this.personalIdCard, personalDataScope9DataContainerDto.personalIdCard);
    }

    public final MobileIdCardContainerDto getMobileIdCard() {
        return this.mobileIdCard;
    }

    public final PersonalDataContainerDto getPersonalData() {
        return this.personalData;
    }

    public final PersonalIdCardContainerDto getPersonalIdCard() {
        return this.personalIdCard;
    }

    public int hashCode() {
        return (((this.mobileIdCard.hashCode() * 31) + this.personalData.hashCode()) * 31) + this.personalIdCard.hashCode();
    }

    public String toString() {
        return "PersonalDataScope9DataContainerDto(mobileIdCard=" + this.mobileIdCard + ", personalData=" + this.personalData + ", personalIdCard=" + this.personalIdCard + ')';
    }
}
