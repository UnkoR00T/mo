package c9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class f extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24592b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24593c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f24594d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f24595e;

    public f(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.f24592b = str;
        this.f24593c = str2;
        this.f24594d = str3;
        this.f24595e = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && f.class == obj.getClass()) {
            f fVar = (f) obj;
            if (Objects.equals(this.f24592b, fVar.f24592b) && Objects.equals(this.f24593c, fVar.f24593c) && Objects.equals(this.f24594d, fVar.f24594d) && Arrays.equals(this.f24595e, fVar.f24595e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f24592b;
        int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24593c;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24594d;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.f24595e);
    }

    @Override // c9.i
    public String toString() {
        return this.f24601a + ": mimeType=" + this.f24592b + ", filename=" + this.f24593c + ", description=" + this.f24594d;
    }
}
