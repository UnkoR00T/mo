package fh1;

import er.p;
import mx.Label;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.l;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a]\u0010\u000f\u001a\u00020\u000e*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00032\u0006\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lji1/c;", "", "testTag", "Lkotlin/Function2;", "Lgx/b;", "Lrq0/c;", "Loq/i0;", "onServiceClick", "serviceType", "", "showIcon", "Lmx/a;", "contentDescription", "description", "Ln50/g;", "b", "(Lji1/c;Ljava/lang/String;Ler/p;Lrq0/c;ZLmx/a;Lmx/a;)Ln50/g;", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final DefaultSingleCardData b(final ji1.c cVar, String str, final p<? super gx.b, ? super rq0.c, i0> pVar, final rq0.c cVar2, boolean z15, Label label, Label label2) {
        return new DefaultSingleCardData(str, new er.a() { // from class: fh1.b
            @Override // er.a
            public final Object a() {
                return c.d(cVar, pVar, cVar2);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(mx.b.b(cVar.getTitle(), "bodySectionTitle"), label, null, 0, 0, j70.a.NORMAL, 28, null)), label2 != null ? l.b(label2, null, null, 3, null) : null, 1, null), z15 ? new LeadingSection(false, null, new i.Icon(cVar.getIconRes(), null, cVar.a(), null, null, 26, null), 3, null) : null, new x0.Icon(jz.a.V, null, null, 6, null), null, 2300, null);
    }

    public static /* synthetic */ DefaultSingleCardData c(ji1.c cVar, String str, p pVar, rq0.c cVar2, boolean z15, Label label, Label label2, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            z15 = true;
        }
        return b(cVar, str, pVar, cVar2, z15, (i15 & 16) != 0 ? null : label, (i15 & 32) != 0 ? null : label2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(ji1.c cVar, p pVar, rq0.c cVar2) {
        gx.b navigationEvent = cVar.getNavigationEvent();
        if (navigationEvent != null) {
            pVar.B(navigationEvent, cVar2);
        }
        return i0.f148189a;
    }
}
