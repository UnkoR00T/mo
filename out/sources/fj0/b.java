package fj0;

import fr.k;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lfj0/b;", "", "Lfj0/b$a;", "Lxi0/f;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends gz.b {

    /* JADX INFO: renamed from: fj0.b$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0018\u001a\u0004\b\u0017\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lfj0/b$a;", "Lgz/b$a;", "", "code", "Liy/b0;", "prefix", "phoneNumber", "Lny/a;", "wkToken", "<init>", "(Ljava/lang/String;Liy/b0;Liy/b0;Liy/b0;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Liy/b0;", "c", "()Liy/b0;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String code;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 prefix;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 phoneNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 wkToken;

        public /* synthetic */ Params(String str, b0 b0Var, b0 b0Var2, b0 b0Var3, k kVar) {
            this(str, b0Var, b0Var2, b0Var3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getCode() {
            return this.code;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPrefix() {
            return this.prefix;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getWkToken() {
            return this.wkToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.code, params.code) && t.c(this.prefix, params.prefix) && t.c(this.phoneNumber, params.phoneNumber) && ny.a.d(this.wkToken, params.wkToken);
        }

        public int hashCode() {
            return (((((this.code.hashCode() * 31) + this.prefix.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + ny.a.e(this.wkToken);
        }

        public String toString() {
            return "Params(code=" + this.code + ", prefix=" + this.prefix + ", phoneNumber=" + this.phoneNumber + ", wkToken=" + ny.a.f(this.wkToken) + ")";
        }

        private Params(String str, b0 b0Var, b0 b0Var2, b0 b0Var3) {
            this.code = str;
            this.prefix = b0Var;
            this.phoneNumber = b0Var2;
            this.wkToken = b0Var3;
        }
    }
}
