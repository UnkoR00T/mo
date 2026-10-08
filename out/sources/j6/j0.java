package j6;

import android.view.MotionEvent;

/* JADX INFO: loaded from: classes.dex */
class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float[] f99699a = new float[20];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long[] f99700b = new long[20];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float f99701c = 0.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f99702d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f99703e = 0;

    j0() {
    }

    private void b() {
        this.f99702d = 0;
        this.f99701c = 0.0f;
    }

    private float e() {
        long[] jArr;
        long j15;
        int i15 = this.f99702d;
        if (i15 < 2) {
            return 0.0f;
        }
        int i16 = this.f99703e;
        int i17 = ((i16 + 20) - (i15 - 1)) % 20;
        long j16 = this.f99700b[i16];
        while (true) {
            jArr = this.f99700b;
            j15 = jArr[i17];
            if (j16 - j15 <= 100) {
                break;
            }
            this.f99702d--;
            i17 = (i17 + 1) % 20;
        }
        int i18 = this.f99702d;
        if (i18 < 2) {
            return 0.0f;
        }
        if (i18 == 2) {
            int i19 = (i17 + 1) % 20;
            long j17 = jArr[i19];
            if (j15 == j17) {
                return 0.0f;
            }
            return this.f99699a[i19] / (j17 - j15);
        }
        float fAbs = 0.0f;
        int i25 = 0;
        for (int i26 = 0; i26 < this.f99702d - 1; i26++) {
            int i27 = i26 + i17;
            long[] jArr2 = this.f99700b;
            long j18 = jArr2[i27 % 20];
            int i28 = (i27 + 1) % 20;
            if (jArr2[i28] != j18) {
                i25++;
                float f15 = f(fAbs);
                float f16 = this.f99699a[i28] / (this.f99700b[i28] - j18);
                fAbs += (f16 - f15) * Math.abs(f16);
                if (i25 == 1) {
                    fAbs *= 0.5f;
                }
            }
        }
        return f(fAbs);
    }

    private static float f(float f15) {
        return (f15 < 0.0f ? -1.0f : 1.0f) * ((float) Math.sqrt(Math.abs(f15) * 2.0f));
    }

    void a(MotionEvent motionEvent) {
        long eventTime = motionEvent.getEventTime();
        if (this.f99702d != 0 && eventTime - this.f99700b[this.f99703e] > 40) {
            b();
        }
        int i15 = (this.f99703e + 1) % 20;
        this.f99703e = i15;
        int i16 = this.f99702d;
        if (i16 != 20) {
            this.f99702d = i16 + 1;
        }
        this.f99699a[i15] = motionEvent.getAxisValue(26);
        this.f99700b[this.f99703e] = eventTime;
    }

    void c(int i15, float f15) {
        float fE = e() * i15;
        this.f99701c = fE;
        if (fE < (-Math.abs(f15))) {
            this.f99701c = -Math.abs(f15);
        } else if (this.f99701c > Math.abs(f15)) {
            this.f99701c = Math.abs(f15);
        }
    }

    float d(int i15) {
        if (i15 != 26) {
            return 0.0f;
        }
        return this.f99701c;
    }
}
