package ja;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0016\u0013B)\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012\u0082\u0001\u0002\u0018\u0019¨\u0006\u001a"}, d2 = {"Lja/p1;", "", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lja/y;", "loadType", "e", "(Lja/y;)I", "hashCode", "()I", "a", "I", "d", "b", "c", "Lja/p1$a;", "Lja/p1$b;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class p1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int presentedItemsBefore;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int presentedItemsAfter;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int originalPageOffsetFirst;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int originalPageOffsetLast;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0018\u0010\u0011¨\u0006\u0019"}, d2 = {"Lja/p1$a;", "Lja/p1;", "", "pageOffset", "indexInPage", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIIIII)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "e", "I", "g", "f", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends p1 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int pageOffset;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int indexInPage;

        public a(int i15, int i16, int i17, int i18, int i19, int i25) {
            super(i17, i18, i19, i25, null);
            this.pageOffset = i15;
            this.indexInPage = i16;
        }

        @Override // ja.p1
        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return this.pageOffset == aVar.pageOffset && this.indexInPage == aVar.indexInPage && getPresentedItemsBefore() == aVar.getPresentedItemsBefore() && getPresentedItemsAfter() == aVar.getPresentedItemsAfter() && getOriginalPageOffsetFirst() == aVar.getOriginalPageOffsetFirst() && getOriginalPageOffsetLast() == aVar.getOriginalPageOffsetLast();
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getIndexInPage() {
            return this.indexInPage;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final int getPageOffset() {
            return this.pageOffset;
        }

        @Override // ja.p1
        public int hashCode() {
            return super.hashCode() + Integer.hashCode(this.pageOffset) + Integer.hashCode(this.indexInPage);
        }

        public String toString() {
            return fu.r.p("ViewportHint.Access(\n            |    pageOffset=" + this.pageOffset + ",\n            |    indexInPage=" + this.indexInPage + ",\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lja/p1$b;", "Lja/p1;", "", "presentedItemsBefore", "presentedItemsAfter", "originalPageOffsetFirst", "originalPageOffsetLast", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "paging-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends p1 {
        public b(int i15, int i16, int i17, int i18) {
            super(i15, i16, i17, i18, null);
        }

        public String toString() {
            return fu.r.p("ViewportHint.Initial(\n            |    presentedItemsBefore=" + getPresentedItemsBefore() + ",\n            |    presentedItemsAfter=" + getPresentedItemsAfter() + ",\n            |    originalPageOffsetFirst=" + getOriginalPageOffsetFirst() + ",\n            |    originalPageOffsetLast=" + getOriginalPageOffsetLast() + ",\n            |)", null, 1, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f101120a;

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
            f101120a = iArr;
        }
    }

    public /* synthetic */ p1(int i15, int i16, int i17, int i18, fr.k kVar) {
        this(i15, i16, i17, i18);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getOriginalPageOffsetFirst() {
        return this.originalPageOffsetFirst;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getOriginalPageOffsetLast() {
        return this.originalPageOffsetLast;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPresentedItemsAfter() {
        return this.presentedItemsAfter;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPresentedItemsBefore() {
        return this.presentedItemsBefore;
    }

    public final int e(y loadType) {
        int i15 = c.f101120a[loadType.ordinal()];
        if (i15 == 1) {
            throw new IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        if (i15 == 2) {
            return this.presentedItemsBefore;
        }
        if (i15 == 3) {
            return this.presentedItemsAfter;
        }
        throw new oq.p();
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p1)) {
            return false;
        }
        p1 p1Var = (p1) other;
        return this.presentedItemsBefore == p1Var.presentedItemsBefore && this.presentedItemsAfter == p1Var.presentedItemsAfter && this.originalPageOffsetFirst == p1Var.originalPageOffsetFirst && this.originalPageOffsetLast == p1Var.originalPageOffsetLast;
    }

    public int hashCode() {
        return Integer.hashCode(this.presentedItemsBefore) + Integer.hashCode(this.presentedItemsAfter) + Integer.hashCode(this.originalPageOffsetFirst) + Integer.hashCode(this.originalPageOffsetLast);
    }

    private p1(int i15, int i16, int i17, int i18) {
        this.presentedItemsBefore = i15;
        this.presentedItemsAfter = i16;
        this.originalPageOffsetFirst = i17;
        this.originalPageOffsetLast = i18;
    }
}
