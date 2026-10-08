package xw;

import fr.k;
import fr.t;
import fu.r;
import iy.b0;
import iy.c0;
import java.util.Arrays;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: xw.h, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u0000 \u00162\u00020\u0001:\u0003\u0016\u0014\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\f\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J$\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u001b\u001a\u0004\b\u001d\u0010\u0015¨\u0006\u001e"}, d2 = {"Lxw/h;", "", "Lxw/h$c;", "prefix", "Lxw/h$b;", "number", "<init>", "(Liy/b0;Liy/b0;Lfr/k;)V", "", "i", "()Z", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "f", "()Ljava/lang/String;", "b", "()Liy/b0;", "c", "d", "(Liy/b0;Liy/b0;)Lxw/h;", "toString", "a", "Liy/b0;", "h", "g", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhoneNumber {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f221634d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final PhoneNumber f221635e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 prefix;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 number;

    /* JADX INFO: renamed from: xw.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxw/h$a;", "", "<init>", "()V", "Lxw/h;", "DEFAULT", "Lxw/h;", "a", "()Lxw/h;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final PhoneNumber a() {
            return PhoneNumber.f221635e;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: xw.h$b */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lxw/h$b;", "", "Liy/b0;", "value", "c", "(Liy/b0;)Liy/b0;", "", "g", "(Liy/b0;)Ljava/lang/String;", "", "f", "(Liy/b0;)I", "other", "", "d", "(Liy/b0;Ljava/lang/Object;)Z", "a", "Liy/b0;", "getValue", "()Liy/b0;", "b", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b0 f221639c = c(b0.INSTANCE.a());

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 value;

        /* JADX INFO: renamed from: xw.h$b$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxw/h$b$a;", "", "<init>", "()V", "Lxw/h$b;", "EMPTY", "Liy/b0;", "a", "()Liy/b0;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b0 a() {
                return b.f221639c;
            }

            private Companion() {
            }
        }

        private /* synthetic */ b(b0 b0Var) {
            this.value = b0Var;
        }

        public static final /* synthetic */ b b(b0 b0Var) {
            return new b(b0Var);
        }

        public static b0 c(b0 b0Var) {
            return b0Var;
        }

        public static boolean d(b0 b0Var, Object obj) {
            return (obj instanceof b) && t.c(b0Var, ((b) obj).getValue());
        }

        public static final boolean e(b0 b0Var, b0 b0Var2) {
            return t.c(b0Var, b0Var2);
        }

        public static int f(b0 b0Var) {
            return b0Var.hashCode();
        }

        public static String g(b0 b0Var) {
            return "Number(value=" + b0Var + ")";
        }

        public boolean equals(Object obj) {
            return d(this.value, obj);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final /* synthetic */ b0 getValue() {
            return this.value;
        }

        public int hashCode() {
            return f(this.value);
        }

        public String toString() {
            return g(this.value);
        }
    }

    /* JADX INFO: renamed from: xw.h$c */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087@\u0018\u0000 \u00142\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0015"}, d2 = {"Lxw/h$c;", "", "Liy/b0;", "value", "c", "(Liy/b0;)Liy/b0;", "", "g", "(Liy/b0;)Ljava/lang/String;", "", "f", "(Liy/b0;)I", "other", "", "d", "(Liy/b0;Ljava/lang/Object;)Z", "a", "Liy/b0;", "getValue", "()Liy/b0;", "b", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final b0 f221642c = c(c0.g("+48"));

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final b0 value;

        /* JADX INFO: renamed from: xw.h$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lxw/h$c$a;", "", "<init>", "()V", "Lxw/h$c;", "POLISH", "Liy/b0;", "a", "()Liy/b0;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final b0 a() {
                return c.f221642c;
            }

            private Companion() {
            }
        }

        private /* synthetic */ c(b0 b0Var) {
            this.value = b0Var;
        }

        public static final /* synthetic */ c b(b0 b0Var) {
            return new c(b0Var);
        }

        public static b0 c(b0 b0Var) {
            return b0Var;
        }

        public static boolean d(b0 b0Var, Object obj) {
            return (obj instanceof c) && t.c(b0Var, ((c) obj).getValue());
        }

        public static final boolean e(b0 b0Var, b0 b0Var2) {
            return t.c(b0Var, b0Var2);
        }

        public static int f(b0 b0Var) {
            return b0Var.hashCode();
        }

        public static String g(b0 b0Var) {
            return "Prefix(value=" + b0Var + ")";
        }

        public boolean equals(Object obj) {
            return d(this.value, obj);
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final /* synthetic */ b0 getValue() {
            return this.value;
        }

        public int hashCode() {
            return f(this.value);
        }

        public String toString() {
            return g(this.value);
        }
    }

    static {
        k kVar = null;
        INSTANCE = new Companion(kVar);
        f221635e = new PhoneNumber(c.INSTANCE.a(), b.INSTANCE.a(), kVar);
    }

    public /* synthetic */ PhoneNumber(b0 b0Var, b0 b0Var2, k kVar) {
        this(b0Var, b0Var2);
    }

    public static /* synthetic */ PhoneNumber e(PhoneNumber phoneNumber, b0 b0Var, b0 b0Var2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            b0Var = phoneNumber.prefix;
        }
        if ((i15 & 2) != 0) {
            b0Var2 = phoneNumber.number;
        }
        return phoneNumber.d(b0Var, b0Var2);
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getPrefix() {
        return this.prefix;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final b0 getNumber() {
        return this.number;
    }

    public final PhoneNumber d(b0 prefix, b0 number) {
        return new PhoneNumber(prefix, number, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!t.c(PhoneNumber.class, other != null ? other.getClass() : null)) {
            return false;
        }
        PhoneNumber phoneNumber = (PhoneNumber) other;
        return this.number.c(phoneNumber.number) && this.prefix.c(phoneNumber.prefix);
    }

    public final String f() {
        return c0.e(this.prefix) + " " + c0.e(this.number);
    }

    public final b0 g() {
        return this.number;
    }

    public final b0 h() {
        return this.prefix;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.number.getData()) * 31) + Arrays.hashCode(this.prefix.getData());
    }

    public final boolean i() {
        return (r.t0(c0.e(this.prefix)) || r.t0(c0.e(this.number))) ? false : true;
    }

    public String toString() {
        return "PhoneNumber(prefix=" + c.g(this.prefix) + ", number=" + b.g(this.number) + ")";
    }

    private PhoneNumber(b0 b0Var, b0 b0Var2) {
        this.prefix = b0Var;
        this.number = b0Var2;
    }
}
