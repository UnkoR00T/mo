package w20;

import androidx.compose.ui.graphics.Color;
import fr.k;
import fr.t;
import mu.g;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: w20.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\u0018R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001f\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001f¨\u0006 "}, d2 = {"Lw20/a;", "", "Lmx/a;", "currentTime", "emblemText", "Landroidx/compose/ui/graphics/Color;", "emblemTextColor", "Lmu/g;", "", "rotation", "<init>", "(Lmx/a;Lmx/a;Landroidx/compose/ui/graphics/Color;Lmu/g;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "()Lmx/a;", "b", "c", "Landroidx/compose/ui/graphics/Color;", "()Landroidx/compose/ui/graphics/Color;", "d", "Lmu/g;", "()Lmu/g;", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BaseDocumentScreenState {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f209332e = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label currentTime;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label emblemText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Color emblemTextColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final g<Float> rotation;

    public /* synthetic */ BaseDocumentScreenState(Label label, Label label2, Color color, g gVar, k kVar) {
        this(label, label2, color, gVar);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getCurrentTime() {
        return this.currentTime;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getEmblemText() {
        return this.emblemText;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Color getEmblemTextColor() {
        return this.emblemTextColor;
    }

    public final g<Float> d() {
        return this.rotation;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BaseDocumentScreenState)) {
            return false;
        }
        BaseDocumentScreenState baseDocumentScreenState = (BaseDocumentScreenState) other;
        return t.c(this.currentTime, baseDocumentScreenState.currentTime) && t.c(this.emblemText, baseDocumentScreenState.emblemText) && t.c(this.emblemTextColor, baseDocumentScreenState.emblemTextColor) && t.c(this.rotation, baseDocumentScreenState.rotation);
    }

    public int hashCode() {
        Label label = this.currentTime;
        int iHashCode = (((label == null ? 0 : label.hashCode()) * 31) + this.emblemText.hashCode()) * 31;
        Color color = this.emblemTextColor;
        int iM17hashCodeimpl = (iHashCode + (color == null ? 0 : Color.m17hashCodeimpl(color.m20unboximpl()))) * 31;
        g<Float> gVar = this.rotation;
        return iM17hashCodeimpl + (gVar != null ? gVar.hashCode() : 0);
    }

    public String toString() {
        return "BaseDocumentScreenState(currentTime=" + this.currentTime + ", emblemText=" + this.emblemText + ", emblemTextColor=" + this.emblemTextColor + ", rotation=" + this.rotation + ')';
    }

    private BaseDocumentScreenState(Label label, Label label2, Color color, g<Float> gVar) {
        this.currentTime = label;
        this.emblemText = label2;
        this.emblemTextColor = color;
        this.rotation = gVar;
    }

    public /* synthetic */ BaseDocumentScreenState(Label label, Label label2, Color color, g gVar, int i15, k kVar) {
        this((i15 & 1) != 0 ? null : label, label2, (i15 & 4) != 0 ? null : color, gVar, null);
    }
}
