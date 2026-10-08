package g42;

import androidx.compose.ui.graphics.Color;
import mx.Label;
import oq.p;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import vr0.BEUserCard;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lg42/k;", "Lg42/j;", "Lmx/c;", "labelProvider", "Lez/e;", "dateFormatter", "<init>", "(Lmx/c;Lez/e;)V", "Lvr0/p;", "card", "Lmx/a;", "b", "(Lvr0/p;)Lmx/a;", "", "d", "(Lvr0/p;)I", "Landroidx/compose/ui/graphics/Color;", "e", "(Lvr0/p;Lm2/r;I)J", "Ld40/j;", "a", "(Lvr0/p;)Ld40/j;", "", "cardNumber", "c", "(Ljava/lang/String;)Lmx/a;", "f", "Lmx/c;", "Lez/e;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class k implements j {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f70519d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ez.e dateFormatter;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70522a;

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
            f70522a = iArr;
        }
    }

    public k(mx.c cVar, ez.e eVar) {
        this.labelProvider = cVar;
        this.dateFormatter = eVar;
    }

    @Override // g42.j
    public d40.j a(BEUserCard card) {
        if (b.f70522a[card.getCardBrand().ordinal()] != 3 && !card.getActive()) {
            return d40.j.DISABLED;
        }
        return d40.j.ENABLED;
    }

    @Override // g42.j
    public Label b(BEUserCard card) {
        if (!card.getActive()) {
            return this.labelProvider.c(t32.b.I);
        }
        return this.labelProvider.c(t32.b.U).o(Label.INSTANCE.d()).o(mx.b.b(this.dateFormatter.d(new fz.b.LocalDate(card.getActiveUntil()), fz.c.SLASHED_MONTH_YEAR), "expirationDate"));
    }

    @Override // g42.j
    public Label c(String cardNumber) {
        return mx.b.b(dz.e.g(cardNumber, 4, Label.INSTANCE.d().getText()), "cardNumber");
    }

    @Override // g42.j
    public int d(BEUserCard card) {
        int i15 = b.f70522a[card.getCardBrand().ordinal()];
        if (i15 == 1) {
            return t32.a.f187432b;
        }
        if (i15 == 2) {
            return t32.a.f187431a;
        }
        if (i15 == 3) {
            return jz.a.C;
        }
        throw new p();
    }

    @Override // g42.j
    public long e(BEUserCard bEUserCard, r rVar, int i15) {
        long jH;
        rVar.X(54114409);
        if (t.k()) {
            t.o(54114409, i15, -1, "pl.gov.coi.mobywatel.feature.epayments.presentation.common.PaymentsCardsHelperImpl.getCardIconColor (PaymentsCardsHelper.kt:54)");
        }
        if (b.f70522a[bEUserCard.getCardBrand().ordinal()] != 3) {
            jH = Color.INSTANCE.h();
        } else if (bEUserCard.getActive()) {
            rVar.X(1509745033);
            jH = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            rVar.R();
        } else {
            rVar.X(1509798570);
            jH = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().k();
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return jH;
    }

    @Override // g42.j
    public Label f(String cardNumber) {
        return c70.a.f23835a.a().e0(cardNumber.substring(cardNumber.length() - Math.min(4, cardNumber.length()))).n("cardNumberAccessibilityDescription");
    }
}
