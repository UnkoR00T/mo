package p136y9;

import ca.d;
import fr.q0;
import fr.t;
import mr.c;
import p071kotlin.Metadata;
import uu.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\u0018\u00002\u00020\u0001:\u0001#B[\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\b\u0001\u0010\t\u001a\u00020\u0005\u0012\b\b\u0001\u0010\n\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0001\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eBS\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0011BW\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0012\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0014BQ\b\u0010\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\r\u0010\u001a\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\r\u0010\u001b\u001a\u00020\u0002¢\u0006\u0004\b\u001b\u0010\u0018J\u001a\u0010\u001d\u001a\u00020\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u000fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010$R\u001a\u0010\u0006\u001a\u00020\u00058GX\u0087\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010 R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010$R\u0014\u0010\b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010$R\u0017\u0010\t\u001a\u00020\u00058G¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b#\u0010 R\u0017\u0010\n\u001a\u00020\u00058G¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b%\u0010 R\u0017\u0010\u000b\u001a\u00020\u00058G¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b&\u0010 R\u0017\u0010\f\u001a\u00020\u00058G¢\u0006\f\n\u0004\b\u001a\u0010'\u001a\u0004\b)\u0010 R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010-\u001a\u0004\u0018\u00010\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b*\u0010\"R0\u0010\u0013\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\f\u0010-\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00128\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010/\u001a\u0004\b+\u00100R(\u0010\u0015\u001a\u0004\u0018\u00010\u00012\b\u0010-\u001a\u0004\u0018\u00010\u00018\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u00101\u001a\u0004\b,\u00102¨\u00063"}, d2 = {"Ly9/i1;", "", "", "singleTop", "restoreState", "", "popUpToId", "popUpToInclusive", "popUpToSaveState", "enterAnim", "exitAnim", "popEnterAnim", "popExitAnim", "<init>", "(ZZIZZIIII)V", "", "popUpToRoute", "(ZZLjava/lang/String;ZZIIII)V", "Lmr/c;", "popUpToRouteClass", "(ZZLmr/c;ZZIIII)V", "popUpToRouteObject", "(ZZLjava/lang/Object;ZZIIII)V", "j", "()Z", "l", "i", "k", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Z", "b", "c", "I", "e", "d", "f", "g", "h", "value", "Ljava/lang/String;", "Lmr/c;", "()Lmr/c;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean singleTop;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean restoreState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int popUpToId;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToInclusive;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean popUpToSaveState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int enterAnim;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int exitAnim;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int popEnterAnim;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int popExitAnim;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String popUpToRoute;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private c<?> popUpToRouteClass;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Object popUpToRouteObject;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0007J+\u0010\u000e\u001a\u00020\u00002\b\b\u0001\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ+\u0010\u0012\u001a\u00020\u00002\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J9\u0010\u0016\u001a\u00020\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J3\u0010\u0018\u001a\u00020\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00012\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00002\b\b\u0001\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\n¢\u0006\u0004\b\u001e\u0010\u001cJ\u0017\u0010 \u001a\u00020\u00002\b\b\u0001\u0010\u001f\u001a\u00020\n¢\u0006\u0004\b \u0010\u001cJ\u0017\u0010\"\u001a\u00020\u00002\b\b\u0001\u0010!\u001a\u00020\n¢\u0006\u0004\b\"\u0010\u001cJ\r\u0010$\u001a\u00020#¢\u0006\u0004\b$\u0010%R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010&R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0016\u0010(\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010)R\u001c\u0010,\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010-R\u0016\u0010/\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010&R\u0016\u00100\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010&R\u0016\u0010\u001a\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010'R\u0016\u0010\u001d\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010'R\u0016\u0010\u001f\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b1\u0010'R\u0016\u0010!\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\t\u0010'¨\u00062"}, d2 = {"Ly9/i1$a;", "", "<init>", "()V", "", "singleTop", "d", "(Z)Ly9/i1$a;", "restoreState", "l", "", "destinationId", "inclusive", "saveState", "g", "(IZZ)Ly9/i1$a;", "", "route", "i", "(Ljava/lang/String;ZZ)Ly9/i1$a;", "T", "Lmr/c;", "j", "(Lmr/c;ZZ)Ly9/i1$a;", "h", "(Ljava/lang/Object;ZZ)Ly9/i1$a;", "enterAnim", "b", "(I)Ly9/i1$a;", "exitAnim", "c", "popEnterAnim", "e", "popExitAnim", "f", "Ly9/i1;", "a", "()Ly9/i1;", "Z", "I", "popUpToId", "Ljava/lang/String;", "popUpToRoute", "Lmr/c;", "popUpToRouteClass", "Ljava/lang/Object;", "popUpToRouteObject", "popUpToInclusive", "popUpToSaveState", "k", "navigation-common_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean singleTop;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean restoreState;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String popUpToRoute;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private c<?> popUpToRouteClass;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private Object popUpToRouteObject;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToInclusive;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean popUpToSaveState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int popUpToId = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private int enterAnim = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private int exitAnim = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private int popEnterAnim = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private int popExitAnim = -1;

        public static /* synthetic */ a k(a aVar, int i15, boolean z15, boolean z16, int i16, Object obj) {
            if ((i16 & 4) != 0) {
                z16 = false;
            }
            return aVar.g(i15, z15, z16);
        }

        public final i1 a() {
            String str = this.popUpToRoute;
            if (str != null) {
                return new i1(this.singleTop, this.restoreState, str, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            c<?> cVar = this.popUpToRouteClass;
            if (cVar != null) {
                return new i1(this.singleTop, this.restoreState, cVar, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
            }
            Object obj = this.popUpToRouteObject;
            return obj != null ? new i1(this.singleTop, this.restoreState, obj, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim) : new i1(this.singleTop, this.restoreState, this.popUpToId, this.popUpToInclusive, this.popUpToSaveState, this.enterAnim, this.exitAnim, this.popEnterAnim, this.popExitAnim);
        }

        public final a b(int enterAnim) {
            this.enterAnim = enterAnim;
            return this;
        }

        public final a c(int exitAnim) {
            this.exitAnim = exitAnim;
            return this;
        }

        public final a d(boolean singleTop) {
            this.singleTop = singleTop;
            return this;
        }

        public final a e(int popEnterAnim) {
            this.popEnterAnim = popEnterAnim;
            return this;
        }

        public final a f(int popExitAnim) {
            this.popExitAnim = popExitAnim;
            return this;
        }

        public final a g(int destinationId, boolean inclusive, boolean saveState) {
            this.popUpToId = destinationId;
            this.popUpToRoute = null;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final <T> a h(T route, boolean inclusive, boolean saveState) {
            this.popUpToRouteObject = route;
            g(d.c(p.b(q0.c(route.getClass()))), inclusive, saveState);
            return this;
        }

        public final a i(String route, boolean inclusive, boolean saveState) {
            this.popUpToRoute = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <T> a j(c<T> route, boolean inclusive, boolean saveState) {
            this.popUpToRouteClass = route;
            this.popUpToId = -1;
            this.popUpToInclusive = inclusive;
            this.popUpToSaveState = saveState;
            return this;
        }

        public final a l(boolean restoreState) {
            this.restoreState = restoreState;
            return this;
        }
    }

    public i1(boolean z15, boolean z16, int i15, boolean z17, boolean z18, int i16, int i17, int i18, int i19) {
        this.singleTop = z15;
        this.restoreState = z16;
        this.popUpToId = i15;
        this.popUpToInclusive = z17;
        this.popUpToSaveState = z18;
        this.enterAnim = i16;
        this.exitAnim = i17;
        this.popEnterAnim = i18;
        this.popExitAnim = i19;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getEnterAnim() {
        return this.enterAnim;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getExitAnim() {
        return this.exitAnim;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getPopEnterAnim() {
        return this.popEnterAnim;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getPopExitAnim() {
        return this.popExitAnim;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other != null && (other instanceof i1)) {
            i1 i1Var = (i1) other;
            if (this.singleTop == i1Var.singleTop && this.restoreState == i1Var.restoreState && this.popUpToId == i1Var.popUpToId && t.c(this.popUpToRoute, i1Var.popUpToRoute) && t.c(this.popUpToRouteClass, i1Var.popUpToRouteClass) && t.c(this.popUpToRouteObject, i1Var.popUpToRouteObject) && this.popUpToInclusive == i1Var.popUpToInclusive && this.popUpToSaveState == i1Var.popUpToSaveState && this.enterAnim == i1Var.enterAnim && this.exitAnim == i1Var.exitAnim && this.popEnterAnim == i1Var.popEnterAnim && this.popExitAnim == i1Var.popExitAnim) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    public final c<?> g() {
        return this.popUpToRouteClass;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    public int hashCode() {
        int i15 = (((((getSingleTop() ? 1 : 0) * 31) + (getRestoreState() ? 1 : 0)) * 31) + this.popUpToId) * 31;
        String str = this.popUpToRoute;
        int iHashCode = (i15 + (str != null ? str.hashCode() : 0)) * 31;
        c<?> cVar = this.popUpToRouteClass;
        int iHashCode2 = (iHashCode + (cVar != null ? cVar.hashCode() : 0)) * 31;
        Object obj = this.popUpToRouteObject;
        return ((((((((((((iHashCode2 + (obj != null ? obj.hashCode() : 0)) * 31) + (getPopUpToInclusive() ? 1 : 0)) * 31) + (getPopUpToSaveState() ? 1 : 0)) * 31) + this.enterAnim) * 31) + this.exitAnim) * 31) + this.popEnterAnim) * 31) + this.popExitAnim;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getPopUpToInclusive() {
        return this.popUpToInclusive;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final boolean getSingleTop() {
        return this.singleTop;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final boolean getPopUpToSaveState() {
        return this.popUpToSaveState;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append(i1.class.getSimpleName());
        sb5.append("(");
        if (this.singleTop) {
            sb5.append("launchSingleTop ");
        }
        if (this.restoreState) {
            sb5.append("restoreState ");
        }
        String str = this.popUpToRoute;
        if ((str != null || this.popUpToId != -1) && str != null) {
            sb5.append("popUpTo(");
            String str2 = this.popUpToRoute;
            if (str2 != null) {
                sb5.append(str2);
            } else {
                c<?> cVar = this.popUpToRouteClass;
                if (cVar != null) {
                    sb5.append(cVar);
                } else {
                    Object obj = this.popUpToRouteObject;
                    if (obj != null) {
                        sb5.append(obj);
                    } else {
                        sb5.append("0x");
                        sb5.append(Integer.toHexString(this.popUpToId));
                    }
                }
            }
            if (this.popUpToInclusive) {
                sb5.append(" inclusive");
            }
            if (this.popUpToSaveState) {
                sb5.append(" saveState");
            }
            sb5.append(")");
        }
        if (this.enterAnim != -1 || this.exitAnim != -1 || this.popEnterAnim != -1 || this.popExitAnim != -1) {
            sb5.append("anim(enterAnim=0x");
            sb5.append(Integer.toHexString(this.enterAnim));
            sb5.append(" exitAnim=0x");
            sb5.append(Integer.toHexString(this.exitAnim));
            sb5.append(" popEnterAnim=0x");
            sb5.append(Integer.toHexString(this.popEnterAnim));
            sb5.append(" popExitAnim=0x");
            sb5.append(Integer.toHexString(this.popExitAnim));
            sb5.append(")");
        }
        return sb5.toString();
    }

    public i1(boolean z15, boolean z16, String str, boolean z17, boolean z18, int i15, int i16, int i17, int i18) {
        this(z15, z16, y0.INSTANCE.c(str).hashCode(), z17, z18, i15, i16, i17, i18);
        this.popUpToRoute = str;
    }

    public i1(boolean z15, boolean z16, c<?> cVar, boolean z17, boolean z18, int i15, int i16, int i17, int i18) {
        this(z15, z16, d.c(p.b(cVar)), z17, z18, i15, i16, i17, i18);
        this.popUpToRouteClass = cVar;
    }

    public i1(boolean z15, boolean z16, Object obj, boolean z17, boolean z18, int i15, int i16, int i17, int i18) {
        this(z15, z16, d.c(p.b(q0.c(obj.getClass()))), z17, z18, i15, i16, i17, i18);
        this.popUpToRouteObject = obj;
    }
}
