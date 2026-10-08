package qn;

import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final byte[][] f167420a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f167421b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f167422c;

    public b(int i15, int i16) {
        this.f167420a = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i16, i15);
        this.f167421b = i15;
        this.f167422c = i16;
    }

    public void a(byte b15) {
        for (byte[] bArr : this.f167420a) {
            Arrays.fill(bArr, b15);
        }
    }

    public byte b(int i15, int i16) {
        return this.f167420a[i16][i15];
    }

    public byte[][] c() {
        return this.f167420a;
    }

    public int d() {
        return this.f167422c;
    }

    public int e() {
        return this.f167421b;
    }

    public void f(int i15, int i16, int i17) {
        this.f167420a[i16][i15] = (byte) i17;
    }

    public void g(int i15, int i16, boolean z15) {
        this.f167420a[i16][i15] = z15 ? (byte) 1 : (byte) 0;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder((this.f167421b * 2 * this.f167422c) + 2);
        for (int i15 = 0; i15 < this.f167422c; i15++) {
            byte[] bArr = this.f167420a[i15];
            for (int i16 = 0; i16 < this.f167421b; i16++) {
                byte b15 = bArr[i16];
                if (b15 == 0) {
                    sb5.append(" 0");
                } else if (b15 != 1) {
                    sb5.append("  ");
                } else {
                    sb5.append(" 1");
                }
            }
            sb5.append('\n');
        }
        return sb5.toString();
    }
}
