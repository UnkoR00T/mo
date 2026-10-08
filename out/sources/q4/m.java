package q4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001:\u0002\t\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lq4/m;", "Lq4/e$a;", "<init>", "()V", "Lq4/n;", "a", "()Lq4/n;", "linkInteractionListener", "Lq4/u3;", "b", "()Lq4/u3;", "styles", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class m implements e.a {

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, d2 = {"Lq4/m$a;", "Lq4/m;", "", "tag", "Lq4/u3;", "styles", "Lq4/n;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Lq4/u3;Lq4/n;)V", "c", "(Ljava/lang/String;Lq4/u3;Lq4/n;)Lq4/m$a;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "b", "Lq4/u3;", "()Lq4/u3;", "Lq4/n;", "()Lq4/n;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String tag;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final u3 styles;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final n linkInteractionListener;

        public a(String str, u3 u3Var, n nVar) {
            super(null);
            this.tag = str;
            this.styles = u3Var;
            this.linkInteractionListener = nVar;
        }

        public static /* synthetic */ a d(a aVar, String str, u3 u3Var, n nVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = aVar.tag;
            }
            if ((i15 & 2) != 0) {
                u3Var = aVar.getStyles();
            }
            if ((i15 & 4) != 0) {
                nVar = aVar.getLinkInteractionListener();
            }
            return aVar.c(str, u3Var, nVar);
        }

        @Override // q4.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public n getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // q4.m
        /* JADX INFO: renamed from: b, reason: from getter */
        public u3 getStyles() {
            return this.styles;
        }

        public final a c(String tag, u3 styles, n linkInteractionListener) {
            return new a(tag, styles, linkInteractionListener);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getTag() {
            return this.tag;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return fr.t.c(this.tag, aVar.tag) && fr.t.c(getStyles(), aVar.getStyles()) && fr.t.c(getLinkInteractionListener(), aVar.getLinkInteractionListener());
        }

        public int hashCode() {
            int iHashCode = this.tag.hashCode() * 31;
            u3 styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            n linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Clickable(tag=" + this.tag + ')';
        }
    }

    public /* synthetic */ m(fr.k kVar) {
        this();
    }

    /* JADX INFO: renamed from: a */
    public abstract n getLinkInteractionListener();

    /* JADX INFO: renamed from: b */
    public abstract u3 getStyles();

    private m() {
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0015R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u0016\u0010\u001d¨\u0006\u001e"}, d2 = {"Lq4/m$b;", "Lq4/m;", "", "url", "Lq4/u3;", "styles", "Lq4/n;", "linkInteractionListener", "<init>", "(Ljava/lang/String;Lq4/u3;Lq4/n;)V", "c", "(Ljava/lang/String;Lq4/u3;Lq4/n;)Lq4/m$b;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "e", "b", "Lq4/u3;", "()Lq4/u3;", "Lq4/n;", "()Lq4/n;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends m {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final u3 styles;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final n linkInteractionListener;

        public b(String str, u3 u3Var, n nVar) {
            super(null);
            this.url = str;
            this.styles = u3Var;
            this.linkInteractionListener = nVar;
        }

        public static /* synthetic */ b d(b bVar, String str, u3 u3Var, n nVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                str = bVar.url;
            }
            if ((i15 & 2) != 0) {
                u3Var = bVar.getStyles();
            }
            if ((i15 & 4) != 0) {
                nVar = bVar.getLinkInteractionListener();
            }
            return bVar.c(str, u3Var, nVar);
        }

        @Override // q4.m
        /* JADX INFO: renamed from: a, reason: from getter */
        public n getLinkInteractionListener() {
            return this.linkInteractionListener;
        }

        @Override // q4.m
        /* JADX INFO: renamed from: b, reason: from getter */
        public u3 getStyles() {
            return this.styles;
        }

        public final b c(String url, u3 styles, n linkInteractionListener) {
            return new b(url, styles, linkInteractionListener);
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return fr.t.c(this.url, bVar.url) && fr.t.c(getStyles(), bVar.getStyles()) && fr.t.c(getLinkInteractionListener(), bVar.getLinkInteractionListener());
        }

        public int hashCode() {
            int iHashCode = this.url.hashCode() * 31;
            u3 styles = getStyles();
            int iHashCode2 = (iHashCode + (styles != null ? styles.hashCode() : 0)) * 31;
            n linkInteractionListener = getLinkInteractionListener();
            return iHashCode2 + (linkInteractionListener != null ? linkInteractionListener.hashCode() : 0);
        }

        public String toString() {
            return "LinkAnnotation.Url(url=" + this.url + ')';
        }

        public /* synthetic */ b(String str, u3 u3Var, n nVar, int i15, fr.k kVar) {
            this(str, (i15 & 2) != 0 ? null : u3Var, (i15 & 4) != 0 ? null : nVar);
        }
    }
}
