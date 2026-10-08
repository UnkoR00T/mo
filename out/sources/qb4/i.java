package qb4;

import fr.k;
import iy.a0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lqb4/i;", "Lgz/b;", "Lqb4/i$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends gz.b<Params, i0> {

    /* JADX INFO: renamed from: qb4.i$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lqb4/i$a;", "Lgz/b$a;", "Lqy/b;", "wrappedMasterKey", "Lpb4/d;", "biometricInAppStatus", "<init>", "(Liy/a0;Lpb4/d;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/a0;", "b", "()Liy/a0;", "Lpb4/d;", "()Lpb4/d;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 wrappedMasterKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final pb4.d biometricInAppStatus;

        public /* synthetic */ Params(a0 a0Var, pb4.d dVar, k kVar) {
            this(a0Var, dVar);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final pb4.d getBiometricInAppStatus() {
            return this.biometricInAppStatus;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a0 getWrappedMasterKey() {
            return this.wrappedMasterKey;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return qy.b.d(this.wrappedMasterKey, params.wrappedMasterKey) && this.biometricInAppStatus == params.biometricInAppStatus;
        }

        public int hashCode() {
            return (qy.b.e(this.wrappedMasterKey) * 31) + this.biometricInAppStatus.hashCode();
        }

        public String toString() {
            return "Params(wrappedMasterKey=" + qy.b.f(this.wrappedMasterKey) + ", biometricInAppStatus=" + this.biometricInAppStatus + ")";
        }

        private Params(a0 a0Var, pb4.d dVar) {
            this.wrappedMasterKey = a0Var;
            this.biometricInAppStatus = dVar;
        }
    }
}
