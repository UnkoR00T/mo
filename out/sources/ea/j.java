package ea;

import fr.q0;
import java.util.LinkedHashMap;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B!\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007Jg\u0010\u0011\u001a\u00020\u000f\"\b\b\u0001\u0010\b*\u00028\u00002\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\t2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00010\u00032\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00010\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u000f0\u0003¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u0003H\u0001¢\u0006\u0004\b\u0013\u0010\u0014R&\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R0\u0010\u001a\u001a\u001e\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0019R(\u0010\u001c\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u001b0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0019¨\u0006\u001d"}, d2 = {"Lea/j;", "", "T", "Lkotlin/Function1;", "Lea/m;", "fallback", "<init>", "(Ler/l;)V", "K", "Lmr/c;", "clazz", "clazzContentKey", "", "", "metadata", "Loq/i0;", "content", "b", "(Lmr/c;Ler/l;Ljava/util/Map;Ler/q;)V", "c", "()Ler/l;", "a", "Ler/l;", "", "Lea/g;", "Ljava/util/Map;", "clazzProviders", "Lea/h;", "providers", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class j<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<T, NavEntry<T>> fallback;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<mr.c<? extends T>, EntryClassProvider<? extends T>> clazzProviders = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<Object, h<? extends T>> providers = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public j(er.l<? super T, NavEntry<T>> lVar) {
        this.fallback = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NavEntry d(j jVar, Object obj) {
        EntryClassProvider<? extends T> entryClassProvider = jVar.clazzProviders.get(q0.c(obj.getClass()));
        EntryClassProvider<? extends T> entryClassProvider2 = entryClassProvider instanceof EntryClassProvider ? entryClassProvider : null;
        jVar.providers.get(obj);
        return entryClassProvider2 != null ? new NavEntry(obj, entryClassProvider2.a().b(obj), entryClassProvider2.c(), entryClassProvider2.b()) : jVar.fallback.b(obj);
    }

    public final <K extends T> void b(mr.c<? extends K> clazz, er.l<K, ? extends Object> clazzContentKey, Map<String, ? extends Object> metadata, er.q<? super K, ? super p076m2.r, ? super Integer, i0> content) {
        if (!this.clazzProviders.containsKey(clazz)) {
            this.clazzProviders.put(clazz, new EntryClassProvider<>(clazz, clazzContentKey, metadata, content));
            return;
        }
        throw new IllegalArgumentException(("An `entry` with the same `clazz` has already been added: " + clazz.D() + '.').toString());
    }

    public final er.l<T, NavEntry<T>> c() {
        return new er.l() { // from class: ea.i
            @Override // er.l
            public final Object b(Object obj) {
                return j.d(this.f48836a, obj);
            }
        };
    }
}
