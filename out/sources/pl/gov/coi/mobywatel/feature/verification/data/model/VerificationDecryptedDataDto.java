package pl.gov.coi.mobywatel.feature.verification.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001d"}, d2 = {"Lpl/gov/coi/mobywatel/feature/verification/data/model/VerificationDecryptedDataDto;", "", "scope", "", "citizenData", "", "picture", "pictureData", "verificationSchema", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getScope", "()I", "getCitizenData", "()Ljava/lang/String;", "getPicture", "getPictureData", "getVerificationSchema", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "toString", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VerificationDecryptedDataDto {
    public static final int $stable = 0;

    @c("citizenData")
    private final String citizenData;

    @c("picture")
    private final String picture;

    @c("pictureData")
    private final String pictureData;

    @c("scope")
    private final int scope;

    @c("verificationSchema")
    private final String verificationSchema;

    public VerificationDecryptedDataDto(int i15, String str, String str2, String str3, String str4) {
        this.scope = i15;
        this.citizenData = str;
        this.picture = str2;
        this.pictureData = str3;
        this.verificationSchema = str4;
    }

    public static /* synthetic */ VerificationDecryptedDataDto copy$default(VerificationDecryptedDataDto verificationDecryptedDataDto, int i15, String str, String str2, String str3, String str4, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = verificationDecryptedDataDto.scope;
        }
        if ((i16 & 2) != 0) {
            str = verificationDecryptedDataDto.citizenData;
        }
        if ((i16 & 4) != 0) {
            str2 = verificationDecryptedDataDto.picture;
        }
        if ((i16 & 8) != 0) {
            str3 = verificationDecryptedDataDto.pictureData;
        }
        if ((i16 & 16) != 0) {
            str4 = verificationDecryptedDataDto.verificationSchema;
        }
        String str5 = str4;
        String str6 = str2;
        return verificationDecryptedDataDto.copy(i15, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getScope() {
        return this.scope;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCitizenData() {
        return this.citizenData;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getPicture() {
        return this.picture;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getPictureData() {
        return this.pictureData;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVerificationSchema() {
        return this.verificationSchema;
    }

    public final VerificationDecryptedDataDto copy(int scope, String citizenData, String picture, String pictureData, String verificationSchema) {
        return new VerificationDecryptedDataDto(scope, citizenData, picture, pictureData, verificationSchema);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VerificationDecryptedDataDto)) {
            return false;
        }
        VerificationDecryptedDataDto verificationDecryptedDataDto = (VerificationDecryptedDataDto) other;
        return this.scope == verificationDecryptedDataDto.scope && t.c(this.citizenData, verificationDecryptedDataDto.citizenData) && t.c(this.picture, verificationDecryptedDataDto.picture) && t.c(this.pictureData, verificationDecryptedDataDto.pictureData) && t.c(this.verificationSchema, verificationDecryptedDataDto.verificationSchema);
    }

    public final String getCitizenData() {
        return this.citizenData;
    }

    public final String getPicture() {
        return this.picture;
    }

    public final String getPictureData() {
        return this.pictureData;
    }

    public final int getScope() {
        return this.scope;
    }

    public final String getVerificationSchema() {
        return this.verificationSchema;
    }

    public int hashCode() {
        int iHashCode = ((Integer.hashCode(this.scope) * 31) + this.citizenData.hashCode()) * 31;
        String str = this.picture;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pictureData;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.verificationSchema;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        return "VerificationDecryptedDataDto(scope=" + this.scope + ", citizenData=" + this.citizenData + ", picture=" + this.picture + ", pictureData=" + this.pictureData + ", verificationSchema=" + this.verificationSchema + ')';
    }
}
