package aw3;

import b30.k;
import er.p;
import f3.m;
import j70.h;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\t¨\u0006\n"}, d2 = {"Law3/d;", "Lb30/k;", "Lmx/a;", "answer", "<init>", "(Lmx/a;)V", "Loq/i0;", "a", "(Lm2/r;I)V", "Lmx/a;", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label answer;

    public d(Label label) {
        this.answer = label;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(d dVar, int i15, r rVar, int i16) {
        dVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // b30.k
    public void a(r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(2110853854);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(2110853854, i16, -1, "pl.gov.coi.mobywatel.segment.faq.presentation.content.TextItemAccordionContent.Content (TextItemAccordionContent.kt:14)");
            }
            Label label = this.answer;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            rVar2 = rVarH;
            h.g(androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null), null, label, null, null, aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVar2, 6, 0, 0, 33030106);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: aw3.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d.c(this.f14847a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
