package ja;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0010\b\u0000\u0018\u0000 2*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003:\u00015B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bB\u0017\b\u0016\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f¢\u0006\u0004\b\n\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\u0007*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b$\u0010%J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000&¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00028\u00002\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b)\u0010%J!\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\u00162\f\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000*¢\u0006\u0004\b,\u0010-J\r\u0010/\u001a\u00020.¢\u0006\u0004\b/\u00100J\u0015\u00102\u001a\u0002012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b2\u00103R \u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0005048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R$\u0010;\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b5\u0010:R$\u0010\b\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b<\u00109\u001a\u0004\b8\u0010:R$\u0010\t\u001a\u00020\u00072\u0006\u00107\u001a\u00020\u00078\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\b=\u00109\u001a\u0004\b<\u0010:R\u0014\u0010?\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b>\u0010:R\u0014\u0010A\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b@\u0010:R\u0014\u0010C\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010:¨\u0006D"}, d2 = {"Lja/k0;", "", "T", "Lja/z0;", "", "Lja/m1;", "pages", "", "placeholdersBefore", "placeholdersAfter", "<init>", "(Ljava/util/List;II)V", "Lja/f0$b;", "insertEvent", "(Lja/f0$b;)V", "index", "Loq/i0;", "f", "(I)V", "i", "(Ljava/util/List;)I", "insert", "Lja/q0;", "o", "(Lja/f0$b;)Lja/q0;", "Llr/i;", "pageOffsetsToDrop", "h", "(Llr/i;)I", "Lja/f0$a;", "drop", "g", "(Lja/f0$a;)Lja/q0;", "", "toString", "()Ljava/lang/String;", "j", "(I)Ljava/lang/Object;", "Lja/v;", "q", "()Lja/v;", "k", "Lja/f0;", "pageEvent", "p", "(Lja/f0;)Lja/q0;", "Lja/p1$b;", "n", "()Lja/p1$b;", "Lja/p1$a;", "e", "(I)Lja/p1$a;", "", "a", "Ljava/util/List;", "value", "b", "I", "()I", "dataCount", "c", "d", "l", "originalPageOffsetFirst", "m", "originalPageOffsetLast", "getSize", "size", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class k0<T> implements z0<T> {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final k0<Object> f101007f = new k0<>(f0.b.INSTANCE.e());

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<TransformablePage<T>> pages;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int dataCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int placeholdersBefore;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int placeholdersAfter;

    /* JADX INFO: renamed from: ja.k0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00010\u0007\"\b\b\u0001\u0010\u0004*\u00020\u00012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lja/k0$a;", "", "<init>", "()V", "T", "Lja/f0$b;", "event", "Lja/k0;", "a", "(Lja/f0$b;)Lja/k0;", "INITIAL", "Lja/k0;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final <T> k0<T> a(f0.b<T> event) {
            return event != null ? new k0<>(event) : k0.f101007f;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101012a;

        static {
            int[] iArr = new int[y.values().length];
            try {
                iArr[y.REFRESH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[y.PREPEND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[y.APPEND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101012a = iArr;
        }
    }

    public k0(List<TransformablePage<T>> list, int i15, int i16) {
        this.pages = pq.v.i1(list);
        this.dataCount = i(list);
        this.placeholdersBefore = i15;
        this.placeholdersAfter = i16;
    }

    private final void f(int index) {
        if (index < 0 || index >= getSize()) {
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + getSize());
        }
    }

    private final q0<T> g(f0.a<T> drop) {
        int iH = h(new lr.i(drop.getMinPageOffset(), drop.getMaxPageOffset()));
        this.dataCount = getDataCount() - iH;
        if (drop.getLoadType() == y.PREPEND) {
            int placeholdersBefore = getPlaceholdersBefore();
            this.placeholdersBefore = drop.getPlaceholdersRemaining();
            return new q0.c(iH, getPlaceholdersBefore(), placeholdersBefore);
        }
        int placeholdersAfter = getPlaceholdersAfter();
        this.placeholdersAfter = drop.getPlaceholdersRemaining();
        return new q0.b(getPlaceholdersBefore() + getDataCount(), iH, drop.getPlaceholdersRemaining(), placeholdersAfter);
    }

    private final int h(lr.i pageOffsetsToDrop) {
        Iterator<TransformablePage<T>> it = this.pages.iterator();
        int size = 0;
        while (it.hasNext()) {
            TransformablePage<T> next = it.next();
            for (int i15 : next.getOriginalPageOffsets()) {
                if (pageOffsetsToDrop.q(i15)) {
                    size += next.b().size();
                    it.remove();
                    break;
                }
            }
        }
        return size;
    }

    private final int i(List<TransformablePage<T>> list) {
        Iterator<T> it = list.iterator();
        int size = 0;
        while (it.hasNext()) {
            size += ((TransformablePage) it.next()).b().size();
        }
        return size;
    }

    private final int l() {
        return pq.n.V0(((TransformablePage) pq.v.l0(this.pages)).getOriginalPageOffsets()).intValue();
    }

    private final int m() {
        return pq.n.U0(((TransformablePage) pq.v.x0(this.pages)).getOriginalPageOffsets()).intValue();
    }

    private final q0<T> o(f0.b<T> insert) {
        int i15 = i(insert.h());
        int i16 = b.f101012a[insert.getLoadType().ordinal()];
        if (i16 == 1) {
            throw new IllegalStateException("Paging received a refresh event in the middle of an actively loading generation\nof PagingData. If you see this exception, it is most likely a bug in the library.\nPlease file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
        }
        if (i16 == 2) {
            int placeholdersBefore = getPlaceholdersBefore();
            this.pages.addAll(0, insert.h());
            this.dataCount = getDataCount() + i15;
            this.placeholdersBefore = insert.getPlaceholdersBefore();
            List<TransformablePage<T>> listH = insert.h();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = listH.iterator();
            while (it.hasNext()) {
                pq.v.D(arrayList, ((TransformablePage) it.next()).b());
            }
            return new q0.d(arrayList, getPlaceholdersBefore(), placeholdersBefore);
        }
        if (i16 != 3) {
            throw new oq.p();
        }
        int placeholdersAfter = getPlaceholdersAfter();
        int dataCount = getDataCount();
        List<TransformablePage<T>> list = this.pages;
        list.addAll(list.size(), insert.h());
        this.dataCount = getDataCount() + i15;
        this.placeholdersAfter = insert.getPlaceholdersAfter();
        int placeholdersBefore2 = getPlaceholdersBefore() + dataCount;
        List<TransformablePage<T>> listH2 = insert.h();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it4 = listH2.iterator();
        while (it4.hasNext()) {
            pq.v.D(arrayList2, ((TransformablePage) it4.next()).b());
        }
        return new q0.a(placeholdersBefore2, arrayList2, getPlaceholdersAfter(), placeholdersAfter);
    }

    @Override // ja.z0
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getDataCount() {
        return this.dataCount;
    }

    @Override // ja.z0
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getPlaceholdersBefore() {
        return this.placeholdersBefore;
    }

    @Override // ja.z0
    /* JADX INFO: renamed from: c, reason: from getter */
    public int getPlaceholdersAfter() {
        return this.placeholdersAfter;
    }

    public final p1.a e(int index) {
        int i15 = 0;
        int placeholdersBefore = index - getPlaceholdersBefore();
        while (placeholdersBefore >= this.pages.get(i15).b().size() && i15 < pq.v.p(this.pages)) {
            placeholdersBefore -= this.pages.get(i15).b().size();
            i15++;
        }
        return this.pages.get(i15).f(placeholdersBefore, index - getPlaceholdersBefore(), ((getSize() - index) - getPlaceholdersAfter()) - 1, l(), m());
    }

    @Override // ja.z0
    public int getSize() {
        return getPlaceholdersBefore() + getDataCount() + getPlaceholdersAfter();
    }

    public final T j(int index) {
        f(index);
        int placeholdersBefore = index - getPlaceholdersBefore();
        if (placeholdersBefore < 0 || placeholdersBefore >= getDataCount()) {
            return null;
        }
        return k(placeholdersBefore);
    }

    public T k(int index) {
        int size = this.pages.size();
        int i15 = 0;
        while (i15 < size) {
            int size2 = this.pages.get(i15).b().size();
            if (size2 > index) {
                break;
            }
            index -= size2;
            i15++;
        }
        return this.pages.get(i15).b().get(index);
    }

    public final p1.b n() {
        int dataCount = getDataCount() / 2;
        return new p1.b(dataCount, dataCount, l(), m());
    }

    public final q0<T> p(f0<T> pageEvent) {
        if (pageEvent instanceof f0.b) {
            return o((f0.b) pageEvent);
        }
        if (pageEvent instanceof f0.a) {
            return g((f0.a) pageEvent);
        }
        throw new IllegalStateException("Paging received an event to process StaticList or LoadStateUpdate while\nprocessing Inserts and Drops. If you see this exception, it is most\nlikely a bug in the library. Please file a bug so we can fix it at:\nhttps://issuetracker.google.com/issues/new?component=413106");
    }

    public final v<T> q() {
        int placeholdersBefore = getPlaceholdersBefore();
        int placeholdersAfter = getPlaceholdersAfter();
        List<TransformablePage<T>> list = this.pages;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList, ((TransformablePage) it.next()).b());
        }
        return new v<>(placeholdersBefore, placeholdersAfter, arrayList);
    }

    public String toString() {
        int dataCount = getDataCount();
        ArrayList arrayList = new ArrayList(dataCount);
        for (int i15 = 0; i15 < dataCount; i15++) {
            arrayList.add(k(i15));
        }
        return "[(" + getPlaceholdersBefore() + " placeholders), " + pq.v.v0(arrayList, null, null, null, 0, null, null, 63, null) + ", (" + getPlaceholdersAfter() + " placeholders)]";
    }

    public k0(f0.b<T> bVar) {
        this(bVar.h(), bVar.getPlaceholdersBefore(), bVar.getPlaceholdersAfter());
    }
}
