package yp2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lyp2/e;", "Ll00/e;", "Lyp2/e$a;", "a", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\n\u000bB\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0003\f\r\u000e¨\u0006\u000f"}, d2 = {"Lyp2/e$a;", "", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "a", "Ler/a;", "()Ler/a;", "b", "c", "Lyp2/e$a$a;", "Lyp2/e$a$b;", "Lyp2/e$a$c;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final er.a<i0> onBackClick;

        /* JADX INFO: renamed from: yp2.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lyp2/e$a$a;", "Lyp2/e$a;", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ler/a;", "a", "()Ler/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial extends a {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initial(er.a<i0> aVar) {
                super(aVar, null);
                this.onBackClick = aVar;
            }

            @Override // yp2.e.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initial) && fr.t.c(this.onBackClick, ((Initial) other).onBackClick);
            }

            public int hashCode() {
                return this.onBackClick.hashCode();
            }

            public String toString() {
                return "Initial(onBackClick=" + this.onBackClick + ')';
            }
        }

        /* JADX INFO: renamed from: yp2.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b\u001d\u0010%R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lyp2/e$a$b;", "Lyp2/e$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerLabel", "Lt40/b;", "infoRowListData", "Lh30/a;", "buttonData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lmx/a;Lt40/b;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Li50/a;", "()Li50/a;", "c", "Lmx/a;", "d", "()Lmx/a;", "Lt40/b;", "e", "()Lt40/b;", "Lh30/a;", "()Lh30/a;", "f", "Ler/a;", "a", "()Ler/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized extends a {

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public static final int f228408g = InfoRowListData.f187643b | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerLabel;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData infoRowListData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, InfoRowListData infoRowListData, ButtonData buttonData, er.a<i0> aVar) {
                super(aVar, null);
                this.baseScaffoldData = baseScaffoldData;
                this.headerLabel = label;
                this.infoRowListData = infoRowListData;
                this.buttonData = buttonData;
                this.onBackClick = aVar;
            }

            @Override // yp2.e.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getHeaderLabel() {
                return this.headerLabel;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final InfoRowListData getInfoRowListData() {
                return this.infoRowListData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.headerLabel, initialized.headerLabel) && fr.t.c(this.infoRowListData, initialized.infoRowListData) && fr.t.c(this.buttonData, initialized.buttonData) && fr.t.c(this.onBackClick, initialized.onBackClick);
            }

            public int hashCode() {
                return (((((((this.baseScaffoldData.hashCode() * 31) + this.headerLabel.hashCode()) * 31) + this.infoRowListData.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", headerLabel=" + this.headerLabel + ", infoRowListData=" + this.infoRowListData + ", buttonData=" + this.buttonData + ", onBackClick=" + this.onBackClick + ')';
            }
        }

        /* JADX INFO: renamed from: yp2.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lyp2/e$a$c;", "Lyp2/e$a;", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Loq/i0;", "Lh30/a;", "iconPageData", "Lkotlin/Function0;", "onBackClick", "<init>", "(Li50/a;Lq40/g;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Li50/a;", "()Li50/a;", "c", "Lq40/g;", "()Lq40/g;", "d", "Ler/a;", "a", "()Ler/a;", "passportagreement_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Underage extends a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f228414e = IconPageData.f164667h | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<i0, ButtonData> iconPageData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Underage(BaseScaffoldData baseScaffoldData, IconPageData<i0, ButtonData> iconPageData, er.a<i0> aVar) {
                super(aVar, null);
                this.baseScaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
                this.onBackClick = aVar;
            }

            @Override // yp2.e.a
            public er.a<i0> a() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            public final IconPageData<i0, ButtonData> c() {
                return this.iconPageData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Underage)) {
                    return false;
                }
                Underage underage = (Underage) other;
                return fr.t.c(this.baseScaffoldData, underage.baseScaffoldData) && fr.t.c(this.iconPageData, underage.iconPageData) && fr.t.c(this.onBackClick, underage.onBackClick);
            }

            public int hashCode() {
                return (((this.baseScaffoldData.hashCode() * 31) + this.iconPageData.hashCode()) * 31) + this.onBackClick.hashCode();
            }

            public String toString() {
                return "Underage(baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ", onBackClick=" + this.onBackClick + ')';
            }
        }

        public /* synthetic */ a(er.a aVar, fr.k kVar) {
            this(aVar);
        }

        public er.a<i0> a() {
            return this.onBackClick;
        }

        private a(er.a<i0> aVar) {
            this.onBackClick = aVar;
        }
    }
}
