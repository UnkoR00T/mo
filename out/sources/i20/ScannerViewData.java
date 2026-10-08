package i20;

import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i20.i, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0014\u0012B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Li20/i;", "", "Li20/i$b;", "previewScaleType", "Li20/i$a;", "indicator", "<init>", "(Li20/i$b;Li20/i$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li20/i$b;", "b", "()Li20/i$b;", "Li20/i$a;", "()Li20/i$a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScannerViewData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f88411c = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b previewScaleType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a indicator;

    /* JADX INFO: renamed from: i20.i$a */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\n¨\u0006\u0012"}, d2 = {"Li20/i$a;", "", "", "indicatorResId", "Li20/j;", "viewSize", "<init>", "(Ljava/lang/String;IILi20/j;)V", "a", "I", "e", "()I", "b", "Li20/j;", "g", "()Li20/j;", "c", "d", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        SQUARE(c20.b.f22653c, new ViewSize(194, 16)),
        RECT(c20.b.f22657d, new ViewSize(270, 133, 12, 23)),
        NONE(-1, new ViewSize(-1, -1));


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f88418g = wq.b.a(b());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int indicatorResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final ViewSize viewSize;

        a(int i15, ViewSize viewSize) {
            this.indicatorResId = i15;
            this.viewSize = viewSize;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getIndicatorResId() {
            return this.indicatorResId;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ViewSize getViewSize() {
            return this.viewSize;
        }
    }

    /* JADX INFO: renamed from: i20.i$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Li20/i$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        FILL_CENTER,
        FIT_CENTER;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f88424d = wq.b.a(b());
    }

    public ScannerViewData(b bVar, a aVar) {
        this.previewScaleType = bVar;
        this.indicator = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getIndicator() {
        return this.indicator;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b getPreviewScaleType() {
        return this.previewScaleType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScannerViewData)) {
            return false;
        }
        ScannerViewData scannerViewData = (ScannerViewData) other;
        return this.previewScaleType == scannerViewData.previewScaleType && this.indicator == scannerViewData.indicator;
    }

    public int hashCode() {
        return (this.previewScaleType.hashCode() * 31) + this.indicator.hashCode();
    }

    public String toString() {
        return "ScannerViewData(previewScaleType=" + this.previewScaleType + ", indicator=" + this.indicator + ')';
    }

    public /* synthetic */ ScannerViewData(b bVar, a aVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? b.FILL_CENTER : bVar, (i15 & 2) != 0 ? a.NONE : aVar);
    }
}
