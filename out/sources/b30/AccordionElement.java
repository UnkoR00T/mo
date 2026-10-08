package b30;

import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b30.c, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b \u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b&\u0010%\u001a\u0004\b\"\u0010'R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u001c\u0010+\u001a\u0004\b$\u0010,¨\u0006-"}, d2 = {"Lb30/c;", "", "Lb30/l;", "leadingResource", "Lmx/a;", "header", "headerContentDescription", "", "initialExpanded", "Lkotlin/Function1;", "Loq/i0;", "onListExpanded", "addContentPadding", "Lb30/k;", "content", "<init>", "(Lb30/l;Lmx/a;Lmx/a;ZLer/l;ZLb30/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lb30/l;", "g", "()Lb30/l;", "b", "Lmx/a;", "e", "()Lmx/a;", "c", "getHeaderContentDescription", "d", "Z", "f", "()Z", "Ler/l;", "h", "()Ler/l;", "Lb30/k;", "()Lb30/k;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccordionElement {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Resource leadingResource;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label header;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label headerContentDescription;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean initialExpanded;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<Boolean, i0> onListExpanded;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean addContentPadding;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final k content;

    /* JADX WARN: Multi-variable type inference failed */
    public AccordionElement(Resource lVar, Label label, Label label2, boolean z15, er.l<? super Boolean, i0> lVar2, boolean z16, k kVar) {
        this.leadingResource = lVar;
        this.header = label;
        this.headerContentDescription = label2;
        this.initialExpanded = z15;
        this.onListExpanded = lVar2;
        this.addContentPadding = z16;
        this.content = kVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getAddContentPadding() {
        return this.addContentPadding;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final k getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getHeader() {
        return this.header;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccordionElement)) {
            return false;
        }
        AccordionElement accordionElement = (AccordionElement) other;
        return t.c(this.leadingResource, accordionElement.leadingResource) && t.c(this.header, accordionElement.header) && t.c(this.headerContentDescription, accordionElement.headerContentDescription) && this.initialExpanded == accordionElement.initialExpanded && t.c(this.onListExpanded, accordionElement.onListExpanded) && this.addContentPadding == accordionElement.addContentPadding && t.c(this.content, accordionElement.content);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getInitialExpanded() {
        return this.initialExpanded;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Resource getLeadingResource() {
        return this.leadingResource;
    }

    public final er.l<Boolean, i0> h() {
        return this.onListExpanded;
    }

    public int hashCode() {
        Resource lVar = this.leadingResource;
        int iHashCode = (((lVar == null ? 0 : lVar.hashCode()) * 31) + this.header.hashCode()) * 31;
        Label label = this.headerContentDescription;
        return ((((((((iHashCode + (label != null ? label.hashCode() : 0)) * 31) + Boolean.hashCode(this.initialExpanded)) * 31) + this.onListExpanded.hashCode()) * 31) + Boolean.hashCode(this.addContentPadding)) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "AccordionElement(leadingResource=" + this.leadingResource + ", header=" + this.header + ", headerContentDescription=" + this.headerContentDescription + ", initialExpanded=" + this.initialExpanded + ", onListExpanded=" + this.onListExpanded + ", addContentPadding=" + this.addContentPadding + ", content=" + this.content + ')';
    }

    public /* synthetic */ AccordionElement(Resource lVar, Label label, Label label2, boolean z15, er.l lVar2, boolean z16, k kVar, int i15, fr.k kVar2) {
        this((i15 & 1) != 0 ? null : lVar, label, (i15 & 4) != 0 ? null : label2, (i15 & 8) != 0 ? false : z15, (i15 & 16) != 0 ? new er.l() { // from class: b30.b
            @Override // er.l
            public final Object b(Object obj) {
                return AccordionElement.b(((Boolean) obj).booleanValue());
            }
        } : lVar2, (i15 & 32) != 0 ? true : z16, kVar);
    }
}
