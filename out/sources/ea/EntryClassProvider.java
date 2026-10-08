package ea;

import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: ea.g, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0082\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BQ\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u0005¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\n0\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001b\u0010#¨\u0006$"}, d2 = {"Lea/g;", "", "K", "Lmr/c;", "clazz", "Lkotlin/Function1;", "clazzContentKey", "", "", "metadata", "Loq/i0;", "content", "<init>", "(Lmr/c;Ler/l;Ljava/util/Map;Ler/q;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmr/c;", "getClazz", "()Lmr/c;", "b", "Ler/l;", "()Ler/l;", "c", "Ljava/util/Map;", "()Ljava/util/Map;", "d", "Ler/q;", "()Ler/q;", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
final /* data */ class EntryClassProvider<K> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final mr.c<K> clazz;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<K, Object> clazzContentKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> metadata;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.q<K, p076m2.r, Integer, i0> content;

    /* JADX WARN: Multi-variable type inference failed */
    public EntryClassProvider(mr.c<K> cVar, er.l<? super K, ? extends Object> lVar, Map<String, ? extends Object> map, er.q<? super K, ? super p076m2.r, ? super Integer, i0> qVar) {
        this.clazz = cVar;
        this.clazzContentKey = lVar;
        this.metadata = map;
        this.content = qVar;
    }

    public final er.l<K, Object> a() {
        return this.clazzContentKey;
    }

    public final er.q<K, p076m2.r, Integer, i0> b() {
        return this.content;
    }

    public final Map<String, Object> c() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EntryClassProvider)) {
            return false;
        }
        EntryClassProvider entryClassProvider = (EntryClassProvider) other;
        return fr.t.c(this.clazz, entryClassProvider.clazz) && fr.t.c(this.clazzContentKey, entryClassProvider.clazzContentKey) && fr.t.c(this.metadata, entryClassProvider.metadata) && fr.t.c(this.content, entryClassProvider.content);
    }

    public int hashCode() {
        return (((((this.clazz.hashCode() * 31) + this.clazzContentKey.hashCode()) * 31) + this.metadata.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "EntryClassProvider(clazz=" + this.clazz + ", clazzContentKey=" + this.clazzContentKey + ", metadata=" + this.metadata + ", content=" + this.content + ')';
    }
}
