package a9;

import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import t7.u;
import t7.v;
import t7.w;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements v.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f4941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4943c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f4944d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f4945e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f4946f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f4947g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final byte[] f4948h;

    public a(int i15, String str, String str2, int i16, int i17, int i18, int i19, byte[] bArr) {
        this.f4941a = i15;
        this.f4942b = str;
        this.f4943c = str2;
        this.f4944d = i16;
        this.f4945e = i17;
        this.f4946f = i18;
        this.f4947g = i19;
        this.f4948h = bArr;
    }

    public static a d(c0 c0Var) {
        int iZ = c0Var.z();
        String strL = w.l(c0Var.O(c0Var.z(), StandardCharsets.US_ASCII));
        String strN = c0Var.N(c0Var.z());
        int iZ2 = c0Var.z();
        int iZ3 = c0Var.z();
        int iZ4 = c0Var.z();
        int iZ5 = c0Var.z();
        int iZ6 = c0Var.z();
        byte[] bArr = new byte[iZ6];
        c0Var.u(bArr, 0, iZ6);
        return new a(iZ, strL, strN, iZ2, iZ3, iZ4, iZ5, bArr);
    }

    @Override // t7.v.a
    public void c(u.b bVar) {
        bVar.M(this.f4948h, this.f4941a);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a.class == obj.getClass()) {
            a aVar = (a) obj;
            if (this.f4941a == aVar.f4941a && this.f4942b.equals(aVar.f4942b) && this.f4943c.equals(aVar.f4943c) && this.f4944d == aVar.f4944d && this.f4945e == aVar.f4945e && this.f4946f == aVar.f4946f && this.f4947g == aVar.f4947g && Arrays.equals(this.f4948h, aVar.f4948h)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f4941a) * 31) + this.f4942b.hashCode()) * 31) + this.f4943c.hashCode()) * 31) + this.f4944d) * 31) + this.f4945e) * 31) + this.f4946f) * 31) + this.f4947g) * 31) + Arrays.hashCode(this.f4948h);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f4942b + ", description=" + this.f4943c;
    }
}
