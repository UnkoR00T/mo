package ch1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lch1/b0;", "Lgz/a;", "Lch1/b0$a;", "Lgx/b;", "a", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b0 extends gz.a<Params, gx.b> {

    /* JADX INFO: renamed from: ch1.b0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lch1/b0$a;", "Lgz/b$a;", "Lk34/u;", "identityType", "", "clearProcess", "<init>", "(Lk34/u;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lk34/u;", "b", "()Lk34/u;", "Z", "()Z", "dashboard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final k34.u identityType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean clearProcess;

        public Params(k34.u uVar, boolean z15) {
            this.identityType = uVar;
            this.clearProcess = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getClearProcess() {
            return this.clearProcess;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final k34.u getIdentityType() {
            return this.identityType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return this.identityType == params.identityType && this.clearProcess == params.clearProcess;
        }

        public int hashCode() {
            return (this.identityType.hashCode() * 31) + Boolean.hashCode(this.clearProcess);
        }

        public String toString() {
            return "Params(identityType=" + this.identityType + ", clearProcess=" + this.clearProcess + ')';
        }

        public /* synthetic */ Params(k34.u uVar, boolean z15, int i15, fr.k kVar) {
            this(uVar, (i15 & 2) != 0 ? false : z15);
        }
    }
}
