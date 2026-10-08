package ba;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p071kotlin.Metadata;
import p136y9.n1;
import p136y9.v0;
import p136y9.w0;
import p136y9.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J;\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u000e\u0010\n\u001a\n\u0018\u00010\bj\u0004\u0018\u0001`\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0019\u0010\u001c\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0000¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\rH\u0000¢\u0006\u0004\b$\u0010%J'\u0010'\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001f2\u000e\u0010&\u001a\n\u0018\u00010\u001ej\u0004\u0018\u0001`\u001fH\u0000¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R$\u00103\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0006048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R.\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0:8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010B\u001a\u00020A2\u0006\u0010B\u001a\u00020A8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR.\u0010\u0016\u001a\u0004\u0018\u00010\f2\b\u0010\u0016\u001a\u0004\u0018\u00010\f8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010.\u001a\u0004\bJ\u00100\"\u0004\bK\u00102R\u001e\u0010N\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010L8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010M¨\u0006O"}, d2 = {"Lba/z;", "", "Ly9/y0;", "destination", "<init>", "(Ly9/y0;)V", "Ly9/v0;", "deepLink", "Landroid/net/Uri;", "Landroidx/navigation/NavUri;", "uri", "", "", "Ly9/t;", "arguments", "", "p", "(Ly9/v0;Landroid/net/Uri;Ljava/util/Map;)Z", "navDeepLink", "Loq/i0;", "i", "(Ly9/v0;)V", "route", "Ly9/y0$b;", "t", "(Ljava/lang/String;)Ly9/y0$b;", "Ly9/w0;", "navDeepLinkRequest", "s", "(Ly9/w0;)Ly9/y0$b;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "r", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "argumentName", "argument", "g", "(Ljava/lang/String;Ly9/t;)V", "args", "j", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "a", "Ly9/y0;", "getDestination", "()Ly9/y0;", "b", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "setIdName$navigation_common_release", "(Ljava/lang/String;)V", "idName", "", "c", "Ljava/util/List;", "l", "()Ljava/util/List;", "deepLinks", "", "d", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "setArguments$navigation_common_release", "(Ljava/util/Map;)V", "", "id", "e", "I", "m", "()I", "u", "(I)V", "f", "o", "v", "Loq/k;", "Loq/k;", "routeDeepLink", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final y0 destination;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private String idName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<v0> deepLinks = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Map<String, p136y9.t> arguments = new LinkedHashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int id;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private String route;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private oq.k<v0> routeDeepLink;

    public z(y0 y0Var) {
        this.destination = y0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(v0 v0Var, String str) {
        return !v0Var.q().contains(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v0 f(String str) {
        return new v0.a().b(str).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(v0 v0Var, String str) {
        return !v0Var.q().contains(str);
    }

    private final boolean p(v0 deepLink, Uri uri, Map<String, p136y9.t> arguments) {
        final Bundle bundleX = deepLink.x(uri, arguments);
        return p136y9.u.a(arguments, new er.l() { // from class: ba.y
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(z.q(bundleX, (String) obj));
            }
        }).isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean q(Bundle bundle, String str) {
        return !ua.c.b(ua.c.a(bundle), str);
    }

    public final void g(String argumentName, p136y9.t argument) {
        this.arguments.put(argumentName, argument);
    }

    public final void i(final v0 navDeepLink) {
        List<String> listA = p136y9.u.a(this.arguments, new er.l() { // from class: ba.v
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(z.h(navDeepLink, (String) obj));
            }
        });
        if (listA.isEmpty()) {
            this.deepLinks.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.getUriPattern() + " can't be used to open destination " + this.destination + ".\nFollowing required arguments are missing: " + listA).toString());
    }

    public final Bundle j(Bundle args) {
        oq.r[] rVarArr;
        if (args == null && this.arguments.isEmpty()) {
            return null;
        }
        Map mapI = pq.v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new oq.r[0];
        } else {
            ArrayList arrayList = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList.add(oq.y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (oq.r[]) arrayList.toArray(new oq.r[0]);
        }
        Bundle bundleA = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        ua.k.a(bundleA);
        for (Map.Entry<String, p136y9.t> entry2 : this.arguments.entrySet()) {
            entry2.getValue().e(entry2.getKey(), bundleA);
        }
        if (args != null) {
            ua.k.b(ua.k.a(bundleA), args);
            for (Map.Entry<String, p136y9.t> entry3 : this.arguments.entrySet()) {
                String key = entry3.getKey();
                p136y9.t value = entry3.getValue();
                if (!value.getIsDefaultValueUnknown() && !value.f(key, bundleA)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument savedState. " + value.a().getName() + " expected.").toString());
                }
            }
        }
        return bundleA;
    }

    public final Map<String, p136y9.t> k() {
        return this.arguments;
    }

    public final List<v0> l() {
        return this.deepLinks;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getIdName() {
        return this.idName;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    public final boolean r(String route, Bundle arguments) {
        if (fr.t.c(this.route, route)) {
            return true;
        }
        y0.b bVarT = t(route);
        if (fr.t.c(this.destination, bVarT != null ? bVarT.getDestination() : null)) {
            return bVarT.j(arguments);
        }
        return false;
    }

    public final y0.b s(w0 navDeepLinkRequest) {
        if (this.deepLinks.isEmpty()) {
            return null;
        }
        y0.b bVar = null;
        for (v0 v0Var : this.deepLinks) {
            Uri uri = navDeepLinkRequest.getUri();
            if (v0Var.N(navDeepLinkRequest)) {
                Bundle bundleV = uri != null ? v0Var.v(uri, this.arguments) : null;
                int iK = v0Var.k(uri);
                String action = navDeepLinkRequest.getAction();
                boolean z15 = action != null && fr.t.c(action, v0Var.getAction());
                String mimeType = navDeepLinkRequest.getMimeType();
                int iC = mimeType != null ? v0Var.C(mimeType) : -1;
                if (bundleV == null) {
                    if (z15 || iC > -1) {
                        if (p(v0Var, uri, this.arguments)) {
                        }
                    }
                }
                y0.b bVar2 = new y0.b(this.destination, bundleV, v0Var.getIsExactDeepLink(), iK, z15, iC);
                if (bVar == null || bVar2.compareTo(bVar) > 0) {
                    bVar = bVar2;
                }
            }
        }
        return bVar;
    }

    public final y0.b t(String route) {
        v0 value;
        Uri uriA;
        Bundle bundleV;
        oq.k<v0> kVar = this.routeDeepLink;
        if (kVar == null || (value = kVar.getValue()) == null || (bundleV = value.v((uriA = n1.a(y0.INSTANCE.c(route))), this.arguments)) == null) {
            return null;
        }
        return new y0.b(this.destination, bundleV, value.getIsExactDeepLink(), value.k(uriA), false, -1);
    }

    public final void u(int i15) {
        this.id = i15;
        this.idName = null;
    }

    public final void v(String str) {
        if (str == null) {
            u(0);
        } else {
            if (fu.r.t0(str)) {
                throw new IllegalArgumentException("Cannot have an empty route");
            }
            final String strC = y0.INSTANCE.c(str);
            final v0 v0VarA = new v0.a().b(strC).a();
            List<String> listA = p136y9.u.a(this.arguments, new er.l() { // from class: ba.w
                @Override // er.l
                public final Object b(Object obj) {
                    return Boolean.valueOf(z.e(v0VarA, (String) obj));
                }
            });
            if (!listA.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this.destination + ". Following required arguments are missing: " + listA).toString());
            }
            this.routeDeepLink = oq.l.a(new er.a() { // from class: ba.x
                @Override // er.a
                public final Object a() {
                    return z.f(strC);
                }
            });
            u(strC.hashCode());
        }
        this.route = str;
    }
}
