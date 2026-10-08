package n50;

import java.util.List;
import n4.CustomAccessibilityAction;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n50.g, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b'\b\u0087\b\u0018\u00002\u00020\u0001B\u0097\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ¢\u0001\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u00072\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010%\u001a\u00020\u00072\b\u0010$\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010 R\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b,\u0010.\u001a\u0004\b\b\u0010/R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R \u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b*\u00105R\u001a\u0010\u000e\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010.\u001a\u0004\b'\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b3\u00108R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b9\u0010?R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\b@\u0010BR\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b)\u0010C\u001a\u0004\bD\u0010ER\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\f\n\u0004\b;\u0010F\u001a\u0004\b=\u0010G¨\u0006H"}, d2 = {"Ln50/g;", "Ln50/k;", "", "testTag", "Lkotlin/Function0;", "Loq/i0;", "onClick", "", "isEnabled", "Ln50/j0;", "singleCardState", "", "Ln4/g;", "accessibilityActions", "containerBorderEnabled", "", "fieldIndex", "Ln50/w0;", "topSection", "Ln50/a;", "bodySection", "Ln50/h;", "leadingSection", "Ln50/x0;", "trailingSection", "Ln50/c;", "bottomSection", "<init>", "(Ljava/lang/String;Ler/a;ZLn50/j0;Ljava/util/List;ZLjava/lang/Object;Ln50/w0;Ln50/a;Ln50/h;Ln50/x0;Ln50/c;)V", "f", "(Ljava/lang/String;Ler/a;ZLn50/j0;Ljava/util/List;ZLjava/lang/Object;Ln50/w0;Ln50/a;Ln50/h;Ln50/x0;Ln50/c;)Ln50/g;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "k", "b", "Ler/a;", "c", "()Ler/a;", "Z", "()Z", "d", "Ln50/j0;", "()Ln50/j0;", "e", "Ljava/util/List;", "()Ljava/util/List;", "g", "Ljava/lang/Object;", "()Ljava/lang/Object;", "h", "Ln50/w0;", "l", "()Ln50/w0;", "i", "Ln50/a;", "()Ln50/a;", "j", "Ln50/h;", "()Ln50/h;", "Ln50/x0;", "m", "()Ln50/x0;", "Ln50/c;", "()Ln50/c;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DefaultSingleCardData implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<oq.i0> onClick;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isEnabled;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final j0 singleCardState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<CustomAccessibilityAction> accessibilityActions;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean containerBorderEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final Object fieldIndex;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final w0 topSection;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final BodySection bodySection;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final LeadingSection leadingSection;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final x0 trailingSection;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final BottomSection bottomSection;

    public DefaultSingleCardData(String str, er.a<oq.i0> aVar, boolean z15, j0 j0Var, List<CustomAccessibilityAction> list, boolean z16, Object obj, w0 w0Var, BodySection aVar2, LeadingSection hVar, x0 x0Var, BottomSection bottomSection) {
        this.testTag = str;
        this.onClick = aVar;
        this.isEnabled = z15;
        this.singleCardState = j0Var;
        this.accessibilityActions = list;
        this.containerBorderEnabled = z16;
        this.fieldIndex = obj;
        this.topSection = w0Var;
        this.bodySection = aVar2;
        this.leadingSection = hVar;
        this.trailingSection = x0Var;
        this.bottomSection = bottomSection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DefaultSingleCardData g(DefaultSingleCardData defaultSingleCardData, String str, er.a aVar, boolean z15, j0 j0Var, List list, boolean z16, Object obj, w0 w0Var, BodySection aVar2, LeadingSection hVar, x0 x0Var, BottomSection bottomSection, int i15, Object obj2) {
        if ((i15 & 1) != 0) {
            str = defaultSingleCardData.testTag;
        }
        if ((i15 & 2) != 0) {
            aVar = defaultSingleCardData.onClick;
        }
        if ((i15 & 4) != 0) {
            z15 = defaultSingleCardData.isEnabled;
        }
        if ((i15 & 8) != 0) {
            j0Var = defaultSingleCardData.singleCardState;
        }
        if ((i15 & 16) != 0) {
            list = defaultSingleCardData.accessibilityActions;
        }
        if ((i15 & 32) != 0) {
            z16 = defaultSingleCardData.containerBorderEnabled;
        }
        if ((i15 & 64) != 0) {
            obj = defaultSingleCardData.fieldIndex;
        }
        if ((i15 & 128) != 0) {
            w0Var = defaultSingleCardData.topSection;
        }
        if ((i15 & 256) != 0) {
            aVar2 = defaultSingleCardData.bodySection;
        }
        if ((i15 & 512) != 0) {
            hVar = defaultSingleCardData.leadingSection;
        }
        if ((i15 & 1024) != 0) {
            x0Var = defaultSingleCardData.trailingSection;
        }
        if ((i15 & 2048) != 0) {
            bottomSection = defaultSingleCardData.bottomSection;
        }
        x0 x0Var2 = x0Var;
        BottomSection bottomSection2 = bottomSection;
        BodySection aVar3 = aVar2;
        LeadingSection hVar2 = hVar;
        Object obj3 = obj;
        w0 w0Var2 = w0Var;
        List list2 = list;
        boolean z17 = z16;
        return defaultSingleCardData.f(str, aVar, z15, j0Var, list2, z17, obj3, w0Var2, aVar3, hVar2, x0Var2, bottomSection2);
    }

    @Override // n50.k
    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getContainerBorderEnabled() {
        return this.containerBorderEnabled;
    }

    @Override // n50.k
    public List<CustomAccessibilityAction> b() {
        return this.accessibilityActions;
    }

    @Override // n50.k
    public er.a<oq.i0> c() {
        return this.onClick;
    }

    @Override // n50.k
    /* JADX INFO: renamed from: d, reason: from getter */
    public j0 getSingleCardState() {
        return this.singleCardState;
    }

    @Override // n50.k
    /* JADX INFO: renamed from: e, reason: from getter */
    public Object getFieldIndex() {
        return this.fieldIndex;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DefaultSingleCardData)) {
            return false;
        }
        DefaultSingleCardData defaultSingleCardData = (DefaultSingleCardData) other;
        return fr.t.c(this.testTag, defaultSingleCardData.testTag) && fr.t.c(this.onClick, defaultSingleCardData.onClick) && this.isEnabled == defaultSingleCardData.isEnabled && fr.t.c(this.singleCardState, defaultSingleCardData.singleCardState) && fr.t.c(this.accessibilityActions, defaultSingleCardData.accessibilityActions) && this.containerBorderEnabled == defaultSingleCardData.containerBorderEnabled && fr.t.c(this.fieldIndex, defaultSingleCardData.fieldIndex) && fr.t.c(this.topSection, defaultSingleCardData.topSection) && fr.t.c(this.bodySection, defaultSingleCardData.bodySection) && fr.t.c(this.leadingSection, defaultSingleCardData.leadingSection) && fr.t.c(this.trailingSection, defaultSingleCardData.trailingSection) && fr.t.c(this.bottomSection, defaultSingleCardData.bottomSection);
    }

    public final DefaultSingleCardData f(String testTag, er.a<oq.i0> onClick, boolean isEnabled, j0 singleCardState, List<CustomAccessibilityAction> accessibilityActions, boolean containerBorderEnabled, Object fieldIndex, w0 topSection, BodySection bodySection, LeadingSection leadingSection, x0 trailingSection, BottomSection bottomSection) {
        return new DefaultSingleCardData(testTag, onClick, isEnabled, singleCardState, accessibilityActions, containerBorderEnabled, fieldIndex, topSection, bodySection, leadingSection, trailingSection, bottomSection);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final BodySection getBodySection() {
        return this.bodySection;
    }

    public int hashCode() {
        String str = this.testTag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        er.a<oq.i0> aVar = this.onClick;
        int iHashCode2 = (((((((((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + this.singleCardState.hashCode()) * 31) + this.accessibilityActions.hashCode()) * 31) + Boolean.hashCode(this.containerBorderEnabled)) * 31;
        Object obj = this.fieldIndex;
        int iHashCode3 = (iHashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        w0 w0Var = this.topSection;
        int iHashCode4 = (((iHashCode3 + (w0Var == null ? 0 : w0Var.hashCode())) * 31) + this.bodySection.hashCode()) * 31;
        LeadingSection hVar = this.leadingSection;
        int iHashCode5 = (iHashCode4 + (hVar == null ? 0 : hVar.hashCode())) * 31;
        x0 x0Var = this.trailingSection;
        int iHashCode6 = (iHashCode5 + (x0Var == null ? 0 : x0Var.hashCode())) * 31;
        BottomSection bottomSection = this.bottomSection;
        return iHashCode6 + (bottomSection != null ? bottomSection.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final BottomSection getBottomSection() {
        return this.bottomSection;
    }

    @Override // n50.k
    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public boolean getIsEnabled() {
        return this.isEnabled;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final LeadingSection getLeadingSection() {
        return this.leadingSection;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final w0 getTopSection() {
        return this.topSection;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final x0 getTrailingSection() {
        return this.trailingSection;
    }

    public String toString() {
        return "DefaultSingleCardData(testTag=" + this.testTag + ", onClick=" + this.onClick + ", isEnabled=" + this.isEnabled + ", singleCardState=" + this.singleCardState + ", accessibilityActions=" + this.accessibilityActions + ", containerBorderEnabled=" + this.containerBorderEnabled + ", fieldIndex=" + this.fieldIndex + ", topSection=" + this.topSection + ", bodySection=" + this.bodySection + ", leadingSection=" + this.leadingSection + ", trailingSection=" + this.trailingSection + ", bottomSection=" + this.bottomSection + ')';
    }

    public /* synthetic */ DefaultSingleCardData(String str, er.a aVar, boolean z15, j0 j0Var, List list, boolean z16, Object obj, w0 w0Var, BodySection aVar2, LeadingSection hVar, x0 x0Var, BottomSection bottomSection, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : str, (i15 & 2) != 0 ? null : aVar, (i15 & 4) != 0 ? true : z15, (i15 & 8) != 0 ? j0.a.f132074a : j0Var, (i15 & 16) != 0 ? pq.v.n() : list, (i15 & 32) != 0 ? false : z16, (i15 & 64) != 0 ? null : obj, (i15 & 128) != 0 ? null : w0Var, aVar2, (i15 & 512) != 0 ? null : hVar, (i15 & 1024) != 0 ? null : x0Var, (i15 & 2048) != 0 ? null : bottomSection);
    }
}
