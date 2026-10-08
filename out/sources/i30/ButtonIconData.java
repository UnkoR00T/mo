package i30;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.k;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import y40.MenuData;

/* JADX INFO: renamed from: i30.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0014R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\u0019\u0010&R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010'\u001a\u0004\b$\u0010(¨\u0006)"}, d2 = {"Li30/a;", "", "", "testTag", "", "iconResId", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColorProvider", "Ly40/a;", "menuData", "Lmx/a;", "contentDescription", "Loq/i0;", "onClick", "<init>", "(Ljava/lang/String;ILer/p;Ly40/a;Lmx/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "f", "b", "I", "c", "Ler/p;", "()Ler/p;", "d", "Ly40/a;", "()Ly40/a;", "e", "Lmx/a;", "()Lmx/a;", "Ler/a;", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ButtonIconData {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f88935g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int iconResId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final p<r, Integer, Color> iconColorProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final MenuData menuData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: i30.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class C2091a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C2091a f88942a = new C2091a();

        C2091a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1388364342);
            if (t.k()) {
                t.o(1388364342, i15, -1, "pl.gov.coi.common.ui.ds.button.buttonicon.ButtonIconData.<init>.<anonymous> (ButtonIconData.kt:13)");
            }
            long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).c().c();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jC;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonIconData(String str, int i15, p<? super r, ? super Integer, Color> pVar, MenuData menuData, Label label, er.a<i0> aVar) {
        this.testTag = str;
        this.iconResId = i15;
        this.iconColorProvider = pVar;
        this.menuData = menuData;
        this.contentDescription = label;
        this.onClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    public final p<r, Integer, Color> b() {
        return this.iconColorProvider;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getIconResId() {
        return this.iconResId;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final MenuData getMenuData() {
        return this.menuData;
    }

    public final er.a<i0> e() {
        return this.onClick;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonIconData)) {
            return false;
        }
        ButtonIconData buttonIconData = (ButtonIconData) other;
        return fr.t.c(this.testTag, buttonIconData.testTag) && this.iconResId == buttonIconData.iconResId && fr.t.c(this.iconColorProvider, buttonIconData.iconColorProvider) && fr.t.c(this.menuData, buttonIconData.menuData) && fr.t.c(this.contentDescription, buttonIconData.contentDescription) && fr.t.c(this.onClick, buttonIconData.onClick);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    public int hashCode() {
        String str = this.testTag;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + Integer.hashCode(this.iconResId)) * 31) + this.iconColorProvider.hashCode()) * 31;
        MenuData menuData = this.menuData;
        return ((((iHashCode + (menuData != null ? menuData.hashCode() : 0)) * 31) + this.contentDescription.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "ButtonIconData(testTag=" + this.testTag + ", iconResId=" + this.iconResId + ", iconColorProvider=" + this.iconColorProvider + ", menuData=" + this.menuData + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
    }

    public /* synthetic */ ButtonIconData(String str, int i15, p pVar, MenuData menuData, Label label, er.a aVar, int i16, k kVar) {
        this((i16 & 1) != 0 ? null : str, i15, (i16 & 4) != 0 ? C2091a.f88942a : pVar, (i16 & 8) != 0 ? null : menuData, (i16 & 16) != 0 ? Label.INSTANCE.c() : label, aVar);
    }
}
