package c9;

import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class m extends i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24611b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f24612c;

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f24611b = str;
        this.f24612c = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && m.class == obj.getClass()) {
            m mVar = (m) obj;
            if (Objects.equals(this.f24611b, mVar.f24611b) && Arrays.equals(this.f24612c, mVar.f24612c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.f24611b;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f24612c);
    }

    @Override // c9.i
    public String toString() {
        return this.f24601a + ": owner=" + this.f24611b;
    }
}
