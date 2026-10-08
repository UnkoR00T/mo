package p9;

import android.text.TextUtils;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f153522a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153523b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f153524c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f153525d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f153526e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f153527f;

    private a(int i15, int i16, int i17, int i18, int i19, int i25) {
        this.f153522a = i15;
        this.f153523b = i16;
        this.f153524c = i17;
        this.f153525d = i18;
        this.f153526e = i19;
        this.f153527f = i25;
    }

    public static a a(String str) {
        p.d(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), ",");
        int i15 = -1;
        int i16 = -1;
        int i17 = -1;
        int i18 = -1;
        int i19 = -1;
        for (int i25 = 0; i25 < strArrSplit.length; i25++) {
            String strF = zj.c.f(strArrSplit[i25].trim());
            strF.getClass();
            switch (strF) {
                case "end":
                    i17 = i25;
                    break;
                case "text":
                    i19 = i25;
                    break;
                case "layer":
                    i15 = i25;
                    break;
                case "start":
                    i16 = i25;
                    break;
                case "style":
                    i18 = i25;
                    break;
            }
        }
        if (i16 == -1 || i17 == -1 || i19 == -1) {
            return null;
        }
        return new a(i15, i16, i17, i18, i19, strArrSplit.length);
    }
}
