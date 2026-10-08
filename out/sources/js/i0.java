package js;

/* JADX INFO: loaded from: classes4.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i0 f104649a = new i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final zs.c f104650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final zs.b f104651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final zs.b f104652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final zs.b f104653e;

    static {
        zs.c cVar = new zs.c("kotlin.jvm.JvmField");
        f104650b = cVar;
        zs.b.a aVar = zs.b.f236634d;
        f104651c = aVar.c(cVar);
        f104652d = aVar.c(new zs.c("kotlin.reflect.jvm.internal.ReflectionFactoryImpl"));
        f104653e = zs.b.a.b(aVar, "kotlin/jvm/internal/RepeatableContainer", false, 2, null);
    }

    private i0() {
    }

    public static final String b(String str) {
        if (f(str)) {
            return str;
        }
        return "get" + au.a.a(str);
    }

    public static final boolean c(String str) {
        return fu.r.V(str, "get", false, 2, null) || fu.r.V(str, "is", false, 2, null);
    }

    public static final boolean d(String str) {
        return fu.r.V(str, "set", false, 2, null);
    }

    public static final String e(String str) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("set");
        sb5.append(f(str) ? str.substring(2) : au.a.a(str));
        return sb5.toString();
    }

    public static final boolean f(String str) {
        if (!fu.r.V(str, "is", false, 2, null) || str.length() == 2) {
            return false;
        }
        char cCharAt = str.charAt(2);
        return fr.t.d(97, cCharAt) > 0 || fr.t.d(cCharAt, 122) > 0;
    }

    public final zs.b a() {
        return f104653e;
    }
}
