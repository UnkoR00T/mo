package nc2;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: nc2.c, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000eB;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJD\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\n2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\"\u001a\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lnc2/c;", "", "Lg30/v;", "bottomSheetValue", "Lnc2/c$a;", "", "descriptionData", "", "Lzz/h;", "files", "", "scrollToField", "<init>", "(Lg30/v;Lnc2/c$a;Ljava/util/List;Z)V", "a", "(Lg30/v;Lnc2/c$a;Ljava/util/List;Z)Lnc2/c;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lg30/v;", "c", "()Lg30/v;", "b", "Lnc2/c$a;", "d", "()Lnc2/c$a;", "Ljava/util/List;", "e", "()Ljava/util/List;", "Z", "f", "()Z", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final g30.v bottomSheetValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final FieldData<String> descriptionData;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<zz.h> files;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToField;

    public State() {
        this(null, null, null, false, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State b(State state, g30.v vVar, FieldData fieldData, List list, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            vVar = state.bottomSheetValue;
        }
        if ((i15 & 2) != 0) {
            fieldData = state.descriptionData;
        }
        if ((i15 & 4) != 0) {
            list = state.files;
        }
        if ((i15 & 8) != 0) {
            z15 = state.scrollToField;
        }
        return state.a(vVar, fieldData, list, z15);
    }

    public final State a(g30.v bottomSheetValue, FieldData<String> descriptionData, List<zz.h> files, boolean scrollToField) {
        return new State(bottomSheetValue, descriptionData, files, scrollToField);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g30.v getBottomSheetValue() {
        return this.bottomSheetValue;
    }

    public final FieldData<String> d() {
        return this.descriptionData;
    }

    public final List<zz.h> e() {
        return this.files;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return this.bottomSheetValue == state.bottomSheetValue && fr.t.c(this.descriptionData, state.descriptionData) && fr.t.c(this.files, state.files) && this.scrollToField == state.scrollToField;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getScrollToField() {
        return this.scrollToField;
    }

    public int hashCode() {
        return (((((this.bottomSheetValue.hashCode() * 31) + this.descriptionData.hashCode()) * 31) + this.files.hashCode()) * 31) + Boolean.hashCode(this.scrollToField);
    }

    public String toString() {
        return "State(bottomSheetValue=" + this.bottomSheetValue + ", descriptionData=" + this.descriptionData + ", files=" + this.files + ", scrollToField=" + this.scrollToField + ')';
    }

    public State(g30.v vVar, FieldData<String> fieldData, List<zz.h> list, boolean z15) {
        this.bottomSheetValue = vVar;
        this.descriptionData = fieldData;
        this.files = list;
        this.scrollToField = z15;
    }

    /* JADX INFO: renamed from: nc2.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\u0012\u0006\u0010\u0003\u001a\u00028\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J*\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0002\u0010\u0003\u001a\u00028\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00028\u00008\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lnc2/c$a;", "T", "", "value", "Lhz/b;", "validationState", "<init>", "(Ljava/lang/Object;Lhz/b;)V", "a", "(Ljava/lang/Object;Lhz/b;)Lnc2/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "d", "()Ljava/lang/Object;", "b", "Lhz/b;", "c", "()Lhz/b;", "identitycardinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FieldData<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f134052c = hz.b.f86845b;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final T value;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        public FieldData(T t15, hz.b bVar) {
            this.value = t15;
            this.validationState = bVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ FieldData b(FieldData fieldData, Object obj, hz.b bVar, int i15, Object obj2) {
            if ((i15 & 1) != 0) {
                obj = fieldData.value;
            }
            if ((i15 & 2) != 0) {
                bVar = fieldData.validationState;
            }
            return fieldData.a(obj, bVar);
        }

        public final FieldData<T> a(T value, hz.b validationState) {
            return new FieldData<>(value, validationState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public final T d() {
            return this.value;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldData)) {
                return false;
            }
            FieldData fieldData = (FieldData) other;
            return fr.t.c(this.value, fieldData.value) && fr.t.c(this.validationState, fieldData.validationState);
        }

        public int hashCode() {
            T t15 = this.value;
            return ((t15 == null ? 0 : t15.hashCode()) * 31) + this.validationState.hashCode();
        }

        public String toString() {
            return "FieldData(value=" + this.value + ", validationState=" + this.validationState + ')';
        }

        public /* synthetic */ FieldData(Object obj, hz.b bVar, int i15, fr.k kVar) {
            this(obj, (i15 & 2) != 0 ? hz.b.d.f86848c : bVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ State(g30.v vVar, FieldData fieldData, List list, boolean z15, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? g30.v.HIDDEN : vVar, (i15 & 2) != 0 ? new FieldData("", null, 2, 0 == true ? 1 : 0) : fieldData, (i15 & 4) != 0 ? new ArrayList() : list, (i15 & 8) != 0 ? false : z15);
    }
}
