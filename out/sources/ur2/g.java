package ur2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lur2/g;", "Ll00/e;", "Lur2/g$a;", "a", "passportpickup_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: ur2.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001f\u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b\"\u0010*R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b$\u0010+\u001a\u0004\b\u001b\u0010,R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010*¨\u0006/"}, d2 = {"Lur2/g$a;", "", "Li50/a;", "scaffoldData", "Lo40/a;", "headerData", "Lv50/c;", "textInputData", "", "scrollToField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToField", "Lh30/a;", "buttonData", "onBackClick", "<init>", "(Li50/a;Lo40/a;Lv50/c;ZLer/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lo40/a;", "()Lo40/a;", "c", "Lv50/c;", "f", "()Lv50/c;", "Z", "e", "()Z", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "g", "getOnBackClick", "passportpickup_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o40.a headerData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c textInputData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean scrollToField;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackClick;

        public Data(BaseScaffoldData baseScaffoldData, o40.a aVar, v50.c cVar, boolean z15, er.a<i0> aVar2, ButtonData buttonData, er.a<i0> aVar3) {
            this.scaffoldData = baseScaffoldData;
            this.headerData = aVar;
            this.textInputData = cVar;
            this.scrollToField = z15;
            this.onScrolledToField = aVar2;
            this.buttonData = buttonData;
            this.onBackClick = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getButtonData() {
            return this.buttonData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o40.a getHeaderData() {
            return this.headerData;
        }

        public final er.a<i0> c() {
            return this.onScrolledToField;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getScrollToField() {
            return this.scrollToField;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.headerData, data.headerData) && fr.t.c(this.textInputData, data.textInputData) && this.scrollToField == data.scrollToField && fr.t.c(this.onScrolledToField, data.onScrolledToField) && fr.t.c(this.buttonData, data.buttonData) && fr.t.c(this.onBackClick, data.onBackClick);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final v50.c getTextInputData() {
            return this.textInputData;
        }

        public int hashCode() {
            return (((((((((((this.scaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.textInputData.hashCode()) * 31) + Boolean.hashCode(this.scrollToField)) * 31) + this.onScrolledToField.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.onBackClick.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", headerData=" + this.headerData + ", textInputData=" + this.textInputData + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ", buttonData=" + this.buttonData + ", onBackClick=" + this.onBackClick + ')';
        }
    }
}
