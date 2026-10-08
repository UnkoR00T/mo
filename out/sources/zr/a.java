package zr;

import vr.w1;
import vr.x1;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f236401c = new a();

    private a() {
        super("package", false);
    }

    @Override // vr.x1
    public Integer a(x1 x1Var) {
        if (this == x1Var) {
            return 0;
        }
        return w1.f208094a.b(x1Var) ? 1 : -1;
    }

    @Override // vr.x1
    public String b() {
        return "public/*package*/";
    }

    @Override // vr.x1
    public x1 d() {
        return w1.g.f208103c;
    }
}
