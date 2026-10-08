package u0;

import p071kotlin.Metadata;
import u0.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B/\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\b\u0010\tR&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010\u000b\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lu0/z2;", "T", "Lu0/t;", "V", "Lu0/y2;", "Lkotlin/Function1;", "convertToVector", "convertFromVector", "<init>", "(Ler/l;Ler/l;)V", "a", "Ler/l;", "()Ler/l;", "b", "animation-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class z2<T, V extends t> implements y2<T, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final er.l<T, V> convertToVector;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final er.l<V, T> convertFromVector;

    /* JADX WARN: Multi-variable type inference failed */
    public z2(er.l<? super T, ? extends V> lVar, er.l<? super V, ? extends T> lVar2) {
        this.convertToVector = lVar;
        this.convertFromVector = lVar2;
    }

    @Override // u0.y2
    public er.l<T, V> a() {
        return this.convertToVector;
    }

    @Override // u0.y2
    public er.l<V, T> b() {
        return this.convertFromVector;
    }
}
