package c9;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f24577b;

    public b(String str, byte[] bArr) {
        super(str);
        this.f24577b = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && b.class == obj.getClass()) {
            b bVar = (b) obj;
            if (this.f24601a.equals(bVar.f24601a) && Arrays.equals(this.f24577b, bVar.f24577b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((527 + this.f24601a.hashCode()) * 31) + Arrays.hashCode(this.f24577b);
    }
}
