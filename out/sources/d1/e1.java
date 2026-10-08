package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0001\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0004\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\"\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0007\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001a¨\u0006\u001e"}, d2 = {"Ld1/e1;", "", "", "lineIndex", "positionInLine", "Lc5/h;", "maxMainAxisSize", "maxCrossAxisSize", "<init>", "(IIFFLfr/k;)V", "Loq/i0;", "a", "(IIFF)V", "I", "getLineIndex$foundation_layout", "()I", "setLineIndex$foundation_layout", "(I)V", "b", "getPositionInLine$foundation_layout", "setPositionInLine$foundation_layout", "c", "F", "getMaxMainAxisSize-D9Ej5fM$foundation_layout", "()F", "setMaxMainAxisSize-0680j_4$foundation_layout", "(F)V", "d", "getMaxCrossAxisSize-D9Ej5fM$foundation_layout", "setMaxCrossAxisSize-0680j_4$foundation_layout", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int lineIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int positionInLine;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private float maxMainAxisSize;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private float maxCrossAxisSize;

    public /* synthetic */ e1(int i15, int i16, float f15, float f16, fr.k kVar) {
        this(i15, i16, f15, f16);
    }

    public final void a(int lineIndex, int positionInLine, float maxMainAxisSize, float maxCrossAxisSize) {
        this.lineIndex = lineIndex;
        this.positionInLine = positionInLine;
        this.maxMainAxisSize = maxMainAxisSize;
        this.maxCrossAxisSize = maxCrossAxisSize;
    }

    private e1(int i15, int i16, float f15, float f16) {
        this.lineIndex = i15;
        this.positionInLine = i16;
        this.maxMainAxisSize = f15;
        this.maxCrossAxisSize = f16;
    }
}
