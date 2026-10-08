package nw;

import fr.k;
import fr.t;
import java.util.List;
import oq.r;
import oq.y;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b&\u0018\u0000 \u00182\u00020\u0001:\u0002\u0018\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u00060\u0006R\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH&¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0007\u001a\u00060\u0006R\u00020\u00042\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00172\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u0013\u001a\u00060\u0006R\u00020\u00042\n\u0010\u0014\u001a\u00060\u0006R\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001c\u001a\u00020\u00152\n\u0010\u001a\u001a\u00060\u0006R\u00020\u00042\n\u0010\u001b\u001a\u00060\u0006R\u00020\u0004H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ/\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u00042\n\u0010\u001a\u001a\u00060\u0006R\u00020\u00042\n\u0010\u001b\u001a\u00060\u0006R\u00020\u0004H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ#\u0010\"\u001a\u00020\u00152\n\u0010 \u001a\u00060\u0006R\u00020\u00042\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\"\u0010#J#\u0010$\u001a\u00020\u00152\n\u0010 \u001a\u00060\u0006R\u00020\u00042\u0006\u0010!\u001a\u00020\u000bH\u0016¢\u0006\u0004\b$\u0010#¨\u0006%"}, d2 = {"Lnw/a;", "", "<init>", "()V", "Lnw/i;", "tokens", "Lnw/i$a;", "iterator", "", "Lnw/a$b;", "delimiters", "", "g", "(Lnw/i;Lnw/i$a;Ljava/util/List;)I", "Lnw/f$c;", "result", "Loq/i0;", "f", "(Lnw/i;Lnw/i$a;Ljava/util/List;Lnw/f$c;)V", "left", "right", "", "canSplitText", "Loq/r;", "a", "(Lnw/i;Lnw/i$a;Lnw/i$a;Z)Loq/r;", "leftIt", "rightIt", "b", "(Lnw/i$a;Lnw/i$a;)Z", "d", "(Lnw/i;Lnw/i$a;Lnw/i$a;)Z", "info", "lookup", "e", "(Lnw/i$a;I)Z", "c", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: nw.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lnw/a$a;", "", "<init>", "()V", "Lnw/i$a;", "Lnw/i;", "iterator", "", "a", "(Lnw/i$a;)C", "", "maxAdvance", "I", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final char a(i.a iterator) {
            return iterator.d();
        }

        private Companion() {
        }
    }

    public r<Boolean, Boolean> a(i tokens, i.a left, i.a right, boolean canSplitText) {
        boolean z15;
        boolean zB = b(left, right);
        boolean zD = d(tokens, left, right);
        if (canSplitText) {
            z15 = zB;
        } else {
            z15 = zB && (!zD || h.INSTANCE.b(left, -1));
        }
        if (!canSplitText) {
            zD = zD && (!zB || h.INSTANCE.b(right, 1));
        }
        return y.a(Boolean.valueOf(z15), Boolean.valueOf(zD));
    }

    public boolean b(i.a leftIt, i.a rightIt) {
        if (e(rightIt, 1)) {
            return false;
        }
        return !c(rightIt, 1) || e(leftIt, -1) || c(leftIt, -1);
    }

    public boolean c(i.a info, int lookup) {
        return h.INSTANCE.b(info, lookup);
    }

    public boolean d(i tokens, i.a leftIt, i.a rightIt) {
        if (leftIt.b(-1) == INSTANCE.a(leftIt) || e(leftIt, -1)) {
            return false;
        }
        return !c(leftIt, -1) || e(rightIt, 1) || c(rightIt, 1);
    }

    public boolean e(i.a info, int lookup) {
        return h.INSTANCE.c(info, lookup);
    }

    public abstract void f(i tokens, i.a iterator, List<Info> delimiters, f.c result);

    public abstract int g(i tokens, i.a iterator, List<Info> delimiters);

    /* JADX INFO: renamed from: nw.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00072\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001c\u001a\u0004\b\u001f\u0010\u0013R\"\u0010\b\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001b\u0010!\"\u0004\b\"\u0010#R\"\u0010\t\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010 \u001a\u0004\b\u0017\u0010!\"\u0004\b%\u0010#R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010&\u001a\u0004\b$\u0010'\"\u0004\b(\u0010)R\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lnw/a$b;", "", "Lyv/a;", "tokenType", "", "position", "length", "", "canOpen", "canClose", "", "marker", "closerIndex", "<init>", "(Lyv/a;IIZZCI)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lyv/a;", "g", "()Lyv/a;", "b", "I", "f", "c", "d", "Z", "()Z", "i", "(Z)V", "e", "h", "C", "()C", "setMarker", "(C)V", "j", "(I)V", "markdown"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final /* data */ class Info {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final yv.a tokenType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final int position;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final int length;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean canOpen;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private boolean canClose;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private char marker;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private int closerIndex;

        public Info(yv.a aVar, int i15, int i16, boolean z15, boolean z16, char c15, int i17) {
            this.tokenType = aVar;
            this.position = i15;
            this.length = i16;
            this.canOpen = z15;
            this.canClose = z16;
            this.marker = c15;
            this.closerIndex = i17;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getCanClose() {
            return this.canClose;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getCanOpen() {
            return this.canOpen;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getCloserIndex() {
            return this.closerIndex;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getLength() {
            return this.length;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final char getMarker() {
            return this.marker;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Info)) {
                return false;
            }
            Info info = (Info) other;
            return t.c(this.tokenType, info.tokenType) && this.position == info.position && this.length == info.length && this.canOpen == info.canOpen && this.canClose == info.canClose && this.marker == info.marker && this.closerIndex == info.closerIndex;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final int getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final yv.a getTokenType() {
            return this.tokenType;
        }

        public final void h(boolean z15) {
            this.canClose = z15;
        }

        public int hashCode() {
            return (((((((((((this.tokenType.hashCode() * 31) + Integer.hashCode(this.position)) * 31) + Integer.hashCode(this.length)) * 31) + Boolean.hashCode(this.canOpen)) * 31) + Boolean.hashCode(this.canClose)) * 31) + Character.hashCode(this.marker)) * 31) + Integer.hashCode(this.closerIndex);
        }

        public final void i(boolean z15) {
            this.canOpen = z15;
        }

        public final void j(int i15) {
            this.closerIndex = i15;
        }

        public String toString() {
            return "Info(tokenType=" + this.tokenType + ", position=" + this.position + ", length=" + this.length + ", canOpen=" + this.canOpen + ", canClose=" + this.canClose + ", marker=" + this.marker + ", closerIndex=" + this.closerIndex + ')';
        }

        public /* synthetic */ Info(yv.a aVar, int i15, int i16, boolean z15, boolean z16, char c15, int i17, int i18, k kVar) {
            this(aVar, i15, (i18 & 4) != 0 ? 0 : i16, z15, z16, c15, (i18 & 64) != 0 ? -1 : i17);
        }
    }
}
