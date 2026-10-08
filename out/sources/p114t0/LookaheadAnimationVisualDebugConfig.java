package p114t0;

import androidx.compose.ui.graphics.Color;
import fr.k;
import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: t0.m0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b\u0017\u0010\u0016¨\u0006 "}, d2 = {"Lt0/m0;", "", "", "isEnabled", "Landroidx/compose/ui/graphics/Color;", "overlayColor", "multipleMatchesColor", "unmatchedElementColor", "isShowKeyLabelEnabled", "<init>", "(ZJJJZLfr/k;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Z", "()Z", "b", "J", "getOverlayColor-0d7_KjU", "()J", "c", "getMultipleMatchesColor-0d7_KjU", "d", "getUnmatchedElementColor-0d7_KjU", "e", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LookaheadAnimationVisualDebugConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long overlayColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long multipleMatchesColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final long unmatchedElementColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isShowKeyLabelEnabled;

    public /* synthetic */ LookaheadAnimationVisualDebugConfig(boolean z15, long j15, long j16, long j17, boolean z16, k kVar) {
        this(z15, j15, j16, j17, z16);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getIsShowKeyLabelEnabled() {
        return this.isShowKeyLabelEnabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LookaheadAnimationVisualDebugConfig)) {
            return false;
        }
        LookaheadAnimationVisualDebugConfig lookaheadAnimationVisualDebugConfig = (LookaheadAnimationVisualDebugConfig) other;
        return this.isEnabled == lookaheadAnimationVisualDebugConfig.isEnabled && Color.m11equalsimpl0(this.overlayColor, lookaheadAnimationVisualDebugConfig.overlayColor) && Color.m11equalsimpl0(this.multipleMatchesColor, lookaheadAnimationVisualDebugConfig.multipleMatchesColor) && Color.m11equalsimpl0(this.unmatchedElementColor, lookaheadAnimationVisualDebugConfig.unmatchedElementColor) && this.isShowKeyLabelEnabled == lookaheadAnimationVisualDebugConfig.isShowKeyLabelEnabled;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.isEnabled) * 31) + Color.m17hashCodeimpl(this.overlayColor)) * 31) + Color.m17hashCodeimpl(this.multipleMatchesColor)) * 31) + Color.m17hashCodeimpl(this.unmatchedElementColor)) * 31) + Boolean.hashCode(this.isShowKeyLabelEnabled);
    }

    public String toString() {
        return "LookaheadAnimationVisualDebugConfig(isEnabled=" + this.isEnabled + ", overlayColor=" + ((Object) Color.m18toStringimpl(this.overlayColor)) + ", multipleMatchesColor=" + ((Object) Color.m18toStringimpl(this.multipleMatchesColor)) + ", unmatchedElementColor=" + ((Object) Color.m18toStringimpl(this.unmatchedElementColor)) + ", isShowKeyLabelEnabled=" + this.isShowKeyLabelEnabled + ')';
    }

    private LookaheadAnimationVisualDebugConfig(boolean z15, long j15, long j16, long j17, boolean z16) {
        this.isEnabled = z15;
        this.overlayColor = j15;
        this.multipleMatchesColor = j16;
        this.unmatchedElementColor = j17;
        this.isShowKeyLabelEnabled = z16;
    }

    public /* synthetic */ LookaheadAnimationVisualDebugConfig(boolean z15, long j15, long j16, long j17, boolean z16, int i15, k kVar) {
        this((i15 & 1) != 0 ? true : z15, (i15 & 2) != 0 ? o1.d(2150934611L) : j15, (i15 & 4) != 0 ? o1.d(4293542709L) : j16, (i15 & 8) != 0 ? o1.d(4288323750L) : j17, (i15 & 16) != 0 ? false : z16, null);
    }
}
