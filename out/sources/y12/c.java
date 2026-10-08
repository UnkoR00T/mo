package y12;

import a50.RadioButtonData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j40.DropDownButtonData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0003\u0003\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ly12/c;", "Ll00/e;", "Ly12/c$a;", "a", "c", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Ly12/c$b;", "", "Ly12/c$c;", "getType", "()Ly12/c$c;", "type", "b", "a", "Ly12/c$b$a;", "Ly12/c$b$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: y12.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Ly12/c$b$a;", "Ly12/c$b;", "Ly12/c$c;", "type", "Lj40/a;", "dropDownButtonData", "<init>", "(Ly12/c$c;Lj40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly12/c$c;", "getType", "()Ly12/c$c;", "b", "Lj40/a;", "()Lj40/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DropDownButton implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC5962c type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final DropDownButtonData dropDownButtonData;

            public DropDownButton(InterfaceC5962c interfaceC5962c, DropDownButtonData dropDownButtonData) {
                this.type = interfaceC5962c;
                this.dropDownButtonData = dropDownButtonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final DropDownButtonData getDropDownButtonData() {
                return this.dropDownButtonData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DropDownButton)) {
                    return false;
                }
                DropDownButton dropDownButton = (DropDownButton) other;
                return fr.t.c(this.type, dropDownButton.type) && fr.t.c(this.dropDownButtonData, dropDownButton.dropDownButtonData);
            }

            @Override // y12.c.b
            public InterfaceC5962c getType() {
                return this.type;
            }

            public int hashCode() {
                return (this.type.hashCode() * 31) + this.dropDownButtonData.hashCode();
            }

            public String toString() {
                return "DropDownButton(type=" + this.type + ", dropDownButtonData=" + this.dropDownButtonData + ')';
            }
        }

        /* JADX INFO: renamed from: y12.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Ly12/c$b$b;", "Ly12/c$b;", "Ly12/c$c;", "type", "Lv50/c;", "textInputData", "<init>", "(Ly12/c$c;Lv50/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ly12/c$c;", "getType", "()Ly12/c$c;", "b", "Lv50/c;", "()Lv50/c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TextInput implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final InterfaceC5962c type;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c textInputData;

            public TextInput(InterfaceC5962c interfaceC5962c, v50.c cVar) {
                this.type = interfaceC5962c;
                this.textInputData = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final v50.c getTextInputData() {
                return this.textInputData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof TextInput)) {
                    return false;
                }
                TextInput textInput = (TextInput) other;
                return fr.t.c(this.type, textInput.type) && fr.t.c(this.textInputData, textInput.textInputData);
            }

            @Override // y12.c.b
            public InterfaceC5962c getType() {
                return this.type;
            }

            public int hashCode() {
                return (this.type.hashCode() * 31) + this.textInputData.hashCode();
            }

            public String toString() {
                return "TextInput(type=" + this.type + ", textInputData=" + this.textInputData + ')';
            }
        }

        InterfaceC5962c getType();
    }

    /* JADX INFO: renamed from: y12.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Ly12/c$c;", "", "c", "b", "a", "Ly12/c$c$a;", "Ly12/c$c$b;", "Ly12/c$c$c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface InterfaceC5962c {

        /* JADX INFO: renamed from: y12.c$c$a */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Ly12/c$c$a;", "Ly12/c$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "g", "h", "j", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum a implements InterfaceC5962c {
            PUBLIC_NAME,
            CITY,
            STREET,
            BUILDING_NUMBER,
            APARTMENT_NUMBER,
            POSTCODE,
            COUNTRY,
            NAME,
            SURNAME;


            /* JADX INFO: renamed from: l, reason: collision with root package name */
            private static final /* synthetic */ wq.a f223215l = wq.b.a(b());

            public static wq.a<a> e() {
                return f223215l;
            }
        }

        /* JADX INFO: renamed from: y12.c$c$b */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Ly12/c$c$b;", "Ly12/c$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum b implements InterfaceC5962c {
            PESEL,
            NIP,
            REGON,
            KRS,
            EUROPEAN_ID;


            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private static final /* synthetic */ wq.a f223222g = wq.b.a(b());

            public static wq.a<b> e() {
                return f223222g;
            }
        }

        /* JADX INFO: renamed from: y12.c$c$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ly12/c$c$c;", "Ly12/c$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public enum EnumC5963c implements InterfaceC5962c {
            NAME,
            SURNAME;


            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private static final /* synthetic */ wq.a f223226d = wq.b.a(b());

            public static wq.a<EnumC5963c> e() {
                return f223226d;
            }
        }
    }

    /* JADX INFO: renamed from: y12.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b \u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010&R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b'\u0010.R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Ly12/c$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerLabel", "descriptionLabel", "La50/a;", "recipientTypeRadioGroup", "searchRadioGroup", "Lkotlin/Function0;", "Loq/i0;", "backAction", "Lh30/a;", "searchButtonData", "Ly12/c$c;", "fieldTypeToScroll", "<init>", "(Li50/a;Lmx/a;Lmx/a;La50/a;La50/a;Ler/a;Lh30/a;Ly12/c$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "d", "La50/a;", "()La50/a;", "e", "f", "Ler/a;", "getBackAction", "()Ler/a;", "g", "Lh30/a;", "()Lh30/a;", "h", "Ly12/c$c;", "getFieldTypeToScroll", "()Ly12/c$c;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f223192i = RadioButtonData.f3462h | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label headerLabel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label descriptionLabel;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final RadioButtonData recipientTypeRadioGroup;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final RadioButtonData searchRadioGroup;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> backAction;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData searchButtonData;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC5962c fieldTypeToScroll;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, RadioButtonData radioButtonData, RadioButtonData radioButtonData2, er.a<i0> aVar, ButtonData buttonData, InterfaceC5962c interfaceC5962c) {
            this.baseScaffoldData = baseScaffoldData;
            this.headerLabel = label;
            this.descriptionLabel = label2;
            this.recipientTypeRadioGroup = radioButtonData;
            this.searchRadioGroup = radioButtonData2;
            this.backAction = aVar;
            this.searchButtonData = buttonData;
            this.fieldTypeToScroll = interfaceC5962c;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final Label getDescriptionLabel() {
            return this.descriptionLabel;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getHeaderLabel() {
            return this.headerLabel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final RadioButtonData getRecipientTypeRadioGroup() {
            return this.recipientTypeRadioGroup;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final ButtonData getSearchButtonData() {
            return this.searchButtonData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.headerLabel, data.headerLabel) && fr.t.c(this.descriptionLabel, data.descriptionLabel) && fr.t.c(this.recipientTypeRadioGroup, data.recipientTypeRadioGroup) && fr.t.c(this.searchRadioGroup, data.searchRadioGroup) && fr.t.c(this.backAction, data.backAction) && fr.t.c(this.searchButtonData, data.searchButtonData) && fr.t.c(this.fieldTypeToScroll, data.fieldTypeToScroll);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final RadioButtonData getSearchRadioGroup() {
            return this.searchRadioGroup;
        }

        public int hashCode() {
            int iHashCode = ((((((this.baseScaffoldData.hashCode() * 31) + this.headerLabel.hashCode()) * 31) + this.descriptionLabel.hashCode()) * 31) + this.recipientTypeRadioGroup.hashCode()) * 31;
            RadioButtonData radioButtonData = this.searchRadioGroup;
            int iHashCode2 = (((((iHashCode + (radioButtonData == null ? 0 : radioButtonData.hashCode())) * 31) + this.backAction.hashCode()) * 31) + this.searchButtonData.hashCode()) * 31;
            InterfaceC5962c interfaceC5962c = this.fieldTypeToScroll;
            return iHashCode2 + (interfaceC5962c != null ? interfaceC5962c.hashCode() : 0);
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", headerLabel=" + this.headerLabel + ", descriptionLabel=" + this.descriptionLabel + ", recipientTypeRadioGroup=" + this.recipientTypeRadioGroup + ", searchRadioGroup=" + this.searchRadioGroup + ", backAction=" + this.backAction + ", searchButtonData=" + this.searchButtonData + ", fieldTypeToScroll=" + this.fieldTypeToScroll + ')';
        }

        public /* synthetic */ Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, RadioButtonData radioButtonData, RadioButtonData radioButtonData2, er.a aVar, ButtonData buttonData, InterfaceC5962c interfaceC5962c, int i15, fr.k kVar) {
            this(baseScaffoldData, label, label2, radioButtonData, radioButtonData2, aVar, buttonData, (i15 & 128) != 0 ? null : interfaceC5962c);
        }
    }
}
