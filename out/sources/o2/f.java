package o2;

import oq.i0;
import p071kotlin.Metadata;
import p076m2.f4;
import p076m2.n;
import p076m2.t;
import p076m2.v4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0018\u0010\u0016¨\u0006\u0019"}, d2 = {"Lo2/f;", "Lo2/e;", "<init>", "()V", "Loq/i0;", "i", "Lm2/v4;", "instance", "b", "(Lm2/v4;)V", "c", "Lkotlin/Function0;", "effect", "g", "(Ler/a;)V", "Lm2/n;", "e", "(Lm2/n;)V", "a", "Lm2/f4;", "scope", "d", "(Lm2/f4;)V", "h", "f", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f140683a = new f();

    private f() {
    }

    private final void i() {
        t.b("ChangeList cannot call the RememberManager when executing pending changes outside of the applier phase.");
    }

    @Override // o2.e
    public void a(n instance) {
        i();
    }

    @Override // o2.e
    public void b(v4 instance) {
        i();
    }

    @Override // o2.e
    public void c(v4 instance) {
        i();
    }

    @Override // o2.e
    public void d(f4 scope) {
        i();
    }

    @Override // o2.e
    public void e(n instance) {
        i();
    }

    @Override // o2.e
    public void f(f4 scope) {
        i();
    }

    @Override // o2.e
    public void g(er.a<i0> effect) {
        i();
    }

    @Override // o2.e
    public void h(f4 scope) {
        i();
    }
}
