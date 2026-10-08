package cq3;

import fr.t;
import i30.ButtonIconData;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lcq3/f;", "Ll00/e;", "Lcq3/f$a;", "a", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<Data> {

    /* JADX INFO: renamed from: cq3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00030\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0016\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u001a\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcq3/f$a;", "", "Lq40/g;", "Loq/i0;", "Lq40/f;", "iconPageData", "Lkotlin/Function0;", "closeAction", "Li30/a;", "closeButtonData", "<init>", "(Lq40/g;Ler/a;Li30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq40/g;", "c", "()Lq40/g;", "b", "Ler/a;", "()Ler/a;", "Li30/a;", "()Li30/a;", "voteidea_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f37268d = (ButtonIconData.f88935g | IconPageBottomContentData.f164663d) | IconPageData.f164667h;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final IconPageData<i0, IconPageBottomContentData> iconPageData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeAction;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonIconData closeButtonData;

        public Data(IconPageData<i0, IconPageBottomContentData> iconPageData, er.a<i0> aVar, ButtonIconData buttonIconData) {
            this.iconPageData = iconPageData;
            this.closeAction = aVar;
            this.closeButtonData = buttonIconData;
        }

        public final er.a<i0> a() {
            return this.closeAction;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ButtonIconData getCloseButtonData() {
            return this.closeButtonData;
        }

        public final IconPageData<i0, IconPageBottomContentData> c() {
            return this.iconPageData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.iconPageData, data.iconPageData) && t.c(this.closeAction, data.closeAction) && t.c(this.closeButtonData, data.closeButtonData);
        }

        public int hashCode() {
            return (((this.iconPageData.hashCode() * 31) + this.closeAction.hashCode()) * 31) + this.closeButtonData.hashCode();
        }

        public String toString() {
            return "Data(iconPageData=" + this.iconPageData + ", closeAction=" + this.closeAction + ", closeButtonData=" + this.closeButtonData + ')';
        }
    }
}
