package androidx.p016lifecycle;

import android.os.Bundle;
import fr.k;
import java.util.LinkedHashMap;
import java.util.Map;
import n7.b;
import p071kotlin.Metadata;
import ua.c;
import ua.g;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\rB\u001f\b\u0017\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\t\b\u0017¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ \u0010\r\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u0003H\u0087\u0002¢\u0006\u0004\b\r\u0010\u000eJ(\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\f\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00018\u0000H\u0087\u0002¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0014R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0017¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/i0;", "", "", "", "initialState", "<init>", "(Ljava/util/Map;)V", "()V", "Lua/g$b;", "b", "()Lua/g$b;", "T", "key", "a", "(Ljava/lang/String;)Ljava/lang/Object;", "value", "Loq/i0;", "c", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "Ljava/util/Map;", "liveDatas", "Ln7/b;", "Ln7/b;", "impl", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<String, Object> liveDatas;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private b impl;

    /* JADX INFO: renamed from: androidx.lifecycle.i0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\t\u001a\u00020\b2\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00052\u000e\u0010\u0007\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/i0$a;", "", "<init>", "()V", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "restoredState", "defaultState", "Landroidx/lifecycle/i0;", "a", "(Landroid/os/Bundle;Landroid/os/Bundle;)Landroidx/lifecycle/i0;", "value", "", "b", "(Ljava/lang/Object;)Z", "lifecycle-viewmodel-savedstate"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final i0 a(Bundle restoredState, Bundle defaultState) {
            if (restoredState == null) {
                restoredState = defaultState;
            }
            if (restoredState == null) {
                return new i0();
            }
            restoredState.setClassLoader(i0.class.getClassLoader());
            return new i0(c.y(c.a(restoredState)));
        }

        public final boolean b(Object value) {
            return n7.c.a(value);
        }

        private Companion() {
        }
    }

    public i0(Map<String, ? extends Object> map) {
        this.liveDatas = new LinkedHashMap();
        this.impl = new b(map);
    }

    public final <T> T a(String key) {
        return (T) this.impl.b(key);
    }

    public final g.b b() {
        return this.impl.getSavedStateProvider();
    }

    public final <T> void c(String key, T value) {
        if (!INSTANCE.b(value)) {
            throw new IllegalArgumentException(("Can't put value with type " + value.getClass() + " into saved state").toString());
        }
        Object obj = this.liveDatas.get(key);
        b0 b0Var = obj instanceof b0 ? (b0) obj : null;
        if (b0Var != null) {
            b0Var.o(value);
        }
        this.impl.f(key, value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i0() {
        this.liveDatas = new LinkedHashMap();
        this.impl = new b(null, 1, 0 == true ? 1 : 0);
    }
}
