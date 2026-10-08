package lq3;

import fr.t;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Llq3/g;", "Ll00/e;", "Llq3/g$a;", "a", "b", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: lq3.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f¨\u0006 "}, d2 = {"Llq3/g$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Lq40/g;", "Llq3/g$b;", "Lq40/f;", "iconPageData", "Li30/a;", "closeButtonData", "<init>", "(Ler/a;Lq40/g;Li30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "c", "()Ler/a;", "b", "Lq40/g;", "()Lq40/g;", "Li30/a;", "()Li30/a;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f119634d = (ButtonIconData.f88935g | IconPageBottomContentData.f164663d) | IconPageData.f164667h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final IconPageData<IconPageContentData, IconPageBottomContentData> iconPageData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonIconData closeButtonData;

        public Data(er.a<i0> aVar, IconPageData<IconPageContentData, IconPageBottomContentData> iconPageData, ButtonIconData buttonIconData) {
            this.onBackClick = aVar;
            this.iconPageData = iconPageData;
            this.closeButtonData = buttonIconData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonIconData getCloseButtonData() {
            return this.closeButtonData;
        }

        public final IconPageData<IconPageContentData, IconPageBottomContentData> b() {
            return this.iconPageData;
        }

        public final er.a<i0> c() {
            return this.onBackClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.onBackClick, data.onBackClick) && t.c(this.iconPageData, data.iconPageData) && t.c(this.closeButtonData, data.closeButtonData);
        }

        public int hashCode() {
            return (((this.onBackClick.hashCode() * 31) + this.iconPageData.hashCode()) * 31) + this.closeButtonData.hashCode();
        }

        public String toString() {
            return "Data(onBackClick=" + this.onBackClick + ", iconPageData=" + this.iconPageData + ", closeButtonData=" + this.closeButtonData + ')';
        }
    }

    /* JADX INFO: renamed from: lq3.g$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0016\u0010\u0014¨\u0006\u0017"}, d2 = {"Llq3/g$b;", "", "Lmx/a;", "firstMessage", "secondMessage", "thirdMessage", "<init>", "(Lmx/a;Lmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "c", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconPageContentData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label firstMessage;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label secondMessage;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label thirdMessage;

        public IconPageContentData(Label label, Label label2, Label label3) {
            this.firstMessage = label;
            this.secondMessage = label2;
            this.thirdMessage = label3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getFirstMessage() {
            return this.firstMessage;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getSecondMessage() {
            return this.secondMessage;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getThirdMessage() {
            return this.thirdMessage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof IconPageContentData)) {
                return false;
            }
            IconPageContentData iconPageContentData = (IconPageContentData) other;
            return t.c(this.firstMessage, iconPageContentData.firstMessage) && t.c(this.secondMessage, iconPageContentData.secondMessage) && t.c(this.thirdMessage, iconPageContentData.thirdMessage);
        }

        public int hashCode() {
            return (((this.firstMessage.hashCode() * 31) + this.secondMessage.hashCode()) * 31) + this.thirdMessage.hashCode();
        }

        public String toString() {
            return "IconPageContentData(firstMessage=" + this.firstMessage + ", secondMessage=" + this.secondMessage + ", thirdMessage=" + this.thirdMessage + ')';
        }
    }
}
