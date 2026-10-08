package v83;

import a50.RadioButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j40.DropDownButtonData;
import mx.Label;
import p071kotlin.Metadata;
import t50.TextAreaData;
import x83.CommonScreenData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lv83/e;", "Ll00/e;", "Lv83/e$a;", "a", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lv83/e$a;", "", "a", "b", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: v83.e$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lv83/e$a$a;", "Lv83/e$a;", "<init>", "()V", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class C5338a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5338a f204541a = new C5338a();

            private C5338a() {
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0003\u0006\u0007R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0003\b\t\n¨\u0006\u000bÀ\u0006\u0003"}, d2 = {"Lv83/e$a$b;", "Lv83/e$a;", "Lx83/b;", "b", "()Lx83/b;", "commonData", "c", "a", "Lv83/e$a$b$a;", "Lv83/e$a$b$b;", "Lv83/e$a$b$c;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface b extends a {

            /* JADX INFO: renamed from: v83.e$a$b$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lv83/e$a$b$a;", "Lv83/e$a$b;", "La50/a;", "a", "()La50/a;", "issueRadioButtonData", "b", "Lv83/e$a$b$a$a;", "Lv83/e$a$b$a$b;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public interface InterfaceC5339a extends b {

                /* JADX INFO: renamed from: v83.e$a$b$a$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lv83/e$a$b$a$a;", "Lv83/e$a$b$a;", "Lx83/b;", "commonData", "La50/a;", "issueRadioButtonData", "<init>", "(Lx83/b;La50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lx83/b;", "b", "()Lx83/b;", "La50/a;", "()La50/a;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class DataDisparency implements InterfaceC5339a {

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public static final int f204542c = ((RadioButtonData.f3462h | ButtonTextData.f99099f) | DropDownButtonData.f99359i) | BaseScaffoldData.f89350g;

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final CommonScreenData commonData;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    private final RadioButtonData issueRadioButtonData;

                    public DataDisparency(CommonScreenData commonScreenData, RadioButtonData radioButtonData) {
                        this.commonData = commonScreenData;
                        this.issueRadioButtonData = radioButtonData;
                    }

                    @Override // v83.e.a.b.InterfaceC5339a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public RadioButtonData getIssueRadioButtonData() {
                        return this.issueRadioButtonData;
                    }

                    @Override // v83.e.a.b
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public CommonScreenData getCommonData() {
                        return this.commonData;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof DataDisparency)) {
                            return false;
                        }
                        DataDisparency dataDisparency = (DataDisparency) other;
                        return fr.t.c(this.commonData, dataDisparency.commonData) && fr.t.c(this.issueRadioButtonData, dataDisparency.issueRadioButtonData);
                    }

                    public int hashCode() {
                        return (this.commonData.hashCode() * 31) + this.issueRadioButtonData.hashCode();
                    }

                    public String toString() {
                        return "DataDisparency(commonData=" + this.commonData + ", issueRadioButtonData=" + this.issueRadioButtonData + ')';
                    }
                }

                /* JADX INFO: renamed from: v83.e$a$b$a$b, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lv83/e$a$b$a$b;", "Lv83/e$a$b$a;", "Lx83/b;", "commonData", "La50/a;", "issueRadioButtonData", "Lt50/d;", "descriptionTextAreaData", "<init>", "(Lx83/b;La50/a;Lt50/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lx83/b;", "b", "()Lx83/b;", "La50/a;", "()La50/a;", "c", "Lt50/d;", "()Lt50/d;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class Other implements InterfaceC5339a {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public static final int f204545d = (((TextAreaData.f187694o | RadioButtonData.f3462h) | ButtonTextData.f99099f) | DropDownButtonData.f99359i) | BaseScaffoldData.f89350g;

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final CommonScreenData commonData;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    private final RadioButtonData issueRadioButtonData;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                    private final TextAreaData descriptionTextAreaData;

                    public Other(CommonScreenData commonScreenData, RadioButtonData radioButtonData, TextAreaData textAreaData) {
                        this.commonData = commonScreenData;
                        this.issueRadioButtonData = radioButtonData;
                        this.descriptionTextAreaData = textAreaData;
                    }

                    @Override // v83.e.a.b.InterfaceC5339a
                    /* JADX INFO: renamed from: a, reason: from getter */
                    public RadioButtonData getIssueRadioButtonData() {
                        return this.issueRadioButtonData;
                    }

                    @Override // v83.e.a.b
                    /* JADX INFO: renamed from: b, reason: from getter */
                    public CommonScreenData getCommonData() {
                        return this.commonData;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final TextAreaData getDescriptionTextAreaData() {
                        return this.descriptionTextAreaData;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof Other)) {
                            return false;
                        }
                        Other other2 = (Other) other;
                        return fr.t.c(this.commonData, other2.commonData) && fr.t.c(this.issueRadioButtonData, other2.issueRadioButtonData) && fr.t.c(this.descriptionTextAreaData, other2.descriptionTextAreaData);
                    }

                    public int hashCode() {
                        return (((this.commonData.hashCode() * 31) + this.issueRadioButtonData.hashCode()) * 31) + this.descriptionTextAreaData.hashCode();
                    }

                    public String toString() {
                        return "Other(commonData=" + this.commonData + ", issueRadioButtonData=" + this.issueRadioButtonData + ", descriptionTextAreaData=" + this.descriptionTextAreaData + ')';
                    }
                }

                /* JADX INFO: renamed from: a */
                RadioButtonData getIssueRadioButtonData();
            }

            /* JADX INFO: renamed from: v83.e$a$b$b, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lv83/e$a$b$b;", "Lv83/e$a$b;", "Lx83/b;", "commonData", "Lt50/d;", "descriptionTextAreaData", "<init>", "(Lx83/b;Lt50/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lx83/b;", "b", "()Lx83/b;", "Lt50/d;", "c", "()Lt50/d;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Generic implements b {

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final int f204549c = ((TextAreaData.f187694o | ButtonTextData.f99099f) | DropDownButtonData.f99359i) | BaseScaffoldData.f89350g;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final CommonScreenData commonData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final TextAreaData descriptionTextAreaData;

                public Generic(CommonScreenData commonScreenData, TextAreaData textAreaData) {
                    this.commonData = commonScreenData;
                    this.descriptionTextAreaData = textAreaData;
                }

                @Override // v83.e.a.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public CommonScreenData getCommonData() {
                    return this.commonData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final TextAreaData getDescriptionTextAreaData() {
                    return this.descriptionTextAreaData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Generic)) {
                        return false;
                    }
                    Generic generic = (Generic) other;
                    return fr.t.c(this.commonData, generic.commonData) && fr.t.c(this.descriptionTextAreaData, generic.descriptionTextAreaData);
                }

                public int hashCode() {
                    return (this.commonData.hashCode() * 31) + this.descriptionTextAreaData.hashCode();
                }

                public String toString() {
                    return "Generic(commonData=" + this.commonData + ", descriptionTextAreaData=" + this.descriptionTextAreaData + ')';
                }
            }

            /* JADX INFO: renamed from: v83.e$a$b$c, reason: from toString */
            @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b(\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b#\u0010/¨\u00060"}, d2 = {"Lv83/e$a$b$c;", "Lv83/e$a$b;", "Lx83/b;", "commonData", "Lv50/c;", "vehicleNumberTextFieldData", "namesTextFieldData", "Lmx/a;", "statusLabel", "La50/a;", "statusRadioButtonData", "Lj40/a;", "reasonDropDownData", "Lt50/d;", "descriptionTextAreaData", "<init>", "(Lx83/b;Lv50/c;Lv50/c;Lmx/a;La50/a;Lj40/a;Lt50/d;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lx83/b;", "b", "()Lx83/b;", "Lv50/c;", "h", "()Lv50/c;", "c", "d", "Lmx/a;", "f", "()Lmx/a;", "e", "La50/a;", "g", "()La50/a;", "Lj40/a;", "()Lj40/a;", "Lt50/d;", "()Lt50/d;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class VehicleCard implements b {

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public static final int f204552h;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final CommonScreenData commonData;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final v50.c vehicleNumberTextFieldData;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final v50.c namesTextFieldData;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label statusLabel;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final RadioButtonData statusRadioButtonData;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final DropDownButtonData reasonDropDownData;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final TextAreaData descriptionTextAreaData;

                static {
                    int i15 = TextAreaData.f187694o;
                    int i16 = DropDownButtonData.f99359i;
                    int i17 = i15 | i16 | RadioButtonData.f3462h;
                    int i18 = v50.c.f203957t;
                    f204552h = i17 | i18 | i18 | ButtonTextData.f99099f | i16 | BaseScaffoldData.f89350g;
                }

                public VehicleCard(CommonScreenData commonScreenData, v50.c cVar, v50.c cVar2, Label label, RadioButtonData radioButtonData, DropDownButtonData dropDownButtonData, TextAreaData textAreaData) {
                    this.commonData = commonScreenData;
                    this.vehicleNumberTextFieldData = cVar;
                    this.namesTextFieldData = cVar2;
                    this.statusLabel = label;
                    this.statusRadioButtonData = radioButtonData;
                    this.reasonDropDownData = dropDownButtonData;
                    this.descriptionTextAreaData = textAreaData;
                }

                @Override // v83.e.a.b
                /* JADX INFO: renamed from: b, reason: from getter */
                public CommonScreenData getCommonData() {
                    return this.commonData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final TextAreaData getDescriptionTextAreaData() {
                    return this.descriptionTextAreaData;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final v50.c getNamesTextFieldData() {
                    return this.namesTextFieldData;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final DropDownButtonData getReasonDropDownData() {
                    return this.reasonDropDownData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof VehicleCard)) {
                        return false;
                    }
                    VehicleCard vehicleCard = (VehicleCard) other;
                    return fr.t.c(this.commonData, vehicleCard.commonData) && fr.t.c(this.vehicleNumberTextFieldData, vehicleCard.vehicleNumberTextFieldData) && fr.t.c(this.namesTextFieldData, vehicleCard.namesTextFieldData) && fr.t.c(this.statusLabel, vehicleCard.statusLabel) && fr.t.c(this.statusRadioButtonData, vehicleCard.statusRadioButtonData) && fr.t.c(this.reasonDropDownData, vehicleCard.reasonDropDownData) && fr.t.c(this.descriptionTextAreaData, vehicleCard.descriptionTextAreaData);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final Label getStatusLabel() {
                    return this.statusLabel;
                }

                /* JADX INFO: renamed from: g, reason: from getter */
                public final RadioButtonData getStatusRadioButtonData() {
                    return this.statusRadioButtonData;
                }

                /* JADX INFO: renamed from: h, reason: from getter */
                public final v50.c getVehicleNumberTextFieldData() {
                    return this.vehicleNumberTextFieldData;
                }

                public int hashCode() {
                    return (((((((((((this.commonData.hashCode() * 31) + this.vehicleNumberTextFieldData.hashCode()) * 31) + this.namesTextFieldData.hashCode()) * 31) + this.statusLabel.hashCode()) * 31) + this.statusRadioButtonData.hashCode()) * 31) + this.reasonDropDownData.hashCode()) * 31) + this.descriptionTextAreaData.hashCode();
                }

                public String toString() {
                    return "VehicleCard(commonData=" + this.commonData + ", vehicleNumberTextFieldData=" + this.vehicleNumberTextFieldData + ", namesTextFieldData=" + this.namesTextFieldData + ", statusLabel=" + this.statusLabel + ", statusRadioButtonData=" + this.statusRadioButtonData + ", reasonDropDownData=" + this.reasonDropDownData + ", descriptionTextAreaData=" + this.descriptionTextAreaData + ')';
                }
            }

            /* JADX INFO: renamed from: b */
            CommonScreenData getCommonData();
        }
    }
}
