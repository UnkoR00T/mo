package k23;

import fr.t;
import java.time.LocalDate;
import java.time.OffsetTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: k23.g, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b\u0018\u0010\rR\u0013\u0010#\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\"¨\u0006$"}, d2 = {"Lk23/g;", "", "Lk23/f;", "dateAnswer", "Lfz/b$c;", "selectedDate", "Lfz/b$g;", "selectedTime", "", "description", "<init>", "(Lk23/f;Lfz/b$c;Lfz/b$g;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk23/f;", "()Lk23/f;", "b", "Lfz/b$c;", "d", "()Lfz/b$c;", "c", "Lfz/b$g;", "e", "()Lfz/b$g;", "Ljava/lang/String;", "Lfz/b$f;", "()Lfz/b$f;", "finalSelectedDateTime", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DetailsModel {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f107684e = fz.b.OffsetTime.f68867b | fz.b.LocalDate.f68860b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final f dateAnswer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.LocalDate selectedDate;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final fz.b.OffsetTime selectedTime;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    public DetailsModel(f fVar, fz.b.LocalDate localDate, fz.b.OffsetTime offsetTime, String str) {
        this.dateAnswer = fVar;
        this.selectedDate = localDate;
        this.selectedTime = offsetTime;
        this.description = str;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final f getDateAnswer() {
        return this.dateAnswer;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final fz.b.OffsetDateTime c() {
        fz.b.LocalDate localDate = this.selectedDate;
        LocalDate date = localDate != null ? localDate.getDate() : null;
        fz.b.OffsetTime offsetTime = this.selectedTime;
        OffsetTime date2 = offsetTime != null ? offsetTime.getDate() : null;
        if (this.dateAnswer == f.NO || date == null || date2 == null) {
            return null;
        }
        return new fz.b.OffsetDateTime(date.atTime(date2));
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fz.b.LocalDate getSelectedDate() {
        return this.selectedDate;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final fz.b.OffsetTime getSelectedTime() {
        return this.selectedTime;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DetailsModel)) {
            return false;
        }
        DetailsModel detailsModel = (DetailsModel) other;
        return this.dateAnswer == detailsModel.dateAnswer && t.c(this.selectedDate, detailsModel.selectedDate) && t.c(this.selectedTime, detailsModel.selectedTime) && t.c(this.description, detailsModel.description);
    }

    public int hashCode() {
        int iHashCode = this.dateAnswer.hashCode() * 31;
        fz.b.LocalDate localDate = this.selectedDate;
        int iHashCode2 = (iHashCode + (localDate == null ? 0 : localDate.hashCode())) * 31;
        fz.b.OffsetTime offsetTime = this.selectedTime;
        return ((iHashCode2 + (offsetTime != null ? offsetTime.hashCode() : 0)) * 31) + this.description.hashCode();
    }

    public String toString() {
        return "DetailsModel(dateAnswer=" + this.dateAnswer + ", selectedDate=" + this.selectedDate + ", selectedTime=" + this.selectedTime + ", description=" + this.description + ')';
    }
}
