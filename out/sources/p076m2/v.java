package p076m2;

import e3.h;
import er.a;
import er.p;
import java.util.Set;
import oq.i0;
import p071kotlin.Metadata;
import r0.h1;
import tq.i;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001B\t\b\u0000¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H ¢\u0006\u0004\b\u000f\u0010\u0010J3\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH ¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u000eH ¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\u00020\u00072\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0010¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u001eH\u0010¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b#\u0010\u0018J\u000f\u0010%\u001a\u00020$H\u0010¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0007H\u0010¢\u0006\u0004\b'\u0010\u0003J\u000f\u0010(\u001a\u00020\u0007H\u0010¢\u0006\u0004\b(\u0010\u0003J\u0017\u0010+\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H ¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)H ¢\u0006\u0004\b-\u0010,J+\u00102\u001a\u00020\u00072\u0006\u0010*\u001a\u00020)2\u0006\u0010/\u001a\u00020.2\n\u00101\u001a\u0006\u0012\u0002\b\u000300H ¢\u0006\u0004\b2\u00103J\u0019\u00104\u001a\u0004\u0018\u00010.2\u0006\u0010*\u001a\u00020)H\u0010¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u0004H ¢\u0006\u0004\b6\u0010\u0018J\u001d\u00109\u001a\u0002082\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H&¢\u0006\u0004\b9\u0010:R\u0018\u0010?\u001a\u00060;j\u0002`<8 X \u0004¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8 X \u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020@8 X \u0004¢\u0006\u0006\u001a\u0004\bD\u0010BR\u0014\u0010G\u001a\u00020@8 X \u0004¢\u0006\u0006\u001a\u0004\bF\u0010BR\u0014\u0010I\u001a\u00020@8 X \u0004¢\u0006\u0006\u001a\u0004\bH\u0010BR\u0016\u0010M\u001a\u0004\u0018\u00010J8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bK\u0010LR\u0014\u0010Q\u001a\u00020N8&X¦\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0016\u0010\u0005\u001a\u0004\u0018\u00010R8 X \u0004¢\u0006\u0006\u001a\u0004\bS\u0010T¨\u0006U"}, d2 = {"Lm2/v;", "", "<init>", "()V", "Lm2/l0;", "composition", "Lkotlin/Function0;", "Loq/i0;", "content", "a", "(Lm2/l0;Ler/p;)V", "Lm2/e5;", "shouldPause", "Lr0/h1;", "Lm2/f4;", "b", "(Lm2/l0;Lm2/e5;Ler/p;)Lr0/h1;", "invalidScopes", "r", "(Lm2/l0;Lm2/e5;Lr0/h1;)Lr0/h1;", "scope", "u", "(Lm2/f4;)V", "o", "(Lm2/l0;)V", "", "Le3/h;", "table", "s", "(Ljava/util/Set;)V", "Lm2/r;", "composer", "t", "(Lm2/r;)V", "y", "z", "Lm2/v3;", "j", "()Lm2/v3;", "x", "d", "Lm2/s2;", "reference", "n", "(Lm2/s2;)V", "c", "Lm2/r2;", "data", "Lm2/c;", "applier", "p", "(Lm2/s2;Lm2/r2;Lm2/c;)V", "q", "(Lm2/s2;)Lm2/r2;", "v", "action", "Lm2/g;", "w", "(Ler/a;)Lm2/g;", "", "Landroidx/compose/runtime/CompositeKeyHashCode;", "h", "()J", "compositeKeyHashCode", "", "f", "()Z", "collectingParameterInformation", "g", "collectingSourceInformation", "e", "collectingCallByInformation", "m", "stackTraceEnabled", "Lm2/g0;", "l", "()Lm2/g0;", "observerHolder", "Ltq/i;", "k", "()Ltq/i;", "effectCoroutineContext", "Lm2/u;", "i", "()Lm2/u;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class v {
    public abstract void a(l0 composition, p<? super r, ? super Integer, i0> content);

    public abstract h1<f4> b(l0 composition, e5 shouldPause, p<? super r, ? super Integer, i0> content);

    public abstract void c(s2 reference);

    public void d() {
    }

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract long h();

    public abstract u i();

    public v3 j() {
        return w.f123211a;
    }

    public abstract i k();

    public g0 l() {
        return null;
    }

    public abstract boolean m();

    public abstract void n(s2 reference);

    public abstract void o(l0 composition);

    public abstract void p(s2 reference, r2 data, c<?> applier);

    public r2 q(s2 reference) {
        return null;
    }

    public abstract h1<f4> r(l0 composition, e5 shouldPause, h1<f4> invalidScopes);

    public void s(Set<h> table) {
    }

    public void t(r composer) {
    }

    public abstract void u(f4 scope);

    public abstract void v(l0 composition);

    public abstract g w(a<i0> action);

    public void x() {
    }

    public void y(r composer) {
    }

    public abstract void z(l0 composition);
}
