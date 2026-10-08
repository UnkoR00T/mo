package i33;

import d60.j;
import fr.t;
import h33.Form;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i33.d, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u0014\u0010\u0017R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Li33/d;", "", "Lv50/c;", "phoneInput", "emailInput", "Ld60/j;", "Lh33/b$a;", "scrollInstance", "<init>", "(Lv50/c;Lv50/c;Ld60/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lv50/c;", "b", "()Lv50/c;", "c", "Ld60/j;", "getScrollInstance", "()Ld60/j;", "sanitary_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PhoneAndEmailInputsCustomContentData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final v50.c phoneInput;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final v50.c emailInput;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final j<Form.a> scrollInstance;

    public PhoneAndEmailInputsCustomContentData(v50.c cVar, v50.c cVar2, j<Form.a> jVar) {
        this.phoneInput = cVar;
        this.emailInput = cVar2;
        this.scrollInstance = jVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final v50.c getEmailInput() {
        return this.emailInput;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final v50.c getPhoneInput() {
        return this.phoneInput;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PhoneAndEmailInputsCustomContentData)) {
            return false;
        }
        PhoneAndEmailInputsCustomContentData phoneAndEmailInputsCustomContentData = (PhoneAndEmailInputsCustomContentData) other;
        return t.c(this.phoneInput, phoneAndEmailInputsCustomContentData.phoneInput) && t.c(this.emailInput, phoneAndEmailInputsCustomContentData.emailInput) && t.c(this.scrollInstance, phoneAndEmailInputsCustomContentData.scrollInstance);
    }

    public int hashCode() {
        int iHashCode = ((this.phoneInput.hashCode() * 31) + this.emailInput.hashCode()) * 31;
        j<Form.a> jVar = this.scrollInstance;
        return iHashCode + (jVar == null ? 0 : jVar.hashCode());
    }

    public String toString() {
        return "PhoneAndEmailInputsCustomContentData(phoneInput=" + this.phoneInput + ", emailInput=" + this.emailInput + ", scrollInstance=" + this.scrollInstance + ')';
    }
}
