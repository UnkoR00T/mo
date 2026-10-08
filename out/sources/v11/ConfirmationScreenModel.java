package v11;

import androidx.compose.ui.graphics.Color;
import er.p;
import h30.ButtonData;
import l60.KeyValueData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: renamed from: v11.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0006\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010%\u001a\u0004\b \u0010&R\u001a\u0010(\u001a\u00020\u00118\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b\u0018\u0010\u0013R \u0010,\u001a\b\u0012\u0004\u0012\u00020)0\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010*\u001a\u0004\b\u001c\u0010+¨\u0006-"}, d2 = {"Lv11/a;", "", "Lmx/a;", "title", "Ll60/c;", "primaryKeyValue", "secondaryKeyValue", "Lh30/a;", "primaryButton", "Lkotlin/Function0;", "Loq/i0;", "onCloseClick", "<init>", "(Lmx/a;Ll60/c;Ll60/c;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "g", "()Lmx/a;", "b", "Ll60/c;", "e", "()Ll60/c;", "c", "f", "d", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "I", "icon", "Landroidx/compose/ui/graphics/Color;", "Ler/p;", "()Ler/p;", "iconTint", "certificates_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ConfirmationScreenModel {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f203015h = KeyValueData.f116329d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final KeyValueData primaryKeyValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final KeyValueData secondaryKeyValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final ButtonData primaryButton;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onCloseClick;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int icon = jz.a.f106738b2;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p<r, Integer, Color> iconTint = C5277a.f203023a;

    /* JADX INFO: renamed from: v11.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C5277a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C5277a f203023a = new C5277a();

        C5277a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(-2048715671);
            if (t.k()) {
                t.o(-2048715671, i15, -1, "pl.gov.coi.mobywatel.feature.certificates.presentation.screens.confirmation.model.ConfirmationScreenModel.iconTint.<anonymous> (ConfirmationScreenModel.kt:19)");
            }
            long jD = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().d();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jD;
        }
    }

    public ConfirmationScreenModel(Label label, KeyValueData keyValueData, KeyValueData keyValueData2, ButtonData buttonData, er.a<i0> aVar) {
        this.title = label;
        this.primaryKeyValue = keyValueData;
        this.secondaryKeyValue = keyValueData2;
        this.primaryButton = buttonData;
        this.onCloseClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public int getIcon() {
        return this.icon;
    }

    public p<r, Integer, Color> b() {
        return this.iconTint;
    }

    public er.a<i0> c() {
        return this.onCloseClick;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public ButtonData getPrimaryButton() {
        return this.primaryButton;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public KeyValueData getPrimaryKeyValue() {
        return this.primaryKeyValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConfirmationScreenModel)) {
            return false;
        }
        ConfirmationScreenModel confirmationScreenModel = (ConfirmationScreenModel) other;
        return fr.t.c(this.title, confirmationScreenModel.title) && fr.t.c(this.primaryKeyValue, confirmationScreenModel.primaryKeyValue) && fr.t.c(this.secondaryKeyValue, confirmationScreenModel.secondaryKeyValue) && fr.t.c(this.primaryButton, confirmationScreenModel.primaryButton) && fr.t.c(this.onCloseClick, confirmationScreenModel.onCloseClick);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public KeyValueData getSecondaryKeyValue() {
        return this.secondaryKeyValue;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public Label getTitle() {
        return this.title;
    }

    public int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.primaryKeyValue.hashCode()) * 31) + this.secondaryKeyValue.hashCode()) * 31) + this.primaryButton.hashCode()) * 31) + this.onCloseClick.hashCode();
    }

    public String toString() {
        return "ConfirmationScreenModel(title=" + this.title + ", primaryKeyValue=" + this.primaryKeyValue + ", secondaryKeyValue=" + this.secondaryKeyValue + ", primaryButton=" + this.primaryButton + ", onCloseClick=" + this.onCloseClick + ')';
    }
}
