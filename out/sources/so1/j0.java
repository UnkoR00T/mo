package so1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\r\u0010\u0012¨\u0006\u0013"}, d2 = {"Lso1/j0;", "", "Liy/b0;", "password", "Liy/a0;", "seed", "", "saltLength", "<init>", "(Liy/b0;Liy/a0;I)V", "a", "Liy/b0;", "()Liy/b0;", "b", "Liy/a0;", "c", "()Liy/a0;", "I", "()I", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 implements g0.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f183115d = iy.a0.f97720c | iy.b0.f97726c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.b0 password;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a0 seed;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int saltLength;

    public j0(iy.b0 b0Var, iy.a0 a0Var, int i15) {
        this.password = b0Var;
        this.seed = a0Var;
        this.saltLength = i15;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getPassword() {
        return this.password;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getSaltLength() {
        return this.saltLength;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final iy.a0 getSeed() {
        return this.seed;
    }

    public /* synthetic */ j0(iy.b0 b0Var, iy.a0 a0Var, int i15, int i16, fr.k kVar) {
        this(b0Var, a0Var, (i16 & 4) != 0 ? 64 : i15);
    }
}
