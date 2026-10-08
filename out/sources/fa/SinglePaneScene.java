package fa;

import ea.NavEntry;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: fa.y, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0081\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B1\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\u0012\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0015\u0010\u001fR&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\u001fR \u0010)\u001a\b\u0012\u0004\u0012\u00020$0#8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lfa/y;", "", "T", "Lfa/h;", "key", "Lea/m;", "entry", "", "previousEntries", "<init>", "(Ljava/lang/Object;Lea/m;Ljava/util/List;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/Object;", "getKey", "()Ljava/lang/Object;", "b", "Lea/m;", "getEntry", "()Lea/m;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "getEntries", "entries", "Lkotlin/Function0;", "Loq/i0;", "e", "Ler/p;", "getContent", "()Ler/p;", "content", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SinglePaneScene<T> implements h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object key;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final NavEntry<T> entry;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<NavEntry<T>> previousEntries;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<NavEntry<T>> entries;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.p<p076m2.r, Integer, i0> content = y2.m.b(-322904035, true, new er.p() { // from class: fa.x
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return SinglePaneScene.d(this.f60390a, (p076m2.r) obj, ((Integer) obj2).intValue());
        }
    });

    public SinglePaneScene(Object obj, NavEntry<T> navEntry, List<NavEntry<T>> list) {
        this.key = obj;
        this.entry = navEntry;
        this.previousEntries = list;
        this.entries = pq.v.e(navEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(SinglePaneScene singlePaneScene, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-322904035, i15, -1, "androidx.navigation3.scene.SinglePaneScene.content.<anonymous> (SinglePaneScene.kt:28)");
            }
            singlePaneScene.entry.b(rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    @Override // fa.h
    public List<NavEntry<T>> a() {
        return this.previousEntries;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && SinglePaneScene.class == other.getClass()) {
            SinglePaneScene singlePaneScene = (SinglePaneScene) other;
            if (fr.t.c(getKey(), singlePaneScene.getKey()) && fr.t.c(this.entry, singlePaneScene.entry) && fr.t.c(a(), singlePaneScene.a()) && fr.t.c(getEntries(), singlePaneScene.getEntries())) {
                return true;
            }
        }
        return false;
    }

    @Override // fa.h
    public er.p<p076m2.r, Integer, i0> getContent() {
        return this.content;
    }

    @Override // fa.h
    public List<NavEntry<T>> getEntries() {
        return this.entries;
    }

    @Override // fa.h
    public Object getKey() {
        return this.key;
    }

    public int hashCode() {
        return (getKey().hashCode() * 31) + (this.entry.hashCode() * 31) + (a().hashCode() * 31) + (getEntries().hashCode() * 31);
    }

    public String toString() {
        return "SinglePaneScene(key=" + getKey() + ", entry=" + this.entry + ", previousEntries=" + a() + ", entries=" + getEntries() + ')';
    }
}
