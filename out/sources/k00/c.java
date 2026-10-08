package k00;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.p016lifecycle.h;
import androidx.p016lifecycle.t0;
import androidx.p016lifecycle.w0;
import androidx.p016lifecycle.y0;
import er.l;
import f00.j0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import p7.CreationExtras;
import p7.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aE\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0012\u0002\b\u00030\u0006H\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/lifecycle/t0;", "VM", "", "key", "Ljava/lang/Class;", "modelClass", "Lty/c;", "adapter", "b", "(Ljava/lang/String;Ljava/lang/Class;Lty/c;Lm2/r;I)Landroidx/lifecycle/t0;", "navigation_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final <VM extends t0> VM b(String str, Class<? extends VM> cls, final ty.c<?, ?, ?> cVar, r rVar, int i15) {
        rVar.X(-345843223);
        if (t.k()) {
            t.o(-345843223, i15, -1, "pl.gov.coi.common.navigation.segment.viewModelSegment (ViewModelSegmentExtension.kt:19)");
        }
        y0 y0VarC = q7.b.f165175a.c(rVar, q7.b.f165177c);
        if (y0VarC == null) {
            throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
        }
        if (!(y0VarC instanceof h)) {
            rVar.X(612120811);
            rVar.R();
            throw new IllegalStateException("ViewModelStoreOwner is not of type HasDefaultViewModelProviderFactory");
        }
        rVar.X(611464696);
        h hVar = (h) y0VarC;
        w0.c cVarA = i7.a.a((Context) rVar.N(AndroidCompositionLocals_androidKt.c()), hVar.w());
        rVar.X(-1642835280);
        d dVar = (d) hVar.x();
        CreationExtras.c<l<Object, t0>> cVar2 = hq.c.f86279e;
        boolean zG = rVar.G(cVar);
        Object objE = rVar.E();
        if (zG || objE == r.INSTANCE.a()) {
            objE = new l() { // from class: k00.b
                @Override // er.l
                public final Object b(Object obj) {
                    return c.c(cVar, obj);
                }
            };
            rVar.v(objE);
        }
        dVar.c(cVar2, (l) objE);
        rVar.R();
        VM vm4 = (VM) q7.d.b(cls, y0VarC, str, cVarA, dVar, rVar, ((i15 >> 3) & 14) | ((i15 << 6) & 896), 0);
        rVar.R();
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return vm4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final t0 c(ty.c cVar, Object obj) {
        return ((j0) obj).a(cVar);
    }
}
