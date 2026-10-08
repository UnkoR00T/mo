package w83;

import a50.RadioButtonData;
import b50.RadioButtonItemData;
import b50.RadioButtonRow;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j40.DropDownButtonData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import oo0.BEReportIssueReason;
import oo0.CategoryTopics;
import oo0.Topic;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import t50.TextAreaData;
import t50.s;
import x50.NavigationButtonData;
import x83.CommonScreenData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00018B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00112\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u00182\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001b*\b\u0012\u0004\u0012\u00020\u001c0\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJS\u0010)\u001a\u00020(2\u0006\u0010\n\u001a\u00020 2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0!2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020#0!H\u0002¢\u0006\u0004\b)\u0010*J\u001f\u0010.\u001a\u00020-*\u0004\u0018\u00010+2\b\b\u0002\u0010,\u001a\u00020\u001dH\u0002¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u000200*\u0004\u0018\u00010+2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u001dH\u0002¢\u0006\u0004\b1\u00102J\u0013\u00104\u001a\u00020\u0015*\u000203H\u0002¢\u0006\u0004\b4\u00105J\u0018\u00106\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b6\u00107R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109¨\u0006:"}, d2 = {"Lw83/q;", "Lxw/f;", "Lw83/q$a;", "Lv83/e$a;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "Lv83/d$b;", "state", "Lv83/e$a$b$c;", "I", "(Lw83/q$a;Lv83/d$b;)Lv83/e$a$b$c;", "Lv83/e$a$b$a;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lw83/q$a;Lv83/d$b;)Lv83/e$a$b$a;", "La50/a;", "Q", "(Lw83/q$a;Lv83/d$b;)La50/a;", "T", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lv83/d$b;)Z", "Lx83/b;", "x", "(Lw83/q$a;Lv83/d$b;)Lx83/b;", "", "Loo0/d;", "Lmx/a;", "a0", "(Ljava/util/List;)Ljava/util/List;", "Lv83/d;", "Lkotlin/Function1;", "", "Loq/i0;", "descriptionOnValueChanged", "Lv83/c;", "clearValidation", "validateField", "Lt50/d;", "E", "(Lv83/d;Ler/l;Ler/l;Ler/l;)Lt50/d;", "Lhz/b;", "helperText", "Lt50/e;", "Z", "(Lhz/b;Lmx/a;)Lt50/e;", "Lj40/m;", "X", "(Lhz/b;Lmx/a;)Lj40/m;", "Loo0/u$b;", "W", "(Loo0/u$b;)Z", "O", "(Lw83/q$a;)Lv83/e$a;", "a", "Lmx/c;", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements xw.f<Params, v83.e.a> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: w83.q$a, reason: from toString */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001Bç\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\b\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b'\u0010)R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010)R#\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b*\u0010-R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b.\u0010(\u001a\u0004\b/\u0010)R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b0\u0010(\u001a\u0004\b0\u0010)R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010-R#\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b.\u0010-R#\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b1\u0010-R#\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b4\u0010-R#\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b%\u0010,\u001a\u0004\b3\u0010-R#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b5\u0010-R#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b2\u0010,\u001a\u0004\b#\u0010-¨\u00066"}, d2 = {"Lw83/q$a;", "", "Lv83/d;", "state", "Lkotlin/Function0;", "Loq/i0;", "closeNavigation", "nextButtonClick", "Lkotlin/Function1;", "", "descriptionOnValueChanged", "onTopicClick", "onInfoButtonClick", "vehicleNumberOnValueChanged", "Lx83/c;", "onDrivingLicenceIssueTypeClick", "Lj40/a;", "onShowReportReasonListClick", "Lx83/f;", "onVehicleOwnerStatusSelected", "onVehicleOwnerNamesInputChanged", "Lv83/c;", "validateField", "clearValidation", "<init>", "(Lv83/d;Ler/a;Ler/a;Ler/l;Ler/a;Ler/a;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv83/d;", "k", "()Lv83/d;", "b", "Ler/a;", "()Ler/a;", "c", "d", "Ler/l;", "()Ler/l;", "e", "h", "f", "g", "m", "i", "j", "l", "technicalsupport_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final v83.d state;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> closeNavigation;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> nextButtonClick;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> descriptionOnValueChanged;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onTopicClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onInfoButtonClick;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> vehicleNumberOnValueChanged;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<x83.c, i0> onDrivingLicenceIssueTypeClick;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<DropDownButtonData, i0> onShowReportReasonListClick;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<x83.f, i0> onVehicleOwnerStatusSelected;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, i0> onVehicleOwnerNamesInputChanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<v83.c, i0> validateField;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<v83.c, i0> clearValidation;

        /* JADX WARN: Multi-variable type inference failed */
        public Params(v83.d dVar, er.a<i0> aVar, er.a<i0> aVar2, er.l<? super String, i0> lVar, er.a<i0> aVar3, er.a<i0> aVar4, er.l<? super String, i0> lVar2, er.l<? super x83.c, i0> lVar3, er.l<? super DropDownButtonData, i0> lVar4, er.l<? super x83.f, i0> lVar5, er.l<? super String, i0> lVar6, er.l<? super v83.c, i0> lVar7, er.l<? super v83.c, i0> lVar8) {
            this.state = dVar;
            this.closeNavigation = aVar;
            this.nextButtonClick = aVar2;
            this.descriptionOnValueChanged = lVar;
            this.onTopicClick = aVar3;
            this.onInfoButtonClick = aVar4;
            this.vehicleNumberOnValueChanged = lVar2;
            this.onDrivingLicenceIssueTypeClick = lVar3;
            this.onShowReportReasonListClick = lVar4;
            this.onVehicleOwnerStatusSelected = lVar5;
            this.onVehicleOwnerNamesInputChanged = lVar6;
            this.validateField = lVar7;
            this.clearValidation = lVar8;
        }

        public final er.l<v83.c, i0> a() {
            return this.clearValidation;
        }

        public final er.a<i0> b() {
            return this.closeNavigation;
        }

        public final er.l<String, i0> c() {
            return this.descriptionOnValueChanged;
        }

        public final er.a<i0> d() {
            return this.nextButtonClick;
        }

        public final er.l<x83.c, i0> e() {
            return this.onDrivingLicenceIssueTypeClick;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.state, params.state) && t.c(this.closeNavigation, params.closeNavigation) && t.c(this.nextButtonClick, params.nextButtonClick) && t.c(this.descriptionOnValueChanged, params.descriptionOnValueChanged) && t.c(this.onTopicClick, params.onTopicClick) && t.c(this.onInfoButtonClick, params.onInfoButtonClick) && t.c(this.vehicleNumberOnValueChanged, params.vehicleNumberOnValueChanged) && t.c(this.onDrivingLicenceIssueTypeClick, params.onDrivingLicenceIssueTypeClick) && t.c(this.onShowReportReasonListClick, params.onShowReportReasonListClick) && t.c(this.onVehicleOwnerStatusSelected, params.onVehicleOwnerStatusSelected) && t.c(this.onVehicleOwnerNamesInputChanged, params.onVehicleOwnerNamesInputChanged) && t.c(this.validateField, params.validateField) && t.c(this.clearValidation, params.clearValidation);
        }

        public final er.a<i0> f() {
            return this.onInfoButtonClick;
        }

        public final er.l<DropDownButtonData, i0> g() {
            return this.onShowReportReasonListClick;
        }

        public final er.a<i0> h() {
            return this.onTopicClick;
        }

        public int hashCode() {
            return (((((((((((((((((((((((this.state.hashCode() * 31) + this.closeNavigation.hashCode()) * 31) + this.nextButtonClick.hashCode()) * 31) + this.descriptionOnValueChanged.hashCode()) * 31) + this.onTopicClick.hashCode()) * 31) + this.onInfoButtonClick.hashCode()) * 31) + this.vehicleNumberOnValueChanged.hashCode()) * 31) + this.onDrivingLicenceIssueTypeClick.hashCode()) * 31) + this.onShowReportReasonListClick.hashCode()) * 31) + this.onVehicleOwnerStatusSelected.hashCode()) * 31) + this.onVehicleOwnerNamesInputChanged.hashCode()) * 31) + this.validateField.hashCode()) * 31) + this.clearValidation.hashCode();
        }

        public final er.l<String, i0> i() {
            return this.onVehicleOwnerNamesInputChanged;
        }

        public final er.l<x83.f, i0> j() {
            return this.onVehicleOwnerStatusSelected;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final v83.d getState() {
            return this.state;
        }

        public final er.l<v83.c, i0> l() {
            return this.validateField;
        }

        public final er.l<String, i0> m() {
            return this.vehicleNumberOnValueChanged;
        }

        public String toString() {
            return "Params(state=" + this.state + ", closeNavigation=" + this.closeNavigation + ", nextButtonClick=" + this.nextButtonClick + ", descriptionOnValueChanged=" + this.descriptionOnValueChanged + ", onTopicClick=" + this.onTopicClick + ", onInfoButtonClick=" + this.onInfoButtonClick + ", vehicleNumberOnValueChanged=" + this.vehicleNumberOnValueChanged + ", onDrivingLicenceIssueTypeClick=" + this.onDrivingLicenceIssueTypeClick + ", onShowReportReasonListClick=" + this.onShowReportReasonListClick + ", onVehicleOwnerStatusSelected=" + this.onVehicleOwnerStatusSelected + ", onVehicleOwnerNamesInputChanged=" + this.onVehicleOwnerNamesInputChanged + ", validateField=" + this.validateField + ", clearValidation=" + this.clearValidation + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f211094a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f211095b;

        static {
            int[] iArr = new int[Topic.b.values().length];
            try {
                iArr[Topic.b.VEHICLE_CARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Topic.b.DRIVING_LICENCE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Topic.b.MOBILE_ID_CARD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Topic.b.FAMILY_CARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Topic.b.SCHOOL_STUDENT_CARD.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Topic.b.UNIVERSITY_STUDENT_CARD.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Topic.b.ADVOCATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Topic.b.NURSE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Topic.b.MIDWIFE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Topic.b.DOCTOR.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Topic.b.DENTIST.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Topic.b.PENALTY_POINTS.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Topic.b.MEDICAL_PRESCRIPTIONS.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Topic.b.TRAIN_TICKETS.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Topic.b.MKA_CARD.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Topic.b.TRUSTED_PROFILE_BANKING.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f211094a = iArr;
            int[] iArr2 = new int[x83.c.values().length];
            try {
                iArr2[x83.c.DATA_DISCREPANCY.ordinal()] = 1;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr2[x83.c.OTHER_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused18) {
            }
            f211095b = iArr2;
        }
    }

    public q(mx.c cVar) {
        this.labelProvider = cVar;
    }

    private final TextAreaData E(v83.d state, final er.l<? super String, i0> descriptionOnValueChanged, final er.l<? super v83.c, i0> clearValidation, final er.l<? super v83.c, i0> validateField) {
        String strD;
        t50.e eVarZ;
        int iE = v4.t.INSTANCE.e();
        s.Fix fix = new s.Fix(4);
        Label labelC = this.labelProvider.c(l83.a.A);
        boolean z15 = state instanceof v83.d.Initialized;
        if (z15) {
            strD = ((v83.d.Initialized) state).getCommonFormData().d().d();
        } else {
            if (!t.c(state, v83.d.a.f204535a)) {
                throw new oq.p();
            }
            strD = "";
        }
        String str = strD;
        t50.a.C4878a c4878a = t50.a.C4878a.f187691a;
        Label labelC2 = this.labelProvider.c(l83.a.f117018z);
        if (z15) {
            eVarZ = Z(((v83.d.Initialized) state).getCommonFormData().d().getValidationState(), this.labelProvider.c(l83.a.f117016y));
        } else {
            if (!t.c(state, v83.d.a.f204535a)) {
                throw new oq.p();
            }
            eVarZ = Z(hz.b.C2039b.f86846c, this.labelProvider.c(l83.a.f117016y));
        }
        return new TextAreaData(null, labelC, fix, null, eVarZ, str, false, c4878a, labelC2, iE, null, null, new er.l() { // from class: w83.f
            @Override // er.l
            public final Object b(Object obj) {
                return q.F(descriptionOnValueChanged, (String) obj);
            }
        }, new er.l() { // from class: w83.g
            @Override // er.l
            public final Object b(Object obj) {
                return q.G(clearValidation, validateField, ((Boolean) obj).booleanValue());
            }
        }, 3145, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(er.l lVar, String str) {
        lVar.b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(er.l lVar, er.l lVar2, boolean z15) {
        if (z15) {
            lVar.b(v83.c.DESCRIPTION);
        } else {
            lVar2.b(v83.c.DESCRIPTION);
        }
        return i0.f148189a;
    }

    private final v83.e.a.b.InterfaceC5339a H(Params params, v83.d.Initialized state) {
        int i15 = b.f211095b[state.getDrivingLicenceIssueType().ordinal()];
        if (i15 == 1) {
            return new v83.e.a.b.InterfaceC5339a.DataDisparency(x(params, state), Q(params, state));
        }
        if (i15 != 2) {
            throw new oq.p();
        }
        return new v83.e.a.b.InterfaceC5339a.Other(x(params, state), Q(params, state), E(params.getState(), params.c(), params.a(), params.l()));
    }

    private final v83.e.a.b.VehicleCard I(final Params params, v83.d.Initialized state) {
        Integer numValueOf;
        CommonScreenData commonScreenDataX = x(params, state);
        Label labelC = this.labelProvider.c(l83.a.N0);
        Label labelB = mx.b.b(state.getVehicleCardData().f().c(), "vehicleNumberValue");
        Label.Companion companion = Label.INSTANCE;
        Label labelC2 = companion.c();
        hz.b bVar = state.getVehicleCardData().c().get(v83.c.VEHICLE_NUMBER);
        if (bVar == null) {
            bVar = hz.b.C2039b.f86846c;
        }
        v50.c.Text text = new v50.c.Text(null, labelC, labelC2, labelB, bVar, null, null, new er.l() { // from class: w83.k
            @Override // er.l
            public final Object b(Object obj) {
                return q.J(params, (String) obj);
            }
        }, new er.l() { // from class: w83.l
            @Override // er.l
            public final Object b(Object obj) {
                return q.K(params, ((Boolean) obj).booleanValue());
            }
        }, false, 0, null, true, null, false, null, null, null, null, null, 1027681, null);
        Label labelC3 = this.labelProvider.c(l83.a.I0);
        Label labelB2 = mx.b.b(state.getVehicleCardData().h().c(), "userNamesText");
        Label labelC4 = companion.c();
        hz.b bVar2 = state.getVehicleCardData().c().get(v83.c.OWNER_NAMES);
        if (bVar2 == null) {
            bVar2 = hz.b.C2039b.f86846c;
        }
        v50.c.Text text2 = new v50.c.Text(null, labelC3, labelC4, labelB2, bVar2, this.labelProvider.c(l83.a.H0), null, new er.l() { // from class: w83.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.L(params, (String) obj);
            }
        }, new er.l() { // from class: w83.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.M(params, ((Boolean) obj).booleanValue());
            }
        }, false, 0, null, true, null, false, null, null, null, null, null, 1027649, null);
        Label labelC5 = this.labelProvider.c(l83.a.M0);
        RadioButtonData radioButtonDataT = T(params, state);
        Label labelC6 = this.labelProvider.c(l83.a.K0);
        Label labelC7 = this.labelProvider.c(l83.a.f116992m);
        List<BEReportIssueReason> listG = state.getVehicleCardData().g();
        ArrayList arrayList = new ArrayList(v.y(listG, 10));
        for (BEReportIssueReason bEReportIssueReason : listG) {
            arrayList.add(mx.b.b(bEReportIssueReason.getLabel(), bEReportIssueReason.getLabel()));
        }
        BEReportIssueReason bEReportIssueReasonC = state.getVehicleCardData().d().c();
        if (bEReportIssueReasonC != null) {
            Iterator<BEReportIssueReason> it = state.getVehicleCardData().g().iterator();
            int i15 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i15 = -1;
                    break;
                }
                if (it.next().getType() == bEReportIssueReasonC.getType()) {
                    break;
                }
                i15++;
            }
            numValueOf = Integer.valueOf(i15);
        } else {
            numValueOf = null;
        }
        return new v83.e.a.b.VehicleCard(commonScreenDataX, text, text2, labelC5, radioButtonDataT, new DropDownButtonData(labelC6, arrayList, numValueOf, Y(this, state.getVehicleCardData().c().get(v83.c.REPORT_REASON), null, 1, null), labelC7, false, null, new er.l() { // from class: w83.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.N(params, (DropDownButtonData) obj);
            }
        }, 96, null), E(params.getState(), params.c(), params.a(), params.l()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(Params params, String str) {
        params.m().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(Params params, boolean z15) {
        if (z15) {
            params.a().b(v83.c.VEHICLE_NUMBER);
        } else {
            params.l().b(v83.c.VEHICLE_NUMBER);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 L(Params params, String str) {
        params.i().b(str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 M(Params params, boolean z15) {
        if (z15) {
            params.a().b(v83.c.OWNER_NAMES);
        } else {
            params.l().b(v83.c.OWNER_NAMES);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 N(Params params, DropDownButtonData dropDownButtonData) {
        params.g().b(dropDownButtonData);
        return i0.f148189a;
    }

    private final boolean P(v83.d.Initialized initialized) {
        Topic topicD = initialized.getCommonFormData().e().d();
        return (topicD != null ? topicD.getType() : null) == Topic.b.DRIVING_LICENCE && initialized.getDrivingLicenceIssueType() == x83.c.DATA_DISCREPANCY;
    }

    private final RadioButtonData Q(final Params params, v83.d.Initialized state) {
        return new RadioButtonData(v.q(new RadioButtonRow(new RadioButtonItemData(false, state.getDrivingLicenceIssueType() == x83.c.DATA_DISCREPANCY, false, 5, null), new er.a() { // from class: w83.i
            @Override // er.a
            public final Object a() {
                return q.R(params);
            }
        }, this.labelProvider.c(l83.a.K), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, state.getDrivingLicenceIssueType() == x83.c.OTHER_ERROR, false, 5, null), new er.a() { // from class: w83.j
            @Override // er.a
            public final Object a() {
                return q.S(params);
            }
        }, this.labelProvider.c(l83.a.L), null, null, 24, null)), b50.e.b.f16685a, null, null, null, null, null, 124, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 R(Params params) {
        params.e().b(x83.c.DATA_DISCREPANCY);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 S(Params params) {
        params.e().b(x83.c.OTHER_ERROR);
        return i0.f148189a;
    }

    private final RadioButtonData T(final Params params, v83.d.Initialized state) {
        hz.b bVar = state.getVehicleCardData().c().get(v83.c.OWNERSHIP_STATUS);
        return new RadioButtonData(v.q(new RadioButtonRow(new RadioButtonItemData(false, state.getVehicleCardData().e().c() == x83.f.OWNER, false, 5, null), new er.a() { // from class: w83.e
            @Override // er.a
            public final Object a() {
                return q.U(params);
            }
        }, this.labelProvider.c(l83.a.L0), null, null, 24, null), new RadioButtonRow(new RadioButtonItemData(false, state.getVehicleCardData().e().c() == x83.f.COOWNER, false, 5, null), new er.a() { // from class: w83.h
            @Override // er.a
            public final Object a() {
                return q.V(params);
            }
        }, this.labelProvider.c(l83.a.E0), null, null, 24, null)), b50.e.b.f16685a, bVar instanceof hz.b.Invalid ? new b50.d.Error(((hz.b.Invalid) bVar).getMessage()) : b50.d.c.f16683a, null, null, null, null, 120, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U(Params params) {
        params.j().b(x83.f.OWNER);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V(Params params) {
        params.j().b(x83.f.COOWNER);
        return i0.f148189a;
    }

    private final boolean W(Topic.b bVar) {
        switch (b.f211094a[bVar.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
                return true;
            default:
                return false;
        }
    }

    private final j40.m X(hz.b bVar, Label label) {
        return bVar instanceof hz.b.Invalid ? new j40.m.Error(((hz.b.Invalid) bVar).getMessage()) : new j40.m.Enabled(label);
    }

    static /* synthetic */ j40.m Y(q qVar, hz.b bVar, Label label, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = null;
        }
        return qVar.X(bVar, label);
    }

    private final t50.e Z(hz.b bVar, Label label) {
        return bVar instanceof hz.b.Invalid ? new t50.e.Error(((hz.b.Invalid) bVar).getMessage()) : new t50.e.Default(label);
    }

    private final List<Label> a0(List<CategoryTopics> list) {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            List<Topic> listD = ((CategoryTopics) it.next()).d();
            if (listD == null) {
                listD = v.n();
            }
            v.D(arrayList, listD);
        }
        ArrayList arrayList2 = new ArrayList(v.y(arrayList, 10));
        int i15 = 0;
        for (Object obj : arrayList) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            arrayList2.add(mx.b.b(((Topic) obj).getLabel(), "initialSelectedItem_" + i15));
            i15 = i16;
        }
        return arrayList2;
    }

    private final CommonScreenData x(final Params params, v83.d.Initialized state) {
        ButtonTextData buttonTextData;
        Integer numValueOf;
        Topic.b type;
        BaseScaffoldData baseScaffoldData = new BaseScaffoldData(null, new x50.i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), params.b()), this.labelProvider.c(l83.a.A0), null, null, null, 28, null), null, null, null, null, 61, null);
        er.a<i0> aVarB = params.b();
        Label labelC = this.labelProvider.c(l83.a.f116979f0);
        Topic topicD = state.getCommonFormData().e().d();
        int i15 = 0;
        boolean zW = (topicD == null || (type = topicD.getType()) == null) ? false : W(type);
        if (!zW) {
            buttonTextData = null;
        } else {
            if (!zW) {
                throw new oq.p();
            }
            buttonTextData = new ButtonTextData(null, this.labelProvider.c(l83.a.f116971b0), null, null, params.f(), 13, null);
        }
        Label labelC2 = this.labelProvider.c(l83.a.B0);
        ButtonData buttonData = new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(this.labelProvider.c(P(state) ? l83.a.f116976e : l83.a.f117014x), null, 2, null), k30.d.a.f107773a, null, params.d(), 35, null);
        Label labelC3 = this.labelProvider.c(l83.a.D0);
        Label labelC4 = this.labelProvider.c(l83.a.C0);
        List<Label> listA0 = a0(state.getCommonFormData().c());
        Topic topicD2 = state.getCommonFormData().e().d();
        if (topicD2 != null) {
            Iterator<Label> it = a0(state.getCommonFormData().c()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    i15 = -1;
                    break;
                }
                if (t.c(it.next().getText(), topicD2.getLabel())) {
                    break;
                }
                i15++;
            }
            numValueOf = Integer.valueOf(i15);
        } else {
            numValueOf = null;
        }
        return new CommonScreenData(baseScaffoldData, aVarB, labelC, new DropDownButtonData(labelC3, listA0, numValueOf, Y(this, state.getCommonFormData().e().getValidationState(), null, 1, null), labelC4, false, null, new er.l() { // from class: w83.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.z(params, (DropDownButtonData) obj);
            }
        }, 96, null), labelC2, buttonData, buttonTextData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Params params, DropDownButtonData dropDownButtonData) {
        params.h().a();
        return i0.f148189a;
    }

    @Override // er.l
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public v83.e.a b(Params params) {
        v83.d state = params.getState();
        if (t.c(state, v83.d.a.f204535a)) {
            return v83.e.a.C5338a.f204541a;
        }
        if (!(state instanceof v83.d.Initialized)) {
            throw new oq.p();
        }
        v83.d.Initialized initialized = (v83.d.Initialized) state;
        Topic topicD = initialized.getCommonFormData().e().d();
        Topic.b type = topicD != null ? topicD.getType() : null;
        int i15 = type == null ? -1 : b.f211094a[type.ordinal()];
        if (i15 == 1) {
            return I(params, initialized);
        }
        if (i15 != 2) {
            return new v83.e.a.b.Generic(x(params, initialized), E((v83.d.Initialized) params.getState(), params.c(), params.a(), params.l()));
        }
        return H(params, initialized);
    }
}
