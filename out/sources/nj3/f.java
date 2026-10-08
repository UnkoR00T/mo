package nj3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lnj3/f;", "Ll00/e;", "Lnj3/f$b;", "b", "a", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f extends l00.e<b> {

    /* JADX INFO: renamed from: nj3.f$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001c\u0010\u001aR#\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u0017\u0010\u001eR#\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b\u001b\u0010\u001eR\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010 \u001a\u0004\b\u001f\u0010!¨\u0006\""}, d2 = {"Lnj3/f$a;", "", "Lv50/c$g;", "plateTextInputData", "vinTextInputData", "Lkotlin/Function1;", "", "Loq/i0;", "onPlateInputFocusChange", "onVinInputFocusChange", "Lv40/a;", "registrationDateData", "<init>", "(Lv50/c$g;Lv50/c$g;Ler/l;Ler/l;Lv40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lv50/c$g;", "c", "()Lv50/c$g;", "b", "e", "Ler/l;", "()Ler/l;", "d", "Lv40/a;", "()Lv40/a;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContentData {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f136899f;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text plateTextInputData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text vinTextInputData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, oq.i0> onPlateInputFocusChange;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, oq.i0> onVinInputFocusChange;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final InputDateTimeData registrationDateData;

        static {
            int i15 = InputDateTimeData.f203769m;
            int i16 = v50.c.Text.P;
            f136899f = i15 | i16 | i16;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public ContentData(v50.c.Text text, v50.c.Text text2, er.l<? super Boolean, oq.i0> lVar, er.l<? super Boolean, oq.i0> lVar2, InputDateTimeData inputDateTimeData) {
            this.plateTextInputData = text;
            this.vinTextInputData = text2;
            this.onPlateInputFocusChange = lVar;
            this.onVinInputFocusChange = lVar2;
            this.registrationDateData = inputDateTimeData;
        }

        public final er.l<Boolean, oq.i0> a() {
            return this.onPlateInputFocusChange;
        }

        public final er.l<Boolean, oq.i0> b() {
            return this.onVinInputFocusChange;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final v50.c.Text getPlateTextInputData() {
            return this.plateTextInputData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final InputDateTimeData getRegistrationDateData() {
            return this.registrationDateData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final v50.c.Text getVinTextInputData() {
            return this.vinTextInputData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContentData)) {
                return false;
            }
            ContentData contentData = (ContentData) other;
            return fr.t.c(this.plateTextInputData, contentData.plateTextInputData) && fr.t.c(this.vinTextInputData, contentData.vinTextInputData) && fr.t.c(this.onPlateInputFocusChange, contentData.onPlateInputFocusChange) && fr.t.c(this.onVinInputFocusChange, contentData.onVinInputFocusChange) && fr.t.c(this.registrationDateData, contentData.registrationDateData);
        }

        public int hashCode() {
            int iHashCode = ((((((this.plateTextInputData.hashCode() * 31) + this.vinTextInputData.hashCode()) * 31) + this.onPlateInputFocusChange.hashCode()) * 31) + this.onVinInputFocusChange.hashCode()) * 31;
            InputDateTimeData inputDateTimeData = this.registrationDateData;
            return iHashCode + (inputDateTimeData == null ? 0 : inputDateTimeData.hashCode());
        }

        public String toString() {
            return "ContentData(plateTextInputData=" + this.plateTextInputData + ", vinTextInputData=" + this.vinTextInputData + ", onPlateInputFocusChange=" + this.onPlateInputFocusChange + ", onVinInputFocusChange=" + this.onVinInputFocusChange + ", registrationDateData=" + this.registrationDateData + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lnj3/f$b;", "", "a", "b", "Lnj3/f$b$a;", "Lnj3/f$b$b;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lnj3/f$b$a;", "Lnj3/f$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class a implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f136905a = new a();

            private a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof a);
            }

            public int hashCode() {
                return 1917276983;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: nj3.f$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010#\u001a\u0004\b\u001c\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b!\u0010%\u001a\u0004\b\u0018\u0010&¨\u0006'"}, d2 = {"Lnj3/f$b$b;", "Lnj3/f$b;", "Li50/a;", "scaffoldData", "Lo40/a;", "headerData", "", "skipForm", "Lnj3/f$a;", "contentData", "Lh30/a;", "buttonData", "<init>", "(Li50/a;Lo40/a;ZLnj3/f$a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lo40/a;", "c", "()Lo40/a;", "Z", "e", "()Z", "Lnj3/f$a;", "()Lnj3/f$a;", "Lh30/a;", "()Lh30/a;", "vehiclehistory_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean skipForm;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContentData contentData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            public Initialized(BaseScaffoldData baseScaffoldData, o40.a aVar, boolean z15, ContentData contentData, ButtonData buttonData) {
                this.scaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.skipForm = z15;
                this.contentData = contentData;
                this.buttonData = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ContentData getContentData() {
                return this.contentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final boolean getSkipForm() {
                return this.skipForm;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.headerData, initialized.headerData) && this.skipForm == initialized.skipForm && fr.t.c(this.contentData, initialized.contentData) && fr.t.c(this.buttonData, initialized.buttonData);
            }

            public int hashCode() {
                return (((((((this.scaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + Boolean.hashCode(this.skipForm)) * 31) + this.contentData.hashCode()) * 31) + this.buttonData.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", headerData=" + this.headerData + ", skipForm=" + this.skipForm + ", contentData=" + this.contentData + ", buttonData=" + this.buttonData + ')';
            }
        }
    }
}
