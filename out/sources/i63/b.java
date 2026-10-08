package i63;

import fr.k;
import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\t\u0006B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Li63/b;", "", "Liy/b0;", "contact", "<init>", "(Liy/b0;)V", "a", "Liy/b0;", "()Liy/b0;", "b", "Li63/b$a;", "Li63/b$b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f89817b = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0 contact;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Li63/b$a;", "Li63/b;", "Liy/b0;", "email", "<init>", "(Liy/b0;)V", "c", "Liy/b0;", "getEmail", "()Liy/b0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a extends b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f89819d = b0.f97726c;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final b0 email;

        public a(b0 b0Var) {
            super(c0.g(r.u1(c0.e(b0Var)).toString()), null);
            this.email = b0Var;
        }
    }

    /* JADX INFO: renamed from: i63.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Li63/b$b;", "Li63/b;", "Liy/b0;", "prefix", "phoneNumber", "<init>", "(Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Liy/b0;", "()Liy/b0;", "d", "b", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f89821e = b0.f97726c;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 prefix;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 phoneNumber;

        public Phone(b0 b0Var, b0 b0Var2) {
            super(c0.g('+' + r.u1(c0.e(b0Var)).toString() + ' ' + r.u1(c0.e(b0Var2)).toString()), null);
            this.prefix = b0Var;
            this.phoneNumber = b0Var2;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPrefix() {
            return this.prefix;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            return t.c(this.prefix, phone.prefix) && t.c(this.phoneNumber, phone.phoneNumber);
        }

        public int hashCode() {
            return (this.prefix.hashCode() * 31) + this.phoneNumber.hashCode();
        }

        public String toString() {
            return "Phone(prefix=" + this.prefix + ", phoneNumber=" + this.phoneNumber + ')';
        }
    }

    public /* synthetic */ b(b0 b0Var, k kVar) {
        this(b0Var);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getContact() {
        return this.contact;
    }

    private b(b0 b0Var) {
        this.contact = b0Var;
    }
}
