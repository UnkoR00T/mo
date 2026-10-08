package aw3;

import android.text.Spanned;
import b30.k;
import b40.g;
import er.l;
import er.p;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import q4.TextStyle;
import q4.e;
import u10.i;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Law3/b;", "Lb30/k;", "Landroid/text/Spanned;", "answer", "Lkotlin/Function1;", "", "Loq/i0;", "onClick", "<init>", "(Landroid/text/Spanned;Ler/l;)V", "a", "(Lm2/r;I)V", "Landroid/text/Spanned;", "b", "Ler/l;", "faq_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Spanned answer;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<String, i0> onClick;

    /* JADX WARN: Multi-variable type inference failed */
    public b(Spanned spanned, l<? super String, i0> lVar) {
        this.answer = spanned;
        this.onClick = lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 c(b bVar, int i15, r rVar, int i16) {
        bVar.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // b30.k
    public void a(r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1306952666);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(this) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1306952666, i16, -1, "pl.gov.coi.mobywatel.segment.faq.presentation.content.MarkdownItemAccordionContent.Content (MarkdownItemAccordionContent.kt:14)");
            }
            e eVarN = i.n(this.answer, null, rVarH, 0, 1);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            g.g(eVarN, TextStyle.e(aVar.f(rVarH, i17).b(), aVar.a(rVarH, i17).getNeutral().i(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null), false, 0, 0, null, null, this.onClick, rVarH, 0, 124);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: aw3.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return b.c(this.f14843a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
