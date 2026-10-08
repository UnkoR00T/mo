package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006\u001f"}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataContainerItemDto;", "", "dataType", "", "share", "", AnnotatedPrivateKey.LABEL, "value", "type", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDataType", "()Ljava/lang/String;", "getShare", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLabel", "getValue", "getType", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lpl/gov/coi/mobywatel/technical/containers/data/model/WruLicenceDataContainerItemDto;", "equals", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class WruLicenceDataContainerItemDto {

    @c("dataType")
    private final String dataType;

    @c(AnnotatedPrivateKey.LABEL)
    private final String label;

    @c("share")
    private final Boolean share;

    @c("type")
    private final String type;

    @c("value")
    private final String value;

    public WruLicenceDataContainerItemDto() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ WruLicenceDataContainerItemDto copy$default(WruLicenceDataContainerItemDto wruLicenceDataContainerItemDto, String str, Boolean bool, String str2, String str3, String str4, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = wruLicenceDataContainerItemDto.dataType;
        }
        if ((i15 & 2) != 0) {
            bool = wruLicenceDataContainerItemDto.share;
        }
        if ((i15 & 4) != 0) {
            str2 = wruLicenceDataContainerItemDto.label;
        }
        if ((i15 & 8) != 0) {
            str3 = wruLicenceDataContainerItemDto.value;
        }
        if ((i15 & 16) != 0) {
            str4 = wruLicenceDataContainerItemDto.type;
        }
        String str5 = str4;
        String str6 = str2;
        return wruLicenceDataContainerItemDto.copy(str, bool, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getShare() {
        return this.share;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final WruLicenceDataContainerItemDto copy(String dataType, Boolean share, String label, String value, String type) {
        return new WruLicenceDataContainerItemDto(dataType, share, label, value, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WruLicenceDataContainerItemDto)) {
            return false;
        }
        WruLicenceDataContainerItemDto wruLicenceDataContainerItemDto = (WruLicenceDataContainerItemDto) other;
        return t.c(this.dataType, wruLicenceDataContainerItemDto.dataType) && t.c(this.share, wruLicenceDataContainerItemDto.share) && t.c(this.label, wruLicenceDataContainerItemDto.label) && t.c(this.value, wruLicenceDataContainerItemDto.value) && t.c(this.type, wruLicenceDataContainerItemDto.type);
    }

    public final String getDataType() {
        return this.dataType;
    }

    public final String getLabel() {
        return this.label;
    }

    public final Boolean getShare() {
        return this.share;
    }

    public final String getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.dataType;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.share;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.label;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.value;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "WruLicenceDataContainerItemDto(dataType=" + this.dataType + ", share=" + this.share + ", label=" + this.label + ", value=" + this.value + ", type=" + this.type + ')';
    }

    public WruLicenceDataContainerItemDto(String str, Boolean bool, String str2, String str3, String str4) {
        this.dataType = str;
        this.share = bool;
        this.label = str2;
        this.value = str3;
        this.type = str4;
    }

    public /* synthetic */ WruLicenceDataContainerItemDto(String str, Boolean bool, String str2, String str3, String str4, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : bool, (i15 & 4) != 0 ? null : str2, (i15 & 8) != 0 ? null : str3, (i15 & 16) != 0 ? null : str4);
    }
}
