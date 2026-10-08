package gm0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: gm0.o4, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000e\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u0004R\u001a\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0013\u0010\u0004R\u001a\u0010\u0016\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0015\u0010\u0004¨\u0006\u0017"}, d2 = {"Lgm0/o4;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "officeName", "b", "Z", "()Z", "onlinePaymentSupported", "c", "unitCode", "d", "unitName", "documentmanagementservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PassportChildApplicationOfficeDictionaryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("officeName")
    private final String officeName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("onlinePaymentSupported")
    private final boolean onlinePaymentSupported;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("unitCode")
    private final String unitCode;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("unitName")
    private final String unitName;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getOfficeName() {
        return this.officeName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getOnlinePaymentSupported() {
        return this.onlinePaymentSupported;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getUnitCode() {
        return this.unitCode;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUnitName() {
        return this.unitName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassportChildApplicationOfficeDictionaryDto)) {
            return false;
        }
        PassportChildApplicationOfficeDictionaryDto passportChildApplicationOfficeDictionaryDto = (PassportChildApplicationOfficeDictionaryDto) other;
        return fr.t.c(this.officeName, passportChildApplicationOfficeDictionaryDto.officeName) && this.onlinePaymentSupported == passportChildApplicationOfficeDictionaryDto.onlinePaymentSupported && fr.t.c(this.unitCode, passportChildApplicationOfficeDictionaryDto.unitCode) && fr.t.c(this.unitName, passportChildApplicationOfficeDictionaryDto.unitName);
    }

    public int hashCode() {
        return (((((this.officeName.hashCode() * 31) + Boolean.hashCode(this.onlinePaymentSupported)) * 31) + this.unitCode.hashCode()) * 31) + this.unitName.hashCode();
    }

    public String toString() {
        return "PassportChildApplicationOfficeDictionaryDto(officeName=" + this.officeName + ", onlinePaymentSupported=" + this.onlinePaymentSupported + ", unitCode=" + this.unitCode + ", unitName=" + this.unitName + ')';
    }
}
