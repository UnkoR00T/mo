package n50;

import androidx.compose.ui.graphics.Color;
import h30.ButtonData;
import i30.ButtonIconData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ln50/x0;", "", "a", "d", "b", "c", "Ln50/x0$a;", "Ln50/x0$b;", "Ln50/x0$c;", "Ln50/x0$d;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface x0 {

    /* JADX INFO: renamed from: n50.x0$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln50/x0$a;", "Ln50/x0;", "Lh30/a;", "buttonData", "<init>", "(Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lh30/a;", "()Lh30/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Button implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        public Button(ButtonData buttonData) {
            this.buttonData = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getButtonData() {
            return this.buttonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Button) && fr.t.c(this.buttonData, ((Button) other).buttonData);
        }

        public int hashCode() {
            return this.buttonData.hashCode();
        }

        public String toString() {
            return "Button(buttonData=" + this.buttonData + ')';
        }
    }

    /* JADX INFO: renamed from: n50.x0$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 \u00142\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"Ln50/x0$c;", "Ln50/x0;", "Li30/a;", "data", "<init>", "(Li30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li30/a;", "()Li30/a;", "b", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconButton implements x0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f132147c = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonIconData data;

        /* JADX INFO: renamed from: n50.x0$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J#\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ln50/x0$c$a;", "", "<init>", "()V", "Lmx/a;", "contentDescription", "Lkotlin/Function0;", "Loq/i0;", "onClick", "Ln50/x0$c;", "a", "(Lmx/a;Ler/a;)Ln50/x0$c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: n50.x0$c$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class C3277a implements er.p<p076m2.r, Integer, Color> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final C3277a f132149a = new C3277a();

                C3277a() {
                }

                @Override // er.p
                public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                    return Color.m0boximpl(c(rVar, num.intValue()));
                }

                public final long c(p076m2.r rVar, int i15) {
                    rVar.X(1708700375);
                    if (p076m2.t.k()) {
                        p076m2.t.o(1708700375, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.TrailingSection.IconButton.Companion.trashBin.<anonymous> (SingleCardData.kt:203)");
                    }
                    long jG = k70.a.f108864a.a(rVar, k70.a.f108865b).getSupport().g();
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    rVar.R();
                    return jG;
                }
            }

            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final IconButton a(Label contentDescription, er.a<oq.i0> onClick) {
                return new IconButton(new ButtonIconData(null, jz.a.f106727a, C3277a.f132149a, null, contentDescription, onClick, 9, null));
            }

            private Companion() {
            }
        }

        public IconButton(ButtonIconData aVar) {
            this.data = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonIconData getData() {
            return this.data;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IconButton) && fr.t.c(this.data, ((IconButton) other).data);
        }

        public int hashCode() {
            return this.data.hashCode();
        }

        public String toString() {
            return "IconButton(data=" + this.data + ')';
        }
    }

    /* JADX INFO: renamed from: n50.x0$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ln50/x0$d;", "Ln50/x0;", "Ls50/a$a;", "switchData", "<init>", "(Ls50/a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ls50/a$a;", "()Ls50/a$a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Switch implements x0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final s50.a.C4550a switchData;

        public Switch(s50.a.C4550a c4550a) {
            this.switchData = c4550a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final s50.a.C4550a getSwitchData() {
            return this.switchData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Switch) && fr.t.c(this.switchData, ((Switch) other).switchData);
        }

        public int hashCode() {
            return this.switchData.hashCode();
        }

        public String toString() {
            return "Switch(switchData=" + this.switchData + ')';
        }
    }

    /* JADX INFO: renamed from: n50.x0$b, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001aB-\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Ln50/x0$b;", "Ln50/x0;", "", "iconResId", "Lmx/a;", "contentDescription", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "iconColor", "<init>", "(ILmx/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "e", "b", "Lmx/a;", "c", "()Lmx/a;", "Ler/p;", "d", "()Ler/p;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Icon implements x0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Icon f132139e = new Icon(jz.a.V, null, null, 6, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Icon f132140f = new Icon(jz.a.T1, 0 == true ? 1 : 0, C3276b.f132145a, 2, null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int iconResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<p076m2.r, Integer, Color> iconColor;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: n50.x0$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f132144a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(-1925576264);
                if (p076m2.t.k()) {
                    p076m2.t.o(-1925576264, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.TrailingSection.Icon.<init>.<anonymous> (SingleCardData.kt:182)");
                }
                long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jB;
            }
        }

        /* JADX INFO: renamed from: n50.x0$b$b, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C3276b implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C3276b f132145a = new C3276b();

            C3276b() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(-707371438);
                if (p076m2.t.k()) {
                    p076m2.t.o(-707371438, i15, -1, "pl.gov.coi.common.ui.ds.singlecard.TrailingSection.Icon.Companion.CHECK_MARK.<anonymous> (SingleCardData.kt:188)");
                }
                long jC = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().c();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jC;
            }
        }

        /* JADX INFO: renamed from: n50.x0$b$c, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Ln50/x0$b$c;", "", "<init>", "()V", "Ln50/x0$b;", "CHEVRON", "Ln50/x0$b;", "b", "()Ln50/x0$b;", "CHECK_MARK", "a", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(fr.k kVar) {
                this();
            }

            public final Icon a() {
                return Icon.f132140f;
            }

            public final Icon b() {
                return Icon.f132139e;
            }

            private Companion() {
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Icon(int i15, Label label, er.p<? super p076m2.r, ? super Integer, Color> pVar) {
            this.iconResId = i15;
            this.contentDescription = label;
            this.iconColor = pVar;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getContentDescription() {
            return this.contentDescription;
        }

        public final er.p<p076m2.r, Integer, Color> d() {
            return this.iconColor;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Icon)) {
                return false;
            }
            Icon icon = (Icon) other;
            return this.iconResId == icon.iconResId && fr.t.c(this.contentDescription, icon.contentDescription) && fr.t.c(this.iconColor, icon.iconColor);
        }

        public int hashCode() {
            int iHashCode = Integer.hashCode(this.iconResId) * 31;
            Label label = this.contentDescription;
            return ((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.iconColor.hashCode();
        }

        public String toString() {
            return "Icon(iconResId=" + this.iconResId + ", contentDescription=" + this.contentDescription + ", iconColor=" + this.iconColor + ')';
        }

        public /* synthetic */ Icon(int i15, Label label, er.p pVar, int i16, fr.k kVar) {
            this(i15, (i16 & 2) != 0 ? null : label, (i16 & 4) != 0 ? a.f132144a : pVar);
        }
    }
}
