package com.google.android.libraries.places.internal;

/* JADX INFO: loaded from: classes4.dex */
public class a91 extends c91 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[][] f31578a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f31579b;

    protected a91(b91 b91Var, char c15, char c16) {
        zj.p.q(b91Var);
        char[][] cArrB = b91Var.b();
        this.f31578a = cArrB;
        this.f31579b = cArrB.length;
    }

    @Override // com.google.android.libraries.places.internal.c91, com.google.android.libraries.places.internal.d91
    public final String a(String str) {
        zj.p.q(str);
        for (int i15 = 0; i15 < str.length(); i15++) {
            char cCharAt = str.charAt(i15);
            if (cCharAt < this.f31579b && this.f31578a[cCharAt] != null) {
                return c(str, i15);
            }
        }
        return str;
    }

    @Override // com.google.android.libraries.places.internal.c91
    protected final char[] b(char c15) {
        char[] cArr;
        if (c15 >= this.f31579b || (cArr = this.f31578a[c15]) == null) {
            return null;
        }
        return cArr;
    }
}
