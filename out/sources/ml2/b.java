package ml2;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u000b\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lml2/b;", "Lgz/a;", "Lml2/b$a;", "", "Lez/e;", "dateFormatter", "Lez/a;", "currentTimeProvider", "<init>", "(Lez/e;Lez/a;)V", "params", "b", "(Lml2/b$a;)Ljava/lang/String;", "a", "Lez/e;", "Lez/a;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.a<Param, String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.a currentTimeProvider;

    /* JADX INFO: renamed from: ml2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lml2/b$a;", "Lgz/b$a;", "", "prefix", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Param implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String prefix;

        public Param(String str) {
            this.prefix = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getPrefix() {
            return this.prefix;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Param) && t.c(this.prefix, ((Param) other).prefix);
        }

        public int hashCode() {
            return this.prefix.hashCode();
        }

        public String toString() {
            return "Param(prefix=" + this.prefix + ')';
        }
    }

    public b(ez.e eVar, ez.a aVar) {
        this.dateFormatter = eVar;
        this.currentTimeProvider = aVar;
    }

    public String b(Param params) {
        return params.getPrefix() + '_' + this.dateFormatter.d(new fz.b.LocalDateTime(this.currentTimeProvider.i()), fz.c.FULL_TIME_WITHOUT_MS) + ".pdf";
    }
}
