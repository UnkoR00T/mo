package zt;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class c<T> implements Iterable<T>, gr.a {
    public /* synthetic */ c(fr.k kVar) {
        this();
    }

    public abstract int e();

    public abstract void f(int i15, T t15);

    public abstract T get(int i15);

    @Override // java.lang.Iterable
    public abstract Iterator<T> iterator();

    private c() {
    }
}
