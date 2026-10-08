package zt3;

import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0006\u0003R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lzt3/f;", "", "Lbu3/a;", "a", "()Lbu3/a;", "mode", "b", "Lzt3/f$a;", "Lzt3/f$b;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface f {

    /* JADX INFO: renamed from: zt3.f$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lzt3/f$b;", "Lzt3/f;", "Lbu3/a;", "mode", "<init>", "(Lbu3/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbu3/a;", "()Lbu3/a;", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Setup implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final bu3.a mode;

        public Setup(bu3.a aVar) {
            this.mode = aVar;
        }

        @Override // zt3.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public bu3.a getMode() {
            return this.mode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Setup) && fr.t.c(this.mode, ((Setup) other).mode);
        }

        public int hashCode() {
            return this.mode.hashCode();
        }

        public String toString() {
            return "Setup(mode=" + this.mode + ')';
        }
    }

    /* JADX INFO: renamed from: a */
    bu3.a getMode();

    /* JADX INFO: renamed from: zt3.f$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ<\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001f\u001a\u0004\b\"\u0010!¨\u0006#"}, d2 = {"Lzt3/f$a;", "Lzt3/f;", "Lbu3/a;", "mode", "Lzt3/b;", "addressState", "Lzt3/m1;", "scrollToField", "fieldToAutoFocus", "<init>", "(Lbu3/a;Lzt3/b;Lzt3/m1;Lzt3/m1;)V", "b", "(Lbu3/a;Lzt3/b;Lzt3/m1;Lzt3/m1;)Lzt3/f$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbu3/a;", "()Lbu3/a;", "Lzt3/b;", "d", "()Lzt3/b;", "c", "Lzt3/m1;", "f", "()Lzt3/m1;", "e", "addressform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Form implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final bu3.a mode;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressState addressState;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final m1 scrollToField;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final m1 fieldToAutoFocus;

        public Form(bu3.a aVar, AddressState addressState, m1 m1Var, m1 m1Var2) {
            this.mode = aVar;
            this.addressState = addressState;
            this.scrollToField = m1Var;
            this.fieldToAutoFocus = m1Var2;
        }

        public static /* synthetic */ Form c(Form form, bu3.a aVar, AddressState addressState, m1 m1Var, m1 m1Var2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                aVar = form.mode;
            }
            if ((i15 & 2) != 0) {
                addressState = form.addressState;
            }
            if ((i15 & 4) != 0) {
                m1Var = form.scrollToField;
            }
            if ((i15 & 8) != 0) {
                m1Var2 = form.fieldToAutoFocus;
            }
            return form.b(aVar, addressState, m1Var, m1Var2);
        }

        @Override // zt3.f
        /* JADX INFO: renamed from: a, reason: from getter */
        public bu3.a getMode() {
            return this.mode;
        }

        public final Form b(bu3.a mode, AddressState addressState, m1 scrollToField, m1 fieldToAutoFocus) {
            return new Form(mode, addressState, scrollToField, fieldToAutoFocus);
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final AddressState getAddressState() {
            return this.addressState;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final m1 getFieldToAutoFocus() {
            return this.fieldToAutoFocus;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Form)) {
                return false;
            }
            Form form = (Form) other;
            return fr.t.c(this.mode, form.mode) && fr.t.c(this.addressState, form.addressState) && this.scrollToField == form.scrollToField && this.fieldToAutoFocus == form.fieldToAutoFocus;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final m1 getScrollToField() {
            return this.scrollToField;
        }

        public int hashCode() {
            int iHashCode = ((this.mode.hashCode() * 31) + this.addressState.hashCode()) * 31;
            m1 m1Var = this.scrollToField;
            int iHashCode2 = (iHashCode + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
            m1 m1Var2 = this.fieldToAutoFocus;
            return iHashCode2 + (m1Var2 != null ? m1Var2.hashCode() : 0);
        }

        public String toString() {
            return "Form(mode=" + this.mode + ", addressState=" + this.addressState + ", scrollToField=" + this.scrollToField + ", fieldToAutoFocus=" + this.fieldToAutoFocus + ')';
        }

        public /* synthetic */ Form(bu3.a aVar, AddressState addressState, m1 m1Var, m1 m1Var2, int i15, fr.k kVar) {
            this(aVar, (i15 & 2) != 0 ? new AddressState(null, null, null, null, null, null, null, null, GF2Field.MASK, null) : addressState, (i15 & 4) != 0 ? null : m1Var, m1Var2);
        }
    }
}
