package androidx.camera.core.internal.compat.quirk;

import o.e1;
import v.c3;
import v.d3;
import v.e3;
import v.g3;

/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile g3 f9272a;

    static {
        e3.b().c(z.a.a(), new i6.a() { // from class: d0.b
            @Override // i6.a
            public final void accept(Object obj) {
                androidx.camera.core.internal.compat.quirk.a.a((d3) obj);
            }
        });
    }

    public static /* synthetic */ void a(d3 d3Var) {
        f9272a = new g3(b.a(d3Var));
        e1.a("DeviceQuirks", "core DeviceQuirks = " + g3.d(f9272a));
    }

    public static <T extends c3> T b(Class<T> cls) {
        return (T) f9272a.b(cls);
    }

    public static g3 c() {
        return f9272a;
    }
}
