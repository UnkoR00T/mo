package my;

import fr.k;
import fr.t;
import iy.b0;
import iy.c0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: my.f, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001a"}, d2 = {"Lmy/f;", "", "Liy/b0;", "content", "Lmy/f$a;", "contentSha384", "<init>", "(Liy/b0;Liy/b0;Lfr/k;)V", "signatureBase64Url", "Lmy/e;", "b", "(Liy/b0;)Liy/b0;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "getContent", "()Liy/b0;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class JWSTokenStructure {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 content;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 contentSha384;

    /* JADX INFO: renamed from: my.f$a */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0014"}, d2 = {"Lmy/f$a;", "", "Liy/b0;", "value", "b", "(Liy/b0;)Liy/b0;", "", "f", "(Liy/b0;)Ljava/lang/String;", "", "e", "(Liy/b0;)I", "other", "", "c", "(Liy/b0;Ljava/lang/Object;)Z", "a", "Liy/b0;", "getValue", "()Liy/b0;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 value;

        private /* synthetic */ a(b0 b0Var) {
            this.value = b0Var;
        }

        public static final /* synthetic */ a a(b0 b0Var) {
            return new a(b0Var);
        }

        public static b0 b(b0 b0Var) {
            return b0Var;
        }

        public static boolean c(b0 b0Var, Object obj) {
            return (obj instanceof a) && t.c(b0Var, ((a) obj).getValue());
        }

        public static final boolean d(b0 b0Var, b0 b0Var2) {
            return t.c(b0Var, b0Var2);
        }

        public static int e(b0 b0Var) {
            return b0Var.hashCode();
        }

        public static String f(b0 b0Var) {
            return "JWSContentSha384(value=" + b0Var + ")";
        }

        public boolean equals(Object obj) {
            return c(this.value, obj);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final /* synthetic */ b0 getValue() {
            return this.value;
        }

        public int hashCode() {
            return e(this.value);
        }

        public String toString() {
            return f(this.value);
        }
    }

    public /* synthetic */ JWSTokenStructure(b0 b0Var, b0 b0Var2, k kVar) {
        this(b0Var, b0Var2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getContentSha384() {
        return this.contentSha384;
    }

    public final b0 b(b0 signatureBase64Url) {
        return e.a(c0.g(c0.e(this.content) + "." + c0.e(signatureBase64Url)));
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JWSTokenStructure)) {
            return false;
        }
        JWSTokenStructure jWSTokenStructure = (JWSTokenStructure) other;
        return t.c(this.content, jWSTokenStructure.content) && a.d(this.contentSha384, jWSTokenStructure.contentSha384);
    }

    public int hashCode() {
        return (this.content.hashCode() * 31) + a.e(this.contentSha384);
    }

    public String toString() {
        return "JWSTokenStructure(content=" + this.content + ", contentSha384=" + a.f(this.contentSha384) + ")";
    }

    private JWSTokenStructure(b0 b0Var, b0 b0Var2) {
        this.content = b0Var;
        this.contentSha384 = b0Var2;
    }
}
