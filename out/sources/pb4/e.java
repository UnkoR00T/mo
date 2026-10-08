package pb4;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lpb4/e;", "", "b", "a", "Lpb4/e$a;", "Lpb4/e$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lpb4/e$a;", "Lpb4/e;", "a", "b", "Lpb4/e$a$a;", "Lpb4/e$a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends e {

        /* JADX INFO: renamed from: pb4.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpb4/e$a$a;", "Lpb4/e$a;", "<init>", "()V", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C3815a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3815a f154090a = new C3815a();

            private C3815a() {
            }
        }

        /* JADX INFO: renamed from: pb4.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lpb4/e$a$b;", "Lpb4/e$a;", "", "appRecentlyDeactivated", "Ldx/b;", "domainError", "<init>", "(ZLdx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Ldx/b;", "()Ldx/b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class System implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean appRecentlyDeactivated;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b domainError;

            public System(boolean z15, dx.b bVar) {
                this.appRecentlyDeactivated = z15;
                this.domainError = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final boolean getAppRecentlyDeactivated() {
                return this.appRecentlyDeactivated;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final dx.b getDomainError() {
                return this.domainError;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof System)) {
                    return false;
                }
                System system = (System) other;
                return this.appRecentlyDeactivated == system.appRecentlyDeactivated && t.c(this.domainError, system.domainError);
            }

            public int hashCode() {
                return (Boolean.hashCode(this.appRecentlyDeactivated) * 31) + this.domainError.hashCode();
            }

            public String toString() {
                return "System(appRecentlyDeactivated=" + this.appRecentlyDeactivated + ", domainError=" + this.domainError + ")";
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lpb4/e$b;", "Lpb4/e;", "<init>", "()V", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f154093a = new b();

        private b() {
        }
    }
}
