package i5;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int[] f89338a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int[] f89339b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f89340c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int[] f89341d = new int[10];

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    float[] f89342e = new float[10];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f89343f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    int[] f89344g = new int[5];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String[] f89345h = new String[5];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f89346i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    int[] f89347j = new int[4];

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    boolean[] f89348k = new boolean[4];

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f89349l = 0;

    public void a(int i15, float f15) {
        int i16 = this.f89343f;
        int[] iArr = this.f89341d;
        if (i16 >= iArr.length) {
            this.f89341d = Arrays.copyOf(iArr, iArr.length * 2);
            float[] fArr = this.f89342e;
            this.f89342e = Arrays.copyOf(fArr, fArr.length * 2);
        }
        int[] iArr2 = this.f89341d;
        int i17 = this.f89343f;
        iArr2[i17] = i15;
        float[] fArr2 = this.f89342e;
        this.f89343f = i17 + 1;
        fArr2[i17] = f15;
    }

    public void b(int i15, int i16) {
        int i17 = this.f89340c;
        int[] iArr = this.f89338a;
        if (i17 >= iArr.length) {
            this.f89338a = Arrays.copyOf(iArr, iArr.length * 2);
            int[] iArr2 = this.f89339b;
            this.f89339b = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f89338a;
        int i18 = this.f89340c;
        iArr3[i18] = i15;
        int[] iArr4 = this.f89339b;
        this.f89340c = i18 + 1;
        iArr4[i18] = i16;
    }

    public void c(int i15, String str) {
        int i16 = this.f89346i;
        int[] iArr = this.f89344g;
        if (i16 >= iArr.length) {
            this.f89344g = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f89345h;
            this.f89345h = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
        }
        int[] iArr2 = this.f89344g;
        int i17 = this.f89346i;
        iArr2[i17] = i15;
        String[] strArr2 = this.f89345h;
        this.f89346i = i17 + 1;
        strArr2[i17] = str;
    }

    public String toString() {
        return "TypedBundle{mCountInt=" + this.f89340c + ", mCountFloat=" + this.f89343f + ", mCountString=" + this.f89346i + ", mCountBoolean=" + this.f89349l + '}';
    }
}
