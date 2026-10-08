package ut0;

import fr.t;
import p071kotlin.Metadata;
import tt0.BEAttachments;
import tt0.s;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lut0/e;", "", "Lut0/e$a;", "Ltt0/t;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends gz.b {

    /* JADX INFO: renamed from: ut0.e$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lut0/e$a;", "Lgz/b$a;", "Ltt0/s;", "report", "Ltt0/a;", "attachments", "<init>", "(Ltt0/s;Ltt0/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltt0/s;", "b", "()Ltt0/s;", "Ltt0/a;", "()Ltt0/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s report;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEAttachments attachments;

        public Params(s sVar, BEAttachments bEAttachments) {
            this.report = sVar;
            this.attachments = bEAttachments;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BEAttachments getAttachments() {
            return this.attachments;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final s getReport() {
            return this.report;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.report, params.report) && t.c(this.attachments, params.attachments);
        }

        public int hashCode() {
            int iHashCode = this.report.hashCode() * 31;
            BEAttachments bEAttachments = this.attachments;
            return iHashCode + (bEAttachments == null ? 0 : bEAttachments.hashCode());
        }

        public String toString() {
            return "Params(report=" + this.report + ", attachments=" + this.attachments + ")";
        }
    }
}
