package qy;

import fr.k;
import iy.a0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: qy.a, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqy/a;", "", "Lqy/b;", "wrappedMasterKey", "Lsy/a;", "encryptedPasswordData", "<init>", "(Liy/a0;Liy/a0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/a0;", "b", "()Liy/a0;", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MasterKeyModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 wrappedMasterKey;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final a0 encryptedPasswordData;

    public /* synthetic */ MasterKeyModel(a0 a0Var, a0 a0Var2, k kVar) {
        this(a0Var, a0Var2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final a0 getEncryptedPasswordData() {
        return this.encryptedPasswordData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final a0 getWrappedMasterKey() {
        return this.wrappedMasterKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MasterKeyModel)) {
            return false;
        }
        MasterKeyModel masterKeyModel = (MasterKeyModel) other;
        return b.d(this.wrappedMasterKey, masterKeyModel.wrappedMasterKey) && sy.a.d(this.encryptedPasswordData, masterKeyModel.encryptedPasswordData);
    }

    public int hashCode() {
        return (b.e(this.wrappedMasterKey) * 31) + sy.a.e(this.encryptedPasswordData);
    }

    public String toString() {
        return "MasterKeyModel(wrappedMasterKey=" + b.f(this.wrappedMasterKey) + ", encryptedPasswordData=" + sy.a.f(this.encryptedPasswordData) + ")";
    }

    private MasterKeyModel(a0 a0Var, a0 a0Var2) {
        this.wrappedMasterKey = a0Var;
        this.encryptedPasswordData = a0Var2;
    }
}
