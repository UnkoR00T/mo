package c9;

import java.util.Arrays;
import java.util.Objects;
import t7.u;

/* JADX INFO: loaded from: classes3.dex */
public final class a extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24573b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24574c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f24575d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f24576e;

    public a(String str, String str2, int i15, byte[] bArr) {
        super("APIC");
        this.f24573b = str;
        this.f24574c = str2;
        this.f24575d = i15;
        this.f24576e = bArr;
    }

    @Override // t7.v.a
    public void c(u.b bVar) {
        bVar.M(this.f24576e, this.f24575d);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f24575d == aVar.f24575d && Objects.equals(this.f24573b, aVar.f24573b) && Objects.equals(this.f24574c, aVar.f24574c) && Arrays.equals(this.f24576e, aVar.f24576e)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i15 = (527 + this.f24575d) * 31;
        String str = this.f24573b;
        int iHashCode = (i15 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f24574c;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f24576e);
    }

    @Override // c9.i
    public String toString() {
        return this.f24601a + ": mimeType=" + this.f24573b + ", description=" + this.f24574c;
    }
}
