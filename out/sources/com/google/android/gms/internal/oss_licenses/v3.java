package com.google.android.gms.internal.oss_licenses;

/* JADX INFO: loaded from: classes3.dex */
public final class v3 {
    public static final ju.t1 a(int i15, b4 b4Var) {
        try {
            return ju.v1.c(a4.a().a(Integer.MAX_VALUE, b4Var));
        } catch (IllegalArgumentException e15) {
            if (b4Var == b4.INTERACTIVE) {
                return ju.v1.c(a4.a().a(Integer.MAX_VALUE, b4.HIGH_SPEED));
            }
            throw e15;
        }
    }
}
