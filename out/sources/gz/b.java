package gz;

import gz.b.a;
import p071kotlin.Metadata;
import tq.e;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\u0004\b\u0001\u0010\u00032\u00020\u0004:\u0001\bJ\u0018\u0010\u0006\u001a\u00028\u00012\u0006\u0010\u0005\u001a\u00028\u0000H¦B¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lgz/b;", "Lgz/b$a;", "PARAMS", "RESULT", "", "params", "c", "(Lgz/b$a;Ltq/e;)Ljava/lang/Object;", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b<PARAMS extends a, RESULT> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003À\u0006\u0003"}, d2 = {"Lgz/b$a;", "", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: gz.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgz/b$a$a;", "Lgz/b$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1792a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1792a f78542a = new C1792a();

            private C1792a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1792a);
            }

            public int hashCode() {
                return -740182883;
            }

            public String toString() {
                return "Empty";
            }
        }
    }

    Object c(PARAMS params, e<? super RESULT> eVar);
}
