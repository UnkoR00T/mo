package i20;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: i20.j, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0081\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bB\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u0015\u0010\u0010R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u0018\u0010\u0010R\u0017\u0010 \u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\"\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010$\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b!\u0010\u001fR\u0017\u0010&\u001a\u00020\u001c8\u0006¢\u0006\f\n\u0004\b%\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006'"}, d2 = {"Li20/j;", "", "", "width", "height", "horizontalMargin", "verticalMargin", "<init>", "(IIII)V", "size", "margin", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "getWidth", "b", "getHeight", "c", "d", "Lc5/h;", "e", "F", "()F", "viewWidth", "f", "viewHeight", "g", "viewWidthWithoutPadding", "h", "viewHeightWithoutPadding", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ViewSize {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int width;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int height;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int horizontalMargin;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int verticalMargin;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float viewWidth;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final float viewHeight;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final float viewWidthWithoutPadding;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final float viewHeightWithoutPadding;

    public ViewSize(int i15, int i16, int i17, int i18) {
        this.width = i15;
        this.height = i16;
        this.horizontalMargin = i17;
        this.verticalMargin = i18;
        this.viewWidth = c5.h.n(i15);
        this.viewHeight = c5.h.n(i16);
        this.viewWidthWithoutPadding = c5.h.n(i15);
        this.viewHeightWithoutPadding = c5.h.n(i16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getHorizontalMargin() {
        return this.horizontalMargin;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getVerticalMargin() {
        return this.verticalMargin;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getViewHeight() {
        return this.viewHeight;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getViewHeightWithoutPadding() {
        return this.viewHeightWithoutPadding;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final float getViewWidth() {
        return this.viewWidth;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ViewSize)) {
            return false;
        }
        ViewSize viewSize = (ViewSize) other;
        return this.width == viewSize.width && this.height == viewSize.height && this.horizontalMargin == viewSize.horizontalMargin && this.verticalMargin == viewSize.verticalMargin;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final float getViewWidthWithoutPadding() {
        return this.viewWidthWithoutPadding;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.horizontalMargin)) * 31) + Integer.hashCode(this.verticalMargin);
    }

    public String toString() {
        return "ViewSize(width=" + this.width + ", height=" + this.height + ", horizontalMargin=" + this.horizontalMargin + ", verticalMargin=" + this.verticalMargin + ')';
    }

    public ViewSize(int i15, int i16) {
        this(i15, i15, i16, i16);
    }
}
