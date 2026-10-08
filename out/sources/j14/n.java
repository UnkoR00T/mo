package j14;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lj14/n;", "Lgz/b;", "Lj14/n$a;", "Lhz/g;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface n extends gz.b<a, hz.g> {

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u000e\b\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lj14/n$a;", "Lgz/b$a;", "Liy/b0;", "text", "", "isRequired", "<init>", "(Liy/b0;Z)V", "a", "Liy/b0;", "()Liy/b0;", "b", "Z", "()Z", "c", "Lj14/n$a$a;", "Lj14/n$a$b;", "Lj14/n$a$c;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 text;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isRequired;

        /* JADX INFO: renamed from: j14.n$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lj14/n$a$a;", "Lj14/n$a;", "Lxw/h;", "phoneNumber", "", "isRequired", "<init>", "(Lxw/h;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Lxw/h;", "()Lxw/h;", "d", "Z", "b", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckNumber extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneNumber phoneNumber;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isRequired;

            public /* synthetic */ CheckNumber(PhoneNumber phoneNumber, boolean z15, int i15, fr.k kVar) {
                this(phoneNumber, (i15 & 2) != 0 ? true : z15);
            }

            @Override // j14.n.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIsRequired() {
                return this.isRequired;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final PhoneNumber getPhoneNumber() {
                return this.phoneNumber;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckNumber)) {
                    return false;
                }
                CheckNumber checkNumber = (CheckNumber) other;
                return t.c(this.phoneNumber, checkNumber.phoneNumber) && this.isRequired == checkNumber.isRequired;
            }

            public int hashCode() {
                return (this.phoneNumber.hashCode() * 31) + Boolean.hashCode(this.isRequired);
            }

            public String toString() {
                return "CheckNumber(phoneNumber=" + this.phoneNumber + ", isRequired=" + this.isRequired + ")";
            }

            public CheckNumber(PhoneNumber phoneNumber, boolean z15) {
                super(phoneNumber.g(), z15, null);
                this.phoneNumber = phoneNumber;
                this.isRequired = z15;
            }
        }

        /* JADX INFO: renamed from: j14.n$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lj14/n$a$b;", "Lj14/n$a;", "Liy/b0;", "number", "", "isRequired", "<init>", "(Liy/b0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Liy/b0;", "getNumber", "()Liy/b0;", "d", "Z", "b", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckNumberPolishOnly extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final b0 number;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isRequired;

            public CheckNumberPolishOnly(b0 b0Var, boolean z15) {
                super(b0Var, z15, null);
                this.number = b0Var;
                this.isRequired = z15;
            }

            @Override // j14.n.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIsRequired() {
                return this.isRequired;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckNumberPolishOnly)) {
                    return false;
                }
                CheckNumberPolishOnly checkNumberPolishOnly = (CheckNumberPolishOnly) other;
                return t.c(this.number, checkNumberPolishOnly.number) && this.isRequired == checkNumberPolishOnly.isRequired;
            }

            public int hashCode() {
                return (this.number.hashCode() * 31) + Boolean.hashCode(this.isRequired);
            }

            public String toString() {
                return "CheckNumberPolishOnly(number=" + this.number + ", isRequired=" + this.isRequired + ")";
            }
        }

        /* JADX INFO: renamed from: j14.n$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lj14/n$a$c;", "Lj14/n$a;", "Lxw/h;", "phoneNumber", "", "isRequired", "<init>", "(Lxw/h;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "c", "Lxw/h;", "getPhoneNumber", "()Lxw/h;", "d", "Z", "b", "()Z", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CheckPrefix extends a {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final PhoneNumber phoneNumber;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean isRequired;

            public /* synthetic */ CheckPrefix(PhoneNumber phoneNumber, boolean z15, int i15, fr.k kVar) {
                this(phoneNumber, (i15 & 2) != 0 ? true : z15);
            }

            @Override // j14.n.a
            /* JADX INFO: renamed from: b, reason: from getter */
            public boolean getIsRequired() {
                return this.isRequired;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckPrefix)) {
                    return false;
                }
                CheckPrefix checkPrefix = (CheckPrefix) other;
                return t.c(this.phoneNumber, checkPrefix.phoneNumber) && this.isRequired == checkPrefix.isRequired;
            }

            public int hashCode() {
                return (this.phoneNumber.hashCode() * 31) + Boolean.hashCode(this.isRequired);
            }

            public String toString() {
                return "CheckPrefix(phoneNumber=" + this.phoneNumber + ", isRequired=" + this.isRequired + ")";
            }

            public CheckPrefix(PhoneNumber phoneNumber, boolean z15) {
                super(phoneNumber.h(), z15, null);
                this.phoneNumber = phoneNumber;
                this.isRequired = z15;
            }
        }

        public /* synthetic */ a(b0 b0Var, boolean z15, fr.k kVar) {
            this(b0Var, z15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getText() {
            return this.text;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public boolean getIsRequired() {
            return this.isRequired;
        }

        private a(b0 b0Var, boolean z15) {
            this.text = b0Var;
            this.isRequired = z15;
        }
    }
}
