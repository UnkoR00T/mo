package zr;

import fr.t;
import vr.w1;
import vr.x1;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends x1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f236402c = new b();

    private b() {
        super("protected_and_package", true);
    }

    @Override // vr.x1
    public Integer a(x1 x1Var) {
        if (t.c(this, x1Var)) {
            return 0;
        }
        if (x1Var == w1.b.f208098c) {
            return null;
        }
        return w1.f208094a.b(x1Var) ? 1 : -1;
    }

    @Override // vr.x1
    public String b() {
        return "protected/*protected and package*/";
    }

    @Override // vr.x1
    public x1 d() {
        return w1.g.f208103c;
    }
}
