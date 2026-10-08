package x7;

import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f217142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f217143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f217144c;

    private a(int i15, int i16, String str) {
        this.f217142a = i15;
        this.f217143b = i16;
        this.f217144c = str;
    }

    public static a a(c0 c0Var) {
        String str;
        c0Var.g0(2);
        int iQ = c0Var.Q();
        int i15 = iQ >> 1;
        int iQ2 = ((c0Var.Q() >> 3) & 31) | ((iQ & 1) << 5);
        if (i15 == 4 || i15 == 5 || i15 == 7 || i15 == 8) {
            str = "dvhe";
        } else if (i15 == 9) {
            str = "dvav";
        } else {
            if (i15 != 10) {
                return null;
            }
            str = "dav1";
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(str);
        sb5.append(i15 < 10 ? ".0" : ".");
        sb5.append(i15);
        sb5.append(iQ2 < 10 ? ".0" : ".");
        sb5.append(iQ2);
        return new a(i15, iQ2, sb5.toString());
    }
}
