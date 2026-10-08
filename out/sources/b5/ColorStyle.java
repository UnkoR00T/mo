package b5;

import androidx.compose.ui.graphics.Color;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: b5.d, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0014R\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lb5/d;", "Lb5/p;", "Landroidx/compose/ui/graphics/Color;", "value", "<init>", "(JLfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "J", "getValue-0d7_KjU", "()J", "color", "Landroidx/compose/ui/graphics/c;", "h", "()Landroidx/compose/ui/graphics/c;", "brush", "", "a", "()F", "alpha", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class ColorStyle implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long value;

    public /* synthetic */ ColorStyle(long j15, fr.k kVar) {
        this(j15);
    }

    @Override // b5.p
    public float a() {
        return Color.m12getAlphaimpl(getValue());
    }

    @Override // b5.p
    /* JADX INFO: renamed from: b, reason: from getter */
    public long getValue() {
        return this.value;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof ColorStyle) && Color.m11equalsimpl0(this.value, ((ColorStyle) other).value);
    }

    @Override // b5.p
    public androidx.compose.ui.graphics.c h() {
        return null;
    }

    public int hashCode() {
        return Color.m17hashCodeimpl(this.value);
    }

    public String toString() {
        return "ColorStyle(value=" + ((Object) Color.m18toStringimpl(this.value)) + ')';
    }

    private ColorStyle(long j15) {
        this.value = j15;
        if (j15 != 16) {
            return;
        }
        w4.a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }
}
