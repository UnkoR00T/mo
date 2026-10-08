package w30;

import fr.k;
import fr.t;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import r30.b;
import r30.c;

/* JADX INFO: renamed from: w30.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\fJD\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b%\u0010'¨\u0006("}, d2 = {"Lw30/a;", "", "Lr30/a;", "checkbox", "Lr30/b;", "type", "Lr30/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "isEnabled", "fieldIndex", "<init>", "(Lr30/a;Lr30/b;Lr30/c;ZLjava/lang/Object;)V", "a", "(Lr30/a;Lr30/b;Lr30/c;ZLjava/lang/Object;)Lw30/a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lr30/a;", "c", "()Lr30/a;", "b", "Lr30/b;", "f", "()Lr30/b;", "Lr30/c;", "d", "()Lr30/c;", "Z", "g", "()Z", "e", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckBoxSingleData {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f210090f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckBoxRowData checkbox;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final c contentType;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object fieldIndex;

    public CheckBoxSingleData(CheckBoxRowData checkBoxRowData, b bVar, c cVar, boolean z15, Object obj) {
        this.checkbox = checkBoxRowData;
        this.type = bVar;
        this.contentType = cVar;
        this.isEnabled = z15;
        this.fieldIndex = obj;
    }

    public static /* synthetic */ CheckBoxSingleData b(CheckBoxSingleData checkBoxSingleData, CheckBoxRowData checkBoxRowData, b bVar, c cVar, boolean z15, Object obj, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            checkBoxRowData = checkBoxSingleData.checkbox;
        }
        if ((i15 & 2) != 0) {
            bVar = checkBoxSingleData.type;
        }
        if ((i15 & 4) != 0) {
            cVar = checkBoxSingleData.contentType;
        }
        if ((i15 & 8) != 0) {
            z15 = checkBoxSingleData.isEnabled;
        }
        if ((i15 & 16) != 0) {
            obj = checkBoxSingleData.fieldIndex;
        }
        Object obj3 = obj;
        c cVar2 = cVar;
        return checkBoxSingleData.a(checkBoxRowData, bVar, cVar2, z15, obj3);
    }

    public final CheckBoxSingleData a(CheckBoxRowData checkbox, b type, c contentType, boolean isEnabled, Object fieldIndex) {
        return new CheckBoxSingleData(checkbox, type, contentType, isEnabled, fieldIndex);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final CheckBoxRowData getCheckbox() {
        return this.checkbox;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Object getFieldIndex() {
        return this.fieldIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckBoxSingleData)) {
            return false;
        }
        CheckBoxSingleData checkBoxSingleData = (CheckBoxSingleData) other;
        return t.c(this.checkbox, checkBoxSingleData.checkbox) && t.c(this.type, checkBoxSingleData.type) && this.contentType == checkBoxSingleData.contentType && this.isEnabled == checkBoxSingleData.isEnabled && t.c(this.fieldIndex, checkBoxSingleData.fieldIndex);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final b getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public int hashCode() {
        int iHashCode = ((((((this.checkbox.hashCode() * 31) + this.type.hashCode()) * 31) + this.contentType.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        Object obj = this.fieldIndex;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "CheckBoxSingleData(checkbox=" + this.checkbox + ", type=" + this.type + ", contentType=" + this.contentType + ", isEnabled=" + this.isEnabled + ", fieldIndex=" + this.fieldIndex + ')';
    }

    public /* synthetic */ CheckBoxSingleData(CheckBoxRowData checkBoxRowData, b bVar, c cVar, boolean z15, Object obj, int i15, k kVar) {
        this(checkBoxRowData, (i15 & 2) != 0 ? b.a.f171263a : bVar, (i15 & 4) != 0 ? c.DEFAULT : cVar, (i15 & 8) != 0 ? true : z15, (i15 & 16) != 0 ? null : obj);
    }
}
