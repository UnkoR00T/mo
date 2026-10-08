package lr1;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: lr1.b, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001e\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJV\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0015R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010\"\u001a\u0004\b!\u0010$R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\r\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b(\u0010'¨\u0006)"}, d2 = {"Llr1/b;", "", "Liy/b0;", "secret", "", "alias", "", "timeout", "Liy/a0;", "encryptedData", "decryptedData", "", "useBiometric", "skipKeyCreation", "<init>", "(Liy/b0;Ljava/lang/String;ILiy/a0;Liy/a0;ZZ)V", "a", "(Liy/b0;Ljava/lang/String;ILiy/a0;Liy/a0;ZZ)Llr1/b;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Liy/b0;", "f", "()Liy/b0;", "b", "Ljava/lang/String;", "c", "I", "h", "d", "Liy/a0;", "e", "()Liy/a0;", "Z", "i", "()Z", "g", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f119723h = iy.a0.f97720c | iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 secret;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String alias;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final int timeout;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.a0 encryptedData;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.a0 decryptedData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean useBiometric;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean skipKeyCreation;

    public State(iy.b0 b0Var, String str, int i15, iy.a0 a0Var, iy.a0 a0Var2, boolean z15, boolean z16) {
        this.secret = b0Var;
        this.alias = str;
        this.timeout = i15;
        this.encryptedData = a0Var;
        this.decryptedData = a0Var2;
        this.useBiometric = z15;
        this.skipKeyCreation = z16;
    }

    public static /* synthetic */ State b(State state, iy.b0 b0Var, String str, int i15, iy.a0 a0Var, iy.a0 a0Var2, boolean z15, boolean z16, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            b0Var = state.secret;
        }
        if ((i16 & 2) != 0) {
            str = state.alias;
        }
        if ((i16 & 4) != 0) {
            i15 = state.timeout;
        }
        if ((i16 & 8) != 0) {
            a0Var = state.encryptedData;
        }
        if ((i16 & 16) != 0) {
            a0Var2 = state.decryptedData;
        }
        if ((i16 & 32) != 0) {
            z15 = state.useBiometric;
        }
        if ((i16 & 64) != 0) {
            z16 = state.skipKeyCreation;
        }
        boolean z17 = z15;
        boolean z18 = z16;
        iy.a0 a0Var3 = a0Var2;
        int i17 = i15;
        return state.a(b0Var, str, i17, a0Var, a0Var3, z17, z18);
    }

    public final State a(iy.b0 secret, String alias, int timeout, iy.a0 encryptedData, iy.a0 decryptedData, boolean useBiometric, boolean skipKeyCreation) {
        return new State(secret, alias, timeout, encryptedData, decryptedData, useBiometric, skipKeyCreation);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getAlias() {
        return this.alias;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final iy.a0 getDecryptedData() {
        return this.decryptedData;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final iy.a0 getEncryptedData() {
        return this.encryptedData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.secret, state.secret) && fr.t.c(this.alias, state.alias) && this.timeout == state.timeout && fr.t.c(this.encryptedData, state.encryptedData) && fr.t.c(this.decryptedData, state.decryptedData) && this.useBiometric == state.useBiometric && this.skipKeyCreation == state.skipKeyCreation;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final iy.b0 getSecret() {
        return this.secret;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getSkipKeyCreation() {
        return this.skipKeyCreation;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getTimeout() {
        return this.timeout;
    }

    public int hashCode() {
        return (((((((((((this.secret.hashCode() * 31) + this.alias.hashCode()) * 31) + Integer.hashCode(this.timeout)) * 31) + this.encryptedData.hashCode()) * 31) + this.decryptedData.hashCode()) * 31) + Boolean.hashCode(this.useBiometric)) * 31) + Boolean.hashCode(this.skipKeyCreation);
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getUseBiometric() {
        return this.useBiometric;
    }

    public String toString() {
        return "State(secret=" + this.secret + ", alias=" + this.alias + ", timeout=" + this.timeout + ", encryptedData=" + this.encryptedData + ", decryptedData=" + this.decryptedData + ", useBiometric=" + this.useBiometric + ", skipKeyCreation=" + this.skipKeyCreation + ')';
    }
}
