package n50;

import androidx.compose.ui.graphics.Color;
import mx.Label;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: n50.i0, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010!\u001a\u0004\b\"\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010!\u001a\u0004\b#\u0010\u0014R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u0019\u0010%¨\u0006&"}, d2 = {"Ln50/i0;", "", "Lmx/a;", AnnotatedPrivateKey.LABEL, "contentDescription", "Lkotlin/Function0;", "Landroidx/compose/ui/graphics/Color;", "labelColor", "", "maxLines", "Lb5/v;", "textOverflow", "Lj70/a;", "accessibilityReadMode", "<init>", "(Lmx/a;Lmx/a;Ler/p;IILj70/a;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ler/p;", "d", "()Ler/p;", "I", "e", "f", "Lj70/a;", "()Lj70/a;", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SingleCardLabel {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f132064g = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label label;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label contentDescription;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.p<p076m2.r, Integer, Color> labelColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final int textOverflow;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final j70.a accessibilityReadMode;

    public /* synthetic */ SingleCardLabel(Label label, Label label2, er.p pVar, int i15, int i16, j70.a aVar, fr.k kVar) {
        this(label, label2, pVar, i15, i16, aVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final j70.a getAccessibilityReadMode() {
        return this.accessibilityReadMode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getLabel() {
        return this.label;
    }

    public final er.p<p076m2.r, Integer, Color> d() {
        return this.labelColor;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SingleCardLabel)) {
            return false;
        }
        SingleCardLabel singleCardLabel = (SingleCardLabel) other;
        return fr.t.c(this.label, singleCardLabel.label) && fr.t.c(this.contentDescription, singleCardLabel.contentDescription) && fr.t.c(this.labelColor, singleCardLabel.labelColor) && this.maxLines == singleCardLabel.maxLines && b5.v.g(this.textOverflow, singleCardLabel.textOverflow) && this.accessibilityReadMode == singleCardLabel.accessibilityReadMode;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getTextOverflow() {
        return this.textOverflow;
    }

    public int hashCode() {
        int iHashCode = this.label.hashCode() * 31;
        Label label = this.contentDescription;
        int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
        er.p<p076m2.r, Integer, Color> pVar = this.labelColor;
        return ((((((iHashCode2 + (pVar != null ? pVar.hashCode() : 0)) * 31) + Integer.hashCode(this.maxLines)) * 31) + b5.v.h(this.textOverflow)) * 31) + this.accessibilityReadMode.hashCode();
    }

    public String toString() {
        return "SingleCardLabel(label=" + this.label + ", contentDescription=" + this.contentDescription + ", labelColor=" + this.labelColor + ", maxLines=" + this.maxLines + ", textOverflow=" + ((Object) b5.v.i(this.textOverflow)) + ", accessibilityReadMode=" + this.accessibilityReadMode + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SingleCardLabel(Label label, Label label2, er.p<? super p076m2.r, ? super Integer, Color> pVar, int i15, int i16, j70.a aVar) {
        this.label = label;
        this.contentDescription = label2;
        this.labelColor = pVar;
        this.maxLines = i15;
        this.textOverflow = i16;
        this.accessibilityReadMode = aVar;
    }

    public /* synthetic */ SingleCardLabel(Label label, Label label2, er.p pVar, int i15, int i16, j70.a aVar, int i17, fr.k kVar) {
        this(label, (i17 & 2) != 0 ? null : label2, (i17 & 4) != 0 ? null : pVar, (i17 & 8) != 0 ? Integer.MAX_VALUE : i15, (i17 & 16) != 0 ? b5.v.INSTANCE.b() : i16, (i17 & 32) != 0 ? j70.a.LOWER_CASE : aVar, null);
    }
}
