package u8;

import o8.s0;
import t7.x;
import w7.c0;

/* JADX INFO: loaded from: classes3.dex */
abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final s0 f196296a;

    public static final class a extends x {
        public a(String str) {
            super(str, null, false, 1);
        }
    }

    protected e(s0 s0Var) {
        this.f196296a = s0Var;
    }

    public final boolean a(c0 c0Var, long j15) {
        return b(c0Var) && c(c0Var, j15);
    }

    protected abstract boolean b(c0 c0Var);

    protected abstract boolean c(c0 c0Var, long j15);
}
