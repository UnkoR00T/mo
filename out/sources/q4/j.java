package q4;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lq4/j;", "", "Lq4/s3;", "textLayoutInput", "<init>", "(Lq4/s3;)V", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq4/s3;", "getTextLayoutInput", "()Lq4/s3;", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TextLayoutInput textLayoutInput;

    public j(TextLayoutInput textLayoutInput) {
        this.textLayoutInput = textLayoutInput;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof j)) {
            return false;
        }
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        j jVar = (j) other;
        return fr.t.c(textLayoutInput.getText(), jVar.textLayoutInput.getText()) && textLayoutInput.getStyle().I(jVar.textLayoutInput.getStyle()) && fr.t.c(textLayoutInput.g(), jVar.textLayoutInput.g()) && textLayoutInput.getMaxLines() == jVar.textLayoutInput.getMaxLines() && textLayoutInput.getSoftWrap() == jVar.textLayoutInput.getSoftWrap() && b5.v.g(textLayoutInput.getOverflow(), jVar.textLayoutInput.getOverflow()) && fr.t.c(textLayoutInput.getDensity(), jVar.textLayoutInput.getDensity()) && textLayoutInput.getLayoutDirection() == jVar.textLayoutInput.getLayoutDirection() && textLayoutInput.getFontFamilyResolver() == jVar.textLayoutInput.getFontFamilyResolver() && c5.b.f(textLayoutInput.getConstraints(), jVar.textLayoutInput.getConstraints());
    }

    public int hashCode() {
        TextLayoutInput textLayoutInput = this.textLayoutInput;
        return (((((((((((((((((textLayoutInput.getText().hashCode() * 31) + textLayoutInput.getStyle().J()) * 31) + textLayoutInput.g().hashCode()) * 31) + textLayoutInput.getMaxLines()) * 31) + Boolean.hashCode(textLayoutInput.getSoftWrap())) * 31) + b5.v.h(textLayoutInput.getOverflow())) * 31) + textLayoutInput.getDensity().hashCode()) * 31) + textLayoutInput.getLayoutDirection().hashCode()) * 31) + textLayoutInput.getFontFamilyResolver().hashCode()) * 31) + c5.b.o(textLayoutInput.getConstraints());
    }
}
