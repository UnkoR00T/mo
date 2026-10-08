package fa;

import java.util.HashSet;
import java.util.Set;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0006\u001a\u001f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\"&\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00000\u00060\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"", "T", "Lfa/m;", "d", "(Lm2/r;I)Lfa/m;", "Lm2/b4;", "", "a", "Lm2/b4;", "c", "()Lm2/b4;", "LocalEntriesToExcludeFromCurrentScene", "navigation3-ui"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Set<Object>> f60383a = d0.h(null, new er.a() { // from class: fa.n
        @Override // er.a
        public final Object a() {
            return o.b();
        }
    }, 1, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set b() {
        return new HashSet();
    }

    public static final b4<Set<Object>> c() {
        return f60383a;
    }

    public static final <T> m<T> d(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-881900212, i15, -1, "androidx.navigation3.scene.rememberSceneSetupNavEntryDecorator (SceneSetupNavEntryDecorator.kt:30)");
        }
        Object objE = rVar.E();
        if (objE == p076m2.r.INSTANCE.a()) {
            objE = new m(null, 1, null);
            rVar.v(objE);
        }
        m<T> mVar = (m) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVar;
    }
}
