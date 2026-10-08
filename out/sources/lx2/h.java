package lx2;

import a50.RadioButtonData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Llx2/h;", "Ll00/e;", "Llx2/h$a;", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends l00.e<Data> {

    /* JADX INFO: renamed from: lx2.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001e\u001a\u0004\b\u001d\u0010 R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b\"\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b!\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u0019\u0010(¨\u0006)"}, d2 = {"Llx2/h$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "description", "La50/a;", "radioButtonData", "Lc30/b$c;", "infoAlert", "Lh30/a;", "button", "<init>", "(Li50/a;Lmx/a;Lmx/a;La50/a;Lc30/b$c;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "d", "La50/a;", "()La50/a;", "Lc30/b$c;", "()Lc30/b$c;", "Lh30/a;", "()Lh30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f121117g = RadioButtonData.f3462h | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final RadioButtonData radioButtonData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.c infoAlert;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData button;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, RadioButtonData radioButtonData, c30.b.c cVar, ButtonData buttonData) {
            this.scaffoldData = baseScaffoldData;
            this.title = label;
            this.description = label2;
            this.radioButtonData = radioButtonData;
            this.infoAlert = cVar;
            this.button = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final c30.b.c getInfoAlert() {
            return this.infoAlert;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final RadioButtonData getRadioButtonData() {
            return this.radioButtonData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.title, data.title) && fr.t.c(this.description, data.description) && fr.t.c(this.radioButtonData, data.radioButtonData) && fr.t.c(this.infoAlert, data.infoAlert) && fr.t.c(this.button, data.button);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            return (((((((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.description.hashCode()) * 31) + this.radioButtonData.hashCode()) * 31) + this.infoAlert.hashCode()) * 31) + this.button.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", description=" + this.description + ", radioButtonData=" + this.radioButtonData + ", infoAlert=" + this.infoAlert + ", button=" + this.button + ')';
        }
    }
}
