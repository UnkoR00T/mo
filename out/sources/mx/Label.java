package mx;

import fr.k;
import fr.t;
import fu.r;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: mx.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\f\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0001\u001fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\t\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0010J\r\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0012\u0010\u0010J\u0018\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0016\u0010\nJ\u0010\u0010\u0017\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010\u0018¨\u0006%"}, d2 = {"Lmx/a;", "", "", "text", "tag", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "addStringToTag", "newText", "e", "(Ljava/lang/String;Ljava/lang/String;)Lmx/a;", "newTag", "n", "(Ljava/lang/String;)Lmx/a;", "", "m", "()Z", "l", "k", AnnotatedPrivateKey.LABEL, "o", "(Lmx/a;)Lmx/a;", "g", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "j", "b", "i", "c", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Label {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Label f128941d = new Label("", "");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Label f128942e = new Label("-", "");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Label f128943f = new Label(" ", "");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Label f128944g = new Label(":", "");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Label f128945h = new Label("|", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String text;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String tag;

    /* JADX INFO: renamed from: mx.a$a, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u0017\u0010\r\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b¨\u0006\u000f"}, d2 = {"Lmx/a$a;", "", "<init>", "()V", "Lmx/a;", "EMPTY", "Lmx/a;", "c", "()Lmx/a;", "DASH", "b", "SPACE", "d", "COLON", "a", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final Label a() {
            return Label.f128944g;
        }

        public final Label b() {
            return Label.f128942e;
        }

        public final Label c() {
            return Label.f128941d;
        }

        public final Label d() {
            return Label.f128943f;
        }

        private Companion() {
        }
    }

    public Label(String str, String str2) {
        this.text = str;
        this.tag = str2;
    }

    public static /* synthetic */ Label f(Label label, String str, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            str2 = null;
        }
        return label.e(str, str2);
    }

    public static /* synthetic */ Label h(Label label, String str, String str2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = label.text;
        }
        if ((i15 & 2) != 0) {
            str2 = label.tag;
        }
        return label.g(str, str2);
    }

    public final Label e(String addStringToTag, String newText) {
        if (newText == null) {
            newText = this.text;
        }
        return new Label(newText, this.tag + addStringToTag);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Label)) {
            return false;
        }
        Label label = (Label) other;
        return t.c(this.text, label.text) && t.c(this.tag, label.tag);
    }

    public final Label g(String text, String tag) {
        return new Label(text, tag);
    }

    public int hashCode() {
        return (this.text.hashCode() * 31) + this.tag.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getTag() {
        return this.tag;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final String getText() {
        return this.text;
    }

    public final boolean k() {
        return r.t0(this.text);
    }

    public final boolean l() {
        return !r.t0(this.text);
    }

    public final boolean m() {
        return this.text.length() > 0;
    }

    public final Label n(String newTag) {
        return h(this, null, newTag, 1, null);
    }

    public final Label o(Label label) {
        return new Label(this.text + label.text, this.tag + label.tag);
    }

    public String toString() {
        return "Label(text=" + this.text + ", tag=" + this.tag + ")";
    }
}
