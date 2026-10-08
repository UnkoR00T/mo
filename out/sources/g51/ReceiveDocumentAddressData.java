package g51;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import st3.AddressData;

/* JADX INFO: renamed from: g51.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lg51/a;", "", "Liy/b0;", "name", "surname", "Lst3/b;", "address", "<init>", "(Liy/b0;Liy/b0;Lst3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "c", "Lst3/b;", "()Lst3/b;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ReceiveDocumentAddressData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 name;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 surname;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final AddressData address;

    public ReceiveDocumentAddressData(b0 b0Var, b0 b0Var2, AddressData addressData) {
        this.name = b0Var;
        this.surname = b0Var2;
        this.address = addressData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AddressData getAddress() {
        return this.address;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getSurname() {
        return this.surname;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReceiveDocumentAddressData)) {
            return false;
        }
        ReceiveDocumentAddressData receiveDocumentAddressData = (ReceiveDocumentAddressData) other;
        return t.c(this.name, receiveDocumentAddressData.name) && t.c(this.surname, receiveDocumentAddressData.surname) && t.c(this.address, receiveDocumentAddressData.address);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.surname.hashCode()) * 31) + this.address.hashCode();
    }

    public String toString() {
        return "ReceiveDocumentAddressData(name=" + this.name + ", surname=" + this.surname + ", address=" + this.address + ')';
    }
}
