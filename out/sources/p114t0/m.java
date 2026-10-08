package p114t0;

import c5.r;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import u0.k2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0017\b\u0000\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R(\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\u0006R \u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0007\u0010\u0010¨\u0006\u0012"}, d2 = {"Lt0/m;", "Lt0/l;", "Lu0/k2;", "Lt0/x;", "transition", "<init>", "(Lu0/k2;)V", "a", "Lu0/k2;", "getTransition", "()Lu0/k2;", "setTransition", "Lm2/a3;", "Lc5/r;", "b", "Lm2/a3;", "()Lm2/a3;", "targetSize", "animation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private k2<x> transition;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a3<r> targetSize = c6.e(r.b(r.INSTANCE.a()), null, 2, null);

    public m(k2<x> k2Var) {
        this.transition = k2Var;
    }

    public final a3<r> a() {
        return this.targetSize;
    }
}
