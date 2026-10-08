package ml0;

import al0.x0;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lml0/e;", "", "Lml0/e$a;", "Lal0/m;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends gz.b {

    /* JADX INFO: renamed from: ml0.e$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lml0/e$a;", "Lgz/b$a;", "Lal0/a;", "accessToken", "Lal0/x0;", "data", "<init>", "(Liy/b0;Lal0/x0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lal0/x0;", "()Lal0/x0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 accessToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final x0 data;

        public /* synthetic */ Params(b0 b0Var, x0 x0Var, fr.k kVar) {
            this(b0Var, x0Var);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getAccessToken() {
            return this.accessToken;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final x0 getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return al0.a.b(this.accessToken, params.accessToken) && fr.t.c(this.data, params.data);
        }

        public int hashCode() {
            return (al0.a.c(this.accessToken) * 31) + this.data.hashCode();
        }

        public String toString() {
            return "Params(accessToken=" + al0.a.d(this.accessToken) + ", data=" + this.data + ")";
        }

        private Params(b0 b0Var, x0 x0Var) {
            this.accessToken = b0Var;
            this.data = x0Var;
        }
    }
}
