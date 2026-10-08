package pl.gov.coi.mobywatel.technical.containers.data.model;

import androidx.annotation.Keep;
import fr.t;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: loaded from: classes10.dex */
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JJ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderStudentDto;", "", "dn", "", "sn", "issuer", "signDate", "timestamp", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getDn", "()Ljava/lang/String;", "getSn", "getIssuer", "getSignDate", "getTimestamp", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lpl/gov/coi/mobywatel/technical/containers/data/model/DataHeaderStudentDto;", "equals", "", "other", "hashCode", "", "toString", "containers_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DataHeaderStudentDto {

    @c("dn")
    private final String dn;

    @c("issuer")
    private final String issuer;

    @c("signDate")
    private final String signDate;

    @c("sn")
    private final String sn;

    @c("timestamp")
    private final Long timestamp;

    public DataHeaderStudentDto(String str, String str2, String str3, String str4, Long l15) {
        this.dn = str;
        this.sn = str2;
        this.issuer = str3;
        this.signDate = str4;
        this.timestamp = l15;
    }

    public static /* synthetic */ DataHeaderStudentDto copy$default(DataHeaderStudentDto dataHeaderStudentDto, String str, String str2, String str3, String str4, Long l15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = dataHeaderStudentDto.dn;
        }
        if ((i15 & 2) != 0) {
            str2 = dataHeaderStudentDto.sn;
        }
        if ((i15 & 4) != 0) {
            str3 = dataHeaderStudentDto.issuer;
        }
        if ((i15 & 8) != 0) {
            str4 = dataHeaderStudentDto.signDate;
        }
        if ((i15 & 16) != 0) {
            l15 = dataHeaderStudentDto.timestamp;
        }
        Long l16 = l15;
        String str5 = str3;
        return dataHeaderStudentDto.copy(str, str2, str5, str4, l16);
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
    public final String getSignDate() {
        return this.signDate;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public final DataHeaderStudentDto copy(String dn4, String sn4, String issuer, String signDate, Long timestamp) {
        return new DataHeaderStudentDto(dn4, sn4, issuer, signDate, timestamp);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DataHeaderStudentDto)) {
            return false;
        }
        DataHeaderStudentDto dataHeaderStudentDto = (DataHeaderStudentDto) other;
        return t.c(this.dn, dataHeaderStudentDto.dn) && t.c(this.sn, dataHeaderStudentDto.sn) && t.c(this.issuer, dataHeaderStudentDto.issuer) && t.c(this.signDate, dataHeaderStudentDto.signDate) && t.c(this.timestamp, dataHeaderStudentDto.timestamp);
    }

    public final String getDn() {
        return this.dn;
    }

    public final String getIssuer() {
        return this.issuer;
    }

    public final String getSignDate() {
        return this.signDate;
    }

    public final String getSn() {
        return this.sn;
    }

    public final Long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        String str = this.dn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.sn;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issuer;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.signDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.timestamp;
        return iHashCode4 + (l15 != null ? l15.hashCode() : 0);
    }

    public String toString() {
        return "DataHeaderStudentDto(dn=" + this.dn + ", sn=" + this.sn + ", issuer=" + this.issuer + ", signDate=" + this.signDate + ", timestamp=" + this.timestamp + ')';
    }
}
