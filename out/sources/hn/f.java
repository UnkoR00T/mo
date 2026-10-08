package hn;

import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes4.dex */
public class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f85813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f85814b;

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final char f85815a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f85816b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final b f85817c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final int f85818d;

        boolean e() {
            return this.f85815a == 1000;
        }

        private b(char c15, d dVar, int i15, b bVar, int i16) {
            char c16 = c15 == i16 ? (char) 1000 : c15;
            this.f85815a = c16;
            this.f85816b = i15;
            this.f85817c = bVar;
            int length = c16 == 1000 ? 1 : dVar.b(c15, i15).length;
            length = (bVar == null ? 0 : bVar.f85816b) != i15 ? length + 3 : length;
            this.f85818d = bVar != null ? length + bVar.f85818d : length;
        }
    }

    public f(String str, Charset charset, int i15) {
        this.f85814b = i15;
        d dVar = new d(str, charset, i15);
        if (dVar.g() != 1) {
            this.f85813a = e(str, dVar, i15);
            return;
        }
        this.f85813a = new int[str.length()];
        for (int i16 = 0; i16 < this.f85813a.length; i16++) {
            char cCharAt = str.charAt(i16);
            int[] iArr = this.f85813a;
            if (cCharAt == i15) {
                cCharAt = 1000;
            }
            iArr[i16] = cCharAt;
        }
    }

    static void c(b[][] bVarArr, int i15, b bVar) {
        if (bVarArr[i15][bVar.f85816b] == null || bVarArr[i15][bVar.f85816b].f85818d > bVar.f85818d) {
            bVarArr[i15][bVar.f85816b] = bVar;
        }
    }

    static void d(String str, d dVar, b[][] bVarArr, int i15, b bVar, int i16) {
        int i17;
        int iF;
        d dVar2;
        b bVar2;
        int i18;
        char cCharAt = str.charAt(i15);
        int iG = dVar.g();
        if (dVar.f() < 0 || !(cCharAt == i16 || dVar.a(cCharAt, dVar.f()))) {
            i17 = iG;
            iF = 0;
        } else {
            iF = dVar.f();
            i17 = iF + 1;
        }
        int i19 = iF;
        while (i19 < i17) {
            if (cCharAt == i16 || dVar.a(cCharAt, i19)) {
                dVar2 = dVar;
                bVar2 = bVar;
                i18 = i16;
                c(bVarArr, i15 + 1, new b(cCharAt, dVar2, i19, bVar2, i18));
            } else {
                dVar2 = dVar;
                bVar2 = bVar;
                i18 = i16;
            }
            i19++;
            dVar = dVar2;
            bVar = bVar2;
            i16 = i18;
        }
    }

    static int[] e(String str, d dVar, int i15) {
        int length = str.length();
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, length + 1, dVar.g());
        d(str, dVar, bVarArr, 0, null, i15);
        for (int i16 = 1; i16 <= length; i16++) {
            for (int i17 = 0; i17 < dVar.g(); i17++) {
                b bVar = bVarArr[i16][i17];
                if (bVar != null && i16 < length) {
                    d(str, dVar, bVarArr, i16, bVar, i15);
                }
            }
            for (int i18 = 0; i18 < dVar.g(); i18++) {
                bVarArr[i16 - 1][i18] = null;
            }
        }
        int i19 = -1;
        int i25 = Integer.MAX_VALUE;
        for (int i26 = 0; i26 < dVar.g(); i26++) {
            b bVar2 = bVarArr[length][i26];
            if (bVar2 != null && bVar2.f85818d < i25) {
                i25 = bVar2.f85818d;
                i19 = i26;
            }
        }
        if (i19 < 0) {
            throw new IllegalStateException("Failed to encode \"" + str + "\"");
        }
        ArrayList arrayList = new ArrayList();
        for (b bVar3 = bVarArr[length][i19]; bVar3 != null; bVar3 = bVar3.f85817c) {
            if (bVar3.e()) {
                arrayList.add(0, 1000);
            } else {
                byte[] bArrB = dVar.b(bVar3.f85815a, bVar3.f85816b);
                for (int length2 = bArrB.length - 1; length2 >= 0; length2--) {
                    arrayList.add(0, Integer.valueOf(bArrB[length2] & 255));
                }
            }
            if ((bVar3.f85817c == null ? 0 : bVar3.f85817c.f85816b) != bVar3.f85816b) {
                arrayList.add(0, Integer.valueOf(dVar.e(bVar3.f85816b) + 256));
            }
        }
        int size = arrayList.size();
        int[] iArr = new int[size];
        for (int i27 = 0; i27 < size; i27++) {
            iArr[i27] = ((Integer) arrayList.get(i27)).intValue();
        }
        return iArr;
    }

    @Override // hn.e
    public boolean a(int i15) {
        if (i15 >= 0 && i15 < length()) {
            int i16 = this.f85813a[i15];
            return i16 > 255 && i16 <= 999;
        }
        throw new IndexOutOfBoundsException("" + i15);
    }

    @Override // hn.e
    public int b(int i15) {
        if (i15 < 0 || i15 >= length()) {
            throw new IndexOutOfBoundsException("" + i15);
        }
        if (a(i15)) {
            return this.f85813a[i15] - 256;
        }
        throw new IllegalArgumentException("value at " + i15 + " is not an ECI but a character");
    }

    @Override // hn.e
    public char charAt(int i15) {
        if (i15 < 0 || i15 >= length()) {
            throw new IndexOutOfBoundsException("" + i15);
        }
        if (!a(i15)) {
            return (char) (h(i15) ? this.f85814b : this.f85813a[i15]);
        }
        throw new IllegalArgumentException("value at " + i15 + " is not a character but an ECI");
    }

    public int f() {
        return this.f85814b;
    }

    public boolean g(int i15, int i16) {
        if ((i15 + i16) - 1 >= this.f85813a.length) {
            return false;
        }
        for (int i17 = 0; i17 < i16; i17++) {
            if (a(i15 + i17)) {
                return false;
            }
        }
        return true;
    }

    public boolean h(int i15) {
        if (i15 >= 0 && i15 < length()) {
            return this.f85813a[i15] == 1000;
        }
        throw new IndexOutOfBoundsException("" + i15);
    }

    @Override // hn.e
    public int length() {
        return this.f85813a.length;
    }

    @Override // hn.e
    public CharSequence subSequence(int i15, int i16) {
        if (i15 < 0 || i15 > i16 || i16 > length()) {
            throw new IndexOutOfBoundsException("" + i15);
        }
        StringBuilder sb5 = new StringBuilder();
        while (i15 < i16) {
            if (a(i15)) {
                throw new IllegalArgumentException("value at " + i15 + " is not a character but an ECI");
            }
            sb5.append(charAt(i15));
            i15++;
        }
        return sb5;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 < length(); i15++) {
            if (i15 > 0) {
                sb5.append(", ");
            }
            if (a(i15)) {
                sb5.append("ECI(");
                sb5.append(b(i15));
                sb5.append(')');
            } else if (charAt(i15) < 128) {
                sb5.append('\'');
                sb5.append(charAt(i15));
                sb5.append('\'');
            } else {
                sb5.append((int) charAt(i15));
            }
        }
        return sb5.toString();
    }
}
