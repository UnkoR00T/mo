package p076m2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0011\u0010\t\u001a\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b\"\u001a\u0010\u000f\u001a\u00020\n8GX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f\"\u0015\u0010\u0014\u001a\u00060\u0010j\u0002`\u00118G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Loq/i0;", "d", "()V", "Lm2/v;", "e", "(Lm2/r;I)Lm2/v;", "Lm2/d4;", "c", "(Lm2/r;I)Lm2/d4;", "currentRecomposeScope", "", "a", "(Lm2/r;I)I", "getCurrentCompositeKeyHash$annotations", "(Lm2/r;I)V", "currentCompositeKeyHash", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "b", "(Lm2/r;I)J", "currentCompositeKeyHashCode", "runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class m {
    public static final int a(r rVar, int i15) {
        if (t.k()) {
            t.o(524444915, i15, -1, "androidx.compose.runtime.<get-currentCompositeKeyHash> (Composables.kt:252)");
        }
        int iS = rVar.S();
        if (t.k()) {
            t.n();
        }
        return iS;
    }

    public static final long b(r rVar, int i15) {
        if (t.k()) {
            t.o(-168259424, i15, -1, "androidx.compose.runtime.<get-currentCompositeKeyHashCode> (Composables.kt:268)");
        }
        long jQ = rVar.q();
        if (t.k()) {
            t.n();
        }
        return jQ;
    }

    public static final d4 c(r rVar, int i15) {
        if (t.k()) {
            t.o(394957799, i15, -1, "androidx.compose.runtime.<get-currentRecomposeScope> (Composables.kt:216)");
        }
        d4 d4VarA = rVar.A();
        if (d4VarA == null) {
            throw new IllegalStateException("no recompose scope found");
        }
        rVar.L(d4VarA);
        if (t.k()) {
            t.n();
        }
        return d4VarA;
    }

    public static final void d() {
        throw new IllegalStateException("Invalid applier");
    }

    public static final v e(r rVar, int i15) {
        if (t.k()) {
            t.o(-1165786124, i15, -1, "androidx.compose.runtime.rememberCompositionContext (Composables.kt:516)");
        }
        v vVarT = rVar.T();
        if (t.k()) {
            t.n();
        }
        return vVarT;
    }
}
