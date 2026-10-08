package p010PrN;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
class j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f877a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CharSequence f878b;

    j1(int i15, CharSequence charSequence) {
        this.f877a = i15;
        this.f878b = charSequence;
    }

    private static String a(CharSequence charSequence) {
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    private boolean d(CharSequence charSequence) {
        String strA = a(this.f878b);
        String strA2 = a(charSequence);
        if (strA == null && strA2 == null) {
            return true;
        }
        return strA != null && strA.equals(strA2);
    }

    int b() {
        return this.f877a;
    }

    CharSequence c() {
        return this.f878b;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j1) {
            j1 j1Var = (j1) obj;
            if (this.f877a == j1Var.f877a && d(j1Var.f878b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f877a), a(this.f878b)});
    }
}
