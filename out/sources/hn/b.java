package hn;

import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f85783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f85784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f85785c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int[] f85786d;

    public b(int i15) {
        this(i15, i15);
    }

    private String b(String str, String str2, String str3) {
        StringBuilder sb5 = new StringBuilder(this.f85784b * (this.f85783a + 1));
        for (int i15 = 0; i15 < this.f85784b; i15++) {
            for (int i16 = 0; i16 < this.f85783a; i16++) {
                sb5.append(g(i16, i15) ? str : str2);
            }
            sb5.append(str3);
        }
        return sb5.toString();
    }

    public void c() {
        int length = this.f85786d.length;
        for (int i15 = 0; i15 < length; i15++) {
            this.f85786d[i15] = 0;
        }
    }

    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b clone() {
        return new b(this.f85783a, this.f85784b, this.f85785c, (int[]) this.f85786d.clone());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f85783a == bVar.f85783a && this.f85784b == bVar.f85784b && this.f85785c == bVar.f85785c && Arrays.equals(this.f85786d, bVar.f85786d);
    }

    public boolean g(int i15, int i16) {
        return ((this.f85786d[(i16 * this.f85785c) + (i15 / 32)] >>> (i15 & 31)) & 1) != 0;
    }

    public int hashCode() {
        int i15 = this.f85783a;
        return (((((((i15 * 31) + i15) * 31) + this.f85784b) * 31) + this.f85785c) * 31) + Arrays.hashCode(this.f85786d);
    }

    public int i() {
        return this.f85784b;
    }

    public int j() {
        return this.f85783a;
    }

    public void l(int i15, int i16) {
        int i17 = (i16 * this.f85785c) + (i15 / 32);
        int[] iArr = this.f85786d;
        iArr[i17] = (1 << (i15 & 31)) | iArr[i17];
    }

    public void m(int i15, int i16, int i17, int i18) {
        if (i16 < 0 || i15 < 0) {
            throw new IllegalArgumentException("Left and top must be nonnegative");
        }
        if (i18 < 1 || i17 < 1) {
            throw new IllegalArgumentException("Height and width must be at least 1");
        }
        int i19 = i17 + i15;
        int i25 = i18 + i16;
        if (i25 > this.f85784b || i19 > this.f85783a) {
            throw new IllegalArgumentException("The region must fit inside the matrix");
        }
        while (i16 < i25) {
            int i26 = this.f85785c * i16;
            for (int i27 = i15; i27 < i19; i27++) {
                int[] iArr = this.f85786d;
                int i28 = (i27 / 32) + i26;
                iArr[i28] = iArr[i28] | (1 << (i27 & 31));
            }
            i16++;
        }
    }

    public String n(String str, String str2) {
        return b(str, str2, "\n");
    }

    public String toString() {
        return n("X ", "  ");
    }

    public b(int i15, int i16) {
        if (i15 < 1 || i16 < 1) {
            throw new IllegalArgumentException("Both dimensions must be greater than 0");
        }
        this.f85783a = i15;
        this.f85784b = i16;
        int i17 = (i15 + 31) / 32;
        this.f85785c = i17;
        this.f85786d = new int[i17 * i16];
    }

    private b(int i15, int i16, int i17, int[] iArr) {
        this.f85783a = i15;
        this.f85784b = i16;
        this.f85785c = i17;
        this.f85786d = iArr;
    }
}
