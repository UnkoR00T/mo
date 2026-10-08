package ea2;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;
import vl.c;

/* JADX INFO: renamed from: ea2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0004R\u001a\u0010\u0014\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u001a\u0010\u0018\u001a\u00020\u00158\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\f\u0010\u0017¨\u0006\u0019"}, d2 = {"Lea2/b;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "description", "Ljava/time/OffsetDateTime;", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "dateTime", "Lea2/b$a;", "Lea2/b$a;", "()Lea2/b$a;", "category", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserActivityDto {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    @c("description")
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    @c("dateTime")
    private final OffsetDateTime dateTime;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @c("category")
    private final a category;

    /* JADX INFO: renamed from: ea2.b$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lea2/b$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        DATA_LOAD("DATA_LOAD"),
        REVOCATION("REVOCATION"),
        DATA_TRANSFER("DATA_TRANSFER"),
        VERIFICATION("VERIFICATION"),
        OTHER("OTHER"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ wq.a f48991j = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getDateTime() {
        return this.dateTime;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserActivityDto)) {
            return false;
        }
        UserActivityDto userActivityDto = (UserActivityDto) other;
        return t.c(this.description, userActivityDto.description) && t.c(this.dateTime, userActivityDto.dateTime) && this.category == userActivityDto.category;
    }

    public int hashCode() {
        return (((this.description.hashCode() * 31) + this.dateTime.hashCode()) * 31) + this.category.hashCode();
    }

    public String toString() {
        return "UserActivityDto(description=" + this.description + ", dateTime=" + this.dateTime + ", category=" + this.category + ')';
    }
}
