package s51;

import b30.AccordionData;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: s51.e, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ls51/e;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lb30/a;", "data", "<init>", "(Lmx/a;Lb30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Lb30/a;", "()Lb30/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class AccordionDataLabeled {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f178048c = AccordionData.f16343b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AccordionData data;

    public AccordionDataLabeled(Label label, AccordionData accordionData) {
        this.label = label;
        this.data = accordionData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final AccordionData getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AccordionDataLabeled)) {
            return false;
        }
        AccordionDataLabeled accordionDataLabeled = (AccordionDataLabeled) other;
        return fr.t.c(this.label, accordionDataLabeled.label) && fr.t.c(this.data, accordionDataLabeled.data);
    }

    public int hashCode() {
        Label label = this.label;
        return ((label == null ? 0 : label.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "AccordionDataLabeled(label=" + this.label + ", data=" + this.data + ')';
    }
}
