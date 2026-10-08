package p136y9;

import android.os.Bundle;
import ba.h;
import ba.z;
import er.l;
import fr.k;
import fr.t;
import fu.r;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;
import pq.m;
import pq.v;
import pq.v0;
import r0.m1;
import r0.o1;
import ua.c;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\f\b\u0016\u0018\u0000 \f2\u00020\u0001:\u0002;7B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0019\b\u0016\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J'\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u000e\u001a\u00020\u00022\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u001dH\u0017¢\u0006\u0004\b \u0010!J\u001f\u0010&\u001a\u00020\u000b2\b\b\u0001\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'J\u001d\u0010+\u001a\u00020\u000b2\u0006\u0010(\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,J'\u0010.\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\u000e\u0010-\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0007¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0002H\u0016¢\u0006\u0004\b0\u00101J\u001a\u00103\u001a\u00020\u001d2\b\u00102\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\"H\u0016¢\u0006\u0004\b5\u00106R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u00101R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R.\u0010F\u001a\u0004\u0018\u00010>2\b\u0010?\u001a\u0004\u0018\u00010>8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b@\u0010A\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER$\u0010N\u001a\u0004\u0018\u00010G8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010MR\u001a\u0010Q\u001a\b\u0012\u0004\u0012\u00020$0O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010PR/\u0010W\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u00028B@BX\u0082\u008e\u0002¢\u0006\u0012\u001a\u0004\bS\u00101\"\u0004\bT\u0010\u0005*\u0004\bU\u0010VR!\u0010\\\u001a\b\u0012\u0004\u0012\u00020\t0X8BX\u0082\u0084\u0002¢\u0006\f\u001a\u0004\bY\u0010Z*\u0004\b[\u0010VR\u001d\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020)0]8F¢\u0006\u0006\u001a\u0004\b^\u0010_R&\u0010c\u001a\u00020\"2\b\b\u0001\u0010?\u001a\u00020\"8G@FX\u0086\u000e¢\u0006\f\u001a\u0004\b`\u00106\"\u0004\ba\u0010bR/\u0010\u000e\u001a\u0004\u0018\u00010\u00022\b\u0010R\u001a\u0004\u0018\u00010\u00028F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\bd\u00101\"\u0004\be\u0010\u0005*\u0004\bf\u0010VR\u0014\u0010h\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bg\u00101¨\u0006i"}, d2 = {"Ly9/y0;", "", "", "navigatorName", "<init>", "(Ljava/lang/String;)V", "Ly9/s1;", "navigator", "(Ly9/s1;)V", "Ly9/v0;", "navDeepLink", "Loq/i0;", "f", "(Ly9/v0;)V", "route", "Ly9/y0$b;", "x", "(Ljava/lang/String;)Ly9/y0$b;", "Ly9/w0;", "navDeepLinkRequest", "w", "(Ly9/w0;)Ly9/y0$b;", "previousDestination", "", "h", "(Ly9/y0;)[I", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "arguments", "", "v", "(Ljava/lang/String;Landroid/os/Bundle;)Z", "G", "()Z", "", "actionId", "Ly9/s;", "action", "z", "(ILy9/s;)V", "argumentName", "Ly9/t;", "argument", "e", "(Ljava/lang/String;Ly9/t;)V", "args", "g", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "toString", "()Ljava/lang/String;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "a", "Ljava/lang/String;", "s", "Lba/z;", "b", "Lba/z;", "impl", "Ly9/b1;", "value", "c", "Ly9/b1;", "t", "()Ly9/b1;", "C", "(Ly9/b1;)V", "parent", "", "d", "Ljava/lang/CharSequence;", "getLabel", "()Ljava/lang/CharSequence;", "B", "(Ljava/lang/CharSequence;)V", AnnotatedPrivateKey.LABEL, "Lr0/m1;", "Lr0/m1;", "actions", "<set-?>", "q", "setIdName", "getIdName$delegate", "(Ly9/y0;)Ljava/lang/Object;", "idName", "", "l", "()Ljava/util/List;", "getDeepLinks$delegate", "deepLinks", "", "k", "()Ljava/util/Map;", "o", "A", "(I)V", "id", "u", "E", "getRoute$delegate", "n", "displayName", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class y0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, Class<?>> f225557g = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String navigatorName;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z impl;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private b1 parent;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private CharSequence label;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final m1<s> actions;

    /* JADX INFO: renamed from: y9.y0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rR$\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u000f*\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R$\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00160\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Ly9/y0$a;", "", "<init>", "()V", "Lba/h;", "context", "", "id", "", "d", "(Lba/h;I)Ljava/lang/String;", "route", "c", "(Ljava/lang/String;)Ljava/lang/String;", "Ly9/y0;", "Leu/h;", "e", "(Ly9/y0;)Leu/h;", "getHierarchy$annotations", "(Ly9/y0;)V", "hierarchy", "", "Ljava/lang/Class;", "classes", "Ljava/util/Map;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final y0 b(y0 y0Var) {
            return y0Var.getParent();
        }

        public final String c(String route) {
            if (route == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + route;
        }

        public final String d(h context, int id5) {
            return id5 <= 16777215 ? String.valueOf(id5) : context.c(id5);
        }

        public final eu.h<y0> e(y0 y0Var) {
            return eu.k.o(y0Var, new l() { // from class: y9.x0
                @Override // er.l
                public final Object b(Object obj) {
                    return y0.Companion.b((y0) obj);
                }
            });
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0018\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0000H\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u00020\u00072\u000e\u0010\u0012\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001dR\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001f¨\u0006!"}, d2 = {"Ly9/y0$b;", "", "Ly9/y0;", "destination", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "matchingArgs", "", "isExactDeepLink", "", "matchingPathSegments", "hasMatchingAction", "mimeTypeMatchLevel", "<init>", "(Ly9/y0;Landroid/os/Bundle;ZIZI)V", "other", "b", "(Ly9/y0$b;)I", "arguments", "j", "(Landroid/os/Bundle;)Z", "a", "Ly9/y0;", "e", "()Ly9/y0;", "Landroid/os/Bundle;", "g", "()Landroid/os/Bundle;", "c", "Z", "d", "I", "f", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final y0 destination;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Bundle matchingArgs;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final boolean isExactDeepLink;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int matchingPathSegments;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final boolean hasMatchingAction;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final int mimeTypeMatchLevel;

        public b(y0 y0Var, Bundle bundle, boolean z15, int i15, boolean z16, int i16) {
            this.destination = y0Var;
            this.matchingArgs = bundle;
            this.isExactDeepLink = z15;
            this.matchingPathSegments = i15;
            this.hasMatchingAction = z16;
            this.mimeTypeMatchLevel = i16;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public int compareTo(b other) {
            boolean z15 = this.isExactDeepLink;
            if (z15 && !other.isExactDeepLink) {
                return 1;
            }
            if (!z15 && other.isExactDeepLink) {
                return -1;
            }
            int i15 = this.matchingPathSegments - other.matchingPathSegments;
            if (i15 > 0) {
                return 1;
            }
            if (i15 < 0) {
                return -1;
            }
            Bundle bundle = this.matchingArgs;
            if (bundle != null && other.matchingArgs == null) {
                return 1;
            }
            if (bundle == null && other.matchingArgs != null) {
                return -1;
            }
            if (bundle != null) {
                int iX = c.x(c.a(bundle)) - c.x(c.a(other.matchingArgs));
                if (iX > 0) {
                    return 1;
                }
                if (iX < 0) {
                    return -1;
                }
            }
            boolean z16 = this.hasMatchingAction;
            if (z16 && !other.hasMatchingAction) {
                return 1;
            }
            if (z16 || !other.hasMatchingAction) {
                return this.mimeTypeMatchLevel - other.mimeTypeMatchLevel;
            }
            return -1;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final y0 getDestination() {
            return this.destination;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Bundle getMatchingArgs() {
            return this.matchingArgs;
        }

        public final boolean j(Bundle arguments) {
            Bundle bundle;
            if (arguments == null || (bundle = this.matchingArgs) == null) {
                return false;
            }
            for (String str : bundle.keySet()) {
                if (!c.b(c.a(arguments), str)) {
                    return false;
                }
                t tVar = this.destination.k().get(str);
                l1<Object> l1VarA = tVar != null ? tVar.a() : null;
                Object objA = l1VarA != null ? l1VarA.a(this.matchingArgs, str) : null;
                Object objA2 = l1VarA != null ? l1VarA.a(arguments, str) : null;
                if (l1VarA != null && !l1VarA.i(objA, objA2)) {
                    return false;
                }
            }
            return true;
        }
    }

    public y0(String str) {
        this.navigatorName = str;
        this.impl = new z(this);
        this.actions = new m1<>(0, 1, null);
    }

    public static /* synthetic */ int[] i(y0 y0Var, y0 y0Var2, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i15 & 1) != 0) {
            y0Var2 = null;
        }
        return y0Var.h(y0Var2);
    }

    private final List<v0> l() {
        return this.impl.l();
    }

    private final String q() {
        return this.impl.getIdName();
    }

    public final void A(int i15) {
        this.impl.u(i15);
    }

    public final void B(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void C(b1 b1Var) {
        this.parent = b1Var;
    }

    public final void E(String str) {
        this.impl.v(str);
    }

    public boolean G() {
        return true;
    }

    public final void e(String argumentName, t argument) {
        this.impl.g(argumentName, argument);
    }

    public boolean equals(Object other) {
        boolean z15;
        boolean z16;
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof y0)) {
            y0 y0Var = (y0) other;
            boolean zC = t.c(l(), y0Var.l());
            if (this.actions.s() != y0Var.actions.s()) {
                z15 = false;
                break;
            }
            Iterator it = eu.k.g(o1.a(this.actions)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z15 = true;
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                if (!t.c(this.actions.i(iIntValue), y0Var.actions.i(iIntValue))) {
                    z15 = false;
                    break;
                }
            }
            if (k().size() != y0Var.k().size()) {
                z16 = false;
                break;
            }
            Iterator it4 = v0.x(k()).iterator();
            while (true) {
                if (!it4.hasNext()) {
                    z16 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it4.next();
                if (!y0Var.k().containsKey(entry.getKey()) || !t.c(y0Var.k().get(entry.getKey()), entry.getValue())) {
                    z16 = false;
                    break;
                }
            }
            if (o() == y0Var.o() && t.c(u(), y0Var.u()) && zC && z15 && z16) {
                return true;
            }
        }
        return false;
    }

    public final void f(v0 navDeepLink) {
        this.impl.i(navDeepLink);
    }

    public final Bundle g(Bundle args) {
        return this.impl.j(args);
    }

    public final int[] h(y0 previousDestination) {
        m mVar = new m();
        y0 y0Var = this;
        while (true) {
            b1 b1Var = y0Var.parent;
            if ((previousDestination != null ? previousDestination.parent : null) != null && previousDestination.parent.M(y0Var.o()) == y0Var) {
                mVar.addFirst(y0Var);
                break;
            }
            if (b1Var == null || b1Var.U() != y0Var.o()) {
                mVar.addFirst(y0Var);
            }
            if (t.c(b1Var, previousDestination) || b1Var == null) {
                break;
            }
            y0Var = b1Var;
        }
        List listF1 = v.f1(mVar);
        ArrayList arrayList = new ArrayList(v.y(listF1, 10));
        Iterator it = listF1.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((y0) it.next()).o()));
        }
        return v.e1(arrayList);
    }

    public int hashCode() {
        int iO = o() * 31;
        String strU = u();
        int iHashCode = iO + (strU != null ? strU.hashCode() : 0);
        for (v0 v0Var : l()) {
            int i15 = iHashCode * 31;
            String strG = v0Var.getUriPattern();
            int iHashCode2 = (i15 + (strG != null ? strG.hashCode() : 0)) * 31;
            String strP = v0Var.getAction();
            int iHashCode3 = (iHashCode2 + (strP != null ? strP.hashCode() : 0)) * 31;
            String strB = v0Var.getMimeType();
            iHashCode = iHashCode3 + (strB != null ? strB.hashCode() : 0);
        }
        Iterator itB = o1.b(this.actions);
        while (itB.hasNext()) {
            s sVar = (s) itB.next();
            int iB = ((iHashCode * 31) + sVar.getDestinationId()) * 31;
            i1 i1VarC = sVar.getNavOptions();
            iHashCode = iB + (i1VarC != null ? i1VarC.hashCode() : 0);
            Bundle bundleA = sVar.getDefaultArguments();
            if (bundleA != null) {
                iHashCode = (iHashCode * 31) + c.d(c.a(bundleA));
            }
        }
        for (String str : k().keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str.hashCode()) * 31;
            t tVar = k().get(str);
            iHashCode = iHashCode4 + (tVar != null ? tVar.hashCode() : 0);
        }
        return iHashCode;
    }

    public final Map<String, t> k() {
        return v0.u(this.impl.k());
    }

    public String n() {
        String strQ = q();
        return strQ == null ? String.valueOf(o()) : strQ;
    }

    public final int o() {
        return this.impl.getId();
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final String getNavigatorName() {
        return this.navigatorName;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final b1 getParent() {
        return this.parent;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(getClass().getSimpleName());
        sb5.append("(");
        if (q() == null) {
            sb5.append("0x");
            sb5.append(Integer.toHexString(o()));
        } else {
            sb5.append(q());
        }
        sb5.append(")");
        String strU = u();
        if (strU != null && !r.t0(strU)) {
            sb5.append(" route=");
            sb5.append(u());
        }
        if (this.label != null) {
            sb5.append(" label=");
            sb5.append(this.label);
        }
        return sb5.toString();
    }

    public final String u() {
        return this.impl.getRoute();
    }

    public final boolean v(String route, Bundle arguments) {
        return this.impl.r(route, arguments);
    }

    public b w(w0 navDeepLinkRequest) {
        return this.impl.s(navDeepLinkRequest);
    }

    public final b x(String route) {
        return this.impl.t(route);
    }

    public final void z(int actionId, s action) {
        if (G()) {
            if (actionId == 0) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0");
            }
            this.actions.n(actionId, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + actionId + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public y0(s1<? extends y0> s1Var) {
        this(t1.INSTANCE.a(s1Var.getClass()));
    }
}
