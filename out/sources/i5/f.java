package i5;

import java.lang.reflect.Array;
import java.text.DecimalFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f89333d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f89334e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f89330a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int[] f89331b = new int[10];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected float[][] f89332c = (float[][]) Array.newInstance((Class<?>) Float.TYPE, 10, 3);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected float[] f89335f = new float[3];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected boolean f89336g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected float f89337h = Float.NaN;

    public String toString() {
        String str = this.f89334e;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (int i15 = 0; i15 < this.f89333d; i15++) {
            str = str + "[" + this.f89331b[i15] + " , " + decimalFormat.format(this.f89332c[i15]) + "] ";
        }
        return str;
    }
}
