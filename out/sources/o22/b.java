package o22;

import java.util.ArrayList;
import java.util.List;
import p071kotlin.Metadata;
import r22.State;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013¢\u0006\u0004\b\u0017\u0010\u0018J\u008e\u0001\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0014\b\u0002\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u0013HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010$\u001a\u0004\b)\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b+\u0010\u001cR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u0010,\u001a\u0004\b/\u0010.R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b)\u0010,\u001a\u0004\b*\u0010.R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b(\u00108R#\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\u00138\u0006¢\u0006\f\n\u0004\b%\u00109\u001a\u0004\b6\u0010:¨\u0006;"}, d2 = {"Lo22/b;", "", "Leo0/g0;", "messageId", "", "titleValue", "contentValue", "Leo0/j;", "caseSignValue", "Lt50/e;", "titleValidationState", "contentValidationState", "caseSignValidationState", "Lz02/a;", "entryMessageType", "Ld12/a;", "fieldTypeToScroll", "Lg30/v;", "bottomSheetValue", "Lr22/c$a;", "", "Lm02/c;", "filesData", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt50/e;Lt50/e;Lt50/e;Lz02/a;Ld12/a;Lg30/v;Lr22/c$a;Lfr/k;)V", "a", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lt50/e;Lt50/e;Lt50/e;Lz02/a;Ld12/a;Lg30/v;Lr22/c$a;)Lo22/b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "k", "b", "m", "c", "g", "d", "e", "Lt50/e;", "l", "()Lt50/e;", "f", "h", "Lz02/a;", "()Lz02/a;", "i", "Ld12/a;", "()Ld12/a;", "j", "Lg30/v;", "()Lg30/v;", "Lr22/c$a;", "()Lr22/c$a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String messageId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String titleValue;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String contentValue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String caseSignValue;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t50.e titleValidationState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t50.e contentValidationState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t50.e caseSignValidationState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final z02.a entryMessageType;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final d12.a fieldTypeToScroll;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final g30.v bottomSheetValue;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final State.Field<List<m02.c>> filesData;

    public /* synthetic */ b(String str, String str2, String str3, String str4, t50.e eVar, t50.e eVar2, t50.e eVar3, z02.a aVar, d12.a aVar2, g30.v vVar, State.Field field, fr.k kVar) {
        this(str, str2, str3, str4, eVar, eVar2, eVar3, aVar, aVar2, vVar, field);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ b b(b bVar, String str, String str2, String str3, String str4, t50.e eVar, t50.e eVar2, t50.e eVar3, z02.a aVar, d12.a aVar2, g30.v vVar, State.Field field, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = bVar.messageId;
        }
        if ((i15 & 2) != 0) {
            str2 = bVar.titleValue;
        }
        if ((i15 & 4) != 0) {
            str3 = bVar.contentValue;
        }
        if ((i15 & 8) != 0) {
            str4 = bVar.caseSignValue;
        }
        if ((i15 & 16) != 0) {
            eVar = bVar.titleValidationState;
        }
        if ((i15 & 32) != 0) {
            eVar2 = bVar.contentValidationState;
        }
        if ((i15 & 64) != 0) {
            eVar3 = bVar.caseSignValidationState;
        }
        if ((i15 & 128) != 0) {
            aVar = bVar.entryMessageType;
        }
        if ((i15 & 256) != 0) {
            aVar2 = bVar.fieldTypeToScroll;
        }
        if ((i15 & 512) != 0) {
            vVar = bVar.bottomSheetValue;
        }
        if ((i15 & 1024) != 0) {
            field = bVar.filesData;
        }
        g30.v vVar2 = vVar;
        State.Field field2 = field;
        z02.a aVar3 = aVar;
        d12.a aVar4 = aVar2;
        t50.e eVar4 = eVar2;
        t50.e eVar5 = eVar3;
        t50.e eVar6 = eVar;
        String str5 = str3;
        return bVar.a(str, str2, str5, str4, eVar6, eVar4, eVar5, aVar3, aVar4, vVar2, field2);
    }

    public final b a(String messageId, String titleValue, String contentValue, String caseSignValue, t50.e titleValidationState, t50.e contentValidationState, t50.e caseSignValidationState, z02.a entryMessageType, d12.a fieldTypeToScroll, g30.v bottomSheetValue, State.Field<List<m02.c>> filesData) {
        return new b(messageId, titleValue, contentValue, caseSignValue, titleValidationState, contentValidationState, caseSignValidationState, entryMessageType, fieldTypeToScroll, bottomSheetValue, filesData, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g30.v getBottomSheetValue() {
        return this.bottomSheetValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final t50.e getCaseSignValidationState() {
        return this.caseSignValidationState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getCaseSignValue() {
        return this.caseSignValue;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    public boolean equals(Object other) {
        boolean zD;
        if (this == other) {
            return true;
        }
        if (!(other instanceof b)) {
            return false;
        }
        b bVar = (b) other;
        String str = this.messageId;
        String str2 = bVar.messageId;
        if (str == null) {
            if (str2 == null) {
                zD = true;
            } else {
                zD = false;
            }
        } else if (str2 == null) {
            zD = false;
        } else {
            zD = eo0.g0.d(str, str2);
        }
        return zD && fr.t.c(this.titleValue, bVar.titleValue) && fr.t.c(this.contentValue, bVar.contentValue) && eo0.j.c(this.caseSignValue, bVar.caseSignValue) && fr.t.c(this.titleValidationState, bVar.titleValidationState) && fr.t.c(this.contentValidationState, bVar.contentValidationState) && fr.t.c(this.caseSignValidationState, bVar.caseSignValidationState) && fr.t.c(this.entryMessageType, bVar.entryMessageType) && this.fieldTypeToScroll == bVar.fieldTypeToScroll && this.bottomSheetValue == bVar.bottomSheetValue && fr.t.c(this.filesData, bVar.filesData);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final t50.e getContentValidationState() {
        return this.contentValidationState;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getContentValue() {
        return this.contentValue;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final z02.a getEntryMessageType() {
        return this.entryMessageType;
    }

    public int hashCode() {
        String str = this.messageId;
        int iE = (((((((((((((((str == null ? 0 : eo0.g0.e(str)) * 31) + this.titleValue.hashCode()) * 31) + this.contentValue.hashCode()) * 31) + eo0.j.d(this.caseSignValue)) * 31) + this.titleValidationState.hashCode()) * 31) + this.contentValidationState.hashCode()) * 31) + this.caseSignValidationState.hashCode()) * 31) + this.entryMessageType.hashCode()) * 31;
        d12.a aVar = this.fieldTypeToScroll;
        return ((((iE + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.bottomSheetValue.hashCode()) * 31) + this.filesData.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final d12.a getFieldTypeToScroll() {
        return this.fieldTypeToScroll;
    }

    public final State.Field<List<m02.c>> j() {
        return this.filesData;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final String getMessageId() {
        return this.messageId;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final t50.e getTitleValidationState() {
        return this.titleValidationState;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final String getTitleValue() {
        return this.titleValue;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("State(messageId=");
        String str = this.messageId;
        sb5.append((Object) (str == null ? "null" : eo0.g0.f(str)));
        sb5.append(", titleValue=");
        sb5.append(this.titleValue);
        sb5.append(", contentValue=");
        sb5.append(this.contentValue);
        sb5.append(", caseSignValue=");
        sb5.append((Object) eo0.j.e(this.caseSignValue));
        sb5.append(", titleValidationState=");
        sb5.append(this.titleValidationState);
        sb5.append(", contentValidationState=");
        sb5.append(this.contentValidationState);
        sb5.append(", caseSignValidationState=");
        sb5.append(this.caseSignValidationState);
        sb5.append(", entryMessageType=");
        sb5.append(this.entryMessageType);
        sb5.append(", fieldTypeToScroll=");
        sb5.append(this.fieldTypeToScroll);
        sb5.append(", bottomSheetValue=");
        sb5.append(this.bottomSheetValue);
        sb5.append(", filesData=");
        sb5.append(this.filesData);
        sb5.append(')');
        return sb5.toString();
    }

    private b(String str, String str2, String str3, String str4, t50.e eVar, t50.e eVar2, t50.e eVar3, z02.a aVar, d12.a aVar2, g30.v vVar, State.Field<List<m02.c>> field) {
        this.messageId = str;
        this.titleValue = str2;
        this.contentValue = str3;
        this.caseSignValue = str4;
        this.titleValidationState = eVar;
        this.contentValidationState = eVar2;
        this.caseSignValidationState = eVar3;
        this.entryMessageType = aVar;
        this.fieldTypeToScroll = aVar2;
        this.bottomSheetValue = vVar;
        this.filesData = field;
    }

    public /* synthetic */ b(String str, String str2, String str3, String str4, t50.e eVar, t50.e eVar2, t50.e eVar3, z02.a aVar, d12.a aVar2, g30.v vVar, State.Field field, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? "" : str3, (i15 & 8) != 0 ? eo0.j.INSTANCE.a() : str4, (i15 & 16) != 0 ? new t50.e.Default(null, 1, null) : eVar, (i15 & 32) != 0 ? new t50.e.Default(null, 1, null) : eVar2, (i15 & 64) != 0 ? new t50.e.Default(null, 1, null) : eVar3, aVar, (i15 & 256) != 0 ? null : aVar2, (i15 & 512) != 0 ? g30.v.HIDDEN : vVar, (i15 & 1024) != 0 ? new State.Field(new ArrayList(), null, 2, null) : field, null);
    }
}
