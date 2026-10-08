package ix2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0003\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lix2/l;", "Ll00/e;", "Lix2/l$a;", "a", "b", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l extends l00.e<Data> {

    /* JADX INFO: renamed from: ix2.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010*\u001a\u0004\b$\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\"\u0010,\u001a\u0004\b\u001c\u0010-¨\u0006."}, d2 = {"Lix2/l$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "title", "", "Lix2/l$b;", "fields", "Lix2/a;", "scrollToField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToField", "Lh30/a;", "buttonData", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;Lix2/a;Ler/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "Lix2/a;", "e", "()Lix2/a;", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label title;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<FieldData> fields;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final a scrollToField;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        public Data(BaseScaffoldData baseScaffoldData, Label label, List<FieldData> list, a aVar, er.a<i0> aVar2, ButtonData buttonData) {
            this.scaffoldData = baseScaffoldData;
            this.title = label;
            this.fields = list;
            this.scrollToField = aVar;
            this.onScrolledToField = aVar2;
            this.buttonData = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getButtonData() {
            return this.buttonData;
        }

        public final List<FieldData> b() {
            return this.fields;
        }

        public final er.a<i0> c() {
            return this.onScrolledToField;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final a getScrollToField() {
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
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.title, data.title) && fr.t.c(this.fields, data.fields) && this.scrollToField == data.scrollToField && fr.t.c(this.onScrolledToField, data.onScrolledToField) && fr.t.c(this.buttonData, data.buttonData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getTitle() {
            return this.title;
        }

        public int hashCode() {
            int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.fields.hashCode()) * 31;
            a aVar = this.scrollToField;
            return ((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.onScrolledToField.hashCode()) * 31) + this.buttonData.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", title=" + this.title + ", fields=" + this.fields + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ", buttonData=" + this.buttonData + ')';
        }
    }

    /* JADX INFO: renamed from: ix2.l$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lix2/l$b;", "", "Lix2/a;", "type", "Lv50/c$g;", "inputData", "<init>", "(Lix2/a;Lv50/c$g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lix2/a;", "b", "()Lix2/a;", "Lv50/c$g;", "()Lv50/c$g;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FieldData {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f97645c = v50.c.Text.P;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final a type;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c.Text inputData;

        public FieldData(a aVar, v50.c.Text text) {
            this.type = aVar;
            this.inputData = text;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final v50.c.Text getInputData() {
            return this.inputData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final a getType() {
            return this.type;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldData)) {
                return false;
            }
            FieldData fieldData = (FieldData) other;
            return this.type == fieldData.type && fr.t.c(this.inputData, fieldData.inputData);
        }

        public int hashCode() {
            return (this.type.hashCode() * 31) + this.inputData.hashCode();
        }

        public String toString() {
            return "FieldData(type=" + this.type + ", inputData=" + this.inputData + ')';
        }
    }
}
