package j20;

import androidx.compose.material3.e;
import er.p;
import oq.i0;
import p046f2.g2;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lj20/b;", "", "<init>", "()V", "", "isDarkTheme", "Lkotlin/Function0;", "Loq/i0;", "content", "b", "(ZLer/p;Lm2/r;I)V", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f98651a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f98652b = 0;

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, boolean z15, p pVar, int i15, r rVar, int i16) {
        bVar.b(z15, pVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public final void b(final boolean z15, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-639217043);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.a(z15) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-639217043, i16, -1, "pl.gov.coi.common.ui.colors.MObywatelLocal.FallbackMaterialTheme (MObywatelLocal.kt:39)");
            }
            e.i(z15 ? g2.g(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null) : g2.k(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535, null), null, null, pVar, rVarH, (i16 << 6) & 7168, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: j20.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(this.f98647a, z15, pVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
