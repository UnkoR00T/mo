package qo1;

import iy.b0;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lqo1/l;", "", "a", "Lqo1/l$a;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l {

    /* JADX INFO: renamed from: qo1.l$a, reason: from toString */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lqo1/l$a;", "Lqo1/l;", "Lmx/a;", "biometricType", "biometricRequirements", "Liy/b0;", "password", "<init>", "(Lmx/a;Lmx/a;Liy/b0;)V", "a", "(Lmx/a;Lmx/a;Liy/b0;)Lqo1/l$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Liy/b0;", "e", "()Liy/b0;", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements l {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f167615d = b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label biometricType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label biometricRequirements;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 password;

        public Initialized() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Initialized b(Initialized initialized, Label label, Label label2, b0 b0Var, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                label = initialized.biometricType;
            }
            if ((i15 & 2) != 0) {
                label2 = initialized.biometricRequirements;
            }
            if ((i15 & 4) != 0) {
                b0Var = initialized.password;
            }
            return initialized.a(label, label2, b0Var);
        }

        public final Initialized a(Label biometricType, Label biometricRequirements, b0 password) {
            return new Initialized(biometricType, biometricRequirements, password);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getBiometricRequirements() {
            return this.biometricRequirements;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Label getBiometricType() {
            return this.biometricType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final b0 getPassword() {
            return this.password;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.biometricType, initialized.biometricType) && fr.t.c(this.biometricRequirements, initialized.biometricRequirements) && fr.t.c(this.password, initialized.password);
        }

        public int hashCode() {
            return (((this.biometricType.hashCode() * 31) + this.biometricRequirements.hashCode()) * 31) + this.password.hashCode();
        }

        public String toString() {
            return "Initialized(biometricType=" + this.biometricType + ", biometricRequirements=" + this.biometricRequirements + ", password=" + this.password + ')';
        }

        public Initialized(Label label, Label label2, b0 b0Var) {
            this.biometricType = label;
            this.biometricRequirements = label2;
            this.password = b0Var;
        }

        public /* synthetic */ Initialized(Label label, Label label2, b0 b0Var, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? Label.INSTANCE.c() : label, (i15 & 2) != 0 ? Label.INSTANCE.c() : label2, (i15 & 4) != 0 ? b0.INSTANCE.a() : b0Var);
        }
    }
}
