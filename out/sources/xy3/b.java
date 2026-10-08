package xy3;

import fr.k;
import fr.t;
import iy.b0;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00060\u0001:\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lxy3/b;", "Lgz/b;", "Lxy3/b$a;", "", "Lwy3/a;", "", "Lpl/gov/coi/mobywatel/segment/setpassword/contract/model/PasswordRequirements;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends gz.b<Params, Map<wy3.a, ? extends Boolean>> {

    /* JADX INFO: renamed from: xy3.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\t¨\u0006\u0017"}, d2 = {"Lxy3/b$a;", "Lgz/b$a;", "Liy/b0;", "password", "", "validPasswordAccessibilityMessage", "<init>", "(Liy/b0;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 password;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String validPasswordAccessibilityMessage;

        public Params(b0 b0Var, String str) {
            this.password = b0Var;
            this.validPasswordAccessibilityMessage = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getPassword() {
            return this.password;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getValidPasswordAccessibilityMessage() {
            return this.validPasswordAccessibilityMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.password, params.password) && t.c(this.validPasswordAccessibilityMessage, params.validPasswordAccessibilityMessage);
        }

        public int hashCode() {
            int iHashCode = this.password.hashCode() * 31;
            String str = this.validPasswordAccessibilityMessage;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "Params(password=" + this.password + ", validPasswordAccessibilityMessage=" + this.validPasswordAccessibilityMessage + ")";
        }

        public /* synthetic */ Params(b0 b0Var, String str, int i15, k kVar) {
            this(b0Var, (i15 & 2) != 0 ? null : str);
        }
    }
}
