package g63;

import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g63.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b¨\u0006\u001c"}, d2 = {"Lg63/b;", "", "", "skipConfirmation", "Li63/a;", "codeMode", "Li63/b;", "type", "<init>", "(ZLi63/a;Li63/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "b", "()Z", "Li63/a;", "()Li63/a;", "c", "Li63/b;", "()Li63/b;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetupData {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f70939d = b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean skipConfirmation;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final i63.a codeMode;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final i63.b type;

    public SetupData(boolean z15, i63.a aVar, i63.b bVar) {
        this.skipConfirmation = z15;
        this.codeMode = aVar;
        this.type = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final i63.a getCodeMode() {
        return this.codeMode;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getSkipConfirmation() {
        return this.skipConfirmation;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final i63.b getType() {
        return this.type;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetupData)) {
            return false;
        }
        SetupData setupData = (SetupData) other;
        return this.skipConfirmation == setupData.skipConfirmation && this.codeMode == setupData.codeMode && fr.t.c(this.type, setupData.type);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.skipConfirmation) * 31) + this.codeMode.hashCode()) * 31) + this.type.hashCode();
    }

    public String toString() {
        return "SetupData(skipConfirmation=" + this.skipConfirmation + ", codeMode=" + this.codeMode + ", type=" + this.type + ')';
    }
}
