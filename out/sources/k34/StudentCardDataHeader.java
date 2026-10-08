package k34;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: k34.b0, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0015\u001a\u0004\b\u0016\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0018\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lk34/b0;", "", "", "dn", "serialNumber", "issuer", "signDate", "", "timestamp", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "d", "e", "Ljava/lang/Long;", "()Ljava/lang/Long;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class StudentCardDataHeader {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String dn;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String serialNumber;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String issuer;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String signDate;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Long timestamp;

    public StudentCardDataHeader(String str, String str2, String str3, String str4, Long l15) {
        this.dn = str;
        this.serialNumber = str2;
        this.issuer = str3;
        this.signDate = str4;
        this.timestamp = l15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDn() {
        return this.dn;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getIssuer() {
        return this.issuer;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getSerialNumber() {
        return this.serialNumber;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getSignDate() {
        return this.signDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StudentCardDataHeader)) {
            return false;
        }
        StudentCardDataHeader studentCardDataHeader = (StudentCardDataHeader) other;
        return fr.t.c(this.dn, studentCardDataHeader.dn) && fr.t.c(this.serialNumber, studentCardDataHeader.serialNumber) && fr.t.c(this.issuer, studentCardDataHeader.issuer) && fr.t.c(this.signDate, studentCardDataHeader.signDate) && fr.t.c(this.timestamp, studentCardDataHeader.timestamp);
    }

    public int hashCode() {
        String str = this.dn;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.serialNumber;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.issuer;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.signDate;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l15 = this.timestamp;
        return iHashCode4 + (l15 != null ? l15.hashCode() : 0);
    }

    public String toString() {
        return "StudentCardDataHeader(dn=" + this.dn + ", serialNumber=" + this.serialNumber + ", issuer=" + this.issuer + ", signDate=" + this.signDate + ", timestamp=" + this.timestamp + ")";
    }
}
