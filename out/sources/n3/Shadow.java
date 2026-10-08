package n3;

import androidx.compose.ui.graphics.Color;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n3.w2, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000  2\u00020\u0001:\u0001\u0016B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J+\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u0012\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0017\u0012\u0004\b\u001d\u0010\u001b\u001a\u0004\b\u001c\u0010\u0019R \u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u001b\u001a\u0004\b \u0010!¨\u0006#"}, d2 = {"Ln3/w2;", "", "Landroidx/compose/ui/graphics/Color;", "color", "Lm3/e;", "offset", "", "blurRadius", "<init>", "(JJFLfr/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "(JJF)Ln3/w2;", "a", "J", "e", "()J", "getColor-0d7_KjU$annotations", "()V", "f", "getOffset-F1C5BW0$annotations", "c", "F", "d", "()F", "getBlurRadius$annotations", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Shadow {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Shadow f131100e = new Shadow(0, 0, 0.0f, 7, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long color;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long offset;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final float blurRadius;

    /* JADX INFO: renamed from: n3.w2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Ln3/w2$a;", "", "<init>", "()V", "Ln3/w2;", "None", "Ln3/w2;", "a", "()Ln3/w2;", "getNone$annotations", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final Shadow a() {
            return Shadow.f131100e;
        }

        private Companion() {
        }
    }

    public /* synthetic */ Shadow(long j15, long j16, float f15, fr.k kVar) {
        this(j15, j16, f15);
    }

    public static /* synthetic */ Shadow c(Shadow shadow, long j15, long j16, float f15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            j15 = shadow.color;
        }
        long j17 = j15;
        if ((i15 & 2) != 0) {
            j16 = shadow.offset;
        }
        long j18 = j16;
        if ((i15 & 4) != 0) {
            f15 = shadow.blurRadius;
        }
        return shadow.b(j17, j18, f15);
    }

    public final Shadow b(long color, long offset, float blurRadius) {
        return new Shadow(color, offset, blurRadius, null);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final float getBlurRadius() {
        return this.blurRadius;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getColor() {
        return this.color;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Shadow)) {
            return false;
        }
        Shadow shadow = (Shadow) other;
        return Color.m11equalsimpl0(this.color, shadow.color) && m3.e.j(this.offset, shadow.offset) && this.blurRadius == shadow.blurRadius;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getOffset() {
        return this.offset;
    }

    public int hashCode() {
        return (((Color.m17hashCodeimpl(this.color) * 31) + m3.e.o(this.offset)) * 31) + Float.hashCode(this.blurRadius);
    }

    public String toString() {
        return "Shadow(color=" + ((Object) Color.m18toStringimpl(this.color)) + ", offset=" + ((Object) m3.e.s(this.offset)) + ", blurRadius=" + this.blurRadius + ')';
    }

    private Shadow(long j15, long j16, float f15) {
        this.color = j15;
        this.offset = j16;
        this.blurRadius = f15;
    }

    public /* synthetic */ Shadow(long j15, long j16, float f15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? o1.d(4278190080L) : j15, (i15 & 2) != 0 ? m3.e.INSTANCE.c() : j16, (i15 & 4) != 0 ? 0.0f : f15, null);
    }
}
