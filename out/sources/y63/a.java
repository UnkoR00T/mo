package y63;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\u0082\u0001\n\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016¨\u0006\u0017À\u0006\u0003"}, d2 = {"Ly63/a;", "", "k", "c", "d", "j", "i", "a", "g", "e", "b", "h", "f", "Ly63/a$a;", "Ly63/a$b;", "Ly63/a$c;", "Ly63/a$d;", "Ly63/a$e;", "Ly63/a$f;", "Ly63/a$g;", "Ly63/a$h;", "Ly63/a$i;", "Ly63/a$j;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: y63.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ly63/a$a;", "Ly63/a;", "", "isAnyContactRegistered", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddEmailAddress implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAnyContactRegistered;

        public AddEmailAddress(boolean z15) {
            this.isAnyContactRegistered = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsAnyContactRegistered() {
            return this.isAnyContactRegistered;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddEmailAddress) && this.isAnyContactRegistered == ((AddEmailAddress) other).isAnyContactRegistered;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAnyContactRegistered);
        }

        public String toString() {
            return "AddEmailAddress(isAnyContactRegistered=" + this.isAnyContactRegistered + ')';
        }
    }

    /* JADX INFO: renamed from: y63.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\u00022\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Ly63/a$b;", "Ly63/a;", "", "isAnyContactRegistered", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddPhoneNumber implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAnyContactRegistered;

        public AddPhoneNumber(boolean z15) {
            this.isAnyContactRegistered = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getIsAnyContactRegistered() {
            return this.isAnyContactRegistered;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddPhoneNumber) && this.isAnyContactRegistered == ((AddPhoneNumber) other).isAnyContactRegistered;
        }

        public int hashCode() {
            return Boolean.hashCode(this.isAnyContactRegistered);
        }

        public String toString() {
            return "AddPhoneNumber(isAnyContactRegistered=" + this.isAnyContactRegistered + ')';
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly63/a$c;", "Ly63/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f224663a = new c();

        private c() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof c);
        }

        public int hashCode() {
            return -1345330033;
        }

        public String toString() {
            return "Back";
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly63/a$d;", "Ly63/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f224664a = new d();

        private d() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof d);
        }

        public int hashCode() {
            return 1245705040;
        }

        public String toString() {
            return "Close";
        }
    }

    /* JADX INFO: renamed from: y63.a$e, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0016\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Ly63/a$e;", "Ly63/a;", "Liy/b0;", "email", "previousEmail", "", "isAnyContactRegistered", "<init>", "(Liy/b0;Liy/b0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "c", "Z", "()Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmEmailAddress implements a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f224665d = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 previousEmail;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAnyContactRegistered;

        public ConfirmEmailAddress(iy.b0 b0Var, iy.b0 b0Var2, boolean z15) {
            this.email = b0Var;
            this.previousEmail = b0Var2;
            this.isAnyContactRegistered = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.b0 getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.b0 getPreviousEmail() {
            return this.previousEmail;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final boolean getIsAnyContactRegistered() {
            return this.isAnyContactRegistered;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfirmEmailAddress)) {
                return false;
            }
            ConfirmEmailAddress confirmEmailAddress = (ConfirmEmailAddress) other;
            return fr.t.c(this.email, confirmEmailAddress.email) && fr.t.c(this.previousEmail, confirmEmailAddress.previousEmail) && this.isAnyContactRegistered == confirmEmailAddress.isAnyContactRegistered;
        }

        public int hashCode() {
            int iHashCode = this.email.hashCode() * 31;
            iy.b0 b0Var = this.previousEmail;
            return ((iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31) + Boolean.hashCode(this.isAnyContactRegistered);
        }

        public String toString() {
            return "ConfirmEmailAddress(email=" + this.email + ", previousEmail=" + this.previousEmail + ", isAnyContactRegistered=" + this.isAnyContactRegistered + ')';
        }
    }

    /* JADX INFO: renamed from: y63.a$f, reason: from toString */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Ly63/a$f;", "Ly63/a;", "Liy/b0;", "prefix", "phoneNumber", "previousPrefix", "previousPhoneNumber", "", "isAnyContactRegistered", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "c", "d", "e", "Z", "()Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ConfirmPhoneNumber implements a {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f224669f = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 prefix;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 phoneNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 previousPrefix;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 previousPhoneNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isAnyContactRegistered;

        public ConfirmPhoneNumber(iy.b0 b0Var, iy.b0 b0Var2, iy.b0 b0Var3, iy.b0 b0Var4, boolean z15) {
            this.prefix = b0Var;
            this.phoneNumber = b0Var2;
            this.previousPrefix = b0Var3;
            this.previousPhoneNumber = b0Var4;
            this.isAnyContactRegistered = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.b0 getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.b0 getPrefix() {
            return this.prefix;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final iy.b0 getPreviousPhoneNumber() {
            return this.previousPhoneNumber;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final iy.b0 getPreviousPrefix() {
            return this.previousPrefix;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getIsAnyContactRegistered() {
            return this.isAnyContactRegistered;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ConfirmPhoneNumber)) {
                return false;
            }
            ConfirmPhoneNumber confirmPhoneNumber = (ConfirmPhoneNumber) other;
            return fr.t.c(this.prefix, confirmPhoneNumber.prefix) && fr.t.c(this.phoneNumber, confirmPhoneNumber.phoneNumber) && fr.t.c(this.previousPrefix, confirmPhoneNumber.previousPrefix) && fr.t.c(this.previousPhoneNumber, confirmPhoneNumber.previousPhoneNumber) && this.isAnyContactRegistered == confirmPhoneNumber.isAnyContactRegistered;
        }

        public int hashCode() {
            int iHashCode = ((this.prefix.hashCode() * 31) + this.phoneNumber.hashCode()) * 31;
            iy.b0 b0Var = this.previousPrefix;
            int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
            iy.b0 b0Var2 = this.previousPhoneNumber;
            return ((iHashCode2 + (b0Var2 != null ? b0Var2.hashCode() : 0)) * 31) + Boolean.hashCode(this.isAnyContactRegistered);
        }

        public String toString() {
            return "ConfirmPhoneNumber(prefix=" + this.prefix + ", phoneNumber=" + this.phoneNumber + ", previousPrefix=" + this.previousPrefix + ", previousPhoneNumber=" + this.previousPhoneNumber + ", isAnyContactRegistered=" + this.isAnyContactRegistered + ')';
        }
    }

    /* JADX INFO: renamed from: y63.a$g, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly63/a$g;", "Ly63/a;", "Liy/b0;", "email", "<init>", "(Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditEmailAddress implements a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f224675b = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 email;

        public EditEmailAddress(iy.b0 b0Var) {
            this.email = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.b0 getEmail() {
            return this.email;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof EditEmailAddress) && fr.t.c(this.email, ((EditEmailAddress) other).email);
        }

        public int hashCode() {
            return this.email.hashCode();
        }

        public String toString() {
            return "EditEmailAddress(email=" + this.email + ')';
        }
    }

    /* JADX INFO: renamed from: y63.a$h, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Ly63/a$h;", "Ly63/a;", "Liy/b0;", "prefix", "phoneNumber", "<init>", "(Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class EditPhoneNumber implements a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f224677c = iy.b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 prefix;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 phoneNumber;

        public EditPhoneNumber(iy.b0 b0Var, iy.b0 b0Var2) {
            this.prefix = b0Var;
            this.phoneNumber = b0Var2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final iy.b0 getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final iy.b0 getPrefix() {
            return this.prefix;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof EditPhoneNumber)) {
                return false;
            }
            EditPhoneNumber editPhoneNumber = (EditPhoneNumber) other;
            return fr.t.c(this.prefix, editPhoneNumber.prefix) && fr.t.c(this.phoneNumber, editPhoneNumber.phoneNumber);
        }

        public int hashCode() {
            return (this.prefix.hashCode() * 31) + this.phoneNumber.hashCode();
        }

        public String toString() {
            return "EditPhoneNumber(prefix=" + this.prefix + ", phoneNumber=" + this.phoneNumber + ')';
        }
    }

    /* JADX INFO: renamed from: y63.a$i, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly63/a$i;", "Ly63/a;", "Lm63/b;", "snackBarSuccessMessage", "<init>", "(Lm63/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lm63/b;", "()Lm63/b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FetchData implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final m63.b snackBarSuccessMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public FetchData() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final m63.b getSnackBarSuccessMessage() {
            return this.snackBarSuccessMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FetchData) && fr.t.c(this.snackBarSuccessMessage, ((FetchData) other).snackBarSuccessMessage);
        }

        public int hashCode() {
            m63.b bVar = this.snackBarSuccessMessage;
            if (bVar == null) {
                return 0;
            }
            return bVar.hashCode();
        }

        public String toString() {
            return "FetchData(snackBarSuccessMessage=" + this.snackBarSuccessMessage + ')';
        }

        public FetchData(m63.b bVar) {
            this.snackBarSuccessMessage = bVar;
        }

        public /* synthetic */ FetchData(m63.b bVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : bVar);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly63/a$j;", "Ly63/a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f224681a = new j();

        private j() {
        }

        public boolean equals(Object other) {
            return this == other || (other instanceof j);
        }

        public int hashCode() {
            return -1877501272;
        }

        public String toString() {
            return "GoToInfoPage";
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ly63/a$k;", "", "a", "b", "d", "c", "Ly63/a$k$a;", "Ly63/a$k$b;", "Ly63/a$k$c;", "Ly63/a$k$d;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface k {

        /* JADX INFO: renamed from: y63.a$k$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly63/a$k$a;", "Ly63/a$k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C6022a implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C6022a f224682a = new C6022a();

            private C6022a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C6022a);
            }

            public int hashCode() {
                return -1059384678;
            }

            public String toString() {
                return "Back";
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly63/a$k$b;", "Ly63/a$k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f224683a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 1520076453;
            }

            public String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: y63.a$k$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ly63/a$k$c;", "Ly63/a$k;", "Ljb4/b;", "errorData", "<init>", "(Ljb4/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljb4/b;", "()Ljb4/b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final jb4.b errorData;

            public Error(jb4.b bVar) {
                this.errorData = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final jb4.b getErrorData() {
                return this.errorData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorData, ((Error) other).errorData);
            }

            public int hashCode() {
                return this.errorData.hashCode();
            }

            public String toString() {
                return "Error(errorData=" + this.errorData + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly63/a$k$d;", "Ly63/a$k;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f224685a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return 285576627;
            }

            public String toString() {
                return "GoToInfoPage";
            }
        }
    }
}
