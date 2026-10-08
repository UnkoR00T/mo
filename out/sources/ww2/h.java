package ww2;

import a50.RadioButtonData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lww2/h;", "Ll00/e;", "Lww2/h$a;", "a", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends l00.e<Data> {

    /* JADX INFO: renamed from: ww2.h$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lww2/h$a;", "", "Li50/a;", "scaffoldData", "La50/a;", "radioButtonData", "Lh30/a;", "button", "<init>", "(Li50/a;La50/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "La50/a;", "()La50/a;", "Lh30/a;", "()Lh30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f215527d = RadioButtonData.f3462h | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final RadioButtonData radioButtonData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData button;

        public Data(BaseScaffoldData baseScaffoldData, RadioButtonData radioButtonData, ButtonData buttonData) {
            this.scaffoldData = baseScaffoldData;
            this.radioButtonData = radioButtonData;
            this.button = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getButton() {
            return this.button;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final RadioButtonData getRadioButtonData() {
            return this.radioButtonData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.radioButtonData, data.radioButtonData) && fr.t.c(this.button, data.button);
        }

        public int hashCode() {
            return (((this.scaffoldData.hashCode() * 31) + this.radioButtonData.hashCode()) * 31) + this.button.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", radioButtonData=" + this.radioButtonData + ", button=" + this.button + ')';
        }
    }
}
