package i5;

import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int[] f89326a = new int[10];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected float[] f89327b = new float[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f89328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f89329d;

    public String toString() {
        String str = this.f89329d;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i15 = 0; i15 < this.f89328c; i15++) {
            str = str + "[" + this.f89326a[i15] + " , " + decimalFormat.format(this.f89327b[i15]) + "] ";
        }
        return str;
    }
}
