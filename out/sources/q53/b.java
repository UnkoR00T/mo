package q53;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lq53/b;", "", "a", "Lq53/b$a;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: q53.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lq53/b$a;", "Lq53/b;", "Liy/b0;", "password", "Ls53/b;", "screenType", "Lhz/b;", "validationState", "<init>", "(Liy/b0;Ls53/b;Lhz/b;)V", "a", "(Liy/b0;Ls53/b;Lhz/b;)Lq53/b$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "c", "()Liy/b0;", "b", "Ls53/b;", "d", "()Ls53/b;", "Lhz/b;", "e", "()Lhz/b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f164890d = hz.b.f86845b | b0.f97726c;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 password;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final s53.b screenType;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b validationState;

        public Initialized(b0 b0Var, s53.b bVar, hz.b bVar2) {
            this.password = b0Var;
            this.screenType = bVar;
            this.validationState = bVar2;
        }

        public static /* synthetic */ Initialized b(Initialized initialized, b0 b0Var, s53.b bVar, hz.b bVar2, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = initialized.password;
            }
            if ((i15 & 2) != 0) {
                bVar = initialized.screenType;
            }
            if ((i15 & 4) != 0) {
                bVar2 = initialized.validationState;
            }
            return initialized.a(b0Var, bVar, bVar2);
        }

        public final Initialized a(b0 password, s53.b screenType, hz.b validationState) {
            return new Initialized(password, screenType, validationState);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPassword() {
            return this.password;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final s53.b getScreenType() {
            return this.screenType;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final hz.b getValidationState() {
            return this.validationState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.password, initialized.password) && fr.t.c(this.screenType, initialized.screenType) && fr.t.c(this.validationState, initialized.validationState);
        }

        public int hashCode() {
            return (((this.password.hashCode() * 31) + this.screenType.hashCode()) * 31) + this.validationState.hashCode();
        }

        public String toString() {
            return "Initialized(password=" + this.password + ", screenType=" + this.screenType + ", validationState=" + this.validationState + ')';
        }
    }
}
