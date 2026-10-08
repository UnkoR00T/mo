package v40;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: v40.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u001f\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0002\"\u0016B\u0081\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u0090\u0001\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u000e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010 \u001a\u0004\b!\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010#\u001a\u0004\b0\u0010%R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b1\u0010#\u001a\u0004\b1\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u0010#\u001a\u0004\b,\u0010%R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b0\u00102\u001a\u0004\b&\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b(\u00106R\u001d\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006¢\u0006\f\n\u0004\b!\u00107\u001a\u0004\b4\u00108¨\u00069"}, d2 = {"Lv40/a;", "", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "inputText", "Lv40/a$b;", "type", "Lhz/b;", "validationState", "labelContentDescription", "inputTextContentDescription", "helperText", "", "enabled", "fieldIndex", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Ljava/lang/String;Lmx/a;Ljava/lang/String;Lv40/a$b;Lhz/b;Lmx/a;Lmx/a;Lmx/a;ZLjava/lang/Object;Ler/a;)V", "a", "(Ljava/lang/String;Lmx/a;Ljava/lang/String;Lv40/a$b;Lhz/b;Lmx/a;Lmx/a;Lmx/a;ZLjava/lang/Object;Ler/a;)Lv40/a;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "b", "Lmx/a;", "h", "()Lmx/a;", "c", "f", "d", "Lv40/a$b;", "l", "()Lv40/a$b;", "e", "Lhz/b;", "m", "()Lhz/b;", "i", "g", "Z", "()Z", "j", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Ler/a;", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class InputDateTimeData {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f203769m = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String inputText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b validationState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label labelContentDescription;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label inputTextContentDescription;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label helperText;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object fieldIndex;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    /* JADX INFO: renamed from: v40.a$b */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u000e\b\u000bB\u0019\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\u0082\u0001\u0003\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Lv40/a$b;", "", "", "iconResId", "", "placeholder", "<init>", "(ILjava/lang/String;)V", "a", "I", "()I", "b", "Ljava/lang/String;", "()Ljava/lang/String;", "c", "Lv40/a$b$a;", "Lv40/a$b$b;", "Lv40/a$b$c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int iconResId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final String placeholder;

        /* JADX INFO: renamed from: v40.a$b$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv40/a$b$a;", "Lv40/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5303a extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final C5303a f203783c = new C5303a();

            private C5303a() {
                super(jz.a.f106759e, "DD.MM.RRRR", null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5303a);
            }

            public int hashCode() {
                return 692667349;
            }

            public String toString() {
                return "Date";
            }
        }

        /* JADX INFO: renamed from: v40.a$b$c */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv40/a$b$c;", "Lv40/a$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f203785c = new c();

            private c() {
                super(jz.a.f106797j, "GG:MM", null);
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return 693151476;
            }

            public String toString() {
                return "Time";
            }
        }

        public /* synthetic */ b(int i15, String str, k kVar) {
            this(i15, str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getIconResId() {
            return this.iconResId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getPlaceholder() {
            return this.placeholder;
        }

        /* JADX INFO: renamed from: v40.a$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lv40/a$b$b;", "Lv40/a$b;", "Lmx/a;", "placeholderLabel", "<init>", "(Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "c", "Lmx/a;", "getPlaceholderLabel", "()Lmx/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DateRange extends b {

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label placeholderLabel;

            public /* synthetic */ DateRange(Label label, int i15, k kVar) {
                this((i15 & 1) != 0 ? c70.a.f23835a.a().L0() : label);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof DateRange) && t.c(this.placeholderLabel, ((DateRange) other).placeholderLabel);
            }

            public int hashCode() {
                return this.placeholderLabel.hashCode();
            }

            public String toString() {
                return "DateRange(placeholderLabel=" + this.placeholderLabel + ')';
            }

            public DateRange(Label label) {
                super(jz.a.f106759e, label.getText(), null);
                this.placeholderLabel = label;
            }
        }

        private b(int i15, String str) {
            this.iconResId = i15;
            this.placeholder = str;
        }
    }

    public InputDateTimeData(String str, Label label, String str2, b bVar, hz.b bVar2, Label label2, Label label3, Label label4, boolean z15, Object obj, er.a<i0> aVar) {
        this.testTag = str;
        this.label = label;
        this.inputText = str2;
        this.type = bVar;
        this.validationState = bVar2;
        this.labelContentDescription = label2;
        this.inputTextContentDescription = label3;
        this.helperText = label4;
        this.enabled = z15;
        this.fieldIndex = obj;
        this.onClick = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ InputDateTimeData b(InputDateTimeData inputDateTimeData, String str, Label label, String str2, b bVar, hz.b bVar2, Label label2, Label label3, Label label4, boolean z15, Object obj, er.a aVar, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            str = inputDateTimeData.testTag;
        }
        if ((i15 & 2) != 0) {
            label = inputDateTimeData.label;
        }
        if ((i15 & 4) != 0) {
            str2 = inputDateTimeData.inputText;
        }
        if ((i15 & 8) != 0) {
            bVar = inputDateTimeData.type;
        }
        if ((i15 & 16) != 0) {
            bVar2 = inputDateTimeData.validationState;
        }
        if ((i15 & 32) != 0) {
            label2 = inputDateTimeData.labelContentDescription;
        }
        if ((i15 & 64) != 0) {
            label3 = inputDateTimeData.inputTextContentDescription;
        }
        if ((i15 & 128) != 0) {
            label4 = inputDateTimeData.helperText;
        }
        if ((i15 & 256) != 0) {
            z15 = inputDateTimeData.enabled;
        }
        if ((i15 & 512) != 0) {
            obj = inputDateTimeData.fieldIndex;
        }
        if ((i15 & 1024) != 0) {
            aVar = inputDateTimeData.onClick;
        }
        Object obj3 = obj;
        er.a aVar2 = aVar;
        Label label5 = label4;
        boolean z16 = z15;
        Label label6 = label2;
        Label label7 = label3;
        hz.b bVar3 = bVar2;
        String str3 = str2;
        return inputDateTimeData.a(str, label, str3, bVar, bVar3, label6, label7, label5, z16, obj3, aVar2);
    }

    public final InputDateTimeData a(String testTag, Label label, String inputText, b type, hz.b validationState, Label labelContentDescription, Label inputTextContentDescription, Label helperText, boolean enabled, Object fieldIndex, er.a<i0> onClick) {
        return new InputDateTimeData(testTag, label, inputText, type, validationState, labelContentDescription, inputTextContentDescription, helperText, enabled, fieldIndex, onClick);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Object getFieldIndex() {
        return this.fieldIndex;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getHelperText() {
        return this.helperText;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputDateTimeData)) {
            return false;
        }
        InputDateTimeData inputDateTimeData = (InputDateTimeData) other;
        return t.c(this.testTag, inputDateTimeData.testTag) && t.c(this.label, inputDateTimeData.label) && t.c(this.inputText, inputDateTimeData.inputText) && t.c(this.type, inputDateTimeData.type) && t.c(this.validationState, inputDateTimeData.validationState) && t.c(this.labelContentDescription, inputDateTimeData.labelContentDescription) && t.c(this.inputTextContentDescription, inputDateTimeData.inputTextContentDescription) && t.c(this.helperText, inputDateTimeData.helperText) && this.enabled == inputDateTimeData.enabled && t.c(this.fieldIndex, inputDateTimeData.fieldIndex) && t.c(this.onClick, inputDateTimeData.onClick);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getInputText() {
        return this.inputText;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getInputTextContentDescription() {
        return this.inputTextContentDescription;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public int hashCode() {
        String str = this.testTag;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.label.hashCode()) * 31;
        String str2 = this.inputText;
        int iHashCode2 = (((((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + this.type.hashCode()) * 31) + this.validationState.hashCode()) * 31;
        Label label = this.labelContentDescription;
        int iHashCode3 = (iHashCode2 + (label == null ? 0 : label.hashCode())) * 31;
        Label label2 = this.inputTextContentDescription;
        int iHashCode4 = (iHashCode3 + (label2 == null ? 0 : label2.hashCode())) * 31;
        Label label3 = this.helperText;
        int iHashCode5 = (((iHashCode4 + (label3 == null ? 0 : label3.hashCode())) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Object obj = this.fieldIndex;
        return ((iHashCode5 + (obj != null ? obj.hashCode() : 0)) * 31) + this.onClick.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Label getLabelContentDescription() {
        return this.labelContentDescription;
    }

    public final er.a<i0> j() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final b getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final hz.b getValidationState() {
        return this.validationState;
    }

    public String toString() {
        return "InputDateTimeData(testTag=" + this.testTag + ", label=" + this.label + ", inputText=" + this.inputText + ", type=" + this.type + ", validationState=" + this.validationState + ", labelContentDescription=" + this.labelContentDescription + ", inputTextContentDescription=" + this.inputTextContentDescription + ", helperText=" + this.helperText + ", enabled=" + this.enabled + ", fieldIndex=" + this.fieldIndex + ", onClick=" + this.onClick + ')';
    }

    public /* synthetic */ InputDateTimeData(String str, Label label, String str2, b bVar, hz.b bVar2, Label label2, Label label3, Label label4, boolean z15, Object obj, er.a aVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, label, (i15 & 4) != 0 ? null : str2, bVar, (i15 & 16) != 0 ? hz.b.C2039b.f86846c : bVar2, (i15 & 32) != 0 ? null : label2, (i15 & 64) != 0 ? null : label3, (i15 & 128) != 0 ? null : label4, (i15 & 256) != 0 ? true : z15, (i15 & 512) != 0 ? null : obj, aVar);
    }
}
