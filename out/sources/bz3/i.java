package bz3;

import b70.RequirementListData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lbz3/i;", "Ll00/e;", "Lbz3/i$a;", "a", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends l00.e<Data> {

    /* JADX INFO: renamed from: bz3.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\b\u0012\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u0012\u0012\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u0012\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010$\u001a\u00020\b2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b&\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b,\u0010?R\u0017\u0010\u0011\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b\u0011\u00103R#\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b9\u0010@\u001a\u0004\bA\u0010BR#\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b<\u0010@\u001a\u0004\bC\u0010BR#\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\b.\u0010@\u001a\u0004\b4\u0010BR#\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00140\u00128\u0006¢\u0006\f\n\u0004\bD\u0010@\u001a\u0004\b:\u0010BR\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00198\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\b0\u0010GR\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00140\u00198\u0006¢\u0006\f\n\u0004\bH\u0010F\u001a\u0004\b8\u0010G¨\u0006I"}, d2 = {"Lbz3/i$a;", "", "Li50/a;", "baseScaffoldData", "Lo40/a;", "headerData", "Lb70/b;", "requirementListData", "", "passwordInputShouldBeFocused", "Lv50/c;", "passwordInputData", "repeatPasswordInputData", "Lhz/b;", "repeatPasswordState", "Lh30/a;", "nextButtonData", "isImeVisible", "Lkotlin/Function1;", "", "Loq/i0;", "onPasswordChanged", "onRepeatedPasswordChanged", "onPasswordInputFocusChanged", "onRepeatPasswordInputFocusChanged", "Lkotlin/Function0;", "onBack", "onReadAccessibilityMessage", "<init>", "(Li50/a;Lo40/a;Lb70/b;ZLv50/c;Lv50/c;Lhz/b;Lh30/a;ZLer/l;Ler/l;Ler/l;Ler/l;Ler/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lo40/a;", "()Lo40/a;", "c", "Lb70/b;", "l", "()Lb70/b;", "d", "Z", "i", "()Z", "e", "Lv50/c;", "h", "()Lv50/c;", "f", "j", "g", "Lhz/b;", "k", "()Lhz/b;", "Lh30/a;", "()Lh30/a;", "Ler/l;", "getOnPasswordChanged", "()Ler/l;", "getOnRepeatedPasswordChanged", "m", "n", "Ler/a;", "()Ler/a;", "o", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final o40.a headerData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final RequirementListData requirementListData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean passwordInputShouldBeFocused;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c passwordInputData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final v50.c repeatPasswordInputData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b repeatPasswordState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButtonData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isImeVisible;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onPasswordChanged;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<String, oq.i0> onRepeatedPasswordChanged;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, oq.i0> onPasswordInputFocusChanged;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, oq.i0> onRepeatPasswordInputFocusChanged;

        /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onBack;

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onReadAccessibilityMessage;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, o40.a aVar, RequirementListData requirementListData, boolean z15, v50.c cVar, v50.c cVar2, hz.b bVar, ButtonData buttonData, boolean z16, er.l<? super String, oq.i0> lVar, er.l<? super String, oq.i0> lVar2, er.l<? super Boolean, oq.i0> lVar3, er.l<? super Boolean, oq.i0> lVar4, er.a<oq.i0> aVar2, er.a<oq.i0> aVar3) {
            this.baseScaffoldData = baseScaffoldData;
            this.headerData = aVar;
            this.requirementListData = requirementListData;
            this.passwordInputShouldBeFocused = z15;
            this.passwordInputData = cVar;
            this.repeatPasswordInputData = cVar2;
            this.repeatPasswordState = bVar;
            this.nextButtonData = buttonData;
            this.isImeVisible = z16;
            this.onPasswordChanged = lVar;
            this.onRepeatedPasswordChanged = lVar2;
            this.onPasswordInputFocusChanged = lVar3;
            this.onRepeatPasswordInputFocusChanged = lVar4;
            this.onBack = aVar2;
            this.onReadAccessibilityMessage = aVar3;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final o40.a getHeaderData() {
            return this.headerData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getNextButtonData() {
            return this.nextButtonData;
        }

        public final er.a<oq.i0> d() {
            return this.onBack;
        }

        public final er.l<Boolean, oq.i0> e() {
            return this.onPasswordInputFocusChanged;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.headerData, data.headerData) && fr.t.c(this.requirementListData, data.requirementListData) && this.passwordInputShouldBeFocused == data.passwordInputShouldBeFocused && fr.t.c(this.passwordInputData, data.passwordInputData) && fr.t.c(this.repeatPasswordInputData, data.repeatPasswordInputData) && fr.t.c(this.repeatPasswordState, data.repeatPasswordState) && fr.t.c(this.nextButtonData, data.nextButtonData) && this.isImeVisible == data.isImeVisible && fr.t.c(this.onPasswordChanged, data.onPasswordChanged) && fr.t.c(this.onRepeatedPasswordChanged, data.onRepeatedPasswordChanged) && fr.t.c(this.onPasswordInputFocusChanged, data.onPasswordInputFocusChanged) && fr.t.c(this.onRepeatPasswordInputFocusChanged, data.onRepeatPasswordInputFocusChanged) && fr.t.c(this.onBack, data.onBack) && fr.t.c(this.onReadAccessibilityMessage, data.onReadAccessibilityMessage);
        }

        public final er.a<oq.i0> f() {
            return this.onReadAccessibilityMessage;
        }

        public final er.l<Boolean, oq.i0> g() {
            return this.onRepeatPasswordInputFocusChanged;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final v50.c getPasswordInputData() {
            return this.passwordInputData;
        }

        public int hashCode() {
            return (((((((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.requirementListData.hashCode()) * 31) + Boolean.hashCode(this.passwordInputShouldBeFocused)) * 31) + this.passwordInputData.hashCode()) * 31) + this.repeatPasswordInputData.hashCode()) * 31) + this.repeatPasswordState.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + Boolean.hashCode(this.isImeVisible)) * 31) + this.onPasswordChanged.hashCode()) * 31) + this.onRepeatedPasswordChanged.hashCode()) * 31) + this.onPasswordInputFocusChanged.hashCode()) * 31) + this.onRepeatPasswordInputFocusChanged.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.onReadAccessibilityMessage.hashCode();
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final boolean getPasswordInputShouldBeFocused() {
            return this.passwordInputShouldBeFocused;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final v50.c getRepeatPasswordInputData() {
            return this.repeatPasswordInputData;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final hz.b getRepeatPasswordState() {
            return this.repeatPasswordState;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final RequirementListData getRequirementListData() {
            return this.requirementListData;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", requirementListData=" + this.requirementListData + ", passwordInputShouldBeFocused=" + this.passwordInputShouldBeFocused + ", passwordInputData=" + this.passwordInputData + ", repeatPasswordInputData=" + this.repeatPasswordInputData + ", repeatPasswordState=" + this.repeatPasswordState + ", nextButtonData=" + this.nextButtonData + ", isImeVisible=" + this.isImeVisible + ", onPasswordChanged=" + this.onPasswordChanged + ", onRepeatedPasswordChanged=" + this.onRepeatedPasswordChanged + ", onPasswordInputFocusChanged=" + this.onPasswordInputFocusChanged + ", onRepeatPasswordInputFocusChanged=" + this.onRepeatPasswordInputFocusChanged + ", onBack=" + this.onBack + ", onReadAccessibilityMessage=" + this.onReadAccessibilityMessage + ')';
        }
    }
}
