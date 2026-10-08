package g04;

import fr.t;
import iy.a0;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lg04/p;", "Lgz/b;", "Lg04/p$a;", "Liy/a0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p extends gz.b<a, a0> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lg04/p$a;", "Lgz/b$a;", "<init>", "()V", "b", "a", "Lg04/p$a$a;", "Lg04/p$a$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements gz.b.a {

        /* JADX INFO: renamed from: g04.p$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lg04/p$a$a;", "Lg04/p$a;", "Liy/a0;", "password", "pin", "<init>", "(Liy/a0;Liy/a0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/a0;", "()Liy/a0;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Bytes extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final a0 password;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final a0 pin;

            public Bytes(a0 a0Var, a0 a0Var2) {
                super(null);
                this.password = a0Var;
                this.pin = a0Var2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a0 getPassword() {
                return this.password;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final a0 getPin() {
                return this.pin;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Bytes)) {
                    return false;
                }
                Bytes bytes = (Bytes) other;
                return t.c(this.password, bytes.password) && t.c(this.pin, bytes.pin);
            }

            public int hashCode() {
                return (this.password.hashCode() * 31) + this.pin.hashCode();
            }

            public String toString() {
                return "Bytes(password=" + this.password + ", pin=" + this.pin + ")";
            }
        }

        /* JADX INFO: renamed from: g04.p$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lg04/p$a$b;", "Lg04/p$a;", "Liy/b0;", "password", "pin", "<init>", "(Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Chars extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 password;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 pin;

            public Chars(b0 b0Var, b0 b0Var2) {
                super(null);
                this.password = b0Var;
                this.pin = b0Var2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final b0 getPassword() {
                return this.password;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final b0 getPin() {
                return this.pin;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Chars)) {
                    return false;
                }
                Chars chars = (Chars) other;
                return t.c(this.password, chars.password) && t.c(this.pin, chars.pin);
            }

            public int hashCode() {
                return (this.password.hashCode() * 31) + this.pin.hashCode();
            }

            public String toString() {
                return "Chars(password=" + this.password + ", pin=" + this.pin + ")";
            }
        }

        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }
}
