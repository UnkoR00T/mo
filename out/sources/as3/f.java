package as3;

import cs3.CarouselSegmentData;
import cs3.SelectedTermSegmentData;
import i30.ButtonIconData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Las3/f;", "Ll00/e;", "Las3/f$a;", "a", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Las3/f$a;", "", "b", "a", "Las3/f$a$a;", "Las3/f$a$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: as3.f$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Las3/f$a$a;", "Las3/f$a;", "a", "b", "Las3/f$a$a$a;", "Las3/f$a$a$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC0313a extends a {

            /* JADX INFO: renamed from: as3.f$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Las3/f$a$a$a;", "Las3/f$a$a;", "Lq40/g;", "Loq/i0;", "iconPageData", "Li30/a;", "closeButtonData", "<init>", "(Lq40/g;Li30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq40/g;", "()Lq40/g;", "b", "Li30/a;", "getCloseButtonData", "()Li30/a;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Empty implements InterfaceC0313a {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f14349c = ButtonIconData.f88935g | IconPageData.f164667h;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final IconPageData<i0, i0> iconPageData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final ButtonIconData closeButtonData;

                public Empty(IconPageData<i0, i0> iconPageData, ButtonIconData buttonIconData) {
                    this.iconPageData = iconPageData;
                    this.closeButtonData = buttonIconData;
                }

                public final IconPageData<i0, i0> a() {
                    return this.iconPageData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Empty)) {
                        return false;
                    }
                    Empty empty = (Empty) other;
                    return fr.t.c(this.iconPageData, empty.iconPageData) && fr.t.c(this.closeButtonData, empty.closeButtonData);
                }

                public int hashCode() {
                    return (this.iconPageData.hashCode() * 31) + this.closeButtonData.hashCode();
                }

                public String toString() {
                    return "Empty(iconPageData=" + this.iconPageData + ", closeButtonData=" + this.closeButtonData + ')';
                }
            }

            /* JADX INFO: renamed from: as3.f$a$a$b, reason: from toString */
            @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b\u001f\u0010\u001eR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b\u001b\u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010\u0015R#\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b$\u0010(\u001a\u0004\b\"\u0010)¨\u0006*"}, d2 = {"Las3/f$a$a$b;", "Las3/f$a$a;", "Lmx/a;", "headline", "freeTermLabel", "", "Lcs3/a;", "carouselSegmentsData", "Lcs3/b;", "selectedTermSegmentData", "", "selectedTermIndex", "Lkotlin/Function1;", "Loq/i0;", "onSelectTerm", "<init>", "(Lmx/a;Lmx/a;Ljava/util/List;Lcs3/b;ILer/l;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lcs3/b;", "f", "()Lcs3/b;", "e", "I", "Ler/l;", "()Ler/l;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class LoadedTerms implements InterfaceC0313a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label headline;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label freeTermLabel;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<CarouselSegmentData> carouselSegmentsData;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final SelectedTermSegmentData selectedTermSegmentData;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final int selectedTermIndex;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.l<Integer, i0> onSelectTerm;

                /* JADX WARN: Multi-variable type inference failed */
                public LoadedTerms(Label label, Label label2, List<CarouselSegmentData> list, SelectedTermSegmentData selectedTermSegmentData, int i15, er.l<? super Integer, i0> lVar) {
                    this.headline = label;
                    this.freeTermLabel = label2;
                    this.carouselSegmentsData = list;
                    this.selectedTermSegmentData = selectedTermSegmentData;
                    this.selectedTermIndex = i15;
                    this.onSelectTerm = lVar;
                }

                public final List<CarouselSegmentData> a() {
                    return this.carouselSegmentsData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getFreeTermLabel() {
                    return this.freeTermLabel;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final Label getHeadline() {
                    return this.headline;
                }

                public final er.l<Integer, i0> d() {
                    return this.onSelectTerm;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final int getSelectedTermIndex() {
                    return this.selectedTermIndex;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof LoadedTerms)) {
                        return false;
                    }
                    LoadedTerms loadedTerms = (LoadedTerms) other;
                    return fr.t.c(this.headline, loadedTerms.headline) && fr.t.c(this.freeTermLabel, loadedTerms.freeTermLabel) && fr.t.c(this.carouselSegmentsData, loadedTerms.carouselSegmentsData) && fr.t.c(this.selectedTermSegmentData, loadedTerms.selectedTermSegmentData) && this.selectedTermIndex == loadedTerms.selectedTermIndex && fr.t.c(this.onSelectTerm, loadedTerms.onSelectTerm);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final SelectedTermSegmentData getSelectedTermSegmentData() {
                    return this.selectedTermSegmentData;
                }

                public int hashCode() {
                    return (((((((((this.headline.hashCode() * 31) + this.freeTermLabel.hashCode()) * 31) + this.carouselSegmentsData.hashCode()) * 31) + this.selectedTermSegmentData.hashCode()) * 31) + Integer.hashCode(this.selectedTermIndex)) * 31) + this.onSelectTerm.hashCode();
                }

                public String toString() {
                    return "LoadedTerms(headline=" + this.headline + ", freeTermLabel=" + this.freeTermLabel + ", carouselSegmentsData=" + this.carouselSegmentsData + ", selectedTermSegmentData=" + this.selectedTermSegmentData + ", selectedTermIndex=" + this.selectedTermIndex + ", onSelectTerm=" + this.onSelectTerm + ')';
                }
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Las3/f$a$b;", "Las3/f$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f14358a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return 761959473;
            }

            public String toString() {
                return "Initial";
            }
        }
    }
}
