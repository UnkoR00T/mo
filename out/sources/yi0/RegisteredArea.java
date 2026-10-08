package yi0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: yi0.f, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0013\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u001b"}, d2 = {"Lyi0/f;", "", "", "commune", "number", "Lyi0/b;", "okwAddress", "okwName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lyi0/b;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCommune", "b", "c", "Lyi0/b;", "()Lyi0/b;", "d", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RegisteredArea {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String commune;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String number;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final CitizenAddress okwAddress;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String okwName;

    public RegisteredArea(String str, String str2, CitizenAddress citizenAddress, String str3) {
        this.commune = str;
        this.number = str2;
        this.okwAddress = citizenAddress;
        this.okwName = str3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getNumber() {
        return this.number;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final CitizenAddress getOkwAddress() {
        return this.okwAddress;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getOkwName() {
        return this.okwName;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RegisteredArea)) {
            return false;
        }
        RegisteredArea registeredArea = (RegisteredArea) other;
        return t.c(this.commune, registeredArea.commune) && t.c(this.number, registeredArea.number) && t.c(this.okwAddress, registeredArea.okwAddress) && t.c(this.okwName, registeredArea.okwName);
    }

    public int hashCode() {
        return (((((this.commune.hashCode() * 31) + this.number.hashCode()) * 31) + this.okwAddress.hashCode()) * 31) + this.okwName.hashCode();
    }

    public String toString() {
        return "RegisteredArea(commune=" + this.commune + ", number=" + this.number + ", okwAddress=" + this.okwAddress + ", okwName=" + this.okwName + ")";
    }
}
