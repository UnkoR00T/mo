package p079n1;

import c5.b;
import c5.t;
import er.a;
import er.l;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.k0;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import v4.TransformedText;

/* JADX INFO: renamed from: n1.a3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0082\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u0013\u001a\u00020\u0012*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Ln1/a3;", "Le4/k0;", "Ln1/a6;", "scrollerPosition", "", "cursorOffset", "Lv4/c1;", "transformedText", "Lkotlin/Function0;", "Ln1/k6;", "textLayoutResultProvider", "<init>", "(Ln1/a6;ILv4/c1;Ler/a;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Ln1/a6;", "getScrollerPosition", "()Ln1/a6;", "e", "I", "getCursorOffset", "f", "Lv4/c1;", "getTransformedText", "()Lv4/c1;", "g", "Ler/a;", "getTextLayoutResultProvider", "()Ler/a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class HorizontalScrollLayoutModifier implements k0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final a6 scrollerPosition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int cursorOffset;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TransformedText transformedText;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final a<k6> textLayoutResultProvider;

    public HorizontalScrollLayoutModifier(a6 a6Var, int i15, TransformedText transformedText, a<k6> aVar) {
        this.scrollerPosition = a6Var;
        this.cursorOffset = i15;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(HorizontalScrollLayoutModifier horizontalScrollLayoutModifier, y0 y0Var, a2 a2Var, int i15, a2.a aVar) {
        int i16 = horizontalScrollLayoutModifier.cursorOffset;
        TransformedText transformedText = horizontalScrollLayoutModifier.transformedText;
        k6 k6VarA = horizontalScrollLayoutModifier.textLayoutResultProvider.a();
        horizontalScrollLayoutModifier.scrollerPosition.o(p143z0.a2.Horizontal, u5.e(aVar, i16, transformedText, k6VarA != null ? k6VarA.getValue() : null, y0Var.getLayoutDirection() == t.Rtl, a2Var.getWidth()), i15, a2Var.getWidth());
        a2.a.I(aVar, a2Var, Math.round(-horizontalScrollLayoutModifier.scrollerPosition.h()), 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // p036e4.k0
    public x0 c(final y0 y0Var, v0 v0Var, long j15) {
        long j16;
        if (v0Var.m0(b.k(j15)) < b.l(j15)) {
            j16 = j15;
        } else {
            j16 = j15;
            j15 = b.d(j16, 0, Integer.MAX_VALUE, 0, 0, 13, null);
        }
        final a2 a2VarO0 = v0Var.o0(j15);
        final int iMin = Math.min(a2VarO0.getWidth(), b.l(j16));
        return y0.j2(y0Var, iMin, a2VarO0.getHeight(), null, new l() { // from class: n1.z2
            @Override // er.l
            public final Object b(Object obj) {
                return HorizontalScrollLayoutModifier.l(this.f130572a, y0Var, a2VarO0, iMin, (a2.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HorizontalScrollLayoutModifier)) {
            return false;
        }
        HorizontalScrollLayoutModifier horizontalScrollLayoutModifier = (HorizontalScrollLayoutModifier) other;
        return fr.t.c(this.scrollerPosition, horizontalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == horizontalScrollLayoutModifier.cursorOffset && fr.t.c(this.transformedText, horizontalScrollLayoutModifier.transformedText) && fr.t.c(this.textLayoutResultProvider, horizontalScrollLayoutModifier.textLayoutResultProvider);
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + Integer.hashCode(this.cursorOffset)) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    public String toString() {
        return "HorizontalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
