package a8;

import android.annotation.SuppressLint;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* JADX INFO: loaded from: classes3.dex */
public interface a3 {

    public interface a {
        void a(z2 z2Var);
    }

    @SuppressLint({"WrongConstant"})
    static int C(int i15) {
        return i15 & 3584;
    }

    @SuppressLint({"WrongConstant"})
    static int I(int i15, int i16, int i17, int i18, int i19, int i25) {
        return i15 | i16 | i17 | i18 | i19 | i25;
    }

    @SuppressLint({"WrongConstant"})
    static int K(int i15) {
        return i15 & 64;
    }

    @SuppressLint({"WrongConstant"})
    static int T(int i15) {
        return i15 & 7;
    }

    @SuppressLint({"WrongConstant"})
    static int o(int i15) {
        return i15 & MLKEMEngine.KyberPolyBytes;
    }

    static boolean p(int i15, boolean z15) {
        int iT = T(i15);
        if (iT != 4) {
            return z15 && iT == 3;
        }
        return true;
    }

    static int t(int i15, int i16, int i17, int i18, int i19) {
        return I(i15, i16, i17, i18, i19, 0);
    }

    static int v(int i15, int i16, int i17, int i18) {
        return I(i15, i16, i17, 0, 128, i18);
    }

    @SuppressLint({"WrongConstant"})
    static int w(int i15) {
        return i15 & 32;
    }

    @SuppressLint({"WrongConstant"})
    static int x(int i15) {
        return i15 & 24;
    }

    static int y(int i15) {
        return v(i15, 0, 0, 0);
    }

    int Q();

    int a(t7.p pVar);

    int g();

    String getName();

    default void k() {
    }

    default void u(a aVar) {
    }
}
