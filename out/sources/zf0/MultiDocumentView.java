package zf0;

import fr.t;
import p071kotlin.Metadata;
import yf0.DocumentDynamicSection;

/* JADX INFO: renamed from: zf0.d, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lzf0/d;", "", "Lyf0/d;", "dynamicSections", "Lzf0/d$a;", "multiDocumentGroup", "<init>", "(Lyf0/d;Lzf0/d$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lyf0/d;", "getDynamicSections", "()Lyf0/d;", "b", "Lzf0/d$a;", "getMultiDocumentGroup", "()Lzf0/d$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MultiDocumentView {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final DocumentDynamicSection dynamicSections;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a multiDocumentGroup;

    /* JADX INFO: renamed from: zf0.d$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lzf0/d$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        LEFT_TAB,
        RIGHT_TAB,
        UNKNOWN;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f235009e = wq.b.a(b());
    }

    public MultiDocumentView(DocumentDynamicSection documentDynamicSection, a aVar) {
        this.dynamicSections = documentDynamicSection;
        this.multiDocumentGroup = aVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MultiDocumentView)) {
            return false;
        }
        MultiDocumentView multiDocumentView = (MultiDocumentView) other;
        return t.c(this.dynamicSections, multiDocumentView.dynamicSections) && this.multiDocumentGroup == multiDocumentView.multiDocumentGroup;
    }

    public int hashCode() {
        return (this.dynamicSections.hashCode() * 31) + this.multiDocumentGroup.hashCode();
    }

    public String toString() {
        return "MultiDocumentView(dynamicSections=" + this.dynamicSections + ", multiDocumentGroup=" + this.multiDocumentGroup + ")";
    }
}
