package ru3;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import xw.PhoneNumber;

/* JADX INFO: renamed from: ru3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru3/b;", "", "Lxw/h;", "phoneNumber", "Liy/b0;", "emailAddress", "<init>", "(Lxw/h;Liy/b0;)V", "a", "(Lxw/h;Liy/b0;)Lru3/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lxw/h;", "d", "()Lxw/h;", "b", "Liy/b0;", "c", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ContactDetailsData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final PhoneNumber phoneNumber;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 emailAddress;

    public ContactDetailsData(PhoneNumber phoneNumber, b0 b0Var) {
        this.phoneNumber = phoneNumber;
        this.emailAddress = b0Var;
    }

    public static /* synthetic */ ContactDetailsData b(ContactDetailsData contactDetailsData, PhoneNumber phoneNumber, b0 b0Var, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            phoneNumber = contactDetailsData.phoneNumber;
        }
        if ((i15 & 2) != 0) {
            b0Var = contactDetailsData.emailAddress;
        }
        return contactDetailsData.a(phoneNumber, b0Var);
    }

    public final ContactDetailsData a(PhoneNumber phoneNumber, b0 emailAddress) {
        return new ContactDetailsData(phoneNumber, emailAddress);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getEmailAddress() {
        return this.emailAddress;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
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
        return t.c(this.phoneNumber, contactDetailsData.phoneNumber) && t.c(this.emailAddress, contactDetailsData.emailAddress);
    }

    public int hashCode() {
        return (this.phoneNumber.hashCode() * 31) + this.emailAddress.hashCode();
    }

    public String toString() {
        return "ContactDetailsData(phoneNumber=" + this.phoneNumber + ", emailAddress=" + this.emailAddress + ")";
    }
}
