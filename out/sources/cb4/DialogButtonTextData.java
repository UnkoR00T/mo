package cb4;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: cb4.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ4\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lcb4/b;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lcb4/a;", "buttonState", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Lcb4/a;Ler/a;)V", "a", "(Lmx/a;Lcb4/a;Ler/a;)Lcb4/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "d", "()Lmx/a;", "b", "Lcb4/a;", "c", "()Lcb4/a;", "Ler/a;", "e", "()Ler/a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DialogButtonTextData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a buttonState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    public DialogButtonTextData(Label label, a aVar, er.a<i0> aVar2) {
        this.label = label;
        this.buttonState = aVar;
        this.onClick = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialogButtonTextData b(DialogButtonTextData dialogButtonTextData, Label label, a aVar, er.a aVar2, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            label = dialogButtonTextData.label;
        }
        if ((i15 & 2) != 0) {
            aVar = dialogButtonTextData.buttonState;
        }
        if ((i15 & 4) != 0) {
            aVar2 = dialogButtonTextData.onClick;
        }
        return dialogButtonTextData.a(label, aVar, aVar2);
    }

    public final DialogButtonTextData a(Label label, a buttonState, er.a<i0> onClick) {
        return new DialogButtonTextData(label, buttonState, onClick);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final a getButtonState() {
        return this.buttonState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public final er.a<i0> e() {
        return this.onClick;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialogButtonTextData)) {
            return false;
        }
        DialogButtonTextData dialogButtonTextData = (DialogButtonTextData) other;
        return t.c(this.label, dialogButtonTextData.label) && t.c(this.buttonState, dialogButtonTextData.buttonState) && t.c(this.onClick, dialogButtonTextData.onClick);
    }

    public int hashCode() {
        return (((this.label.hashCode() * 31) + this.buttonState.hashCode()) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "DialogButtonTextData(label=" + this.label + ", buttonState=" + this.buttonState + ", onClick=" + this.onClick + ")";
    }

    public /* synthetic */ DialogButtonTextData(Label label, a aVar, er.a aVar2, int i15, k kVar) {
        this(label, (i15 & 2) != 0 ? a.c.f24969a : aVar, aVar2);
    }
}
