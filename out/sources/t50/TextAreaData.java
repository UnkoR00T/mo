package t50;

import fr.t;
import l3.d0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: t50.d, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b0\b\u0087\b\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00180\u0017¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020\r2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010%\u001a\u0004\b+\u0010\u001eR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b3\u0010:R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b/\u0010=R\u0017\u0010\u0011\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010(\u001a\u0004\b8\u0010*R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b)\u0010>\u001a\u0004\b;\u0010 R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\bC\u0010D\u001a\u0004\b7\u0010ER#\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b5\u0010F\u001a\u0004\bC\u0010GR#\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00180\u00178\u0006¢\u0006\f\n\u0004\b&\u0010F\u001a\u0004\b?\u0010G¨\u0006H"}, d2 = {"Lt50/d;", "", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lt50/s;", "type", "", "indexTag", "Lt50/e;", "state", "content", "", "enabled", "Lt50/a;", "counterState", "hint", "Lv4/t;", "imeAction", "Ll3/d0;", "focusRequester", "fieldIndex", "Lkotlin/Function1;", "Loq/i0;", "onValueChanged", "onFocusChanged", "<init>", "(Ljava/lang/String;Lmx/a;Lt50/s;Ljava/lang/Integer;Lt50/e;Ljava/lang/String;ZLt50/a;Lmx/a;ILl3/d0;Ljava/lang/Object;Ler/l;Ler/l;Lfr/k;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "n", "b", "Lmx/a;", "j", "()Lmx/a;", "c", "Lt50/s;", "o", "()Lt50/s;", "d", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "e", "Lt50/e;", "m", "()Lt50/e;", "f", "g", "Z", "()Z", "h", "Lt50/a;", "()Lt50/a;", "I", "k", "Ll3/d0;", "getFocusRequester", "()Ll3/d0;", "l", "Ljava/lang/Object;", "()Ljava/lang/Object;", "Ler/l;", "()Ler/l;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TextAreaData {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f187694o = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final s type;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer indexTag;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final e state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final String content;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final a counterState;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label hint;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final int imeAction;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final d0 focusRequester;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object fieldIndex;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<String, i0> onValueChanged;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<Boolean, i0> onFocusChanged;

    public /* synthetic */ TextAreaData(String str, Label label, s sVar, Integer num, e eVar, String str2, boolean z15, a aVar, Label label2, int i15, d0 d0Var, Object obj, er.l lVar, er.l lVar2, fr.k kVar) {
        this(str, label, sVar, num, eVar, str2, z15, aVar, label2, i15, d0Var, obj, lVar, lVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final a getCounterState() {
        return this.counterState;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getEnabled() {
        return this.enabled;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAreaData)) {
            return false;
        }
        TextAreaData textAreaData = (TextAreaData) other;
        return t.c(this.testTag, textAreaData.testTag) && t.c(this.label, textAreaData.label) && t.c(this.type, textAreaData.type) && t.c(this.indexTag, textAreaData.indexTag) && t.c(this.state, textAreaData.state) && t.c(this.content, textAreaData.content) && this.enabled == textAreaData.enabled && t.c(this.counterState, textAreaData.counterState) && t.c(this.hint, textAreaData.hint) && v4.t.m(this.imeAction, textAreaData.imeAction) && t.c(this.focusRequester, textAreaData.focusRequester) && t.c(this.fieldIndex, textAreaData.fieldIndex) && t.c(this.onValueChanged, textAreaData.onValueChanged) && t.c(this.onFocusChanged, textAreaData.onFocusChanged);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Object getFieldIndex() {
        return this.fieldIndex;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getHint() {
        return this.hint;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getImeAction() {
        return this.imeAction;
    }

    public int hashCode() {
        String str = this.testTag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Label label = this.label;
        int iHashCode2 = (((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.type.hashCode()) * 31;
        Integer num = this.indexTag;
        int iHashCode3 = (((((((((((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.state.hashCode()) * 31) + this.content.hashCode()) * 31) + Boolean.hashCode(this.enabled)) * 31) + this.counterState.hashCode()) * 31) + this.hint.hashCode()) * 31) + v4.t.n(this.imeAction)) * 31;
        d0 d0Var = this.focusRequester;
        int iHashCode4 = (iHashCode3 + (d0Var == null ? 0 : d0Var.hashCode())) * 31;
        Object obj = this.fieldIndex;
        return ((((iHashCode4 + (obj != null ? obj.hashCode() : 0)) * 31) + this.onValueChanged.hashCode()) * 31) + this.onFocusChanged.hashCode();
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final Integer getIndexTag() {
        return this.indexTag;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public final er.l<Boolean, i0> k() {
        return this.onFocusChanged;
    }

    public final er.l<String, i0> l() {
        return this.onValueChanged;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final e getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final s getType() {
        return this.type;
    }

    public String toString() {
        return "TextAreaData(testTag=" + this.testTag + ", label=" + this.label + ", type=" + this.type + ", indexTag=" + this.indexTag + ", state=" + this.state + ", content=" + this.content + ", enabled=" + this.enabled + ", counterState=" + this.counterState + ", hint=" + this.hint + ", imeAction=" + ((Object) v4.t.o(this.imeAction)) + ", focusRequester=" + this.focusRequester + ", fieldIndex=" + this.fieldIndex + ", onValueChanged=" + this.onValueChanged + ", onFocusChanged=" + this.onFocusChanged + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAreaData(String str, Label label, s sVar, Integer num, e eVar, String str2, boolean z15, a aVar, Label label2, int i15, d0 d0Var, Object obj, er.l<? super String, i0> lVar, er.l<? super Boolean, i0> lVar2) {
        this.testTag = str;
        this.label = label;
        this.type = sVar;
        this.indexTag = num;
        this.state = eVar;
        this.content = str2;
        this.enabled = z15;
        this.counterState = aVar;
        this.hint = label2;
        this.imeAction = i15;
        this.focusRequester = d0Var;
        this.fieldIndex = obj;
        this.onValueChanged = lVar;
        this.onFocusChanged = lVar2;
    }

    public /* synthetic */ TextAreaData(String str, Label label, s sVar, Integer num, e eVar, String str2, boolean z15, a aVar, Label label2, int i15, d0 d0Var, Object obj, er.l lVar, er.l lVar2, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? null : str, (i16 & 2) != 0 ? null : label, sVar, (i16 & 8) != 0 ? null : num, eVar, (i16 & 32) != 0 ? "" : str2, (i16 & 64) != 0 ? true : z15, aVar, (i16 & 256) != 0 ? Label.INSTANCE.c() : label2, (i16 & 512) != 0 ? v4.t.INSTANCE.b() : i15, (i16 & 1024) != 0 ? null : d0Var, (i16 & 2048) != 0 ? null : obj, lVar, (i16 & PKIFailureInfo.certRevoked) != 0 ? new er.l() { // from class: t50.c
            @Override // er.l
            public final Object b(Object obj2) {
                return TextAreaData.b(((Boolean) obj2).booleanValue());
            }
        } : lVar2, null);
    }
}
