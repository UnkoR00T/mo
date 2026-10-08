package u80;

import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: u80.i0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u0016R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b \u0010-R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010$\u001a\u0004\b\u001b\u0010\u0014R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b#\u0010\u0014¨\u0006."}, d2 = {"Lu80/i0;", "", "Ljava/time/OffsetDateTime;", "fromTime", "toTime", "", "number", "", "title", "Lu80/k0;", "type", "Lu80/j0;", "state", "Lu80/e0;", "iconType", "classNumber", "lessonId", "<init>", "(Ljava/time/OffsetDateTime;Ljava/time/OffsetDateTime;ILjava/lang/String;Lu80/k0;Lu80/j0;Lu80/e0;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "b", "()Ljava/time/OffsetDateTime;", "h", "c", "I", "e", "d", "Ljava/lang/String;", "g", "Lu80/k0;", "i", "()Lu80/k0;", "f", "Lu80/j0;", "()Lu80/j0;", "Lu80/e0;", "()Lu80/e0;", "educationservice_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BETimetableSlot {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime fromTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime toTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int number;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String title;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final k0 type;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final j0 state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final e0 iconType;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final String classNumber;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final String lessonId;

    public BETimetableSlot(OffsetDateTime offsetDateTime, OffsetDateTime offsetDateTime2, int i15, String str, k0 k0Var, j0 j0Var, e0 e0Var, String str2, String str3) {
        this.fromTime = offsetDateTime;
        this.toTime = offsetDateTime2;
        this.number = i15;
        this.title = str;
        this.type = k0Var;
        this.state = j0Var;
        this.iconType = e0Var;
        this.classNumber = str2;
        this.lessonId = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getClassNumber() {
        return this.classNumber;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getFromTime() {
        return this.fromTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e0 getIconType() {
        return this.iconType;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getNumber() {
        return this.number;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BETimetableSlot)) {
            return false;
        }
        BETimetableSlot bETimetableSlot = (BETimetableSlot) other;
        return fr.t.c(this.fromTime, bETimetableSlot.fromTime) && fr.t.c(this.toTime, bETimetableSlot.toTime) && this.number == bETimetableSlot.number && fr.t.c(this.title, bETimetableSlot.title) && this.type == bETimetableSlot.type && this.state == bETimetableSlot.state && this.iconType == bETimetableSlot.iconType && fr.t.c(this.classNumber, bETimetableSlot.classNumber) && fr.t.c(this.lessonId, bETimetableSlot.lessonId);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final j0 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final OffsetDateTime getToTime() {
        return this.toTime;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.fromTime.hashCode() * 31) + this.toTime.hashCode()) * 31) + Integer.hashCode(this.number)) * 31) + this.title.hashCode()) * 31) + this.type.hashCode()) * 31) + this.state.hashCode()) * 31) + this.iconType.hashCode()) * 31;
        String str = this.classNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.lessonId;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final k0 getType() {
        return this.type;
    }

    public String toString() {
        return "BETimetableSlot(fromTime=" + this.fromTime + ", toTime=" + this.toTime + ", number=" + this.number + ", title=" + this.title + ", type=" + this.type + ", state=" + this.state + ", iconType=" + this.iconType + ", classNumber=" + this.classNumber + ", lessonId=" + this.lessonId + ')';
    }
}
