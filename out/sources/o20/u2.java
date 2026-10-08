package o20;

import androidx.compose.ui.graphics.Color;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lo20/u2;", "", "a", "c", "b", "Lo20/u2$a;", "Lo20/u2$b;", "Lo20/u2$c;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface u2 {

    /* JADX INFO: renamed from: o20.u2$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lo20/u2$a;", "Lo20/u2;", "Le20/k;", "flag", "Lmx/a;", "logoFlagContentDescription", "<init>", "(Le20/k;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le20/k;", "()Le20/k;", "b", "Lmx/a;", "()Lmx/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Flag implements u2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final e20.k flag;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label logoFlagContentDescription;

        public Flag(e20.k kVar, Label label) {
            this.flag = kVar;
            this.logoFlagContentDescription = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final e20.k getFlag() {
            return this.flag;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getLogoFlagContentDescription() {
            return this.logoFlagContentDescription;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Flag)) {
                return false;
            }
            Flag flag = (Flag) other;
            return this.flag == flag.flag && fr.t.c(this.logoFlagContentDescription, flag.logoFlagContentDescription);
        }

        public int hashCode() {
            return (this.flag.hashCode() * 31) + this.logoFlagContentDescription.hashCode();
        }

        public String toString() {
            return "Flag(flag=" + this.flag + ", logoFlagContentDescription=" + this.logoFlagContentDescription + ')';
        }
    }

    /* JADX INFO: renamed from: o20.u2$c, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, d2 = {"Lo20/u2$c;", "Lo20/u2;", "", "logo", "Lmx/a;", "contentDescription", "<init>", "(ILmx/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "I", "b", "Lmx/a;", "()Lmx/a;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Logo implements u2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final int logo;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label contentDescription;

        public Logo(int i15, Label label) {
            this.logo = i15;
            this.contentDescription = label;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getContentDescription() {
            return this.contentDescription;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getLogo() {
            return this.logo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Logo)) {
                return false;
            }
            Logo logo = (Logo) other;
            return this.logo == logo.logo && fr.t.c(this.contentDescription, logo.contentDescription);
        }

        public int hashCode() {
            return (Integer.hashCode(this.logo) * 31) + this.contentDescription.hashCode();
        }

        public String toString() {
            return "Logo(logo=" + this.logo + ", contentDescription=" + this.contentDescription + ')';
        }
    }

    /* JADX INFO: renamed from: o20.u2$b, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001f\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lo20/u2$b;", "Lo20/u2;", "Lmx/a;", "emblemText", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "emblemTextColor", "<init>", "(Lmx/a;Ler/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "Ler/p;", "()Ler/p;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Hologram implements u2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label emblemText;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.p<p076m2.r, Integer, Color> emblemTextColor;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX INFO: renamed from: o20.u2$b$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a implements er.p<p076m2.r, Integer, Color> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f141025a = new a();

            a() {
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
                return Color.m0boximpl(c(rVar, num.intValue()));
            }

            public final long c(p076m2.r rVar, int i15) {
                rVar.X(-1464720470);
                if (p076m2.t.k()) {
                    p076m2.t.o(-1464720470, i15, -1, "pl.gov.coi.common.ui.document.component.MarkingsData.Hologram.<init>.<anonymous> (DocumentComponentData.kt:40)");
                }
                long jH = Color.INSTANCE.h();
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                rVar.R();
                return jH;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Hologram(Label label, er.p<? super p076m2.r, ? super Integer, Color> pVar) {
            this.emblemText = label;
            this.emblemTextColor = pVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getEmblemText() {
            return this.emblemText;
        }

        public final er.p<p076m2.r, Integer, Color> b() {
            return this.emblemTextColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Hologram)) {
                return false;
            }
            Hologram hologram = (Hologram) other;
            return fr.t.c(this.emblemText, hologram.emblemText) && fr.t.c(this.emblemTextColor, hologram.emblemTextColor);
        }

        public int hashCode() {
            return (this.emblemText.hashCode() * 31) + this.emblemTextColor.hashCode();
        }

        public String toString() {
            return "Hologram(emblemText=" + this.emblemText + ", emblemTextColor=" + this.emblemTextColor + ')';
        }

        public /* synthetic */ Hologram(Label label, er.p pVar, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? c70.a.f23835a.a().m() : label, (i15 & 2) != 0 ? a.f141025a : pVar);
        }
    }
}
