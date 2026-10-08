package d1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\t\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\r\u001a\u00020\u0004*\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0017¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ld1/q3;", "Ld1/p3;", "<init>", "()V", "Lf3/m;", "", "weight", "", "fill", "a", "(Lf3/m;FZ)Lf3/m;", "Lf3/c$c;", "alignment", "b", "(Lf3/m;Lf3/c$c;)Lf3/m;", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q3 implements p3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q3 f39261a = new q3();

    private q3() {
    }

    @Override // d1.p3
    public f3.m a(f3.m mVar, float f15, boolean z15) {
        if (!(((double) f15) > 0.0d)) {
            e1.a.a("invalid weight; must be greater than zero");
        }
        return mVar.u(new i2(lr.m.i(f15, Float.MAX_VALUE), z15));
    }

    @Override // d1.p3
    public f3.m b(f3.m mVar, f3.c.InterfaceC1317c interfaceC1317c) {
        return mVar.u(new a4(interfaceC1317c));
    }
}
