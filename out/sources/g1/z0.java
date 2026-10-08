package g1;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001:\u0003\n\u0019\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR$\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010\"\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010!R\u0016\u0010#\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010!R\u0016\u0010$\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010!R\u0016\u0010&\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010!R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010,\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010)R*\u00101\u001a\u00020\u00062\u0006\u0010-\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010!\u001a\u0004\b(\u0010.\"\u0004\b/\u00100R\u0014\u00102\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010.R\u0011\u00103\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010.¨\u00064"}, d2 = {"Lg1/z0;", "", "Lg1/l;", "gridContent", "<init>", "(Lg1/l;)V", "", "currentSlotsPerLine", "", "Lg1/c;", "c", "(I)Ljava/util/List;", "Loq/i0;", "i", "()V", "lineIndex", "Lg1/z0$c;", "d", "(I)Lg1/z0$c;", "itemIndex", "e", "(I)I", "maxSpan", "k", "(II)I", "a", "Lg1/l;", "Ljava/util/ArrayList;", "Lg1/z0$a;", "Lkotlin/collections/ArrayList;", "b", "Ljava/util/ArrayList;", "buckets", "I", "lastLineIndex", "lastLineStartItemIndex", "lastLineStartKnownSpan", "f", "cachedBucketIndex", "", "g", "Ljava/util/List;", "cachedBucket", "h", "previousDefaultSpans", "value", "()I", "j", "(I)V", "slotsPerLine", "bucketSize", "totalSize", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l gridContent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<a> buckets;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int lastLineIndex;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartItemIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int lastLineStartKnownSpan;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int cachedBucketIndex;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Integer> cachedBucket;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<g1.c> previousDefaultSpans;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int slotsPerLine;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\u000b\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\"\u0010\u000e\u001a\u00020\u00048\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u0006\u001a\u0004\b\r\u0010\b\"\u0004\b\u0005\u0010\n¨\u0006\u000f"}, d2 = {"Lg1/z0$b;", "Lg1/x;", "<init>", "()V", "", "b", "I", "getMaxCurrentLineSpan", "()I", "a", "(I)V", "maxCurrentLineSpan", "c", "getMaxLineSpan", "maxLineSpan", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f69475a = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static int maxCurrentLineSpan;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static int maxLineSpan;

        private b() {
        }

        public void a(int i15) {
            maxCurrentLineSpan = i15;
        }

        public void b(int i15) {
            maxLineSpan = i15;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lg1/z0$c;", "", "", "firstItemIndex", "", "Lg1/c;", "spans", "<init>", "(ILjava/util/List;)V", "a", "I", "()I", "b", "Ljava/util/List;", "()Ljava/util/List;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<g1.c> spans;

        public c(int i15, List<g1.c> list) {
            this.firstItemIndex = i15;
            this.spans = list;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        public final List<g1.c> b() {
            return this.spans;
        }
    }

    public z0(l lVar) {
        this.gridContent = lVar;
        ArrayList<a> arrayList = new ArrayList<>();
        int i15 = 0;
        arrayList.add(new a(i15, i15, 2, null));
        this.buckets = arrayList;
        this.cachedBucketIndex = -1;
        this.cachedBucket = new ArrayList();
        this.previousDefaultSpans = pq.v.n();
    }

    private final int b() {
        return ((int) Math.sqrt((((double) h()) * 1.0d) / ((double) this.slotsPerLine))) + 1;
    }

    private final List<g1.c> c(int currentSlotsPerLine) {
        if (currentSlotsPerLine == this.previousDefaultSpans.size()) {
            return this.previousDefaultSpans;
        }
        ArrayList arrayList = new ArrayList(currentSlotsPerLine);
        for (int i15 = 0; i15 < currentSlotsPerLine; i15++) {
            arrayList.add(g1.c.a(x0.a(1)));
        }
        this.previousDefaultSpans = arrayList;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int f(int i15, a aVar) {
        return aVar.getFirstItemIndex() - i15;
    }

    private final void i() {
        this.buckets.clear();
        int i15 = 0;
        this.buckets.add(new a(i15, i15, 2, null));
        this.lastLineIndex = 0;
        this.lastLineStartItemIndex = 0;
        this.lastLineStartKnownSpan = 0;
        this.cachedBucketIndex = -1;
        this.cachedBucket.clear();
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0091  */
    public final c d(int lineIndex) {
        int i15;
        boolean z15;
        int i16;
        int i17;
        if (!this.gridContent.getHasCustomSpans()) {
            int i18 = lineIndex * this.slotsPerLine;
            return new c(i18, c(lr.m.e(lr.m.j(this.slotsPerLine, h() - i18), 0)));
        }
        int iMin = Math.min(lineIndex / b(), this.buckets.size() - 1);
        int iB = b() * iMin;
        int firstItemIndex = this.buckets.get(iMin).getFirstItemIndex();
        int firstItemKnownSpan = this.buckets.get(iMin).getFirstItemKnownSpan();
        int i19 = this.lastLineIndex;
        if (iB <= i19 && i19 <= lineIndex) {
            firstItemIndex = this.lastLineStartItemIndex;
            firstItemKnownSpan = this.lastLineStartKnownSpan;
            iB = i19;
        } else if (iMin == this.cachedBucketIndex && (i15 = lineIndex - iB) < this.cachedBucket.size()) {
            firstItemIndex = this.cachedBucket.get(i15).intValue();
            iB = lineIndex;
            firstItemKnownSpan = 0;
        }
        if (iB % b() == 0) {
            int iB2 = b();
            int i25 = lineIndex - iB;
            if (2 > i25 || i25 >= iB2) {
                z15 = false;
            } else {
                z15 = true;
            }
        } else {
            z15 = false;
        }
        if (z15) {
            this.cachedBucketIndex = iMin;
            this.cachedBucket.clear();
        }
        if (!(iB <= lineIndex)) {
            c1.e.c("currentLine (" + iB + ") > lineIndex (" + lineIndex + ')');
        }
        while (iB < lineIndex && firstItemIndex < h()) {
            if (z15) {
                this.cachedBucket.add(Integer.valueOf(firstItemIndex));
            }
            int i26 = 0;
            while (i26 < this.slotsPerLine && firstItemIndex < h()) {
                if (firstItemKnownSpan == 0) {
                    i17 = firstItemKnownSpan;
                    firstItemKnownSpan = k(firstItemIndex, this.slotsPerLine - i26);
                } else {
                    i17 = 0;
                }
                i26 += firstItemKnownSpan;
                if (i26 > this.slotsPerLine) {
                    break;
                }
                firstItemIndex++;
                firstItemKnownSpan = i17;
            }
            iB++;
            if (iB % b() == 0 && firstItemIndex < h()) {
                if (!(this.buckets.size() == iB / b())) {
                    c1.e.c("invalid starting point");
                }
                this.buckets.add(new a(firstItemIndex, firstItemKnownSpan));
            }
        }
        this.lastLineIndex = lineIndex;
        this.lastLineStartItemIndex = firstItemIndex;
        this.lastLineStartKnownSpan = firstItemKnownSpan;
        ArrayList arrayList = new ArrayList();
        int i27 = 0;
        int i28 = firstItemIndex;
        while (i27 < this.slotsPerLine && i28 < h()) {
            if (firstItemKnownSpan == 0) {
                int i29 = firstItemKnownSpan;
                firstItemKnownSpan = k(i28, this.slotsPerLine - i27);
                i16 = i29;
            } else {
                i16 = 0;
            }
            i27 += firstItemKnownSpan;
            if (i27 > this.slotsPerLine) {
                break;
            }
            i28++;
            arrayList.add(g1.c.a(x0.a(firstItemKnownSpan)));
            firstItemKnownSpan = i16;
        }
        return new c(firstItemIndex, arrayList);
    }

    public final int e(final int itemIndex) {
        int i15 = 0;
        if (h() <= 0) {
            return 0;
        }
        if (!(itemIndex < h())) {
            c1.e.a("ItemIndex > total count");
        }
        if (!this.gridContent.getHasCustomSpans()) {
            return itemIndex / this.slotsPerLine;
        }
        int iL = pq.v.l(this.buckets, 0, 0, new er.l() { // from class: g1.y0
            @Override // er.l
            public final Object b(Object obj) {
                return Integer.valueOf(z0.f(itemIndex, (z0.a) obj));
            }
        }, 3, null);
        int i16 = 2;
        if (iL < 0) {
            iL = (-iL) - 2;
        }
        int iB = b() * iL;
        int firstItemIndex = this.buckets.get(iL).getFirstItemIndex();
        if (!(firstItemIndex <= itemIndex)) {
            c1.e.a("currentItemIndex > itemIndex");
        }
        int i17 = 0;
        while (firstItemIndex < itemIndex) {
            int i18 = firstItemIndex + 1;
            int iK = k(firstItemIndex, this.slotsPerLine - i17);
            i17 += iK;
            int i19 = this.slotsPerLine;
            if (i17 >= i19) {
                if (i17 == i19) {
                    iB++;
                    i17 = 0;
                } else {
                    iB++;
                    i17 = iK;
                }
            }
            if (iB % b() == 0 && iB / b() >= this.buckets.size()) {
                this.buckets.add(new a(i18 - (i17 > 0 ? 1 : 0), i15, i16, null));
            }
            firstItemIndex = i18;
        }
        return i17 + k(itemIndex, this.slotsPerLine - i17) > this.slotsPerLine ? iB + 1 : iB;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSlotsPerLine() {
        return this.slotsPerLine;
    }

    public final int h() {
        return this.gridContent.l().getSize();
    }

    public final void j(int i15) {
        if (i15 != this.slotsPerLine) {
            this.slotsPerLine = i15;
            i();
        }
    }

    public final int k(int itemIndex, int maxSpan) {
        b bVar = b.f69475a;
        bVar.a(maxSpan);
        bVar.b(this.slotsPerLine);
        h1.n.a<j> aVar = this.gridContent.l().get(itemIndex);
        return g1.c.d(aVar.c().b().B(bVar, Integer.valueOf(itemIndex - aVar.getStartIndex())).getPackedValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\b\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lg1/z0$a;", "", "", "firstItemIndex", "firstItemKnownSpan", "<init>", "(II)V", "a", "I", "()I", "b", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int firstItemIndex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int firstItemKnownSpan;

        public a(int i15, int i16) {
            this.firstItemIndex = i15;
            this.firstItemKnownSpan = i16;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getFirstItemIndex() {
            return this.firstItemIndex;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFirstItemKnownSpan() {
            return this.firstItemKnownSpan;
        }

        public /* synthetic */ a(int i15, int i16, int i17, fr.k kVar) {
            this(i15, (i17 & 2) != 0 ? 0 : i16);
        }
    }
}
