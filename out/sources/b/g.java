package b;

import o.e1;
import p071kotlin.Metadata;
import v.c3;
import v.d3;
import v.e3;
import v.g3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\b\u001a\u0004\u0018\u00018\u0000\"\n\b\u0000\u0010\u0005*\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR(\u0010\u0012\u001a\u00020\n8\u0006@\u0006X\u0087.¢\u0006\u0018\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u0011\u0010\u0003\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lb/g;", "", "<init>", "()V", "Lv/c3;", "T", "Ljava/lang/Class;", "quirkClass", "c", "(Ljava/lang/Class;)Lv/c3;", "Lv/g3;", "b", "Lv/g3;", "d", "()Lv/g3;", "e", "(Lv/g3;)V", "getAll$annotations", "all", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f15546a = new g();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static volatile g3 all;

    static {
        e3.b().c(z.a.a(), new i6.a() { // from class: b.f
            @Override // i6.a
            public final void accept(Object obj) {
                g.b((d3) obj);
            }
        });
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(d3 d3Var) {
        e(new g3(androidx.camera.camera2.compat.quirk.b.f9208a.a(d3Var)));
        e1.a("DeviceQuirks", "camera2 DeviceQuirks = " + g3.d(d()));
    }

    public static final g3 d() {
        g3 g3Var = all;
        if (g3Var != null) {
            return g3Var;
        }
        return null;
    }

    public static final void e(g3 g3Var) {
        all = g3Var;
    }

    public final <T extends c3> T c(Class<T> quirkClass) {
        return (T) d().b(quirkClass);
    }
}
