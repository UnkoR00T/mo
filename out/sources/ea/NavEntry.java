package ea;

import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;

/* JADX INFO: renamed from: ea.m, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0001\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fB+\b\u0016\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\"¨\u0006#"}, d2 = {"Lea/m;", "", "T", "key", "contentKey", "", "", "metadata", "Lkotlin/Function1;", "Loq/i0;", "content", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/Map;Ler/q;)V", "navEntry", "(Lea/m;Ler/q;)V", "b", "(Lm2/r;I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "c", "Ljava/util/Map;", "e", "()Ljava/util/Map;", "Ler/q;", "navigation3-runtime"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NavEntry<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final T key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object contentKey;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, Object> metadata;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.q<T, p076m2.r, Integer, i0> content;

    /* JADX WARN: Multi-variable type inference failed */
    public NavEntry(T t15, Object obj, Map<String, ? extends Object> map, er.q<? super T, ? super p076m2.r, ? super Integer, i0> qVar) {
        this.key = t15;
        this.contentKey = obj;
        this.metadata = map;
        this.content = qVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(NavEntry navEntry, int i15, p076m2.r rVar, int i16) {
        navEntry.b(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public final void b(p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(295512821);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(295512821, i16, -1, "androidx.navigation3.runtime.NavEntry.Content (NavEntry.kt:63)");
            }
            this.content.w(this.key, rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ea.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return NavEntry.c(this.f48840a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getContentKey() {
        return this.contentKey;
    }

    public final Map<String, Object> e() {
        return this.metadata;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && NavEntry.class == other.getClass()) {
            NavEntry navEntry = (NavEntry) other;
            if (fr.t.c(this.key, navEntry.key) && fr.t.c(this.contentKey, navEntry.contentKey) && fr.t.c(this.metadata, navEntry.metadata) && this.content == navEntry.content) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.key.hashCode() * 31) + (this.contentKey.hashCode() * 31) + (this.metadata.hashCode() * 31) + (this.content.hashCode() * 31);
    }

    public String toString() {
        return "NavEntry(key=" + this.key + ", contentKey=" + this.contentKey + ", metadata=" + this.metadata + ", content=" + this.content + ')';
    }

    public NavEntry(NavEntry<T> navEntry, er.q<? super T, ? super p076m2.r, ? super Integer, i0> qVar) {
        this(navEntry.key, navEntry.contentKey, navEntry.metadata, qVar);
    }
}
