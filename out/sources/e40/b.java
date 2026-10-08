package e40;

import androidx.compose.foundation.layout.d;
import d1.e0;
import d1.i;
import d1.r3;
import er.p;
import er.q;
import f3.j;
import f3.m;
import j70.h;
import mx.Label;
import n3.b2;
import n3.l0;
import n50.e;
import oq.i0;
import p036e4.l;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Le40/b;", "Ln50/e;", "Le40/c;", "data", "<init>", "(Le40/c;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Le40/c;", "getData", "()Le40/c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final BarCodeSingleCardData data;

    public b(BarCodeSingleCardData barCodeSingleCardData) {
        this.data = barCodeSingleCardData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        int i16;
        r rVar2;
        final b bVar = this;
        r rVarH = rVar.h(1606798679);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(bVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1606798679, i16, -1, "pl.gov.coi.common.ui.ds.custom.singlecard.barcode.BarCodeSingleCard.Content (BarCodeSingleCard.kt:25)");
            }
            m.Companion companion = m.INSTANCE;
            w0 w0VarA = e0.a(i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
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
            Label label = bVar.data.getLabel();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            h.g(null, null, label, null, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(d.i(companion, aVar.b(rVarH, i17).getSpacing50()), rVarH, 0);
            l lVarA = l.INSTANCE.a();
            m mVarH = d.h(companion, 0.0f, 1, null);
            bVar = this;
            b2 b2VarC = l0.c(bVar.data.getBarCodeImage().getBitmap());
            Label contentDescription = bVar.data.getBarCodeImage().getContentDescription();
            i1.g(b2VarC, contentDescription != null ? contentDescription.getText() : null, mVarH, null, lVarA, 0.0f, null, 0, rVarH, 24960, 232);
            rVar2 = rVarH;
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
            d5VarM.a(new p() { // from class: e40.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.d(this.f47507a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ q<e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }
}
