package w2;

import java.util.Iterator;
import p071kotlin.Metadata;
import pq.k;
import t2.g;
import v2.d;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 $*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0012\u0004\u0012\u00028\u00000\u0003:\u0001%B/\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0018\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00078\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020 8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lw2/b;", "E", "Lpq/k;", "Lt2/g;", "", "firstElement", "lastElement", "Lv2/d;", "Lw2/a;", "hashMap", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;Lv2/d;)V", "element", "", "contains", "(Ljava/lang/Object;)Z", "add", "(Ljava/lang/Object;)Lt2/g;", "remove", "", "iterator", "()Ljava/util/Iterator;", "b", "Ljava/lang/Object;", "getFirstElement$runtime", "()Ljava/lang/Object;", "c", "getLastElement$runtime", "d", "Lv2/d;", "getHashMap$runtime", "()Lv2/d;", "", "f", "()I", "size", "e", "a", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b<E> extends k<E> implements g<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f209324f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final b f209325g;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Object firstElement;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lastElement;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d<E, a> hashMap;

    /* JADX INFO: renamed from: w2.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005\"\u0004\b\u0001\u0010\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lw2/b$a;", "", "<init>", "()V", "E", "Lt2/g;", "a", "()Lt2/g;", "Lw2/b;", "", "EMPTY", "Lw2/b;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final <E> g<E> a() {
            return b.f209325g;
        }

        private Companion() {
        }
    }

    static {
        x2.c cVar = x2.c.f216506a;
        f209325g = new b(cVar, cVar, d.INSTANCE.a());
    }

    public b(Object obj, Object obj2, d<E, a> dVar) {
        this.firstElement = obj;
        this.lastElement = obj2;
        this.hashMap = dVar;
    }

    @Override // java.util.Collection, java.util.Set, t2.g
    public g<E> add(E element) {
        if (this.hashMap.containsKey(element)) {
            return this;
        }
        if (isEmpty()) {
            return new b(element, element, this.hashMap.r(element, new a()));
        }
        Object obj = this.lastElement;
        a aVar = this.hashMap.get(obj);
        return new b(this.firstElement, element, this.hashMap.r((E) obj, aVar.e(element)).r(element, new a(obj)));
    }

    @Override // pq.b, java.util.Collection, java.util.List
    public boolean contains(Object element) {
        return this.hashMap.containsKey(element);
    }

    @Override // pq.b
    /* JADX INFO: renamed from: f */
    public int getSize() {
        return this.hashMap.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return new c(this.firstElement, this.hashMap);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Collection, java.util.Set, t2.g
    public g<E> remove(E element) {
        a aVar = this.hashMap.get(element);
        if (aVar == null) {
            return this;
        }
        d dVarS = this.hashMap.s(element);
        if (aVar.b()) {
            dVarS = dVarS.r(aVar.getPrevious(), ((a) dVarS.get(aVar.getPrevious())).e(aVar.getNext()));
        }
        if (aVar.a()) {
            dVarS = dVarS.r(aVar.getNext(), ((a) dVarS.get(aVar.getNext())).f(aVar.getPrevious()));
        }
        return new b(!aVar.b() ? aVar.getNext() : this.firstElement, !aVar.a() ? aVar.getPrevious() : this.lastElement, dVarS);
    }
}
