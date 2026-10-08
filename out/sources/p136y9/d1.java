package p136y9;

import er.l;
import ip.a;
import java.util.ArrayList;
import java.util.List;
import mr.c;
import p071kotlin.Metadata;
import uu.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ%\u0010\u000e\u001a\u00020\r\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u001c\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\"\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010&\u001a\b\u0012\u0004\u0012\u00020\n0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006'"}, d2 = {"Ly9/d1;", "Ly9/z0;", "Ly9/b1;", "Ly9/t1;", "provider", "", "startDestination", "route", "<init>", "(Ly9/t1;Ljava/lang/String;Ljava/lang/String;)V", "Ly9/y0;", a.f96138c, "navDestination", "Loq/i0;", "i", "(Ly9/z0;)V", "g", "()Ly9/b1;", "h", "Ly9/t1;", "j", "()Ly9/t1;", "", "I", "startDestinationId", "Ljava/lang/String;", "startDestinationRoute", "Lmr/c;", "k", "Lmr/c;", "startDestinationClass", "", "l", "Ljava/lang/Object;", "startDestinationObject", "", "m", "Ljava/util/List;", "destinations", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class d1 extends z0<b1> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final t1 provider;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int startDestinationId;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String startDestinationRoute;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private c<?> startDestinationClass;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Object startDestinationObject;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final List<y0> destinations;

    public d1(t1 t1Var, String str, String str2) {
        super(t1Var.d(f1.class), str2);
        this.destinations = new ArrayList();
        this.provider = t1Var;
        this.startDestinationRoute = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String h(y0 y0Var) {
        return y0Var.u();
    }

    @Override // p136y9.z0
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public b1 b() {
        b1 b1Var = (b1) super.b();
        b1Var.L(this.destinations);
        int i15 = this.startDestinationId;
        if (i15 == 0 && this.startDestinationRoute == null && this.startDestinationClass == null && this.startDestinationObject == null) {
            if (getRoute() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.startDestinationRoute;
        if (str != null) {
            b1Var.b0(str);
            return b1Var;
        }
        c<?> cVar = this.startDestinationClass;
        if (cVar != null) {
            b1Var.e0(p.b(cVar), new l() { // from class: y9.c1
                @Override // er.l
                public final Object b(Object obj) {
                    return d1.h((y0) obj);
                }
            });
            return b1Var;
        }
        Object obj = this.startDestinationObject;
        if (obj != null) {
            b1Var.Z(obj);
            return b1Var;
        }
        b1Var.Y(i15);
        return b1Var;
    }

    public final <D extends y0> void i(z0<? extends D> navDestination) {
        this.destinations.add(navDestination.b());
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final t1 getProvider() {
        return this.provider;
    }
}
