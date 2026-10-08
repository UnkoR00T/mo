package bz3;

import java.util.Map;
import p071kotlin.Metadata;
import pq.v0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0010\u0012\u0015BO\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0015\u0010\u001aR\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0019\u001a\u0004\b\u001b\u0010\u001aR\u001a\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0010\u0010\u001d\u0082\u0001\u0003\u001e\u001f ¨\u0006!"}, d2 = {"Lbz3/h;", "", "Liy/b0;", "password", "repeatPassword", "", "Lwy3/a;", "", "Lpl/gov/coi/mobywatel/segment/setpassword/contract/model/PasswordRequirements;", "requirements", "Lhz/b;", "passwordState", "repeatedPasswordState", "imeVisible", "<init>", "(Liy/b0;Liy/b0;Ljava/util/Map;Lhz/b;Lhz/b;Z)V", "a", "Liy/b0;", "b", "()Liy/b0;", "d", "c", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "Lhz/b;", "()Lhz/b;", "e", "Z", "()Z", "Lbz3/h$a;", "Lbz3/h$b;", "Lbz3/h$c;", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.b0 password;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.b0 repeatPassword;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<wy3.a, Boolean> requirements;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final hz.b passwordState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hz.b repeatedPasswordState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean imeVisible;

    /* JADX INFO: renamed from: bz3.h$b, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\\\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lbz3/h$b;", "Lbz3/h;", "Liy/b0;", "password", "repeatPassword", "", "Lwy3/a;", "", "Lpl/gov/coi/mobywatel/segment/setpassword/contract/model/PasswordRequirements;", "requirements", "Lhz/b;", "passwordState", "repeatedPasswordState", "imeVisible", "<init>", "(Liy/b0;Liy/b0;Ljava/util/Map;Lhz/b;Lhz/b;Z)V", "g", "(Liy/b0;Liy/b0;Ljava/util/Map;Lhz/b;Lhz/b;Z)Lbz3/h$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "b", "()Liy/b0;", "h", "d", "i", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "j", "Lhz/b;", "c", "()Lhz/b;", "k", "e", "l", "Z", "a", "()Z", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class PasswordInputFocused extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 password;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 repeatPassword;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<wy3.a, Boolean> requirements;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b passwordState;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b repeatedPasswordState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean imeVisible;

        public PasswordInputFocused(iy.b0 b0Var, iy.b0 b0Var2, Map<wy3.a, Boolean> map, hz.b bVar, hz.b bVar2, boolean z15) {
            super(b0Var, b0Var2, map, bVar, bVar2, z15, null);
            this.password = b0Var;
            this.repeatPassword = b0Var2;
            this.requirements = map;
            this.passwordState = bVar;
            this.repeatedPasswordState = bVar2;
            this.imeVisible = z15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ PasswordInputFocused h(PasswordInputFocused passwordInputFocused, iy.b0 b0Var, iy.b0 b0Var2, Map map, hz.b bVar, hz.b bVar2, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = passwordInputFocused.password;
            }
            if ((i15 & 2) != 0) {
                b0Var2 = passwordInputFocused.repeatPassword;
            }
            if ((i15 & 4) != 0) {
                map = passwordInputFocused.requirements;
            }
            if ((i15 & 8) != 0) {
                bVar = passwordInputFocused.passwordState;
            }
            if ((i15 & 16) != 0) {
                bVar2 = passwordInputFocused.repeatedPasswordState;
            }
            if ((i15 & 32) != 0) {
                z15 = passwordInputFocused.imeVisible;
            }
            hz.b bVar3 = bVar2;
            boolean z16 = z15;
            return passwordInputFocused.g(b0Var, b0Var2, map, bVar, bVar3, z16);
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getImeVisible() {
            return this.imeVisible;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public iy.b0 getPassword() {
            return this.password;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: c, reason: from getter */
        public hz.b getPasswordState() {
            return this.passwordState;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: d, reason: from getter */
        public iy.b0 getRepeatPassword() {
            return this.repeatPassword;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: e, reason: from getter */
        public hz.b getRepeatedPasswordState() {
            return this.repeatedPasswordState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PasswordInputFocused)) {
                return false;
            }
            PasswordInputFocused passwordInputFocused = (PasswordInputFocused) other;
            return fr.t.c(this.password, passwordInputFocused.password) && fr.t.c(this.repeatPassword, passwordInputFocused.repeatPassword) && fr.t.c(this.requirements, passwordInputFocused.requirements) && fr.t.c(this.passwordState, passwordInputFocused.passwordState) && fr.t.c(this.repeatedPasswordState, passwordInputFocused.repeatedPasswordState) && this.imeVisible == passwordInputFocused.imeVisible;
        }

        @Override // bz3.h
        public Map<wy3.a, Boolean> f() {
            return this.requirements;
        }

        public final PasswordInputFocused g(iy.b0 password, iy.b0 repeatPassword, Map<wy3.a, Boolean> requirements, hz.b passwordState, hz.b repeatedPasswordState, boolean imeVisible) {
            return new PasswordInputFocused(password, repeatPassword, requirements, passwordState, repeatedPasswordState, imeVisible);
        }

        public int hashCode() {
            return (((((((((this.password.hashCode() * 31) + this.repeatPassword.hashCode()) * 31) + this.requirements.hashCode()) * 31) + this.passwordState.hashCode()) * 31) + this.repeatedPasswordState.hashCode()) * 31) + Boolean.hashCode(this.imeVisible);
        }

        public String toString() {
            return "PasswordInputFocused(password=" + this.password + ", repeatPassword=" + this.repeatPassword + ", requirements=" + this.requirements + ", passwordState=" + this.passwordState + ", repeatedPasswordState=" + this.repeatedPasswordState + ", imeVisible=" + this.imeVisible + ')';
        }
    }

    /* JADX INFO: renamed from: bz3.h$c, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\\\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00072\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b*\u0010(R\u001a\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lbz3/h$c;", "Lbz3/h;", "Liy/b0;", "password", "repeatPassword", "", "Lwy3/a;", "", "Lpl/gov/coi/mobywatel/segment/setpassword/contract/model/PasswordRequirements;", "requirements", "Lhz/b;", "passwordState", "repeatedPasswordState", "imeVisible", "<init>", "(Liy/b0;Liy/b0;Ljava/util/Map;Lhz/b;Lhz/b;Z)V", "g", "(Liy/b0;Liy/b0;Ljava/util/Map;Lhz/b;Lhz/b;Z)Lbz3/h$c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "b", "()Liy/b0;", "h", "d", "i", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "j", "Lhz/b;", "c", "()Lhz/b;", "k", "e", "l", "Z", "a", "()Z", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class RepeatPasswordInputFocused extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 password;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 repeatPassword;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<wy3.a, Boolean> requirements;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b passwordState;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b repeatedPasswordState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean imeVisible;

        public RepeatPasswordInputFocused(iy.b0 b0Var, iy.b0 b0Var2, Map<wy3.a, Boolean> map, hz.b bVar, hz.b bVar2, boolean z15) {
            super(b0Var, b0Var2, map, bVar, bVar2, z15, null);
            this.password = b0Var;
            this.repeatPassword = b0Var2;
            this.requirements = map;
            this.passwordState = bVar;
            this.repeatedPasswordState = bVar2;
            this.imeVisible = z15;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RepeatPasswordInputFocused h(RepeatPasswordInputFocused repeatPasswordInputFocused, iy.b0 b0Var, iy.b0 b0Var2, Map map, hz.b bVar, hz.b bVar2, boolean z15, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                b0Var = repeatPasswordInputFocused.password;
            }
            if ((i15 & 2) != 0) {
                b0Var2 = repeatPasswordInputFocused.repeatPassword;
            }
            if ((i15 & 4) != 0) {
                map = repeatPasswordInputFocused.requirements;
            }
            if ((i15 & 8) != 0) {
                bVar = repeatPasswordInputFocused.passwordState;
            }
            if ((i15 & 16) != 0) {
                bVar2 = repeatPasswordInputFocused.repeatedPasswordState;
            }
            if ((i15 & 32) != 0) {
                z15 = repeatPasswordInputFocused.imeVisible;
            }
            hz.b bVar3 = bVar2;
            boolean z16 = z15;
            return repeatPasswordInputFocused.g(b0Var, b0Var2, map, bVar, bVar3, z16);
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getImeVisible() {
            return this.imeVisible;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public iy.b0 getPassword() {
            return this.password;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: c, reason: from getter */
        public hz.b getPasswordState() {
            return this.passwordState;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: d, reason: from getter */
        public iy.b0 getRepeatPassword() {
            return this.repeatPassword;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: e, reason: from getter */
        public hz.b getRepeatedPasswordState() {
            return this.repeatedPasswordState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RepeatPasswordInputFocused)) {
                return false;
            }
            RepeatPasswordInputFocused repeatPasswordInputFocused = (RepeatPasswordInputFocused) other;
            return fr.t.c(this.password, repeatPasswordInputFocused.password) && fr.t.c(this.repeatPassword, repeatPasswordInputFocused.repeatPassword) && fr.t.c(this.requirements, repeatPasswordInputFocused.requirements) && fr.t.c(this.passwordState, repeatPasswordInputFocused.passwordState) && fr.t.c(this.repeatedPasswordState, repeatPasswordInputFocused.repeatedPasswordState) && this.imeVisible == repeatPasswordInputFocused.imeVisible;
        }

        @Override // bz3.h
        public Map<wy3.a, Boolean> f() {
            return this.requirements;
        }

        public final RepeatPasswordInputFocused g(iy.b0 password, iy.b0 repeatPassword, Map<wy3.a, Boolean> requirements, hz.b passwordState, hz.b repeatedPasswordState, boolean imeVisible) {
            return new RepeatPasswordInputFocused(password, repeatPassword, requirements, passwordState, repeatedPasswordState, imeVisible);
        }

        public int hashCode() {
            return (((((((((this.password.hashCode() * 31) + this.repeatPassword.hashCode()) * 31) + this.requirements.hashCode()) * 31) + this.passwordState.hashCode()) * 31) + this.repeatedPasswordState.hashCode()) * 31) + Boolean.hashCode(this.imeVisible);
        }

        public String toString() {
            return "RepeatPasswordInputFocused(password=" + this.password + ", repeatPassword=" + this.repeatPassword + ", requirements=" + this.requirements + ", passwordState=" + this.passwordState + ", repeatedPasswordState=" + this.repeatedPasswordState + ", imeVisible=" + this.imeVisible + ')';
        }
    }

    public /* synthetic */ h(iy.b0 b0Var, iy.b0 b0Var2, Map map, hz.b bVar, hz.b bVar2, boolean z15, fr.k kVar) {
        this(b0Var, b0Var2, map, bVar, bVar2, z15);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public boolean getImeVisible() {
        return this.imeVisible;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public iy.b0 getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public hz.b getPasswordState() {
        return this.passwordState;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public iy.b0 getRepeatPassword() {
        return this.repeatPassword;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public hz.b getRepeatedPasswordState() {
        return this.repeatedPasswordState;
    }

    public Map<wy3.a, Boolean> f() {
        return this.requirements;
    }

    private h(iy.b0 b0Var, iy.b0 b0Var2, Map<wy3.a, Boolean> map, hz.b bVar, hz.b bVar2, boolean z15) {
        this.password = b0Var;
        this.repeatPassword = b0Var2;
        this.requirements = map;
        this.passwordState = bVar;
        this.repeatedPasswordState = bVar2;
        this.imeVisible = z15;
    }

    /* JADX INFO: renamed from: bz3.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR*\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u0002`\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010\u000b\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\f\u001a\u00020\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b)\u0010'R\u001a\u0010\r\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lbz3/h$a;", "Lbz3/h;", "Liy/b0;", "password", "repeatPassword", "", "Lwy3/a;", "", "Lpl/gov/coi/mobywatel/segment/setpassword/contract/model/PasswordRequirements;", "requirements", "Lhz/b;", "passwordState", "repeatedPasswordState", "imeVisible", "<init>", "(Liy/b0;Liy/b0;Ljava/util/Map;Lhz/b;Lhz/b;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "g", "Liy/b0;", "b", "()Liy/b0;", "h", "d", "i", "Ljava/util/Map;", "f", "()Ljava/util/Map;", "j", "Lhz/b;", "c", "()Lhz/b;", "k", "e", "l", "Z", "a", "()Z", "setpassword_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Default extends h {

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 password;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final iy.b0 repeatPassword;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final Map<wy3.a, Boolean> requirements;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b passwordState;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b repeatedPasswordState;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean imeVisible;

        public Default(iy.b0 b0Var, iy.b0 b0Var2, Map<wy3.a, Boolean> map, hz.b bVar, hz.b bVar2, boolean z15) {
            super(b0Var, b0Var2, map, bVar, bVar2, z15, null);
            this.password = b0Var;
            this.repeatPassword = b0Var2;
            this.requirements = map;
            this.passwordState = bVar;
            this.repeatedPasswordState = bVar2;
            this.imeVisible = z15;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getImeVisible() {
            return this.imeVisible;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: b, reason: from getter */
        public iy.b0 getPassword() {
            return this.password;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: c, reason: from getter */
        public hz.b getPasswordState() {
            return this.passwordState;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: d, reason: from getter */
        public iy.b0 getRepeatPassword() {
            return this.repeatPassword;
        }

        @Override // bz3.h
        /* JADX INFO: renamed from: e, reason: from getter */
        public hz.b getRepeatedPasswordState() {
            return this.repeatedPasswordState;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Default)) {
                return false;
            }
            Default r15 = (Default) other;
            return fr.t.c(this.password, r15.password) && fr.t.c(this.repeatPassword, r15.repeatPassword) && fr.t.c(this.requirements, r15.requirements) && fr.t.c(this.passwordState, r15.passwordState) && fr.t.c(this.repeatedPasswordState, r15.repeatedPasswordState) && this.imeVisible == r15.imeVisible;
        }

        @Override // bz3.h
        public Map<wy3.a, Boolean> f() {
            return this.requirements;
        }

        public int hashCode() {
            return (((((((((this.password.hashCode() * 31) + this.repeatPassword.hashCode()) * 31) + this.requirements.hashCode()) * 31) + this.passwordState.hashCode()) * 31) + this.repeatedPasswordState.hashCode()) * 31) + Boolean.hashCode(this.imeVisible);
        }

        public String toString() {
            return "Default(password=" + this.password + ", repeatPassword=" + this.repeatPassword + ", requirements=" + this.requirements + ", passwordState=" + this.passwordState + ", repeatedPasswordState=" + this.repeatedPasswordState + ", imeVisible=" + this.imeVisible + ')';
        }

        public /* synthetic */ Default(iy.b0 b0Var, iy.b0 b0Var2, Map map, hz.b bVar, hz.b bVar2, boolean z15, int i15, fr.k kVar) {
            this(b0Var, b0Var2, (i15 & 4) != 0 ? v0.i() : map, (i15 & 8) != 0 ? hz.b.C2039b.f86846c : bVar, (i15 & 16) != 0 ? hz.b.C2039b.f86846c : bVar2, z15);
        }
    }
}
