package pl.gov.coi.mobywatel.technical.documents.data.model.personal;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\nHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\nHÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u000b\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006("}, d2 = {"Lpl/gov/coi/mobywatel/technical/documents/data/model/personal/PersonalLegacyHeaderContainerDto;", "", "timestamp", "", "requestId", "", "dn", "sn", "issuer", "dataType", "", "version", "dataRequester", "<init>", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getTimestamp", "()J", "getRequestId", "()Ljava/lang/String;", "getDn", "getSn", "getIssuer", "getDataType", "()I", "getVersion", "getDataRequester", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalLegacyHeaderContainerDto {

    @c("dataRequester")
    private final String dataRequester;

    @c("dataType")
    private final int dataType;

    @c("dn")
    private final String dn;

    @c("issuer")
    private final String issuer;

    @c("requestId")
    private final String requestId;

    @c("sn")
    private final String sn;

    @c("timestamp")
    private final long timestamp;

    @c("version")
    private final String version;

    public PersonalLegacyHeaderContainerDto(long j15, String str, String str2, String str3, String str4, int i15, String str5, String str6) {
        this.timestamp = j15;
        this.requestId = str;
        this.dn = str2;
        this.sn = str3;
        this.issuer = str4;
        this.dataType = i15;
        this.version = str5;
        this.dataRequester = str6;
    }

    public static /* synthetic */ PersonalLegacyHeaderContainerDto copy$default(PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto, long j15, String str, String str2, String str3, String str4, int i15, String str5, String str6, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            j15 = personalLegacyHeaderContainerDto.timestamp;
        }
        long j16 = j15;
        if ((i16 & 2) != 0) {
            str = personalLegacyHeaderContainerDto.requestId;
        }
        String str7 = str;
        if ((i16 & 4) != 0) {
            str2 = personalLegacyHeaderContainerDto.dn;
        }
        String str8 = str2;
        if ((i16 & 8) != 0) {
            str3 = personalLegacyHeaderContainerDto.sn;
        }
        return personalLegacyHeaderContainerDto.copy(j16, str7, str8, str3, (i16 & 16) != 0 ? personalLegacyHeaderContainerDto.issuer : str4, (i16 & 32) != 0 ? personalLegacyHeaderContainerDto.dataType : i15, (i16 & 64) != 0 ? personalLegacyHeaderContainerDto.version : str5, (i16 & 128) != 0 ? personalLegacyHeaderContainerDto.dataRequester : str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDn() {
        return this.dn;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDataRequester() {
        return this.dataRequester;
    }

    public final PersonalLegacyHeaderContainerDto copy(long timestamp, String requestId, String dn4, String sn4, String issuer, int dataType, String version, String dataRequester) {
        return new PersonalLegacyHeaderContainerDto(timestamp, requestId, dn4, sn4, issuer, dataType, version, dataRequester);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalLegacyHeaderContainerDto)) {
            return false;
        }
        PersonalLegacyHeaderContainerDto personalLegacyHeaderContainerDto = (PersonalLegacyHeaderContainerDto) other;
        return this.timestamp == personalLegacyHeaderContainerDto.timestamp && t.c(this.requestId, personalLegacyHeaderContainerDto.requestId) && t.c(this.dn, personalLegacyHeaderContainerDto.dn) && t.c(this.sn, personalLegacyHeaderContainerDto.sn) && t.c(this.issuer, personalLegacyHeaderContainerDto.issuer) && this.dataType == personalLegacyHeaderContainerDto.dataType && t.c(this.version, personalLegacyHeaderContainerDto.version) && t.c(this.dataRequester, personalLegacyHeaderContainerDto.dataRequester);
    }

    public final String getDataRequester() {
        return this.dataRequester;
    }

    public final int getDataType() {
        return this.dataType;
    }

    public final String getDn() {
        return this.dn;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final String getSn() {
        return this.sn;
    }

    public final long getTimestamp() {
        return this.timestamp;
    }

    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Long.hashCode(this.timestamp) * 31) + this.requestId.hashCode()) * 31) + this.dn.hashCode()) * 31) + this.sn.hashCode()) * 31) + this.issuer.hashCode()) * 31) + Integer.hashCode(this.dataType)) * 31) + this.version.hashCode()) * 31;
        String str = this.dataRequester;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "PersonalLegacyHeaderContainerDto(timestamp=" + this.timestamp + ", requestId=" + this.requestId + ", dn=" + this.dn + ", sn=" + this.sn + ", issuer=" + this.issuer + ", dataType=" + this.dataType + ", version=" + this.version + ", dataRequester=" + this.dataRequester + ')';
    }

    public /* synthetic */ PersonalLegacyHeaderContainerDto(long j15, String str, String str2, String str3, String str4, int i15, String str5, String str6, int i16, k kVar) {
        this(j15, str, str2, str3, str4, i15, str5, (i16 & 128) != 0 ? null : str6);
    }
}
