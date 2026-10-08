package mj1;

import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: mj1.f, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lmj1/f;", "", "Liy/b0;", "email", "Lxw/h;", "phoneNumber", "<init>", "(Liy/b0;Lxw/h;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lxw/h;", "()Lxw/h;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetailsData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f126773c = PhoneNumber.f221634d | iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    public ContactDetailsData(iy.b0 b0Var, PhoneNumber phoneNumber) {
        this.email = b0Var;
        this.phoneNumber = phoneNumber;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactDetailsData)) {
            return false;
        }
        ContactDetailsData contactDetailsData = (ContactDetailsData) other;
        return fr.t.c(this.email, contactDetailsData.email) && fr.t.c(this.phoneNumber, contactDetailsData.phoneNumber);
    }

    public int hashCode() {
        return (this.email.hashCode() * 31) + this.phoneNumber.hashCode();
    }

    public String toString() {
        return "ContactDetailsData(email=" + this.email + ", phoneNumber=" + this.phoneNumber + ')';
    }
}
