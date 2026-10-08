package ba3;

import fr.t;
import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: ba3.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018¨\u0006\u001c"}, d2 = {"Lba3/a;", "", "", "email", "", "isEmailChecked", "Lxw/h;", "phoneNumber", "isPhoneNumberChecked", "<init>", "(Ljava/lang/String;ZLxw/h;Z)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "Z", "c", "()Z", "Lxw/h;", "()Lxw/h;", "d", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetails {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f17865e = PhoneNumber.f221634d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String email;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEmailChecked;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPhoneNumberChecked;

    public ContactDetails(String str, boolean z15, PhoneNumber phoneNumber, boolean z16) {
        this.email = str;
        this.isEmailChecked = z15;
        this.phoneNumber = phoneNumber;
        this.isPhoneNumberChecked = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final PhoneNumber getPhoneNumber() {
        return this.phoneNumber;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIsEmailChecked() {
        return this.isEmailChecked;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsPhoneNumberChecked() {
        return this.isPhoneNumberChecked;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactDetails)) {
            return false;
        }
        ContactDetails contactDetails = (ContactDetails) other;
        return t.c(this.email, contactDetails.email) && this.isEmailChecked == contactDetails.isEmailChecked && t.c(this.phoneNumber, contactDetails.phoneNumber) && this.isPhoneNumberChecked == contactDetails.isPhoneNumberChecked;
    }

    public int hashCode() {
        return (((((this.email.hashCode() * 31) + Boolean.hashCode(this.isEmailChecked)) * 31) + this.phoneNumber.hashCode()) * 31) + Boolean.hashCode(this.isPhoneNumberChecked);
    }

    public String toString() {
        return "ContactDetails(email=" + this.email + ", isEmailChecked=" + this.isEmailChecked + ", phoneNumber=" + this.phoneNumber + ", isPhoneNumberChecked=" + this.isPhoneNumberChecked + ')';
    }
}
