package u0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b\"\b\b\u0001\u0010\b*\u00020\u00072\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lu0/d0;", "T", "Lu0/c0;", "Lu0/l0;", "floatDecaySpec", "<init>", "(Lu0/l0;)V", "Lu0/t;", "V", "Lu0/y2;", "typeConverter", "Lu0/v3;", "a", "(Lu0/y2;)Lu0/v3;", "Lu0/l0;", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d0<T> implements c0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l0 floatDecaySpec;

    public d0(l0 l0Var) {
        this.floatDecaySpec = l0Var;
    }

    @Override // u0.c0
    public <V extends t> v3<V> a(y2<T, V> typeConverter) {
        return new z3(this.floatDecaySpec);
    }
}
