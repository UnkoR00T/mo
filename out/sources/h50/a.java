package h50;

import androidx.compose.ui.graphics.Color;
import d40.i;
import er.p;
import h30.ButtonData;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0007\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0004¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001b\u0010\u0019R\u0017\u0010\n\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001d\u0010\u0019R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\"\u0010!R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010'\u001a\u00020$8\u0006¢\u0006\f\n\u0004\b#\u0010%\u001a\u0004\b\u0016\u0010&R\u0017\u0010+\u001a\u00020(8\u0006¢\u0006\f\n\u0004\b\u0018\u0010)\u001a\u0004\b\u001e\u0010*¨\u0006,"}, d2 = {"Lh50/a;", "", "", "iconRes", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "Lmx/a;", "title", "dataTitle1", "data1", "dataTitle2", "data2", "Lh30/a;", "primaryButton", "secondaryButton", "tertiaryButton", "closeIconContentDescription", "Loq/i0;", "closeAction", "<init>", "(ILer/p;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lh30/a;Lh30/a;Lh30/a;Lmx/a;Ler/a;)V", "a", "Lmx/a;", "j", "()Lmx/a;", "b", "d", "c", "e", "f", "Lh30/a;", "g", "()Lh30/a;", "h", "i", "Li30/a;", "Li30/a;", "()Li30/a;", "closeIconButtonData", "Ld40/b;", "Ld40/b;", "()Ld40/b;", "iconData", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f80999k = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Label dataTitle1;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Label data1;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Label dataTitle2;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Label data2;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ButtonData primaryButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ButtonData secondaryButton;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ButtonData tertiaryButton;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final ButtonIconData closeIconButtonData;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final d40.b iconData;

    /* JADX INFO: renamed from: h50.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C1863a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C1863a f81010a = new C1863a();

        C1863a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-412377677);
            if (t.k()) {
                t.o(-412377677, i15, -1, "pl.gov.coi.common.ui.ds.resultmodal.ResultModalData.closeIconButtonData.<anonymous> (ResultModalData.kt:28)");
            }
            long jI = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().i();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jI;
        }
    }

    public a(int i15, p<? super r, ? super Integer, Color> pVar, Label label, Label label2, Label label3, Label label4, Label label5, ButtonData buttonData, ButtonData buttonData2, ButtonData buttonData3, Label label6, er.a<i0> aVar) {
        this.title = label;
        this.dataTitle1 = label2;
        this.data1 = label3;
        this.dataTitle2 = label4;
        this.data2 = label5;
        this.primaryButton = buttonData;
        this.secondaryButton = buttonData2;
        this.tertiaryButton = buttonData3;
        this.closeIconButtonData = new ButtonIconData(null, jz.a.Y, C1863a.f81010a, null, label6, aVar, 9, null);
        this.iconData = new d40.b.C0864b(null, i15, i.j.f39713e, pVar, null, null, 33, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ButtonIconData getCloseIconButtonData() {
        return this.closeIconButtonData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getData1() {
        return this.data1;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getData2() {
        return this.data2;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getDataTitle1() {
        return this.dataTitle1;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getDataTitle2() {
        return this.dataTitle2;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final d40.b getIconData() {
        return this.iconData;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final ButtonData getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ButtonData getSecondaryButton() {
        return this.secondaryButton;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final ButtonData getTertiaryButton() {
        return this.tertiaryButton;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }
}
