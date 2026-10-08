package fb;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long[] f60698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float[] f60699b = new float[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f60700c = 0;

    z() {
        long[] jArr = new long[20];
        this.f60698a = jArr;
        Arrays.fill(jArr, Long.MIN_VALUE);
    }

    private float c(float f15) {
        return (float) (((double) Math.signum(f15)) * Math.sqrt(Math.abs(f15) * 2.0f));
    }

    public void a(long j15, float f15) {
        int i15 = (this.f60700c + 1) % 20;
        this.f60700c = i15;
        this.f60698a[i15] = j15;
        this.f60699b[i15] = f15;
    }

    float b() {
        float fC;
        int i15 = this.f60700c;
        if (i15 == 0 && this.f60698a[i15] == Long.MIN_VALUE) {
            return 0.0f;
        }
        long j15 = this.f60698a[i15];
        int i16 = 0;
        long j16 = j15;
        while (true) {
            long j17 = this.f60698a[i15];
            if (j17 == Long.MIN_VALUE) {
                break;
            }
            float f15 = j15 - j17;
            float fAbs = Math.abs(j17 - j16);
            if (f15 > 100.0f || fAbs > 40.0f) {
                break;
            }
            if (i15 == 0) {
                i15 = 20;
            }
            i15--;
            i16++;
            if (i16 >= 20) {
                break;
            }
            j16 = j17;
        }
        if (i16 < 2) {
            return 0.0f;
        }
        if (i16 == 2) {
            int i17 = this.f60700c;
            int i18 = i17 == 0 ? 19 : i17 - 1;
            long[] jArr = this.f60698a;
            float f16 = jArr[i17] - jArr[i18];
            if (f16 == 0.0f) {
                return 0.0f;
            }
            float[] fArr = this.f60699b;
            fC = (fArr[i17] - fArr[i18]) / f16;
        } else {
            int i19 = this.f60700c;
            int i25 = ((i19 - i16) + 21) % 20;
            int i26 = (i19 + 21) % 20;
            long j18 = this.f60698a[i25];
            float f17 = this.f60699b[i25];
            int i27 = i25 + 1;
            float fC2 = 0.0f;
            for (int i28 = i27 % 20; i28 != i26; i28 = (i28 + 1) % 20) {
                long j19 = this.f60698a[i28];
                float f18 = j19 - j18;
                if (f18 != 0.0f) {
                    float f19 = this.f60699b[i28];
                    float f25 = (f19 - f17) / f18;
                    fC2 += (f25 - c(fC2)) * Math.abs(f25);
                    if (i28 == i27) {
                        fC2 *= 0.5f;
                    }
                    f17 = f19;
                    j18 = j19;
                }
            }
            fC = c(fC2);
        }
        return fC * 1000.0f;
    }
}
