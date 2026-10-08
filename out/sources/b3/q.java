package b3;

import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, d2 = {"Lb3/i;", "b", "(Lm2/r;I)Lb3/i;", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class q {
    public static final i b(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(15454635, i15, -1, "androidx.compose.runtime.saveable.rememberSaveableStateHolder (SaveableStateHolder.kt:57)");
        }
        rVar.X(1967007413);
        Object[] objArr = new Object[0];
        x<o, ?> xVarA = o.INSTANCE.a();
        Object objE = rVar.E();
        if (objE == p076m2.r.INSTANCE.a()) {
            objE = new er.a() { // from class: b3.p
                @Override // er.a
                public final Object a() {
                    return q.c();
                }
            };
            rVar.v(objE);
        }
        o oVar = (o) f.i(objArr, xVarA, (er.a) objE, rVar, MLKEMEngine.KyberPolyBytes);
        oVar.s((r) rVar.N(u.g()));
        rVar.R();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final o c() {
        return new o(null, 1, 0 == true ? 1 : 0);
    }
}
