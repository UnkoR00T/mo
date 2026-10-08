package yi0;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yi0.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00022\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b!\u0010\u0012R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b\"\u0010\u0012R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b#\u0010%R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010\u001d\u001a\u0004\b&\u0010\u0012R\u0019\u0010\r\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b(\u0010\u0012¨\u0006)"}, d2 = {"Lyi0/e;", "", "", "changeVoteAreaAvailability", "", "commune", "Ljava/time/LocalDate;", "electionsDate", "electionsName", "number", "Lyi0/b;", "okwAddress", "okwName", "temporaryOkwAddress", "temporaryOkwName", "<init>", "(ZLjava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;Lyi0/b;Ljava/lang/String;Lyi0/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ljava/lang/String;", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "d", "e", "f", "Lyi0/b;", "()Lyi0/b;", "g", "h", "i", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ElectionsArea {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean changeVoteAreaAvailability;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commune;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate electionsDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String electionsName;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final CitizenAddress okwAddress;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final String okwName;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final CitizenAddress temporaryOkwAddress;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String temporaryOkwName;

    public ElectionsArea(boolean z15, String str, LocalDate localDate, String str2, String str3, CitizenAddress citizenAddress, String str4, CitizenAddress citizenAddress2, String str5) {
        this.changeVoteAreaAvailability = z15;
        this.commune = str;
        this.electionsDate = localDate;
        this.electionsName = str2;
        this.number = str3;
        this.okwAddress = citizenAddress;
        this.okwName = str4;
        this.temporaryOkwAddress = citizenAddress2;
        this.temporaryOkwName = str5;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getChangeVoteAreaAvailability() {
        return this.changeVoteAreaAvailability;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getCommune() {
        return this.commune;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getElectionsDate() {
        return this.electionsDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getElectionsName() {
        return this.electionsName;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElectionsArea)) {
            return false;
        }
        ElectionsArea electionsArea = (ElectionsArea) other;
        return this.changeVoteAreaAvailability == electionsArea.changeVoteAreaAvailability && t.c(this.commune, electionsArea.commune) && t.c(this.electionsDate, electionsArea.electionsDate) && t.c(this.electionsName, electionsArea.electionsName) && t.c(this.number, electionsArea.number) && t.c(this.okwAddress, electionsArea.okwAddress) && t.c(this.okwName, electionsArea.okwName) && t.c(this.temporaryOkwAddress, electionsArea.temporaryOkwAddress) && t.c(this.temporaryOkwName, electionsArea.temporaryOkwName);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final CitizenAddress getOkwAddress() {
        return this.okwAddress;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getOkwName() {
        return this.okwName;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final CitizenAddress getTemporaryOkwAddress() {
        return this.temporaryOkwAddress;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((Boolean.hashCode(this.changeVoteAreaAvailability) * 31) + this.commune.hashCode()) * 31) + this.electionsDate.hashCode()) * 31) + this.electionsName.hashCode()) * 31) + this.number.hashCode()) * 31) + this.okwAddress.hashCode()) * 31) + this.okwName.hashCode()) * 31;
        CitizenAddress citizenAddress = this.temporaryOkwAddress;
        int iHashCode2 = (iHashCode + (citizenAddress == null ? 0 : citizenAddress.hashCode())) * 31;
        String str = this.temporaryOkwName;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTemporaryOkwName() {
        return this.temporaryOkwName;
    }

    public String toString() {
        return "ElectionsArea(changeVoteAreaAvailability=" + this.changeVoteAreaAvailability + ", commune=" + this.commune + ", electionsDate=" + this.electionsDate + ", electionsName=" + this.electionsName + ", number=" + this.number + ", okwAddress=" + this.okwAddress + ", okwName=" + this.okwName + ", temporaryOkwAddress=" + this.temporaryOkwAddress + ", temporaryOkwName=" + this.temporaryOkwName + ")";
    }
}
