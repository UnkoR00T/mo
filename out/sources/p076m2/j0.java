package p076m2;

import er.a;
import er.l;
import oq.g;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\b\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\n\u0010\u000bR \u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\f8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lm2/j0;", "T", "Lm2/b4;", "Lkotlin/Function1;", "Lm2/a0;", "defaultComputation", "<init>", "(Ler/l;)V", "value", "Lm2/c4;", "c", "(Ljava/lang/Object;)Lm2/c4;", "Lm2/k0;", "b", "Lm2/k0;", "i", "()Lm2/k0;", "defaultValueHolder", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class j0<T> extends b4<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ComputedValueHolder<T> defaultValueHolder;

    public j0(l<? super a0, ? extends T> lVar) {
        super(new a() { // from class: m2.i0
            @Override // er.a
            public final Object a() {
                return j0.h();
            }
        });
        this.defaultValueHolder = new ComputedValueHolder<>(lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h() {
        t.c("Unexpected call to default provider");
        throw new g();
    }

    @Override // p076m2.b4
    public c4<T> c(T value) {
        return new c4<>(this, value, value == null, null, null, null, true);
    }

    @Override // p076m2.z
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public ComputedValueHolder<T> a() {
        return this.defaultValueHolder;
    }
}
