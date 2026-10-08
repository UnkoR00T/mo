package yq0;

import java.time.OffsetDateTime;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yq0.n, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0011\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\r\u001a\u0004\b\u0010\u0010\u0004R\u001a\u0010\u0013\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\r\u001a\u0004\b\u0012\u0010\u0004R \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0019\u0010\u0004R\u001a\u0010\u001e\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010 \u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001f\u0010\u0004R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u0015\u001a\u0004\b!\u0010\u0017R\u001a\u0010'\u001a\u00020#8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u001c\u0010,\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b\f\u0010+¨\u0006-"}, d2 = {"Lyq0/n;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "court", "c", "department", "d", "id", "", "Ljava/util/List;", "e", "()Ljava/util/List;", "longAddress", "f", "number", "Z", "g", "()Z", "open", "getPesel", "pesel", "h", "shortAddress", "Lyq0/s;", "i", "Lyq0/s;", "()Lyq0/s;", "type", "Ljava/time/OffsetDateTime;", "j", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "closingDate", "nationalcourtregistryservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LandRegisterEntryDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("court")
    private final String court;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("department")
    private final String department;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("id")
    private final String id;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("longAddress")
    private final List<String> longAddress;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("number")
    private final String number;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("open")
    private final boolean open;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("pesel")
    private final String pesel;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("shortAddress")
    private final List<String> shortAddress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("type")
    private final s type;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    @vl.c("closingDate")
    private final OffsetDateTime closingDate;

    /* JADX INFO: renamed from: a, reason: from getter */
    public final OffsetDateTime getClosingDate() {
        return this.closingDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCourt() {
        return this.court;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDepartment() {
        return this.department;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getId() {
        return this.id;
    }

    public final List<String> e() {
        return this.longAddress;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LandRegisterEntryDto)) {
            return false;
        }
        LandRegisterEntryDto landRegisterEntryDto = (LandRegisterEntryDto) other;
        return fr.t.c(this.court, landRegisterEntryDto.court) && fr.t.c(this.department, landRegisterEntryDto.department) && fr.t.c(this.id, landRegisterEntryDto.id) && fr.t.c(this.longAddress, landRegisterEntryDto.longAddress) && fr.t.c(this.number, landRegisterEntryDto.number) && this.open == landRegisterEntryDto.open && fr.t.c(this.pesel, landRegisterEntryDto.pesel) && fr.t.c(this.shortAddress, landRegisterEntryDto.shortAddress) && this.type == landRegisterEntryDto.type && fr.t.c(this.closingDate, landRegisterEntryDto.closingDate);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getOpen() {
        return this.open;
    }

    public final List<String> h() {
        return this.shortAddress;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((((((this.court.hashCode() * 31) + this.department.hashCode()) * 31) + this.id.hashCode()) * 31) + this.longAddress.hashCode()) * 31) + this.number.hashCode()) * 31) + Boolean.hashCode(this.open)) * 31) + this.pesel.hashCode()) * 31) + this.shortAddress.hashCode()) * 31) + this.type.hashCode()) * 31;
        OffsetDateTime offsetDateTime = this.closingDate;
        return iHashCode + (offsetDateTime == null ? 0 : offsetDateTime.hashCode());
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final s getType() {
        return this.type;
    }

    public String toString() {
        return "LandRegisterEntryDto(court=" + this.court + ", department=" + this.department + ", id=" + this.id + ", longAddress=" + this.longAddress + ", number=" + this.number + ", open=" + this.open + ", pesel=" + this.pesel + ", shortAddress=" + this.shortAddress + ", type=" + this.type + ", closingDate=" + this.closingDate + ')';
    }
}
