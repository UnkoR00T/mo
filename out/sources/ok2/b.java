package ok2;

import androidx.compose.foundation.layout.d;
import c5.w;
import d1.i;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import fr.k;
import h30.ButtonData;
import h30.q;
import j70.h;
import mx.Label;
import n50.e;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0017¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lok2/b;", "Ln50/e;", "Lmx/a;", "info", "title", "description", "Lh30/a;", "buttonData", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Lh30/a;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Lmx/a;", "b", "c", "d", "Lh30/a;", "midcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label info;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Label description;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ButtonData buttonData;

    public b(Label label, Label label2, Label label3, ButtonData buttonData) {
        this.info = label;
        this.title = label2;
        this.description = label3;
        this.buttonData = buttonData;
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
        r rVarH = rVar.h(-1326912296);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(this) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1326912296, i16, -1, "pl.gov.coi.mobywatel.feature.midcard.presentation.components.SerialNumberSingleCardContent.Content (SerialNumberSingleCardContent.kt:28)");
            }
            c.Companion companion = c.INSTANCE;
            c.InterfaceC1317c interfaceC1317cI = companion.i();
            m.Companion companion2 = m.INSTANCE;
            i iVar = i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), interfaceC1317cI, rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion2);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarB, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            q3 q3Var = q3.f39261a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarC = p3.c(q3Var, d.h(d.b(companion2, 0.0f, aVar.b(rVarH, i17).getSpacing600(), 1, null), 0.0f, 1, null), 1.0f, false, 2, null);
            w0 w0VarA = d1.e0.a(iVar.t(aVar.b(rVarH, i17).getSpacing50(), companion.i()), companion.k(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h.g(null, null, this.info, this.info, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).d(), null, null, false, false, null, rVarH, 0, 0, 0, 33030099);
            h.g(null, null, this.title, this.title, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, TextStyle.e(aVar.f(rVarH, i17).a(), 0L, w.g(26), null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777213, null), null, null, false, false, null, rVarH, 0, 0, 0, 33030099);
            r rVar3 = rVarH;
            Label label = this.description;
            if (label == null) {
                rVar3.X(-818343332);
            } else {
                rVar3.X(-818343331);
                h.g(null, null, label, label, null, aVar.a(rVar3, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar3, i17).d(), null, null, false, false, null, rVar3, 0, 0, 0, 33030099);
                rVar3 = rVar3;
            }
            rVar3.R();
            rVar3.x();
            r3.a(d.y(companion2, aVar.b(rVar3, i17).getSpacing100()), rVar3, 0);
            q.p(this.buttonData, false, null, rVar3, 0, 6);
            rVar2 = rVar3;
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
            d5VarM.a(new p() { // from class: ok2.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.d(this.f146521a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ er.q<e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }

    public /* synthetic */ b(Label label, Label label2, Label label3, ButtonData buttonData, int i15, k kVar) {
        this(label, label2, (i15 & 4) != 0 ? null : label3, buttonData);
    }
}
