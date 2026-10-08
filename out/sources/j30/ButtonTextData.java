package j30;

import fr.k;
import fr.t;
import mx.Label;
import oq.i0;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: j30.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u0017\u0010\u001fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lj30/a;", "", "", "testTag", "Lmx/a;", AnnotatedPrivateKey.LABEL, "Lk30/b;", "buttonState", "contentDescription", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Ljava/lang/String;Lmx/a;Lk30/b;Lmx/a;Ler/a;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "b", "Lmx/a;", "c", "()Lmx/a;", "Lk30/b;", "()Lk30/b;", "d", "Ler/a;", "()Ler/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ButtonTextData {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f99099f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final k30.b buttonState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onClick;

    public ButtonTextData(String str, Label label, k30.b bVar, Label label2, er.a<i0> aVar) {
        this.testTag = str;
        this.label = label;
        this.buttonState = bVar;
        this.contentDescription = label2;
        this.onClick = aVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final k30.b getButtonState() {
        return this.buttonState;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public final er.a<i0> d() {
        return this.onClick;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonTextData)) {
            return false;
        }
        ButtonTextData buttonTextData = (ButtonTextData) other;
        return t.c(this.testTag, buttonTextData.testTag) && t.c(this.label, buttonTextData.label) && t.c(this.buttonState, buttonTextData.buttonState) && t.c(this.contentDescription, buttonTextData.contentDescription) && t.c(this.onClick, buttonTextData.onClick);
    }

    public int hashCode() {
        String str = this.testTag;
        int iHashCode = (((((str == null ? 0 : str.hashCode()) * 31) + this.label.hashCode()) * 31) + this.buttonState.hashCode()) * 31;
        Label label = this.contentDescription;
        return ((iHashCode + (label != null ? label.hashCode() : 0)) * 31) + this.onClick.hashCode();
    }

    public String toString() {
        return "ButtonTextData(testTag=" + this.testTag + ", label=" + this.label + ", buttonState=" + this.buttonState + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
    }

    public /* synthetic */ ButtonTextData(String str, Label label, k30.b bVar, Label label2, er.a aVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : str, label, (i15 & 4) != 0 ? k30.b.c.f107768a : bVar, (i15 & 8) != 0 ? null : label2, aVar);
    }
}
