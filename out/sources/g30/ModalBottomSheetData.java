package g30;

import androidx.compose.ui.graphics.Color;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g30.n, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006#"}, d2 = {"Lg30/n;", "", "Lg30/u;", "sheetState", "Lmx/a;", "title", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "Landroidx/compose/ui/graphics/Color;", "colorProvider", "<init>", "(Lg30/u;Lmx/a;Ler/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lg30/u;", "c", "()Lg30/u;", "b", "Lmx/a;", "d", "()Lmx/a;", "Ler/a;", "()Ler/a;", "Ler/p;", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ModalBottomSheetData {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f70192e = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ModalSheetState sheetState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onCloseClick;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.p<p076m2.r, Integer, Color> colorProvider;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: g30.n$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f70197a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(541643178);
            if (p076m2.t.k()) {
                p076m2.t.o(541643178, i15, -1, "pl.gov.coi.common.ui.ds.bottomsheet.ModalBottomSheetData.<init>.<anonymous> (ModalBottomSheetData.kt:11)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().c();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return jC;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ModalBottomSheetData(ModalSheetState modalSheetState, Label label, er.a<i0> aVar, er.p<? super p076m2.r, ? super Integer, Color> pVar) {
        this.sheetState = modalSheetState;
        this.title = label;
        this.onCloseClick = aVar;
        this.colorProvider = pVar;
    }

    public final er.p<p076m2.r, Integer, Color> a() {
        return this.colorProvider;
    }

    public final er.a<i0> b() {
        return this.onCloseClick;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final ModalSheetState getSheetState() {
        return this.sheetState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ModalBottomSheetData)) {
            return false;
        }
        ModalBottomSheetData modalBottomSheetData = (ModalBottomSheetData) other;
        return fr.t.c(this.sheetState, modalBottomSheetData.sheetState) && fr.t.c(this.title, modalBottomSheetData.title) && fr.t.c(this.onCloseClick, modalBottomSheetData.onCloseClick) && fr.t.c(this.colorProvider, modalBottomSheetData.colorProvider);
    }

    public int hashCode() {
        int iHashCode = this.sheetState.hashCode() * 31;
        Label label = this.title;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        er.a<i0> aVar = this.onCloseClick;
        return ((iHashCode2 + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.colorProvider.hashCode();
    }

    public String toString() {
        return "ModalBottomSheetData(sheetState=" + this.sheetState + ", title=" + this.title + ", onCloseClick=" + this.onCloseClick + ", colorProvider=" + this.colorProvider + ')';
    }

    public /* synthetic */ ModalBottomSheetData(ModalSheetState modalSheetState, Label label, er.a aVar, er.p pVar, int i15, fr.k kVar) {
        this(modalSheetState, (i15 & 2) != 0 ? null : label, (i15 & 4) != 0 ? null : aVar, (i15 & 8) != 0 ? a.f70197a : pVar);
    }
}
