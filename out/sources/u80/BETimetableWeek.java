package u80;

import java.time.LocalDate;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: u80.l0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u0019\u0010\u001cR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lu80/l0;", "", "", "Lu80/h0;", "days", "Ljava/time/LocalDate;", "minSelectionDate", "maxSelectionDate", "Lu80/w;", "message", "<init>", "(Ljava/util/List;Ljava/time/LocalDate;Ljava/time/LocalDate;Lu80/w;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Ljava/time/LocalDate;", "d", "()Ljava/time/LocalDate;", "c", "Lu80/w;", "()Lu80/w;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BETimetableWeek {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<BETimetableDay> days;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate minSelectionDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final LocalDate maxSelectionDate;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final BESchoolFamilyMessage message;

    public BETimetableWeek(List<BETimetableDay> list, LocalDate localDate, LocalDate localDate2, BESchoolFamilyMessage bESchoolFamilyMessage) {
        this.days = list;
        this.minSelectionDate = localDate;
        this.maxSelectionDate = localDate2;
        this.message = bESchoolFamilyMessage;
    }

    public final List<BETimetableDay> a() {
        return this.days;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final LocalDate getMaxSelectionDate() {
        return this.maxSelectionDate;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final BESchoolFamilyMessage getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final LocalDate getMinSelectionDate() {
        return this.minSelectionDate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BETimetableWeek)) {
            return false;
        }
        BETimetableWeek bETimetableWeek = (BETimetableWeek) other;
        return fr.t.c(this.days, bETimetableWeek.days) && fr.t.c(this.minSelectionDate, bETimetableWeek.minSelectionDate) && fr.t.c(this.maxSelectionDate, bETimetableWeek.maxSelectionDate) && fr.t.c(this.message, bETimetableWeek.message);
    }

    public int hashCode() {
        List<BETimetableDay> list = this.days;
        int iHashCode = (((((list == null ? 0 : list.hashCode()) * 31) + this.minSelectionDate.hashCode()) * 31) + this.maxSelectionDate.hashCode()) * 31;
        BESchoolFamilyMessage bESchoolFamilyMessage = this.message;
        return iHashCode + (bESchoolFamilyMessage != null ? bESchoolFamilyMessage.hashCode() : 0);
    }

    public String toString() {
        return "BETimetableWeek(days=" + this.days + ", minSelectionDate=" + this.minSelectionDate + ", maxSelectionDate=" + this.maxSelectionDate + ", message=" + this.message + ')';
    }
}
