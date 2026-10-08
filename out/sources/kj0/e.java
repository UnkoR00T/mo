package kj0;

import fr.t;
import java.time.LocalDate;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001:\u0001\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lkj0/e;", "", "Lkj0/e$a;", "", "Lcj0/m;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends gz.b {

    /* JADX INFO: renamed from: kj0.e$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lkj0/e$a;", "Lgz/b$a;", "", "topicId", "", "departmentId", "Ljava/time/LocalDate;", "visitDate", "<init>", "(Ljava/lang/String;JLjava/time/LocalDate;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "J", "()J", "c", "Ljava/time/LocalDate;", "()Ljava/time/LocalDate;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String topicId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long departmentId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final LocalDate visitDate;

        public Params(String str, long j15, LocalDate localDate) {
            this.topicId = str;
            this.departmentId = j15;
            this.visitDate = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final long getDepartmentId() {
            return this.departmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getTopicId() {
            return this.topicId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final LocalDate getVisitDate() {
            return this.visitDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.topicId, params.topicId) && this.departmentId == params.departmentId && t.c(this.visitDate, params.visitDate);
        }

        public int hashCode() {
            return (((this.topicId.hashCode() * 31) + Long.hashCode(this.departmentId)) * 31) + this.visitDate.hashCode();
        }

        public String toString() {
            return "Params(topicId=" + this.topicId + ", departmentId=" + this.departmentId + ", visitDate=" + this.visitDate + ")";
        }
    }
}
