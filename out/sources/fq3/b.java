package fq3;

import androidx.compose.foundation.layout.d;
import b30.k;
import d1.e0;
import d1.i;
import d1.r3;
import er.p;
import f3.c;
import f3.j;
import f3.m;
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
import s40.g;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lfq3/b;", "Lb30/k;", "Lmx/a;", "contentTitle", "contentDescription", "Lt40/b;", "infoRowListData", "<init>", "(Lmx/a;Lmx/a;Lt40/b;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Lmx/a;", "b", "c", "Lt40/b;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements k {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f66372d = InfoRowListData.f187643b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label contentTitle;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label contentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final InfoRowListData infoRowListData;

    public b(Label label, Label label2, InfoRowListData infoRowListData) {
        this.contentTitle = label;
        this.contentDescription = label2;
        this.infoRowListData = infoRowListData;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // b30.k
    public void a(r rVar, final int i15) {
        int i16;
        final b bVar;
        r rVarH = rVar.h(-1615706349);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(this) : rVarH.G(this) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1615706349, i16, -1, "pl.gov.coi.mobywatel.feature.voteidea.presentation.screens.voteidearoundsinfo.content.VoteIdeaRoundAccordionContent.Content (VoteIdeaRoundAccordionContent.kt:20)");
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
            Label label = this.contentTitle;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            h.g(null, null, label, null, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            r3.a(d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            h.g(null, null, this.contentDescription, null, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
            rVarH = rVarH;
            r3.a(d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
            bVar = this;
            g.c(bVar.infoRowListData, aVar.b(rVarH, i17).getSpacing100(), rVarH, InfoRowListData.f187643b, 0);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            bVar = this;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: fq3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(this.f66370a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
