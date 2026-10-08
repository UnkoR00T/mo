package a14;

import java.time.OffsetDateTime;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"La14/i;", "Lgz/a;", "La14/i$a;", "Lmx/a;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends gz.a<Params, Label> {

    /* JADX INFO: renamed from: a14.i$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"La14/i$a;", "Lgz/b$a;", "Ljava/time/OffsetDateTime;", "date", "Lfz/f;", "timeZoneId", "<init>", "(Ljava/time/OffsetDateTime;Lfz/f;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "b", "Lfz/f;", "()Lfz/f;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime date;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.f timeZoneId;

        public Params(OffsetDateTime offsetDateTime, fz.f fVar) {
            this.date = offsetDateTime;
            this.timeZoneId = fVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final OffsetDateTime getDate() {
            return this.date;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final fz.f getTimeZoneId() {
            return this.timeZoneId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.date, params.date) && this.timeZoneId == params.timeZoneId;
        }

        public int hashCode() {
            int iHashCode = this.date.hashCode() * 31;
            fz.f fVar = this.timeZoneId;
            return iHashCode + (fVar == null ? 0 : fVar.hashCode());
        }

        public String toString() {
            return "Params(date=" + this.date + ", timeZoneId=" + this.timeZoneId + ")";
        }

        public /* synthetic */ Params(OffsetDateTime offsetDateTime, fz.f fVar, int i15, fr.k kVar) {
            this(offsetDateTime, (i15 & 2) != 0 ? null : fVar);
        }
    }
}
