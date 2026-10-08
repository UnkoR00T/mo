package p7;

import androidx.p016lifecycle.t0;
import er.l;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B)\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0004\b\t\u0010\nR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\rR&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00028\u00000\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u000e\u0010\u0010¨\u0006\u0011"}, d2 = {"Lp7/f;", "Landroidx/lifecycle/t0;", "T", "", "Lmr/c;", "clazz", "Lkotlin/Function1;", "Lp7/a;", "initializer", "<init>", "(Lmr/c;Ler/l;)V", "a", "Lmr/c;", "()Lmr/c;", "b", "Ler/l;", "()Ler/l;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class f<T extends t0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final mr.c<T> clazz;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l<CreationExtras, T> initializer;

    /* JADX WARN: Multi-variable type inference failed */
    public f(mr.c<T> cVar, l<? super CreationExtras, ? extends T> lVar) {
        this.clazz = cVar;
        this.initializer = lVar;
    }

    public final mr.c<T> a() {
        return this.clazz;
    }

    public final l<CreationExtras, T> b() {
        return this.initializer;
    }
}
