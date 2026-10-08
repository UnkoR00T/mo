package p136y9;

import ip.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import p136y9.y0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003B-\b\u0000\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bB#\b\u0016\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\fJ\u001d\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00028\u0000H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\"\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00048\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0015\u0010 \u001a\u0004\b!\u0010\"R$\u0010)\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e0*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u001c\u00100\u001a\b\u0012\u0004\u0012\u00020\u00130-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010+¨\u00064"}, d2 = {"Ly9/z0;", "Ly9/y0;", a.f96138c, "", "Ly9/s1;", "navigator", "", "id", "", "route", "<init>", "(Ly9/s1;ILjava/lang/String;)V", "(Ly9/s1;Ljava/lang/String;)V", "name", "Ly9/t;", "argument", "Loq/i0;", "a", "(Ljava/lang/String;Ly9/t;)V", "Ly9/v0;", "navDeepLink", "c", "(Ly9/v0;)V", "e", "()Ly9/y0;", "b", "Ly9/s1;", "getNavigator", "()Ly9/s1;", "I", "getId", "()I", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", AnnotatedPrivateKey.LABEL, "", "Ljava/util/Map;", "arguments", "", "f", "Ljava/util/List;", "deepLinks", "Ly9/s;", "g", "actions", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class z0<D extends y0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final s1<? extends D> navigator;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int id;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String route;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private CharSequence label;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Map<String, t> arguments;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private List<v0> deepLinks;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private Map<Integer, s> actions;

    public z0(s1<? extends D> s1Var, int i15, String str) {
        this.navigator = s1Var;
        this.id = i15;
        this.route = str;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    public final void a(String name, t argument) {
        this.arguments.put(name, argument);
    }

    public D b() {
        D d15 = (D) e();
        d15.B(this.label);
        for (Map.Entry<String, t> entry : this.arguments.entrySet()) {
            d15.e(entry.getKey(), entry.getValue());
        }
        Iterator<T> it = this.deepLinks.iterator();
        while (it.hasNext()) {
            d15.f((v0) it.next());
        }
        for (Map.Entry<Integer, s> entry2 : this.actions.entrySet()) {
            d15.z(entry2.getKey().intValue(), entry2.getValue());
        }
        String str = this.route;
        if (str != null) {
            d15.E(str);
        }
        int i15 = this.id;
        if (i15 != -1) {
            d15.A(i15);
        }
        return d15;
    }

    public final void c(v0 navDeepLink) {
        this.deepLinks.add(navDeepLink);
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getRoute() {
        return this.route;
    }

    protected D e() {
        return (D) this.navigator.c();
    }

    public z0(s1<? extends D> s1Var, String str) {
        this(s1Var, -1, str);
    }
}
