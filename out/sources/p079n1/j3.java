package p079n1;

import androidx.compose.ui.platform.r2;
import er.l;
import l3.g;
import l3.o;
import oq.i0;
import p071kotlin.Metadata;
import v4.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\nR\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\"\u0010\u001a\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u000e\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Ln1/j3;", "Ln1/k3;", "Landroidx/compose/ui/platform/r2;", "keyboardController", "<init>", "(Landroidx/compose/ui/platform/r2;)V", "Lv4/t;", "imeAction", "", "a", "(I)Z", "d", "Landroidx/compose/ui/platform/r2;", "Ln1/l3;", "b", "Ln1/l3;", "c", "()Ln1/l3;", "f", "(Ln1/l3;)V", "keyboardActions", "Ll3/o;", "Ll3/o;", "()Ll3/o;", "e", "(Ll3/o;)V", "focusManager", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j3 implements k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r2 keyboardController;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public l3 keyboardActions;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public o focusManager;

    public j3(r2 r2Var) {
        this.keyboardController = r2Var;
    }

    private final boolean a(int imeAction) {
        r2 r2Var;
        t.Companion companion = t.INSTANCE;
        if (t.m(imeAction, companion.d())) {
            b().h(g.INSTANCE.e());
            return true;
        }
        if (t.m(imeAction, companion.f())) {
            b().h(g.INSTANCE.f());
            return true;
        }
        if (!t.m(imeAction, companion.b()) || (r2Var = this.keyboardController) == null) {
            return false;
        }
        r2Var.c();
        return true;
    }

    public final o b() {
        o oVar = this.focusManager;
        if (oVar != null) {
            return oVar;
        }
        return null;
    }

    public final l3 c() {
        l3 l3Var = this.keyboardActions;
        if (l3Var != null) {
            return l3Var;
        }
        return null;
    }

    public final boolean d(int imeAction) {
        l<k3, i0> lVarG;
        t.Companion companion = t.INSTANCE;
        if (t.m(imeAction, companion.b())) {
            lVarG = c().b();
        } else if (t.m(imeAction, companion.c())) {
            lVarG = c().c();
        } else if (t.m(imeAction, companion.d())) {
            lVarG = c().d();
        } else if (t.m(imeAction, companion.f())) {
            lVarG = c().e();
        } else if (t.m(imeAction, companion.g())) {
            lVarG = c().f();
        } else if (t.m(imeAction, companion.h())) {
            lVarG = c().g();
        } else {
            if (!t.m(imeAction, companion.a()) && !t.m(imeAction, companion.e())) {
                throw new IllegalStateException("invalid ImeAction");
            }
            lVarG = null;
        }
        if (lVarG == null) {
            return a(imeAction);
        }
        lVarG.b(this);
        return true;
    }

    public final void e(o oVar) {
        this.focusManager = oVar;
    }

    public final void f(l3 l3Var) {
        this.keyboardActions = l3Var;
    }
}
