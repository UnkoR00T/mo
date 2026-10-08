package ia2;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ia2.b, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0019\u001a\u0004\b\u0013\u0010\u001a¨\u0006\u001b"}, d2 = {"Lia2/b;", "", "", "description", "Ljava/time/OffsetDateTime;", "date", "Lia2/b$a;", "category", "<init>", "(Ljava/lang/String;Ljava/time/OffsetDateTime;Lia2/b$a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "c", "b", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "Lia2/b$a;", "()Lia2/b$a;", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class UserActivityLog {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final OffsetDateTime date;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final a category;

    /* JADX INFO: renamed from: ia2.b$a */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lia2/b$a;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "a", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "b", "c", "d", "e", "f", "g", "history_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        DATA_LOAD("DATA_LOAD"),
        REVOCATION("REVOCATION"),
        DATA_TRANSFER("DATA_TRANSFER"),
        VERIFICATION("VERIFICATION"),
        OTHER("OTHER"),
        UNKNOWN("UNKNOWN");


        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final /* synthetic */ wq.a f90670j = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String value;

        a(String str) {
            this.value = str;
        }
    }

    public UserActivityLog(String str, OffsetDateTime offsetDateTime, a aVar) {
        this.description = str;
        this.date = offsetDateTime;
        this.category = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getCategory() {
        return this.category;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final OffsetDateTime getDate() {
        return this.date;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserActivityLog)) {
            return false;
        }
        UserActivityLog userActivityLog = (UserActivityLog) other;
        return t.c(this.description, userActivityLog.description) && t.c(this.date, userActivityLog.date) && this.category == userActivityLog.category;
    }

    public int hashCode() {
        return (((this.description.hashCode() * 31) + this.date.hashCode()) * 31) + this.category.hashCode();
    }

    public String toString() {
        return "UserActivityLog(description=" + this.description + ", date=" + this.date + ", category=" + this.category + ')';
    }
}
