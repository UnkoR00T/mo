package p63;

import fr.t;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lp63/a;", "", "Liy/b0;", "a", "()Liy/b0;", "contact", "b", "previousContact", "Lp63/a$a;", "Lp63/a$b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: p63.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015¨\u0006\u001a"}, d2 = {"Lp63/a$a;", "Lp63/a;", "Liy/b0;", "email", "previousEmail", "<init>", "(Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "c", "()Liy/b0;", "b", "d", "contact", "previousContact", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Email implements a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f153208e = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 email;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 previousEmail;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final b0 contact;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final b0 previousContact;

        public Email(b0 b0Var, b0 b0Var2) {
            this.email = b0Var;
            this.previousEmail = b0Var2;
            this.contact = b0Var;
            this.previousContact = b0Var2;
        }

        @Override // p63.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public b0 getContact() {
            return this.contact;
        }

        @Override // p63.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public b0 getPreviousContact() {
            return this.previousContact;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getPreviousEmail() {
            return this.previousEmail;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Email)) {
                return false;
            }
            Email email = (Email) other;
            return t.c(this.email, email.email) && t.c(this.previousEmail, email.previousEmail);
        }

        public int hashCode() {
            int iHashCode = this.email.hashCode() * 31;
            b0 b0Var = this.previousEmail;
            return iHashCode + (b0Var == null ? 0 : b0Var.hashCode());
        }

        public String toString() {
            return "Email(email=" + this.email + ", previousEmail=" + this.previousEmail + ')';
        }
    }

    /* JADX INFO: renamed from: p63.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017R\u001a\u0010\u001c\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u001e"}, d2 = {"Lp63/a$b;", "Lp63/a;", "Liy/b0;", "prefix", "phoneNumber", "previousPrefix", "previousPhoneNumber", "<init>", "(Liy/b0;Liy/b0;Liy/b0;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "d", "()Liy/b0;", "b", "c", "f", "e", "contact", "previousContact", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Phone implements a {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f153213g = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 prefix;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 phoneNumber;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 previousPrefix;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 previousPhoneNumber;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final b0 contact;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final b0 previousContact;

        public Phone(b0 b0Var, b0 b0Var2, b0 b0Var3, b0 b0Var4) {
            b0 b0VarG;
            this.prefix = b0Var;
            this.phoneNumber = b0Var2;
            this.previousPrefix = b0Var3;
            this.previousPhoneNumber = b0Var4;
            this.contact = c0.g('+' + c0.e(b0Var) + ' ' + c0.e(b0Var2));
            if (b0Var3 == null || b0Var4 == null) {
                b0VarG = null;
            } else {
                b0VarG = c0.g('+' + c0.e(b0Var3) + ' ' + c0.e(b0Var4));
            }
            this.previousContact = b0VarG;
        }

        @Override // p63.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public b0 getContact() {
            return this.contact;
        }

        @Override // p63.a
        /* JADX INFO: renamed from: b, reason: from getter */
        public b0 getPreviousContact() {
            return this.previousContact;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPhoneNumber() {
            return this.phoneNumber;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getPrefix() {
            return this.prefix;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b0 getPreviousPhoneNumber() {
            return this.previousPhoneNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Phone)) {
                return false;
            }
            Phone phone = (Phone) other;
            return t.c(this.prefix, phone.prefix) && t.c(this.phoneNumber, phone.phoneNumber) && t.c(this.previousPrefix, phone.previousPrefix) && t.c(this.previousPhoneNumber, phone.previousPhoneNumber);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final b0 getPreviousPrefix() {
            return this.previousPrefix;
        }

        public int hashCode() {
            int iHashCode = ((this.prefix.hashCode() * 31) + this.phoneNumber.hashCode()) * 31;
            b0 b0Var = this.previousPrefix;
            int iHashCode2 = (iHashCode + (b0Var == null ? 0 : b0Var.hashCode())) * 31;
            b0 b0Var2 = this.previousPhoneNumber;
            return iHashCode2 + (b0Var2 != null ? b0Var2.hashCode() : 0);
        }

        public String toString() {
            return "Phone(prefix=" + this.prefix + ", phoneNumber=" + this.phoneNumber + ", previousPrefix=" + this.previousPrefix + ", previousPhoneNumber=" + this.previousPhoneNumber + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    b0 getContact();

    /* JADX INFO: renamed from: b */
    b0 getPreviousContact();
}
