package oj1;

import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Loj1/j;", "Ll00/e;", "Loj1/j$a;", "a", "b", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface j extends l00.e<Data> {

    /* JADX INFO: renamed from: oj1.j$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Loj1/j$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Loj1/j$b;", "Lq40/f;", "iconPageData", "<init>", "(Ler/a;Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "c", "()Ler/a;", "b", "Li50/a;", "()Li50/a;", "Lq40/g;", "()Lq40/g;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f146312d = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final IconPageData<IconPageCardsContent, IconPageBottomContentData> iconPageData;

        public Data(er.a<i0> aVar, BaseScaffoldData baseScaffoldData, IconPageData<IconPageCardsContent, IconPageBottomContentData> iconPageData) {
            this.onBackClick = aVar;
            this.baseScaffoldData = baseScaffoldData;
            this.iconPageData = iconPageData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        public final IconPageData<IconPageCardsContent, IconPageBottomContentData> b() {
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
            return fr.t.c(this.onBackClick, data.onBackClick) && fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.iconPageData, data.iconPageData);
        }

        public int hashCode() {
            return (((this.onBackClick.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.iconPageData.hashCode();
        }

        public String toString() {
            return "Data(onBackClick=" + this.onBackClick + ", baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ')';
        }
    }

    /* JADX INFO: renamed from: oj1.j$b, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0012¨\u0006\u0013"}, d2 = {"Loj1/j$b;", "", "Ln30/b;", "cardListData", "<init>", "(Ln30/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "()Ln30/b;", "defencetraining_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class IconPageCardsContent {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final CardListData cardListData;

        public IconPageCardsContent(CardListData cardListData) {
            this.cardListData = cardListData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CardListData getCardListData() {
            return this.cardListData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof IconPageCardsContent) && fr.t.c(this.cardListData, ((IconPageCardsContent) other).cardListData);
        }

        public int hashCode() {
            return this.cardListData.hashCode();
        }

        public String toString() {
            return "IconPageCardsContent(cardListData=" + this.cardListData + ')';
        }
    }
}
