package i5;

import java.text.DecimalFormat;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f89319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f89320b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f89321c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f89322d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    ArrayList<a> f89323e = new ArrayList<>();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f89324a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        float f89325b;
    }

    public String toString() {
        String str = this.f89319a;
        DecimalFormat decimalFormat = new DecimalFormat("##.##");
        for (a aVar : this.f89323e) {
            str = str + "[" + aVar.f89324a + " , " + decimalFormat.format(aVar.f89325b) + "] ";
        }
        return str;
    }
}
