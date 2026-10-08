package h3;

import android.view.autofill.AutofillValue;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0016\u0010\r\u001a\u0004\u0018\u00010\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh3/h;", "Lh3/w;", "Landroid/view/autofill/AutofillValue;", "autofillValue", "<init>", "(Landroid/view/autofill/AutofillValue;)V", "b", "Landroid/view/autofill/AutofillValue;", "c", "()Landroid/view/autofill/AutofillValue;", "", "a", "()Ljava/lang/CharSequence;", "textValue", "", "()Ljava/lang/Boolean;", "booleanValue", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements w {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AutofillValue autofillValue;

    public h(AutofillValue autofillValue) {
        this.autofillValue = autofillValue;
    }

    @Override // h3.w
    public CharSequence a() {
        if (this.autofillValue.isText()) {
            return this.autofillValue.getTextValue();
        }
        return null;
    }

    @Override // h3.w
    public Boolean b() {
        if (this.autofillValue.isToggle()) {
            return Boolean.valueOf(this.autofillValue.getToggleValue());
        }
        return null;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final AutofillValue getAutofillValue() {
        return this.autofillValue;
    }
}
