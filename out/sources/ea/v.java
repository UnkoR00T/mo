package ea;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a)\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"", "T", "Lb3/i;", "saveableStateHolder", "Lea/u;", "a", "(Lb3/i;Lm2/r;II)Lea/u;", "navigation3-runtime"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class v {
    public static final <T> u<T> a(b3.i iVar, p076m2.r rVar, int i15, int i16) {
        if ((i16 & 1) != 0) {
            iVar = b3.q.b(rVar, 0);
        }
        if (p076m2.t.k()) {
            p076m2.t.o(-344159445, i15, -1, "androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator (SaveableStateHolderNavEntryDecorator.kt:35)");
        }
        boolean zW = rVar.W(iVar);
        Object objE = rVar.E();
        if (zW || objE == p076m2.r.INSTANCE.a()) {
            objE = new u(iVar);
            rVar.v(objE);
        }
        u<T> uVar = (u) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return uVar;
    }
}
