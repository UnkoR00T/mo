package q4;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: q4.i0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0007\u0018\u0000 \u00172\u00020\u0001:\u0001\u0015B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\t\b\u0016¢\u0006\u0004\b\u0004\u0010\u0006B\u001d\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\tJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u000f¨\u0006\u001c"}, d2 = {"Lq4/i0;", "", "", "includeFontPadding", "<init>", "(Z)V", "()V", "Lq4/l;", "emojiSupportMatch", "(IZLfr/k;)V", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "d", "(Lq4/i0;)Lq4/i0;", "a", "Z", "c", "()Z", "getIncludeFontPadding$annotations", "b", "I", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PlatformParagraphStyle {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final PlatformParagraphStyle f164527d = new PlatformParagraphStyle();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean includeFontPadding;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int emojiSupportMatch;

    /* JADX INFO: renamed from: q4.i0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lq4/i0$a;", "", "<init>", "()V", "Lq4/i0;", "Default", "Lq4/i0;", "a", "()Lq4/i0;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final PlatformParagraphStyle a() {
            return PlatformParagraphStyle.f164527d;
        }

        private Companion() {
        }
    }

    public /* synthetic */ PlatformParagraphStyle(int i15, boolean z15, fr.k kVar) {
        this(i15, z15);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getEmojiSupportMatch() {
        return this.emojiSupportMatch;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getIncludeFontPadding() {
        return this.includeFontPadding;
    }

    public final PlatformParagraphStyle d(PlatformParagraphStyle other) {
        return other == null ? this : other;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PlatformParagraphStyle)) {
            return false;
        }
        PlatformParagraphStyle platformParagraphStyle = (PlatformParagraphStyle) other;
        return this.includeFontPadding == platformParagraphStyle.includeFontPadding && l.g(this.emojiSupportMatch, platformParagraphStyle.emojiSupportMatch);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.includeFontPadding) * 31) + l.h(this.emojiSupportMatch);
    }

    public String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.includeFontPadding + ", emojiSupportMatch=" + ((Object) l.i(this.emojiSupportMatch)) + ')';
    }

    public PlatformParagraphStyle(boolean z15) {
        this.includeFontPadding = z15;
        this.emojiSupportMatch = l.INSTANCE.b();
    }

    private PlatformParagraphStyle(int i15, boolean z15) {
        this.includeFontPadding = z15;
        this.emojiSupportMatch = i15;
    }

    public PlatformParagraphStyle() {
        this(l.INSTANCE.b(), false, null);
    }
}
