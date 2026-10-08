package rd;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;

/* JADX INFO: loaded from: classes3.dex */
public class o implements n0<od.d> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f173213a;

    public o(int i15) {
        this.f173213a = i15;
    }

    private od.d b(od.d dVar, List<Float> list) {
        int i15 = this.f173213a * 4;
        if (list.size() <= i15) {
            return dVar;
        }
        float[] fArrE = dVar.e();
        int[] iArrD = dVar.d();
        int size = (list.size() - i15) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i16 = 0;
        while (i15 < list.size()) {
            if (i15 % 2 == 0) {
                fArr[i16] = list.get(i15).floatValue();
            } else {
                fArr2[i16] = list.get(i15).floatValue();
                i16++;
            }
            i15++;
        }
        float[] fArrE2 = e(dVar.e(), fArr);
        int length = fArrE2.length;
        int[] iArr = new int[length];
        for (int i17 = 0; i17 < length; i17++) {
            float f15 = fArrE2[i17];
            int iBinarySearch = Arrays.binarySearch(fArrE, f15);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f15);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i17] = c(f15, fArr2[iBinarySearch2], fArrE, iArrD);
            } else {
                iArr[i17] = d(f15, iArrD[iBinarySearch], fArr, fArr2);
            }
        }
        return new od.d(fArrE2, iArr);
    }

    private int d(float f15, int i15, float[] fArr, float[] fArr2) {
        float fI;
        if (fArr2.length < 2 || f15 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i15), Color.green(i15), Color.blue(i15));
        }
        for (int i16 = 1; i16 < fArr.length; i16++) {
            float f16 = fArr[i16];
            if (f16 >= f15 || i16 == fArr.length - 1) {
                if (f16 <= f15) {
                    fI = fArr2[i16];
                } else {
                    int i17 = i16 - 1;
                    float f17 = fArr[i17];
                    fI = td.j.i(fArr2[i17], fArr2[i16], (f15 - f17) / (f16 - f17));
                }
                return Color.argb((int) (fI * 255.0f), Color.red(i15), Color.green(i15), Color.blue(i15));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < length; i18++) {
            float f15 = i16 < fArr.length ? fArr[i16] : Float.NaN;
            float f16 = i17 < fArr2.length ? fArr2[i17] : Float.NaN;
            if (Float.isNaN(f16) || f15 < f16) {
                fArr3[i18] = f15;
                i16++;
            } else if (Float.isNaN(f15) || f16 < f15) {
                fArr3[i18] = f16;
                i17++;
            } else {
                fArr3[i18] = f15;
                i16++;
                i17++;
                i15++;
            }
        }
        return i15 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i15);
    }

    int c(float f15, float f16, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f15 == fArr[0]) {
            return iArr[0];
        }
        for (int i15 = 1; i15 < fArr.length; i15++) {
            float f17 = fArr[i15];
            if (f17 >= f15 || i15 == fArr.length - 1) {
                if (i15 == fArr.length - 1 && f15 >= f17) {
                    return Color.argb((int) (f16 * 255.0f), Color.red(iArr[i15]), Color.green(iArr[i15]), Color.blue(iArr[i15]));
                }
                int i16 = i15 - 1;
                float f18 = fArr[i16];
                int iC = td.c.c((f15 - f18) / (f17 - f18), iArr[i16], iArr[i15]);
                return Color.argb((int) (f16 * 255.0f), Color.red(iC), Color.green(iC), Color.blue(iC));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00cf  */
    @Override // rd.n0
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public od.d a(sd.c cVar, float f15) {
        ArrayList arrayList = new ArrayList();
        boolean z15 = cVar.y() == sd.c.b.BEGIN_ARRAY;
        if (z15) {
            cVar.h();
        }
        while (cVar.p()) {
            arrayList.add(Float.valueOf((float) cVar.nextDouble()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f173213a = 2;
        }
        if (z15) {
            cVar.m();
        }
        if (this.f173213a == -1) {
            this.f173213a = arrayList.size() / 4;
        }
        int i15 = this.f173213a;
        float[] fArr = new float[i15];
        int[] iArr = new int[i15];
        int i16 = 0;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f173213a * 4; i18++) {
            int i19 = i18 / 4;
            double dFloatValue = arrayList.get(i18).floatValue();
            int i25 = i18 % 4;
            if (i25 != 0) {
                if (i25 == 1) {
                    i16 = (int) (dFloatValue * 255.0d);
                } else if (i25 == 2) {
                    i17 = (int) (dFloatValue * 255.0d);
                } else if (i25 == 3) {
                    iArr[i19] = Color.argb(GF2Field.MASK, i16, i17, (int) (dFloatValue * 255.0d));
                }
            } else if (i19 > 0) {
                float f16 = (float) dFloatValue;
                if (fArr[i19 - 1] >= f16) {
                    fArr[i19] = f16 + 0.01f;
                } else {
                    fArr[i19] = (float) dFloatValue;
                }
            } else {
                fArr[i19] = (float) dFloatValue;
            }
        }
        return b(new od.d(fArr, iArr), arrayList);
    }
}
