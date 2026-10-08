package g4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0004\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "Lg4/e;", "Lm2/z;", "local", "a", "(Lg4/e;Lm2/z;)Ljava/lang/Object;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {
    public static final <T> T a(e eVar, p076m2.z<T> zVar) {
        if (!eVar.getNode().getIsAttached()) {
            d4.a.c("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        return (T) h.s(eVar).getCompositionLocalMap().a(zVar);
    }
}
