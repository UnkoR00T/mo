package ws2;

import fr.t;
import java.time.OffsetDateTime;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\u000fB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lws2/i;", "Lgz/b;", "Lws2/i$a;", "Lhz/g;", "Lez/a;", "currentTimeProvider", "Lmx/c;", "labelProvider", "Lhz/e;", "validatorDate", "<init>", "(Lez/a;Lmx/c;Lhz/e;)V", "params", "d", "(Lws2/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lez/a;", "b", "Lmx/c;", "c", "Lhz/e;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b<Params, hz.g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final hz.e validatorDate;

    /* JADX INFO: renamed from: ws2.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lws2/i$a;", "Lgz/b$a;", "Ljava/time/OffsetDateTime;", "pickedDateTime", "<init>", "(Ljava/time/OffsetDateTime;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/time/OffsetDateTime;", "()Ljava/time/OffsetDateTime;", "peselrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OffsetDateTime pickedDateTime;

        public Params(OffsetDateTime offsetDateTime) {
            this.pickedDateTime = offsetDateTime;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final OffsetDateTime getPickedDateTime() {
            return this.pickedDateTime;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.pickedDateTime, ((Params) other).pickedDateTime);
        }

        public int hashCode() {
            return this.pickedDateTime.hashCode();
        }

        public String toString() {
            return "Params(pickedDateTime=" + this.pickedDateTime + ')';
        }
    }

    public i(ez.a aVar, mx.c cVar, hz.e eVar) {
        this.currentTimeProvider = aVar;
        this.labelProvider = cVar;
        this.validatorDate = eVar;
    }

    public Object d(Params params, tq.e<? super hz.g> eVar) {
        return this.validatorDate.j(ts2.a.a(), this.currentTimeProvider.f(), this.labelProvider.c(rs2.a.f175927u0)).a(params.getPickedDateTime());
    }
}
