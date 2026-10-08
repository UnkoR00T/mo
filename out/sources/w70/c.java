package w70;

import fr.t;
import iy.a0;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0015\u0013\u000fB3\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\n\u001a\u00020\t8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018\"\u0004\b\u0019\u0010\u001a\u0082\u0001\u0003\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"Lw70/c;", "", "Lw70/p;", "configuration", "Lw70/n;", "actions", "", "", "overrideUrlScheme", "Lw70/q;", "controller", "<init>", "(Lw70/p;Lw70/n;Ljava/util/List;Lw70/q;)V", "a", "Lw70/p;", "b", "()Lw70/p;", "Lw70/n;", "()Lw70/n;", "c", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lw70/q;", "()Lw70/q;", "e", "(Lw70/q;)V", "Lw70/c$b;", "Lw70/c$c;", "Lw70/c$d;", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p configuration;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final n actions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<String> overrideUrlScheme;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private q controller;

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"w70/c$a", "Lw70/q;", "Loq/i0;", "a", "()V", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements q {
        a() {
        }

        @Override // w70.q
        public void a() {
        }
    }

    public /* synthetic */ c(p pVar, n nVar, List list, q qVar, fr.k kVar) {
        this(pVar, nVar, list, qVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public n getActions() {
        return this.actions;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public p getConfiguration() {
        return this.configuration;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public q getController() {
        return this.controller;
    }

    public List<String> d() {
        return this.overrideUrlScheme;
    }

    public void e(q qVar) {
        this.controller = qVar;
    }

    private c(p pVar, n nVar, List<String> list, q qVar) {
        this.configuration = pVar;
        this.actions = nVar;
        this.overrideUrlScheme = list;
        this.controller = qVar;
    }

    /* JADX INFO: renamed from: w70.c$c, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010\u000fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(¨\u0006)"}, d2 = {"Lw70/c$c;", "Lw70/c;", "Lw70/p;", "configuration", "Lw70/n;", "actions", "", "", "overrideUrlScheme", "url", "Liy/a0;", "postData", "<init>", "(Lw70/p;Lw70/n;Ljava/util/List;Ljava/lang/String;Liy/a0;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lw70/p;", "b", "()Lw70/p;", "f", "Lw70/n;", "a", "()Lw70/n;", "g", "Ljava/util/List;", "d", "()Ljava/util/List;", "h", "Ljava/lang/String;", "i", "Liy/a0;", "()Liy/a0;", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Post extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p configuration;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final n actions;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> overrideUrlScheme;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final a0 postData;

        public Post(p pVar, n nVar, List<String> list, String str, a0 a0Var) {
            super(pVar, nVar, list, null, 8, null);
            this.configuration = pVar;
            this.actions = nVar;
            this.overrideUrlScheme = list;
            this.url = str;
            this.postData = a0Var;
        }

        @Override // w70.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public n getActions() {
            return this.actions;
        }

        @Override // w70.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public p getConfiguration() {
            return this.configuration;
        }

        @Override // w70.c
        public List<String> d() {
            return this.overrideUrlScheme;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Post)) {
                return false;
            }
            Post post = (Post) other;
            return t.c(this.configuration, post.configuration) && t.c(this.actions, post.actions) && t.c(this.overrideUrlScheme, post.overrideUrlScheme) && t.c(this.url, post.url) && t.c(this.postData, post.postData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final a0 getPostData() {
            return this.postData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (((((((this.configuration.hashCode() * 31) + this.actions.hashCode()) * 31) + this.overrideUrlScheme.hashCode()) * 31) + this.url.hashCode()) * 31) + this.postData.hashCode();
        }

        public String toString() {
            return "Post(configuration=" + this.configuration + ", actions=" + this.actions + ", overrideUrlScheme=" + this.overrideUrlScheme + ", url=" + this.url + ", postData=" + this.postData + ')';
        }

        public /* synthetic */ Post(p pVar, n nVar, List list, String str, a0 a0Var, int i15, fr.k kVar) {
            this(pVar, nVar, (i15 & 4) != 0 ? v.n() : list, str, a0Var);
        }
    }

    /* JADX INFO: renamed from: w70.c$d, reason: from toString */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010\u000fR#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(¨\u0006)"}, d2 = {"Lw70/c$d;", "Lw70/c;", "Lw70/p;", "configuration", "Lw70/n;", "actions", "", "", "overrideUrlScheme", "url", "", "additionalHeaders", "<init>", "(Lw70/p;Lw70/n;Ljava/util/List;Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lw70/p;", "b", "()Lw70/p;", "f", "Lw70/n;", "a", "()Lw70/n;", "g", "Ljava/util/List;", "d", "()Ljava/util/List;", "h", "Ljava/lang/String;", "i", "Ljava/util/Map;", "()Ljava/util/Map;", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Url extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p configuration;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final n actions;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> overrideUrlScheme;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<String, String> additionalHeaders;

        public Url(p pVar, n nVar, List<String> list, String str, Map<String, String> map) {
            super(pVar, nVar, list, null, 8, null);
            this.configuration = pVar;
            this.actions = nVar;
            this.overrideUrlScheme = list;
            this.url = str;
            this.additionalHeaders = map;
        }

        @Override // w70.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public n getActions() {
            return this.actions;
        }

        @Override // w70.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public p getConfiguration() {
            return this.configuration;
        }

        @Override // w70.c
        public List<String> d() {
            return this.overrideUrlScheme;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Url)) {
                return false;
            }
            Url url = (Url) other;
            return t.c(this.configuration, url.configuration) && t.c(this.actions, url.actions) && t.c(this.overrideUrlScheme, url.overrideUrlScheme) && t.c(this.url, url.url) && t.c(this.additionalHeaders, url.additionalHeaders);
        }

        public final Map<String, String> f() {
            return this.additionalHeaders;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public int hashCode() {
            return (((((((this.configuration.hashCode() * 31) + this.actions.hashCode()) * 31) + this.overrideUrlScheme.hashCode()) * 31) + this.url.hashCode()) * 31) + this.additionalHeaders.hashCode();
        }

        public String toString() {
            return "Url(configuration=" + this.configuration + ", actions=" + this.actions + ", overrideUrlScheme=" + this.overrideUrlScheme + ", url=" + this.url + ", additionalHeaders=" + this.additionalHeaders + ')';
        }

        public /* synthetic */ Url(p pVar, n nVar, List list, String str, Map map, int i15, fr.k kVar) {
            this(pVar, nVar, (i15 & 4) != 0 ? v.n() : list, str, (i15 & 16) != 0 ? v0.i() : map);
        }
    }

    public /* synthetic */ c(p pVar, n nVar, List list, q qVar, int i15, fr.k kVar) {
        this(pVar, nVar, (i15 & 4) != 0 ? v.n() : list, (i15 & 8) != 0 ? new a() : qVar, null);
    }

    /* JADX INFO: renamed from: w70.c$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\"\u0010\u0011R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b(\u0010'\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b&\u0010\u0011R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b)\u0010\u0011R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b(\u0010\u0011¨\u0006,"}, d2 = {"Lw70/c$b;", "Lw70/c;", "Lw70/p;", "configuration", "Lw70/n;", "actions", "", "", "overrideUrlScheme", "data", "baseUrl", "encoding", "mimeType", "historyUrl", "<init>", "(Lw70/p;Lw70/n;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Lw70/p;", "b", "()Lw70/p;", "f", "Lw70/n;", "a", "()Lw70/n;", "g", "Ljava/util/List;", "d", "()Ljava/util/List;", "h", "Ljava/lang/String;", "i", "j", "k", "l", "webview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class HtmlData extends c {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p configuration;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final n actions;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<String> overrideUrlScheme;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final String data;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final String baseUrl;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final String encoding;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final String mimeType;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final String historyUrl;

        public HtmlData(p pVar, n nVar, List<String> list, String str, String str2, String str3, String str4, String str5) {
            super(pVar, nVar, list, null, 8, null);
            this.configuration = pVar;
            this.actions = nVar;
            this.overrideUrlScheme = list;
            this.data = str;
            this.baseUrl = str2;
            this.encoding = str3;
            this.mimeType = str4;
            this.historyUrl = str5;
        }

        @Override // w70.c
        /* JADX INFO: renamed from: a, reason: from getter */
        public n getActions() {
            return this.actions;
        }

        @Override // w70.c
        /* JADX INFO: renamed from: b, reason: from getter */
        public p getConfiguration() {
            return this.configuration;
        }

        @Override // w70.c
        public List<String> d() {
            return this.overrideUrlScheme;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HtmlData)) {
                return false;
            }
            HtmlData htmlData = (HtmlData) other;
            return t.c(this.configuration, htmlData.configuration) && t.c(this.actions, htmlData.actions) && t.c(this.overrideUrlScheme, htmlData.overrideUrlScheme) && t.c(this.data, htmlData.data) && t.c(this.baseUrl, htmlData.baseUrl) && t.c(this.encoding, htmlData.encoding) && t.c(this.mimeType, htmlData.mimeType) && t.c(this.historyUrl, htmlData.historyUrl);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final String getBaseUrl() {
            return this.baseUrl;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getData() {
            return this.data;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final String getEncoding() {
            return this.encoding;
        }

        public int hashCode() {
            int iHashCode = ((((((this.configuration.hashCode() * 31) + this.actions.hashCode()) * 31) + this.overrideUrlScheme.hashCode()) * 31) + this.data.hashCode()) * 31;
            String str = this.baseUrl;
            int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.encoding.hashCode()) * 31;
            String str2 = this.mimeType;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.historyUrl;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final String getHistoryUrl() {
            return this.historyUrl;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getMimeType() {
            return this.mimeType;
        }

        public String toString() {
            return "HtmlData(configuration=" + this.configuration + ", actions=" + this.actions + ", overrideUrlScheme=" + this.overrideUrlScheme + ", data=" + this.data + ", baseUrl=" + this.baseUrl + ", encoding=" + this.encoding + ", mimeType=" + this.mimeType + ", historyUrl=" + this.historyUrl + ')';
        }

        public /* synthetic */ HtmlData(p pVar, n nVar, List list, String str, String str2, String str3, String str4, String str5, int i15, fr.k kVar) {
            this(pVar, nVar, (i15 & 4) != 0 ? v.n() : list, str, (i15 & 16) != 0 ? null : str2, (i15 & 32) != 0 ? "utf-8" : str3, (i15 & 64) != 0 ? null : str4, (i15 & 128) != 0 ? null : str5);
        }
    }
}
