package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.k;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B_\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u000bHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003Je\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u000bHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0010R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0010¨\u0006("}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderVehicleDto;", "", "dn", "", "sn", "issuer", "timestamp", "", "requestId", "dataRequester", "dataType", "", "internalDocumentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getDn", "()Ljava/lang/String;", "getSn", "getIssuer", "getTimestamp", "()J", "getRequestId", "getDataRequester", "getDataType", "()I", "getInternalDocumentId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DataHeaderVehicleDto {

    @c("dataRequester")
    private final String dataRequester;

    @c("dataType")
    private final int dataType;

    @c("dn")
    private final String dn;

    @c("internalDocumentId")
    private final String internalDocumentId;

    @c("issuer")
    private final String issuer;

    @c("requestId")
    private final String requestId;

    @c("sn")
    private final String sn;

    @c("timestamp")
    private final long timestamp;

    public DataHeaderVehicleDto(String str, String str2, String str3, long j15, String str4, String str5, int i15, String str6) {
        this.dn = str;
        this.sn = str2;
        this.issuer = str3;
        this.timestamp = j15;
        this.requestId = str4;
        this.dataRequester = str5;
        this.dataType = i15;
        this.internalDocumentId = str6;
    }

    public static /* synthetic */ DataHeaderVehicleDto copy$default(DataHeaderVehicleDto dataHeaderVehicleDto, String str, String str2, String str3, long j15, String str4, String str5, int i15, String str6, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            str = dataHeaderVehicleDto.dn;
        }
        if ((i16 & 2) != 0) {
            str2 = dataHeaderVehicleDto.sn;
        }
        if ((i16 & 4) != 0) {
            str3 = dataHeaderVehicleDto.issuer;
        }
        if ((i16 & 8) != 0) {
            j15 = dataHeaderVehicleDto.timestamp;
        }
        if ((i16 & 16) != 0) {
            str4 = dataHeaderVehicleDto.requestId;
        }
        if ((i16 & 32) != 0) {
            str5 = dataHeaderVehicleDto.dataRequester;
        }
        if ((i16 & 64) != 0) {
            i15 = dataHeaderVehicleDto.dataType;
        }
        if ((i16 & 128) != 0) {
            str6 = dataHeaderVehicleDto.internalDocumentId;
        }
        long j16 = j15;
        String str7 = str3;
        return dataHeaderVehicleDto.copy(str, str2, str7, j16, str4, str5, i15, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDn() {
        return this.dn;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSn() {
        return this.sn;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getDataRequester() {
        return this.dataRequester;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getDataType() {
        return this.dataType;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getInternalDocumentId() {
        return this.internalDocumentId;
    }

    public final DataHeaderVehicleDto copy(String dn4, String sn4, String issuer, long timestamp, String requestId, String dataRequester, int dataType, String internalDocumentId) {
        return new DataHeaderVehicleDto(dn4, sn4, issuer, timestamp, requestId, dataRequester, dataType, internalDocumentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataHeaderVehicleDto)) {
            return false;
        }
        DataHeaderVehicleDto dataHeaderVehicleDto = (DataHeaderVehicleDto) other;
        return t.c(this.dn, dataHeaderVehicleDto.dn) && t.c(this.sn, dataHeaderVehicleDto.sn) && t.c(this.issuer, dataHeaderVehicleDto.issuer) && this.timestamp == dataHeaderVehicleDto.timestamp && t.c(this.requestId, dataHeaderVehicleDto.requestId) && t.c(this.dataRequester, dataHeaderVehicleDto.dataRequester) && this.dataType == dataHeaderVehicleDto.dataType && t.c(this.internalDocumentId, dataHeaderVehicleDto.internalDocumentId);
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

    public final String getInternalDocumentId() {
        return this.internalDocumentId;
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

    public int hashCode() {
        String str = this.dn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sn;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issuer;
        int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Long.hashCode(this.timestamp)) * 31;
        String str4 = this.requestId;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.dataRequester;
        int iHashCode5 = (((iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31) + Integer.hashCode(this.dataType)) * 31;
        String str6 = this.internalDocumentId;
        return iHashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "DataHeaderVehicleDto(dn=" + this.dn + ", sn=" + this.sn + ", issuer=" + this.issuer + ", timestamp=" + this.timestamp + ", requestId=" + this.requestId + ", dataRequester=" + this.dataRequester + ", dataType=" + this.dataType + ", internalDocumentId=" + this.internalDocumentId + ')';
    }

    public /* synthetic */ DataHeaderVehicleDto(String str, String str2, String str3, long j15, String str4, String str5, int i15, String str6, int i16, k kVar) {
        this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? null : str2, (i16 & 4) != 0 ? null : str3, j15, (i16 & 16) != 0 ? null : str4, (i16 & 32) != 0 ? null : str5, i15, (i16 & 128) != 0 ? null : str6);
    }
}
