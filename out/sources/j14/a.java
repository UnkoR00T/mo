package j14;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lj14/a;", "Lgz/b;", "Lj14/a$a;", "Lhz/g;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends gz.b<Params, hz.g> {

    /* JADX INFO: renamed from: j14.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001a\u001a\u0004\b\u0016\u0010\u001b¨\u0006\u001c"}, d2 = {"Lj14/a$a;", "Lgz/b$a;", "Liy/b0;", "email", "", "isRequired", "", "maxLengthOverride", "<init>", "(Liy/b0;ZLjava/lang/Integer;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Z", "c", "()Z", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isRequired;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer maxLengthOverride;

        public Params(b0 b0Var, boolean z15, Integer num) {
            this.email = b0Var;
            this.isRequired = z15;
            this.maxLengthOverride = num;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Integer getMaxLengthOverride() {
            return this.maxLengthOverride;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsRequired() {
            return this.isRequired;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.email, params.email) && this.isRequired == params.isRequired && t.c(this.maxLengthOverride, params.maxLengthOverride);
        }

        public int hashCode() {
            int iHashCode = ((this.email.hashCode() * 31) + Boolean.hashCode(this.isRequired)) * 31;
            Integer num = this.maxLengthOverride;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        public String toString() {
            return "Params(email=" + this.email + ", isRequired=" + this.isRequired + ", maxLengthOverride=" + this.maxLengthOverride + ")";
        }

        public /* synthetic */ Params(b0 b0Var, boolean z15, Integer num, int i15, fr.k kVar) {
            this(b0Var, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? null : num);
        }
    }
}
