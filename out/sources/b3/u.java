package b3;

import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import p076m2.b4;
import p076m2.d0;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a?\u0010\t\u001a\u00020\b2\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002\u0018\u00010\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\t\u0010\n\u001a\u0013\u0010\f\u001a\u00020\u0006*\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\r\u001a7\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0010\"\u0004\b\u0000\u0010\u000e\"\u0004\b\u0001\u0010\u000f*\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b\u0011\u0010\u0012\"\u001f\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"", "", "", "", "restoredValues", "Lkotlin/Function1;", "", "canBeSaved", "Lb3/r;", "c", "(Ljava/util/Map;Ler/l;)Lb3/r;", "", "f", "(Ljava/lang/CharSequence;)Z", "K", "V", "Lr0/t0;", "h", "(Ljava/util/Map;)Lr0/t0;", "Lm2/b4;", "a", "Lm2/b4;", "g", "()Lm2/b4;", "LocalSaveableStateRegistry", "runtime-saveable"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<r> f16338a = d0.j(new er.a() { // from class: b3.t
        @Override // er.a
        public final Object a() {
            return u.b();
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    public static final r b() {
        return null;
    }

    public static final r c(Map<String, ? extends List<? extends Object>> map, er.l<Object, Boolean> lVar) {
        return new s(map, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(CharSequence charSequence) {
        int length = charSequence.length();
        for (int i15 = 0; i15 < length; i15++) {
            if (!fu.a.c(charSequence.charAt(i15))) {
                return false;
            }
        }
        return true;
    }

    public static final b4<r> g() {
        return f16338a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> t0<K, V> h(Map<K, ? extends V> map) {
        t0<K, V> t0Var = new t0<>(map.size());
        t0Var.s(map);
        return t0Var;
    }
}
