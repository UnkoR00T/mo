package p136y9;

import ba.b0;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.l;
import eu.h;
import fr.k;
import fr.t;
import ip.a;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.serialization.KSerializer;
import p071kotlin.Metadata;
import r0.m1;
import r0.o1;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0016\u0018\u0000 W2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001XB\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J1\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ1\u0010\u0012\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00182\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ9\u0010 \u001a\u0004\u0018\u00010\u00012\b\b\u0001\u0010\u001c\u001a\u00020\u001b2\b\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u0004\u0018\u00010\u00012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\"\u0010#J!\u0010%\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\tH\u0007¢\u0006\u0004\b%\u0010&J\u0016\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00010'H\u0086\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u001b¢\u0006\u0004\b+\u0010,J\u0015\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/J\u001f\u00102\u001a\u00020\u0018\"\b\b\u0000\u00101*\u0002002\u0006\u0010-\u001a\u00028\u0000¢\u0006\u0004\b2\u00103J7\u00108\u001a\u00020\u0018\"\u0004\b\u0000\u001012\f\u00105\u001a\b\u0012\u0004\u0012\u00028\u0000042\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u000706H\u0007¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\u0007H\u0016¢\u0006\u0004\b:\u0010;J\u001a\u0010=\u001a\u00020\t2\b\u0010<\u001a\u0004\u0018\u000100H\u0096\u0002¢\u0006\u0004\b=\u0010>J\u000f\u0010?\u001a\u00020\u001bH\u0016¢\u0006\u0004\b?\u0010@R\u0014\u0010D\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00010E8GX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\bF\u0010G*\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010;R+\u0010P\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020\u001b8G@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bM\u0010@\"\u0004\bN\u0010,*\u0004\bO\u0010IR/\u0010T\u001a\u0004\u0018\u00010\u00072\b\u0010L\u001a\u0004\u0018\u00010\u00078F@BX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bQ\u0010;\"\u0004\bR\u0010/*\u0004\bS\u0010IR\u001b\u0010V\u001a\u00020\u00078GX\u0086\u0084\u0002¢\u0006\f\u001a\u0004\b1\u0010;*\u0004\bU\u0010I¨\u0006Y"}, d2 = {"Ly9/b1;", "Ly9/y0;", "", "Ly9/s1;", "navGraphNavigator", "<init>", "(Ly9/s1;)V", "", "route", "", "searchChildren", "searchParent", "lastVisited", "Ly9/y0$b;", "X", "(Ljava/lang/String;ZZLy9/y0;)Ly9/y0$b;", "Ly9/w0;", "navDeepLinkRequest", "W", "(Ly9/w0;ZZLy9/y0;)Ly9/y0$b;", "w", "(Ly9/w0;)Ly9/y0$b;", "", "nodes", "Loq/i0;", i.f37094u, "(Ljava/util/Collection;)V", "", "resId", "M", "(I)Ly9/y0;", "matchingDest", "R", "(ILy9/y0;ZLy9/y0;)Ly9/y0;", i.f37086m, "(Ljava/lang/String;)Ly9/y0;", "searchParents", "Q", "(Ljava/lang/String;Z)Ly9/y0;", "", "iterator", "()Ljava/util/Iterator;", "startDestId", "Y", "(I)V", "startDestRoute", "b0", "(Ljava/lang/String;)V", "", "T", "Z", "(Ljava/lang/Object;)V", "Lkotlinx/serialization/KSerializer;", "serializer", "Lkotlin/Function1;", "parseRoute", "e0", "(Lkotlinx/serialization/KSerializer;Ler/l;)V", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "Lba/b0;", "h", "Lba/b0;", "impl", "Lr0/m1;", a.f96137b, "()Lr0/m1;", "getNodes$delegate", "(Ly9/b1;)Ljava/lang/Object;", "n", "displayName", "<set-?>", "U", "setStartDestinationId", "getStartDestinationId$delegate", "startDestinationId", "V", "setStartDestinationRoute", "getStartDestinationRoute$delegate", "startDestinationRoute", "getStartDestDisplayName$delegate", "startDestDisplayName", "j", "a", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class b1 extends y0 implements Iterable<y0>, gr.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final b0 impl;

    /* JADX INFO: renamed from: y9.b1$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b*\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ly9/b1$a;", "", "<init>", "()V", "Ly9/b1;", "Ly9/y0;", "d", "(Ly9/b1;)Ly9/y0;", "Leu/h;", "b", "(Ly9/b1;)Leu/h;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y0 c(y0 y0Var) {
            if (!(y0Var instanceof b1)) {
                return null;
            }
            b1 b1Var = (b1) y0Var;
            return b1Var.M(b1Var.U());
        }

        public final h<y0> b(b1 b1Var) {
            return eu.k.o(b1Var, new l() { // from class: y9.a1
                @Override // er.l
                public final Object b(Object obj) {
                    return b1.Companion.c((y0) obj);
                }
            });
        }

        public final y0 d(b1 b1Var) {
            return (y0) eu.k.G(b(b1Var));
        }

        private Companion() {
        }
    }

    public b1(s1<? extends b1> s1Var) {
        super(s1Var);
        this.impl = new b0(this);
    }

    public final void L(Collection<? extends y0> nodes) {
        this.impl.c(nodes);
    }

    public final y0 M(int resId) {
        return this.impl.d(resId);
    }

    public final y0 P(String route) {
        return this.impl.e(route);
    }

    public final y0 Q(String route, boolean searchParents) {
        return this.impl.f(route, searchParents);
    }

    public final y0 R(int resId, y0 lastVisited, boolean searchChildren, y0 matchingDest) {
        return this.impl.g(resId, lastVisited, searchChildren, matchingDest);
    }

    public final m1<y0> S() {
        return this.impl.j();
    }

    public final String T() {
        return this.impl.k();
    }

    public final int U() {
        return this.impl.n();
    }

    public final String V() {
        return this.impl.getStartDestinationRoute();
    }

    public final y0.b W(w0 navDeepLinkRequest, boolean searchChildren, boolean searchParent, y0 lastVisited) {
        return this.impl.r(super.w(navDeepLinkRequest), navDeepLinkRequest, searchChildren, searchParent, lastVisited);
    }

    public final y0.b X(String route, boolean searchChildren, boolean searchParent, y0 lastVisited) {
        return this.impl.s(route, searchChildren, searchParent, lastVisited);
    }

    public final void Y(int startDestId) {
        this.impl.u(startDestId);
    }

    public final /* synthetic */ void Z(Object startDestRoute) {
        this.impl.v(startDestRoute);
    }

    public final void b0(String startDestRoute) {
        this.impl.w(startDestRoute);
    }

    public final <T> void e0(KSerializer<T> serializer, l<? super y0, String> parseRoute) {
        this.impl.x(serializer, parseRoute);
    }

    @Override // p136y9.y0
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof b1) && super.equals(other)) {
            b1 b1Var = (b1) other;
            if (S().s() == b1Var.S().s() && U() == b1Var.U()) {
                for (y0 y0Var : eu.k.g(o1.b(S()))) {
                    if (!t.c(y0Var, b1Var.S().i(y0Var.o()))) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // p136y9.y0
    public int hashCode() {
        int iU = U();
        m1<y0> m1VarS = S();
        int iS = m1VarS.s();
        for (int i15 = 0; i15 < iS; i15++) {
            iU = (((iU * 31) + m1VarS.m(i15)) * 31) + m1VarS.t(i15).hashCode();
        }
        return iU;
    }

    @Override // java.lang.Iterable
    public final Iterator<y0> iterator() {
        return this.impl.p();
    }

    @Override // p136y9.y0
    public String n() {
        return this.impl.i(super.n());
    }

    @Override // p136y9.y0
    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(super.toString());
        y0 y0VarP = P(V());
        if (y0VarP == null) {
            y0VarP = M(U());
        }
        sb5.append(" startDestination=");
        if (y0VarP != null) {
            sb5.append("{");
            sb5.append(y0VarP.toString());
            sb5.append("}");
        } else if (V() != null) {
            sb5.append(V());
        } else if (this.impl.getStartDestIdName() != null) {
            sb5.append(this.impl.getStartDestIdName());
        } else {
            sb5.append("0x" + Integer.toHexString(this.impl.getStartDestId()));
        }
        return sb5.toString();
    }

    @Override // p136y9.y0
    public y0.b w(w0 navDeepLinkRequest) {
        return this.impl.q(super.w(navDeepLinkRequest), navDeepLinkRequest);
    }
}
