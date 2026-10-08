package od;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f144671a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int[] f144672b;

    public d(float[] fArr, int[] iArr) {
        this.f144671a = fArr;
        this.f144672b = iArr;
    }

    private void a(d dVar) {
        int i15 = 0;
        while (true) {
            int[] iArr = dVar.f144672b;
            if (i15 >= iArr.length) {
                return;
            }
            this.f144671a[i15] = dVar.f144671a[i15];
            this.f144672b[i15] = iArr[i15];
            i15++;
        }
    }

    private int c(float f15) {
        int iBinarySearch = Arrays.binarySearch(this.f144671a, f15);
        if (iBinarySearch >= 0) {
            return this.f144672b[iBinarySearch];
        }
        int i15 = -(iBinarySearch + 1);
        if (i15 == 0) {
            return this.f144672b[0];
        }
        int[] iArr = this.f144672b;
        if (i15 == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f144671a;
        int i16 = i15 - 1;
        float f16 = fArr[i16];
        return td.c.c((f15 - f16) / (fArr[i15] - f16), iArr[i16], iArr[i15]);
    }

    public d b(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i15 = 0; i15 < fArr.length; i15++) {
            iArr[i15] = c(fArr[i15]);
        }
        return new d(fArr, iArr);
    }

    public int[] d() {
        return this.f144672b;
    }

    public float[] e() {
        return this.f144671a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            d dVar = (d) obj;
            if (Arrays.equals(this.f144671a, dVar.f144671a) && Arrays.equals(this.f144672b, dVar.f144672b)) {
                return true;
            }
        }
        return false;
    }

    public int f() {
        return this.f144672b.length;
    }

    public void g(d dVar, d dVar2, float f15) {
        int[] iArr;
        if (dVar.equals(dVar2)) {
            a(dVar);
            return;
        }
        if (f15 <= 0.0f) {
            a(dVar);
            return;
        }
        if (f15 >= 1.0f) {
            a(dVar2);
            return;
        }
        if (dVar.f144672b.length != dVar2.f144672b.length) {
            throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + dVar.f144672b.length + " vs " + dVar2.f144672b.length + ")");
        }
        int i15 = 0;
        while (true) {
            iArr = dVar.f144672b;
            if (i15 >= iArr.length) {
                break;
            }
            this.f144671a[i15] = td.j.i(dVar.f144671a[i15], dVar2.f144671a[i15], f15);
            this.f144672b[i15] = td.c.c(f15, dVar.f144672b[i15], dVar2.f144672b[i15]);
            i15++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.f144671a;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = dVar.f144672b;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.f144672b;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f144671a) * 31) + Arrays.hashCode(this.f144672b);
    }
}
