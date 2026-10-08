package p077m74;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lm74/b;", "", "<init>", "()V", "a", "b", "Lm74/b$a;", "Lm74/b$b;", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: m74.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lm74/b$a;", "Lm74/b;", "Ll74/b;", "lockOrigin", "<init>", "(Ll74/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll74/b;", "getLockOrigin", "()Ll74/b;", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Empty extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l74.b lockOrigin;

        public Empty(l74.b bVar) {
            super(null);
            this.lockOrigin = bVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Empty) && this.lockOrigin == ((Empty) other).lockOrigin;
        }

        public int hashCode() {
            return this.lockOrigin.hashCode();
        }

        public String toString() {
            return "Empty(lockOrigin=" + this.lockOrigin + ')';
        }
    }

    /* JADX INFO: renamed from: m74.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lm74/b$b;", "Lm74/b;", "Ll74/b;", "lockOrigin", "Lgu/b;", "timeLeft", "<init>", "(Ll74/b;JLfr/k;)V", "a", "(Ll74/b;J)Lm74/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ll74/b;", "c", "()Ll74/b;", "b", "J", "d", "()J", "applicationlock_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final l74.b lockOrigin;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final long timeLeft;

        public /* synthetic */ Initialized(l74.b bVar, long j15, k kVar) {
            this(bVar, j15);
        }

        public static /* synthetic */ Initialized b(Initialized initialized, l74.b bVar, long j15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                bVar = initialized.lockOrigin;
            }
            if ((i15 & 2) != 0) {
                j15 = initialized.timeLeft;
            }
            return initialized.a(bVar, j15);
        }

        public final Initialized a(l74.b lockOrigin, long timeLeft) {
            return new Initialized(lockOrigin, timeLeft, null);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final l74.b getLockOrigin() {
            return this.lockOrigin;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getTimeLeft() {
            return this.timeLeft;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return this.lockOrigin == initialized.lockOrigin && gu.b.v(this.timeLeft, initialized.timeLeft);
        }

        public int hashCode() {
            return (this.lockOrigin.hashCode() * 31) + gu.b.N(this.timeLeft);
        }

        public String toString() {
            return "Initialized(lockOrigin=" + this.lockOrigin + ", timeLeft=" + ((Object) gu.b.d0(this.timeLeft)) + ')';
        }

        private Initialized(l74.b bVar, long j15) {
            super(null);
            this.lockOrigin = bVar;
            this.timeLeft = j15;
        }
    }

    public /* synthetic */ b(k kVar) {
        this();
    }

    private b() {
    }
}
