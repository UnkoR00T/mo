package bs;

import java.lang.reflect.Member;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends y implements qs.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f21229a;

    public d0(Object obj) {
        this.f21229a = obj;
    }

    @Override // bs.y
    public Member U() {
        Method methodC = a.f21210a.c(this.f21229a);
        if (methodC != null) {
            return methodC;
        }
        throw new NoSuchMethodError("Can't find `getAccessor` method");
    }

    @Override // qs.w
    public boolean a() {
        return false;
    }

    @Override // qs.w
    public qs.x getType() {
        Class<?> clsD = a.f21210a.d(this.f21229a);
        if (clsD != null) {
            return new s(clsD);
        }
        throw new NoSuchMethodError("Can't find `getType` method");
    }
}
