package bs;

import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
class p implements er.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f21255a;

    public p(q qVar) {
        this.f21255a = qVar;
    }

    @Override // er.l
    public Object b(Object obj) {
        return Boolean.valueOf(q.V(this.f21255a, (Method) obj));
    }
}
