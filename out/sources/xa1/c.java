package xa1;

import androidx.compose.ui.graphics.Color;
import er.p;
import g70.ShortcutMoreTransferData;
import n50.BodySection;
import n50.DefaultSingleCardData;
import n50.LeadingSection;
import n50.SingleCardLabel;
import n50.i;
import n50.x0;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\n\u001a\u00020\t*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001H\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lg70/b;", "Lkotlin/Function0;", "Loq/i0;", "closeAction", "Ln50/x0;", "trailingSection", "Landroidx/compose/ui/graphics/Color;", "labelColor", "iconColor", "Ln50/g;", "c", "(Lg70/b;Ler/a;Ln50/x0;Ler/p;Ler/p;)Ln50/g;", "company_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    /* JADX INFO: Access modifiers changed from: private */
    public static final DefaultSingleCardData c(final ShortcutMoreTransferData shortcutMoreTransferData, final er.a<i0> aVar, x0 x0Var, p<? super r, ? super Integer, Color> pVar, p<? super r, ? super Integer, Color> pVar2) {
        return new DefaultSingleCardData(null, new er.a() { // from class: xa1.b
            @Override // er.a
            public final Object a() {
                return c.d(aVar, shortcutMoreTransferData);
            }
        }, false, null, null, false, null, null, new BodySection(null, new n50.b.Title(new SingleCardLabel(shortcutMoreTransferData.getTitle(), null, pVar, 0, 0, null, 58, null)), null, 5, null), new LeadingSection(false, null, new i.Icon(shortcutMoreTransferData.getIconResId(), null, pVar2, null, null, 26, null), 3, null), x0Var, null, 2301, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(er.a aVar, ShortcutMoreTransferData shortcutMoreTransferData) {
        aVar.a();
        shortcutMoreTransferData.b().a();
        return i0.f148189a;
    }
}
