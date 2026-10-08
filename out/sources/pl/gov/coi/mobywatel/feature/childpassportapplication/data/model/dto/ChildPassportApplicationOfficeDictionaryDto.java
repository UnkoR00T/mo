package pl.gov.coi.mobywatel.feature.childpassportapplication.data.model.dto;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes7.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001a"}, d2 = {"Lpl/gov/coi/mobywatel/feature/childpassportapplication/data/model/dto/ChildPassportApplicationOfficeDictionaryDto;", "", "officeName", "", "onlinePaymentSupported", "", "unitCode", "unitName", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getOfficeName", "()Ljava/lang/String;", "getOnlinePaymentSupported", "()Z", "getUnitCode", "getUnitName", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ChildPassportApplicationOfficeDictionaryDto {
    public static final int $stable = 0;

    @c("officeName")
    private final String officeName;

    @c("onlinePaymentSupported")
    private final boolean onlinePaymentSupported;

    @c("unitCode")
    private final String unitCode;

    @c("unitName")
    private final String unitName;

    public ChildPassportApplicationOfficeDictionaryDto(String str, boolean z15, String str2, String str3) {
        this.officeName = str;
        this.onlinePaymentSupported = z15;
        this.unitCode = str2;
        this.unitName = str3;
    }

    public static /* synthetic */ ChildPassportApplicationOfficeDictionaryDto copy$default(ChildPassportApplicationOfficeDictionaryDto childPassportApplicationOfficeDictionaryDto, String str, boolean z15, String str2, String str3, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = childPassportApplicationOfficeDictionaryDto.officeName;
        }
        if ((i15 & 2) != 0) {
            z15 = childPassportApplicationOfficeDictionaryDto.onlinePaymentSupported;
        }
        if ((i15 & 4) != 0) {
            str2 = childPassportApplicationOfficeDictionaryDto.unitCode;
        }
        if ((i15 & 8) != 0) {
            str3 = childPassportApplicationOfficeDictionaryDto.unitName;
        }
        return childPassportApplicationOfficeDictionaryDto.copy(str, z15, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOfficeName() {
        return this.officeName;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getOnlinePaymentSupported() {
        return this.onlinePaymentSupported;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getUnitCode() {
        return this.unitCode;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getUnitName() {
        return this.unitName;
    }

    public final ChildPassportApplicationOfficeDictionaryDto copy(String officeName, boolean onlinePaymentSupported, String unitCode, String unitName) {
        return new ChildPassportApplicationOfficeDictionaryDto(officeName, onlinePaymentSupported, unitCode, unitName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChildPassportApplicationOfficeDictionaryDto)) {
            return false;
        }
        ChildPassportApplicationOfficeDictionaryDto childPassportApplicationOfficeDictionaryDto = (ChildPassportApplicationOfficeDictionaryDto) other;
        return t.c(this.officeName, childPassportApplicationOfficeDictionaryDto.officeName) && this.onlinePaymentSupported == childPassportApplicationOfficeDictionaryDto.onlinePaymentSupported && t.c(this.unitCode, childPassportApplicationOfficeDictionaryDto.unitCode) && t.c(this.unitName, childPassportApplicationOfficeDictionaryDto.unitName);
    }

    public final String getOfficeName() {
        return this.officeName;
    }

    public final boolean getOnlinePaymentSupported() {
        return this.onlinePaymentSupported;
    }

    public final String getUnitCode() {
        return this.unitCode;
    }

    public final String getUnitName() {
        return this.unitName;
    }

    public int hashCode() {
        return (((((this.officeName.hashCode() * 31) + Boolean.hashCode(this.onlinePaymentSupported)) * 31) + this.unitCode.hashCode()) * 31) + this.unitName.hashCode();
    }

    public String toString() {
        return "ChildPassportApplicationOfficeDictionaryDto(officeName=" + this.officeName + ", onlinePaymentSupported=" + this.onlinePaymentSupported + ", unitCode=" + this.unitCode + ", unitName=" + this.unitName + ')';
    }
}
