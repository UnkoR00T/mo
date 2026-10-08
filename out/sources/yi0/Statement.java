package yi0;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yi0.i, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u0019\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0018\u001a\u0004\b\u001a\u0010\fR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lyi0/i;", "", "Ljava/time/LocalDate;", "creationDate", "", "deprivationPeriod", "finalDate", "organ", "signature", "<init>", "(Ljava/time/LocalDate;Ljava/lang/String;Ljava/time/LocalDate;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "b", "Ljava/lang/String;", "c", "d", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Statement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate creationDate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String deprivationPeriod;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate finalDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String organ;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final String signature;

    public Statement(LocalDate localDate, String str, LocalDate localDate2, String str2, String str3) {
        this.creationDate = localDate;
        this.deprivationPeriod = str;
        this.finalDate = localDate2;
        this.organ = str2;
        this.signature = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final LocalDate getCreationDate() {
        return this.creationDate;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDeprivationPeriod() {
        return this.deprivationPeriod;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final LocalDate getFinalDate() {
        return this.finalDate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getOrgan() {
        return this.organ;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getSignature() {
        return this.signature;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Statement)) {
            return false;
        }
        Statement statement = (Statement) other;
        return t.c(this.creationDate, statement.creationDate) && t.c(this.deprivationPeriod, statement.deprivationPeriod) && t.c(this.finalDate, statement.finalDate) && t.c(this.organ, statement.organ) && t.c(this.signature, statement.signature);
    }

    public int hashCode() {
        LocalDate localDate = this.creationDate;
        int iHashCode = (localDate == null ? 0 : localDate.hashCode()) * 31;
        String str = this.deprivationPeriod;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        LocalDate localDate2 = this.finalDate;
        return ((((iHashCode2 + (localDate2 != null ? localDate2.hashCode() : 0)) * 31) + this.organ.hashCode()) * 31) + this.signature.hashCode();
    }

    public String toString() {
        return "Statement(creationDate=" + this.creationDate + ", deprivationPeriod=" + this.deprivationPeriod + ", finalDate=" + this.finalDate + ", organ=" + this.organ + ", signature=" + this.signature + ")";
    }
}
