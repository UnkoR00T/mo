package fl1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfl1/c;", "Ll00/e;", "Lfl1/c$a;", "a", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: fl1.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001cBE\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b \u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010*\u001a\u0004\b&\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b\u001c\u0010-¨\u0006."}, d2 = {"Lfl1/c$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "header", "", "Lfl1/c$a$a;", "fields", "Lil1/a;", "scrollToField", "Lkotlin/Function0;", "Loq/i0;", "onScrolledToField", "Lh30/a;", "buttonData", "<init>", "(Li50/a;Lmx/a;Ljava/util/List;Lil1/a;Ler/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "Ljava/util/List;", "()Ljava/util/List;", "d", "Lil1/a;", "f", "()Lil1/a;", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label header;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Field> fields;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final il1.a scrollToField;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onScrolledToField;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        /* JADX INFO: renamed from: fl1.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lfl1/c$a$a;", "", "Lil1/a;", "type", "Lfl1/c$a$a$a;", "input", "<init>", "(Lil1/a;Lfl1/c$a$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lil1/a;", "b", "()Lil1/a;", "Lfl1/c$a$a$a;", "()Lfl1/c$a$a$a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Field {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final il1.a type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC1442a input;

            /* JADX INFO: renamed from: fl1.c$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lfl1/c$a$a$a;", "", "b", "a", "Lfl1/c$a$a$a$a;", "Lfl1/c$a$a$a$b;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface InterfaceC1442a {

                /* JADX INFO: renamed from: fl1.c$a$a$a$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfl1/c$a$a$a$a;", "Lfl1/c$a$a$a;", "Lv40/a;", "data", "<init>", "(Lv40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv40/a;", "()Lv40/a;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class DateTime implements InterfaceC1442a {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final int f64819b = InputDateTimeData.f203769m;

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final InputDateTimeData data;

                    public DateTime(InputDateTimeData inputDateTimeData) {
                        this.data = inputDateTimeData;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final InputDateTimeData getData() {
                        return this.data;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof DateTime) && fr.t.c(this.data, ((DateTime) other).data);
                    }

                    public int hashCode() {
                        return this.data.hashCode();
                    }

                    public String toString() {
                        return "DateTime(data=" + this.data + ')';
                    }
                }

                /* JADX INFO: renamed from: fl1.c$a$a$a$b, reason: from toString */
                @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lfl1/c$a$a$a$b;", "Lfl1/c$a$a$a;", "Lv50/c$g;", "data", "<init>", "(Lv50/c$g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv50/c$g;", "()Lv50/c$g;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Text implements InterfaceC1442a {

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public static final int f64821b = v50.c.Text.P;

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final v50.c.Text data;

                    public Text(v50.c.Text text) {
                        this.data = text;
                    }

                    /* JADX INFO: renamed from: a, reason: from getter */
                    public final v50.c.Text getData() {
                        return this.data;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        return (other instanceof Text) && fr.t.c(this.data, ((Text) other).data);
                    }

                    public int hashCode() {
                        return this.data.hashCode();
                    }

                    public String toString() {
                        return "Text(data=" + this.data + ')';
                    }
                }
            }

            public Field(il1.a aVar, InterfaceC1442a interfaceC1442a) {
                this.type = aVar;
                this.input = interfaceC1442a;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final InterfaceC1442a getInput() {
                return this.input;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final il1.a getType() {
                return this.type;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Field)) {
                    return false;
                }
                Field field = (Field) other;
                return this.type == field.type && fr.t.c(this.input, field.input);
            }

            public int hashCode() {
                return (this.type.hashCode() * 31) + this.input.hashCode();
            }

            public String toString() {
                return "Field(type=" + this.type + ", input=" + this.input + ')';
            }
        }

        public Data(BaseScaffoldData baseScaffoldData, Label label, List<Field> list, il1.a aVar, er.a<i0> aVar2, ButtonData buttonData) {
            this.scaffoldData = baseScaffoldData;
            this.header = label;
            this.fields = list;
            this.scrollToField = aVar;
            this.onScrolledToField = aVar2;
            this.buttonData = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getButtonData() {
            return this.buttonData;
        }

        public final List<Field> b() {
            return this.fields;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getHeader() {
            return this.header;
        }

        public final er.a<i0> d() {
            return this.onScrolledToField;
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
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.header, data.header) && fr.t.c(this.fields, data.fields) && this.scrollToField == data.scrollToField && fr.t.c(this.onScrolledToField, data.onScrolledToField) && fr.t.c(this.buttonData, data.buttonData);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final il1.a getScrollToField() {
            return this.scrollToField;
        }

        public int hashCode() {
            int iHashCode = ((((this.scaffoldData.hashCode() * 31) + this.header.hashCode()) * 31) + this.fields.hashCode()) * 31;
            il1.a aVar = this.scrollToField;
            return ((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + this.onScrolledToField.hashCode()) * 31) + this.buttonData.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", header=" + this.header + ", fields=" + this.fields + ", scrollToField=" + this.scrollToField + ", onScrolledToField=" + this.onScrolledToField + ", buttonData=" + this.buttonData + ')';
        }
    }
}
