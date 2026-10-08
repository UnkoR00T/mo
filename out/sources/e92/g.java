package e92;

import h30.ButtonData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Le92/g;", "Ll00/e;", "Le92/g$a;", "a", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: e92.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bBC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010#\u001a\u0004\b\u001b\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b!\u0010(\u001a\u0004\b\u001f\u0010)R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,¨\u0006-"}, d2 = {"Le92/g$a;", "", "Lmx/a;", "screenSubtitle", "", "Le92/g$a$a;", "sections", "Lw30/a;", "checkboxData", "", "scrollToIad", "Lkotlin/Function0;", "Loq/i0;", "onScrollToIad", "Lh30/a;", "sendButtonData", "<init>", "(Lmx/a;Ljava/util/List;Lw30/a;ZLer/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "e", "()Ljava/util/List;", "Lw30/a;", "()Lw30/a;", "d", "Z", "()Z", "Ler/a;", "()Ler/a;", "f", "Lh30/a;", "()Lh30/a;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label screenSubtitle;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Section> sections;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final CheckBoxSingleData checkboxData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToIad;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrollToIad;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData sendButtonData;

        /* JADX INFO: renamed from: e92.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Le92/g$a$a;", "", "Lmx/a;", "name", "Ln30/b;", "cardListData", "<init>", "(Lmx/a;Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Ln30/b;", "()Ln30/b;", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Section {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label name;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData cardListData;

            public Section(Label label, CardListData cardListData) {
                this.name = label;
                this.cardListData = cardListData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final CardListData getCardListData() {
                return this.cardListData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getName() {
                return this.name;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Section)) {
                    return false;
                }
                Section section = (Section) other;
                return fr.t.c(this.name, section.name) && fr.t.c(this.cardListData, section.cardListData);
            }

            public int hashCode() {
                return (this.name.hashCode() * 31) + this.cardListData.hashCode();
            }

            public String toString() {
                return "Section(name=" + this.name + ", cardListData=" + this.cardListData + ')';
            }
        }

        public Data(Label label, List<Section> list, CheckBoxSingleData checkBoxSingleData, boolean z15, er.a<i0> aVar, ButtonData buttonData) {
            this.screenSubtitle = label;
            this.sections = list;
            this.checkboxData = checkBoxSingleData;
            this.scrollToIad = z15;
            this.onScrollToIad = aVar;
            this.sendButtonData = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CheckBoxSingleData getCheckboxData() {
            return this.checkboxData;
        }

        public final er.a<i0> b() {
            return this.onScrollToIad;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getScreenSubtitle() {
            return this.screenSubtitle;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final boolean getScrollToIad() {
            return this.scrollToIad;
        }

        public final List<Section> e() {
            return this.sections;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.screenSubtitle, data.screenSubtitle) && fr.t.c(this.sections, data.sections) && fr.t.c(this.checkboxData, data.checkboxData) && this.scrollToIad == data.scrollToIad && fr.t.c(this.onScrollToIad, data.onScrollToIad) && fr.t.c(this.sendButtonData, data.sendButtonData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ButtonData getSendButtonData() {
            return this.sendButtonData;
        }

        public int hashCode() {
            return (((((((((this.screenSubtitle.hashCode() * 31) + this.sections.hashCode()) * 31) + this.checkboxData.hashCode()) * 31) + Boolean.hashCode(this.scrollToIad)) * 31) + this.onScrollToIad.hashCode()) * 31) + this.sendButtonData.hashCode();
        }

        public String toString() {
            return "Data(screenSubtitle=" + this.screenSubtitle + ", sections=" + this.sections + ", checkboxData=" + this.checkboxData + ", scrollToIad=" + this.scrollToIad + ", onScrollToIad=" + this.onScrollToIad + ", sendButtonData=" + this.sendButtonData + ')';
        }
    }
}
