package c5;

import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u0000 22\u00020\u0001:\u0001\u0018B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001a\u0010\u0013R \u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0010\u0010\u0019\u0012\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R \u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0019\u0012\u0004\b!\u0010\u001c\u001a\u0004\b \u0010\u0013R \u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\"\u0010\u0019\u0012\u0004\b#\u0010\u001c\u001a\u0004\b\"\u0010\u0013R\u001a\u0010&\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b%\u0010\u001c\u001a\u0004\b$\u0010\u0013R\u001a\u0010)\u001a\u00020\u00028FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u001c\u001a\u0004\b'\u0010\u0013R\u001a\u0010-\u001a\u00020\u00158FX\u0087\u0004¢\u0006\f\u0012\u0004\b,\u0010\u001c\u001a\u0004\b*\u0010+R\u0011\u00101\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0011\u00103\u001a\u00020.8F¢\u0006\u0006\u001a\u0004\b2\u00100¨\u00064"}, d2 = {"Lc5/p;", "", "", "left", "top", "right", "bottom", "<init>", "(IIII)V", "translateX", "translateY", "m", "(II)Lc5/p;", "", "toString", "()Ljava/lang/String;", "b", "(IIII)Lc5/p;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "g", "getLeft$annotations", "()V", "i", "getTop$annotations", "c", "h", "getRight$annotations", "d", "getBottom$annotations", "k", "getWidth$annotations", "width", "f", "getHeight$annotations", "height", "l", "()Z", "isEmpty$annotations", "isEmpty", "Lc5/n;", "j", "()J", "topLeft", "e", "center", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class p {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final p f23414f = new p(0, 0, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int left;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int top;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int right;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int bottom;

    /* JADX INFO: renamed from: c5.p$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lc5/p$a;", "", "<init>", "()V", "Lc5/p;", "Zero", "Lc5/p;", "a", "()Lc5/p;", "getZero$annotations", "ui-unit"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final p a() {
            return p.f23414f;
        }

        private Companion() {
        }
    }

    public p(int i15, int i16, int i17, int i18) {
        this.left = i15;
        this.top = i16;
        this.right = i17;
        this.bottom = i18;
    }

    public static /* synthetic */ p c(p pVar, int i15, int i16, int i17, int i18, int i19, Object obj) {
        if ((i19 & 1) != 0) {
            i15 = pVar.left;
        }
        if ((i19 & 2) != 0) {
            i16 = pVar.top;
        }
        if ((i19 & 4) != 0) {
            i17 = pVar.right;
        }
        if ((i19 & 8) != 0) {
            i18 = pVar.bottom;
        }
        return pVar.b(i15, i16, i17, i18);
    }

    public final p b(int left, int top, int right, int bottom) {
        return new p(left, top, right, bottom);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getBottom() {
        return this.bottom;
    }

    public final long e() {
        int iK = this.left + (k() / 2);
        return n.d((((long) (this.top + (f() / 2))) & BodyPartID.bodyIdMax) | (((long) iK) << 32));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return this.left == pVar.left && this.top == pVar.top && this.right == pVar.right && this.bottom == pVar.bottom;
    }

    public final int f() {
        return this.bottom - this.top;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getLeft() {
        return this.left;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getRight() {
        return this.right;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.left) * 31) + Integer.hashCode(this.top)) * 31) + Integer.hashCode(this.right)) * 31) + Integer.hashCode(this.bottom);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getTop() {
        return this.top;
    }

    public final long j() {
        return n.d((((long) this.top) & BodyPartID.bodyIdMax) | (((long) this.left) << 32));
    }

    public final int k() {
        return this.right - this.left;
    }

    public final boolean l() {
        return this.left >= this.right || this.top >= this.bottom;
    }

    public final p m(int translateX, int translateY) {
        return new p(this.left + translateX, this.top + translateY, this.right + translateX, this.bottom + translateY);
    }

    public String toString() {
        return "IntRect.fromLTRB(" + this.left + ", " + this.top + ", " + this.right + ", " + this.bottom + ')';
    }
}
