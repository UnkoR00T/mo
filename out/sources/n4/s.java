package n4;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import p071kotlin.Metadata;
import r0.q0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ln4/r;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "a", "(Ln4/r;)Landroidx/compose/ui/semantics/SemanticsConfiguration;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class s {
    public static final SemanticsConfiguration a(r rVar) {
        SemanticsConfiguration semanticsConfigurationF = rVar.f();
        if (semanticsConfigurationF != null && semanticsConfigurationF.getIsMergingSemanticsOfDescendants() && !semanticsConfigurationF.getIsClearingSemantics()) {
            semanticsConfigurationF = semanticsConfigurationF.i();
            q0 q0Var = new q0(rVar.r().size());
            q0Var.q(rVar.r());
            while (q0Var.h()) {
                r rVar2 = (r) q0Var.B(q0Var._size - 1);
                SemanticsConfiguration semanticsConfigurationF2 = rVar2.f();
                if (semanticsConfigurationF2 != null && !semanticsConfigurationF2.getIsMergingSemanticsOfDescendants()) {
                    semanticsConfigurationF.u(semanticsConfigurationF2);
                    if (!semanticsConfigurationF2.getIsClearingSemantics()) {
                        q0Var.q(rVar2.r());
                    }
                }
            }
        }
        return semanticsConfigurationF;
    }
}
