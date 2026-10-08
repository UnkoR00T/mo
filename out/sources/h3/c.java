package h3;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import n4.c0;
import n4.h0;
import p071kotlin.Metadata;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0001*\u00020\u0000H\u0002¢\u0006\u0004\b\u0005\u0010\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/semantics/SemanticsConfiguration;", "", "d", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Z", "e", "f", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean d(SemanticsConfiguration semanticsConfiguration) {
        t0<h0<?>, Object> t0VarQ = semanticsConfiguration.q();
        n4.p pVar = n4.p.f131279a;
        return t0VarQ.b(pVar.k()) || semanticsConfiguration.q().b(pVar.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(SemanticsConfiguration semanticsConfiguration) {
        return semanticsConfiguration.q().b(c0.f131174a.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(SemanticsConfiguration semanticsConfiguration) {
        t0<h0<?>, Object> t0VarQ = semanticsConfiguration.q();
        n4.p pVar = n4.p.f131279a;
        if (t0VarQ.b(pVar.k()) || semanticsConfiguration.q().b(pVar.m())) {
            return true;
        }
        t0<h0<?>, Object> t0VarQ2 = semanticsConfiguration.q();
        c0 c0Var = c0.f131174a;
        return t0VarQ2.b(c0Var.e()) || semanticsConfiguration.q().b(c0Var.c());
    }
}
