package u30;

import fr.k;
import fr.t;
import java.util.List;
import org.bouncycastle.cms.CMSAttributeTableGenerator;
import p071kotlin.Metadata;
import r30.CheckBoxRowData;
import r30.c;

/* JADX INFO: renamed from: u30.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b\u001c\u0010%R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b'\u0010)\u001a\u0004\b \u0010*¨\u0006+"}, d2 = {"Lu30/a;", "", "", "Lr30/a;", "checkboxes", "Lu30/b;", "header", "Lr30/b;", "type", "Lr30/c;", CMSAttributeTableGenerator.CONTENT_TYPE, "", "isEnabled", "fieldIndex", "<init>", "(Ljava/util/List;Lu30/b;Lr30/b;Lr30/c;ZLjava/lang/Object;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lu30/b;", "d", "()Lu30/b;", "c", "Lr30/b;", "e", "()Lr30/b;", "Lr30/c;", "()Lr30/c;", "Z", "f", "()Z", "Ljava/lang/Object;", "()Ljava/lang/Object;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CheckBoxGroupData {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f194954g = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CheckBoxRowData> checkboxes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final CheckBoxHeaderData header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final r30.b type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final c contentType;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object fieldIndex;

    public CheckBoxGroupData(List<CheckBoxRowData> list, CheckBoxHeaderData checkBoxHeaderData, r30.b bVar, c cVar, boolean z15, Object obj) {
        this.checkboxes = list;
        this.header = checkBoxHeaderData;
        this.type = bVar;
        this.contentType = cVar;
        this.isEnabled = z15;
        this.fieldIndex = obj;
    }

    public final List<CheckBoxRowData> a() {
        return this.checkboxes;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Object getFieldIndex() {
        return this.fieldIndex;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final CheckBoxHeaderData getHeader() {
        return this.header;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final r30.b getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CheckBoxGroupData)) {
            return false;
        }
        CheckBoxGroupData checkBoxGroupData = (CheckBoxGroupData) other;
        return t.c(this.checkboxes, checkBoxGroupData.checkboxes) && t.c(this.header, checkBoxGroupData.header) && t.c(this.type, checkBoxGroupData.type) && this.contentType == checkBoxGroupData.contentType && this.isEnabled == checkBoxGroupData.isEnabled && t.c(this.fieldIndex, checkBoxGroupData.fieldIndex);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public int hashCode() {
        int iHashCode = this.checkboxes.hashCode() * 31;
        CheckBoxHeaderData checkBoxHeaderData = this.header;
        int iHashCode2 = (((((((iHashCode + (checkBoxHeaderData == null ? 0 : checkBoxHeaderData.hashCode())) * 31) + this.type.hashCode()) * 31) + this.contentType.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31;
        Object obj = this.fieldIndex;
        return iHashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public String toString() {
        return "CheckBoxGroupData(checkboxes=" + this.checkboxes + ", header=" + this.header + ", type=" + this.type + ", contentType=" + this.contentType + ", isEnabled=" + this.isEnabled + ", fieldIndex=" + this.fieldIndex + ')';
    }

    public /* synthetic */ CheckBoxGroupData(List list, CheckBoxHeaderData checkBoxHeaderData, r30.b bVar, c cVar, boolean z15, Object obj, int i15, k kVar) {
        this(list, (i15 & 2) != 0 ? null : checkBoxHeaderData, (i15 & 4) != 0 ? r30.b.a.f171263a : bVar, (i15 & 8) != 0 ? c.DEFAULT : cVar, (i15 & 16) != 0 ? true : z15, (i15 & 32) != 0 ? null : obj);
    }
}
