package p076m2;

import er.a;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003¢\u0006\u0004\b\u0005\u0010\u0006J3\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00072\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tH ¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0010X\u0090\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f\u0082\u0001\u0001\u0011¨\u0006\u0012"}, d2 = {"Lm2/z;", "T", "", "Lkotlin/Function0;", "defaultFactory", "<init>", "(Ler/a;)V", "Lm2/c4;", "value", "Lm2/o6;", "previous", "b", "(Lm2/c4;Lm2/o6;)Lm2/o6;", "a", "Lm2/o6;", "()Lm2/o6;", "defaultValueHolder", "Lm2/b4;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class z<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final o6<T> defaultValueHolder;

    public /* synthetic */ z(a aVar, k kVar) {
        this(aVar);
    }

    public o6<T> a() {
        return this.defaultValueHolder;
    }

    public abstract o6<T> b(c4<T> value, o6<T> previous);

    private z(a<? extends T> aVar) {
        this.defaultValueHolder = new x1(aVar);
    }
}
