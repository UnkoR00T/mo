package yx3;

import androidx.compose.ui.graphics.Color;
import d40.j;
import ez.e;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lyx3/c;", "Lyx3/b;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lvr0/p;", "card", "Lmx/a;", "b", "(Lvr0/p;)Lmx/a;", "", "d", "(Lvr0/p;)I", "Landroidx/compose/ui/graphics/Color;", "e", "(Lvr0/p;Lm2/r;I)J", "Ld40/j;", "a", "(Lvr0/p;)Ld40/j;", "", "cardNumber", "c", "(Ljava/lang/String;)Lmx/a;", "f", "Lmx/c;", "Lez/e;", "makepayment_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements yx3.b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f230636d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e dateFormatter;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f230639a;

        static {
            int[] iArr = new int[vr0.a.values().length];
            try {
                iArr[vr0.a.VIS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vr0.a.MCI.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vr0.a.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f230639a = iArr;
        }
    }

    public c(mx.c cVar, e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    @Override // yx3.b
    public j a(BEUserCard card) {
        if (b.f230639a[card.getCardBrand().ordinal()] != 3 && !card.getActive()) {
            return j.DISABLED;
        }
        return j.ENABLED;
    }

    @Override // yx3.b
    public Label b(BEUserCard card) {
        if (!card.getActive()) {
            return this.labelProvider.c(px3.b.f163147u);
        }
        return this.labelProvider.c(px3.b.D).o(Label.INSTANCE.d()).o(mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(card.getActiveUntil()), fz.c.SLASHED_MONTH_YEAR), "expirationDate"));
    }

    @Override // yx3.b
    public Label c(String cardNumber) {
        return mx.b.b(dz.e.g(cardNumber, 4, Label.INSTANCE.d().getText()), "cardNumber");
    }

    @Override // yx3.b
    public int d(BEUserCard card) {
        int i15 = b.f230639a[card.getCardBrand().ordinal()];
        if (i15 == 1) {
            return px3.a.f163116f;
        }
        if (i15 == 2) {
            return px3.a.f163113c;
        }
        if (i15 == 3) {
            return jz.a.C;
        }
        throw new p();
    }

    @Override // yx3.b
    public long e(BEUserCard bEUserCard, r rVar, int i15) {
        long jH;
        rVar.X(-1285183120);
        if (t.k()) {
            t.o(-1285183120, i15, -1, "pl.gov.coi.mobywatel.segment.makepayment.presentation.screens.PaymentsCardsHelperImpl.getCardIconColor (PaymentsCardsHelper.kt:55)");
        }
        if (b.f230639a[bEUserCard.getCardBrand().ordinal()] != 3) {
            jH = Color.INSTANCE.h();
        } else if (bEUserCard.getActive()) {
            rVar.X(-1551728862);
            jH = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            rVar.R();
        } else {
            rVar.X(-1551675325);
            jH = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return jH;
    }

    @Override // yx3.b
    public Label f(String cardNumber) {
        return c70.a.f23835a.a().e0(cardNumber.substring(cardNumber.length() - Math.min(4, cardNumber.length()))).n("cardNumberAccessibilityDescription");
    }
}
