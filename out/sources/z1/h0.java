package z1;

import p071kotlin.Metadata;
import q4.TextLayoutResult;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0004¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010\u001eR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010*\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020'8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010)R\u0011\u0010,\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u001f\u0010\u0017R\u0011\u0010.\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b-\u0010\u001eR\u0011\u00101\u001a\u00020/8F¢\u0006\u0006\u001a\u0004\b!\u00100¨\u00062"}, d2 = {"Lz1/h0;", "", "", "selectableId", "", "slot", "rawStartHandleOffset", "rawEndHandleOffset", "rawPreviousHandleOffset", "Lq4/t3;", "textLayoutResult", "<init>", "(JIIIILq4/t3;)V", "other", "", "m", "(Lz1/h0;)Z", "offset", "Lz1/j0$a;", "a", "(I)Lz1/j0$a;", "", "toString", "()Ljava/lang/String;", "J", "h", "()J", "b", "I", "i", "()I", "c", "g", "d", "e", "f", "Lq4/t3;", "k", "()Lq4/t3;", "Lb5/i;", "j", "()Lb5/i;", "startRunDirection", "endRunDirection", "inputText", "l", "textLength", "Lz1/p;", "()Lz1/p;", "rawCrossStatus", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f232080g = TextLayoutResult.f164599g;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long selectableId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int slot;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int rawStartHandleOffset;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int rawEndHandleOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int rawPreviousHandleOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutResult textLayoutResult;

    public h0(long j15, int i15, int i16, int i17, int i18, TextLayoutResult textLayoutResult) {
        this.selectableId = j15;
        this.slot = i15;
        this.rawStartHandleOffset = i16;
        this.rawEndHandleOffset = i17;
        this.rawPreviousHandleOffset = i18;
        this.textLayoutResult = textLayoutResult;
    }

    private final b5.i b() {
        return d1.a(this.textLayoutResult, this.rawEndHandleOffset);
    }

    private final b5.i j() {
        return d1.a(this.textLayoutResult, this.rawStartHandleOffset);
    }

    public final Selection.AnchorInfo a(int offset) {
        return new Selection.AnchorInfo(d1.a(this.textLayoutResult, offset), offset, this.selectableId);
    }

    public final String c() {
        return this.textLayoutResult.getLayoutInput().getText().getText();
    }

    public final p d() {
        int i15 = this.rawStartHandleOffset;
        int i16 = this.rawEndHandleOffset;
        if (i15 < i16) {
            return p.NOT_CROSSED;
        }
        return i15 > i16 ? p.CROSSED : p.COLLAPSED;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getRawEndHandleOffset() {
        return this.rawEndHandleOffset;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getRawPreviousHandleOffset() {
        return this.rawPreviousHandleOffset;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getRawStartHandleOffset() {
        return this.rawStartHandleOffset;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getSelectableId() {
        return this.selectableId;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getSlot() {
        return this.slot;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }

    public final int l() {
        return c().length();
    }

    public final boolean m(h0 other) {
        return (this.selectableId == other.selectableId && this.rawStartHandleOffset == other.rawStartHandleOffset && this.rawEndHandleOffset == other.rawEndHandleOffset) ? false : true;
    }

    public String toString() {
        return "SelectionInfo(id=" + this.selectableId + ", range=(" + this.rawStartHandleOffset + '-' + j() + ',' + this.rawEndHandleOffset + '-' + b() + "), prevOffset=" + this.rawPreviousHandleOffset + ')';
    }
}
