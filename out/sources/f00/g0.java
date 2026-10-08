package f00;

import org.bouncycastle.asn1.x509.DisplayText;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00042\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0007\b¨\u0006\t"}, d2 = {"Lf00/g0;", "", "<init>", "()V", "a", "c", "b", "Lf00/g0$a;", "Lf00/g0$c;", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class g0 {

    /* JADX INFO: renamed from: f00.g0$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001c\u0010\u001b¨\u0006\u001e"}, d2 = {"Lf00/g0$a;", "Lf00/g0;", "Lt0/c0;", "enterTransition", "Lt0/e0;", "exitTransition", "popEnterTransition", "popExitTransition", "<init>", "(Lt0/c0;Lt0/e0;Lt0/c0;Lt0/e0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lt0/c0;", "a", "()Lt0/c0;", "c", "Lt0/e0;", "()Lt0/e0;", "d", "e", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Animated extends g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final p114t0.c0 enterTransition;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final p114t0.e0 exitTransition;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final p114t0.c0 popEnterTransition;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final p114t0.e0 popExitTransition;

        public Animated() {
            this(null, null, null, null, 15, null);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final p114t0.c0 getEnterTransition() {
            return this.enterTransition;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final p114t0.e0 getExitTransition() {
            return this.exitTransition;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final p114t0.c0 getPopEnterTransition() {
            return this.popEnterTransition;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final p114t0.e0 getPopExitTransition() {
            return this.popExitTransition;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Animated)) {
                return false;
            }
            Animated animated = (Animated) other;
            return fr.t.c(this.enterTransition, animated.enterTransition) && fr.t.c(this.exitTransition, animated.exitTransition) && fr.t.c(this.popEnterTransition, animated.popEnterTransition) && fr.t.c(this.popExitTransition, animated.popExitTransition);
        }

        public int hashCode() {
            return (((((this.enterTransition.hashCode() * 31) + this.exitTransition.hashCode()) * 31) + this.popEnterTransition.hashCode()) * 31) + this.popExitTransition.hashCode();
        }

        public String toString() {
            return "Animated(enterTransition=" + this.enterTransition + ", exitTransition=" + this.exitTransition + ", popEnterTransition=" + this.popEnterTransition + ", popExitTransition=" + this.popExitTransition + ')';
        }

        public Animated(p114t0.c0 c0Var, p114t0.e0 e0Var, p114t0.c0 c0Var2, p114t0.e0 e0Var2) {
            super(null);
            this.enterTransition = c0Var;
            this.exitTransition = e0Var;
            this.popEnterTransition = c0Var2;
            this.popExitTransition = e0Var2;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ Animated(p114t0.c0 c0Var, p114t0.e0 e0Var, p114t0.c0 c0Var2, p114t0.e0 e0Var2, int i15, fr.k kVar) {
            c0Var = (i15 & 1) != 0 ? p114t0.a0.o(u0.m.l(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 0, null, 6, null), 0.0f, 2, null) : c0Var;
            e0Var = (i15 & 2) != 0 ? p114t0.a0.q(u0.m.l(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 0, null, 6, null), 0.0f, 2, null) : e0Var;
            this(c0Var, e0Var, (i15 & 4) != 0 ? c0Var : c0Var2, (i15 & 8) != 0 ? e0Var : e0Var2);
        }
    }

    public /* synthetic */ g0(fr.k kVar) {
        this();
    }

    /* JADX INFO: renamed from: f00.g0$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lf00/g0$c;", "Lf00/g0;", "Lf00/t;", "type", "<init>", "(Lf00/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Lf00/t;", "a", "()Lf00/t;", "navigation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Dialog extends g0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final t type;

        public Dialog(t tVar) {
            super(null);
            this.type = tVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final t getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Dialog) && fr.t.c(this.type, ((Dialog) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }

        public String toString() {
            return "Dialog(type=" + this.type + ')';
        }

        public /* synthetic */ Dialog(t tVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? t.a.f54568b : tVar);
        }
    }

    private g0() {
    }
}
