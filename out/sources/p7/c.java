package p7;

import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import er.l;
import java.util.LinkedHashMap;
import java.util.Map;
import p071kotlin.Metadata;
import r7.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\f\u001a\u00020\u000b\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010R(\u0010\u0014\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0013¨\u0006\u0015"}, d2 = {"Lp7/c;", "", "<init>", "()V", "Landroidx/lifecycle/t0;", "T", "Lmr/c;", "clazz", "Lkotlin/Function1;", "Lp7/a;", "initializer", "Loq/i0;", "a", "(Lmr/c;Ler/l;)V", "Landroidx/lifecycle/w0$c;", "b", "()Landroidx/lifecycle/w0$c;", "", "Lp7/f;", "Ljava/util/Map;", "initializers", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Map<mr.c<?>, f<?>> initializers = new LinkedHashMap();

    public final <T extends t0> void a(mr.c<T> clazz, l<? super CreationExtras, ? extends T> initializer) {
        if (!this.initializers.containsKey(clazz)) {
            this.initializers.put(clazz, new f<>(clazz, initializer));
            return;
        }
        throw new IllegalArgumentException(("A `initializer` with the same `clazz` has already been added: " + r7.a.a(clazz) + '.').toString());
    }

    public final w0.c b() {
        return j.f172257a.a(this.initializers.values());
    }
}
