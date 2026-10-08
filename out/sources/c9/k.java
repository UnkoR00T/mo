package c9;

import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class k extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24603b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24604c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24605d;

    public k(String str, String str2, String str3) {
        super("----");
        this.f24603b = str;
        this.f24604c = str2;
        this.f24605d = str3;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k.class == obj.getClass()) {
            k kVar = (k) obj;
            if (Objects.equals(this.f24604c, kVar.f24604c) && Objects.equals(this.f24603b, kVar.f24603b) && Objects.equals(this.f24605d, kVar.f24605d)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f24603b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24604c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24605d;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // c9.i
    public String toString() {
        return this.f24601a + ": domain=" + this.f24603b + ", description=" + this.f24604c;
    }
}
