package p079n1;

import android.content.res.Resources;
import er.l;
import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import p1.a;
import p1.c;
import q1.g;
import z1.c2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006\u001a?\u0010\u0011\u001a\u00020\u0003*\u00020\u00072\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00030\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lz1/c2;", "manager", "Lkotlin/Function0;", "Loq/i0;", "content", "b", "(Lz1/c2;Ler/p;Lm2/r;I)V", "Lp1/a;", "Landroid/content/res/Resources;", "resources", "Ln1/i4;", "item", "", "enabled", "Lkotlin/Function1;", "Lq1/g;", "onClick", "d", "(Lp1/a;Landroid/content/res/Resources;Ln1/i4;ZLer/l;)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class l1 {
    public static final void b(final c2 c2Var, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(2080741862);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(c2Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(2080741862, i16, -1, "androidx.compose.foundation.text.ContextMenuArea (ContextMenu.android.kt:33)");
            }
            x0.d(c2Var, pVar, rVarH, i16 & 126);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: n1.k1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l1.c(c2Var, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(c2 c2Var, p pVar, int i15, r rVar, int i16) {
        b(c2Var, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void d(a aVar, Resources resources, i4 i4Var, boolean z15, l<? super g, i0> lVar) {
        if (z15) {
            c.a(aVar, i4Var.getKey(), resources.getString(i4Var.getStringId()), i4Var.getDrawableId(), lVar);
        }
    }
}
