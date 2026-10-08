package jc;

import fr.t;
import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f101384a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f101385b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte f101386c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f101387d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f101388e;

    public b(byte[] bArr, String str, byte b15, int i15, String str2) {
        this.f101384a = bArr;
        this.f101385b = str;
        this.f101386c = b15;
        this.f101387d = i15;
        this.f101388e = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.f101384a, bVar.f101384a) && t.c(this.f101385b, bVar.f101385b) && this.f101386c == bVar.f101386c && this.f101387d == bVar.f101387d && t.c(this.f101388e, bVar.f101388e);
    }

    public final int hashCode() {
        int iHashCode = Arrays.hashCode(this.f101384a) * 31;
        String str = this.f101385b;
        int iHashCode2 = (Integer.hashCode(this.f101387d) + ((Byte.hashCode(this.f101386c) + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.f101388e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return "ProtocolID: " + this.f101384a + "\nProtocolDescription: " + this.f101385b + "\nVersion: " + ((int) this.f101386c) + "\nParameterId: " + this.f101387d + "\nEllipticCurve: " + this.f101388e;
    }
}
