package ew2;

import androidx.compose.foundation.layout.d;
import b30.k;
import d1.e0;
import d1.i;
import d1.r3;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import j30.ButtonTextData;
import j30.f;
import j70.h;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000bR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lew2/b;", "Lb30/k;", "Lmx/a;", "answer", "Lj30/a;", "buttonData", "<init>", "(Lmx/a;Lj30/a;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Lmx/a;", "b", "Lj30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f53891c = ButtonTextData.f99099f;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label answer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ButtonTextData buttonData;

    public b(Label label, ButtonTextData buttonTextData) {
        this.answer = label;
        this.buttonData = buttonTextData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // b30.k
    public void a(r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(1041693971);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(this) : rVarH.G(this) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1041693971, i16, -1, "pl.gov.coi.mobywatel.feature.physicalidcardapplication.presentation.faq.content.FaqAccordionContent.Content (FaqAccordionContent.kt:20)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(i.f39152a.k(), c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label label = this.answer;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            h.g(d.h(companion, 0.0f, 1, null), null, label, null, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 6, 0, 0, 33030106);
            ButtonTextData buttonTextData = this.buttonData;
            if (buttonTextData == null) {
                rVarH.X(-1383297170);
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(-1383297169);
                r3.a(d.i(companion, aVar.b(rVarH, i17).getSpacing250()), rVarH, 0);
                f.e(null, buttonTextData, false, rVarH, ButtonTextData.f99099f << 3, 5);
                rVar2 = rVarH;
                rVar2.R();
            }
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: ew2.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(this.f53889a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
