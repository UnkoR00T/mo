package rn;

import fv.e0;
import ge4.h;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u000f¨\u0006\u0010"}, d2 = {"Lrn/a;", "T", "Lge4/h;", "Lfv/e0;", "Luu/a;", "loader", "Lrn/e;", "serializer", "<init>", "(Luu/a;Lrn/e;)V", "value", "b", "(Lfv/e0;)Ljava/lang/Object;", "a", "Luu/a;", "Lrn/e;", "retrofit2-kotlinx-serialization-converter"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a<T> implements h<e0, T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uu.a<T> loader;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final e serializer;

    /* JADX WARN: Multi-variable type inference failed */
    public a(uu.a<? extends T> aVar, e eVar) {
        this.loader = aVar;
        this.serializer = eVar;
    }

    @Override // ge4.h
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public T a(e0 value) {
        return (T) this.serializer.a(this.loader, value);
    }
}
