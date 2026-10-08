package b5;

import c5.w;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b5.s, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0011B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lb5/s;", "", "Lc5/v;", "firstLine", "restLine", "<init>", "(JJLfr/k;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "J", "b", "()J", "c", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class TextIndent {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final TextIndent f16653d = new TextIndent(0, 0, 3, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long firstLine;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long restLine;

    /* JADX INFO: renamed from: b5.s$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lb5/s$a;", "", "<init>", "()V", "Lb5/s;", "None", "Lb5/s;", "a", "()Lb5/s;", "getNone$annotations", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final TextIndent a() {
            return TextIndent.f16653d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ TextIndent(long j15, long j16, fr.k kVar) {
        this(j15, j16);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getFirstLine() {
        return this.firstLine;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getRestLine() {
        return this.restLine;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextIndent)) {
            return false;
        }
        TextIndent textIndent = (TextIndent) other;
        return c5.v.e(this.firstLine, textIndent.firstLine) && c5.v.e(this.restLine, textIndent.restLine);
    }

    public int hashCode() {
        return (c5.v.i(this.firstLine) * 31) + c5.v.i(this.restLine);
    }

    public String toString() {
        return "TextIndent(firstLine=" + ((Object) c5.v.k(this.firstLine)) + ", restLine=" + ((Object) c5.v.k(this.restLine)) + ')';
    }

    private TextIndent(long j15, long j16) {
        this.firstLine = j15;
        this.restLine = j16;
    }

    public /* synthetic */ TextIndent(long j15, long j16, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? w.g(0) : j15, (i15 & 2) != 0 ? w.g(0) : j16, null);
    }
}
