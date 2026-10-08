package pl.gov.coi.mobywatel.technical.documents.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope1Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope2Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope3Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope4Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope5Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope6Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope7Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope8Dto;
import pl.gov.coi.mobywatel.technical.documents.data.model.personal.PersonalDataScope9Dto;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0014\u0010\u0015J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0013HÆ\u0003Ju\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u000208HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0018\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u00069"}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/MobileIdcCardDocumentScopesDocumentationDto;", "", "personalDataScope1", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope1Dto;", "personalDataScope2", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope2Dto;", "personalDataScope3", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope3Dto;", "personalDataScope4", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope4Dto;", "personalDataScope5", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope5Dto;", "personalDataScope6", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope6Dto;", "personalDataScope7", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope7Dto;", "personalDataScope8", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8Dto;", "personalDataScope9", "Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope9Dto;", "<init>", "(Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope1Dto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope2Dto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope3Dto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope4Dto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope5Dto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope6Dto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope7Dto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8Dto;Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope9Dto;)V", "getPersonalDataScope1", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope1Dto;", "getPersonalDataScope2", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope2Dto;", "getPersonalDataScope3", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope3Dto;", "getPersonalDataScope4", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope4Dto;", "getPersonalDataScope5", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope5Dto;", "getPersonalDataScope6", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope6Dto;", "getPersonalDataScope7", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope7Dto;", "getPersonalDataScope8", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope8Dto;", "getPersonalDataScope9", "()Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalDataScope9Dto;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MobileIdcCardDocumentScopesDocumentationDto {

    @c("personalDataScope1")
    private final PersonalDataScope1Dto personalDataScope1;

    @c("personalDataScope2")
    private final PersonalDataScope2Dto personalDataScope2;

    @c("personalDataScope3")
    private final PersonalDataScope3Dto personalDataScope3;

    @c("personalDataScope4")
    private final PersonalDataScope4Dto personalDataScope4;

    @c("personalDataScope5")
    private final PersonalDataScope5Dto personalDataScope5;

    @c("personalDataScope6")
    private final PersonalDataScope6Dto personalDataScope6;

    @c("personalDataScope7")
    private final PersonalDataScope7Dto personalDataScope7;

    @c("personalDataScope8")
    private final PersonalDataScope8Dto personalDataScope8;

    @c("personalDataScope9")
    private final PersonalDataScope9Dto personalDataScope9;

    public MobileIdcCardDocumentScopesDocumentationDto() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ MobileIdcCardDocumentScopesDocumentationDto copy$default(MobileIdcCardDocumentScopesDocumentationDto mobileIdcCardDocumentScopesDocumentationDto, PersonalDataScope1Dto personalDataScope1Dto, PersonalDataScope2Dto personalDataScope2Dto, PersonalDataScope3Dto personalDataScope3Dto, PersonalDataScope4Dto personalDataScope4Dto, PersonalDataScope5Dto personalDataScope5Dto, PersonalDataScope6Dto personalDataScope6Dto, PersonalDataScope7Dto personalDataScope7Dto, PersonalDataScope8Dto personalDataScope8Dto, PersonalDataScope9Dto personalDataScope9Dto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            personalDataScope1Dto = mobileIdcCardDocumentScopesDocumentationDto.personalDataScope1;
        }
        if ((i15 & 2) != 0) {
            personalDataScope2Dto = mobileIdcCardDocumentScopesDocumentationDto.personalDataScope2;
        }
        if ((i15 & 4) != 0) {
            personalDataScope3Dto = mobileIdcCardDocumentScopesDocumentationDto.personalDataScope3;
        }
        if ((i15 & 8) != 0) {
            personalDataScope4Dto = mobileIdcCardDocumentScopesDocumentationDto.personalDataScope4;
        }
        if ((i15 & 16) != 0) {
            personalDataScope5Dto = mobileIdcCardDocumentScopesDocumentationDto.personalDataScope5;
        }
        if ((i15 & 32) != 0) {
            personalDataScope6Dto = mobileIdcCardDocumentScopesDocumentationDto.personalDataScope6;
        }
        if ((i15 & 64) != 0) {
            personalDataScope7Dto = mobileIdcCardDocumentScopesDocumentationDto.personalDataScope7;
        }
        if ((i15 & 128) != 0) {
            personalDataScope8Dto = mobileIdcCardDocumentScopesDocumentationDto.personalDataScope8;
        }
        if ((i15 & 256) != 0) {
            personalDataScope9Dto = mobileIdcCardDocumentScopesDocumentationDto.personalDataScope9;
        }
        PersonalDataScope8Dto personalDataScope8Dto2 = personalDataScope8Dto;
        PersonalDataScope9Dto personalDataScope9Dto2 = personalDataScope9Dto;
        PersonalDataScope6Dto personalDataScope6Dto2 = personalDataScope6Dto;
        PersonalDataScope7Dto personalDataScope7Dto2 = personalDataScope7Dto;
        PersonalDataScope5Dto personalDataScope5Dto2 = personalDataScope5Dto;
        PersonalDataScope3Dto personalDataScope3Dto2 = personalDataScope3Dto;
        return mobileIdcCardDocumentScopesDocumentationDto.copy(personalDataScope1Dto, personalDataScope2Dto, personalDataScope3Dto2, personalDataScope4Dto, personalDataScope5Dto2, personalDataScope6Dto2, personalDataScope7Dto2, personalDataScope8Dto2, personalDataScope9Dto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PersonalDataScope1Dto getPersonalDataScope1() {
        return this.personalDataScope1;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final PersonalDataScope2Dto getPersonalDataScope2() {
        return this.personalDataScope2;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final PersonalDataScope3Dto getPersonalDataScope3() {
        return this.personalDataScope3;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PersonalDataScope4Dto getPersonalDataScope4() {
        return this.personalDataScope4;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final PersonalDataScope5Dto getPersonalDataScope5() {
        return this.personalDataScope5;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final PersonalDataScope6Dto getPersonalDataScope6() {
        return this.personalDataScope6;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PersonalDataScope7Dto getPersonalDataScope7() {
        return this.personalDataScope7;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final PersonalDataScope8Dto getPersonalDataScope8() {
        return this.personalDataScope8;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final PersonalDataScope9Dto getPersonalDataScope9() {
        return this.personalDataScope9;
    }

    public final MobileIdcCardDocumentScopesDocumentationDto copy(PersonalDataScope1Dto personalDataScope1, PersonalDataScope2Dto personalDataScope2, PersonalDataScope3Dto personalDataScope3, PersonalDataScope4Dto personalDataScope4, PersonalDataScope5Dto personalDataScope5, PersonalDataScope6Dto personalDataScope6, PersonalDataScope7Dto personalDataScope7, PersonalDataScope8Dto personalDataScope8, PersonalDataScope9Dto personalDataScope9) {
        return new MobileIdcCardDocumentScopesDocumentationDto(personalDataScope1, personalDataScope2, personalDataScope3, personalDataScope4, personalDataScope5, personalDataScope6, personalDataScope7, personalDataScope8, personalDataScope9);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobileIdcCardDocumentScopesDocumentationDto)) {
            return false;
        }
        MobileIdcCardDocumentScopesDocumentationDto mobileIdcCardDocumentScopesDocumentationDto = (MobileIdcCardDocumentScopesDocumentationDto) other;
        return t.c(this.personalDataScope1, mobileIdcCardDocumentScopesDocumentationDto.personalDataScope1) && t.c(this.personalDataScope2, mobileIdcCardDocumentScopesDocumentationDto.personalDataScope2) && t.c(this.personalDataScope3, mobileIdcCardDocumentScopesDocumentationDto.personalDataScope3) && t.c(this.personalDataScope4, mobileIdcCardDocumentScopesDocumentationDto.personalDataScope4) && t.c(this.personalDataScope5, mobileIdcCardDocumentScopesDocumentationDto.personalDataScope5) && t.c(this.personalDataScope6, mobileIdcCardDocumentScopesDocumentationDto.personalDataScope6) && t.c(this.personalDataScope7, mobileIdcCardDocumentScopesDocumentationDto.personalDataScope7) && t.c(this.personalDataScope8, mobileIdcCardDocumentScopesDocumentationDto.personalDataScope8) && t.c(this.personalDataScope9, mobileIdcCardDocumentScopesDocumentationDto.personalDataScope9);
    }

    public final PersonalDataScope1Dto getPersonalDataScope1() {
        return this.personalDataScope1;
    }

    public final PersonalDataScope2Dto getPersonalDataScope2() {
        return this.personalDataScope2;
    }

    public final PersonalDataScope3Dto getPersonalDataScope3() {
        return this.personalDataScope3;
    }

    public final PersonalDataScope4Dto getPersonalDataScope4() {
        return this.personalDataScope4;
    }

    public final PersonalDataScope5Dto getPersonalDataScope5() {
        return this.personalDataScope5;
    }

    public final PersonalDataScope6Dto getPersonalDataScope6() {
        return this.personalDataScope6;
    }

    public final PersonalDataScope7Dto getPersonalDataScope7() {
        return this.personalDataScope7;
    }

    public final PersonalDataScope8Dto getPersonalDataScope8() {
        return this.personalDataScope8;
    }

    public final PersonalDataScope9Dto getPersonalDataScope9() {
        return this.personalDataScope9;
    }

    public int hashCode() {
        PersonalDataScope1Dto personalDataScope1Dto = this.personalDataScope1;
        int iHashCode = (personalDataScope1Dto == null ? 0 : personalDataScope1Dto.hashCode()) * 31;
        PersonalDataScope2Dto personalDataScope2Dto = this.personalDataScope2;
        int iHashCode2 = (iHashCode + (personalDataScope2Dto == null ? 0 : personalDataScope2Dto.hashCode())) * 31;
        PersonalDataScope3Dto personalDataScope3Dto = this.personalDataScope3;
        int iHashCode3 = (iHashCode2 + (personalDataScope3Dto == null ? 0 : personalDataScope3Dto.hashCode())) * 31;
        PersonalDataScope4Dto personalDataScope4Dto = this.personalDataScope4;
        int iHashCode4 = (iHashCode3 + (personalDataScope4Dto == null ? 0 : personalDataScope4Dto.hashCode())) * 31;
        PersonalDataScope5Dto personalDataScope5Dto = this.personalDataScope5;
        int iHashCode5 = (iHashCode4 + (personalDataScope5Dto == null ? 0 : personalDataScope5Dto.hashCode())) * 31;
        PersonalDataScope6Dto personalDataScope6Dto = this.personalDataScope6;
        int iHashCode6 = (iHashCode5 + (personalDataScope6Dto == null ? 0 : personalDataScope6Dto.hashCode())) * 31;
        PersonalDataScope7Dto personalDataScope7Dto = this.personalDataScope7;
        int iHashCode7 = (iHashCode6 + (personalDataScope7Dto == null ? 0 : personalDataScope7Dto.hashCode())) * 31;
        PersonalDataScope8Dto personalDataScope8Dto = this.personalDataScope8;
        int iHashCode8 = (iHashCode7 + (personalDataScope8Dto == null ? 0 : personalDataScope8Dto.hashCode())) * 31;
        PersonalDataScope9Dto personalDataScope9Dto = this.personalDataScope9;
        return iHashCode8 + (personalDataScope9Dto != null ? personalDataScope9Dto.hashCode() : 0);
    }

    public String toString() {
        return "MobileIdcCardDocumentScopesDocumentationDto(personalDataScope1=" + this.personalDataScope1 + ", personalDataScope2=" + this.personalDataScope2 + ", personalDataScope3=" + this.personalDataScope3 + ", personalDataScope4=" + this.personalDataScope4 + ", personalDataScope5=" + this.personalDataScope5 + ", personalDataScope6=" + this.personalDataScope6 + ", personalDataScope7=" + this.personalDataScope7 + ", personalDataScope8=" + this.personalDataScope8 + ", personalDataScope9=" + this.personalDataScope9 + ')';
    }

    public MobileIdcCardDocumentScopesDocumentationDto(PersonalDataScope1Dto personalDataScope1Dto, PersonalDataScope2Dto personalDataScope2Dto, PersonalDataScope3Dto personalDataScope3Dto, PersonalDataScope4Dto personalDataScope4Dto, PersonalDataScope5Dto personalDataScope5Dto, PersonalDataScope6Dto personalDataScope6Dto, PersonalDataScope7Dto personalDataScope7Dto, PersonalDataScope8Dto personalDataScope8Dto, PersonalDataScope9Dto personalDataScope9Dto) {
        this.personalDataScope1 = personalDataScope1Dto;
        this.personalDataScope2 = personalDataScope2Dto;
        this.personalDataScope3 = personalDataScope3Dto;
        this.personalDataScope4 = personalDataScope4Dto;
        this.personalDataScope5 = personalDataScope5Dto;
        this.personalDataScope6 = personalDataScope6Dto;
        this.personalDataScope7 = personalDataScope7Dto;
        this.personalDataScope8 = personalDataScope8Dto;
        this.personalDataScope9 = personalDataScope9Dto;
    }

    public /* synthetic */ MobileIdcCardDocumentScopesDocumentationDto(PersonalDataScope1Dto personalDataScope1Dto, PersonalDataScope2Dto personalDataScope2Dto, PersonalDataScope3Dto personalDataScope3Dto, PersonalDataScope4Dto personalDataScope4Dto, PersonalDataScope5Dto personalDataScope5Dto, PersonalDataScope6Dto personalDataScope6Dto, PersonalDataScope7Dto personalDataScope7Dto, PersonalDataScope8Dto personalDataScope8Dto, PersonalDataScope9Dto personalDataScope9Dto, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : personalDataScope1Dto, (i15 & 2) != 0 ? null : personalDataScope2Dto, (i15 & 4) != 0 ? null : personalDataScope3Dto, (i15 & 8) != 0 ? null : personalDataScope4Dto, (i15 & 16) != 0 ? null : personalDataScope5Dto, (i15 & 32) != 0 ? null : personalDataScope6Dto, (i15 & 64) != 0 ? null : personalDataScope7Dto, (i15 & 128) != 0 ? null : personalDataScope8Dto, (i15 & 256) != 0 ? null : personalDataScope9Dto);
    }
}
