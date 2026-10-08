package d24;

import fr.t;
import java.util.Date;
import mx.Label;
import mx.c;
import oq.i0;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Ld24/b;", "Lv20/a;", "Lmx/c;", "labelProvider", "Lez/b;", "dateCalculator", "<init>", "(Lmx/c;Lez/b;)V", "Lv20/a$a;", "params", "Lc30/b$b;", "e", "(Lv20/a$a;)Lc30/b$b;", "a", "Lmx/c;", "b", "Lez/b;", "c", "common_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements v20.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.b dateCalculator;

    public b(c cVar, ez.b bVar) {
        this.labelProvider = cVar;
        this.dateCalculator = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(v20.a.Params params) {
        params.c().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c30.b.C0606b b(final v20.a.Params params) {
        Label labelE;
        c30.a.ButtonText buttonText;
        Date date = params.getDate();
        c30.a.ButtonText buttonText2 = null;
        if (date != null) {
            long jE = this.dateCalculator.e(date);
            if (jE < 0) {
                labelE = this.labelProvider.c(params.getTitleAfterExpirationDate());
            } else if (jE == 0) {
                labelE = this.labelProvider.c(params.getTitleOneDayBeforeExpirationDate());
            } else if (1 <= jE && jE < 14) {
                labelE = this.labelProvider.e(params.getTitleBeforeExpirationDate(), Long.valueOf(jE + 1));
            }
            Label label = labelE;
            Label labelC = this.labelProvider.c(params.getBannerDescription());
            er.a aVar = new er.a() { // from class: d24.a
                @Override // er.a
                public final Object a() {
                    return b.f(params);
                }
            };
            v20.a.b updateButton = params.getUpdateButton();
            if (t.c(updateButton, v20.a.b.C5289b.f203322a)) {
                buttonText = buttonText2;
            } else {
                if (updateButton instanceof v20.a.b.ShowAlways) {
                    buttonText2 = new c30.a.ButtonText(((v20.a.b.ShowAlways) updateButton).getButtonData());
                } else {
                    if (!(updateButton instanceof v20.a.b.HideAfterExpiration)) {
                        throw new p();
                    }
                    c30.a.ButtonText buttonText3 = new c30.a.ButtonText(((v20.a.b.HideAfterExpiration) updateButton).getButtonData());
                    if (jE >= 0) {
                        buttonText = buttonText3;
                    }
                }
                buttonText = buttonText2;
            }
            return new c30.b.C0606b(null, null, label, labelC, aVar, null, buttonText, 35, null);
        }
        return null;
    }
}
