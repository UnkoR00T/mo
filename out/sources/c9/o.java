package c9;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class o extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24616b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24617c;

    public o(String str, String str2, String str3) {
        super(str);
        this.f24616b = str2;
        this.f24617c = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f24601a.equals(oVar.f24601a) && Objects.equals(this.f24616b, oVar.f24616b) && Objects.equals(this.f24617c, oVar.f24617c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f24601a.hashCode()) * 31;
        String str = this.f24616b;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24617c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // c9.i
    public String toString() {
        return this.f24601a + ": url=" + this.f24617c;
    }
}
