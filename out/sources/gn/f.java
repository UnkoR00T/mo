package gn;

import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
final class f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final f f74992f = new f(g.f74998b, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f74993a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f74994b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f74995c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f74996d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f74997e;

    private f(g gVar, int i15, int i16, int i17) {
        this.f74994b = gVar;
        this.f74993a = i15;
        this.f74995c = i16;
        this.f74996d = i17;
        this.f74997e = c(i16);
    }

    private static int c(int i15) {
        if (i15 > 62) {
            return 21;
        }
        if (i15 > 31) {
            return 20;
        }
        return i15 > 0 ? 10 : 0;
    }

    f a(int i15) {
        int i16;
        g gVarA = this.f74994b;
        int i17 = this.f74993a;
        int i18 = this.f74996d;
        if (i17 == 4 || i17 == 2) {
            int i19 = d.f74984d[i17][0];
            int i25 = 65535 & i19;
            int i26 = i19 >> 16;
            gVarA = gVarA.a(i25, i26);
            i18 += i26;
            i17 = 0;
        }
        int i27 = this.f74995c;
        if (i27 == 0 || i27 == 31) {
            i16 = 18;
        } else {
            i16 = i27 == 62 ? 9 : 8;
        }
        f fVar = new f(gVarA, i17, i27 + 1, i18 + i16);
        return fVar.f74995c == 2078 ? fVar.d(i15 + 1) : fVar;
    }

    f b(int i15) {
        g gVarA;
        g gVar = j(4, 0).f74994b;
        int length = 3;
        if (i15 < 0) {
            gVarA = gVar.a(0, 3);
        } else {
            if (i15 > 999999) {
                throw new IllegalArgumentException("ECI code must be between 0 and 999999");
            }
            byte[] bytes = Integer.toString(i15).getBytes(StandardCharsets.ISO_8859_1);
            g gVarA2 = gVar.a(bytes.length, 3);
            for (byte b15 : bytes) {
                gVarA2 = gVarA2.a(b15 - 46, 4);
            }
            length = 3 + (bytes.length * 4);
            gVarA = gVarA2;
        }
        return new f(gVarA, this.f74993a, 0, this.f74996d + length);
    }

    f d(int i15) {
        int i16 = this.f74995c;
        return i16 == 0 ? this : new f(this.f74994b.b(i15 - i16, i16), this.f74993a, 0, this.f74996d);
    }

    int e() {
        return this.f74995c;
    }

    int f() {
        return this.f74996d;
    }

    int g() {
        return this.f74993a;
    }

    boolean h(f fVar) {
        int i15 = this.f74996d + (d.f74984d[this.f74993a][fVar.f74993a] >> 16);
        int i16 = this.f74995c;
        int i17 = fVar.f74995c;
        if (i16 < i17) {
            i15 += fVar.f74997e - this.f74997e;
        } else if (i16 > i17 && i17 > 0) {
            i15 += 10;
        }
        return i15 <= fVar.f74996d;
    }

    f i(int i15, int i16) {
        int i17 = this.f74996d;
        g gVarA = this.f74994b;
        int i18 = this.f74993a;
        if (i15 != i18) {
            int i19 = d.f74984d[i18][i15];
            int i25 = 65535 & i19;
            int i26 = i19 >> 16;
            gVarA = gVarA.a(i25, i26);
            i17 += i26;
        }
        int i27 = i15 == 2 ? 4 : 5;
        return new f(gVarA.a(i16, i27), i15, 0, i17 + i27);
    }

    f j(int i15, int i16) {
        g gVar = this.f74994b;
        int i17 = this.f74993a;
        int i18 = i17 == 2 ? 4 : 5;
        return new f(gVar.a(d.f74986f[i17][i15], i18).a(i16, 5), this.f74993a, 0, this.f74996d + i18 + 5);
    }

    hn.a k(byte[] bArr) {
        ArrayList arrayList = new ArrayList();
        for (g gVarD = d(bArr.length).f74994b; gVarD != null; gVarD = gVarD.d()) {
            arrayList.add(gVarD);
        }
        hn.a aVar = new hn.a();
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((g) arrayList.get(size)).c(aVar, bArr);
        }
        return aVar;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", d.f74983c[this.f74993a], Integer.valueOf(this.f74996d), Integer.valueOf(this.f74995c));
    }
}
