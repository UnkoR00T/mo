package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationParentFormDataDto;", "", "parentData", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationParentDataDto;", "birthPlaceFieldValue", "", "idCardSeriesAndNumberFieldValue", "idCardNameFieldValue", "documentType", "Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDocumentTypeDto;", "<init>", "(Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationParentDataDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDocumentTypeDto;)V", "getParentData", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/PassportChildApplicationParentDataDto;", "getBirthPlaceFieldValue", "()Ljava/lang/String;", "getIdCardSeriesAndNumberFieldValue", "getIdCardNameFieldValue", "getDocumentType", "()Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationDocumentTypeDto;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationParentFormDataDto {
    public static final int $stable = 8;

    @c("birthPlaceFieldValue")
    private final String birthPlaceFieldValue;

    @c("documentType")
    private final ChildPassportApplicationDocumentTypeDto documentType;

    @c("idCardNameFieldValue")
    private final String idCardNameFieldValue;

    @c("idCardSeriesAndNumberFieldValue")
    private final String idCardSeriesAndNumberFieldValue;

    @c("parentData")
    private final PassportChildApplicationParentDataDto parentData;

    public ChildPassportApplicationParentFormDataDto(PassportChildApplicationParentDataDto passportChildApplicationParentDataDto, String str, String str2, String str3, ChildPassportApplicationDocumentTypeDto childPassportApplicationDocumentTypeDto) {
        this.parentData = passportChildApplicationParentDataDto;
        this.birthPlaceFieldValue = str;
        this.idCardSeriesAndNumberFieldValue = str2;
        this.idCardNameFieldValue = str3;
        this.documentType = childPassportApplicationDocumentTypeDto;
    }

    public static /* synthetic */ ChildPassportApplicationParentFormDataDto copy$default(ChildPassportApplicationParentFormDataDto childPassportApplicationParentFormDataDto, PassportChildApplicationParentDataDto passportChildApplicationParentDataDto, String str, String str2, String str3, ChildPassportApplicationDocumentTypeDto childPassportApplicationDocumentTypeDto, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            passportChildApplicationParentDataDto = childPassportApplicationParentFormDataDto.parentData;
        }
        if ((i15 & 2) != 0) {
            str = childPassportApplicationParentFormDataDto.birthPlaceFieldValue;
        }
        if ((i15 & 4) != 0) {
            str2 = childPassportApplicationParentFormDataDto.idCardSeriesAndNumberFieldValue;
        }
        if ((i15 & 8) != 0) {
            str3 = childPassportApplicationParentFormDataDto.idCardNameFieldValue;
        }
        if ((i15 & 16) != 0) {
            childPassportApplicationDocumentTypeDto = childPassportApplicationParentFormDataDto.documentType;
        }
        ChildPassportApplicationDocumentTypeDto childPassportApplicationDocumentTypeDto2 = childPassportApplicationDocumentTypeDto;
        String str4 = str2;
        return childPassportApplicationParentFormDataDto.copy(passportChildApplicationParentDataDto, str, str4, str3, childPassportApplicationDocumentTypeDto2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final PassportChildApplicationParentDataDto getParentData() {
        return this.parentData;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBirthPlaceFieldValue() {
        return this.birthPlaceFieldValue;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIdCardSeriesAndNumberFieldValue() {
        return this.idCardSeriesAndNumberFieldValue;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getIdCardNameFieldValue() {
        return this.idCardNameFieldValue;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final ChildPassportApplicationDocumentTypeDto getDocumentType() {
        return this.documentType;
    }

    public final ChildPassportApplicationParentFormDataDto copy(PassportChildApplicationParentDataDto parentData, String birthPlaceFieldValue, String idCardSeriesAndNumberFieldValue, String idCardNameFieldValue, ChildPassportApplicationDocumentTypeDto documentType) {
        return new ChildPassportApplicationParentFormDataDto(parentData, birthPlaceFieldValue, idCardSeriesAndNumberFieldValue, idCardNameFieldValue, documentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationParentFormDataDto)) {
            return false;
        }
        ChildPassportApplicationParentFormDataDto childPassportApplicationParentFormDataDto = (ChildPassportApplicationParentFormDataDto) other;
        return t.c(this.parentData, childPassportApplicationParentFormDataDto.parentData) && t.c(this.birthPlaceFieldValue, childPassportApplicationParentFormDataDto.birthPlaceFieldValue) && t.c(this.idCardSeriesAndNumberFieldValue, childPassportApplicationParentFormDataDto.idCardSeriesAndNumberFieldValue) && t.c(this.idCardNameFieldValue, childPassportApplicationParentFormDataDto.idCardNameFieldValue) && this.documentType == childPassportApplicationParentFormDataDto.documentType;
    }

    public final String getBirthPlaceFieldValue() {
        return this.birthPlaceFieldValue;
    }

    public final ChildPassportApplicationDocumentTypeDto getDocumentType() {
        return this.documentType;
    }

    public final String getIdCardNameFieldValue() {
        return this.idCardNameFieldValue;
    }

    public final String getIdCardSeriesAndNumberFieldValue() {
        return this.idCardSeriesAndNumberFieldValue;
    }

    public final PassportChildApplicationParentDataDto getParentData() {
        return this.parentData;
    }

    public int hashCode() {
        int iHashCode = ((((((this.parentData.hashCode() * 31) + this.birthPlaceFieldValue.hashCode()) * 31) + this.idCardSeriesAndNumberFieldValue.hashCode()) * 31) + this.idCardNameFieldValue.hashCode()) * 31;
        ChildPassportApplicationDocumentTypeDto childPassportApplicationDocumentTypeDto = this.documentType;
        return iHashCode + (childPassportApplicationDocumentTypeDto == null ? 0 : childPassportApplicationDocumentTypeDto.hashCode());
    }

    public String toString() {
        return "ChildPassportApplicationParentFormDataDto(parentData=" + this.parentData + ", birthPlaceFieldValue=" + this.birthPlaceFieldValue + ", idCardSeriesAndNumberFieldValue=" + this.idCardSeriesAndNumberFieldValue + ", idCardNameFieldValue=" + this.idCardNameFieldValue + ", documentType=" + this.documentType + ')';
    }
}
