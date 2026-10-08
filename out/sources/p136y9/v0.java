package p136y9;

import android.net.Uri;
import android.os.Bundle;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.t;
import fu.MatchGroup;
import fu.o;
import fu.q;
import io.sentry.q7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import oq.i0;
import oq.k;
import oq.l;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b&\u0018\u0000 \u0084\u00012\u00020\u0001:\u0004[YSWB'\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u00132\u000e\u0010\b\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J;\u0010 \u001a\u00020\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0002¢\u0006\u0004\b \u0010!J9\u0010$\u001a\u00020\u00132\u0006\u0010#\u001a\u00020\"2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0002¢\u0006\u0004\b$\u0010%J=\u0010'\u001a\u00020\u00132\n\u0010&\u001a\u00060\u0011j\u0002`\u00122\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0002¢\u0006\u0004\b'\u0010(JG\u0010-\u001a\u00020\u00132\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020)2\u0006\u0010,\u001a\u00020+2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0002¢\u0006\u0004\b-\u0010.J5\u00102\u001a\u00020\u000e2\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010/\u001a\u00020\u00022\u0006\u00100\u001a\u00020\u00022\b\u00101\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b2\u00103J7\u00104\u001a\u00020\u00132\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u0006\u0010/\u001a\u00020\u00022\b\u00100\u001a\u0004\u0018\u00010\u00022\b\u00101\u001a\u0004\u0018\u00010\u001eH\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u00107J\u001b\u00109\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+08H\u0002¢\u0006\u0004\b9\u0010:J#\u0010<\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010;H\u0002¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u000eH\u0002¢\u0006\u0004\b>\u00107J\u0013\u0010?\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00132\u0006\u0010B\u001a\u00020AH\u0000¢\u0006\u0004\bC\u0010DJ\u0017\u0010F\u001a\u00020E2\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\bF\u0010GJ9\u0010H\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\n\u0010&\u001a\u00060\u0011j\u0002`\u00122\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0007¢\u0006\u0004\bH\u0010IJ9\u0010J\u001a\u00060\u001aj\u0002`\u001b2\u000e\u0010&\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u00122\u0014\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u001dH\u0000¢\u0006\u0004\bJ\u0010IJ\u001f\u0010L\u001a\u00020E2\u000e\u0010K\u001a\n\u0018\u00010\u0011j\u0004\u0018\u0001`\u0012H\u0000¢\u0006\u0004\bL\u0010MJ\u001a\u0010O\u001a\u00020\u00132\b\u0010N\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020EH\u0016¢\u0006\u0004\bQ\u0010RR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010VR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\bY\u0010T\u001a\u0004\bZ\u0010VR\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0018\u0010_\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010TR\u001d\u0010e\u001a\u0004\u0018\u00010`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\u001b\u0010i\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bf\u0010b\u001a\u0004\bg\u0010hR'\u0010l\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020+088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bj\u0010b\u001a\u0004\bk\u0010:R\u0016\u0010o\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR/\u0010q\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\t\u0012\u0004\u0012\u00020\u0002\u0018\u00010;8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010b\u001a\u0004\bp\u0010=R!\u0010t\u001a\b\u0012\u0004\u0012\u00020\u00020\t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010b\u001a\u0004\br\u0010sR\u001d\u0010w\u001a\u0004\u0018\u00010\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010b\u001a\u0004\bv\u0010VR\u001d\u0010z\u001a\u0004\u0018\u00010`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010b\u001a\u0004\by\u0010dR\u0018\u0010|\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010TR\u001d\u0010\u007f\u001a\u0004\u0018\u00010`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b}\u0010b\u001a\u0004\b~\u0010dR.\u0010\u0083\u0001\u001a\u00020\u00132\u0006\u00100\u001a\u00020\u00138G@@X\u0086\u000e¢\u0006\u0015\n\u0004\bX\u0010n\u001a\u0005\b\u0080\u0001\u0010h\"\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001c\u0010\u0085\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020)8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0084\u0001\u0010s¨\u0006\u0086\u0001"}, d2 = {"Ly9/v0;", "", "", "uriPattern", "action", "mimeType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "uri", "", "args", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "uriRegex", "Loq/i0;", "j", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/StringBuilder;)V", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "", "M", "(Landroid/net/Uri;)Z", "K", "(Ljava/lang/String;)Z", i.f37094u, "fragment", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "", "Ly9/t;", "arguments", "A", "(Ljava/lang/String;Landroid/os/Bundle;Ljava/util/Map;)V", "Lfu/l;", "result", "y", "(Lfu/l;Landroid/os/Bundle;Ljava/util/Map;)Z", "deepLink", "z", "(Landroid/net/Uri;Landroid/os/Bundle;Ljava/util/Map;)Z", "", "inputParams", "Ly9/v0$d;", "storedParam", ip.a.f96137b, "(Ljava/util/List;Ly9/v0$d;Landroid/os/Bundle;Ljava/util/Map;)Z", "name", "value", "argument", i.f37086m, "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ly9/t;)V", "Q", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ly9/t;)Z", "U", "()V", "", "V", "()Ljava/util/Map;", "Loq/r;", "R", "()Loq/r;", "T", "Y", "(Ljava/lang/String;)Ljava/lang/String;", "Ly9/w0;", "deepLinkRequest", "N", "(Ly9/w0;)Z", "", "C", "(Ljava/lang/String;)I", "v", "(Landroid/net/Uri;Ljava/util/Map;)Landroid/os/Bundle;", "x", "requestedLink", "k", "(Landroid/net/Uri;)I", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "G", "()Ljava/lang/String;", "b", "p", "c", "B", "d", "Ljava/util/List;", "pathArgs", "e", "pathRegex", "Lfu/o;", "f", "Loq/k;", "E", "()Lfu/o;", "pathPattern", "g", "I", "()Z", "isParameterizedQuery", "h", "F", "queryArgsMap", "i", "Z", "isSingleQueryParamValueOnly", "s", "fragArgsAndRegex", "r", "()Ljava/util/List;", "fragArgs", "l", "u", "fragRegex", "m", "t", "fragPattern", "n", "mimeTypeRegex", "o", ip.a.f96138c, "mimeTypePattern", i.f37087n, "setExactDeepLink$navigation_common_release", "(Z)V", "isExactDeepLink", "q", "argumentsNames", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class v0 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final b f225504q = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final o f225505r = new o("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final o f225506s = new o("\\{(.+?)\\}");

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final o f225507t = new o("http[s]?://");

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final o f225508u = new o(q7.DEFAULT_PROPAGATION_TARGETS);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final o f225509v = new o("([^/]*?|)");

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final o f225510w = new o("^[^?#]+\\?([^#]*).*");

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String uriPattern;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String action;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String mimeType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private String pathRegex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final k queryArgsMap;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isSingleQueryParamValueOnly;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k fragArgsAndRegex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final k fragArgs;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final k fragRegex;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final k fragPattern;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private String mimeTypeRegex;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final k mimeTypePattern;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean isExactDeepLink;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> pathArgs = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k pathPattern = l.a(new er.a() { // from class: y9.n0
        @Override // er.a
        public final Object a() {
            return v0.W(this.f225469a);
        }
    });

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k isParameterizedQuery = l.a(new er.a() { // from class: y9.o0
        @Override // er.a
        public final Object a() {
            return Boolean.valueOf(v0.J(this.f225470a));
        }
    });

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u000f2\u00020\u0001:\u0001\tB\t\b\u0017¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u000bR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Ly9/v0$a;", "", "<init>", "()V", "", "uriPattern", "b", "(Ljava/lang/String;)Ly9/v0$a;", "Ly9/v0;", "a", "()Ly9/v0;", "Ljava/lang/String;", "action", "c", "mimeType", "d", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String uriPattern;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String action;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String mimeType;

        public final v0 a() {
            return new v0(this.uriPattern, this.action, this.mimeType);
        }

        public final a b(String uriPattern) {
            this.uriPattern = uriPattern;
            return this;
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ly9/v0$b;", "", "<init>", "()V", "Lfu/o;", "SCHEME_PATTERN", "Lfu/o;", "FILL_IN_PATTERN", "SCHEME_REGEX", "WILDCARD_REGEX", "PATH_REGEX", "QUERY_PATTERN", "", "ANY_SYMBOLS_IN_THE_TAIL", "Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u0005R\"\u0010\u0012\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u000b\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u0005¨\u0006\u0013"}, d2 = {"Ly9/v0$c;", "", "", "mimeType", "<init>", "(Ljava/lang/String;)V", "other", "", "b", "(Ly9/v0$c;)I", "a", "Ljava/lang/String;", "g", "()Ljava/lang/String;", "setType", "type", "e", "setSubType", "subType", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String subType;

        public c(String str) {
            List listN;
            List<String> listI = new o("/").i(str, 0);
            if (listI.isEmpty()) {
                listN = v.n();
            } else {
                ListIterator<String> listIterator = listI.listIterator(listI.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        listN = v.X0(listI, listIterator.nextIndex() + 1);
                    }
                }
                listN = v.n();
            }
            this.type = (String) listN.get(0);
            this.subType = (String) listN.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(c other) {
            int i15 = t.c(this.type, other.type) ? 2 : 0;
            return t.c(this.subType, other.subType) ? i15 + 1 : i15;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final String getSubType() {
            return this.subType;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR$\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\bR\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0013"}, d2 = {"Ly9/v0$d;", "", "<init>", "()V", "", "name", "Loq/i0;", "a", "(Ljava/lang/String;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "paramRegex", "", "b", "Ljava/util/List;", "()Ljava/util/List;", "arguments", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String paramRegex;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final List<String> arguments = new ArrayList();

        public final void a(String name) {
            this.arguments.add(name);
        }

        public final List<String> b() {
            return this.arguments;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getParamRegex() {
            return this.paramRegex;
        }

        public final void d(String str) {
            this.paramRegex = str;
        }
    }

    public v0(String str, String str2, String str3) {
        this.uriPattern = str;
        this.action = str2;
        this.mimeType = str3;
        oq.o oVar = oq.o.NONE;
        this.queryArgsMap = l.b(oVar, new er.a() { // from class: y9.p0
            @Override // er.a
            public final Object a() {
                return v0.X(this.f225472a);
            }
        });
        this.fragArgsAndRegex = l.b(oVar, new er.a() { // from class: y9.q0
            @Override // er.a
            public final Object a() {
                return v0.l(this.f225473a);
            }
        });
        this.fragArgs = l.b(oVar, new er.a() { // from class: y9.r0
            @Override // er.a
            public final Object a() {
                return v0.m(this.f225479a);
            }
        });
        this.fragRegex = l.b(oVar, new er.a() { // from class: y9.s0
            @Override // er.a
            public final Object a() {
                return v0.o(this.f225483a);
            }
        });
        this.fragPattern = l.a(new er.a() { // from class: y9.t0
            @Override // er.a
            public final Object a() {
                return v0.n(this.f225492a);
            }
        });
        this.mimeTypePattern = l.a(new er.a() { // from class: y9.u0
            @Override // er.a
            public final Object a() {
                return v0.O(this.f225496a);
            }
        });
        U();
        T();
    }

    private final void A(String fragment, Bundle savedState, Map<String, t> arguments) {
        fu.l lVarE;
        String value;
        o oVarT = t();
        if (oVarT == null || (lVarE = oVarT.e(String.valueOf(fragment))) == null) {
            return;
        }
        List<String> listR = r();
        ArrayList arrayList = new ArrayList(v.y(listR, 10));
        int i15 = 0;
        for (Object obj : listR) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            String str = (String) obj;
            MatchGroup matchGroup = lVarE.getGroups().get(i16);
            String strA = (matchGroup == null || (value = matchGroup.getValue()) == null) ? null : o1.f225471a.a(value);
            if (strA == null) {
                strA = "";
            }
            try {
                P(savedState, str, strA, arguments.get(str));
                arrayList.add(i0.f148189a);
                i15 = i16;
            } catch (IllegalArgumentException unused) {
                return;
            }
        }
    }

    private final o D() {
        return (o) this.mimeTypePattern.getValue();
    }

    private final o E() {
        return (o) this.pathPattern.getValue();
    }

    private final Map<String, d> F() {
        return (Map) this.queryArgsMap.getValue();
    }

    private final boolean I() {
        return ((Boolean) this.isParameterizedQuery.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean J(v0 v0Var) {
        String str = v0Var.uriPattern;
        return str != null && f225510w.f(str);
    }

    private final boolean K(String action) {
        String str = this.action;
        if (str == null) {
            return true;
        }
        if (action == null) {
            return false;
        }
        return t.c(str, action);
    }

    private final boolean L(String mimeType) {
        if (this.mimeType == null) {
            return true;
        }
        if (mimeType == null) {
            return false;
        }
        return D().f(mimeType);
    }

    private final boolean M(Uri uri) {
        if (E() == null) {
            return true;
        }
        if (uri == null) {
            return false;
        }
        return E().f(uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o O(v0 v0Var) {
        String str = v0Var.mimeTypeRegex;
        if (str != null) {
            return new o(str);
        }
        return null;
    }

    private final void P(Bundle savedState, String name, String value, t argument) {
        if (argument != null) {
            argument.a().c(savedState, name, value);
        } else {
            ua.k.p(ua.k.a(savedState), name, value);
        }
    }

    private final boolean Q(Bundle savedState, String name, String value, t argument) {
        if (!ua.c.b(ua.c.a(savedState), name)) {
            return true;
        }
        if (argument == null) {
            return false;
        }
        l1<Object> l1VarA = argument.a();
        l1VarA.d(savedState, name, value, l1VarA.a(savedState, name));
        return false;
    }

    private final r<List<String>, String> R() {
        String str = this.uriPattern;
        if (str == null) {
            return null;
        }
        o1 o1Var = o1.f225471a;
        if (o1Var.d(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = o1Var.d(this.uriPattern).getFragment();
        StringBuilder sb5 = new StringBuilder();
        j(fragment, arrayList, sb5);
        return y.a(arrayList, sb5.toString());
    }

    private final boolean S(List<String> inputParams, d storedParam, Bundle savedState, Map<String, t> arguments) {
        r[] rVarArr;
        Object objValueOf;
        Map mapI = pq.v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new r[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (r[]) arrayList.toArray(new r[0]);
        }
        Bundle bundleA = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        ua.k.a(bundleA);
        Iterator<T> it = storedParam.b().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            t tVar = arguments.get(str);
            l1<Object> l1VarA = tVar != null ? tVar.a() : null;
            if ((l1VarA instanceof g) && !tVar.getIsDefaultValuePresent()) {
                g gVar = (g) l1VarA;
                gVar.g(bundleA, str, gVar.j());
            }
        }
        for (String str2 : inputParams) {
            String paramRegex = storedParam.getParamRegex();
            fu.l lVarE = paramRegex != null ? new o(paramRegex).e(str2) : null;
            if (lVarE == null) {
                return false;
            }
            List<String> listB = storedParam.b();
            ArrayList arrayList2 = new ArrayList(v.y(listB, 10));
            int i15 = 0;
            for (Object obj : listB) {
                int i16 = i15 + 1;
                if (i15 < 0) {
                    v.x();
                }
                String str3 = (String) obj;
                MatchGroup matchGroup = lVarE.getGroups().get(i16);
                String value = matchGroup != null ? matchGroup.getValue() : null;
                if (value == null) {
                    value = "";
                }
                t tVar2 = arguments.get(str3);
                try {
                    if (ua.c.b(ua.c.a(bundleA), str3)) {
                        objValueOf = Boolean.valueOf(Q(bundleA, str3, value, tVar2));
                    } else {
                        P(bundleA, str3, value, tVar2);
                        objValueOf = i0.f148189a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = i0.f148189a;
                }
                arrayList2.add(objValueOf);
                i15 = i16;
            }
        }
        ua.k.b(ua.k.a(savedState), bundleA);
        return true;
    }

    private final void T() {
        if (this.mimeType == null) {
            return;
        }
        if (!new o("^[\\s\\S]+/[\\s\\S]+$").f(this.mimeType)) {
            throw new IllegalArgumentException(("The given mimeType " + this.mimeType + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.mimeType);
        this.mimeTypeRegex = fu.r.P("^(" + cVar.getType() + "|[*]+)/(" + cVar.getSubType() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void U() {
        if (this.uriPattern == null) {
            return;
        }
        StringBuilder sb5 = new StringBuilder("^");
        if (!f225505r.a(this.uriPattern)) {
            sb5.append(f225507t.d());
        }
        boolean z15 = false;
        fu.l lVarC = o.c(new o("(\\?|#|$)"), this.uriPattern, 0, 2, null);
        if (lVarC != null) {
            j(this.uriPattern.substring(0, lVarC.a().getFirst()), this.pathArgs, sb5);
            if (!f225508u.a(sb5) && !f225509v.a(sb5)) {
                z15 = true;
            }
            this.isExactDeepLink = z15;
            sb5.append("($|(\\?(.)*)|(#(.)*))");
        }
        this.pathRegex = Y(sb5.toString());
    }

    private final Map<String, d> V() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (I()) {
            Uri uriD = o1.f225471a.d(this.uriPattern);
            for (String str : uriD.getQueryParameterNames()) {
                StringBuilder sb5 = new StringBuilder();
                List<String> queryParameters = uriD.getQueryParameters(str);
                if (queryParameters.size() > 1) {
                    throw new IllegalArgumentException(("Query parameter " + str + " must only be present once in " + this.uriPattern + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
                }
                String str2 = (String) v.n0(queryParameters);
                if (str2 == null) {
                    this.isSingleQueryParamValueOnly = true;
                    str2 = str;
                }
                int last = 0;
                d dVar = new d();
                for (fu.l lVarC = o.c(f225506s, str2, 0, 2, null); lVarC != null; lVarC = lVarC.next()) {
                    dVar.a(lVarC.getGroups().get(1).getValue());
                    if (lVarC.a().getFirst() > last) {
                        sb5.append(o.INSTANCE.c(str2.substring(last, lVarC.a().getFirst())));
                    }
                    sb5.append("([\\s\\S]+?)?");
                    last = lVarC.a().getLast() + 1;
                }
                if (last < str2.length()) {
                    sb5.append(o.INSTANCE.c(str2.substring(last)));
                }
                sb5.append("$");
                dVar.d(Y(sb5.toString()));
                linkedHashMap.put(str, dVar);
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o W(v0 v0Var) {
        String str = v0Var.pathRegex;
        if (str != null) {
            return new o(str, q.IGNORE_CASE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map X(v0 v0Var) {
        return v0Var.V();
    }

    private final String Y(String str) {
        if (fu.r.d0(str, "\\Q", false, 2, null) && fu.r.d0(str, "\\E", false, 2, null)) {
            return fu.r.P(str, q7.DEFAULT_PROPAGATION_TARGETS, "\\E.*\\Q", false, 4, null);
        }
        return fu.r.d0(str, "\\.\\*", false, 2, null) ? fu.r.P(str, "\\.\\*", q7.DEFAULT_PROPAGATION_TARGETS, false, 4, null) : str;
    }

    private final void j(String uri, List<String> args, StringBuilder uriRegex) {
        int last = 0;
        for (fu.l lVarC = o.c(f225506s, uri, 0, 2, null); lVarC != null; lVarC = lVarC.next()) {
            args.add(lVarC.getGroups().get(1).getValue());
            if (lVarC.a().getFirst() > last) {
                uriRegex.append(o.INSTANCE.c(uri.substring(last, lVarC.a().getFirst())));
            }
            uriRegex.append(f225509v.d());
            last = lVarC.a().getLast() + 1;
        }
        if (last < uri.length()) {
            uriRegex.append(o.INSTANCE.c(uri.substring(last)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r l(v0 v0Var) {
        return v0Var.R();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List m(v0 v0Var) {
        List<String> listC;
        r<List<String>, String> rVarS = v0Var.s();
        return (rVarS == null || (listC = rVarS.c()) == null) ? new ArrayList() : listC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final o n(v0 v0Var) {
        String strU = v0Var.u();
        if (strU != null) {
            return new o(strU, q.IGNORE_CASE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String o(v0 v0Var) {
        r<List<String>, String> rVarS = v0Var.s();
        if (rVarS != null) {
            return rVarS.d();
        }
        return null;
    }

    private final List<String> r() {
        return (List) this.fragArgs.getValue();
    }

    private final r<List<String>, String> s() {
        return (r) this.fragArgsAndRegex.getValue();
    }

    private final o t() {
        return (o) this.fragPattern.getValue();
    }

    private final String u() {
        return (String) this.fragRegex.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean w(Bundle bundle, String str) {
        return !ua.c.b(ua.c.a(bundle), str);
    }

    private final boolean y(fu.l result, Bundle savedState, Map<String, t> arguments) {
        String value;
        List<String> list = this.pathArgs;
        ArrayList arrayList = new ArrayList(v.y(list, 10));
        int i15 = 0;
        for (Object obj : list) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            String str = (String) obj;
            MatchGroup matchGroup = result.getGroups().get(i16);
            String strA = (matchGroup == null || (value = matchGroup.getValue()) == null) ? null : o1.f225471a.a(value);
            if (strA == null) {
                strA = "";
            }
            try {
                P(savedState, str, strA, arguments.get(str));
                arrayList.add(i0.f148189a);
                i15 = i16;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean z(Uri deepLink, Bundle savedState, Map<String, t> arguments) {
        String query;
        for (Map.Entry<String, d> entry : F().entrySet()) {
            String key = entry.getKey();
            d value = entry.getValue();
            List<String> queryParameters = deepLink.getQueryParameters(key);
            if (this.isSingleQueryParamValueOnly && (query = deepLink.getQuery()) != null && !t.c(query, deepLink.toString())) {
                queryParameters = v.e(query);
            }
            if (!S(queryParameters, value, savedState, arguments)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final String getMimeType() {
        return this.mimeType;
    }

    public final int C(String mimeType) {
        if (this.mimeType == null || !D().f(mimeType)) {
            return -1;
        }
        return new c(this.mimeType).compareTo(new c(mimeType));
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final String getUriPattern() {
        return this.uriPattern;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final boolean getIsExactDeepLink() {
        return this.isExactDeepLink;
    }

    public final boolean N(w0 deepLinkRequest) {
        return M(deepLinkRequest.getUri()) && K(deepLinkRequest.getAction()) && L(deepLinkRequest.getMimeType());
    }

    public boolean equals(Object other) {
        if (other != null && (other instanceof v0)) {
            v0 v0Var = (v0) other;
            if (t.c(this.uriPattern, v0Var.uriPattern) && t.c(this.action, v0Var.action) && t.c(this.mimeType, v0Var.mimeType)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        String str = this.uriPattern;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.action;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.mimeType;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final int k(Uri requestedLink) {
        if (requestedLink == null || this.uriPattern == null) {
            return 0;
        }
        return v.r0(requestedLink.getPathSegments(), o1.f225471a.d(this.uriPattern).getPathSegments()).size();
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    public final List<String> q() {
        List<String> list = this.pathArgs;
        Collection<d> collectionValues = F().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            v.D(arrayList, ((d) it.next()).b());
        }
        return v.L0(v.L0(list, arrayList), r());
    }

    public final Bundle v(Uri deepLink, Map<String, t> arguments) {
        fu.l lVarE;
        r[] rVarArr;
        o oVarE = E();
        if (oVarE == null || (lVarE = oVarE.e(deepLink.toString())) == null) {
            return null;
        }
        Map mapI = pq.v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new r[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (r[]) arrayList.toArray(new r[0]);
        }
        final Bundle bundleA = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        ua.k.a(bundleA);
        if (!y(lVarE, bundleA, arguments)) {
            return null;
        }
        if (I() && !z(deepLink, bundleA, arguments)) {
            return null;
        }
        A(deepLink.getFragment(), bundleA, arguments);
        if (u.a(arguments, new er.l() { // from class: y9.m0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(v0.w(bundleA, (String) obj));
            }
        }).isEmpty()) {
            return bundleA;
        }
        return null;
    }

    public final Bundle x(Uri deepLink, Map<String, t> arguments) {
        r[] rVarArr;
        o oVarE;
        fu.l lVarE;
        Map mapI = pq.v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new r[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (r[]) arrayList.toArray(new r[0]);
        }
        Bundle bundleA = e6.c.a((r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        ua.k.a(bundleA);
        if (deepLink != null && (oVarE = E()) != null && (lVarE = oVarE.e(deepLink.toString())) != null) {
            y(lVarE, bundleA, arguments);
            if (I()) {
                z(deepLink, bundleA, arguments);
            }
        }
        return bundleA;
    }
}
